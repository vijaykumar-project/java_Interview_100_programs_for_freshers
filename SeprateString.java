
public class SeprateString {
    public static void main(String[] args) {
        String str="yara antha l--su n@n th@a an&ha l00su ";
        str=str.replaceAll("[^a-zA-z\s]", "");
        System.out.println(str);
    }
}