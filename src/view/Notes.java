/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connector.Connector;
import controller.NotesController;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Notes extends javax.swing.JFrame {

    public DefaultTableModel tabModel;
    public String judul,desc,tgl;
    public int priority;
    /**
     * Creates new form Notes
     */
    public Notes() {
        initComponents();
        this.judul();
        this.render();    
    }
    
    public void render(){
        Connector connector = new Connector();
        
        //melakukan aksi pada DB
        
         try {
            String query = "SELECT * FROM notes ";
            connector.statement = connector.koneksi.createStatement();
            connector.resultSet = connector.statement.executeQuery(query);
            
            
          tabModel.getDataVector().removeAllElements();
          tabModel.fireTableDataChanged();

          while (connector.resultSet.next()) {
            Object[] data = {
              connector.resultSet.getString("tanggal"),
              connector.resultSet.getString("judul"),
              connector.resultSet.getString("desc"),
              connector.resultSet.getString("prioritas"),
            };

              tabModel.addRow(data);
          }
        } catch(SQLException e) {
        }
    }
    
    public void render_date_asc(){
        Connector connector = new Connector();
        
        //melakukan aksi pada DB
        
         try {
            String query = "SELECT * FROM notes ORDER BY tanggal";
            connector.statement = connector.koneksi.createStatement();
            connector.resultSet = connector.statement.executeQuery(query);
            
            
          tabModel.getDataVector().removeAllElements();
          tabModel.fireTableDataChanged();

          while (connector.resultSet.next()) {
            Object[] data = {
              connector.resultSet.getString("tanggal"),
              connector.resultSet.getString("judul"),
              connector.resultSet.getString("desc"),
              connector.resultSet.getString("prioritas"),
            };

              tabModel.addRow(data);
          }
        } catch(SQLException e) {
        }
    }
    
    public void render_judul_asc(){
         Connector connector = new Connector();
        
        //melakukan aksi pada DB
        
         try {
            String query = "SELECT * FROM notes ORDER BY judul";
            connector.statement = connector.koneksi.createStatement();
            connector.resultSet = connector.statement.executeQuery(query);
            
            
          tabModel.getDataVector().removeAllElements();
          tabModel.fireTableDataChanged();

          while (connector.resultSet.next()) {
            Object[] data = {
              connector.resultSet.getString("tanggal"),
              connector.resultSet.getString("judul"),
              connector.resultSet.getString("desc"),
              connector.resultSet.getString("prioritas"),
            };

              tabModel.addRow(data);
          }
        } catch(SQLException e) {
        }
    }
    
    public void render_now_date(){
        Connector connector = new Connector();
        System.out.println(java.time.LocalDate.now());
        
        //melakukan aksi pada DB
        
         try {
            String query = "SELECT * FROM notes WHERE `tanggal`= '"+java.time.LocalDate.now()+"' ";
            connector.statement = connector.koneksi.createStatement();
            connector.resultSet = connector.statement.executeQuery(query);
            
            
          tabModel.getDataVector().removeAllElements();
          tabModel.fireTableDataChanged();

          while (connector.resultSet.next()) {
            Object[] data = {
              connector.resultSet.getString("tanggal"),
              connector.resultSet.getString("judul"),
              connector.resultSet.getString("desc"),
              connector.resultSet.getString("prioritas"),
            };

              tabModel.addRow(data);
          }
        } catch(SQLException e) {
        }
    }
    
    public void render_prioritas(){
        Connector connector = new Connector();
        
        //melakukan aksi pada DB
        
         try {
            String query = "SELECT * FROM notes ORDER BY prioritas";
            connector.statement = connector.koneksi.createStatement();
            connector.resultSet = connector.statement.executeQuery(query);
            
            
          tabModel.getDataVector().removeAllElements();
          tabModel.fireTableDataChanged();

          while (connector.resultSet.next()) {
            Object[] data = {
              connector.resultSet.getString("tanggal"),
              connector.resultSet.getString("judul"),
              connector.resultSet.getString("desc"),
              connector.resultSet.getString("prioritas"),
            };

              tabModel.addRow(data);
          }
        } catch(SQLException e) {
        }
    }
    
    public void judul() {
        Object[] judul = {
         "tanggal","judul","desc","prioritas"
        };
        tabModel = new DefaultTableModel(null, judul);
        tableNotes.setModel(tabModel);
        String data;
    } 
    
    public void clear_input(){
        input_judul.setText("");
        input_desc.setText("");
        input_tgl.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNotes = new javax.swing.JTable();
        desc_titile = new javax.swing.JLabel();
        input_judul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_desc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        input_tgl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        filter_now = new javax.swing.JButton();
        filter_tgl = new javax.swing.JButton();
        filter_judul = new javax.swing.JButton();
        filter_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        filter_poin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableNotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Tangggal", "Judul", "Deskripsi", "Prioritas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNotesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNotes);
        if (tableNotes.getColumnModel().getColumnCount() > 0) {
            tableNotes.getColumnModel().getColumn(0).setResizable(false);
            tableNotes.getColumnModel().getColumn(3).setResizable(false);
            tableNotes.getColumnModel().getColumn(4).setResizable(false);
        }

        desc_titile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        desc_titile.setText("Input Notes");

        input_judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_judulActionPerformed(evt);
            }
        });

        jLabel2.setText("Judul");

        input_desc.setColumns(20);
        input_desc.setRows(5);
        jScrollPane2.setViewportView(input_desc);

        jLabel3.setText("Deskripsi");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel4.setText("Tanggal");

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        filter_now.setText("Hari ini");
        filter_now.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_nowActionPerformed(evt);
            }
        });

        filter_tgl.setText("Tanggal");
        filter_tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_tglActionPerformed(evt);
            }
        });

        filter_judul.setText("Judul");
        filter_judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_judulActionPerformed(evt);
            }
        });

        filter_label.setText("Filter : ");

        jLabel1.setText("yyyy-mm-dd");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Prioritas");

        filter_poin.setText("Prioritas");
        filter_poin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_poinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(filter_label)
                        .addGap(88, 222, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(filter_now)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filter_tgl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filter_judul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filter_poin)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(desc_titile)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(input_judul)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_update))
                            .addComponent(input_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton3)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(desc_titile)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(input_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_simpan)
                                    .addComponent(btn_update))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_hapus)
                                    .addComponent(btn_batal)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filter_now)
                            .addComponent(filter_tgl)
                            .addComponent(filter_judul)
                            .addComponent(filter_poin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filter_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_judulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_judulActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        judul = input_judul.getText();
        desc = input_desc.getText();
        tgl = input_tgl.getText();
        
        NotesController notes = new NotesController();
       notes.save(judul,desc,tgl,priority);
       this.clear_input();
       this.render();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tableNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNotesMouseClicked
        // TODO add your handling code here:
        input_judul.setText(tableNotes.getValueAt(tableNotes.getSelectedRow(), 1).toString());
        input_desc.setText(tableNotes.getValueAt(tableNotes.getSelectedRow(), 2).toString());
        input_tgl.setText(tableNotes.getValueAt(tableNotes.getSelectedRow(), 0).toString());
        desc_titile.setText("Edit Notes");
    }//GEN-LAST:event_tableNotesMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        judul = input_judul.getText();
        NotesController notes = new NotesController();
       notes.delete(judul);
       this.clear_input();
       this.render();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String judul_old;
        judul_old = tableNotes.getValueAt(tableNotes.getSelectedRow(), 1).toString();
        judul = input_judul.getText();
        desc = input_desc.getText();
        tgl = input_tgl.getText();
        NotesController notes = new NotesController();
        notes.update(judul_old,judul,desc,tgl,priority);
        this.clear_input();
        this.render();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void filter_nowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_nowActionPerformed
        // TODO add your handling code here:
        this.render_now_date();
        filter_label.setText("Tugas Deadline Hari Ini");
    }//GEN-LAST:event_filter_nowActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        this.clear_input();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void filter_tglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_tglActionPerformed
        // TODO add your handling code here:
        this.render_date_asc();
        filter_label.setText("Mengurutkan tugas berdasarkan tanggal");
    }//GEN-LAST:event_filter_tglActionPerformed

    private void filter_judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_judulActionPerformed
        // TODO add your handling code here:
        this.render_judul_asc();
        filter_label.setText("Mengurutkan tugas berdasarkan judul");
    }//GEN-LAST:event_filter_judulActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        priority = 1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        priority = 2;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        priority = 3;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void filter_poinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_poinActionPerformed
        // TODO add your handling code here:
         this.render_prioritas();
         filter_label.setText("Mengurutkan tugas berdasarkan nilai prioritas");
    }//GEN-LAST:event_filter_poinActionPerformed

    
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
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel desc_titile;
    private javax.swing.JButton filter_judul;
    private javax.swing.JLabel filter_label;
    private javax.swing.JButton filter_now;
    private javax.swing.JButton filter_poin;
    private javax.swing.JButton filter_tgl;
    private javax.swing.JTextArea input_desc;
    private javax.swing.JTextField input_judul;
    private javax.swing.JTextField input_tgl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableNotes;
    // End of variables declaration//GEN-END:variables
}
