import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Just want to play with Gradle :)
 */

public class Main {
    public static boolean stop = false;
    public static boolean debug = false;

    public static void main(String[] args) throws IOException {

        while (!stop) {
            loop();
            System.out.println("-".repeat(70));
        }

        Map map = new Map(debug);



        System.out.println("Finished. Thank you!");
    }

    public static void loop() {
        stop = true;
    }

    public static String getInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(">");
        try {
            return reader.readLine();
        } catch (final Exception e) {
            return "";
        }
    }

}
