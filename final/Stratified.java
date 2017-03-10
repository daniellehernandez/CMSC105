import java.util.*;

import static java.lang.StrictMath.ceil;
import static java.lang.StrictMath.floor;

public class Stratified {
    double sample;
    List<Integer> frame;
    List<String> samples = new ArrayList<String>();
    Random rands = new Random();

    public Stratified(Double sample, List<Integer> frame) {
        this.sample = sample;
        this.frame = frame;
    }


    public void StratifiedSamp() {

        ArrayList<ArrayList<Integer>> strata = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Display print = new Display(0);

        boolean flag = true;
        int in = 0;

        while(in != frame.size()){ //STRATIFICATION of data
            ArrayList<Integer> mock = new ArrayList<>(Arrays.asList(frame.get(in)));
            if (strata.isEmpty()){
                strata.add(mock);
            }else{
                flag = true;
                for(int i = 0; i < strata.size(); i++){
                    if (mock.get(0).equals(strata.get(i).get(0))){
                        strata.get(i).add(frame.get(in));
                        flag = false;
                        break;
                    }
                }

                if (flag){
                    strata.add(mock);
                }
            }

            in++;
        }


        System.out.println("Sample Percentage to get per Srata:"); //Using the simple random to get samples per strata
        Double percent = scan.nextDouble();
        scan.nextLine();
        for (int j = 0; j < strata.size(); j++){
            Simple samplee = new Simple(ceil((percent/100)*strata.get(j).size()), strata.get(j));
            samplee.SimpleSamp(); //Recycles the simple random sampling function
            for(String d: samplee.samples){
                samples.add("  [Strata "+(j+1)+"]:"+d+"  ");
            }
        }
        System.out.println(strata.toString() + "\n");
    }

}
