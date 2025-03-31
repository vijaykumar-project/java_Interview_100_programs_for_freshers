public class Prime {
    static boolean normal(int n){
        if (n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;
            }
        }
    return  true;
}
static boolean recursion(int n,int i){
if (n<=1) return false;
if(i*i>n) return true;
if(n%i==0) return false;
return recursion(n,i+1);
}    
    public static void main(String[] args) {
        int n=0;
        System.out.println(normal(n));
        System.out.println(recursion(n,2));
    }
}


