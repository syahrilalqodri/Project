package projectakhir;
import projectakhir.koneksi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class admin extends javax.swing.JFrame {
private Dimension layar;
private DefaultTableModel Model;

    public admin() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("tabel");
        Model=new DefaultTableModel();
        tabel.setModel(Model);
        
        Model.addColumn("NIM");
        Model.addColumn("Nama");
        Model.addColumn("Jurusan");
        Model.addColumn("Mabna");
        Model.addColumn("Kamar");
        Model.addColumn("Pilihan");
        Model.addColumn("Divisi");
        Model.addColumn("Pengalaman");
        this.AmbilDataBarang();

    }

    public void AmbilDataBarang() {
        //Menghapus Seluruh Data
        Model.getDataVector().removeAllElements();
        //Memberitahu bahwa data kosong
        Model.fireTableDataChanged();
        
        try {
            //Memanggil koneksi :
            Connection c=koneksi.getConnection();
            //Membaca perintah SQL static di JAVA :
            Statement st=c.createStatement();
            //Perintah QUERY :
            String sql = "SELECT * FROM datamuharrik";
            //Menjalankan perintah Query :
            ResultSet rs=st.executeQuery(sql);
            
            while (rs.next()) {
                Object[] o=new Object[8];
                o[0]=rs.getString("NIM");
                o[1]=rs.getString("Nama");
                o[2]=rs.getString("Jurusan");
                o[3]=rs.getString("Mabna");
                o[4]=rs.getString("Kamar");
                o[5]=rs.getString("Pilihan");
                o[6]=rs.getString("Divisi");
                o[7]=rs.getString("Pengalaman");
                Model.addRow(o);
                

            }
        } catch (SQLException e) {
            System.out.println("Terjadi Error dalam pengambilan data"+e);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tnim = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        tjurusan = new javax.swing.JTextField();
        tmabna = new javax.swing.JComboBox<>();
        tkamar = new javax.swing.JTextField();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pil1 = new javax.swing.JRadioButton();
        pil2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tdivisi = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpengalaman = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        tsimpan = new javax.swing.JButton();
        Edit = new javax.swing.JToggleButton();
        Hapus = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA CALON MUHARRIK/AH");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\New folder\\12.png")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jToggleButton4.setText("Reload");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 80, 30));

        jToggleButton6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jToggleButton6.setText("X");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 50, -1, 30));

        jToggleButton7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jToggleButton7.setText("Menu");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 70, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectakhir/1c.png"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel4.setText("NIM");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel5.setText("Jurusan");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel6.setText("Mabna");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel7.setText("Kamar");

        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        tmabna.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        tmabna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Al-Ghazali\t\t", "Ibnu Rusdy", "Ibnu Sina", "Khaldun", "Al-Muhasibi", "Al-Faraby", "Fatimah Az-Zahra", "Ummu Salamah", "Khadijah Al-Kubra", "Asma binti Abu Bakar" }));

        jToggleButton5.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jToggleButton5.setText("Cari");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel13.setText("Silahkan masukkan NIM yang hendak di cari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmabna, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tkamar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tnama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(tjurusan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tnim, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tnim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tmabna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tkamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel12.setText("Prestasi");

        jLabel8.setText("- Data Muharrik/ah-");

        buttonGroup1.add(pil1);
        pil1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        pil1.setText("Muharrik");

        buttonGroup1.add(pil2);
        pil2.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        pil2.setText("Muharrikah");

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel9.setText("Divisi");

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel11.setText("Pengalaman/");

        tdivisi.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        tdivisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ubudiyah", "Taklim Quran", "Taklim Afkar", "Kesantrian", "K3O", "Keamanan", "Bahasa" }));

        tpengalaman.setColumns(20);
        tpengalaman.setLineWrap(true);
        tpengalaman.setRows(5);
        jScrollPane2.setViewportView(tpengalaman);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pil1)
                        .addGap(34, 34, 34)
                        .addComponent(pil2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tdivisi, 0, 125, Short.MAX_VALUE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pil1)
                    .addComponent(pil2))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tdivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tsimpan.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        tsimpan.setText("Simpan");
        tsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsimpanActionPerformed(evt);
            }
        });
        jPanel5.add(tsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 60, 80, 30));

        Edit.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel5.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 70, 30));

        Hapus.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel5.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\New folder\\1b.png")); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel14.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel14.setText("SELAMAT DATANG ADMIN");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(370, 370, 370))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(34, 34, 34)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        this.AmbilDataBarang();

    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        String nim = tnim.getText();
        this.AmbilDataBarang();

        try {
            PreparedStatement statement = koneksi.getConnection().prepareStatement(
                "select* from datamuharrik where NIM = '"+nim+"'");

            ResultSet result = statement.executeQuery();
            if      (result.next()){
                JOptionPane.showMessageDialog(null, "Data telah ditemukan");
                tnama.setText(result.getString("Nama"));
                tjurusan.setText(result.getString("Jurusan"));
                tmabna.setSelectedItem(result.getString("Mabna"));
                tkamar.setText(result.getString("Kamar"));
                if      (result.getString("Pilihan").equals("Muharrik")){pil1.setSelected(true);}
                else if (result.getString("Pilihan").equals("Muharikkah")){pil2.setSelected(true);}
                tdivisi.setSelectedItem(result.getString("Divisi"));
                tpengalaman.setText(result.getString("Pengalaman"));

            }
            else    {JOptionPane.showMessageDialog(null, "Data tidak ditemukan");}

        } catch (Exception e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        String nim = tnim.getText();
        String nama = tnama.getText();
        String jurusan = tjurusan.getText();
        String mabna = tmabna.getSelectedItem().toString();
        String kamar = tkamar.getText();
        String pilihan = null;
        if              (pil1.isSelected()){pilihan="Muharrik"; }
        else if         (pil2.isSelected()){pilihan="Muharrikah"; }
        String divisi = tdivisi.getSelectedItem().toString();
        String pengalaman = tpengalaman.getText();
        
        try {
            PreparedStatement statement = koneksi.getConnection().prepareStatement(
            "update datamuharrik set Nama = ?, Jurusan = ?, Mabna = ?,Kamar=?,Pilihan=?,Divisi=?,Pengalaman=? where NIM = ? ");
            
            statement.setString(1, nama);
            statement.setString(2, jurusan);
            statement.setString(3, mabna);
            statement.setString(4, kamar);
            statement.setString(5, pilihan);
            statement.setString(6, divisi);
            statement.setString(7, pengalaman);
            statement.setString(8, nim);
            
     // supaya seletah simpan data di GUI kosong       
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "data telah diubah");
            tnim.setText(null);
            tnama.setText(null);
            tjurusan.setText(null);
            tmabna.setSelectedItem("Al-Ghazali");
            tkamar.setText(null);
            buttonGroup1.clearSelection();
            tdivisi.setSelectedItem("Ubudiyah");
            tpengalaman.setText(null);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "data gagal diubah");
  
        }
        this.AmbilDataBarang();

    }//GEN-LAST:event_EditActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
       String nim = tnim.getText();
        try {
            PreparedStatement preparedStatement = koneksi.getConnection().prepareStatement(
            " "+"DELETE FROM datamuharrik WHERE NIM = ?");
            preparedStatement.setString(1, nim);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            tnim.setText ("");
            tnama.setText("");
            tjurusan.setText("");
            tmabna.setAction(null);
            tkamar.setText("");
            buttonGroup1.clearSelection();
            tdivisi.setAction(null);
            tpengalaman.setText(" ");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
        this.AmbilDataBarang();

    }//GEN-LAST:event_HapusActionPerformed

    private void tsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsimpanActionPerformed
        String nim = tnim.getText();
        String nama = tnama.getText();
        String jurusan = tjurusan.getText();
        String mabna = tmabna.getSelectedItem().toString();
        String kamar = tkamar.getText();
        String pilihan = null;
        if              (pil1.isSelected()){pilihan="Muharrik"; }
        else if         (pil2.isSelected()){pilihan="Muharrikah"; }
        String divisi = tdivisi.getSelectedItem().toString();
        String pengalaman = tpengalaman.getText();
        
        try {
            PreparedStatement statement = koneksi.getConnection().prepareStatement(
            "insert into datamuharrik values (?,?,?,?,?,?,?,?)");
            
            statement.setString(1, nim);
            statement.setString(2, nama);
            statement.setString(3, jurusan);
            statement.setString(4, mabna);
            statement.setString(5, kamar);
            statement.setString(6, pilihan);
            statement.setString(7, divisi);
            statement.setString(8, pengalaman);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            tnim.setText(null);
            tnama.setText(null);
            tjurusan.setText(null);
            tmabna.setSelectedItem("Al-Ghazali");
            tkamar.setText(null);
            buttonGroup1.clearSelection();
            tdivisi.setSelectedItem("Ubudiyah");
            tpengalaman.setText(null);
           
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "data gagal disimpan");
        }
        this.AmbilDataBarang();

    }//GEN-LAST:event_tsimpanActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        new Start().setVisible(true);
                this.hide();

    }//GEN-LAST:event_jToggleButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Edit;
    private javax.swing.JToggleButton Hapus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JRadioButton pil1;
    private javax.swing.JRadioButton pil2;
    private javax.swing.JTable tabel;
    private javax.swing.JComboBox<String> tdivisi;
    private javax.swing.JTextField tjurusan;
    private javax.swing.JTextField tkamar;
    private javax.swing.JComboBox<String> tmabna;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnim;
    private javax.swing.JTextArea tpengalaman;
    private javax.swing.JButton tsimpan;
    // End of variables declaration//GEN-END:variables
}
