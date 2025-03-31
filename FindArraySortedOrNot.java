public class FindArraySortedOrNot {
    public static void main(String[] args) {
        int []a={0,1,2,3,5,6,7};
        boolean isSorted=true;
            for(int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]) {
                isSorted=false;
                break;
            }
            }
System.out.println((isSorted)?"ama da its sorted":"illa d its not sorted");            
        }


}