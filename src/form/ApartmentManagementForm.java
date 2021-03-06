/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.swingx.JXCollapsiblePane;

/**
 *
 * @author zcmgy
 */
public final class ApartmentManagementForm extends javax.swing.JFrame {

    /**
     * Creates new form MenuHamburger
     */
    public ApartmentManagementForm() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.put("ComboBox.background", new ColorUIResource(Color.WHITE));
//            UIManager.put("ComboBox.selectionBackground", new ColorUIResource(Color.BLACK));
//            UIManager.put("ComboBox.selectionForeground", new ColorUIResource(Color.blue));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ApartmentManagementForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        initCollapsePanel();
        initAnnounce();
        
    }
    
    void refreshAnnounce() {
        btnPeopleDetailActionPerformed(evt);
    }
    
    ActionEvent evt;
    void initAnnounce() {
        btnAnnounceActionPerformed(evt);
    }
    
    final void initCollapsePanel() {
        JXCollapsiblePane cp = new JXCollapsiblePane();
        cp.setCollapsed(true);
        cp.setDirection(JXCollapsiblePane.Direction.LEFT);
        cp.setLayout(new BorderLayout());
        cp.add("Center", pnResizable);
        pnContent.add("West", cp);
//        add("West", cp);
        btnHamburger.addActionListener(cp.getActionMap().get(JXCollapsiblePane.TOGGLE_ACTION));
    }

    
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GBtnAccount = new javax.swing.ButtonGroup();
        GBtnAnnounce = new javax.swing.ButtonGroup();
        GBtnPeople = new javax.swing.ButtonGroup();
        GBtnEmail = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeopleDetail = new org.jdesktop.swingx.JXTable();
        pnAccount = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnLeft = new javax.swing.JPanel();
        btnHamburger = new org.jdesktop.swingx.JXButton();
        btnAccount = new org.jdesktop.swingx.JXButton();
        btnAnnounce = new org.jdesktop.swingx.JXButton();
        btnPeopleDetail = new org.jdesktop.swingx.JXButton();
        btnMail = new org.jdesktop.swingx.JXButton();
        btnRoom = new org.jdesktop.swingx.JXButton();
        pnContent = new javax.swing.JPanel();
        pnResizable = new javax.swing.JPanel();
        btnAccount2 = new org.jdesktop.swingx.JXButton();
        btnAnnounce2 = new org.jdesktop.swingx.JXButton();
        btnPeopleDetail2 = new org.jdesktop.swingx.JXButton();
        btnRoom2 = new org.jdesktop.swingx.JXButton();
        btnMail2 = new org.jdesktop.swingx.JXButton();

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);

        tblPeopleDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPeopleDetail.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblPeopleDetail.setOpaque(false);
        jScrollPane1.setViewportView(tblPeopleDetail);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí chung cư");

        pnAccount.setBackground(new java.awt.Color(51, 153, 255));
        pnAccount.setPreferredSize(new java.awt.Dimension(600, 60));

        jLabel2.setText("Icon");
        jLabel2.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel3.setText("Nguyen");

        jLabel4.setText("Long");

        jLabel1.setText("DESIGN SAU");

        javax.swing.GroupLayout pnAccountLayout = new javax.swing.GroupLayout(pnAccount);
        pnAccount.setLayout(pnAccountLayout);
        pnAccountLayout.setHorizontalGroup(
            pnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAccountLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 704, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnAccountLayout.setVerticalGroup(
            pnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnAccountLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(pnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(pnAccount, java.awt.BorderLayout.PAGE_START);

        pnLeft.setBackground(new java.awt.Color(204, 204, 204));
        pnLeft.setPreferredSize(new java.awt.Dimension(60, 330));

        btnHamburger.setBackground(new java.awt.Color(255, 255, 255));
        btnHamburger.setBorder(null);
        btnHamburger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        btnHamburger.setFocusPainted(false);
        btnHamburger.setOpaque(false);
        btnHamburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHamburgerActionPerformed(evt);
            }
        });

        btnAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnAccount.setBorder(null);
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account.png"))); // NOI18N
        GBtnAccount.add(btnAccount);
        btnAccount.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account-white.png"))); // NOI18N
        btnAccount.setFocusPainted(false);
        btnAccount.setOpaque(false);
        btnAccount.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key.png"))); // NOI18N
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        btnAnnounce.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnounce.setBorder(null);
        btnAnnounce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bulletin-board.png"))); // NOI18N
        GBtnAnnounce.add(btnAnnounce);
        btnAnnounce.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clipboard-text-white.png"))); // NOI18N
        btnAnnounce.setFocusPainted(false);
        btnAnnounce.setOpaque(false);
        btnAnnounce.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key.png"))); // NOI18N
        btnAnnounce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnounceActionPerformed(evt);
            }
        });

        btnPeopleDetail.setBackground(new java.awt.Color(255, 255, 255));
        btnPeopleDetail.setBorder(null);
        btnPeopleDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/human-male-female.png"))); // NOI18N
        GBtnPeople.add(btnPeopleDetail);
        btnPeopleDetail.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/human-male-female-white.png"))); // NOI18N
        btnPeopleDetail.setFocusPainted(false);
        btnPeopleDetail.setOpaque(false);
        btnPeopleDetail.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key.png"))); // NOI18N
        btnPeopleDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleDetailActionPerformed(evt);
            }
        });

        btnMail.setBackground(new java.awt.Color(255, 255, 255));
        btnMail.setBorder(null);
        btnMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/calendar-remove.png"))); // NOI18N
        btnMail.setToolTipText("");
        GBtnEmail.add(btnMail);
        btnMail.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/email(1).png"))); // NOI18N
        btnMail.setFocusPainted(false);
        btnMail.setOpaque(false);
        btnMail.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key.png"))); // NOI18N
        btnMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMailActionPerformed(evt);
            }
        });

        btnRoom.setBackground(new java.awt.Color(255, 255, 255));
        btnRoom.setBorder(null);
        btnRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-variant(1).png"))); // NOI18N
        btnRoom.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-variant.png"))); // NOI18N
        btnRoom.setFocusPainted(false);
        btnRoom.setOpaque(false);
        btnRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addComponent(btnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeopleDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnounce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHamburger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnLeftLayout.setVerticalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addComponent(btnHamburger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnnounce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPeopleDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(btnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnLeft, java.awt.BorderLayout.LINE_START);

        pnContent.setBackground(new java.awt.Color(0, 204, 102));
        pnContent.setPreferredSize(new java.awt.Dimension(1000, 500));
        pnContent.setLayout(new java.awt.BorderLayout());

        pnResizable.setBackground(new java.awt.Color(204, 204, 204));
        pnResizable.setPreferredSize(new java.awt.Dimension(120, 19));

        btnAccount2.setBackground(new java.awt.Color(255, 255, 255));
        btnAccount2.setBorder(null);
        btnAccount2.setText("Tài khoản");
        GBtnAccount.add(btnAccount2);
        btnAccount2.setFocusPainted(false);
        btnAccount2.setOpaque(false);

        btnAnnounce2.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnounce2.setBorder(null);
        btnAnnounce2.setText("Thông báo");
        GBtnAnnounce.add(btnAnnounce2);
        btnAnnounce2.setFocusPainted(false);
        btnAnnounce2.setOpaque(false);
        btnAnnounce2.setPreferredSize(new java.awt.Dimension(51, 24));
        btnAnnounce2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnounce2ActionPerformed(evt);
            }
        });

        btnPeopleDetail2.setBackground(new java.awt.Color(255, 255, 255));
        btnPeopleDetail2.setBorder(null);
        btnPeopleDetail2.setText("Quản lí người dân");
        GBtnPeople.add(btnPeopleDetail2);
        btnPeopleDetail2.setFocusPainted(false);
        btnPeopleDetail2.setOpaque(false);
        btnPeopleDetail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleDetail2ActionPerformed(evt);
            }
        });

        btnRoom2.setBackground(new java.awt.Color(255, 255, 255));
        btnRoom2.setBorder(null);
        btnRoom2.setText("Quản lí căn hộ");
        btnRoom2.setBorderPainted(false);
        btnRoom2.setFocusPainted(false);
        btnRoom2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRoom2.setOpaque(false);
        btnRoom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoom2ActionPerformed(evt);
            }
        });

        btnMail2.setBackground(new java.awt.Color(255, 255, 255));
        btnMail2.setBorder(null);
        btnMail2.setText("Quản lí báo hỏng");
        btnMail2.setBorderPainted(false);
        btnMail2.setFocusPainted(false);
        btnMail2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMail2.setOpaque(false);
        btnMail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMail2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnResizableLayout = new javax.swing.GroupLayout(pnResizable);
        pnResizable.setLayout(pnResizableLayout);
        pnResizableLayout.setHorizontalGroup(
            pnResizableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResizableLayout.createSequentialGroup()
                .addGroup(pnResizableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAccount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnounce2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeopleDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
            .addComponent(btnRoom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnResizableLayout.setVerticalGroup(
            pnResizableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResizableLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnAnnounce2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnPeopleDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMail2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(btnAccount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pnContent.add(pnResizable, java.awt.BorderLayout.LINE_START);

        getContentPane().add(pnContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccountActionPerformed
    // Ghi chú: Chưa tạo đối tượng ra bên ngoài nên thằng Button không biết xóa thằng nào.
    PanelPeopleDetail ppd = ShareData.getInstance().getPpd();
    private void btnPeopleDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleDetailActionPerformed
        ppd = new PanelPeopleDetail();
        pnContent.remove(ppd);
        pnContent.remove(pa);
        pnContent.remove(pr);
        pnContent.add(ppd);
        // EMAIL
        btnMail.setEnabled(true);
        btnMail2.setEnabled(true);
        btnMail2.setForeground(Color.BLACK);

        // ANNOUNCE
        btnAnnounce.setEnabled(true);
        btnAnnounce2.setEnabled(true);
        btnAnnounce2.setForeground(Color.BLACK);
        // ROOM
        btnRoom.setEnabled(true);
        btnRoom2.setEnabled(true);
        btnRoom2.setForeground(Color.BLACK);
        
        // People Detail button DISABLE
        btnPeopleDetail.setEnabled(false);
        btnPeopleDetail2.setEnabled(false);
        btnPeopleDetail2.setForeground(Color.WHITE);
        // ---- //
        pnContent.updateUI();
    }//GEN-LAST:event_btnPeopleDetailActionPerformed
    
    PanelAnnounce pa = ShareData.getInstance().getPa();
    
    private void btnAnnounceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnounceActionPerformed
        pnContent.remove(pa);
        pnContent.remove(ppd);
        pnContent.remove(pr);
        pnContent.add(pa);
        // Announce Button
        btnAnnounce.setEnabled(false);
        btnAnnounce2.setEnabled(false);
        btnAnnounce2.setForeground(Color.WHITE);
        // ROOM
        btnRoom.setEnabled(true);
        btnRoom2.setEnabled(true);
        btnRoom2.setForeground(Color.BLACK);
        // EMAIL
        btnMail.setEnabled(true);
        btnMail2.setEnabled(true);
        btnMail2.setForeground(Color.BLACK);
        // People Detail Button
        btnPeopleDetail.setEnabled(true);
        btnPeopleDetail2.setEnabled(true);
        btnPeopleDetail2.setForeground(Color.BLACK);
        pnContent.updateUI();
    }//GEN-LAST:event_btnAnnounceActionPerformed

    private void btnAnnounce2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnounce2ActionPerformed
        btnAnnounceActionPerformed(evt);
        
    }//GEN-LAST:event_btnAnnounce2ActionPerformed

    private void btnPeopleDetail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleDetail2ActionPerformed
        btnPeopleDetailActionPerformed(evt);
        
    }//GEN-LAST:event_btnPeopleDetail2ActionPerformed

    private void btnMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMailActionPerformed
    PanelRoom pr = ShareData.getInstance().getPr();
    private void btnRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomActionPerformed
        // ROOM
        pr = new PanelRoom();
        pnContent.remove(pr);
        pnContent.remove(pa);
        pnContent.remove(ppd);
        pnContent.add(pr);
        // EMAIL
        btnMail.setEnabled(true);
        btnMail2.setEnabled(true);
        btnMail2.setForeground(Color.BLACK);

        // ANNOUNCE
        btnAnnounce.setEnabled(true);
        btnAnnounce2.setEnabled(true);
        btnAnnounce2.setForeground(Color.BLACK);
        // PEOPLE
        btnPeopleDetail.setEnabled(true);
        btnPeopleDetail2.setEnabled(true);
        btnPeopleDetail2.setForeground(Color.BLACK);
        // People Detail button DISABLE
        btnRoom.setEnabled(false);
        btnRoom2.setEnabled(false);
        btnRoom2.setForeground(Color.WHITE);
        // ---- //
        pnContent.updateUI();
        
       
    }//GEN-LAST:event_btnRoomActionPerformed

    private void btnRoom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRoom2ActionPerformed

    private void btnMail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMail2ActionPerformed

    private void btnHamburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamburgerActionPerformed
        
    }//GEN-LAST:event_btnHamburgerActionPerformed

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
            java.util.logging.Logger.getLogger(ApartmentManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApartmentManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApartmentManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApartmentManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApartmentManagementForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GBtnAccount;
    private javax.swing.ButtonGroup GBtnAnnounce;
    private javax.swing.ButtonGroup GBtnEmail;
    private javax.swing.ButtonGroup GBtnPeople;
    private org.jdesktop.swingx.JXButton btnAccount;
    private org.jdesktop.swingx.JXButton btnAccount2;
    private org.jdesktop.swingx.JXButton btnAnnounce;
    private org.jdesktop.swingx.JXButton btnAnnounce2;
    private org.jdesktop.swingx.JXButton btnHamburger;
    private org.jdesktop.swingx.JXButton btnMail;
    private org.jdesktop.swingx.JXButton btnMail2;
    private org.jdesktop.swingx.JXButton btnPeopleDetail;
    private org.jdesktop.swingx.JXButton btnPeopleDetail2;
    private org.jdesktop.swingx.JXButton btnRoom;
    private org.jdesktop.swingx.JXButton btnRoom2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnAccount;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnResizable;
    private org.jdesktop.swingx.JXTable tblPeopleDetail;
    // End of variables declaration//GEN-END:variables
}
