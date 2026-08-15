package dao;

import java.io.*;
import java.util.*;

public class calculator {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        try {
            System.out.println("Enter an expression to calculate. Supported: digits, operators +,-,*,/,^,% and parentheses ( ) for priority:");
            input = reader.readLine();
            input = toRPN(input);
            System.out.println(calculate(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Converts an infix expression to Reverse Polish Notation (RPN)
     * @param input The input string
     * @return The RPN output string
     */
    private static String toRPN(String input) throws Exception {
        StringBuilder stack = new StringBuilder();
        StringBuilder output = new StringBuilder();
        char currentChar, topChar;

        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);

            if (isOperator(currentChar)) {
                while (stack.length() > 0) {
                    topChar = stack.charAt(stack.length() - 1);
                    if (isOperator(topChar) && (operatorPriority(currentChar) <= operatorPriority(topChar))) {
                        output.append(" ").append(topChar).append(" ");
                        stack.setLength(stack.length() - 1);
                    } else {
                        output.append(" ");
                        break;
                    }
                }
                output.append(" ");
                stack.append(currentChar);
            } else if ('(' == currentChar) {
                stack.append(currentChar);
            } else if (')' == currentChar) {
                topChar = stack.charAt(stack.length() - 1);
                while ('(' != topChar) {
                    if (stack.length() < 1) {
                        throw new Exception("Parenthesis parsing error. Check the expression.");
                    }
                    output.append(" ").append(topChar);
                    stack.setLength(stack.length() - 1);
                    topChar = stack.charAt(stack.length() - 1);
                }
                stack.setLength(stack.length() - 1);
            } else {
                // If not an operator, add to output
                output.append(currentChar);
            }
        }

        // Pop remaining operators from stack to output
        while (stack.length() > 0) {
            output.append(" ").append(stack.charAt(stack.length() - 1));
            stack.setLength(stack.length() - 1);
        }

        return output.toString();
    }

    /**
     * Checks if the character is an operator
     */
    private static boolean isOperator(char c) {
        return c == '-' || c == '+' || c == '*' || c == '/' || c == '^';
    }

    /**
     * Returns the priority of the operator
     * @param op char
     * @return byte
     */
    private static byte operatorPriority(char op) {
        switch (op) {
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return 1; // for + and -
        }
    }

    /**
     * Evaluates an expression written in Reverse Polish Notation
     * @param input RPN expression
     * @return double result
     */
    private static double calculate(String input) throws Exception {
        double a = 0, b = 0;
        String token;
        Deque<Double> stack = new ArrayDeque<>();
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            try {
                token = tokenizer.nextToken().trim();
                if (token.length() == 1 && isOperator(token.charAt(0))) {
                    if (stack.size() < 2) {
                        throw new Exception("Not enough operands on stack for operation " + token);
                    }
                    b = stack.pop();
                    a = stack.pop();
                    switch (token.charAt(0)) {
                        case '+':
                            a += b;
                            break;
                        case '-':
                            a -= b;
                            break;
                        case '/':
                            a /= b;
                            break;
                        case '*':
                            a *= b;
                            break;
                        case '%':
                            a %= b;
                            break;
                        case '^':
                            a = Math.pow(a, b);
                            break;
                        default:
                            throw new Exception("Invalid operation " + token);
                    }
                    stack.push(a);
                } else {
                    a = Double.parseDouble(token);
                    stack.push(a);
                }
            } catch (Exception e) {
                throw new Exception("Invalid character in expression");
            }
        }

        if (stack.size() > 1) {
            throw new Exception("Number of operators does not match number of operands");
        }

        return stack.pop();
    }
}