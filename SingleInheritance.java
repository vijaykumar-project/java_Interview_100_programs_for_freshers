 class DadSI {
  static void dance(){
    System.out.println("i can dance");
  }}
  class son extends DadSI{
    static void sing(){
System.out.println("i can singe");
    }
  }
  public class SingleInheritance{
  public static void main(String[] args) {
        son s=new son();
        s.dance();
        s.sing();
    }
}