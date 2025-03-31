public class PrintNumbersInword {
    public static void main(String[] args) {
        String[]numbers={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num=120;
        if (num==0) {
            System.out.println("zero");
            return;
        }
        String numStr = String.valueOf(num);
        for (char digit : numStr.toCharArray()) {
            System.out.print(numbers[digit - '0'] + " ");
        }
            
        }
    
}
