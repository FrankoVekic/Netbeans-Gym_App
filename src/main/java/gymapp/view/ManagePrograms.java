/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymapp.view;

import gymapp.controller.ProgramController;
import gymapp.utility.Helper;
import javax.swing.table.TableColumn;

/**
 *
 * @author frank
 */
public class ManagePrograms extends javax.swing.JFrame {

    
    ProgramController pc;
    
    public ManagePrograms() {
        initComponents();
        pc = new ProgramController();
        setTitle(Helper.getTitle(""));
        ProgramTableModel pmt = new ProgramTableModel(pc.read());
        ProgramsTable.setModel(pmt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        BackgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProgramsTable = new javax.swing.JTable();
        txtPrice = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        BackgroundPanel.setBackground(new java.awt.Color(85, 65, 118));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE PROGRAMS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 300, 40));

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 930, 80));

        ProgramsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProgramsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProgramsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProgramsTable);
        if (ProgramsTable.getColumnModel().getColumnCount() > 0) {
            ProgramsTable.getColumnModel().getColumn(0).setMinWidth(10);
            ProgramsTable.getColumnModel().getColumn(0).setMaxWidth(60);
            ProgramsTable.getColumnModel().getColumn(1).setMinWidth(40);
            ProgramsTable.getColumnModel().getColumn(2).setMinWidth(10);
            ProgramsTable.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        BackgroundPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 890, 190));
        BackgroundPanel.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 140, -1));
        BackgroundPanel.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 260, -1));

        txtDescription.setColumns(20);
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        BackgroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 420, 120));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Description:");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 140, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price:");
        BackgroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 80, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Title:");
        BackgroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Helper.manageProgramsIsOpened = false;
    }//GEN-LAST:event_formWindowClosing

    private void ProgramsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramsTableMouseClicked
        ProgramTableModel ptm = (ProgramTableModel)ProgramsTable.getModel();
        
        String name = ptm.getValueAt(ProgramsTable.getSelectedRow(), 0).toString();
        String description = ptm.getValueAt(ProgramsTable.getSelectedRow(), 1).toString();
        String price = ptm.getValueAt(ProgramsTable.getSelectedRow(), 2).toString();
        
        txtTitle.setText(name);
        txtDescription.setText(description);
        txtPrice.setText(price);
    }//GEN-LAST:event_ProgramsTableMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JTable ProgramsTable;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}