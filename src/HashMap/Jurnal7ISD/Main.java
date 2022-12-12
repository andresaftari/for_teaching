package HashMap.Jurnal7ISD;

import java.io.*;
import java.util.*;

public class Main {
    Map<Student, Integer> mapFunc = new HashMap<>();
    // Deklarasikan Java Collection Map dengan Key = Generic class Student kita, dan Value = Integer.
    Student[] student;
    // Deklarasikan Generic class kita sebagai Array of object.
    int arrayFill = 0;
    int startIterator = 0;
    // Inisialisasi iterator dan array fill checker

    public static void main(String[] args) throws IOException {
        Main func = new Main();
        // Import class utama kita sebagai func
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Kita menggunakan BufferedReader agar saat mengetik String key yang lebih dari 2 kata, tidak akan bermasalah
        // dibandingkan dengan Scanner, selain itu BufferedReader dapat mengurangi code compilation time
        int selection, nilaiAsValue;
        String nameAsKey, idAsKey, classAsKey;

        System.out.println("How long the array do we have here ? ");
        int arrayLen = Integer.parseInt(br.readLine());
        // Tentukan panjang array sebagai arrayLen
        func.student = new Student[arrayLen];
        // Deklarasikan arrayLen sebagai size dari Student[]

        do {
            System.out.println("1. Input data\n2. Show data with average score\n3. Delete data\n4. Show all key" +
                    "\n5. Show data with score\n6. Exit");
            selection = Integer.parseInt(br.readLine());
            // Pilih opsi dari menu

            switch (selection) {
                case 1:
                    if (func.arrayFill < func.student.length) {
                        // Cek apabila isi array kurang dari panjang array, artinya masih bisa diisi
                        System.out.print("Insert student ID : ");
                        idAsKey = br.readLine();
                        System.out.print("Insert name : ");
                        nameAsKey = br.readLine();
                        System.out.print("Insert class : ");
                        classAsKey = br.readLine();
                        System.out.print("Insert score : ");
                        nilaiAsValue = Integer.parseInt(br.readLine());

                        func.addData(idAsKey, nameAsKey, classAsKey, nilaiAsValue);
                        // Panggil method addData()
                        System.out.println("Insertion of " + nameAsKey + " successfully executed");
                        func.arrayFill++;
                    } else System.out.println("Full");
                    // Kalau isi = panjang array, artinya FULL
                    break;
                case 2:
                    int sumOfAllScore = 0;
                    int totalOfStudent = 0;
                    // Inisialisasi jumlah nilai dan total mahasiswa

                    if (func.arrayFill != 0) func.showData(sumOfAllScore, totalOfStudent);
                        // Apabila isi array selain daripada 0, panggil method showData()
                    else System.out.println("No data");
                    // Kalau isi = 0, artinya KOSONG
                    break;
                case 3:
                    if (func.arrayFill != 0) {
                        System.out.print("Data ID you want to delete : ");
                        int idToDel = Integer.parseInt(br.readLine());
                        func.deleteData(idToDel);
                        // Apabila isi array selain daripada 0, panggil method deleteData() dengan ID sebagai marks
                    } else System.out.println("No data");
                    // Kalau isi = 0, artinya KOSONG
                    break;
                case 4:
                    if (func.arrayFill != 0)
                        for (Map.Entry<Student, Integer> entry : func.mapFunc.entrySet())
                            System.out.println(entry.getKey());
                        // Apabila isi array selain daripada 0, tampilkan seluruh key
                    else System.out.println("No data");
                    // Kalau isi = 0, artinya KOSONG
                    break;
                case 5:
                    if (func.arrayFill != 0) {
                        int num = 1;
                        // Inisialisasikan keterangan mahasiswa ke-num, mulai dari num = 1
                        for (Map.Entry<Student, Integer> entry : func.mapFunc.entrySet())
                            System.out.println("Score student " + num + " : " + entry.getValue());
                        // Apabila isi array selain daripada 0, tampilkan seluruh value
                    } else System.out.println("No data");
                    // Kalau isi = 0, artinya KOSONG
                    break;
                case 6:
                    System.out.print("Bye, see you later!");
                    System.exit(0);
                    // Exit program
                    break;
                default:
                    System.out.println("Invalid input");
                    // Kalau input menu > 6
            }
        }
        while (true);
    }

    void addData(String idAsKey, String nameAsKey, String classAsKey, int nilaiAsValue) {
        boolean findEmpty = true;
        while (findEmpty) {
            if (student[startIterator % student.length] == null) {
                student[startIterator % student.length] = new Student(idAsKey, nameAsKey, classAsKey);
                mapFunc.put(student[startIterator % student.length], nilaiAsValue);
                findEmpty = false;
            }
            startIterator++;
        }
    }

    void showData(int sumAll, int total) {
        for (Student value : student)
            if (value != null) {
                sumAll += mapFunc.get(value);
                System.out.println("Name : " + value.getNama());
                System.out.println("NIM : " + value.getNim());
                System.out.println("Class : " + value.getKelas() + "\n");
                total++;
            }
        double average = sumAll / (double) total;
        System.out.println("Average score " + average);
    }

    void deleteData(int idToDelete) {
        if (student[idToDelete - 1] != null) {
            mapFunc.remove(student[idToDelete - 1]);
            student[idToDelete - 1] = null;
            System.out.println("Data deletion successful");
            arrayFill--;
        } else System.out.println("No data");
    }
}