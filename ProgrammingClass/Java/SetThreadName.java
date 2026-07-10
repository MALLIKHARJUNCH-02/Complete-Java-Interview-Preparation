class ArraySumThread extends Thread {
    public void run() {
        int[] array = { 1, 2, 3, 4, 5 };

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Array Sum : " + sum);

        System.out.println("Current Executing THread Name is : " + Thread.currentThread().getName());
    }
}

public class SetThreadName {
    public static void main(String[] args) {

        ArraySumThread as = new ArraySumThread();
        as.setName("ArraySumThread");
        as.start();

        Thread t = Thread.currentThread();

        System.out.println("Before: " + t.getName());

        t.setName("Mallikharjun");

        System.out.println("After: " + t.getName());

        System.out.println("Current Executing THread Name is : " + Thread.currentThread().getName());
    }
}
