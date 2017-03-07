import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prelim {

    public Prelim(){}

    public List Start(){

        BufferedReader br = null;
        List<Integer> frame = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        Integer mode = 0, size = 0;
        Display print = new Display(0);

        do {
            try {
                System.out.println("Mode of getting Sample Frame: [1]Manual [2]File");
                mode = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Wrong Input");
                scan.next();
            }
        } while (true);


        if (mode == 1) { //Manual Input
            do {
                try {
                    System.out.println("Input Population Size:");
                    size = scan.nextInt();

                    break;
                } catch (Exception e) {
                    System.out.println("Wrong Input");
                    scan.next();
                }
            } while (true);


            System.out.println("Input Sampling Frame (number per Enter):");
            for (int i = 0; i < size; ) {
                try {
                    frame.add(scan.nextInt());
                    i++;
                } catch (Exception e) {
                    System.out.println("Numbers Only");
                    scan.next();
                }
            }
            scan.nextLine();
            print.Print(frame,frame);
            scan.nextLine();

        } else if (mode == 2) { //when File is needed
            try {

                String sCurrentLine;
                br = new BufferedReader(new FileReader("Data.txt")); //Adds data to sample frame list
                while ((sCurrentLine = br.readLine()) != null) {
                    size++;
                    frame.add(Integer.parseInt(sCurrentLine));
                }
                scan.nextLine();
                print.Print(frame,frame);
                scan.nextLine();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null) br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return frame;
    }
}
