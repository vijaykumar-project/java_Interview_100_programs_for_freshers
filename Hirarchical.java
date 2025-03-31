
class dad{
    static void dance(){
        System.out.println("i can dance");
    }
}
class son extends dad{
    static void sing(){
        System.out.println("i can sing");
    }
}
class grandSon extends  son{
    static void joke(){
        System.out.println("i can joke");
    } }
class grandDaugther extends son{
    static void cook(){
        System.out.println("i can cook");
    }
}


public class Hirarchical {
    public static void main(String[] args) {
        grandSon gS=new grandSon();
        grandDaugther gD=new grandDaugther();
        gS.sing();
        gS.dance();
        gS.joke();
        gD.dance();
    }
}
