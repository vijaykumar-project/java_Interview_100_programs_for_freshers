public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {  // Rows
            for (int j = 1; j <= n - i; j++) {  // Spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {  // Stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
