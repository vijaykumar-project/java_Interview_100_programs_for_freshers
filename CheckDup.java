public class CheckDup {
    public static void main(String[] args) {
        String str="no duplicate";
        boolean dup=false;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(i!=j&&c==str.charAt(j)) {
                    dup=true;
                    break;
                }
            }
       if (dup)    break;
        }
        if (dup) System.out.println("yes duplicate are there");
        else System.out.println("no duplicates is here"); 
   
    }
}