public class StaticDemo {
    public static void main (String[] args) {

        Abc.i = 5;
        System.out.println(Abc.i);

        Abc.show();
    }
}

class Abc {

    static int i;

    public static void show() {
        System.out.println("Hi");
    }
}
