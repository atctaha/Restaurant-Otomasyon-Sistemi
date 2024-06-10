
package login1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;


import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Image;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import raven.datetime.component.date.DatePicker;


public class dashboard extends javax.swing.JFrame {
      private JButton selectImageButton;
      private DatePicker datePicker;
      private DatePicker datePicker2;


    public dashboard() {
        initComponents();
        tabbedpane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        
        tabbedpane.addTab("0", bosekran);//0.index
        
        tabbedpane.addTab("1", urunguncelle); // 1. index        
        tabbedpane.addTab("2", urunsilme); // 2. index        
        tabbedpane.addTab("3", urunekleme); // 3. index   
        
        tabbedpane.addTab("4", profilekle); // 4. index  
        tabbedpane.addTab("5", profilsil); // 5. index 
        tabbedpane.addTab("6", profilduzenle); // 6. index   
        
        tabbedpane.addTab("7",salonayarlari );
        tabbedpane.addTab("8",masaayarlari );
        
        datePicker = new DatePicker();
      
        datePicker.setEditor(date);
        
        datePicker2 = new DatePicker();
        datePicker2.setEditor(date2);
                



        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bosekran = new javax.swing.JPanel();
        urunguncelle = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        urunsilme = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        urunekleme = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        imageAvatar4 = new login1.ImageAvatar();
        jLabel34 = new javax.swing.JLabel();
        profilfoto = new javax.swing.JLabel();
        profilekle = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        imageAvatar3 = new login1.ImageAvatar();
        jLabel14 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        profilkaydet3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        date = new javax.swing.JFormattedTextField();
        profilsil = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        profilsil3 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        profilduzenle = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        imageAvatar2 = new login1.ImageAvatar();
        jButton14 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        profilduzenle3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton18 = new javax.swing.JButton();
        date2 = new javax.swing.JFormattedTextField();
        salonayarlari = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        masaayarlari = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        menuyonetimi = new javax.swing.JComboBox<>();
        personelyonetimi = new javax.swing.JComboBox<>();
        raporlar = new javax.swing.JComboBox<>();
        masayonetimi = new javax.swing.JComboBox<>();
        kullaniciadi1 = new javax.swing.JLabel();
        görev1 = new javax.swing.JLabel();
        cikisyap = new javax.swing.JButton();
        kullaniciadi2 = new javax.swing.JLabel();
        gorev2 = new javax.swing.JLabel();
        imageAvatar1 = new login1.ImageAvatar();
        jPanel2 = new javax.swing.JPanel();
        tabbedpane = new javax.swing.JTabbedPane();

        bosekran.setPreferredSize(new java.awt.Dimension(840, 600));

        javax.swing.GroupLayout bosekranLayout = new javax.swing.GroupLayout(bosekran);
        bosekran.setLayout(bosekranLayout);
        bosekranLayout.setHorizontalGroup(
            bosekranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        bosekranLayout.setVerticalGroup(
            bosekranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        urunguncelle.setPreferredSize(new java.awt.Dimension(680, 600));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setText("Ürün Seç:");

        jButton11.setBackground(new java.awt.Color(51, 255, 51));
        jButton11.setText("Güncelle");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kategori", "Ana Yemek", " " }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ürün", "Adana" }));

        jLabel26.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel26.setText("ÜRÜN GÜNCELLE");

