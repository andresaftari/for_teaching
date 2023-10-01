package ListOfLists.Hashyut;

import java.util.HashSet;
import java.util.Objects;

public class SetMain {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(123); // index = 123 % 3 = 0 (1)
        set.add(124); // index = 124 % 3 = 1 (1)
        set.add(132); // index = 132 % 3 = 0 (2)
        set.add(13); // index = 1 (2)

        for (Integer data : set) System.out.println(data);
    }
}

class Mahasiswaaa {
    String nim, nama;

    public Mahasiswaaa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mahasiswaaa that = (Mahasiswaaa) o;
        return Objects.equals(nim, that.nim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nim);
    }
}
