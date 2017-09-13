
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class TeknikServis extends javax.swing.JFrame {

    DefaultTableModel dtm;
    DB db;
    
    public TeknikServis() {
        initComponents();
        setLocationRelativeTo(null);
        
        dtm = (DefaultTableModel)tbTeknikServis.getModel();
        refreshTable();
    }

        void refreshTable()
    {
        dtm.setRowCount(0);
        try
        {
            db = new DB();
            ResultSet rs = db.getArizalar();
            
            while (rs.next())
            {
                Object[] o =
                {
                    rs.getString("tc"),
                    rs.getString("sikayet"), 
                    rs.getString("cMarka"),
                    rs.getString("cModel"),
                    rs.getString("seriNo"),
                    rs.getString("müsteriOnayi"),
                    rs.getString("sikayetTarih")
                };
                
                dtm.addRow(o);
            }
        } catch (Exception e) { e.printStackTrace(); }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        cbGaranti = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbOnInceleme = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtTamirSüresi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTeslimTarihi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMaliyet = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTeknikServis = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDetay = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Garanti Kapsamında Mı:");

        cbGaranti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EVET", "HAYIR", " " }));

        jLabel5.setText("Ön İnceleme Yapıldı Mı:");

        cbOnInceleme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EVET", "HAYIR", "BEKLEMEDE", " " }));

        jLabel6.setText("Cihaz Tamir Süresi:");

        jLabel7.setText("Cihaz Teslim Tarihi:");

        jLabel8.setText("Maliyet:");

        jButton1.setText("Müşteri Hizmetlerine Gönder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbTeknikServis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC", "Şikayet", "Marka", "Model", "Seri No", "Müşteri Onayı", "Şikayet Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTeknikServis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTeknikServisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbTeknikServis);

        taDetay.setColumns(20);
        taDetay.setRows(5);
        jScrollPane1.setViewportView(taDetay);

        jLabel1.setText("Şikayet Detayı:");

        jButton2.setText("ÇIKIŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(315, 315, 315))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTeslimTarihi, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTamirSüresi, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbOnInceleme, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbGaranti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbGaranti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbOnInceleme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTamirSüresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTeslimTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMaliyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        try {        
            int value = tbTeknikServis.getSelectedRow();
            String mTc = ""+tbTeknikServis.getValueAt(value, 0);
            String mSikayet= ""+tbTeknikServis.getValueAt(value, 1);
            Object garanti = cbGaranti.getSelectedItem();
            String garantiVar = garanti.toString();
            Object inceleme = cbOnInceleme.getSelectedItem();
            String önInceleme = inceleme.toString();
            String tamirSüresi = txtTamirSüresi.getText();
            String teslimTarihi = txtTeslimTarihi.getText();
            String maliyet = txtMaliyet.getText();

            String sql = "insert into TeknikServis (tc, sikayet, garantiDurumu, önInceleme, tamirSüresi, teslimTarihi, maliyet) values ('%s', '%s', '%s', '%s', '%s', '%s', '%s')";
            sql = String.format(sql, mTc, mSikayet, garantiVar, önInceleme, tamirSüresi, teslimTarihi, maliyet);
            db.qWNR(sql);
        } catch (Exception ex) {
            Logger.getLogger(TeknikServis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AnaSayfa as = new AnaSayfa();
        as.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbTeknikServisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTeknikServisMouseClicked

        int value = tbTeknikServis.getSelectedRow();
        String sikayetDetay= ""+tbTeknikServis.getValueAt(value, 1);
        taDetay.setText(sikayetDetay);
    }//GEN-LAST:event_tbTeknikServisMouseClicked

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
            java.util.logging.Logger.getLogger(TeknikServis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeknikServis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeknikServis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeknikServis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeknikServis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbGaranti;
    private javax.swing.JComboBox<String> cbOnInceleme;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taDetay;
    private javax.swing.JTable tbTeknikServis;
    private javax.swing.JTextField txtMaliyet;
    private javax.swing.JTextField txtTamirSüresi;
    private javax.swing.JTextField txtTeslimTarihi;
    // End of variables declaration//GEN-END:variables
}
