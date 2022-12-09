/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiPortal.justiceDepartment;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import profile.justiceDepartment.JusticeDepartmentEmployee;
import profile.justiceDepartment.JusticeDepartmentEmployeeDirectory;
import utilities.PopulateCommonData;
import utilities.Validators;

/**
 *
 * @author Shreya Sharma
 */
public class JusticeDepartmentViewEmployee extends javax.swing.JPanel {

    /**
     * Creates new form JusticeDepartmentViewEmployee
     */
    JusticeDepartmentEmployee justiceDepartmentEmployee;
    JusticeDepartmentEmployee selectedJusticeDepartmentEmployee;
    ArrayList<JusticeDepartmentEmployee> justiceDeptEmpList;
    boolean viewActiveEmployees = true;
    public JusticeDepartmentViewEmployee() {
        initComponents();
        setDefaultViewForLandingPage();
    }
    
    public JusticeDepartmentViewEmployee(JusticeDepartmentEmployee justiceDepartmentEmployee) {
        initComponents();
        this.justiceDepartmentEmployee = justiceDepartmentEmployee;
        setDefaultViewForLandingPage();
    }
    
    private void setDefaultViewForLandingPage() {
        updateEmployeePanel.setVisible(false);
        dropdownEmpType.setSelectedIndex(-1);
        lblEmpDetails.setText("View Active Employee Details");
        justiceDeptEmpList = new ArrayList<JusticeDepartmentEmployee>();
        populateJusticeEmpTable(true);
        toggleDeleteView(true);
    }
    
    private void setEmpTypeDropdwon(PopulateCommonData populateCommonData) {
        DefaultComboBoxModel<String> model = populateCommonData.setEmpTypeDropDown();
        dropdownEmpType.setModel(model);
        dropdownEmpType.setSelectedIndex(-1);
    }
    
    private void populateJusticeEmpTable (boolean status) {
        try {
            int empStatus = status ? 1 : 0;
            JusticeDepartmentEmployeeDirectory justiceDepartmentEmployeeDirectory = new JusticeDepartmentEmployeeDirectory(justiceDepartmentEmployee);
            if (justiceDepartmentEmployee != null) {
                justiceDeptEmpList = justiceDepartmentEmployeeDirectory.fetchJusticeDeptEmpData(empStatus, justiceDepartmentEmployee.getCountry(), "EMPLOYEE");
            } else {
                justiceDeptEmpList = justiceDepartmentEmployeeDirectory.fetchJusticeDeptEmpData(empStatus, null, null);
            }
            DefaultTableModel model = (DefaultTableModel)tblEmployeeDetails.getModel();
            model.setRowCount(0);
            for (JusticeDepartmentEmployee jdEmp : justiceDeptEmpList) {
                 Object[] row = new Object[6];
                 row[0] = jdEmp;
                 row[1] = jdEmp.getLastName();
                 row[2] = jdEmp.getEmail();
                 row[3] = jdEmp.getCountry();
                 row[4] = jdEmp.getEmpType();
                 model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
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

        lblEmpDetails = new javax.swing.JLabel();
        btnViewLink = new javax.swing.JButton();
        btnViewInactiveEmp = new javax.swing.JButton();
        btnViewActiveEmp = new javax.swing.JButton();
        btnDeleteLink = new javax.swing.JButton();
        updateEmployeePanel = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        dropdownEmpType = new javax.swing.JComboBox<>();
        btnUpdateLink = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        btnCancelUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmployeeDetails = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblEmpDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmpDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpDetails.setText("View Employee Details");

        btnViewLink.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewLink.setText("VIEW");
        btnViewLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLinkActionPerformed(evt);
            }
        });

        btnViewInactiveEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewInactiveEmp.setText("VIEW INACTIVE EMPLOYEES");
        btnViewInactiveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInactiveEmpActionPerformed(evt);
            }
        });

        btnViewActiveEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewActiveEmp.setText("VIEW ACTIVE EMPLOYEES");
        btnViewActiveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActiveEmpActionPerformed(evt);
            }
        });

        btnDeleteLink.setBackground(new java.awt.Color(153, 51, 0));
        btnDeleteLink.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteLink.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteLink.setText("DELETE");
        btnDeleteLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLinkActionPerformed(evt);
            }
        });

        updateEmployeePanel.setBackground(new java.awt.Color(255, 255, 255));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        dropdownEmpType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnUpdateLink.setBackground(new java.awt.Color(0, 153, 0));
        btnUpdateLink.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateLink.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateLink.setText("UPDATE");
        btnUpdateLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLinkActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Update Employee Details");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Email Id:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Country:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Emp Type:");

        btnCancelUpdate.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelUpdate.setText("CANCEL");
        btnCancelUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateEmployeePanelLayout = new javax.swing.GroupLayout(updateEmployeePanel);
        updateEmployeePanel.setLayout(updateEmployeePanelLayout);
        updateEmployeePanelLayout.setHorizontalGroup(
            updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnUpdateLink, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelUpdate)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCountry))
                        .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dropdownEmpType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        updateEmployeePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelUpdate, btnUpdateLink});

        updateEmployeePanelLayout.setVerticalGroup(
            updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateLink, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelUpdate))
                .addGap(49, 49, 49))
            .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateEmployeePanelLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(updateEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dropdownEmpType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(106, Short.MAX_VALUE)))
        );

        updateEmployeePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dropdownEmpType, txtCountry, txtEmailId});

        updateEmployeePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelUpdate, btnUpdateLink});

        tblEmployeeDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Email Id", "Country", "Emp Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEmployeeDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmpDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnViewLink, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewActiveEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewInactiveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteLink, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnViewInactiveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewActiveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewLink, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteLink))
                    .addComponent(updateEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDeleteLink, btnViewInactiveEmp, btnViewLink});

    }// </editor-fold>//GEN-END:initComponents

    private void btnViewLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLinkActionPerformed
        // TODO add your handling code here:
        if (viewActiveEmployees) {
            int selectedRow = tblEmployeeDetails.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(this, "Select one row to perform Update");
                return;
            }
            updateEmployeePanel.setVisible(true);
            if (justiceDeptEmpList != null && !justiceDeptEmpList.isEmpty()) {
                PopulateCommonData populateCommonData = new PopulateCommonData();
                setEmpTypeDropdwon(populateCommonData);
                selectedJusticeDepartmentEmployee = justiceDeptEmpList.get(selectedRow);
                txtFirstName.setText(selectedJusticeDepartmentEmployee.getFirstName());
                txtLastName.setText(selectedJusticeDepartmentEmployee.getLastName());
                txtEmailId.setText(selectedJusticeDepartmentEmployee.getEmail());
                txtCountry.setText(selectedJusticeDepartmentEmployee.getCountry());
                txtCountry.setEditable(false);
                txtCountry.setBackground(Color.GRAY);
                dropdownEmpType.setSelectedItem(selectedJusticeDepartmentEmployee.getEmpType());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cannot Update Inactive Employee Details");
            return;
        }

    }//GEN-LAST:event_btnViewLinkActionPerformed

    private void btnViewInactiveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInactiveEmpActionPerformed
        // TODO add your handling code here:
        lblEmpDetails.setText("View InActive Employee Details");
        toggleDeleteView(false);
        viewActiveEmployees = false;
        updateEmployeePanel.setVisible(false);
        populateJusticeEmpTable(false);
        
    }//GEN-LAST:event_btnViewInactiveEmpActionPerformed

    private void btnViewActiveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActiveEmpActionPerformed
        // TODO add your handling code here:
        lblEmpDetails.setText("View Active Employee Details");
        viewActiveEmployees = true;
        toggleDeleteView(true);
        updateEmployeePanel.setVisible(false);
        populateJusticeEmpTable(true);
    }//GEN-LAST:event_btnViewActiveEmpActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnUpdateLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLinkActionPerformed
        // TODO add your handling code here:
        if (selectedJusticeDepartmentEmployee != null) {
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            String emailId = txtEmailId.getText();
            String empType = dropdownEmpType.getSelectedItem().toString();
            Validators validator = new Validators();
            if (validator.isEmpty(firstName) || validator.isEmpty(lastName) || validator.isEmpty(emailId) || 
                validator.isEmpty(empType)) {
                JOptionPane.showMessageDialog(this, "All the fields in this form are mandatory. Make sure all the fields are filled");
                return;
            }
            selectedJusticeDepartmentEmployee.setFirstName(firstName);
            selectedJusticeDepartmentEmployee.setLastName(lastName);
            selectedJusticeDepartmentEmployee.setEmail(emailId);
            selectedJusticeDepartmentEmployee.setEmpType(empType);
            JusticeDepartmentEmployeeDirectory justiceDepartmentEmployeeDirectory = new JusticeDepartmentEmployeeDirectory(justiceDepartmentEmployee);
            try {
                justiceDepartmentEmployeeDirectory.updateEmp(selectedJusticeDepartmentEmployee);
                JOptionPane.showMessageDialog(this, "Data updated successfully");
                updateEmployeePanel.setVisible(false);
                selectedJusticeDepartmentEmployee = null;
                populateJusticeEmpTable(true);     
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        
    }//GEN-LAST:event_btnUpdateLinkActionPerformed

    private void btnCancelUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelUpdateActionPerformed
        // TODO add your handling code here:
        selectedJusticeDepartmentEmployee = null; 
        updateEmployeePanel.setVisible(false);
    }//GEN-LAST:event_btnCancelUpdateActionPerformed

    private void btnDeleteLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLinkActionPerformed
        // TODO add your handling code here:
        if (viewActiveEmployees) {
            int selectedRow = tblEmployeeDetails.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(this, "Select one row to perform delete");
                return;
            }
            if (justiceDeptEmpList != null && !justiceDeptEmpList.isEmpty()) {
               selectedJusticeDepartmentEmployee = justiceDeptEmpList.get(selectedRow); 
               JusticeDepartmentEmployeeDirectory justiceDepartmentEmployeeDirectory = new JusticeDepartmentEmployeeDirectory(selectedJusticeDepartmentEmployee);
               
               try {
                   justiceDepartmentEmployeeDirectory.inActivateEmployee();
                   JOptionPane.showMessageDialog(this, "Deleted employee Successfully");
                   selectedJusticeDepartmentEmployee = null;
                   populateJusticeEmpTable(true);
               } catch (Exception e) {
                   
               }
          
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cannot delete inactive employees");
        }
    }//GEN-LAST:event_btnDeleteLinkActionPerformed

    private void toggleDeleteView(boolean toggle) {
        btnViewLink.setEnabled(toggle);
        btnDeleteLink.setEnabled(toggle);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelUpdate;
    private javax.swing.JButton btnDeleteLink;
    private javax.swing.JButton btnUpdateLink;
    private javax.swing.JButton btnViewActiveEmp;
    private javax.swing.JButton btnViewInactiveEmp;
    private javax.swing.JButton btnViewLink;
    private javax.swing.JComboBox<String> dropdownEmpType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmpDetails;
    private javax.swing.JTable tblEmployeeDetails;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPanel updateEmployeePanel;
    // End of variables declaration//GEN-END:variables
}
