public class Swap {

    static void withTemp(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" , "+b);

    }
    static void notemp(int a ,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" , "+b);
    }
    public static void main(String[] args) {
        int a=105;
        int b=125;
        withTemp(a, b);
        notemp(a, b);
    }
}
