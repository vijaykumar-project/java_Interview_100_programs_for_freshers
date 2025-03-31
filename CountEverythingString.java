public class CountEverythingString {
 public static void main(String[] args) {
    String str="yara antha paiyan nanthan antha paiyan";
    int charCount=0,wordCount=0,vowelsCount=0,consonentCount=0;
    String[] words=str.split("\\s+");
    wordCount=words.length;

    str=str.replaceAll("\\s", "");
    charCount=str.length();
    for(int i=0;i<str.length();i++){
    char c=str.charAt(i);
        if ("aeiouAEIOU".indexOf(c)!=-1) {
            vowelsCount++;
        
    }}
    consonentCount=charCount-vowelsCount;
System.out.println("the number of character is "+charCount);
System.out.println("the number of Words is "+wordCount);
System.out.println("the number of vowels is "+vowelsCount); 
System.out.println("the number of consonent is "+consonentCount); 


}   
}
