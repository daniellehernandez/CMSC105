package statisticsintegration;


import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Danielle98
 */
public class StatisticsLabro extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public StatisticsLabro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        popupMenu1 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        Categorical = new javax.swing.JRadioButton();
        Numerical = new javax.swing.JRadioButton();
        Desc = new javax.swing.JTextField();
        ok1 = new javax.swing.JButton();
        Size = new javax.swing.JTextField();
        ok2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Desc2 = new javax.swing.JLabel();
        Warnings = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        total = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        collapse = new javax.swing.JCheckBox();
        Chart = new javax.swing.JCheckBox();

        popupMenu1.setLabel("popupMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Summarizing and Presenting Data");

        Categorical.setText("Categorical");
        Categorical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoricalActionPerformed(evt);
            }
        });

        Numerical.setText("Numerical");

        ok1.setText("OK");
        ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ActionPerformed(evt);
            }
        });

        Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeActionPerformed(evt);
            }
        });

        ok2.setText("OK");
        ok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Description:");

        jLabel4.setText("Size:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jButton1.setText("GENERATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(total);

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        collapse.setText("COLLAPSE");

        Chart.setText("CHART");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ok1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Categorical)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ok2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Size))
                                    .addComponent(jLabel4)
                                    .addComponent(Numerical))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(Desc2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Chart)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(collapse)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jButton2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton1)))))))))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(Warnings, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(Desc2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(collapse)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Chart)
                        .addGap(207, 207, 207))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Categorical)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Numerical)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ok2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Warnings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void SizeActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void CategoricalActionPerformed(java.awt.event.ActionEvent evt) {                                            
    
    }                                           

    private void ok2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
       Integer size = 0;
        try{
        size = Integer.parseInt(Size.getText()); } catch(Exception e){Warnings.setText("Invalid size");}
        Warnings.setText("");
        if(Categorical.isSelected() == true && Numerical.isSelected() == false){
            String header[] = {"Values", "Percetage"};
             DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
             dtm.setRowCount(size);
             dtm.setColumnCount(2);
             
            for(int i=0;i<jTable1.getColumnCount();i++){
                TableColumn column1 = jTable1.getTableHeader().getColumnModel().getColumn(i);
                column1.setHeaderValue(header[i]);
            } 
    }                                   
        else if(Numerical.isSelected() == true && Categorical.isSelected() == false){
            String header[] = {"VAL","CL", "True CL","MP","FQ","%","CF","C%"};
             DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
             dtm.setRowCount(size);
             dtm.setColumnCount(8);
             
            for(int i=0;i<jTable1.getColumnCount();i++){
                TableColumn column1 = jTable1.getTableHeader().getColumnModel().getColumn(i);
                column1.setHeaderValue(header[i]);
            } 
    } else {
      Warnings.setText("Select one operation");
    }       
  }
    private void ok1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        Desc2.setText(Desc.getText());
    }                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    List<String> Temp = new ArrayList<String>();
    List<String> check = new ArrayList<String>();
    List<Double> fnl  = new ArrayList<>();
    List<String> frame = new ArrayList<String>();
    List<Double> frame2 = new ArrayList<Double>();
    List<Double> limitLeft = new ArrayList<>();
    List<Double> limitRight = new ArrayList<>();
    List<Double> trueLimitLeft = new ArrayList<>();
    List<Double> trueLimitRight = new ArrayList<>();
    List<Double> midpoint = new ArrayList<>();
    List<Integer> frequency = new ArrayList<>();
    List<Double> percent = new ArrayList<>();
    List<Integer> cf = new ArrayList<>();
    List<Double> cp = new ArrayList<>();
 
    
    
    
   
    Integer freq = 0;
    Double freqtot = 0.0;
    
         if(Categorical.isSelected() == true && Numerical.isSelected() == false ){
           for(int i=0;i<jTable1.getRowCount();i++){
              frame.add((String) jTable1.getModel().getValueAt(i, 0)); 
            }
         Collections.sort(frame);   
              
        Integer size = frame.size();      
        System.out.println(size);
        for(Object b: frame) {
            String c = b +"";
            Temp.add(c);
        }
        
          for (int i = 0; i < jTable1.getRowCount(); i++){
              for(int j = 0; j < jTable1.getColumnCount(); j++) {
                  jTable1.setValueAt("", i, j);
              }
           }
            
        int ct = 0;
        for(Object z: frame){
            String a =  z+"";
            System.out.print(check.contains(a));
            if(!(check.contains(a))) {
                for(int i = 0; i < Temp.size();i++){
                    if(a.equals(Temp.get(i))){
                        freq++;
                    }
                }
                Double freque = (((freq+.0)/size)*100);
                fnl.add(freque);
                freqtot += freque;
                jTable1.getModel().setValueAt(a,ct,0);
                jTable1.getModel().setValueAt(String.format("%1.1f", freque)+"%",ct,1);
                ct++;
                freq = 0;
                
                check.add(a);
            }
        total.setText("Total :"+ String.format("%1.1f", freqtot));
        }
        
//        if(Chart.isSelected() == true ){
//           DefaultPieDataset chart = new DefaultPieDataset();
//           
//            int h = 0; 
//            for(Double z: fnl){
//                 chart.setValue(frame.get(h)+"", new Double(z));
//            } 
//            JFreeChart mychart = ChartFactory.createPieChart("Pie Chart", chart, true,true,true);
//            PiePlot p = (PiePlot) mychart.getPlot();
//            ChartFrame charteuFrame = new ChartFrame("Pie Chart", mychart);
//            charteuFrame.setVisible(true);
//            charteuFrame.setSize(450,500);
//        }
        
    } else if(Numerical.isSelected() == true && Categorical.isSelected() == false){
        
         for(int i=0;i<jTable1.getRowCount();){
                   double d = Double.parseDouble((String)jTable1.getModel().getValueAt(i, 0));
                   frame2.add(d); 
                   i++; 
            }
//        for (int i = 0; i < jTable1.getRowCount(); i++){
//              for(int j = 0; j < jTable1.getColumnCount(); j++) {
//                  jTable1.setValueAt("", i, j);
//              }
//           }
          
         double max = 0;
         double min = frame2.get(0);
            for(int j = 0; j < frame2.size(); j++){
                System.out.print("Sulod");
                if (max < frame2.get(j)){
                    max = frame2.get(j);
                }
                if (min > frame2.get(j)){
                    min = frame2.get(j);
                }
            }
            
            System.out.print(frame2);
            double range = max - min;
            double k = Math.ceil(1 + 3.322*Math.log(frame2.size()));
            int width = (int)Math.ceil(range/k);

            System.out.println("char:   "+max+" "+ min+ " "+ range+ " " + k +" width: "+width);
            double limit = min;
            while (limit < max){
                limitLeft.add(limit);
                limit += width;
            }

            for (int j = 0; j < limitLeft.size(); j++){
                System.out.print(limitLeft.get(j)+ " ");
            }

            double limit2 = min + width - 1;
            while (limit2 <= max){
                limitRight.add(limit2);
                limit2 += width;
            }

            if (limitRight.get(limitRight.size()-1) != max){
                limitRight.add(max);
            }

            System.out.println();
            for (int j = 0; j < limitRight.size(); j++){
                System.out.print(limitRight.get(j)+ " ");
            }

            //true limit
            for (int j = 0; j < limitLeft.size(); j++){
                trueLimitLeft.add(limitLeft.get(j) - 0.5);
            }

            System.out.println();
            for (int j = 0; j < trueLimitLeft.size(); j++){
                System.out.print(trueLimitLeft.get(j)+ " ");
            }

            for (int j = 0; j < limitRight.size(); j++){
                trueLimitRight.add(limitRight.get(j) + 0.5);
            }

            System.out.println();
            for (int j = 0; j < trueLimitRight.size(); j++){
                System.out.print(trueLimitRight.get(j)+ " ");
            }

            //midpoint
            for (int j = 0; j < limitLeft.size(); j++){
                midpoint.add((limitLeft.get(j) + limitRight.get(j))/2);
            }

            System.out.println();
            for (int j = 0; j < midpoint.size(); j++){
                System.out.print(midpoint.get(j)+ " ");
            }

            //frequency
            for (int j = 0; j < limitLeft.size(); j++){
                int count = 0;
                for (int m = 0; m < frame2.size(); m++){
                    if (frame2.get(m) >= limitLeft.get(j) && frame2.get(m) <= limitRight.get(j)){
                        count++;
                    }
                }
                frequency.add(count);
            }

            System.out.println();
            for (int j = 0; j < frequency.size(); j++){
                System.out.print(frequency.get(j)+ " ");
            }

            //percent
            for (int j = 0; j < frequency.size(); j++){
                double pp = (double)((frequency.get(j)*100)/frame2.size());
                percent.add(pp);
            }

            System.out.println();
            for (int j = 0; j < percent.size(); j++){
                System.out.print(percent.get(j)+ " ");
            }


            int cff = 0;
            for (int j = 0; j < frequency.size(); j++){
                cff += frequency.get(j);
                cf.add(cff);
            }

            System.out.println();
            for (int j = 0; j < cf.size(); j++){
                System.out.print(cf.get(j)+ " ");
            }

            double cpp = 0;
            for (int j = 0; j < percent.size(); j++){
                cpp += percent.get(j);
                cp.add(cpp);
            }

            System.out.println();

            for (int j = 0; j < cp.size(); j++){
                System.out.print(cp.get(j)+ " ");
            }
            
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(limitLeft.size());
            
            int ct = 0;   
            if(collapse.isSelected() == true){
                for (int j = 0; j < limitLeft.size(); j++){
                if(ct == 0){
                 jTable1.getModel().setValueAt("< "+limitRight.get(j),ct,1);
                } else if (ct == limitLeft.size()-1){
                  jTable1.getModel().setValueAt("> "+limitLeft.get(j),ct,1);
                } else {
                    jTable1.getModel().setValueAt(limitLeft.get(j) +"-"+limitRight.get(j),ct,1);
                }
                jTable1.getModel().setValueAt(trueLimitLeft.get(j)+"-"+trueLimitRight.get(j),ct,2);
                jTable1.getModel().setValueAt("-",ct,3);
                jTable1.getModel().setValueAt(frequency.get(j),ct,4);
                jTable1.getModel().setValueAt(percent.get(j),ct,5);
                jTable1.getModel().setValueAt(cf.get(j),ct,6);
                jTable1.getModel().setValueAt(cp.get(j),ct,7);
                ct++;
//                System.out.print(limitLeft.get(j)+"-"+limitRight.get(j)+"\t"+trueLimitLeft.get(j)+"-"+trueLimitRight.get(j)
//                        + "\t"+midpoint.get(j)+"\t"+frequency.get(j)+"\t"+percent.get(j)+"\t"+cf.get(j)+"\t"+cp.get(j)+"\n");
            }
                
            } else {
            for (int j = 0; j < limitLeft.size(); j++){
               
                jTable1.getModel().setValueAt(limitLeft.get(j) +"-"+limitRight.get(j),ct,1);
                jTable1.getModel().setValueAt(trueLimitLeft.get(j)+"-"+trueLimitRight.get(j),ct,2);
                jTable1.getModel().setValueAt(midpoint.get(j),ct,3);
                jTable1.getModel().setValueAt(frequency.get(j),ct,4);
                jTable1.getModel().setValueAt(percent.get(j),ct,5);
                jTable1.getModel().setValueAt(cf.get(j),ct,6);
                jTable1.getModel().setValueAt(cp.get(j),ct,7);
                ct++;
//                System.out.print(limitLeft.get(j)+"-"+limitRight.get(j)+"\t"+trueLimitLeft.get(j)+"-"+trueLimitRight.get(j)
//                        + "\t"+midpoint.get(j)+"\t"+frequency.get(j)+"\t"+percent.get(j)+"\t"+cf.get(j)+"\t"+cp.get(j)+"\n");
            }
            }
            
         
        
            
    }   
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        for (int i = 0; i < jTable1.getRowCount(); i++){
              for(int j = 0; j < jTable1.getColumnCount(); j++) {
                  jTable1.setValueAt("", i, j);
              }
           }
        total.setText("");
        Warnings.setText("");
    }                                        


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton Categorical;
    private javax.swing.JCheckBox Chart;
    private javax.swing.JTextField Desc;
    private javax.swing.JLabel Desc2;
    private javax.swing.JRadioButton Numerical;
    private javax.swing.JTextField Size;
    private javax.swing.JTextField Warnings;
    private javax.swing.JCheckBox collapse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton ok1;
    private javax.swing.JButton ok2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextPane total;
    // End of variables declaration                   
}
