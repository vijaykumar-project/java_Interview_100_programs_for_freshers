public class ConstructorOverloading {

    ConstructorOverloading(int a, int b) {
        System.out.println("int a = " + a + ", int b = " + b);
    }

    ConstructorOverloading(int a, String b) {
        System.out.println("The id is " + a + ", The name is " + b);
    }

    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading(21, "vijay");
        ConstructorOverloading co1 = new ConstructorOverloading(50, 58);
    }
}
    