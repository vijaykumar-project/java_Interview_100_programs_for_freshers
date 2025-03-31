
import java.util.Arrays;
public class BubbleSort {
    static void Sort(int[]a){
        boolean swapped;
    for(int i =0;i<a.length-1;i++){
        swapped=false;
        for(int j=0;j<a.length-i-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
                swapped=true;
            }
        }
        if (!swapped)  break;
    }
}
    public static void main(String[] args) {
        int[]a={20,30,175,0,4,5,7,90};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }
}
