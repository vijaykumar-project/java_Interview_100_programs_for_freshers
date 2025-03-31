interface GrandFather {
    void act();
}
interface grandMother{
    void cook();
    
}
class mom implements grandMother,GrandFather {
public void cook(){
    System.out.println("i can cook");
}
 
public void act(){
    System.out.println("i can act");
}
static void sing(){
    System.out.println("i can sing");
}
}


class  daugther extends mom {
    void dance(){
        System.out.println("i can dance");
    }
}

public class HybridIn {
    public static void main(String[] args) {
        daugther d=new daugther();
        d.cook();
        d.act();
        d.dance();
        d.sing();
    }
}
