import Helper.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }
    String t;
    int width = 334;
    int height =1000;

    void openPnLogin(){
        pnLogin.setVisible(true);
        pnRegister.setVisible(false);
        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=0;i<=width;i++){

                    pnLoginAndRegister.setSize(i,height);
                    pnLogin.setSize(i,height);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }).start();
    }

    void openPnRegister(){
        pnLogin.setVisible(false);
        pnRegister.setVisible(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=width;i++){

                    pnLoginAndRegister.setSize(i,height);
                    pnRegister.setSize(i,height);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnLoginAndRegister = new javax.swing.JPanel();
        pnLogin = new javax.swing.JPanel();
        lblUserNameInPnLogin = new javax.swing.JLabel();
        txtUserNameInPnLongin = new javax.swing.JTextField();
        lblPasswordPnLogin = new javax.swing.JLabel();
        txtPasswordInPnLogin = new javax.swing.JPasswordField();
        btnConfirmInPnLogin = new javax.swing.JButton();
        btbExitInPnLogin = new javax.swing.JButton();
        show = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pnRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUserNameInPnRegister = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        btnExitPnRegister = new javax.swing.JButton();
        txtPasswordInPnRegister = new javax.swing.JPasswordField();
        Show1 = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36,47,65));

        jPanel2.setBackground(new java.awt.Color(97,212,195));

        btnlogin.setText("Đăng Nhập");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnRegister.setText("Đăng Kí");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("welcome");

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("back");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/T/Icon/icons8-close-window-50.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(btnlogin)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegister)
                                        .addComponent(btnlogin))
                                .addGap(53, 53, 53)
                                .addComponent(jLabel6))
        );

        pnLoginAndRegister.setBackground(new java.awt.Color(36,47,65));
        pnLoginAndRegister.setLayout(new java.awt.CardLayout());

        pnLogin.setBackground(new java.awt.Color(36,47,65));

        lblUserNameInPnLogin.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblUserNameInPnLogin.setForeground(new java.awt.Color(102, 102, 102));
        lblUserNameInPnLogin.setText("Tên Đăng Nhập :");

        txtUserNameInPnLongin.setBackground(new java.awt.Color(36,47,65));
        txtUserNameInPnLongin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUserNameInPnLongin.setForeground(new java.awt.Color(255, 255, 255));
        txtUserNameInPnLongin.setBorder(null);

        lblPasswordPnLogin.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblPasswordPnLogin.setForeground(new java.awt.Color(102, 102, 102));
        lblPasswordPnLogin.setText("Mật Khẩu :");

        txtPasswordInPnLogin.setBackground(new java.awt.Color(36,47,65));
        txtPasswordInPnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPasswordInPnLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordInPnLogin.setBorder(null);

        btnConfirmInPnLogin.setText("Xác Nhận ");
        btnConfirmInPnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmInPnLoginActionPerformed(evt);
            }
        });

        btbExitInPnLogin.setText("Thoát");
        btbExitInPnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbExitInPnLoginActionPerformed(evt);
            }
        });

        show.setForeground(new java.awt.Color(0, 153, 153));
        show.setText("Show Password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator2.setBackground(new java.awt.Color(204, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
                pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(pnLoginLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtUserNameInPnLongin, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnLoginLayout.createSequentialGroup()
                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnLoginLayout.createSequentialGroup()
                                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnLoginLayout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addComponent(btnConfirmInPnLogin)
                                                                .addGap(54, 54, 54)
                                                                .addComponent(btbExitInPnLogin))
                                                        .addGroup(pnLoginLayout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addComponent(lblUserNameInPnLogin)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(pnLoginLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator2)
                                                        .addGroup(pnLoginLayout.createSequentialGroup()
                                                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(pnLoginLayout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(pnLoginLayout.createSequentialGroup()
                                                                                .addGap(8, 8, 8)
                                                                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lblPasswordPnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txtPasswordInPnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        pnLoginLayout.setVerticalGroup(
                pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLoginLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblUserNameInPnLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserNameInPnLongin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(lblPasswordPnLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPasswordInPnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(show)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnConfirmInPnLogin)
                                        .addComponent(btbExitInPnLogin))
                                .addGap(41, 41, 41))
        );

        pnLoginAndRegister.add(pnLogin, "card2");

        pnRegister.setBackground(new java.awt.Color(36,47,65));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Tên Đăng Nhập :");

        txtUserNameInPnRegister.setBackground(new java.awt.Color(36,47,65));
        txtUserNameInPnRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtUserNameInPnRegister.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Mật Khẩu :");

        btnCreateAccount.setText("Tạo Tài Khoản");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnExitPnRegister.setText("Thoát");

        txtPasswordInPnRegister.setBackground(new java.awt.Color(36,47,65));
        txtPasswordInPnRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordInPnRegister.setBorder(null);

        Show1.setForeground(new java.awt.Color(0, 204, 204));
        Show1.setText("Show password");
        Show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRegisterLayout = new javax.swing.GroupLayout(pnRegister);
        pnRegister.setLayout(pnRegisterLayout);
        pnRegisterLayout.setHorizontalGroup(
                pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegisterLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator3))
                                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(btnCreateAccount)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                                .addComponent(btnExitPnRegister)
                                                .addGap(20, 20, 20))
                                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator5)
                                                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                                                .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Show1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(txtPasswordInPnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                                                                        .addComponent(jLabel2))))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtUserNameInPnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jLabel1)
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        pnRegisterLayout.setVerticalGroup(
                pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnRegisterLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserNameInPnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPasswordInPnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(Show1)
                                .addGap(27, 27, 27)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCreateAccount)
                                        .addComponent(btnExitPnRegister))
                                .addGap(26, 26, 26))
        );

        pnLoginAndRegister.add(pnRegister, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnLoginAndRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnLoginAndRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {
        openPnLogin();
    }

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        openPnRegister();
    }

    private void btnConfirmInPnLoginActionPerformed(java.awt.event.ActionEvent evt) {
       StringBuilder sb = new StringBuilder();
        DataValitor.validateEmpty(txtUserNameInPnLongin, sb,"Tên Đăng Nhập Không Được Để Trống");
        DataValitor.validateEmpty(txtPasswordInPnLogin, sb, "Mật Khẩu Không Được Để Trống");
        if(sb.length()>0){
            MessageDialogHelper.showMessageDialog(this, sb.toString(),"Lỗi");
            return ;
        }
        NguoiDungDao dao = new NguoiDungDao();
        try{
//            NguoiDung nd = dao.checkLogin(txtUserNameInPnLongin.getText(),new String(txtPasswordInPnLogin.getPassword()));
            NguoiDung nd = dao.checkLogin(txtUserNameInPnLongin.getText(),new String(txtPasswordInPnLogin.getPassword()));
            if(nd == null){
                MessageDialogHelper.showErrorDialog(this, "Tên Đăng Nhập Hoặc Mật Khẩu Sai", "Lỗi");
            }else{
                ShareData.nguoiDangNhap = nd;
                this.dispose();
                ClientChatter client = new ClientChatter();
                client.setVisible(true);
            }

        }catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this,e.getMessage(), "lỗi");
        }
    }

    private void btbExitInPnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder  sb = new StringBuilder();
        RegularExpression.CheckUserName(txtUserNameInPnRegister,pnRegister);
        DataValitor.validateEmpty(txtUserNameInPnRegister, sb, "Tên Đăng Nhập Không Được Để Trống");
        DataValitor.validateEmpty(txtPasswordInPnRegister, sb, "Mật Khẩu Không Được Để Trống");
        if (sb.length()>0){
            MessageDialogHelper.showErrorDialog(this, sb.toString(), "Lỗi");
            return;
        }
        NguoiDungDao dao = new NguoiDungDao();
        try {

            NguoiDung  nd = dao.CheckRegister(txtUserNameInPnRegister.getText());
            if(nd != null){
                MessageDialogHelper.showErrorDialog(this, "Tên Đăng Nhập Đã Tồn Tại"
                        , "Thông Báo");
                return;
            }
            NguoiDung  nd1 = new NguoiDung();
            nd1.setTenDangNhap(txtUserNameInPnRegister.getText());
            String passWord=PasswordEncoder.encodePassword(txtPasswordInPnRegister.getText());
            nd1.setMatKhau(passWord);
            nd1.setVaiTro("client");

            if(dao.Insert(nd1)){
                MessageDialogHelper.showMessageDialog(this,"Lưu Thành Công","Thông Báo");
            }
            else{
                ShareData.nguoiDangNhap = nd;
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this,e.getMessage(),"Lỗi");
        }
    }

    private void showActionPerformed(java.awt.event.ActionEvent evt) {
        if (show.isSelected()) {
            txtPasswordInPnLogin.setEchoChar((char)0);
        }else {
            txtPasswordInPnLogin.setEchoChar('*');
        }
    }

    private void Show1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (Show1.isSelected()) {
            txtPasswordInPnRegister.setEchoChar((char)0);
        }else {
            txtPasswordInPnRegister.setEchoChar('*');
        }
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JCheckBox Show1;
    private javax.swing.JButton btbExitInPnLogin;
    private javax.swing.JButton btnConfirmInPnLogin;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnExitPnRegister;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblPasswordPnLogin;
    private javax.swing.JLabel lblUserNameInPnLogin;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnLoginAndRegister;
    private javax.swing.JPanel pnRegister;
    private javax.swing.JCheckBox show;
    private javax.swing.JPasswordField txtPasswordInPnLogin;
    private javax.swing.JPasswordField txtPasswordInPnRegister;
    private javax.swing.JTextField txtUserNameInPnLongin;
    private javax.swing.JTextField txtUserNameInPnRegister;
    // End of variables declaration
}
