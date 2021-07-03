/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectv2;

/**
 *
 * @author yum
 */
public class adminpanel extends javax.swing.JFrame {

    /**
     * Creates new form adminpanel
     */
    public adminpanel() {
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

        adminPanel = new javax.swing.JPanel();
        logOut = new javax.swing.JButton();
        doctorDesk = new javax.swing.JDesktopPane();
        doctorDetailsLabel = new javax.swing.JLabel();
        doctorDetailsButton = new javax.swing.JButton();
        lowerStaffDesk = new javax.swing.JDesktopPane();
        lowerStaffLabel = new javax.swing.JLabel();
        lowerStaffButton = new javax.swing.JButton();
        recepDesk = new javax.swing.JDesktopPane();
        recepLabel = new javax.swing.JLabel();
        recepDetailsButton = new javax.swing.JButton();
        patientDesk = new javax.swing.JDesktopPane();
        patientLabel = new javax.swing.JLabel();
        patientDetailsButton = new javax.swing.JButton();
        bedDesk = new javax.swing.JDesktopPane();
        bedLabel = new javax.swing.JLabel();
        bedAvailabilityButton = new javax.swing.JButton();
        departmentDesk = new javax.swing.JDesktopPane();
        departmentLabel = new javax.swing.JLabel();
        departmentDetailsButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("adminPanel");
        setName("adminFrame"); // NOI18N

        adminPanel.setAutoscrolls(true);
        adminPanel.setName("adminPanel"); // NOI18N
        adminPanel.setLayout(null);

        logOut.setBackground(new java.awt.Color(204, 204, 255));
        logOut.setFont(new java.awt.Font("Yrsa Medium", 0, 18)); // NOI18N
        logOut.setForeground(new java.awt.Color(51, 51, 255));
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGOUT (2).png"))); // NOI18N
        logOut.setText("Log Out");
        logOut.setAutoscrolls(true);
        logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        logOut.setIconTextGap(2);
        logOut.setVerifyInputWhenFocusTarget(false);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        adminPanel.add(logOut);
        logOut.setBounds(40, 110, 117, 36);

        doctorDesk.setBackground(new java.awt.Color(102, 0, 204));
        doctorDesk.setForeground(new java.awt.Color(255, 204, 204));
        doctorDesk.setToolTipText("");
        doctorDesk.setName("desk1"); // NOI18N

        doctorDetailsLabel.setBackground(new java.awt.Color(255, 255, 255));
        doctorDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorDetailsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DOCTORDETAILS (2).png"))); // NOI18N
        doctorDetailsLabel.setName("doctorDetail"); // NOI18N

        doctorDetailsButton.setBackground(new java.awt.Color(255, 255, 204));
        doctorDetailsButton.setFont(new java.awt.Font("Yrsa Medium", 0, 14)); // NOI18N
        doctorDetailsButton.setForeground(new java.awt.Color(51, 102, 255));
        doctorDetailsButton.setText("Doctor Details");
        doctorDetailsButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        doctorDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctorDetailsButton.setName("doctorDetailsButton"); // NOI18N

        doctorDesk.setLayer(doctorDetailsLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        doctorDesk.setLayer(doctorDetailsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout doctorDeskLayout = new javax.swing.GroupLayout(doctorDesk);
        doctorDesk.setLayout(doctorDeskLayout);
        doctorDeskLayout.setHorizontalGroup(
            doctorDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorDeskLayout.createSequentialGroup()
                .addGroup(doctorDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doctorDeskLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(doctorDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(doctorDeskLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(doctorDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        doctorDeskLayout.setVerticalGroup(
            doctorDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorDeskLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doctorDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adminPanel.add(doctorDesk);
        doctorDesk.setBounds(280, 200, 230, 210);

        lowerStaffDesk.setName("desk2"); // NOI18N

        lowerStaffLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lowerStaffLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EMPLOYEESDETAILS.png"))); // NOI18N
        lowerStaffLabel.setName("lowerStaffDetail"); // NOI18N

        lowerStaffButton.setBackground(new java.awt.Color(255, 255, 204));
        lowerStaffButton.setFont(new java.awt.Font("Yrsa Medium", 0, 14)); // NOI18N
        lowerStaffButton.setForeground(new java.awt.Color(51, 102, 255));
        lowerStaffButton.setText("Lower Staff Details");
        lowerStaffButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lowerStaffButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lowerStaffButton.setInheritsPopupMenu(true);
        lowerStaffButton.setName("lowerStaffDetailsButton"); // NOI18N

        lowerStaffDesk.setLayer(lowerStaffLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lowerStaffDesk.setLayer(lowerStaffButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lowerStaffDeskLayout = new javax.swing.GroupLayout(lowerStaffDesk);
        lowerStaffDesk.setLayout(lowerStaffDeskLayout);
        lowerStaffDeskLayout.setHorizontalGroup(
            lowerStaffDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerStaffDeskLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(lowerStaffDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lowerStaffDeskLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lowerStaffButton))
                    .addComponent(lowerStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        lowerStaffDeskLayout.setVerticalGroup(
            lowerStaffDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerStaffDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adminPanel.add(lowerStaffDesk);
        lowerStaffDesk.setBounds(580, 200, 230, 210);

        recepDesk.setBorder(null);
        recepDesk.setName("desk3"); // NOI18N

        recepLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recepLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RECETIONISTDETAILS.png"))); // NOI18N
        recepLabel.setName("recepDetail"); // NOI18N

        recepDetailsButton.setBackground(new java.awt.Color(255, 255, 204));
        recepDetailsButton.setFont(new java.awt.Font("Yrsa Medium", 0, 14)); // NOI18N
        recepDetailsButton.setForeground(new java.awt.Color(51, 102, 255));
        recepDetailsButton.setText("Receptionist Details");
        recepDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recepDetailsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        recepDetailsButton.setName("receptionistDetailsButton"); // NOI18N

        recepDesk.setLayer(recepLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        recepDesk.setLayer(recepDetailsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout recepDeskLayout = new javax.swing.GroupLayout(recepDesk);
        recepDesk.setLayout(recepDeskLayout);
        recepDeskLayout.setHorizontalGroup(
            recepDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recepDeskLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(recepDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recepDeskLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(recepDetailsButton))
                    .addComponent(recepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        recepDeskLayout.setVerticalGroup(
            recepDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recepDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recepDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adminPanel.add(recepDesk);
        recepDesk.setBounds(880, 200, 230, 210);

        patientDesk.setName("desk4"); // NOI18N

        patientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/patientdetals.png"))); // NOI18N
        patientLabel.setName("patientDetail"); // NOI18N

        patientDetailsButton.setBackground(new java.awt.Color(255, 255, 204));
        patientDetailsButton.setFont(new java.awt.Font("Yrsa Medium", 0, 14)); // NOI18N
        patientDetailsButton.setForeground(new java.awt.Color(51, 102, 255));
        patientDetailsButton.setText("Patient Details");
        patientDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientDetailsButton.setName("patientDetailsButton"); // NOI18N

        patientDesk.setLayer(patientLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        patientDesk.setLayer(patientDetailsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout patientDeskLayout = new javax.swing.GroupLayout(patientDesk);
        patientDesk.setLayout(patientDeskLayout);
        patientDeskLayout.setHorizontalGroup(
            patientDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientDeskLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(patientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientDeskLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(patientDetailsButton)
                .addGap(68, 68, 68))
        );
        patientDeskLayout.setVerticalGroup(
            patientDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminPanel.add(patientDesk);
        patientDesk.setBounds(280, 475, 230, 210);

        bedDesk.setName("desk5"); // NOI18N

        bedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bedLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BEDDETAILS.png"))); // NOI18N
        bedLabel.setName("bedAviability"); // NOI18N

        bedAvailabilityButton.setBackground(new java.awt.Color(255, 255, 204));
        bedAvailabilityButton.setFont(new java.awt.Font("Yrsa Medium", 0, 14)); // NOI18N
        bedAvailabilityButton.setForeground(new java.awt.Color(51, 102, 255));
        bedAvailabilityButton.setText("Bed Availability");
        bedAvailabilityButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bedAvailabilityButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bedAvailabilityButton.setName("bedAvailabilityButton"); // NOI18N

        bedDesk.setLayer(bedLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bedDesk.setLayer(bedAvailabilityButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bedDeskLayout = new javax.swing.GroupLayout(bedDesk);
        bedDesk.setLayout(bedDeskLayout);
        bedDeskLayout.setHorizontalGroup(
            bedDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bedDeskLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(bedDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bedDeskLayout.createSequentialGroup()
                        .addComponent(bedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bedDeskLayout.createSequentialGroup()
                        .addComponent(bedAvailabilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        bedDeskLayout.setVerticalGroup(
            bedDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bedDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bedAvailabilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adminPanel.add(bedDesk);
        bedDesk.setBounds(580, 475, 230, 210);

        departmentDesk.setName("desk6"); // NOI18N

        departmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departmentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/department.png"))); // NOI18N
        departmentLabel.setName("depDetail"); // NOI18N

        departmentDetailsButton.setBackground(new java.awt.Color(255, 255, 204));
        departmentDetailsButton.setFont(new java.awt.Font("Yrsa Medium", 0, 14)); // NOI18N
        departmentDetailsButton.setForeground(new java.awt.Color(51, 102, 255));
        departmentDetailsButton.setText("Department Details");
        departmentDetailsButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        departmentDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        departmentDetailsButton.setName("departmentDetailsButton"); // NOI18N

        departmentDesk.setLayer(departmentLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        departmentDesk.setLayer(departmentDetailsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout departmentDeskLayout = new javax.swing.GroupLayout(departmentDesk);
        departmentDesk.setLayout(departmentDeskLayout);
        departmentDeskLayout.setHorizontalGroup(
            departmentDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departmentDeskLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(departmentDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(departmentDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        departmentDeskLayout.setVerticalGroup(
            departmentDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departmentDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(departmentDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adminPanel.add(departmentDesk);
        departmentDesk.setBounds(880, 475, 230, 210);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminpanel.png"))); // NOI18N
        backgroundLabel.setName("Label1"); // NOI18N
        adminPanel.add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1290, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1291, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutActionPerformed

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
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new adminpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton bedAvailabilityButton;
    private javax.swing.JDesktopPane bedDesk;
    private javax.swing.JLabel bedLabel;
    private javax.swing.JDesktopPane departmentDesk;
    private javax.swing.JButton departmentDetailsButton;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JDesktopPane doctorDesk;
    private javax.swing.JButton doctorDetailsButton;
    private javax.swing.JLabel doctorDetailsLabel;
    private javax.swing.JButton logOut;
    private javax.swing.JButton lowerStaffButton;
    private javax.swing.JDesktopPane lowerStaffDesk;
    private javax.swing.JLabel lowerStaffLabel;
    private javax.swing.JDesktopPane patientDesk;
    private javax.swing.JButton patientDetailsButton;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JDesktopPane recepDesk;
    private javax.swing.JButton recepDetailsButton;
    private javax.swing.JLabel recepLabel;
    // End of variables declaration//GEN-END:variables
}
