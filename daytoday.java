
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
import net.proteanit.sql.DbUtils;

public class daytoday extends javax.swing.JFrame {

    /**
     * Creates new form bymonth
     */
        Connection con= connection.dbcon();
    PreparedStatement ps;
    ResultSet rs;
    public daytoday() {
        initComponents();
          setTitle("Day to Day Report");
        setIconImage(Toolkit.getDefaultToolkit().getImage(users.class.getResource("images/logo.png")));
        filter();
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnreport = new javax.swing.JButton();
        dtp1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblsum = new javax.swing.JLabel();
        lblcount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dtp2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TOTAL Money");

        lblsum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblsum.setText(":");

        lblcount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcount.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Items Quantity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblsum))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcount)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dtp1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dtp2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnreport))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(btnreport, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dtp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
private void counts(){
            try{
SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
String dps = dateFormatss.format(this.dtp1.getDate());
  String dps1 = dateFormatss.format(this.dtp2.getDate());
              String sql ="select sum(quantity) from itemselling where dates between '"+dps+"' and '"+dps1+"' ";

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
    private void btnreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreportMouseClicked
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Sold items Day to Day Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();

            try {
                // TODO add your handling code here:
                SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
                String dps = dateFormatss.format(this.dtp1.getDate());
                String dps1 = dateFormatss.format(this.dtp2.getDate());
                //ps.setString(5,dps);
                String sql ="select * from itemselling where dates between '"+dps+"' and '"+dps1+"'";

                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(7);
                PdfPTable table1 = new PdfPTable(2);
                myDocument.open();

                float[] columnWidths = new float[] {3,8,7,7,7,5,5};
                table.setWidths(columnWidths);

                float[] columnWidthss = new float[] {7,8};
                table1.setWidths(columnWidthss);

                table.setWidthPercentage(100); //set table width to 100%
                table1.setWidthPercentage(100);
                myDocument.add(new Paragraph("Sold Items List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("                                     "));

                PdfPCell cells = new PdfPCell(new Paragraph("SOLD ITEMS",FontFactory.getFont(FontFactory.TIMES_ROMAN,16,Font.BOLD,BaseColor.WHITE)));
                cells.setColspan(7);
                cells.setHorizontalAlignment(Element.ALIGN_CENTER);
                cells.setBackgroundColor(BaseColor.GRAY);
                table.addCell(cells);
                //table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.RED))));
                table.addCell(new PdfPCell(new Paragraph("Item ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Customer Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Quantity",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Price",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Total",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                table.addCell(new PdfPCell(new Paragraph("Date",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK))));
                //table.addCell(cell);
                while(rs.next())
                {

                    //            String ids= rs.getString(1) ;
                    //            table.addCell(new PdfPCell(new Phrase(ids)));
                    String ids= rs.getString("itemid") ;
                    table.addCell(new PdfPCell(new Phrase(ids)));

                    String cust= rs.getString("itemname") ;
                    table.addCell(new PdfPCell(new Phrase(cust)));

                    String addd= rs.getString("customername") ;
                    table.addCell(new PdfPCell(new Phrase(addd)));

                    String qt= rs.getString("address") ;
                    table.addCell(new PdfPCell(new Phrase(qt)));

                    String costs= rs.getString("quantity") ;
                    table.addCell(new PdfPCell(new Phrase(costs)));

                    String tt= rs.getString("price") ;
                    table.addCell(new PdfPCell(new Phrase(tt)));

                    String dts= rs.getString("total") ;
                    table.addCell(new PdfPCell(new Phrase(dts)));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("                                     "));
                myDocument.add(new Paragraph("                                     "));

                /// TABLE LABAAD
                PdfPCell cellss = new PdfPCell(new Paragraph("SOLD RESULT",FontFactory.getFont(FontFactory.TIMES_ROMAN,16,Font.BOLD,BaseColor.WHITE)));
                cellss.setColspan(7);
                cellss.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellss.setBackgroundColor(BaseColor.ORANGE);
                table1.addCell(cellss);
                table1.addCell(new PdfPCell(new Paragraph("Quantity",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLUE))));
                table1.addCell(new PdfPCell(new Paragraph("Total",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLUE))));
                table1.addCell(new PdfPCell(new Phrase(lblcount.getText())));
                table1.addCell(new PdfPCell(new Phrase(lblsum.getText())));
                myDocument.add(table1);

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
                String sql ="select * from itemselling";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            } catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }

        }

        private void filter(){
            try{
                SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
                String dps = dateFormatss.format(this.dtp1.getDate());
                  String dps1 = dateFormatss.format(this.dtp2.getDate());
                String sql ="select * from itemselling where dates between '"+dps+"' and '"+dps1+"'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                jPanel2.setVisible(true);
            } catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }

        }
        private void avrgexam(){

            try{
                SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
                String dps = dateFormatss.format(this.dtp1.getDate());
                String dps1 = dateFormatss.format(this.dtp2.getDate());
                String sql ="select sum(total) from itemselling where dates between '"+dps+"' and '"+dps1+"'";

                ps=con.prepareStatement(sql);

                rs=ps.executeQuery();
                while(rs.next()){
                    String add1 =rs.getString(1);
                    lblsum.setText(add1);

                }
                jPanel2.setVisible(true);
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
        avrgexam();
        counts();
        filter();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
 mainform a = new mainform();
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
            java.util.logging.Logger.getLogger(daytoday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daytoday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daytoday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daytoday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daytoday().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblcount;
    private javax.swing.JLabel lblsum;
    // End of variables declaration//GEN-END:variables
}
