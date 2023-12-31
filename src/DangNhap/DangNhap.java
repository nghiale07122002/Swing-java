/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DangNhap;
import Menu.MainForm;
import PRODUCTMANAGER.TV;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DangNhap extends javax.swing.JFrame {
    List<TaiKhoan> list;
    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public List<TaiKhoan> readFile(){
            List<TaiKhoan> ds = new ArrayList<>();
            try {
                FileReader fr = new FileReader("src\\DangNhap\\taikhoan.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = " ";
                while(true){
                    line = br.readLine();
                    if(line == null){
                        break;
                    }
                    String[] txt = line.split("---");
                    String user = txt[0];
                    String pass = txt[1];
                    ds.add(new TaiKhoan(user,pass));
                }
                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ds;
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTaiKhoan = new javax.swing.JTextField();
        jPasswordFieldMatKhau = new javax.swing.JPasswordField();
        jButtonThoat = new javax.swing.JButton();
        jButtonDangNhap = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập ");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 46, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jTextFieldTaiKhoan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jTextFieldTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 221, 26));

        jPasswordFieldMatKhau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPasswordFieldMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 221, 29));

        jButtonThoat.setBackground(new java.awt.Color(51, 153, 255));
        jButtonThoat.setText("Thoát");
        jButtonThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 82, 33));

        jButtonDangNhap.setBackground(new java.awt.Color(255, 0, 51));
        jButtonDangNhap.setForeground(new java.awt.Color(0, 255, 204));
        jButtonDangNhap.setText("Đăng nhập");
        jButtonDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 33));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/vector_noel1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangNhapActionPerformed
        list = readFile();
        String taikhoan = jTextFieldTaiKhoan.getText();
        String matkhau = jPasswordFieldMatKhau.getText();
        if(taikhoan.equals("") || matkhau.equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin","Thông báo",JOptionPane.OK_CANCEL_OPTION);
        }else{
            for(int i=0;i<list.size();i++){
                TaiKhoan tk = list.get(i);
                if(taikhoan.equals(tk.getTk())==true && matkhau.equals(tk.getMk())== true){
                    setVisible(false);
                    new MainForm().setVisible(true);
                    return;
                }  
            }
            JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không chính xác","Thông báo",JOptionPane.OK_CANCEL_OPTION);
            jTextFieldTaiKhoan.setText("");
            jPasswordFieldMatKhau.setText("");
        }
    }//GEN-LAST:event_jButtonDangNhapActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonThoatActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDangNhap;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldMatKhau;
    private javax.swing.JTextField jTextFieldTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
