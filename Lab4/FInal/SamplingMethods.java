/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsintegration;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Danielle98
 */
public class SamplingMethods extends javax.swing.JFrame {

    /**
     * Creates new form SamplingMethods
     */
    int size; 
    boolean indi = true;
    ArrayList SampleValues = new ArrayList();  
    ArrayList SimpleRandom = new ArrayList();  
    ArrayList SystematicSamp = new ArrayList();  
    ArrayList StratifiedSamp = new ArrayList();  
    
   
    public SamplingMethods() {
        initComponents();
        SamplesBox.setEnabled(false);
        Random.setEnabled(false);
        Systematic.setEnabled(false);
        Stratified.setEnabled(false);
        proceed.setEnabled(false);
        SS.setEnabled(false);
        dd.setEnabled(false);
        Results.setEnabled(false);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Size = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        SamplesBox = new javax.swing.JTextField();
        Random = new javax.swing.JCheckBox();
        Systematic = new javax.swing.JCheckBox();
        Stratified = new javax.swing.JCheckBox();
        proceed = new javax.swing.JButton();
        SS = new javax.swing.JTextField();
        dd = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Results = new javax.swing.JTable();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BASIC SAMPLING METHODS");

        Size.setText("Size");

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        SamplesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamplesBoxActionPerformed(evt);
            }
        });

        Random.setText("Random ");

        Systematic.setText("Systematic");

        Stratified.setText("Stratified");

        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        SS.setText("Sample Size");

        dd.setText("Display Data");
        dd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddActionPerformed(evt);
            }
        });

        back1.setText("BACK");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        Results.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(Results);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(Random)
                        .addGap(18, 18, 18)
                        .addComponent(Systematic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Stratified)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(SamplesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(back1)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proceed)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(back1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok))
                .addGap(18, 18, 18)
                .addComponent(SamplesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Random)
                    .addComponent(Systematic)
                    .addComponent(Stratified)
                    .addComponent(SS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proceed)
                    .addComponent(dd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true); 
    }//GEN-LAST:event_back1ActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
          Results.setEnabled(true);
          Simple simplerand = new Simple(Integer.parseInt(SS.getText()),SampleValues);
          String header[] = {"Results", "Results","Results","Results"};
          DefaultTableModel dtm = (DefaultTableModel) Results.getModel();
          dtm.setRowCount(size);
          dtm.setColumnCount(4);
          
          
            for(int i=0;i<Results.getColumnCount();i++){
                TableColumn column1 = Results.getTableHeader().getColumnModel().getColumn(i);
                column1.setHeaderValue(header[i]);
            }
            
              for (int j = 0; j < SimpleRandom.size(); j++){
               for(int i = 0; i < 4; i++){
                   Results.getModel().setValueAt("",j,i);
               }
           }
                    
        if(Random.isSelected() && !Systematic.isSelected() && !Stratified.isSelected()){
           SimpleRandom = simplerand.SimpleSamp();
           //System.out.print(SimpleRandom);
           
           int ct = 0;
           for (int j = 0; j < SimpleRandom.size(); j++){
               for(int i = 0; i < 4; i++){
                   if(ct < SimpleRandom.size()){
                   Results.getModel().setValueAt(SimpleRandom.get(ct),j,i);
                   ct++;
                   }
               }
           }

        }
        
        if(!Random.isSelected() && Systematic.isSelected() && !Stratified.isSelected()){
            SystematicSamp = simplerand.Systematic();
            
                
           int ct = 0;
           for (int j = 0; j < SystematicSamp.size(); j++){
               for(int i = 0; i < 4; i++){
                   if(ct < SystematicSamp.size()){
                   Results.getModel().setValueAt(SystematicSamp.get(ct),j,i);
                   ct++;
                   }
                }
           }
        }
        
        if(!Random.isSelected() && !Systematic.isSelected() && Stratified.isSelected()){
             StratifiedSamp = simplerand.StratifiedSamp();
            
                
           int ct = 0;
           for (int j = 0; j < StratifiedSamp.size(); j++){
               for(int i = 0; i < 4; i++){
                   if(ct < StratifiedSamp.size()){
                   Results.getModel().setValueAt(StratifiedSamp.get(ct),j,i);
                   ct++;
                  }
                }
           }     
        }
        
    }//GEN-LAST:event_proceedActionPerformed

    private void SamplesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamplesBoxActionPerformed
      Size.setEnabled(false);
      ok.setEnabled(false);
      
      try{ 
         int z = Integer.valueOf(SamplesBox.getText()); 
         indi = false;
      } catch(Exception e){ 
      }
          if(!indi){
                try{
                 int z = Integer.parseInt(SamplesBox.getText());  
                 SampleValues.add(z);
                 SamplesBox.setText("");
                } catch (Exception e){

                }
            } 
          
            if (indi) {
               SampleValues.add(SamplesBox.getText());
               SamplesBox.setText("");
            }
          
      System.out.print(SampleValues);
      
      if(SampleValues.size() == size){
          SamplesBox.setEnabled(false);
          Random.setEnabled(true);
          Systematic.setEnabled(true);
          Stratified.setEnabled(true);
          proceed.setEnabled(true);
          SS.setEnabled(true);
          dd.setEnabled(true);
          Results.setEnabled(true);
      }
    }//GEN-LAST:event_SamplesBoxActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
      size = 0;
      
      System.out.print("Dan" + Size.getText());
        try{  
            size = Integer.valueOf(Size.getText());
       } catch(Exception e){}
        
      if(size > 0){  
              SamplesBox.setEnabled(true);
      }
    }//GEN-LAST:event_okActionPerformed

    private void ddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddActionPerformed

        Display dis = new Display();
        SampleValues = dis.disp3(SampleValues);
        dis.setVisible(true); 
    }//GEN-LAST:event_ddActionPerformed

    /**
     * @param args the command line arguments
     */
    

      
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
            java.util.logging.Logger.getLogger(SamplingMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SamplingMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SamplingMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SamplingMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SamplingMethods().setVisible(true);
                  
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Random;
    private javax.swing.JTable Results;
    private javax.swing.JTextField SS;
    private javax.swing.JTextField SamplesBox;
    private javax.swing.JTextField Size;
    private javax.swing.JCheckBox Stratified;
    private javax.swing.JCheckBox Systematic;
    private javax.swing.JButton back1;
    private javax.swing.JButton dd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton ok;
    private javax.swing.JButton proceed;
    // End of variables declaration//GEN-END:variables
}


