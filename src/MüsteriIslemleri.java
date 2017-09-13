
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MüsteriIslemleri extends javax.swing.JFrame {

    DefaultTableModel dtm;
    DB db;
    
    public MüsteriIslemleri() {
        initComponents();
        setLocationRelativeTo(null);
        
        dtm = (DefaultTableModel)tbKayit.getModel();
        refreshTable();
     
    }
    
    void refreshTable()
    {
        dtm.setRowCount(0);
        try
        {
            db = new DB();
            ResultSet rs = db.getKayitlar();
          
            while (rs.next())
            {
                Object[] o =
                {
                    rs.getString("tc"),
                    rs.getString("ad"),
                    rs.getString("soyad"),
                    rs.getString("telefon"),
                    rs.getString("email"),
                    rs.getString("kayitTarihi")
                };
                
                dtm.addRow(o);
            }
           
        } catch (Exception e) { e.printStackTrace(); }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbKayit = new javax.swing.JTable();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGüncelle = new javax.swing.JButton();
        btnAriza = new javax.swing.JButton();
        btnRapor = new javax.swing.JButton();
        btnAnaSayfa1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbKayit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC", "AD", "SOYAD", "TELEFON", "EMAIL", "KAYIT TARİHİ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbKayit);

        btnEkle.setText("YENİ KAYIT EKLE");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnSil.setText("SİL");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnGüncelle.setText("GÜNCELLE");
        btnGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGüncelleActionPerformed(evt);
            }
        });

        btnAriza.setText("ARIZA KAYDI AL");
        btnAriza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArizaActionPerformed(evt);
            }
        });

        btnRapor.setText("TEKNİK SERVİS RAPORU");
        btnRapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaporActionPerformed(evt);
            }
        });

        btnAnaSayfa1.setText("ANA SAYFAYA DÖN");
        btnAnaSayfa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaSayfa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAriza, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRapor, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnaSayfa1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAriza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAnaSayfa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGüncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRapor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed

        MüsteriKayit mf = new MüsteriKayit();
        mf.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        try {
            JOptionPane.showMessageDialog(rootPane, "Kaydı Silmek İstediğinizden Emin misiniz?");
            int value = tbKayit.getSelectedRow();
            String tc = tbKayit.getValueAt(value, 0).toString();
            
            String sql = "DELETE FROM Müsteriler WHERE tc = " + "'" + tc + "'";
            System.out.println(sql);
            db.qWNR(sql);
            refreshTable();
            
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(MüsteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnArizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArizaActionPerformed
       int value = tbKayit.getSelectedRow();
       String mTc = ""+tbKayit.getValueAt(value, 0);
       String mAd = ""+tbKayit.getValueAt(value, 1);
      // String mSikayet = ""+tbKayit.getValueAt(value, 3);
       
      // ArizaDurumKayit adk = new ArizaDurumKayit(mTc, mAd, mSikayet.equals("null")?"":mSikayet);
      ArizaDurumKayit adk = new ArizaDurumKayit(mTc, mAd);
       adk.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnArizaActionPerformed

    private void btnGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGüncelleActionPerformed

            int value = tbKayit.getSelectedRow();
            String mTc = "" + tbKayit.getValueAt(value, 0);
            String mAd = "" + tbKayit.getValueAt(value, 1);
            String mSoyad = "" + tbKayit.getValueAt(value, 2);
            
            KayitGuncelle kg = new KayitGuncelle(mTc,mAd,mSoyad);
            kg.setVisible(true);     
    
    }//GEN-LAST:event_btnGüncelleActionPerformed

    private void btnRaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaporActionPerformed
        TeknikRapor tr = new TeknikRapor();
        tr.setVisible(true);
    }//GEN-LAST:event_btnRaporActionPerformed

    private void btnAnaSayfa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaSayfa1ActionPerformed
       AnaSayfa as = new AnaSayfa();
       as.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnAnaSayfa1ActionPerformed

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
            java.util.logging.Logger.getLogger(MüsteriIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MüsteriIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MüsteriIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MüsteriIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MüsteriIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnaSayfa1;
    private javax.swing.JButton btnAriza;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGüncelle;
    private javax.swing.JButton btnRapor;
    private javax.swing.JButton btnSil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKayit;
    // End of variables declaration//GEN-END:variables
}
