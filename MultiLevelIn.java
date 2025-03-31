class GrandFather {
static void dance(){
    System.out.println("i can dance");
}   
}
class Dad extends GrandFather {
static void sing(){
    System.out.println("i can sing");
}
}
class son extends Dad{
static void act(){
    System.out.println("i can act");
}
    
}
public class MultiLevelIn {
    public static void main(String[] args) {
 son s=new son();
 s.dance();
 s.sing();
 s.act();
    }
}
