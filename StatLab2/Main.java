/**
 * Created by Hernandez && Acal
 */

/**Control center of the program**/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer choice = 0;
        Scanner scan = new Scanner(System.in);
        List<Object> frame = new ArrayList<Object>();

        try {
            System.out.println("\t\tSummarizing and Presenting Data\n\t[1] Categorical\n\t[2] Numerical\n\t[3] Quit");
            choice = scan.nextInt();
        }catch (Exception e){main(args);}

        Prelim start = new Prelim();
        Method SummaryTable = new Method();
        //Display print = new Display(0); // display

        if(choice == 3){System.exit(0);} else if(choice > 3 || choice == 0){ main(args);} //Exit

        System.out.println("Enter Description for your table: ");
        String Desc = scan.next();

        if (choice == 1) {
            System.out.println("\t\tCategorical");

            frame = start.Start();
            SummaryTable.Summary(frame,Desc);
            scan.nextLine();
            main(args);


        } else if (choice == 2) {
            System.out.println("\t\tNumerical");

            scan.nextLine();
            main(args);


        }


    }


}