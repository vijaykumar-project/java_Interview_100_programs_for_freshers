public class CountFirstLetter {
    public static void main(String[] args) {
        String str="vijay";
        int count=0;
        char c=str.charAt(0);
        for (int i=0;i<str.length();i++) {
            if (c==str.charAt(i)) count++;
        }
        System.out.println("the first char "+c+" present in " +count+" times");

    }
}
