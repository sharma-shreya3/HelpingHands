/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiDonor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.causes.Cause;
import model.causes.CauseDirectory;
import model.causeticket.CauseTicket;
import model.causeticket.CauseTicketDirectory;
import profile.Receiver.Receiver;
import profile.Receiver.ReceiverDirectory;
import profile.donor.Donor;
import profile.donor.DonorDirectory;
import utilities.Constants;

/**
 *
 * @author abhis
 */
public class DonorAssignCause extends javax.swing.JPanel {
    String loggedInUser;
    DonorDirectory donorDirectory;
    Donor donor;
    CauseDirectory causeDirectory;
    Cause cause;    
    CauseTicketDirectory causeTicketDirectory;
    CauseTicket causeTicket;
    ReceiverDirectory receiverDirectory;
    Receiver receiver;
    /**
     * Creates new form DonorAssignCause
     */
    public DonorAssignCause(String loggedInUser) {
        this.loggedInUser = loggedInUser;
        this.donorDirectory = new DonorDirectory(donor);
        this.causeDirectory = new CauseDirectory(cause);     
        this.causeTicketDirectory = new CauseTicketDirectory(causeTicket);
        this.receiverDirectory =  new ReceiverDirectory(receiver);
        initComponents();

        for(String item : Constants.ngoOrganisations){
            combobxCause.addItem(item);
        }        
        combobxCause.setSelectedIndex(-1);
    }
    private void popDonorTable(ArrayList<Cause> donorTable) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel)tblCause.getModel();
        model.setRowCount(0);
        for(Cause cause: donorTable){
            Object[] row = new Object[6];
            row[0] = cause;
            row[1] = cause.getCauseName();
            row[2] = cause.getCauseDesc();
            row[3] = cause.getRecCategory();
            row[4] = cause.getCountry();                                     
            model.addRow(row);
        }
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
        tblCause = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        combobxCause = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnAssignCause = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtRec = new javax.swing.JTextField();
        txtCause = new javax.swing.JTextField();
        txtNGO = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();

        tblCause.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NGO Organisation", "Cause Name", "Cause Description", "Receiving Category", "Country"
            }
        ));
        jScrollPane1.setViewportView(tblCause);

        jLabel1.setText("Select Cause");

        combobxCause.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combobxCauseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobxCauseFocusLost(evt);
            }
        });
        combobxCause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobxCauseActionPerformed(evt);
            }
        });

        btnSearch.setText("Search Cause");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAssignCause.setText("Donate");
        btnAssignCause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignCauseActionPerformed(evt);
            }
        });

        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });

        jLabel2.setText("Enter Amount");

        jLabel3.setText("$");

        jButton1.setText("Details of Recipient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("First Name");

        jLabel5.setText("Last Name");

        jLabel6.setText("Email");

        jLabel7.setText("Country");

        jLabel8.setText("Recipient");

        jLabel9.setText("Cause");

        jLabel10.setText("NGO");

        jLabel11.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 193, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel2)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAssignCause))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel1)
                                    .addGap(33, 33, 33)
                                    .addComponent(combobxCause, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(btnSearch))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCause, txtCountry, txtDesc, txtEmail, txtFirstName, txtLastName, txtNGO, txtRec});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobxCause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignCause)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(txtNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCause, txtCountry, txtDesc, txtEmail, txtFirstName, txtLastName, txtNGO, txtRec});

    }// </editor-fold>//GEN-END:initComponents

    private void combobxCauseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobxCauseFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_combobxCauseFocusGained

    private void combobxCauseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobxCauseFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_combobxCauseFocusLost

    private void combobxCauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobxCauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobxCauseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

