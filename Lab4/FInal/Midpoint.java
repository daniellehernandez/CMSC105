package statisticsintegration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the tutees on 4/26/2017.
 */
public class Midpoint {
    ArrayList MD = new ArrayList<>();
    ArrayList FX = new ArrayList<>();
    ArrayList FX2 = new ArrayList<>();


    ArrayList getM(ArrayList lowerCL,ArrayList upperCL){

        for(int i = 0; i < upperCL.size(); i++){
            MD.add((Double.parseDouble(lowerCL.get(i).toString())+Double.parseDouble(upperCL.get(i).toString()))/2);
        }

        return MD;
    }

    ArrayList getFX(ArrayList frequency, ArrayList Md) {
         System.out.println("\n\n["+frequency.size()+"]======");
        for (int i = 0; i < frequency.size(); i++) {
            FX.add((Double.parseDouble(frequency.get(i).toString()))*(Double.parseDouble(Md.get(i).toString())));
        }

        return FX;
    }

     ArrayList getFX2(ArrayList frequency, ArrayList Md) {
        for (int i = 0; i < frequency.size(); i++) {
            FX2.add((Double.parseDouble(frequency.get(i).toString()))*(((Double.parseDouble(Md.get(i).toString()))*(Double.parseDouble(Md.get(i).toString())))));
        }

       
        return FX2;
     }
    }