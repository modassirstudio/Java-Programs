package Code_With_Modassir;

public class CWH_29_Chapter_06_Practice_Set {
    public static void main(String[] args){
        // Question.1 : Create an array of five floats and Calculate their sum
        /*
        float [] a = {2.3f, 5.4f, 9.3f, 7.5f, 2.8f};
        float sum = 0;
        for(float elements:a){
            sum = sum + elements;
        }
        System.out.println(sum);

        // Question.2 : Write a program to find out whether a given float is present in an array or not.
        float [] b = {2.3f, 5.4f, 9.3f, 7.5f, 2.8f};
        float zero = 2.32f;
        boolean isAnArray = false;
        for(float elements:b){
            if(zero==elements){
                isAnArray = true;
            }
        } if(isAnArray){
            System.out.println("The value is present in the array");
        } else{
            System.out.println("The value is not present in the array");
        }

        // Question.3 : Calculate the average marks from an array containing marks of all students in Physics using for-each Loop
        float [] marks = {2.3f, 5.4f, 9.3f, 7.5f, 2.8f};
        float sum = 0;
        for(float elements:marks){
            sum = sum + elements;
        }
        System.out.println("The value of average marks is : " + sum/marks.length + "%");
         */
        // Question.4 : Create a java program to add two matrices of size 2x3.
        // I skip question 4

        // Question.5 : Write a java program to reverse an array
//        int [] arr = {1,2,3,4,5,6,7};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for(int i = 0; i<n; i++){
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        for(int elements: arr){
//            System.out.print(elements + " ");
//        }

        // Question.6 : Write a java program to find the maximum element in an array.
        // This answer is given by Chat-GPT using For Loop
//        int[] array = {5, 8, 2, 10, 7, 1};

        // Find the maximum element
//        int maxElement = Integer.MIN_VALUE; // Assume the first element is the maximum

//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > maxElement) {
//                maxElement = array[i]; // Update maxElement if a larger element is found
//            }
//        }
        // Display the result
//        System.out.println("Maximum element in the array: " + maxElement);

        // My Answer is using For-each Loop
//        int [] arr = {13,24,33,64,95,92};
//        int max = Integer.MIN_VALUE;
//        for(int e:arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("Maximum element in the array: " + max);

//        // Question.7 : Write a java program to find the minimum element in an array.
//        int [] marks = {54, 98, 67, 82, 32, 45};
//        int minMarks = Integer.MAX_VALUE;
//        for(int e:marks){
//            if(e < minMarks){
//                minMarks = e;
//            }
//        }
//        System.out.println("Minimum element in the array: " + minMarks);

        // Question.8 : Write a java program to find whether an array is sorted or not.
        int [] a = {1,21,3,4,5};
        boolean isSorted = true;
        for(int i = 0; i< a.length-1; i++){
            if(a[i]> a[i+1]){
                isSorted  = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("this is sorted");
        } else {
            System.out.println("this isn't sorted");
        }
    }
}
