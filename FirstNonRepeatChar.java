public class FirstNonRepeatChar {
public static void main(String[] args) {
    String str="programming";
    char c=' ';
    boolean dup=false;
    for(int i =0;i<str.length();i++){
        c=str.charAt(i);
        dup=false;
    for(int j=0;j<str.length();j++){
        if(i!=j&&c==str.charAt(j)){
            dup=true;
        }
        }
        if (!dup) {
            System.out.println("the 1st non repeat character  "+str.charAt(i));
            break; 
        }        }
}
}


