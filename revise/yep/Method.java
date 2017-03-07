import java.util.Scanner;

import static java.lang.StrictMath.ceil;

public class Method {
    Integer size;

    public Method(){}

    public Double Choose(Integer size){
        Scanner scan = new Scanner(System.in);
        Integer ch = 0;
        Double sample = 0.0;

        do {
            try { //checking
                System.out.println("\nMethod of choosing a sample size\n[1]Default & [2]Input");
                ch = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid");
                scan.next();
            }
        }while(ch != 1 && ch != 2);

        if(ch == 2) {
            while (sample == 0 || sample >= size) { //checking
                System.out.println("Input Sample Size Percentage:");
                sample = scan.nextDouble();
                sample =  ceil((sample/100)*size); //takes a percentage and converts
            }
        } else {
            Double secSize = (double)size*.2; //default option
            sample = Math.ceil(secSize);
        }
        return sample;
    }
}
