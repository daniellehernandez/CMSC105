import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simple {
    double sample;
    List<Integer> frame;
    List<String> samples = new ArrayList<String>();
    Random rands = new Random();

    public Simple(Double sample, List<Integer> frame) {
        this.sample = sample;
        this.frame = frame;
    }


    public void SimpleSamp() {

        for (int i = 0; samples.size() != sample; i++) {
            int rand = rands.nextInt((frame.size() - 1) + 1); //produces the random number
            Boolean exist = false;
            for (String z : samples) { //checking if the data exist already ... we opted for NO-REPLACEMENT METHOD
                if (z.equals("  [Index " + (rand+1) + "]:" + frame.get(rand) + "  ")) {
                    exist = true;
                }
            }
            if (!exist) samples.add("  [Index " + (rand+1) + "]:" + frame.get(rand) + "  "); //adds to sample array
        }
    }
}