import java.util.ArrayList;
import java.util.List;

/**
 * Created by Winnah Gwen Acal on 4/21/2017.
 */
public class Mean {

    public double meanUngrouped(ArrayList<Double> list, ArrayList<Integer> list2, Integer type){
        double total = 0;
        if(type == 2){
            for (int i = 0; i < list.size(); i++) {
                total += list.get(i);
            }
            return total / list.size();
        } else if (type == 1) {
            for (int i = 0; i < list2.size(); i++) {
                total += list2.get(i);
            }
            return total / list2.size();
        }

        return total;
    }

    public double ugStandasrdDev (ArrayList<Double> list, ArrayList<Integer> list2, Integer type){
        double mean = meanUngrouped(list,list2,type);
        double total = 0;
        double s = 0;

        if(type == 2) {
            for (int i = 0; i < list.size(); i++) {
                total += Math.pow((list.get(i) - mean), 2);
            }
            s = Math.sqrt(total / list.size() - 1);
            return s;
        } else if(type == 1){
            for (int i = 0; i < list2.size(); i++) {
                total += Math.pow((list2.get(i) - mean), 2);
            }
            s = Math.sqrt(total / list2.size() - 1);
            return s;

        }

        return s;
    }
}