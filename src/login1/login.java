package login1;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarculaLaf;
import database.Veritabanı;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class login extends javax.swing.JFrame {
    
    
    public login() {
        new Veritabanı();
        initComponents();
        
        kullaniciadi.putClientProperty("JComponent.roundRect", true);
        sifre.putClientProperty("JComponent.roundRect", true);
        girisyap.putClientProperty("JComponent.roundRect", true);


        
        kullaniciadi.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        sifre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");
        


        kullaniciadi.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        sifre.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true;"+"showCapsLock:true");
        

    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullaniciadi = new javax.swing.JTextField();
        girisyap = new javax.swing.JButton();
        kullaniciaditext = new javax.swing.JLabel();
        sifretext = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sifre = new javax.swing.JPasswordField();
        uyari_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        girisyap.setBackground(new java.awt.Color(51, 255, 51));
        girisyap.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        girisyap.setText("GİRİŞ YAP");
        girisyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisyapActionPerformed(evt);
            }
        });

        kullaniciaditext.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        kullaniciaditext.setText("Kullanıcı Adı:");

        sifretext.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        sifretext.setText("Şifre:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/yemek.png"))); // NOI18N

        uyari_label.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(girisyap))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kullaniciaditext, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sifretext, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kullaniciadi)
                                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uyari_label, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciaditext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifretext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(girisyap)
                .addGap(27, 27, 27)
                .addComponent(uyari_label, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girisyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisyapActionPerformed
        if (kullaniciadi.getText().isEmpty() || sifre.getPassword().length == 0) {
            uyari_label.setText("Lütfen eksik kısımları doldurun!");
            return; // Boş alan varsa, devam etmeyin
        }
        else {
            Veritabanı veritabanı = new Veritabanı();
            if (veritabanı.loginPanel(kullaniciadi.getText(), String.valueOf(sifre.getPassword()))) {
                String kullanici_rolu = veritabanı.getMemberRole(kullaniciadi.getText());
                if (kullanici_rolu.equals("Aşçı")) {
                    loginasci();
                }
                if (kullanici_rolu.equals("Yönetici")) {
                    loginSuccesfullyEvent();
                }      
                if (kullanici_rolu.equals("Garson")) {
                    logingarson();
                }
               
                
               
                
                
            }else {
               uyari_label.setText("Giriş Bilgileriniz Yanlış..");

            }
        }


 
       

    }//GEN-LAST:event_girisyapActionPerformed

    
    public void loginSuccesfullyEvent() {
        this.setVisible(false);
        new dashboard().setVisible(true);
       
    }
    public void loginasci(){
        this.setVisible(false);
        new asciekrani().setVisible(true);
        
    }
    public void logingarson(){
        this.setVisible(false);
        new garsonekrani().setVisible(true);
        
    }
   
    public static void main(String args[]) {
         try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        
      
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisyap;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kullaniciadi;
    private javax.swing.JLabel kullaniciaditext;
    private javax.swing.JPasswordField sifre;
    private javax.swing.JLabel sifretext;
    private javax.swing.JLabel uyari_label;
    // End of variables declaration//GEN-END:variables
}