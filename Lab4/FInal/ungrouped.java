/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsintegration;

import java.util.ArrayList;

/**
 *
 * @author Danielle98
 */
public class ungrouped extends javax.swing.JFrame {

    /**
     * Creates new form ungrouped
     */
    String titlefn;
    int size;
    boolean indi = true;
    int type = 0;
    ArrayList SampleValues = new ArrayList();
    Mean meany = new Mean();
    Median mediany = new Median();
    Mode modey = new Mode();
    
    public ungrouped() {
        initComponents();
        SamplesBox.setEnabled(false);
        Size.setEnabled(false);
        ok.setEnabled(false);
        ok1.setEnabled(false);
        mm.setEnabled(false);
        mmm.setEnabled(false);
        mmmm.setEnabled(false);
        mmmmm.setEnabled(false);
        median.setEnabled(false);
        mean.setEnabled(false);
        mode.setEnabled(false);
        variance.setEnabled(false);
        standarddev.setEnabled(false);
        range.setEnabled(false);
        dd.setEnabled(false);
        choice.setEnabled(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Size = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        SamplesBox = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        ok1 = new javax.swing.JButton();
        mean = new javax.swing.JTextField();
        median = new javax.swing.JTextField();
        mode = new javax.swing.JTextField();
        variance = new javax.swing.JTextField();
        standarddev = new javax.swing.JTextField();
        range = new javax.swing.JTextField();
        mm = new javax.swing.JCheckBox();
        mmm = new javax.swing.JCheckBox();
        mmmm = new javax.swing.JCheckBox();
        dd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mmmmm = new javax.swing.JCheckBox();
        choice = new javax.swing.JComboBox<>();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back1.setText("BACK");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Measures of Central Tendency");

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

        title.setText("Title");
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        ok1.setText("OK");
        ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ActionPerformed(evt);
            }
        });

        mm.setText("Mean");
        mm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmActionPerformed(evt);
            }
        });

        mmm.setText("Median");

        mmmm.setText("Mode");

        dd.setText("Display Data");
        dd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddActionPerformed(evt);
            }
        });

        jLabel2.setText("Mean:");

        jLabel3.setText("Median:");

        jLabel4.setText("Variance:");

        jLabel5.setText("Mode:");

        jLabel6.setText("Range:");

        jLabel7.setText("Standard Deviaion:");

        mmmmm.setText("All Measures");

        choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Integer", "Floating" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(median, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(85, 85, 85)
                        .addComponent(range, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(variance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(standarddev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(mm)
                        .addGap(30, 30, 30)
                        .addComponent(mmm)
                        .addGap(36, 36, 36)
                        .addComponent(mmmm)
                        .addGap(21, 21, 21)
                        .addComponent(mmmmm)
                        .addGap(18, 18, 18)
                        .addComponent(ok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(back1)
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1))
                            .addComponent(SamplesBox)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(choice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ok1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dd)
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok1)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(SamplesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dd)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mm)
                    .addComponent(mmm)
                    .addComponent(mmmm)
                    .addComponent(ok)
                    .addComponent(mmmmm))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(variance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standarddev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(median, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        this.setVisible(false);
        new CentralTendency().setVisible(true);
    }//GEN-LAST:event_back1ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
       
        if(mm.isSelected() && !mmm.isSelected() && !mmmm.isSelected() && !mmmmm.isSelected()){
           mean.setEnabled(true);
           variance.setEnabled(true);
           standarddev.setEnabled(true);
           mean.setText(meany.meanUngrouped(SampleValues,SampleValues,type)+"");
           variance.setText(meany.ugVar(SampleValues,SampleValues,type)+"");
           standarddev.setText(meany.ugStandasrdDev(SampleValues,SampleValues,type)+"");
        }
        
        if(!mm.isSelected() && mmm.isSelected() && !mmmm.isSelected() && !mmmmm.isSelected()){
           median.setEnabled(true);
           range.setEnabled(true);
           
           median.setText(mediany.medUn(SampleValues,SampleValues,type)+"");
           range.setText(mediany.range(SampleValues, SampleValues, type)+"");
        }
        
        if(!mm.isSelected() && !mmm.isSelected() && mmmm.isSelected() && !mmmmm.isSelected()){
         mode.setEnabled(true);
         ArrayList<Integer> modes = new ArrayList<>();
          modes = modey.getmode(SampleValues,SampleValues,type);
            System.out.println("mode: "+modes);
            if (modes.size() == 0){
                mode.setText("No mode");
            } else if (modes.size() == 1){
                System.out.print(" Unimodal");
                mode.setText(modes+" Unimodal");
            }else if (modes.size() == 2){
               mode.setText(modes+" Bimodal");
            } else if(modes.size() > 2){
                mode.setText(modes+" Multi-modal");
            }

        }
        
        if(!mm.isSelected() && !mmm.isSelected() && !mmmm.isSelected() && mmmmm.isSelected()){
            
           mean.setEnabled(true);
           variance.setEnabled(true);
           standarddev.setEnabled(true);
           mean.setText(meany.meanUngrouped(SampleValues,SampleValues,type)+"");
           variance.setText(meany.ugVar(SampleValues,SampleValues,type)+"");
           standarddev.setText(meany.ugStandasrdDev(SampleValues,SampleValues,type)+"");
           
           median.setEnabled(true);
           range.setEnabled(true);
           median.setText(mediany.medUn(SampleValues,SampleValues,type)+"");
           range.setText(mediany.range(SampleValues, SampleValues, type)+"");
           
           mode.setEnabled(true);
           ArrayList<Integer> modes = new ArrayList<>();
           modes = modey.getmode(SampleValues,SampleValues,type);
            System.out.println("mode: "+modes);
            if (modes.size() == 0){
                mode.setText("No mode");
            } else if (modes.size() == 1){
                System.out.print(" Unimodal");
                mode.setText(modes+" Unimodal");
            }else if (modes.size() == 2){
               mode.setText(modes+" Bimodal");
            } else if(modes.size() > 2){
                mode.setText(modes+" Multi-modal");
            }

        }
    }//GEN-LAST:event_okActionPerformed

    private void SamplesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamplesBoxActionPerformed
        Size.setEnabled(false);
        ok1.setEnabled(false);
        choice.setEnabled(false);
        
        
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
                Double n =  Double.parseDouble(SamplesBox.getText());
               SampleValues.add(n);
               SamplesBox.setText("");
            }
          
      System.out.print(SampleValues);
      
      if(SampleValues.size() == size){
          SamplesBox.setEnabled(false);
        ok1.setEnabled(false);
        ok.setEnabled(true);  
        mm.setEnabled(true);
        mmm.setEnabled(true);
        mmmm.setEnabled(true);
        mmmmm.setEnabled(true);
        dd.setEnabled(true);
       
      }
    }//GEN-LAST:event_SamplesBoxActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        titlefn = title.getText();
        Size.setEnabled(true);
        ok1.setEnabled(true);
        choice.setEnabled(true);
    }//GEN-LAST:event_titleActionPerformed

    private void ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok1ActionPerformed
        title.setEnabled(false);
        size = Integer.parseInt(Size.getText());
        if(((String)choice.getSelectedItem()).equals("Integer")){
        type = 1;
        } else if(((String)choice.getSelectedItem()).equals("Floating")){
        type = 2;
        }
        if(size > 0){
        SamplesBox.setEnabled(true);
        }
    }//GEN-LAST:event_ok1ActionPerformed

    private void mmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmActionPerformed

    private void ddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddActionPerformed
        Display dis = new Display();
        SampleValues = dis.disp(SampleValues,type);
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
            java.util.logging.Logger.getLogger(ungrouped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ungrouped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ungrouped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ungrouped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ungrouped().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SamplesBox;
    private javax.swing.JTextField Size;
    private javax.swing.JButton back1;
    private javax.swing.JComboBox<String> choice;
    private javax.swing.JButton dd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField mean;
    private javax.swing.JTextField median;
    private javax.swing.JCheckBox mm;
    private javax.swing.JCheckBox mmm;
    private javax.swing.JCheckBox mmmm;
    private javax.swing.JCheckBox mmmmm;
    private javax.swing.JTextField mode;
    private javax.swing.JButton ok;
    private javax.swing.JButton ok1;
    private javax.swing.JTextField range;
    private javax.swing.JTextField standarddev;
    private javax.swing.JTextField title;
    private javax.swing.JTextField variance;
    // End of variables declaration//GEN-END:variables
}
