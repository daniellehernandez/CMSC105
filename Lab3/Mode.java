import java.util.ArrayList;

/**
 * Created by the tutees on 4/24/2017.
 */
public class Mode {
    public Double getmode(ArrayList<Double> list, ArrayList<Integer> list2, Integer type) {
        double mode = 0.0;
        if(type == 2){
            mode = list.get(0);
            int maxCount = 0;
            for (int i = 0; i < list.size(); i++) {
                double value = list.get(i);
                int count = 1;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == value) count++;
                    if (count > maxCount) {
                        mode = value;
                        maxCount = count;
                    }
                }
            }
            return mode;
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
            }
            return mode;
        }

        return mode;
    }
}
