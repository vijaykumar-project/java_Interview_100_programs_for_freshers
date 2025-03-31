
public class LinearSearch {
     public static void main(String[] args) {
    int[]a={20,30,175,0,4,5,7,90};
    int k=784;
    boolean isPresent=false;
for(int i=0;i<a.length;i++){
        if (a[i]==k) {
        isPresent=true ;
        break;           
        }
    }
    System.out.println(isPresent);
}           
        }

