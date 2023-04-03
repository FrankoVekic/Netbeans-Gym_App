/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymapp.view;

import gymapp.controller.MemberController;
import gymapp.model.Member;
import gymapp.utility.GymAppException;
import gymapp.utility.Helper;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author frank
 */
public class ManageMembers extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    private MemberController memberController;

    public ManageMembers() {
        initComponents();
        setTitle(Helper.getTitle(""));
        txtMainTitle.setText("MANAGE MEMBERS");;
        memberController = new MemberController();
        load();

    }

    public void load() {
        DefaultListModel<Member> members = new DefaultListModel<>();
        List<Member> entities = memberController.read();

        for (Member m : entities) {
            members.addElement(m);
        }
        lstEntities.setModel(members);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        txtMainTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntities = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        cbxActivity = new javax.swing.JCheckBox();
        btnChange = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        BackGroundPanel.setBackground(new java.awt.Color(85, 65, 118));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitlePanel.setBackground(new java.awt.Color(110, 89, 222));

        txtMainTitle.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        txtMainTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                .addContainerGap())
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(txtMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        BackGroundPanel.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1050, 130));

        lstEntities.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitiesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntities);

        BackGroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 430, 360));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Active:");
        BackGroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 150, 20));
        BackGroundPanel.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 300, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name:");
        BackGroundPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 60, 20));
        BackGroundPanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 300, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Surname:");
        BackGroundPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 150, 20));
        BackGroundPanel.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 300, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email:");
        BackGroundPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 150, 20));
        BackGroundPanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 300, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("OIB:");
        BackGroundPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 150, 20));
        BackGroundPanel.add(txtOib, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 300, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Phone Number");
        BackGroundPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 150, 20));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        BackGroundPanel.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 90, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        BackGroundPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 90, -1));

        cbxActivity.setText("Active");
        BackGroundPanel.add(cbxActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 70, -1));

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        BackGroundPanel.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 90, -1));

        btnClear.setText("Clear All");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        BackGroundPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Helper.manageMembersIsOpened = false;
    }//GEN-LAST:event_formWindowClosing

    private void lstEntitiesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitiesValueChanged
        if (evt.getValueIsAdjusting() || lstEntities.getSelectedValue() == null) {
            return;
        }

        memberController.setEntity(lstEntities.getSelectedValue());
        var p = memberController.getEntity();
        txtName.setText(p.getName());
        txtSurname.setText(p.getSurname());
        txtEmail.setText(p.getEmail());
        txtOib.setText(p.getOib());
        txtPhoneNumber.setText(p.getPhoneNumber());
        cbxActivity.setSelected(p.getActive()!= null ? p.getActive(): false);

    }//GEN-LAST:event_lstEntitiesValueChanged

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
         try {
            memberController.setEntity(new Member());
            verifyData();
            memberController.create();
            load();
            JOptionPane.showMessageDialog(getRootPane(), "You successfully created member: " + memberController.getEntity().getName() + " " + memberController.getEntity().getSurname());
        } catch (GymAppException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
         if(memberController.getEntity() == null){
            JOptionPane.showMessageDialog(getRootPane(), "You have to SELECT a member to change its data.");
            return;
        }
        verifyData();
         try {
            memberController.update();
            load();
            JOptionPane.showMessageDialog(getRootPane(), "You successfully updated data for: " + memberController.getEntity().getName() + " " + memberController.getEntity().getSurname());
        } catch (GymAppException e) {
            JOptionPane.showMessageDialog(getRootPane(), e.getMessage());
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtSurname.setText("");
        txtEmail.setText("");
        txtOib.setText("");
        txtPhoneNumber.setText("");
        cbxActivity.setSelected(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
         if (memberController.getEntity() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "You have to select a member before you delete it.");
            return;
        }

        if (JOptionPane.showConfirmDialog(getRootPane(),
                "Are you sure you want to delete \"" + memberController.getEntity().getName() + " " + memberController.getEntity().getSurname() + "\"?", "Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            memberController.delete();
            load();
            JOptionPane.showMessageDialog(getRootPane(), "You successfully removed: " + memberController.getEntity().getName() + " " + memberController.getEntity().getSurname());
        } catch (GymAppException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

     private void verifyData() {
        var m = memberController.getEntity();
        m.setName(txtName.getText());
        m.setSurname(txtSurname.getText());
        m.setEmail(txtEmail.getText());
        m.setOib(txtOib.getText());
        m.setPhoneNumber(txtPhoneNumber.getText());
        m.setActive(cbxActivity.isSelected());

    }
   
    /**
     * @param args the command line arguments
     */
    void setColor(JPanel panel) {
        panel.setBackground(new Color(85, 65, 118));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(64, 43, 100));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnRemove;
    private javax.swing.JCheckBox cbxActivity;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Member> lstEntities;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtMainTitle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
