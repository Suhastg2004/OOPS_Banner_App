/**
 *
 * @author Suhas T G
 * @version 4.0
 */

public class OOPSBannerApp_UC4 {

    public static void main(String[] args) {
        String[] lines = new String[7];

        // Populate each index with the banner line using String.join()
        // Renders: O  O  P  S
        lines[0] = String.join(" ", " *** ", " *** ", "**** ", " ****");
        lines[1] = String.join(" ", "*   *", "*   *", "*   *", "*    ");
        lines[2] = String.join(" ", "*   *", "*   *", "*   *", "*    ");
        lines[3] = String.join(" ", "*   *", "*   *", "**** ", " *** ");
        lines[4] = String.join(" ", "*   *", "*   *", "*    ", "    *");
        lines[5] = String.join(" ", "*   *", "*   *", "*    ", "    *");
        lines[6] = String.join(" ", " *** ", " *** ", "*    ", "**** ");

        // Print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}