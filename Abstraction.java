abstract class StudentManagement {
    abstract void id();
    abstract void name();
    abstract void marks();
}

class StudentXII extends StudentManagement {
    int id;
    String name;
    int mark;

    public StudentXII(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public void id() {
        System.out.println("The ID is " + id);
    }

    public void name() {
        System.out.println("The Name is " + name);
    }

    public void marks() {
        System.out.println("The Marks are " + mark);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        StudentXII student = new StudentXII(6, "Vijay", 500);
        student.id();
        student.name();
        student.marks();
    }
}