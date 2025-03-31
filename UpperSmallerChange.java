import java.util.Arrays;
public class UpperSmallerChange {
    public static void main(String[] args) {
    String str="yara intha paiyan";
    char[] c=str.toCharArray();
    System.out.println(Arrays.toString(c));
    for(int i=0;i<str.length();i++){
        if (i%2==0&&Character.isLowerCase(c[i])) {
           c[i]= Character.toUpperCase(c[i]);
        }
    str=new String(c);
    }
System.out.println(str);
}}
