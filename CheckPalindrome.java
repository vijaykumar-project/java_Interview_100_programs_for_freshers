public class CheckPalindrome {
 public static void main(String[] args) {
    String str="vijiv";
    String og=str;
    String rev="";
    for ( int i=str.length()-1;i>=0;i--) {
        rev+=str.charAt(i);
    }
    System.out.println(rev.equals(og));
 }   
}
