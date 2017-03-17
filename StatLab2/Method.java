import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.StrictMath.ceil;

//KUWANG UG SORTING AND OPEN ENDED

public class Method {
    Integer size;
    List<String> Temp = new ArrayList<String>();
    List<String> check = new ArrayList<String>();
    List<String> fnl  = new ArrayList<String>();
    Integer freq = 0;

    public Method(){}

    public void Summary(List frame, String Desc){
        Integer size = frame.size();

        fnl.add("Values"+"\t"+ "Frequency"+"(%)"+"\n");
        for(Object b: frame) {
            String c = b +"";
            Temp.add(c);
        }
        System.out.println(Temp);
        for(Object z: frame){
            String a =  z+"";
            if(!(check.contains(a))) {

                for(int i = 0; i < Temp.size();i++){
                    if(a.equals(Temp.get(i))){
                        freq++;
                    }
                }
                Double frequency = ((freq+.0*2)/size+.0)*100;
                fnl.add(z + "\t" + frequency + "%" + "\n");
                freq = 0;
            }

            check.add(a);
        }
        System.out.println(fnl);
    }
}
