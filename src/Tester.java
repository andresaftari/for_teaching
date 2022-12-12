import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
        String currentTime = sdf.format(new Date());

        System.out.println(currentTime);
    }
}
