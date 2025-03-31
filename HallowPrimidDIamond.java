import java.util.Scanner;

public class HallowPrimidDIamond {
    public static void main(String[] args) {
        //Square hallow pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
       
        for(int i=1;i<=n;i++){
            //Print leading spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Print stars and hallow spaces
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j == 2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for(int i=1;i<n;i++){ //1,2,3,4
            //Print leading spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //Print stars and hallow spaces in triangle
            for(int j=1;j<=(n-i)*2-1;j++){
                if(j==1 || j == (n-i)*2-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}     

