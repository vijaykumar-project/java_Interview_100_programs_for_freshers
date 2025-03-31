
public class Encapsulation {
    private int stdId;
    private int stdMark;  

    public void setId(int id) {
        this.stdId = id;
    }

    public void setMark(int mark) {
        this.stdMark = mark;
    }

    public boolean result() {
        return stdMark >= 50 && stdMark < 100; 
    }

    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.setId(5);
        en.setMark(50);

        System.out.println("The ID is: " + en.stdId); 
        if (en.result()) 
            System.out.println("Pass");
        else 
            System.out.println("Fail");
    }
}
