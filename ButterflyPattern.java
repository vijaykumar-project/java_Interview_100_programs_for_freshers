import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
        /*
        i=1, spaces = 8, n = 5, star = 1 , s = (n-i)*2
        i=2, spaces = 6, n = 5 ,star = 2
        i=3, spaces = 4, n = 5 ,star = 3
        i=4, spaces = 2, n = 5 ,star = 4
        i=5, spaces = 0, n = 5 ,star = 5
        */
        //Upper pattern
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //print left stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Print spaces
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            //Print right stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        i=1, spaces = 0, n = 5, star = 5 , s = 2*i-2
        i=2, spaces = 2, n = 5 ,star = 4 , s = 2*i-2
        i=3, spaces = 4, n = 5 ,star = 3
        i=4, spaces = 6, n = 5 ,star = 2
        i=5, spaces = 8, n = 5 ,star = 1
        */
        //Lower pattern
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //print left stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            //Print spaces
            for(int j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            //Print right stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

