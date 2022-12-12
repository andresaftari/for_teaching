package Bebas;

public class StudyCase {
    public static void main(String[] args) {
        String current = args[0];

        Days today = Days.valueOf(current.toUpperCase());

        switch (today) {
            case Monday:
            case Tuesday:
            case Wednesday:
                System.out.println("Boring");
                break;
            case Thursday:
                System.out.println("Still boring");
                break;
            case Friday:
            case Saturday:
            case Sunday:
                System.out.println("Bucin :)");
                break;
        }
    }

    enum Days {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
}
