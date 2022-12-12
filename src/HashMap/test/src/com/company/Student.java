package HashMap.test.src.com.company;

public class Student {
    String nim, clas, name;

    public Student(String nim, String clas, String name) {
        this.nim = nim;
        this.clas = clas;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int HASG_MULTIPLIER = 13;
        // Merupakan pengali dalam bentuk hashCode, untuk hasil maksimal gunakan prime number
        int hashNim = nim.hashCode();
        int hashName = name.hashCode();
        int hashClass = clas.hashCode();
        int hashRes = HASG_MULTIPLIER * hashNim + hashName;
        hashRes = HASG_MULTIPLIER * hashRes + hashClass;
        return hashRes;
        // Buat hashCode function
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return name.equals(other.name) && nim.equals(other.nim)
                && clas.equals(other.clas);
        // Algoritma untuk synchronizes setiap key
    }

    @Override
    public String toString() {
        return "Student{" +
                "nim='" + nim + '\'' +
                ", clas='" + clas + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
