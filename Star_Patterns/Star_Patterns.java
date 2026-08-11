package practices;
public class Star_Patterns {

    public static void main(String[] args) {

        int n = 5;

        /*
         * QUESTION 1:
         * Print a square pattern of stars.
         *
         * Output:
         * *****
         * *****
         * *****
         * *****
         * *****
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*
         * QUESTION 2:
         * Print a left-aligned triangle.
         *
         * Output:
         * *
         * **
         * ***
         * ****
         * *****
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*
         * QUESTION 3:
         * Print an inverted left-aligned triangle.
         *
         * Output:
         * *****
         * ****
         * ***
         * **
         * *
         */

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*
         * QUESTION 4:
         * Print a right-aligned triangle.
         *
         * Output:
         *     *
         *    **
         *   ***
         *  ****
         * *****
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*
         * QUESTION 5:
         * Print an inverted right-aligned triangle.
         *
         * Output:
         * *****
         *  ****
         *   ***
         *    **
         *     *
         */

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*
         * QUESTION 6:
         * Print a pyramid.
         *
         * Output:
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*
         * QUESTION 7:
         * Print an inverted pyramid.
         *
         * Output:
         * *********
         *  *******
         *   *****
         *    ***
         *     *
         */

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*
         * QUESTION 8:
         * Print a diamond.
         *
         * Output:
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         *  *******
         *   *****
         *    ***
         *     *
         */

        // Upper half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*
         * QUESTION 9:
         * Print a hollow square.
         *
         * Output:
         * *****
         * *   *
         * *   *
         * *   *
         * *****
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        /*
         * QUESTION 10:
         * Print a hollow triangle.
         *
         * Output:
         * *
         * **
         * * *
         * *  *
         * *****
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        /*
         * QUESTION 11:
         * Print an X pattern.
         *
         * Output:
         * *   *
         *  * *
         *   *
         *  * *
         * *   *
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j == i || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        /*
         * QUESTION 12:
         * Print a plus (+) pattern.
         *
         * Output:
         *   *
         *   *
         * *****
         *   *
         *   *
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == (n + 1) / 2 || j == (n + 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        /*
         * QUESTION 13:
         * Print a butterfly pattern.
         *
         * Output:
         * *        *
         * **      **
         * ***    ***
         * ****  ****
         * **********
         * ****  ****
         * ***    ***
         * **      **
         * *        *
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*
         * QUESTION 14:
         * Print a hollow pyramid.
         *
         * Output:
         *     *
         *    * *
         *   *   *
         *  *     *
         * *********
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        /*
         * QUESTION 15:
         * Print a hollow diamond.
         *
         * Output:
         *     *
         *    * *
         *   *   *
         *  *     *
         * *       *
         *  *     *
         *   *   *
         *    * *
         *     *
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        /*
         * QUESTION 16:
         * Print an hour glass pattern.
         *
         * Output:
         * *********
         *  *******
         *   *****
         *    ***
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         */

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 2; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*
         * QUESTION 17:
         * Print a number triangle.
         *
         * Output:
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        /*
         * QUESTION 18:
         * Print the following pattern:
         *
         * Output:
         * 1
         * **
         * 333
         * ****
         * 55555
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }

            System.out.println();
        }


        /*
         * QUESTION 19:
         * Print stars in increasing order.
         *
         * Output:
         * *
         * **
         * ***
         * ****
         * *****
         *
         * Try modifying this pattern so that:
         * - Odd rows contain stars.
         * - Even rows contain spaces.
         */

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*
         * QUESTION 20:
         * Print a hollow rectangle.
         *
         * Rows = 5
         * Columns = 7
         *
         * Output:
         * *******
         * *     *
         * *     *
         * *     *
         * *******
         */

        int rows = 5;
        int columns = 7;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= columns; j++) {

                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
