
/**
 * OOPSBannerApp UC5 — Render "OOPS" as a banner using inline array initialization
 * and String.join() to create each line, then print using a for-each loop.
 *
 * @author Suhas T G
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {
            String.join("  ", " *** ", " *** ", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "**** ", " *** "),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", " *** ", " *** ", "*    ", "**** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}