public class FindMinMaxArray {
    public static void main(String[] args) {
        int []a={0,1,5,89,5,6,2};

        int max=a[0];
        int min=a[0];
        for (int i : a) {
            if (max<i)max=i;
            if (min>i)min=i;
            }
            System.out.println(max);
            System.out.println(min);
        }
    }
