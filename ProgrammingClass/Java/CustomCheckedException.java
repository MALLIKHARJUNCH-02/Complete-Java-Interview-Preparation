class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

class CheckAge {

    public void age(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age Must Be Above 18");
        } else {
            System.out.println("Eligible");
        }
    }
}

public class CustomCheckedException {
    public static void main(String[] args) {

        CheckAge ca = new CheckAge();

        try {
            ca.age(15);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}
