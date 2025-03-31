public class CollatzConjecture {
    public static void main(String[] args) {
        int num=5;
        if (num>1) {
            while (num!=1) {
                System.out.print(num+" --> ");
                if (num%2==0) {
                  num/=2;  
                }else{
                    num=3*num+1;
                }
            }
            
        }
    }

}
