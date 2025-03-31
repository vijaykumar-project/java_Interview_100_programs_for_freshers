public class Find_N_Perfect {
    public static void main(String[] args) {
        int n=496;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if (n%i==0) { 
            sum+=i;
        }}
    if (sum==n) {
        System.out.println("its perfect number");
    }else{
        System.out.println("its not an perfect");
    }

    }
}
