/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsintegration;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Danielle98
 */
public class DisplayTwo extends javax.swing.JFrame {

    /**
     * Creates new form DisplayTwo
     */
    ArrayList upper = new ArrayList();
    ArrayList lower = new ArrayList();
    ArrayList frequency = new ArrayList();
    ArrayList MD = new ArrayList();
    ArrayList FX = new ArrayList();
    ArrayList FX2 = new ArrayList();
    
     public void disp(ArrayList upper,ArrayList lower,ArrayList frequency, ArrayList MD, ArrayList FX, ArrayList FX2){
        this.upper = upper;
        this.lower = lower;
        this.frequency = frequency;
        this.MD = MD;
        this.FX = FX;
        this.FX2 = FX2;
                
          String header[] = {"Lower CL", "Upper CL","Frequency","MidPoint","FX","FX2"};
          DefaultTableModel dtm = (DefaultTableModel) display.getModel();
          dtm.setRowCount(upper.size());
          dtm.setColumnCount(6);
          
            for(int i=0;i<display.getColumnCount();i++){
                TableColumn column1 = display.getTableHeader().getColumnModel().getColumn(i);
                column1.setHeaderValue(header[i]);
            }
            
           double uppertot = 0.0;
           double lowertot = 0.0;
           double freqtot = 0.0;
           double mdtot = 0.0;
           double fxtot = 0.0;
           double fx2tot = 0.0;
           
           for (int j = 0; j < lower.size(); j++){
                    display.getModel().setValueAt(lower.get(j),j,0);
                    lowertot += Double.parseDouble((lower.get(j)).toString());
           }
           low.setText(lowertot+"");
           
           for (int j = 0; j < upper.size(); j++){
                    display.getModel().setValueAt(upper.get(j),j,1);
                   uppertot += Double.parseDouble((upper.get(j)).toString());
           }
           up.setText(uppertot+"");
           
           for (int j = 0; j < frequency.size(); j++){
                    display.getModel().setValueAt(frequency.get(j),j,2);
                    freqtot += Double.parseDouble((frequency.get(j)).toString());
           }
           fre.setText(freqtot+"");
           
             for (int j = 0; j < MD.size(); j++){
                    display.getModel().setValueAt(MD.get(j),j,3);
                    mdtot += Double.parseDouble((MD.get(j)).toString());
           }
           emd.setText(mdtot+"");
           
           
           for (int j = 0; j < FX.size(); j++){
                    display.getModel().setValueAt(FX.get(j),j,4);
                    fxtot += Double.parseDouble((FX.get(j)).toString());
           }
           fx.setText(fxtot+"");
           
            for (int j = 0; j < FX2.size(); j++){
                    display.getModel().setValueAt(FX2.get(j),j,5);
                    fx2tot += Double.parseDouble((FX2.get(j)).toString());
           }
           fx2.setText(fx2tot+"");
            
    }
     
    public void disp2(ArrayList upper,ArrayList lower,ArrayList frequency, ArrayList MD, ArrayList FX, ArrayList FX2){
        this.upper = upper;
        this.lower = lower;
        this.frequency = frequency;
        this.MD = MD;
        this.FX = FX;
        this.FX2 = FX2;
                
          String header[] = {"Lower CL", "Upper CL","Frequency","MidPoint","FX","FX2"};
          DefaultTableModel dtm = (DefaultTableModel) display.getModel();
          dtm.setRowCount(upper.size());
          dtm.setColumnCount(6);
          
            for(int i=0;i<display.getColumnCount();i++){
                TableColumn column1 = display.getTableHeader().getColumnModel().getColumn(i);
                column1.setHeaderValue(header[i]);
            }
            
           double uppertot = 0.0;
           double lowertot = 0.0;
           double freqtot = 0.0;
           double mdtot = 0.0;
           double fxtot = 0.0;
           double fx2tot = 0.0;
           
           for (int j = 0; j < lower.size(); j++){
                    display.getModel().setValueAt(lower.get(j),j,0);
                 //   lowertot += Double.parseDouble((lower.get(j)).toString());
           }
           low.setText(lowertot+"");
           
           for (int j = 0; j < upper.size(); j++){
                    display.getModel().setValueAt(upper.get(j),j,1);
                    //uppertot += Double.parseDouble((upper.get(j)).toString());
           }
           up.setText(uppertot+"");
           
           for (int j = 0; j < frequency.size(); j++){
                    display.getModel().setValueAt(frequency.get(j),j,2);
                    //freqtot += Double.parseDouble((frequency.get(j)).toString());
           }
           fre.setText(freqtot+"");
           
             for (int j = 0; j < MD.size(); j++){
                    display.getModel().setValueAt(MD.get(j),j,3);
                    //mdtot += Double.parseDouble((MD.get(j)).toString());
           }
           emd.setText(mdtot+"");
           
           
           for (int j = 0; j < FX.size(); j++){
                    display.getModel().setValueAt(FX.get(j),j,4);
                    //fxtot += Double.parseDouble((FX.get(j)).toString());
           }
           fx.setText(fxtot+"");
           
            for (int j = 0; j < FX2.size(); j++){
                    display.getModel().setValueAt(FX2.get(j),j,5);
                    //fx2tot += Double.parseDouble((FX2.get(j)).toString());
           }
           fx2.setText(fx2tot+"");
            
    } 
    
    public DisplayTwo() {
        initComponents();
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
        display = new javax.swing.JTable();
        low = new javax.swing.JTextField();
        hide = new javax.swing.JButton();
        fre = new javax.swing.JTextField();
        up = new javax.swing.JTextField();
        fx = new javax.swing.JTextField();
        emd = new javax.swing.JTextField();
        fx2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(display);

        hide.setText("Hide Data");
        hide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hide)
                        .addGap(259, 259, 259))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(low, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(emd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(fx, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fx2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(low, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(hide)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hideActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_hideActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayTwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable display;
    private javax.swing.JTextField emd;
    private javax.swing.JTextField fre;
    private javax.swing.JTextField fx;
    private javax.swing.JTextField fx2;
    private javax.swing.JButton hide;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField low;
    private javax.swing.JTextField up;
    // End of variables declaration//GEN-END:variables
}
