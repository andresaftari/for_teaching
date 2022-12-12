package Bebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teleporter {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("\nWaiting device to online...");
        try {
            teleporter();
        }
        catch (Exception e) {
            System.out.println("Device malfunction occured : " + e.getMessage());
        }
    }

    private static void teleporter() throws IOException {
        System.out.print("\nWho do you want to teleport now? ");
        String friend = br.readLine();
        System.out.println("\nPreparing to teleport : " + friend + ". Requesting location and destination...");

        String location = br.readLine();
        from(location);
        String destination = br.readLine();
        to(destination);
    }

    private static void to(String destination) {
        System.out.println("Teleporting to " + destination + " now");
    }

    private static void from(String location) {
        switch (location) {
            case "Jakarta":
                System.out.println("Teleporting from Jakarta...");
                break;

            case "Bogor":
                System.out.println("Teleporting from Bandung...");
                break;

            case "Depok":
                System.out.println("Teleporting from Depok...");
                break;

            default:
                System.out.println("Teleporting from " + location + "...");
        }
    }
}
