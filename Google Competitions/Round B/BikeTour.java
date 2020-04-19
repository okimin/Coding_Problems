import java.util.*;
import java.io.*;

class BikeTour {

    public static int numPeaks(ArrayList<Integer> checks) {

        int peaks = 0;

        for (int x = 1; x < checks.size() - 1; x++) {

            if ((checks.get(x) > checks.get(x - 1)) && (checks.get(x) > checks.get(x + 1)))
                peaks++;
        }

        return peaks;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int testCases = input.nextInt();

        ArrayList<Integer> checkpoints = new ArrayList<>();

        for (int x = 1; x <= testCases; x++) {

            int numCheck = input.nextInt();
            for (int y = 0; y < numCheck; y++) {

                checkpoints.add(input.nextInt());

            }

            System.out.println("Case #" + x + ": " + numPeaks(checkpoints));

            checkpoints.clear();

        }

    }

}