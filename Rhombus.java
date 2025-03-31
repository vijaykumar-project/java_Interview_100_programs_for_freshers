import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        //Square hallow pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //print stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
