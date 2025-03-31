interface Dad {
void dance();
}

interface Mom {
void sing();
    
}

class son implements Mom,Dad{
   public  void dance(){
        System.out.println("i can dance");
    }
    public void sing(){
        System.out.println("i can sing");
    }
    public void study(){
        System.out.println("i can study");
    }

}

public class MultipleIn {
    public static void main(String[] args) {
        
    }
}
