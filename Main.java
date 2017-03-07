/**
 * Created by Hernandez && Acal
 */

/**Control center of the program**/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("\t\tMENU\n\t[1] Simple Random Sampling\n\t[2] Systematic Sampling\n\t[3] Stratified Sampling\n\t[4] Quit");
        List<Integer> frame = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        Integer size = 0;
        Double sample = 0.0;

        Prelim start = new Prelim(); //redirect to the function that makes you choose which operation
        Method choose = new Method(); // function that asks for the sample percentage
        Display print = new Display(0); // display

        if(choice == 4){System.exit(0);} else if(choice > 4 || choice == 0){ main(args);} //Exit

        frame = start.Start();
        size = frame.size();

        if (choice == 1) {
            System.out.println("\t\tSimple Random Sampling");

            sample = choose.Choose(size);
            Simple samplee = new Simple(sample, frame);
            samplee.SimpleSamp();
            scan.nextLine();
            print.PrintFunc(samplee.samples, frame);
            scan.nextLine();
            main(args);


        } else if (choice == 2) {
            System.out.println("\t\tSystematic Sampling");

            sample = choose.Choose(size);
            Systematic system = new Systematic(sample,size,frame);
            system.SystematicSamp();
            scan.nextLine();
            print.PrintFunc(system.samples, frame);
            scan.nextLine();
            main(args);


        } else if (choice == 3) {
            System.out.println("\t\tStratified Sampling");
            Stratified strats = new Stratified(sample,frame);
            strats.StratifiedSamp();
            scan.nextLine();
            print.PrintFunc(strats.samples, frame);
            scan.nextLine();
            main(args);

        }


    }


}