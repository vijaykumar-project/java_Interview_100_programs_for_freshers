public class ToBinary {
    public static void main(String[] args) {
        int decimal=50;
        if (decimal<=0) {
            System.out.println(decimal);
            return;
        }
        StringBuilder result=new StringBuilder();
        while (decimal>0) {
            result.insert(0,decimal%2);
            decimal/=2;
        }
        System.out.println(result);
    }
}
