import java.util.HashMap;
import java.util.Map;
public class FindDuplicateUsingHashmap {
    public static void main(String[] args) {
        int []a={1, 2, 3, 4, 5};
        boolean irrukan=false;
        HashMap<Integer,Integer> dup=new HashMap<>();
        for (int num : a) {
            dup.put(num,dup.getOrDefault(num,0)+1);
        }    
for (Map.Entry<Integer,Integer> entry : dup.entrySet() ){
if (entry.getValue() > 1) {
    System.out.println("the duplicate "+entry.getKey()+" the occurance are "+entry.getValue());   
irrukan=true;}
}
if (!irrukan) {
    System.out.println("no duplicates");
}
}}    

