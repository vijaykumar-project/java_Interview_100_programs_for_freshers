public class ToDecimal {
    public static void main(String[] args) {
        
        String binary="0000000011";
        if (!binary.matches("[10]+")) {
            System.out.println("invalid number");
            return;
        }
        int decimal=0;
    for (int i=0;i<binary.length();i++) {
        decimal=decimal*2+(binary.charAt(i)-'0');
    }
    System.out.println(decimal);
    }
}
