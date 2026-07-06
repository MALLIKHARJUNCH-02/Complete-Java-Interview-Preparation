import java.util.Scanner;

class ArraySum extends Thread {

    int array[];
    int sum;

    public ArraySum(int[] array) {
        this.array = array;
    }

    public void run() {

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Array Sum : " + sum);
    }
}

public class SingleTaskUsingSingleThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Array Length : ");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        System.out.println("Enter the Array elements : ");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter Array Element [ " + i + " ] : ");
            array[i] = sc.nextInt();
        }

        ArraySum as = new ArraySum(array);

        as.start();

        sc.close();
    }
}
