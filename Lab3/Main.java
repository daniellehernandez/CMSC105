import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Winnah Gwen Acal on 4/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> Doubleframe = new ArrayList<>();
        ArrayList<Integer> Integerframe = new ArrayList<>();
        int inSize;
        int CI;
        List<Double> lowerCL = new ArrayList<>();
        List<Double> upperCL = new ArrayList<>();
        List<Double> frequency = new ArrayList<>();
        Mean mean = new Mean();
        Median median = new Median();
        Mode mode = new Mode();

        System.out.println("\t\tMENU\n\t[1] Ungrouped Data \n\t[2] Grouped Data \n\t[3] Quit");
        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();


        if (choice == 1){
            do {
                try {
                    System.out.println("Input Size:");
                    inSize = scan.nextInt();

                    break;
                }
                catch (Exception e) {
                    System.out.println("Wrong Input");
                    scan.next();
                }
            } while (true);

            System.out.print("Table Description: ");
            String desc = scan.next();

            System.out.println("Data Type: [1] Integer [2] Decimal");
            int type = scan.nextInt();

            System.out.println("\nInput Sampling Frame: ");
            for (int i = 0; i < inSize;) {
                try{

                    if(type == 1) {
                        System.out.print("[" + (i + 1) + "] ");
                        Integer z = scan.nextInt();
                        if(z instanceof Integer) {
                            Integerframe.add(z);
                            i++;
                        } else {
                            System.out.println("Not Integer");
                        }
                    } else if(type == 2){
                        System.out.print("[" + (i + 1) + "] ");
                        Double z = scan.nextDouble();
                        if(z instanceof Double) {
                            Doubleframe.add(z);
                            i++;
                        } else {
                            System.out.println("Not Decimal");
                        }
                    }

                }catch(Exception e){
                    System.out.println("Invalid");
                    scan.next();
                }
            }

            System.out.println("\n\n[1] Continue [2] Edit");
            int choice2 = scan.nextInt();
            while (choice2 == 2){
                System.out.println("Input the index: ");
                int inde = scan.nextInt();
                System.out.println("Input the replacement value: ");
                double val = scan.nextDouble();
                if(type == 1){
                    Integerframe.set(inde-1, (int)val);
                    System.out.println(Integerframe.toString());
                }
                if(type == 2){
                    Doubleframe.set(inde+1, val);
                    System.out.println(Doubleframe.toString());
                }
                System.out.println("[1] Continue\n[2] Edit");
                choice2 = scan.nextInt();
            }

            System.out.println("What measures of central tendency to calculate. User’s choices are:\n" +
                    "[1] Mean\n[2] Median\n[3] Mode\n[4] all measures");
            int choice3 = scan.nextInt();

            if (choice3 == 1){
                    System.out.println("mean: " + mean.meanUngrouped(Doubleframe,Integerframe,type) + "\nstandard dev: " + mean.ugStandasrdDev(Doubleframe,Integerframe, type));
                    main(args);
            }else if (choice3 == 2){
                    System.out.println("median: " + median.medUn(Doubleframe,Integerframe,type));
                    main(args);
            }else if (choice3 == 3){

            }else if (choice3 == 4){
                    System.out.println("mean: " + mean.meanUngrouped(Doubleframe,Integerframe,type) + "\nstandard dev: " + mean.ugStandasrdDev(Doubleframe,Integerframe,type));
                    System.out.println("median: "+median.medUn(Doubleframe,Integerframe,type));
                    System.out.println("mode: "+mode.getmode(Doubleframe,Integerframe,type));
                    main(args);
            }
        }else if(choice == 2){
            do {
                try {
                    System.out.println("Input number of class intervals:");
                    CI = scan.nextInt();

                    break;
                }
                catch (Exception e) {
                    System.out.println("Wrong Input");
                    scan.next();
                }
            } while (true);

            System.out.println("Are there open-ended class?\n [1] Yes\n [2] No");
            int choice4 = scan.nextInt();

            if (choice4 == 2){
                System.out.println("Input Lower Class Limit:");
                for (int i = 0; i < CI;) {
                    try{
                        lowerCL.add(scan.nextDouble());
                        i++;
                    }catch(Exception e){
                        System.out.println("Invalid");
                        scan.next();
                    }
                }

                System.out.println("Input Upper Class Limit: ");
                for (int i = 0; i < CI;) {
                    try{
                        upperCL.add(scan.nextDouble());
                        i++;
                    }catch(Exception e){
                        System.out.println("Invalid");
                        scan.next();
                    }
                }

                System.out.println("Input Frequency column: ");
                for (int i = 0; i < CI;) {
                    try{
                        frequency.add(scan.nextDouble());
                        i++;
                    }catch(Exception e){
                        System.out.println("Invalid");
                        scan.next();
                    }
                }

                System.out.println("[1] Continue\n[2] Edit");
                int choice5 = scan.nextInt();
                if (choice5 == 2){

                }


            }
        }else if(choice ==3){
            System.exit(0);
        }
    }
}