        javax.swing.GroupLayout urunguncelleLayout = new javax.swing.GroupLayout(urunguncelle);
        urunguncelle.setLayout(urunguncelleLayout);
        urunguncelleLayout.setHorizontalGroup(
            urunguncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, urunguncelleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(268, 268, 268))
            .addGroup(urunguncelleLayout.createSequentialGroup()
                .addGroup(urunguncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(urunguncelleLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(urunguncelleLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(urunguncelleLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        urunguncelleLayout.setVerticalGroup(
            urunguncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urunguncelleLayout.createSequentialGroup()
                .addGroup(urunguncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(urunguncelleLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(urunguncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, urunguncelleLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(jButton11)
                .addGap(43, 43, 43)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("Ürün Seç:");

        jButton10.setBackground(new java.awt.Color(51, 255, 51));
        jButton10.setText("Sil");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kategori", "Ana Yemek" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ürün", "Adana" }));

        jLabel25.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel25.setText("ÜRÜN SİL");

        javax.swing.GroupLayout urunsilmeLayout = new javax.swing.GroupLayout(urunsilme);
        urunsilme.setLayout(urunsilmeLayout);
        urunsilmeLayout.setHorizontalGroup(
            urunsilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, urunsilmeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(urunsilmeLayout.createSequentialGroup()
                .addGroup(urunsilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(urunsilmeLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(urunsilmeLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(urunsilmeLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        urunsilmeLayout.setVerticalGroup(
            urunsilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urunsilmeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(urunsilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jButton10)
                .addGap(43, 43, 43)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("Menü");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Ürün Adı:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Alış Fiyatı:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Satış Fiyatı:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Açıklama:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Ürün Resmi:");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Ana Yemek");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setText("Salata");

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setText("Sıcak İçecekler");

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setText("Çorbalar");

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setText("Ara Sıcak");

        jButton6.setBackground(new java.awt.Color(51, 255, 51));
        jButton6.setText("Soğuk İçecekler");

        jButton7.setBackground(new java.awt.Color(51, 255, 51));
        jButton7.setText("Tatlılar");

        jButton8.setBackground(new java.awt.Color(51, 255, 51));
        jButton8.setText("Test");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton9.setText("Dosya Seç");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(51, 255, 51));
        jButton19.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton19.setText("EKLE");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel24.setText("ÜRÜN EKLE");

        imageAvatar4.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/yemek.png"))); // NOI18N

        javax.swing.GroupLayout uruneklemeLayout = new javax.swing.GroupLayout(urunekleme);
        urunekleme.setLayout(uruneklemeLayout);
        uruneklemeLayout.setHorizontalGroup(
            uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uruneklemeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uruneklemeLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(uruneklemeLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(uruneklemeLayout.createSequentialGroup()
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8))
                                    .addGroup(uruneklemeLayout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton7))))
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(uruneklemeLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, uruneklemeLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, uruneklemeLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(uruneklemeLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(uruneklemeLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(imageAvatar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(uruneklemeLayout.createSequentialGroup()
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(uruneklemeLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        uruneklemeLayout.setVerticalGroup(
            uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uruneklemeLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton8)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(uruneklemeLayout.createSequentialGroup()
                        .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageAvatar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(uruneklemeLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(uruneklemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(uruneklemeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9))
                            .addGroup(uruneklemeLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        profilfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/yemek.png"))); // NOI18N
        profilfoto.setText("jLabel1");

        profilekle.setPreferredSize(new java.awt.Dimension(840, 600));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setText("İsim ");

        jTextField7.setText("admin");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setText("Doğum Günü");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setText("Soyisim");

        jTextField9.setText("admin");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setText("Telefon Numarası");

        jTextField10.setText("+90 555 444 33 22");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton12.setText("Fotoğraf Ekle");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        imageAvatar3.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/yemek.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel14.setText("PROFİL EKLE");

        jButton13.setBackground(new java.awt.Color(51, 255, 51));
        jButton13.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton13.setText("KAYDET");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel23.setText("Görev");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşçı", "Garson", "Yönetici" }));

        javax.swing.GroupLayout profilekleLayout = new javax.swing.GroupLayout(profilekle);
        profilekle.setLayout(profilekleLayout);
        profilekleLayout.setHorizontalGroup(
            profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilekleLayout.createSequentialGroup()
                .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilekleLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilekleLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton12))
                            .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date))
                        .addGap(64, 64, 64)
                        .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13)
                                .addComponent(jTextField9)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(profilekleLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilekleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(profilkaydet3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        profilekleLayout.setVerticalGroup(
            profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilekleLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(profilekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilekleLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(profilkaydet3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilekleLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilekleLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addGap(287, 287, 287))
        );

        profilsil.setPreferredSize(new java.awt.Dimension(840, 600));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel15.setText("PROFİL SİL");

        jLabel16.setText("Profil Seç:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garson" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşçı" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yönetici", "admin", "admin2" }));

        jButton16.setBackground(new java.awt.Color(51, 255, 51));
        jButton16.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton16.setText("SİL");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("SEÇ");

        javax.swing.GroupLayout profilsilLayout = new javax.swing.GroupLayout(profilsil);
        profilsil.setLayout(profilsilLayout);
        profilsilLayout.setHorizontalGroup(
            profilsilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilsilLayout.createSequentialGroup()
                .addGroup(profilsilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilsilLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(profilsilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(profilsilLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(profilsilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(profilsilLayout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(profilsilLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton17))))))
                    .addGroup(profilsilLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(profilsil3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profilsilLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        profilsilLayout.setVerticalGroup(
            profilsilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilsilLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(profilsilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(164, 164, 164)
                .addComponent(jButton17)
                .addGap(26, 26, 26)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profilsil3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        profilduzenle.setPreferredSize(new java.awt.Dimension(840, 600));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setText("PROFİL DÜZENLE");

        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/yemek.png"))); // NOI18N

        jButton14.setText("Fotoğraf Seç");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel18.setText("İsim");

        jTextField11.setText("admin2");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel19.setText("Doğum Günü");

        jLabel20.setText("Soyisim");

        jTextField13.setText("admin2");

        jTextField14.setText("+90 555 444 33 11");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel21.setText("Telefon Numarası");

        jButton15.setBackground(new java.awt.Color(51, 255, 51));
        jButton15.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton15.setText("DÜZENLE");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel22.setText("Profil Seç:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aşçı" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garson" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yönetici", "admin", "admin2" }));

        jButton18.setText("SEÇ");

        javax.swing.GroupLayout profilduzenleLayout = new javax.swing.GroupLayout(profilduzenle);
        profilduzenle.setLayout(profilduzenleLayout);
        profilduzenleLayout.setHorizontalGroup(
            profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilduzenleLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(profilduzenleLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18)
                            .addGroup(profilduzenleLayout.createSequentialGroup()
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(profilduzenleLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14))
                .addGap(119, 119, 119)
                .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilduzenle3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(profilduzenleLayout.createSequentialGroup()
                        .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilduzenleLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(69, 69, 69)
                        .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jTextField13)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilduzenleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addGap(309, 309, 309))
        );
        profilduzenleLayout.setVerticalGroup(
            profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilduzenleLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel17)
                .addGap(50, 50, 50)
                .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilduzenleLayout.createSequentialGroup()
                        .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14))
                    .addGroup(profilduzenleLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(profilduzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profilduzenle3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        salonayarlari.setPreferredSize(new java.awt.Dimension(840, 600));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("SALON EKLE");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel27.setText("SALON SİL");

        jLabel28.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel28.setText("SALON DÜZENLE");

        jLabel29.setText("Salon adı:");

        jButton24.setBackground(new java.awt.Color(51, 255, 51));
        jButton24.setText("EKLE");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jButton24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton24KeyPressed(evt);
            }
        });

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bahçe", "Zemin" }));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bahçe ", "Zemin" }));

        jButton20.setBackground(new java.awt.Color(51, 255, 51));
        jButton20.setText("SİL");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(51, 255, 51));
        jButton21.setText("DÜZENLE");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("SEÇ");

        jButton23.setText("SEÇ");

        javax.swing.GroupLayout salonayarlariLayout = new javax.swing.GroupLayout(salonayarlari);
        salonayarlari.setLayout(salonayarlariLayout);
        salonayarlariLayout.setHorizontalGroup(
            salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salonayarlariLayout.createSequentialGroup()
                .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(salonayarlariLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(salonayarlariLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel7))
                            .addGroup(salonayarlariLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton24))))
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20)
                            .addComponent(jButton22))
                        .addGap(102, 102, 102)
                        .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jButton23)
                            .addComponent(jButton21)))
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salonayarlariLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        salonayarlariLayout.setVerticalGroup(
            salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salonayarlariLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton22)
                        .addGap(60, 60, 60)
                        .addComponent(jButton20))
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(salonayarlariLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(30, 30, 30)
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton23))
                            .addGroup(salonayarlariLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)))
                            .addGroup(salonayarlariLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jButton24)))
                        .addGap(60, 60, 60)
                        .addComponent(jButton21)))
                .addGroup(salonayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(salonayarlariLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );

        masaayarlari.setPreferredSize(new java.awt.Dimension(840, 600));

        jLabel30.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel30.setText("MASA EKLE");

        jLabel31.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel31.setText("MASA SİL");

        jLabel32.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel32.setText("MASA DÜZENLE");

        jLabel33.setText("Masa Adı:");

        jButton25.setBackground(new java.awt.Color(51, 255, 51));
        jButton25.setText("EKLE");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masa 1", "Masa 2", "Masa 3", "Masa 4" }));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masa 1", "Masa 2", "Masa 3", "Masa 4" }));

        jButton26.setBackground(new java.awt.Color(51, 255, 51));
        jButton26.setText("SİL");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(51, 255, 51));
        jButton27.setText("DÜZENLE");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("SEÇ");

        jButton29.setText("SEÇ");

        javax.swing.GroupLayout masaayarlariLayout = new javax.swing.GroupLayout(masaayarlari);
        masaayarlari.setLayout(masaayarlariLayout);
        masaayarlariLayout.setHorizontalGroup(
            masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masaayarlariLayout.createSequentialGroup()
                .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton25))
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel30))
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jButton26)
                            .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton28)
                                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(116, 116, 116)
                        .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27)
                            .addComponent(jButton29)))
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        masaayarlariLayout.setVerticalGroup(
            masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masaayarlariLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(masaayarlariLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(29, 29, 29)
                        .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(masaayarlariLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton25)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masaayarlariLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton28)
                                    .addComponent(jButton29))
                                .addGap(26, 26, 26)))
                        .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton26)
                            .addComponent(jButton27))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masaayarlariLayout.createSequentialGroup()
                        .addGroup(masaayarlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masaayarlariLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );

        jPanel17.setPreferredSize(new java.awt.Dimension(840, 600));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jPanel18.setPreferredSize(new java.awt.Dimension(840, 600));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(841, 603));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        menuyonetimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menü Yönetimi", "Ürün Ekleme", "Ürün Güncelleme", "Ürün Silme" }));
        menuyonetimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuyonetimiActionPerformed(evt);
            }
        });

        personelyonetimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personel yönetimi ", "Profil Ekle ", "Profil Düzenle ", "Profil Sil " }));
        personelyonetimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelyonetimiActionPerformed(evt);
            }
        });

        raporlar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Raporlar", "Günlük Raporlar", "Haftalık Raporlar", "Aylık Raporlar" }));

        masayonetimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masa Yönetimi", "Salon Ayarları", "Masa Ayarları", " " }));
        masayonetimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masayonetimiActionPerformed(evt);
            }
        });

        kullaniciadi1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        kullaniciadi1.setText("Kullanıcı Adı:");

        görev1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        görev1.setText("Görev:");

        cikisyap.setText("Çıkış Yap");
        cikisyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisyapActionPerformed(evt);
            }
        });

        kullaniciadi2.setText("admin");

        gorev2.setText("admin");

        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/yemek.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuyonetimi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personelyonetimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(masayonetimi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(raporlar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 7, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cikisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kullaniciadi1)
                                .addComponent(görev1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(gorev2)
                                .addComponent(kullaniciadi2)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciadi1)
                    .addComponent(kullaniciadi2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(görev1)
                    .addComponent(gorev2))
                .addGap(43, 43, 43)
                .addComponent(menuyonetimi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(personelyonetimi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(masayonetimi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(raporlar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(cikisyap)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 6, 155, 600);

        jPanel2.setLayout(null);
        jPanel2.add(tabbedpane);
        tabbedpane.setBounds(0, -70, 670, 680);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(167, 6, 680, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuyonetimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuyonetimiActionPerformed

        String selectedValue = menuyonetimi.getSelectedItem().toString();
        if (selectedValue.equals("Ürün Güncelleme")) {
            tabbedpane.setSelectedIndex(1);           
        }
        if (selectedValue.equals("Ürün Silme")) {
            tabbedpane.setSelectedIndex(2);            
        }
        if (selectedValue.equals("Ürün Ekleme")) {
            tabbedpane.setSelectedIndex(3);            
        }
               

    }//GEN-LAST:event_menuyonetimiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void personelyonetimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelyonetimiActionPerformed
   
      int selectedValueIndex = personelyonetimi.getSelectedIndex();
     
      if (selectedValueIndex == 1) {
            tabbedpane.setSelectedIndex(4); 
            
        }
        if (selectedValueIndex == 3) {
            tabbedpane.setSelectedIndex(5);            
        }
        if (selectedValueIndex == 2) {
            tabbedpane.setSelectedIndex(6);            
        }
             

    }//GEN-LAST:event_personelyonetimiActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        profilsil3.setText("Profil Başarıyla Silindi!!!");


        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       profilkaydet3.setText("Profil Başarıyla Kaydedildi!!!");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       profilduzenle3.setText("Profil Başarıyla Düzenlendi");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Dosya Seç");
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));

    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try {
            BufferedImage img = ImageIO.read(selectedFile);
            ImageIcon icon = new ImageIcon(img.getScaledInstance(imageAvatar4.getWidth(), imageAvatar4.getHeight(), Image.SCALE_SMOOTH));
            imageAvatar4.setIcon(icon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Fotoğraf Ekle");
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));

    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try {
            BufferedImage img = ImageIO.read(selectedFile);
            ImageIcon icon = new ImageIcon(img.getScaledInstance(imageAvatar3.getWidth(), imageAvatar3.getHeight(), Image.SCALE_SMOOTH));
            imageAvatar3.setIcon(icon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Fotoğraf Seç");
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));

    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try {
            BufferedImage img = ImageIO.read(selectedFile);
            ImageIcon icon = new ImageIcon(img.getScaledInstance(imageAvatar2.getWidth(), imageAvatar2.getHeight(), Image.SCALE_SMOOTH));
            imageAvatar2.setIcon(icon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void masayonetimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masayonetimiActionPerformed
     int selectedValueIndex = masayonetimi.getSelectedIndex();
     
      if (selectedValueIndex == 1) {
            tabbedpane.setSelectedIndex(7); 
            
        }
        if (selectedValueIndex == 2) {
            tabbedpane.setSelectedIndex(8);            
        }
        
             


    }//GEN-LAST:event_masayonetimiActionPerformed

    private void cikisyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisyapActionPerformed
     cıkısyaplogin();

// TODO add your handling code here:
    }//GEN-LAST:event_cikisyapActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

jLabel34.setText("Başarıyla eklendi..");


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
jLabel35.setText("Ürün silindi..");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
jLabel36.setText("ürün güncellendi..");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton24KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24KeyPressed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
jLabel37.setText("Eklendi..");
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
jLabel38.setText("Silindi..");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
jLabel39.setText("Düzenlendi..");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
jLabel40.setText("Eklendi");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
       
        jLabel41.setText("Silindi..");   // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
jLabel42.setText("Düzenlendi..");            // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

 
    public void cıkısyaplogin(){
        this.setVisible(false);
        new login().setVisible(true);
    }
    
    public static void main(String args[]) {
        
         try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bosekran;
    private javax.swing.JButton cikisyap;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JFormattedTextField date2;
    private javax.swing.JLabel gorev2;
    private javax.swing.JLabel görev1;
    private login1.ImageAvatar imageAvatar1;
    private login1.ImageAvatar imageAvatar2;
    private login1.ImageAvatar imageAvatar3;
    private login1.ImageAvatar imageAvatar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel kullaniciadi1;
    private javax.swing.JLabel kullaniciadi2;
    private javax.swing.JPanel masaayarlari;
    private javax.swing.JComboBox<String> masayonetimi;
    private javax.swing.JComboBox<String> menuyonetimi;
    private javax.swing.JComboBox<String> personelyonetimi;
    private javax.swing.JPanel profilduzenle;
    private javax.swing.JLabel profilduzenle3;
    private javax.swing.JPanel profilekle;
    private javax.swing.JLabel profilfoto;
    private javax.swing.JLabel profilkaydet3;
    private javax.swing.JPanel profilsil;
    private javax.swing.JLabel profilsil3;
    private javax.swing.JComboBox<String> raporlar;
    private javax.swing.JPanel salonayarlari;
    private javax.swing.JTabbedPane tabbedpane;
    private javax.swing.JPanel urunekleme;
    private javax.swing.JPanel urunguncelle;
    private javax.swing.JPanel urunsilme;
    // End of variables declaration//GEN-END:variables
}
