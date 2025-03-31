class dad {
public void cook(){
   System.out.println("i  know cooking in indian style"); 
}
    
}
class son extends dad {
    public void cook(){
        System.out.println("i know cooking in chinese style");
    }

    
}



public class MethodOverriding {
    
    public static void main(String[] args) {
        dad d=new dad();
        son s=new son();
        
        d.cook();
        s.cook();
        
    }
}
