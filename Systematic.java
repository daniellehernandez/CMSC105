import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Systematic {
    double sample;
    Integer size;
    List<Integer> frame;
    List<String> samples = new ArrayList<String>();
    Random rands = new Random();

    public Systematic(Double sample, Integer size, List<Integer> frame) {
        this.sample = sample;
        this.frame = frame;
        this.size = size;
    }


    public void SystematicSamp() {
        Integer k =(int)Math.floor(size / sample);
        boolean exist = false;
        Integer rand = rands.nextInt( k ); //starting number point
        //Integer rand = rands.nextInt((frame.size()-1) + 1 ); SUGGESTED METHOD 2 OF GETTING THE RANDOM NUMBER STARTING POINT
        Integer ct = -1;

        samples.add("  [Index "+rand+"]:"+frame.get(rand)+"  ");
        for (int j = rand; samples.size() != sample; j++, ct++) { //satisfies the sample size
            if ((ct + .0) == k) { //counter for the interval
                for (String z : samples) { //checking NO-REPLACEMENT Method
                    if (z.equals("  [Index "+j+"]:"+frame.get(j)+"  ")){
                        exist = true;
                    }
                }
                if (!exist) {
                    samples.add("  [Index "+j+"]:"+frame.get(j)+"  ");
                }
                ct = -1;
                exist = false;
            }
            if (j >= size-1 ) { j = -1;} //Wraps around the arraylist when the counter reaches the end

        }
    }
}
