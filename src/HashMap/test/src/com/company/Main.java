package HashMap.test.src.com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<Student, Integer> studentMap = new HashMap<>();
    static Student[] studentsData = new Student[25];
    static int index = 0;
    static int sizeOfStudentData = 0;
    static int nim = 6706190;

    void showStatisticScore() {
        try {
            int sumScore = 0;
            int totalScore = 0;

            for (Student studentsDatum : studentsData) {
                if (studentsDatum != null) {
                    System.out.print(studentsDatum + " score: ");
                    if (studentMap.containsKey(studentsDatum)) {
                        int studentScore = studentMap.get(studentsDatum);
                        System.out.println(studentScore);
                        sumScore += studentScore;
                        totalScore++;
                    } else {
                        System.out.println("not scored yet");
                    }
                }
            }

            float avg = (float) sumScore / totalScore;
            System.out.println("\nAverage Score: " + avg);
        } catch (Exception e) {
            System.out.println("Some error in showStatistic(): " + e.toString());
        }
        System.out.println();
    }

    void insertStudent() {
        try {
            boolean emptySlot = true;
            int studentIndex = index % studentsData.length;
            while (emptySlot) {
                if (studentsData[studentIndex] == null) {
                    nim++;
                    String nimString = String.valueOf(nim);
                    System.out.println("NIM   : " + nimString);

                    System.out.print("Class : ");
                    String clas = br.readLine();

                    System.out.print("Name  : ");
                    String name = br.readLine();

                    Student student = new Student(nimString, clas, name);

                    Student data = studentsData[studentIndex] = student;
                    emptySlot = false;
                    sizeOfStudentData++;
                }
                index++;
            }
        } catch (Exception e) {
            System.out.println("Some error in inserStudent(): " + e.toString());
        }
        System.out.println();
    }

    void insertScore() {
        try {
            int list = 1;
            for (Student studentsDatum : studentsData) {
                if (studentsDatum != null)
                    System.out.println(list + ". " + studentsDatum);
                list++;
            }

            System.out.print("Chose student : ");
            int numStudent = Integer.parseInt(br.readLine());

            System.out.print("Score         : ");
            int studentScore = Integer.parseInt(br.readLine());

            studentMap.put(studentsData[numStudent - 1], studentScore);
        } catch (Exception e) {
            System.out.println("Some error in insertScore(): " + e.toString());
        }
        System.out.println();
    }

    void findStudent() {
        try {
            System.out.print("Search student by NIM / Class / Name: ");
            String search = br.readLine();

            for (Student studentsDatum : studentsData) {
                if (studentsDatum != null) {
                    if (studentsDatum.nim.equals(search) || studentsDatum.clas.equals(search) || studentsDatum.name.equals(search)) {
                        System.out.print(studentsDatum + " score: ");
                        if (studentMap.containsKey(studentsDatum)) {
                            int studentScore = studentMap.get(studentsDatum);
                            System.out.println(studentScore);
                        } else {
                            System.out.println("not scored yet");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Some error in findStudent(): " + e.toString());
        }
        System.out.println();
    }

    void removeStudent() {
        try {
            int list = 1;
            for (Student studentsDatum : studentsData) {
                System.out.println(list + ". " + studentsDatum);
                list++;
            }

            System.out.print("Remove student: ");
            int search = Integer.parseInt(br.readLine());
            Student data = studentsData[search - 1];
            studentMap.remove(data);
            data = null;
            System.out.println("Student removed");
        } catch (Exception e) {
            System.out.println("Some error in removeStudent(): " + e.toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    void run() {
        try {
            int option;
            do {
                System.out.println("1. Show all students statistic\n" +
                        "2. Insert student\n" +
                        "3. Insert student score\n" +
                        "4. Find student\n" +
                        "5. Remove student\n" +
                        "6. Exit"
                );
                System.out.print("Your option: ");
                option = Integer.parseInt(br.readLine());
                System.out.println();
                switch (option) {
                    case 1:
                        if (sizeOfStudentData == 0)
                            System.out.println("No data available\n");
                        else
                            showStatisticScore();
                        break;
                    case 2:
                        if (sizeOfStudentData == studentsData.length)
                            System.out.println("Student data full\n");
                        else
                            insertStudent();
                        break;
                    case 3:
                        if (sizeOfStudentData == 0)
                            System.out.println("No data available\n");
                        else
                            insertScore();
                        break;
                    case 4:
                        if (sizeOfStudentData == 0)
                            System.out.println("No data available\n");
                        else
                            findStudent();
                        break;
                    case 5:
                        if (sizeOfStudentData == 0)
                            System.out.println("No data available\n");
                        else
                            removeStudent();
                        break;
                    case 6:
                        System.out.println("Bye");
                        break;
                    default:
                        System.out.println("There is no menu with this option\n");
                }
            } while (option != 6);
        } catch (Exception e) {
            System.out.println("Some error in run(): " + e.toString());
        }
    }
}
