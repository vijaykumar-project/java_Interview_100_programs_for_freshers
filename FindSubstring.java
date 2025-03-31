
import java.util.ArrayList;

public class FindSubstring {
    public static void main(String[] args) {
        String str="vijay";
ArrayList<String> subStrings=new ArrayList<>();
    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<=str.length();j++){
        subStrings.add(str.substring(i,j));
    }}
System.out.println(subStrings);}
}
