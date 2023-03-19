package ListOfLists.SinglyLinked;

public class Student {
     private String nim, name;

    public Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
