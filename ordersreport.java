import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
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
public class ordersreport extends javax.swing.JFrame {

    /**
     * Creates new form ordersreport
     */
        ResultSet rs;
    PreparedStatement ps;
      Connection con = connection.dbcon();
    public ordersreport() {
        initComponents();
        showdata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnreport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dtp2 = new com.toedter.calendar.JDateChooser();
        dtp1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblsum3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnreport.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnreport.setText("REPORT");
        btnreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreportMouseClicked(evt);
            }
        });
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ORDERS REPORT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TO");

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("TOTAL Orders");

        lblsum3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblsum3.setText(":");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsum3)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsum3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dtp1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(dtp2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnreport)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dtp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnreport))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreportMouseClicked
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Orders Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();

            try {
                // TODO add your handling code here:
                SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
                String dps = dateFormatss.format(this.dtp1.getDate());
                String dps1 = dateFormatss.format(this.dtp2.getDate());
                //ps.setString(5,dps);
                String sql ="select * from orders where orderdate between '"+dps+"' and '"+dps1+"'";
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(7);

                myDocument.open();

                float[] columnWidths = new float[] {3,8,7,7,7,5,5};
                table.setWidths(columnWidths);


                table.setWidthPercentage(100); //set table width to 100%

                myDocument.add(new Paragraph("Orders List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("                                     "));

                PdfPCell cells = new PdfPCell(new Paragraph("Orders List",FontFactory.getFont(FontFactory.TIMES_ROMAN,16,Font.BOLD,BaseColor.WHITE)));
                cells.setColspan(7);
                cells.setHorizontalAlignment(Element.ALIGN_CENTER);
                cells.setBackgroundColor(BaseColor.GRAY);
                table.addCell(cells);
                //table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.RED))));
                table.addCell(new PdfPCell(new Paragraph("Order ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Customer ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Customer Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Item",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Quantity",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Cost",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Total",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));

                //table.addCell(cell);
                while(rs.next())
                {

                    //            String ids= rs.getString(1) ;
                    //            table.addCell(new PdfPCell(new Phrase(ids)));
                    String ids= rs.getString("orderid") ;
                    table.addCell(new PdfPCell(new Phrase(ids)));

                    String addd= rs.getString("customerid") ;
                    table.addCell(new PdfPCell(new Phrase(addd)));

                    String qt= rs.getString("customername") ;
                    table.addCell(new PdfPCell(new Phrase(qt)));

                    String costs= rs.getString("address") ;
                    table.addCell(new PdfPCell(new Phrase(costs)));

                    String tt= rs.getString("item") ;
                    table.addCell(new PdfPCell(new Phrase(tt)));

                    String dts= rs.getString("quantity") ;
                    table.addCell(new PdfPCell(new Phrase(dts)));
                    
                    String cust= rs.getString("cost") ;
                    table.addCell(new PdfPCell(new Phrase(cust)));
                    
                    String tto= rs.getString("total") ;
                    table.addCell(new PdfPCell(new Phrase(tto)));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("                                     "));

                /// TABLE LABAAD


                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("         Signiture :______________________                            "));

                myDocument.close();
                JOptionPane.showMessageDialog(null,"Report was successfully generated");

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);

            }
            finally {

                try{
                    rs.close();
                    ps.close();

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);

                }
            }}

        }

        /**
        * @param args the command line arguments
        */
        private void showdata(){
            try{
                String sql ="select * from orders";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            } catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }

        }
private void counts(){
            try{
SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
String dps = dateFormatss.format(this.dtp1.getDate());
  String dps1 = dateFormatss.format(this.dtp2.getDate());
              String sql ="select count(orderid) from orders where dates between '"+dps+"' and '"+dps1+"' ";

                ps=con.prepareStatement(sql);

             rs=ps.executeQuery();
                while(rs.next()){
                  String add2 =rs.getString(1);
                  lblcount.setText(add2);

                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No Data");
            }
            finally {

                try{

                    rs.close();
                    ps.close();

                }
                catch(Exception e){

                }
            }
    }
        private void filter(){
            try{
                SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
                String dps = dateFormatss.format(this.dtp1.getDate());
                String dps1 = dateFormatss.format(this.dtp2.getDate());
                String sql ="select * from orders where orderdate between '"+dps+"' and '"+dps1+"'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            } catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }

        }
        private void avrgexam(){

            try{
                SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
                String dps = dateFormatss.format(this.dtp1.getDate());
                String dps1 = dateFormatss.format(this.dtp2.getDate());
                String sql ="select sum(debt) from vendors where orderdate between '"+dps+"' and '"+dps1+"'";

                ps=con.prepareStatement(sql);

                rs=ps.executeQuery();
                while(rs.next()){
                    String add1 =rs.getString(1);
                    //lblsum.setText(add1);

                }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No Data");
            }
            finally {

                try{

                    rs.close();
                    ps.close();

                }
                catch(Exception e){

                }
            }
    }//GEN-LAST:event_btnreportMouseClicked

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed

    }//GEN-LAST:event_btnreportActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        //avrgexam();
       counts();
        filter();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        orders a = new orders();
a.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(ordersreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordersreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordersreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordersreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordersreport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btnsearch;
    private com.toedter.calendar.JDateChooser dtp1;
    private com.toedter.calendar.JDateChooser dtp2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblcount;
    private javax.swing.JLabel lblcount1;
    private javax.swing.JLabel lblcount2;
    private javax.swing.JLabel lblsum;
    private javax.swing.JLabel lblsum1;
    private javax.swing.JLabel lblsum2;
    private javax.swing.JLabel lblsum3;
    // End of variables declaration//GEN-END:variables
}
