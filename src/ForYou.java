public class ForYou {
    public static void main(String[] args) {
        message();
    }

    private static void pause3s() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void pause5s() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void pause8s() {
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void message() {
        try {
            pause3s();
            System.out.println("I am somewhat nervous 'cause I haven't said these words to anyone. But you know what?");
            pause3s();
            System.out.println("Everything about you is always intresting for me. And I want to say something...");
            pause8s();
            System.out.println("I love you");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}