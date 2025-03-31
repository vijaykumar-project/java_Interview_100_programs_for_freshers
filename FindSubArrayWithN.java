
import java.util.ArrayList;
import java.util.List;
public class FindSubArrayWithN {
    public static void main(String[] args) {
        int a []={1,2,3,1,2,2};
        int target=4;
        List<List<Integer>> subArrays= new ArrayList<>();
        for (int i=0;i<a.length;i++) {
            int sum=0;
            List<Integer> tempList=new ArrayList<>();
            for (int j=i;j<a.length;j++) {
                sum+=a[j];
                tempList.add(a[j]);
        if (sum==target){ 
            subArrays.add(new ArrayList<>(tempList));
            break;}
            }
        }if (subArrays.isEmpty()) {
            System.out.println("there is no possible to give sub array with this");
            
        }else{
        System.out.println(subArrays);
        }
    }
}