package Interview;

public class Student {

    // fields / properties
    private String name;
    private int age;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // main method
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("VIN");

        System.out.println(s.getName());
    }
}