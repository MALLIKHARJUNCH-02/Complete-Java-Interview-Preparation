import java.util.Scanner;

class ThreadOne extends Thread {
    int[] array;
    int start;
    int end;

    public ThreadOne(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public void run() {

        for (int i = start; i <= end; i++) {
            System.out.println("Array Element [ " + i + " ] = " + array[i]);
        }
    }
}

class ThreadTwo extends Thread {
    int[] array;
    int start;
    int end;

    public ThreadTwo(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public void run() {

        for (int i = start; i <= end; i++) {
            System.out.println("Array Element [ " + i + " ] = " + array[i]);
        }

    }
}

public class SingleTaskUsingMultipleThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Array Length : ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Enter THe Array elements : ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter THe Array Element [ " + i + " ] : ");
            array[i] = sc.nextInt();
        }

        int mid = arrayLength / 2;

        ThreadOne tOne = new ThreadOne(array, 0, mid - 1);
        ThreadTwo tTwo = new ThreadTwo(array, mid, arrayLength - 1);

        tOne.start();
        tTwo.start();

        sc.close();
    }

}
