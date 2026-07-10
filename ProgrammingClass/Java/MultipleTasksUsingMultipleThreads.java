// import java.util.Scanner;

// class ArraySum extends Thread {
//     int[] array;
//     int sum;

//     public ArraySum(int[] array) {
//         this.array = array;
//     }

//     public void run() {
//         for (int i = 0; i < array.length; i++) {
//             sum += array[i];
//         }

//         System.out.println("Sum Of Array elements : " + sum);
//     }
// }

// class ArrayAverage extends Thread {
//     int[] array;
//     int sum;

//     public ArrayAverage(int[] array) {
//         this.array = array;
//     }

//     public void run() {
//         for (int i = 0; i < array.length; i++) {
//             sum += array[i];
//         }

//         System.out.println("Average Of the Array : " + (sum / (double) array.length));
//     }

// }

// class EvenNumbersInArray extends Thread {
//     int[] array;

//     public EvenNumbersInArray(int[] array) {
//         this.array = array;
//     }

//     public void run() {
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] % 2 == 0) {
//                 System.out.println("Even Element in Index [ " + i + " ] = " + array[i]);
//             }
//         }
//     }
// }

// public class MultipleTasksUsingMultipleThreads {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter The Array Length : ");
//         int arrayLength = sc.nextInt();

//         int[] array = new int[arrayLength];

//         System.out.println("Enter The Array Elements : ");

//         for (int i = 0; i < arrayLength; i++) {
//             System.out.println("Enter The Array element [ " + i + " ] : ");
//             array[i] = sc.nextInt();
//         }

//         ArraySum as = new ArraySum(array);
//         ArrayAverage av = new ArrayAverage(array);
//         EvenNumbersInArray en = new EvenNumbersInArray(array);

//         as.start();
//         av.start();
//         en.start();

//         sc.close();
//     }

// }
