
import java.util.Arrays;

public class ReverseEachWordS {
    public static void main(String[] args) {
    String str="vijayakumar nan than da";
    StringBuilder result=new StringBuilder();
    String[]words=str.split("\\s+");
    for (String word : words) {
        for(int i=word.length()-1;i>=0;i--){
            result.append(word.charAt(i));
        }
        result.append(" ");
    }
    System.out.println(result);
System.out.println(Arrays.toString(words));
}
}
