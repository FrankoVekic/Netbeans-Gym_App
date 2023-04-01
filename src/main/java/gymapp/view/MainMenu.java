/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymapp.view;

import gymapp.utility.Helper;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author frank
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        txtWelcoming.setText("Welcome " + Helper.admin.getName() + " " + Helper.admin.getSurname());
        txtMainTitle.setText("Home Page");
        
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
        SidePanel = new javax.swing.JPanel();
        btnMembers = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHomePage2 = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHomePage1 = new javax.swing.JLabel();
        btnTrainers = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtHomePage3 = new javax.swing.JLabel();
        btnManage = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtHomePage = new javax.swing.JLabel();
        btnPrograms = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtHomePage4 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        btnTrainingSessions = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtHomePage5 = new javax.swing.JLabel();
        TitlePanel = new javax.swing.JPanel();
        txtMainTitle = new javax.swing.JLabel();
        txtWelcoming = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(54, 33, 89));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMembers.setBackground(new java.awt.Color(64, 43, 100));
        btnMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMembersMousePressed(evt);
            }
        });
        btnMembers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/members.png"))); // NOI18N
        btnMembers.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        txtHomePage2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtHomePage2.setForeground(new java.awt.Color(255, 255, 255));
        txtHomePage2.setText("Members");
        btnMembers.add(txtHomePage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 30));

        SidePanel.add(btnMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 270, 49));

        btnHome.setBackground(new java.awt.Color(85, 65, 118));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });
        btnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        btnHome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        txtHomePage1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtHomePage1.setForeground(new java.awt.Color(255, 255, 255));
        txtHomePage1.setText("Home Page");
        btnHome.add(txtHomePage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 30));

        SidePanel.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, 270, 49));

        btnTrainers.setBackground(new java.awt.Color(64, 43, 100));
        btnTrainers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTrainersMousePressed(evt);
            }
        });
        btnTrainers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainers.png"))); // NOI18N
        btnTrainers.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        txtHomePage3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtHomePage3.setForeground(new java.awt.Color(255, 255, 255));
        txtHomePage3.setText("Trainers");
        btnTrainers.add(txtHomePage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 30));

        SidePanel.add(btnTrainers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, 50));

        btnManage.setBackground(new java.awt.Color(64, 43, 100));
        btnManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnManageMousePressed(evt);
            }
        });
        btnManage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage.png"))); // NOI18N
        btnManage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        txtHomePage.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtHomePage.setForeground(new java.awt.Color(255, 255, 255));
        txtHomePage.setText("Manage");
        btnManage.add(txtHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 30));

        SidePanel.add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 270, 50));

        btnPrograms.setBackground(new java.awt.Color(64, 43, 100));
        btnPrograms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProgramsMousePressed(evt);
            }
        });
        btnPrograms.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programs.png"))); // NOI18N
        btnPrograms.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        txtHomePage4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtHomePage4.setForeground(new java.awt.Color(255, 255, 255));
        txtHomePage4.setText("Programs");
        btnPrograms.add(txtHomePage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 30));

        SidePanel.add(btnPrograms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 50));

        txtTitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("HUSTLE HARD");
        SidePanel.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 180, 40));

        btnTrainingSessions.setBackground(new java.awt.Color(64, 43, 100));
        btnTrainingSessions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTrainingSessionsMousePressed(evt);
            }
        });
        btnTrainingSessions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainingsession.png"))); // NOI18N
        btnTrainingSessions.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        txtHomePage5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtHomePage5.setForeground(new java.awt.Color(255, 255, 255));
        txtHomePage5.setText("Training Sessions");
        btnTrainingSessions.add(txtHomePage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 30));

        SidePanel.add(btnTrainingSessions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 270, 50));

        BackGroundPanel.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 582));

        TitlePanel.setBackground(new java.awt.Color(110, 89, 222));

        txtMainTitle.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        txtMainTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtWelcoming.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        txtWelcoming.setForeground(new java.awt.Color(255, 255, 255));
        txtWelcoming.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWelcoming, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(txtMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtWelcoming, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        BackGroundPanel.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 33, 780, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        setColor(btnHome);
        resetColor(btnMembers);
        resetColor(btnPrograms);
        resetColor(btnTrainers);
        resetColor(btnManage);
        txtMainTitle.setText("Home Page");
    }//GEN-LAST:event_btnHomeMousePressed

    private void btnMembersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembersMousePressed
        setColor(btnMembers);
        resetColor(btnHome);
        resetColor(btnPrograms);
        resetColor(btnTrainers);
        resetColor(btnManage);
        txtMainTitle.setText("Members");
    }//GEN-LAST:event_btnMembersMousePressed

    private void btnTrainersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainersMousePressed
        setColor(btnTrainers);
        resetColor(btnHome);
        resetColor(btnPrograms);
        resetColor(btnMembers);
        resetColor(btnManage);
        txtMainTitle.setText("Trainers");
    }//GEN-LAST:event_btnTrainersMousePressed

    private void btnProgramsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProgramsMousePressed
        setColor(btnPrograms);
        resetColor(btnHome);
        resetColor(btnMembers);
        resetColor(btnTrainers);
        resetColor(btnManage);
        txtMainTitle.setText("Programs");
    }//GEN-LAST:event_btnProgramsMousePressed

    private void btnManageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageMousePressed
        setColor(btnManage);
        resetColor(btnHome);
        resetColor(btnPrograms);
        resetColor(btnTrainers);
        resetColor(btnMembers);
    }//GEN-LAST:event_btnManageMousePressed

    private void btnTrainingSessionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainingSessionsMousePressed
        setColor(btnTrainingSessions);
        resetColor(btnHome);
        resetColor(btnPrograms);
        resetColor(btnTrainers);
        resetColor(btnMembers);
        txtMainTitle.setText("Training Sessions");
    }//GEN-LAST:event_btnTrainingSessionsMousePressed

    /**
     * @param args the command line arguments
     */
    void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(64,43,100));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnManage;
    private javax.swing.JPanel btnMembers;
    private javax.swing.JPanel btnPrograms;
    private javax.swing.JPanel btnTrainers;
    private javax.swing.JPanel btnTrainingSessions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel txtHomePage;
    private javax.swing.JLabel txtHomePage1;
    private javax.swing.JLabel txtHomePage2;
    private javax.swing.JLabel txtHomePage3;
    private javax.swing.JLabel txtHomePage4;
    private javax.swing.JLabel txtHomePage5;
    private javax.swing.JLabel txtMainTitle;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtWelcoming;
    // End of variables declaration//GEN-END:variables
}
