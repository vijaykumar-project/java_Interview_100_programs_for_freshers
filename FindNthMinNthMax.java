

public class FindNthMinNthMax {
    public static void main(String[] args) {
    int []a={0,1,5,89,5,6,2};
    for (int i=0;i<a.length-1;i++) {
        for(int j=0;j<a.length-1;j++){
            if (a[j]>a[j+1]) {
                int temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
    }
int n=8;
if(n<=(a.length))
{
System.out.println("the second min is " + (a[n-1]));
System.out.println("the second max is " + (a[a.length-(n)]));
} 
else System.out.println("enter the valid size");
}
}
