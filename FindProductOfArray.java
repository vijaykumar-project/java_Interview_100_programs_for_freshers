import java.util.Arrays;
public class FindProductOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,0,4};
        int count=0;
        int total=1;
for(int i=0;i<arr.length;i++){
   if (arr[i]==0) count++;
   else total*=arr[i];
}
for(int i=0;i<arr.length;i++){
if (count>1) {
    arr[i]=0;
}
else if(count==1){
    arr[i]=(arr[i]==0)?total:0;
}
else arr[i]=total/arr[i];

} 
System.out.println(Arrays.toString(arr));}
}