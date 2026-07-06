import java.util.Scanner;

class ArrayOperations extends Thread {
    int array[];

    public ArrayOperations(int[] array) {
        this.array = array;
    }

    public void run() {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum Of The Elements In The Array" + sum);
        System.out.println("Even Numbers In The Array");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Average Of the Array : " + (sum / (double) array.length));

    }
}

public class MultipleTasksUsingSingleThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Array length ");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter The Array element [  " + i + " ] : ");
            array[i] = sc.nextInt();
        }

        ArrayOperations ao = new ArrayOperations(array);

        ao.start();

        sc.close();
    }
}
