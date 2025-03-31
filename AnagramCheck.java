public class AnagramCheck {
    public static void main(String[] args) {
        
    String str1="vijay";
    String str2="vijay";
    int arr[]=new int[128];
if (str1.length()!=str2.length()){ 
    System.out.println("the given string not anagram");
    return; } 
    for (char c : str1.toCharArray()) {
        arr[c]++;
    }
    for (char c : str2.toCharArray()) {
        arr[c]--;
    }
    boolean isAnagram=true;
for (int i : arr) {
    if (i!=0) {
        isAnagram=false;
    break;
    }  
}
if (isAnagram) {
    System.out.println("the given string is an anagram");
}else{
    System.out.println("the given string not an anagram");
}
}}
