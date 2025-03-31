public class RemoveAdjacentn_1 {
    public static void main(String[] args) {
    String str="proograammminnng";
    StringBuilder copy=new StringBuilder();
    StringBuilder result =new StringBuilder();
int i=0;
while (i<str.length()) {
    char c=str.charAt(i);
    int count =1;
    if (i+1<str.length()&&c==str.charAt(i+1)){
        count++;
        i++;
    }
    if (count>1) {
        copy.append(String.valueOf(c).repeat(count-1));
        result.append(copy);
        copy.setLength(0);

    }else{
    result.append(c);
    }i++;
}
System.out.println(result);

    }
}