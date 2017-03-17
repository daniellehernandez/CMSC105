import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Prelim {

    public Prelim(){}

    public List Start(){
        List<Object> frame = new ArrayList<Object>();
        Scanner scan = new Scanner(System.in);
        Integer ch = -1;
        Integer size = 0;

        while (size <= 0) {
            try {
                System.out.println("Size of Inputs:");
                size = scan.nextInt();
            } catch (Exception e) {scan.nextLine();}
        }
        while(ch < 0 || ch > 3){
            try {
                System.out.println("Type of Data: [1] Strings/Characters [2] Integer [3] Floating ");
                ch = scan.nextInt();
            } catch (Exception e){scan.nextLine();}
        }


        if(ch == 1) {
            for (int i = 1; i <= size;) {
                try {
                    System.out.print(i + ". ");
                    String a = scan.next(); //Needs Checking
                    frame.add(a);
                    i++;
                } catch (Exception e){
                    System.out.println("Only Strings/Characters allowed");
                    scan.nextLine();
                }
            }
        } else if (ch == 2){
            for (int i = 1; i <= size;) {
                try {
                    System.out.print(i + ". ");
                    Object a = scan.nextInt();
                    frame.add(a);
                    i++;
                } catch (Exception e){
                    System.out.println("Only Integers allowed");
                    scan.nextLine();
                }
            }
        } else if (ch == 3){
            for (int i = 1; i <= size;) {
                try {
                    System.out.print(i + ". ");
                    Object a = scan.nextDouble();
                    frame.add(a);
                    i++;
                } catch (Exception e){
                    System.out.println("Only Floating numbers allowed");
                    scan.nextLine();
                }
            }
        }
    return  frame;
    }
}
