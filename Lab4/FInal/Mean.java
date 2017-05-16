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
public class Mean {

    public double meanUngrouped(ArrayList<Double> list, ArrayList<Integer> list2, Integer type){
        double total = 0;
        if(type == 2){
            for (int i = 0; i < list.size(); i++) {
                total += (Double)list.get(i);
            }
            return total / list.size();
        } else if (type == 1) {
            for (int i = 0; i < list2.size(); i++) {
                total += (int)list2.get(i);
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
//            for (int i = 0; i < list.size(); i++) {
//                total = total + ((list.get(i) - mean) * (list.get(i) - mean));
//            }
            s = Math.sqrt(ugVar(list,list2,type));
            return s;
        } else if(type == 1){
//            for (int i = 0; i < list2.size(); i++) {
//                total = total + ((list2.get(i) - mean) * (list2.get(i) - mean));
//            }
            s = Math.sqrt(ugVar(list,list2,type));
            return s;

        }

        return s;
    }

    public double ugVar (ArrayList<Double> list, ArrayList<Integer> list2, Integer type){
        double mean = meanUngrouped(list,list2,type);
        double total = 0;
        double s = 0;

        if(type == 2) {
            for (int i = 0; i < list.size(); i++) {
                total = total + ((list.get(i) - mean) * (list.get(i) - mean));
            }
            s = total / (list.size() - 1);
            return s;
        } else if(type == 1){
            for (int i = 0; i < list2.size(); i++) {
                total = total + ((list2.get(i) - mean) * (list2.get(i) - mean));
            }
            s = total / (list2.size() - 1);
            return s;

        }

        return s;
    }

    public double meanGrouped (ArrayList fx, ArrayList frequency){
        double total1 = 0;
        double total2 = 0;

        for (int i = 0; i < fx.size();i++){
            total1 += Double.parseDouble(fx.get(i).toString());
        }

        for (int i = 0; i < frequency.size();i++){
            total2 += Double.parseDouble(frequency.get(i).toString());
        }
        return total1/total2;
    }

    public double gStandardDev(ArrayList frequency, ArrayList fx, ArrayList fx2){
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        double s;

//        for (int i = 0; i < fx.size();i++){
//            total1 += Double.parseDouble(fx.get(i).toString());
//        }
//
//        for (int i = 0; i < frequency.size();i++){
//            total2 += Double.parseDouble(frequency.get(i).toString());
//        }
//
//        for (int i = 0; i < fx2.size();i++){
//            total3 += Double.parseDouble(fx2.get(i).toString());
//        }
//
//        s = Math.sqrt(((total2*total3) - (total1*total1))/(total2*(total2-1)));

         s = Math.sqrt(gVar(frequency,fx,fx2));

         return  s;
    }

    public double gVar(ArrayList frequency, ArrayList fx, ArrayList fx2){
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        double s;

        for (int i = 0; i < fx.size();i++){
            total1 += Double.parseDouble(fx.get(i).toString());
        }

        for (int i = 0; i < frequency.size();i++){
            total2 += Double.parseDouble(frequency.get(i).toString());
        }

        for (int i = 0; i < fx2.size();i++){
            total3 += Double.parseDouble(fx2.get(i).toString());
        }

        s = (((total2*total3) - (total1*total1))/(total2*(total2-1)));

        return  s;
    }
}