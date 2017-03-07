///*
// * ACAL & HERNANDEZ
// */
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.*;
//
//public class AcalHernandez {
//
//    public static void main(String[] args) {
//        BufferedReader br = null;
//
//        System.out.println("\t\tMENU\n\t[1] Simple Random Sampling\n\t[2] Systematic Sampling\n\t[3] Stratified Sampling\n\t[4] Quit");
//        List<Integer> frame = new ArrayList<Integer>();
//        List<Integer> samples = new ArrayList<Integer>();
//        Random rands = new Random();
//
//
//        Scanner scan = new Scanner(System.in);
//        Integer choice = scan.nextInt();
//        Integer mode = 0, size = 0;
//
//        System.out.println("Mode of getting Sample Frame: [1]Manual [2]File");
//        mode = scan.nextInt();
//        if(mode == 1) {
//            System.out.println("Input Population Size:");
//            size = scan.nextInt();
//
//            System.out.println("Input Sampling Frame (number per Enter):");
//            for (int i = 0; i < size; i++) {
//                frame.add(scan.nextInt());
//            }
//            for (int z = 0; z < frame.size(); z++) {
//                System.out.println("[" + z + "] =" + frame.get(z));
//            }
//
//        } else if(mode == 2){
//            try {
//
//                String sCurrentLine;
//                br = new BufferedReader(new FileReader("Data.txt")); //Adds data to sample frame list
//                while ((sCurrentLine = br.readLine()) != null) {
//                    size++;
//                    frame.add(Integer.parseInt(sCurrentLine));
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (br != null) br.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//
//        if(choice == 1){
//            Integer count = 0;
//            System.out.println("\t\tSimple Random");
//
//
//            System.out.println("\nMethod of choosing a sample size\n[1]Default & [2]Input");
//            Integer ch = 0;
//            do{ch = scan.nextInt();}while(ch != 1 && ch != 2);
//            Double sample = 0.0;
//            if(ch == 2) {
//                while (sample == 0 || sample >= size) {
//                    System.out.println("Input Sample Size:");
//                    sample = scan.nextDouble();
//                }
//            } else {
//                Double secSize = (double)size*.2;
//                sample = Math.ceil(secSize);
//            }
//
//            for(int i = 0; samples.size() != sample; i++){
//                Boolean exist = false;
//                int  rand = rands.nextInt(frame.size()-1) + 1;
//                for(Integer z : samples) {if(z == frame.get(rand)) {exist = true;}}
//                if(!exist)samples.add(frame.get(rand));
//            }
//
//            for(Integer b: samples){
//                System.out.println("[" + frame.indexOf(b) +"]\t" + b);
//            }
//
//            main(args);
//
//
//        }else if(choice == 2){
//
//            System.out.println("\nMethod of choosing a sample size\n[1]Default & [2]Input");
//            Integer ch = 0;
//            do{ch = scan.nextInt();}while(ch != 1 && ch != 2);
//            Double sample = 0.0;
//            if(ch == 2) {
//                while (sample == 0 || sample == 1 || sample >= size) {
//                    System.out.println("Input Sample Size:");
//                    sample = scan.nextDouble();
//                }
//            } else {
//                Double secSize = (double)size*.2;
//                sample = Math.ceil(secSize);
//            }
//
//            Double k = Math.floor(size/sample);
//            boolean exist = false;
//            Integer  rand = rands.nextInt((frame.size()-1) + 1);
//            Integer ct = 0;
//            samples.add(frame.get(rand));
//            for(int j = rand; samples.size() != sample; j++,ct++){
//                if((ct+.0) == k){
//                    for(Integer z : samples) {
//                        if(z == frame.get(j)) {exist = true;}}
//                    if(!exist){samples.add(frame.get(j));}
//                    ct = 0;
//                }
//                if(j >= size-1){ j = -1;}
//
//            }
//
//            for(Integer b: samples){
//                System.out.println("[" + frame.indexOf(b) +"]\t" + b);
//            }
//
//            main(args);
//
//
//        }else if(choice == 3){
//            List<LinkedList> ListOfAll = new ArrayList<LinkedList>();
//
//
//        }else {
//            System.exit(0);
//        }
//
//
//    }
//
//
//}