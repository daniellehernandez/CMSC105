/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsintegration;

import java.awt.List;
import static java.lang.Math.ceil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Simple {
    double sample;
    ArrayList frame;
    ArrayList samples = new ArrayList();
    Random rands = new Random();

    public Simple(int sample, ArrayList frame) {
        this.sample = sample;
        this.frame = frame;
    }

    Simple() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public ArrayList SimpleSamp() {
       
          for (int i = 0; samples.size() != sample; i++) {
            int rand = rands.nextInt((frame.size() - 1) + 1); //produces the random number
            Boolean exist = false;
            for (Object z : samples) { //checking if the data exist already ... we opted for NO-REPLACEMENT METHOD
                if (z.equals("  [Index " + rand + "]:" + frame.get(rand) + "  ")) {
                    exist = true;
                }
            }
            if (!exist) samples.add("  [Index " + rand + "]:" + frame.get(rand) + "  "); //adds to sample array
        }
      
        return samples;
    }

    public ArrayList Systematic() {

        Integer k =(int)Math.ceil(frame.size() / sample);
        boolean exist = false;
        Integer rand = rands.nextInt( k ); //starting number point
        //Integer rand = rands.nextInt((frame.size()-1) + 1 ); SUGGESTED METHOD 2 OF GETTING THE RANDOM NUMBER STARTING POINT
        Integer ct = -1;

        samples.add("  [Index "+rand+"]:"+frame.get(rand)+"  ");
        for (int j = rand; samples.size() != sample; j++, ct++) { //satisfies the sample size
            if ((ct + .0) == k) { //counter for the interval
                for (Object z : samples) { //checking NO-REPLACEMENT Method
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
            if (j >= frame.size()-1 ) { j = -1;} //Wraps around the arraylist when the counter reaches the end

        }    
         
         System.out.print(samples);
         return samples; 
    }
    
    public ArrayList StratifiedSamp(){
        
        ArrayList<ArrayList<Integer>> strata = new ArrayList<>();
      

        boolean flag = true;
        int in = 0;

        while(in != frame.size()){ //STRATIFICATION of data
            ArrayList mock = new ArrayList<>(Arrays.asList(frame.get(in)));
            if (strata.isEmpty()){
                strata.add(mock);
            }else{
                flag = true;
                for(int i = 0; i < strata.size(); i++){
                    if (mock.get(0).equals(strata.get(i).get(0))){
                        strata.get(i).add(Integer.parseInt(frame.get(in)+""));
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
            
            
            for (int j = 0; j < strata.size(); j++){
            Simple samplee = new Simple((int) ceil((sample/100)*strata.get(j).size()), strata.get(j));
            samplee.SimpleSamp(); //Recycles the simple random sampling function
            for(Object d: samplee.samples){
                samples.add("  [Strata "+j+"]:"+d+"  ");
                System.out.println("NISULD DIRI");
            }
        }
      return samples;      
    }
}
