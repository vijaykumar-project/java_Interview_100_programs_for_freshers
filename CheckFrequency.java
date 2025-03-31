public class CheckFrequency {
public static void main(String[] args) {
    String str="vijayakuumar";
int []charCount=new int[128];

for (char c : str.toCharArray()) {
    charCount[c]++;
}
for (int i=0;i<charCount.length;i++) {
    if (charCount[i]>0) {
System.out.println("the frequency of "+(char)i+" is present "+charCount[i]+" times" );
}}
}
}
