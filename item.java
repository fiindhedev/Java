
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xamse Daldoon
 */

public class item extends javax.swing.JFrame {

    /**
     * Creates new form item
     */
    ResultSet rs;
    PreparedStatement ps;
     Connection con= connection.dbcon();
    public item() {
        initComponents();
          setTitle("Item Registry");
        setIconImage(Toolkit.getDefaultToolkit().getImage(users.class.getResource("images/logo.png")));

      if (itemss.role.equals("User")) {
        btnupdate.setVisible(false);
        
          }
          else{
          
          }
    }
    private void qtupdates(){
        try{
String value2 = txttotal.getText();
String value4 = txtname.getText();
String value5 = txtid.getText();
String sql = "update itemkhasnad set total=total +"+value2+" where itemname='"+value4+"' and itemid='"+value5+"'";
 ps = con.prepareStatement(sql);
 ps.executeUpdate();
 //JOptionPane.showMessageDialog(null, "saved Successful ");
} catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
}
        private void qtupdatess(){
        try{
String value2 = txtqtity.getText();
String value4 = txtname.getText();
//String value5 = txtid.getText();
String sql = "update items set quantity=quantity +"+value2+" where itemname='"+value4+"'";
 ps = con.prepareStatement(sql);
 ps.executeUpdate();
 //JOptionPane.showMessageDialog(null, "saved Successful ");
} catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
}
private void money(){
    try{
String sql = "INSERT INTO itemkhasnad (itemid,itemname,total,dates) values(?,?,?,?)";
      PreparedStatement  ps = con.prepareStatement(sql);

ps.setString(1, txtid.getText());
ps.setString(2, txtname.getText());
ps.setString(3, txttotal.getText());
SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
String dps = dateFormatss.format(this.dtp1.getDate());
ps.setString(4,dps);
 ps.executeUpdate();
//JOptionPane.showMessageDialog(null, "record successfull ");
//qtupdate();

  } catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
} 
}
private void calc(){
    int quantity = Integer.parseInt(txtqtity.getText());
         int price = Integer.parseInt(txtprice.getText());
        int total = quantity  * price ;
        String x = String.valueOf(total);
        txttotal.setText(x);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtqtity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dtp1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtvendor = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ITEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtqtity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtqtityMouseClicked(evt);
            }
        });
        txtqtity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item ID");

        txttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttotalMouseClicked(evt);
            }
        });
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cost");

        txtprice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpriceMouseClicked(evt);
            }
        });
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vendor");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                .addComponent(txtname)))
                        .addComponent(txtvendor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(dtp1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txttotal))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtqtity)
                                .addComponent(txtprice, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtvendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtqtity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void selection(){
    try{
String sql ="select itemid,quantity from items where itemid='"+txtid.getText()+"'and quantity < '"+txtqtity.getText()+"'";
 PreparedStatement  ps = con.prepareStatement(sql);
 rs = ps.executeQuery();

      

} catch(Exception e){

JOptionPane.showMessageDialog(null, e);

}
}
 private void calcs(){
try{
        double a,b,c;
a=Double.parseDouble(txtqtity.getText());
b=Double.parseDouble(txtprice.getText());
c=a*b;
txttotal.setText(c+"");
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}  
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
items frm = new items();
        this.setVisible(false);

frm.setVisible(true);

    }//GEN-LAST:event_formWindowClosed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
  items frm= new items();
        try{
String sql = "INSERT INTO items (itemid,itemname,vendor,address,quantity,cost,total,dates) values(?,?,?,?,?,?,?,?)";
      ps = con.prepareStatement(sql);
        

ps.setString(1, txtid.getText());
ps.setString(2, txtname.getText());
ps.setString(3, txtvendor.getText());
ps.setString(4, txtaddress.getText());
ps.setString(5, txtqtity.getText());
ps.setString(6, txtprice.getText());
ps.setString(7, txttotal.getText());
SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
String dps = dateFormatss.format(this.dtp1.getDate());
ps.setString(8,dps);
 ps.executeUpdate();
JOptionPane.showMessageDialog(null, "Saved successfull ");
 money();
 qtupdates();
 qtupdatess();
 reset();
 frm.showdata();
} catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}               
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
  
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
 items frm= new items();
        try{
 
String value1 = txtid.getText();
String value2 = txtname.getText();
String value4 = txtvendor.getText();
String value8 = txtaddress.getText();
String value5 = txtqtity.getText();
String value6 = txtprice.getText();
String value7 = txttotal.getText();
SimpleDateFormat dateFormatss = new SimpleDateFormat();
String dps1 = dateFormatss.format(this.dtp1.getDate());
//ps.setString(9,dps);
String sql = "update items set itemname='"+value2+"', vendor='"+value4+"',address='"+value8+"',quantity='"+value5+"',cost='"+value6+"',total='"+value7+"',dates='"+dps1+"' where itemid='"+value1+"'";
  ps = con.prepareStatement(sql);
 ps.executeUpdate();
JOptionPane.showMessageDialog(null, "record successfull ");
reset();
 frm.showdata();

} catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtqtityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtityActionPerformed
  
    }//GEN-LAST:event_txtqtityActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtqtityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtqtityMouseClicked
     calc();
    }//GEN-LAST:event_txtqtityMouseClicked

    private void txtpriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpriceMouseClicked
calc();
    }//GEN-LAST:event_txtpriceMouseClicked

    private void txttotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalMouseClicked
private void reset(){
    txtid.setText("");
    txtname.setText("");
    txtvendor.setText("");
    txtaddress.setText("");
    txtqtity.setText("");
    txtprice.setText("");
    txttotal.setText("");
}
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
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnsave;
    public javax.swing.JButton btnupdate;
    public com.toedter.calendar.JDateChooser dtp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtaddress;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtprice;
    public javax.swing.JTextField txtqtity;
    public javax.swing.JTextField txttotal;
    public javax.swing.JTextField txtvendor;
    // End of variables declaration//GEN-END:variables
}
