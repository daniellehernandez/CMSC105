/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsintegration;
import java.util.ArrayList;
/**
 *
 * @author Danielle98
 */
public class Mode {
    public ArrayList getmode(ArrayList<Double> list, ArrayList<Integer> list2, Integer type) {
        ArrayList modes = new ArrayList();
        double mode = 0.0;
        if(type == 2){
            mode = list.get(0)+0.0;
            int maxCount = 0;

            for (int i = 0; i < list.size(); i++) {
                double value = list.get(i);
                int count = 1;
                for (int j = 0; j < list2.size(); j++) {
                    if (list.get(j) == value) count++;
                    if (count > maxCount) {
                        mode = value;
                        maxCount = count;
                    }

                }

                if(count == maxCount && count > 2){
                    if(!(modes.contains(list.get(i)))) {
                        modes.add(list.get(i));
                    }
                }

            }
            return modes;
        } else if (type == 1){
            mode = list2.get(0)+0.0;
            int maxCount = 0;

            for (int i = 0; i < list2.size(); i++) {
                double value = list2.get(i);
                int count = 1;
                for (int j = 0; j < list2.size(); j++) {
                    if (list2.get(j) == value) count++;
                    if (count > maxCount) {
                        mode = value;
                        maxCount = count;
                    }

                }

                if(count == maxCount && count > 2){
                    if(!(modes.contains(list2.get(i)))) {
                        modes.add(list2.get(i));
                    }
                }

            }
            return modes;
        }

        return modes;
    }

    public ArrayList modeGroup (ArrayList frequency){
        double max = 0;
        ArrayList<Integer> modes = new ArrayList<>();
        for (int i = 0; i < frequency.size(); i++){
            if (Double.parseDouble(frequency.get(i).toString()) > max){
                max = Double.parseDouble(frequency.get(i).toString());
            }
        }

        if (max > 1){
            for (int i = 0; i < frequency.size(); i++){
                if (Double.parseDouble(frequency.get(i).toString()) == max){
                    modes.add(i);
                }
            }
        }

        return modes;
    }
}
