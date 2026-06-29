public class PrintAlphabets {
    public static void main(String[] args) {
        System.out.println("Lower Case");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + "\t");
        }
        
        System.out.println("\nUpper Case");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + "\t");
        }
    }
}