//        ResultSet resultSet = receiverDirectory.getReceiver(loggedInUser.split("-")[0].trim());

        String cause1 = combobxCause.getSelectedItem().toString();
        try {
            popDonorTable(donorDirectory.popDonorTable(cause1));
        } catch (SQLException ex) {
            Logger.getLogger(DonorAssignCause.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAssignCauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCauseActionPerformed
        // TODO add your handling code here:

        String cause = combobxCause.getSelectedItem().toString();
        ResultSet resultSet = donorDirectory.getdonor(loggedInUser.split("-")[0].trim());
        try {
            if (!resultSet.isBeforeFirst() ) {
                System.out.println("No data");
                return;
            }   } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "No Causes Available for this Category");
            }
            try {
                while(resultSet.next()){
                    System.out.println(resultSet.getString("Country"));

                    int SelectedRow = tblCause.getSelectedRow();
                    if(SelectedRow<0){
                        JOptionPane.showMessageDialog(this, "Please Select a row");
                    }else{
                        DefaultTableModel m2 = (DefaultTableModel)tblCause.getModel();
                        Cause SelectedRecords = (Cause) m2.getValueAt(SelectedRow, 0);
                        System.out.println("CAUSE IDDDDD "+SelectedRecords.getCauseId());
                        JOptionPane.showMessageDialog(this,"Thank you for Choosing Helping Hands \n Your Cause matters");
                        int donorId = Integer.valueOf(resultSet.getString("ID"));
                        int receiverId = SelectedRecords.getRecId();
                        int causeId = SelectedRecords.getCauseId();
                        String rCountry = SelectedRecords.getCountry();
                        String dCountry = resultSet.getString("Country");
                        Date date = null;
                        
//                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());;  
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Calendar cal = Calendar.getInstance();
                        String cd = dateFormat.format(cal.getTime());
                        Date moneyDonorCountry = null;             
                        Date moneyReceiverCountry = null;     
                        Date moneyReceived = null;                             
//                        System.out.println(dateFormat.format(cal.getTime())+"--"+donorId+"--"+receiverId+"--"+causeId);                 
   
                        try {                        
                            Date createdDate = dateFormat.parse(cd);
                            System.out.println(createdDate);
                            int amount = Integer.valueOf(txtAmount.getText());
                            CauseTicket assignCause = new CauseTicket(donorId, receiverId, causeId, createdDate,moneyDonorCountry,moneyReceiverCountry,moneyReceived,dCountry, rCountry,amount);
                            CauseTicketDirectory causeTicketDirectory = new CauseTicketDirectory(assignCause);
                            causeTicketDirectory.addTicket();
                            txtFirstName.setText("");
                            txtLastName.setText("");
                            txtEmail.setText("");
                            txtCountry.setText("");
                            txtRec.setText("");
                            txtCause.setText("");
                            txtNGO.setText("");
                            txtDesc.setText("");    
                            txtAmount.setText("");
                            return;                            
                        } catch (ParseException ex) {
                            Logger.getLogger(DonorAssignCause.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(DonorAssignCause.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_btnAssignCauseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int SelectedRow = tblCause.getSelectedRow();
        if(SelectedRow<0){
            JOptionPane.showMessageDialog(this, "Please Select a row");
        }
        else{
            DefaultTableModel m2 = (DefaultTableModel)tblCause.getModel();
            Cause SelectedRecords = (Cause) m2.getValueAt(SelectedRow, 0);
            System.out.println("CAUSE IDDDDD "+SelectedRecords.getCauseId());
            //JOptionPane.showMessageDialog(this,"Thank you for Choosing Helping Hands \n Your Cause matters");
            int receiverId = SelectedRecords.getRecId();
            int causeId = SelectedRecords.getCauseId();
            String rCountry = SelectedRecords.getCountry();
            Date date = null;
            ResultSet resultSet = receiverDirectory.getCauseBackground(causeId);
            try {
                while(resultSet.next()){
                    if(Integer.valueOf(resultSet.getString("R_Id")).equals(receiverId)){
//                        System.out.println(resultSet.getString("First_Name")+"GOOD");
                        String fname = resultSet.getString("First_Name");
                        String lname = resultSet.getString("Last_Name");
                        String email = resultSet.getString("Email");
                        String country = resultSet.getString("Country");
                        String recipientType = resultSet.getString("Type");
                        String causeName = resultSet.getString("Cause_Name");
                        String causeDesc = resultSet.getString("Cause_Desc");
                        String ngoOrg = resultSet.getString("NGO_Org");
                        
                        txtFirstName.setText(fname);
                        txtLastName.setText(lname);
                        txtEmail.setText(email);
                        txtCountry.setText(country);
                        txtRec.setText(recipientType);
                        txtCause.setText(causeName);
                        txtNGO.setText(ngoOrg);
                        txtDesc.setText(causeDesc);
                        break;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DonorAssignCause.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
    //                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());;  
             DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
             Calendar cal = Calendar.getInstance();
             String cd = dateFormat.format(cal.getTime());
             Date moneyDonorCountry = null;             
             Date moneyReceiverCountry = null;     
             Date moneyReceived = null;                
        }
             
//            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }           
    }//GEN-LAST:event_txtAmountKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignCause;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> combobxCause;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCause;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCause;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNGO;
    private javax.swing.JTextField txtRec;
    // End of variables declaration//GEN-END:variables
}