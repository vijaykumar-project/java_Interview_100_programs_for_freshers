public class RemoveSpecialChar {
    public static void main(String[] args) {
        String str="vnj^ 808( &@&#@knBH!#H)";
        str=str.replaceAll("[^a-zA-Z0-9\s]", "");
        System.out.println(str);
    }
}
