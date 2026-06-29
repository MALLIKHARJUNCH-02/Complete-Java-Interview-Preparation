class One {

    int a = 10;

    public void methodOne(One o) {
        o.a = 20;
        o.a++;
        System.out.println(a);
    }

}

public class Test {
    public static void main(String[] args) {

        One o = new One();

        o.methodOne(o);

        System.out.println(o.a);

    }
}