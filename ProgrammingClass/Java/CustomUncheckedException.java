// class InvalidAgeException extends RuntimeException{

//     public InvalidAgeException(String message){
//         super(message);
//     }
// }

// class CheckAge{

//     public void age(int age){
//         if(age < 18){
//             throw new InvalidAgeException("Age Must Be Above 18");
//         }else{
//             System.out.println("Eligible");
//         }
//     }
// }

// public class CustomUncheckedException {
//     public static void main(String[] args) {
//         CheckAge ca = new CheckAge();

//         ca.age(19);
//     }
// }
