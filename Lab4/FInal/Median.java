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
public class Median {

    public double medUn(ArrayList<Double> list, ArrayList<Integer> list2, Integer type) {
        double med = 0.0;
        double temp;

        if (type == 2) {
                
            int sz = ((list.size()+1)/ 2)-1;
            for (int j = 0; j < list.size(); j++) {
                for (int i = 0; i < list.size() - 1; i++) {
                    if ((Double)list.get(i) > (Double)list.get(i + 1)) {
                        temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                    }
                }
            }

            if (list.size() % 2 == 0) {
                med = (list.get((list.size() / 2) - 1) + list.get(((list.size() + 2) / 2) - 1)) / 2;
            } else {
                med = list.get(sz);
            }
            return med;
        } else if (type == 1){
            int sz = ((list2.size()+1)/ 2);
            for (int j = 0; j < list2.size(); j++) {
                for (int i = 0; i < list2.size() - 1; i++) {
                    if (list2.get(i) > list2.get(i + 1)) {
                        temp = list2.get(i);
                        list2.set(i, list2.get(i + 1));
                        list2.set(i + 1, (int) temp);
                    }
                }
            }

            if (list2.size() % 2 == 0) {
                med = (list2.get((list2.size() / 2) - 1) + list2.get(((list2.size() + 2) / 2) - 1)) / 2; //edit ni
            } else {
                med = list2.get(sz-1);
            }
            return med;

        }

        return med;
    }

    public double range(ArrayList<Double> list, ArrayList<Integer> list2, Integer type){
        double temp;

        if (type == 2) {
            for (int j = 0; j < list.size(); j++) {
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i) > list.get(i + 1)) {
                        temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                    }
                }
            }
            return  list.get(list.size()-1) - list.get(0);
        } else if (type == 1){
            for (int j = 0; j < list2.size(); j++) {
                for (int i = 0; i < list2.size() - 1; i++) {
                    if (list2.get(i) > list2.get(i + 1)) {
                        temp = list2.get(i);
                        list2.set(i, list2.get(i + 1));
                        list2.set(i + 1, (int) temp);
                    }
                }
            }
        }
        return list2.get(list2.size()-1) - list2.get(0);
    }
}
