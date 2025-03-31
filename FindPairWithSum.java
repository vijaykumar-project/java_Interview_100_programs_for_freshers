import java.util.HashSet;

public class FindPairWithSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 3, 0, 4};
        int compliment;
       int target=5;
       HashSet <Integer> set=new HashSet<>();
        for(int num:arr){
            compliment=target-num;
        if (set.contains(compliment)) {
            System.out.println("here it is ( " +num+" , "+compliment+" );");
        }
        set.add(num);
        }

    }
}
