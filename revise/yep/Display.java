import java.util.List;

public class Display {

    private Integer randoms;

    public Display(Integer randoms){
        this.randoms = randoms;
    }

    public void Print(List<Integer> samples, List<Integer> frame){
        Integer ct = 0, index = 0;
        for(Integer b: samples){ //Print function for the population
            if(ct == 5){ //Designed to make another row when the counter hits 5
                System.out.println("\n");
                ct = 0;
            }
            System.out.print("  [Index " + index +"]:" + b + "  ");
            ct++;
            index++;
        }
        System.out.print("\n\n");
    }

    public void PrintFunc(List<String> samples, List<Integer> frame){ //Print function for the operations
        Integer ct = 0;
        for(String b: samples){
            if(ct == 5){ //Designed to make another row when the counter hits 5
                System.out.println("\n");
                ct = 0;
            }
            System.out.print(b);
            ct++;
        }
        System.out.print("\n\n");
    }


}
