// public class NestedTryBlock {
//     public static void main(String[] args) {

//         try {

//             int a = 10 / 0;
//             System.out.println(a);

//             try {

//                 String str = new String("Malli");

//                 System.out.println(str.charAt(20));
//                 try {

//                     int[] array = { 1, 2, 3, 4, 5 };
//                     System.out.println(array[10]);

//                 } catch (ArrayIndexOutOfBoundsException e) {
//                     System.out.println("try-catch - 3");
//                 }

//             } catch (StringIndexOutOfBoundsException e) {
//                 System.out.println("try-catch - 2");
//             }

//         } catch (Exception e) {
//             System.out.println("try-catch - 1");
//         }

//     }
// }

public class NestedTryBlock {
    public static void main(String[] args) {

        try {
            System.out.println("Outer Try");

            try {
                String str = "Malli";
                System.out.println(str.charAt(10));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Inner Catch 1");
            }

            try {
                int[] arr = { 1, 2, 3 };
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch 2");
            }

            System.out.println("Outer Try Ends");

        } catch (Exception e) {
            System.out.println("Outer Catch");
        }
    }
}