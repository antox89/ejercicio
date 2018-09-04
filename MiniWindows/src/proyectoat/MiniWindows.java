package proyectoat;

import java.io.File;
import javax.swing.JOptionPane;

public class MiniWindows extends javax.swing.JFrame {

    public MiniWindows() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);

        jmi_logout.setEnabled(false);
        jm_admin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_explorer = new javax.swing.JDialog();
        jd_editorTexto = new javax.swing.JDialog();
        jd_visorImagenes = new javax.swing.JDialog();
        jd_agenda = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jd_shell = new javax.swing.JDialog();
        jd_reproductor = new javax.swing.JDialog();
        jd_messenger = new javax.swing.JDialog();
        jd_redSocial = new javax.swing.JDialog();
        jd_netbeens = new javax.swing.JDialog();
        jd_login = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_login_user = new javax.swing.JTextField();
        bt_login_in = new javax.swing.JButton();
        bt_login_xl = new javax.swing.JButton();
        tf_login_password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jl_tb_explorer = new javax.swing.JLabel();
        jl_tb_text = new javax.swing.JLabel();
        jl_tb_pics = new javax.swing.JLabel();
        jl_tb_agenda = new javax.swing.JLabel();
        jl_tb_cmd = new javax.swing.JLabel();
        jl_tb_player = new javax.swing.JLabel();
        jl_tb_msgr = new javax.swing.JLabel();
        jl_tb_socialnet = new javax.swing.JLabel();
        jl_tb_netbeens = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_start = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jm_admin = new javax.swing.JMenu();

        jd_explorer.setTitle("Explorador");

        javax.swing.GroupLayout jd_explorerLayout = new javax.swing.GroupLayout(jd_explorer.getContentPane());
        jd_explorer.getContentPane().setLayout(jd_explorerLayout);
        jd_explorerLayout.setHorizontalGroup(
            jd_explorerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_explorerLayout.setVerticalGroup(
            jd_explorerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_editorTexto.setTitle("Editor de Texto");

        javax.swing.GroupLayout jd_editorTextoLayout = new javax.swing.GroupLayout(jd_editorTexto.getContentPane());
        jd_editorTexto.getContentPane().setLayout(jd_editorTextoLayout);
        jd_editorTextoLayout.setHorizontalGroup(
            jd_editorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_editorTextoLayout.setVerticalGroup(
            jd_editorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_visorImagenes.setTitle("Imágenes");

        javax.swing.GroupLayout jd_visorImagenesLayout = new javax.swing.GroupLayout(jd_visorImagenes.getContentPane());
        jd_visorImagenes.getContentPane().setLayout(jd_visorImagenesLayout);
        jd_visorImagenesLayout.setHorizontalGroup(
            jd_visorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_visorImagenesLayout.setVerticalGroup(
            jd_visorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_agenda.setTitle("Agenda");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_agendaLayout = new javax.swing.GroupLayout(jd_agenda.getContentPane());
        jd_agenda.getContentPane().setLayout(jd_agendaLayout);
        jd_agendaLayout.setHorizontalGroup(
            jd_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_agendaLayout.setVerticalGroup(
            jd_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_shell.setTitle("Terminal");

        javax.swing.GroupLayout jd_shellLayout = new javax.swing.GroupLayout(jd_shell.getContentPane());
        jd_shell.getContentPane().setLayout(jd_shellLayout);
        jd_shellLayout.setHorizontalGroup(
            jd_shellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_shellLayout.setVerticalGroup(
            jd_shellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_reproductor.setTitle("Music Player");

        javax.swing.GroupLayout jd_reproductorLayout = new javax.swing.GroupLayout(jd_reproductor.getContentPane());
        jd_reproductor.getContentPane().setLayout(jd_reproductorLayout);
        jd_reproductorLayout.setHorizontalGroup(
            jd_reproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_reproductorLayout.setVerticalGroup(
            jd_reproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_messenger.setTitle("Messenger");

        javax.swing.GroupLayout jd_messengerLayout = new javax.swing.GroupLayout(jd_messenger.getContentPane());
        jd_messenger.getContentPane().setLayout(jd_messengerLayout);
        jd_messengerLayout.setHorizontalGroup(
            jd_messengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_messengerLayout.setVerticalGroup(
            jd_messengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_redSocial.setTitle("SocialNet");

        javax.swing.GroupLayout jd_redSocialLayout = new javax.swing.GroupLayout(jd_redSocial.getContentPane());
        jd_redSocial.getContentPane().setLayout(jd_redSocialLayout);
        jd_redSocialLayout.setHorizontalGroup(
            jd_redSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_redSocialLayout.setVerticalGroup(
            jd_redSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_netbeens.setTitle("NetbEEns");

        javax.swing.GroupLayout jd_netbeensLayout = new javax.swing.GroupLayout(jd_netbeens.getContentPane());
        jd_netbeens.getContentPane().setLayout(jd_netbeensLayout);
        jd_netbeensLayout.setHorizontalGroup(
            jd_netbeensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_netbeensLayout.setVerticalGroup(
            jd_netbeensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_login.setTitle("Log In");

        jLabel1.setText("Usuario:");

        jLabel2.setText("Password:");

        bt_login_in.setText("Ingresar");
        bt_login_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_login_inMouseClicked(evt);
            }
        });

        bt_login_xl.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_login_xl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_login_in))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_login_user, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(tf_login_password))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_login_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_login_in)
                    .addComponent(bt_login_xl))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        jl_tb_explorer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_explorer.png"))); // NOI18N
        jl_tb_explorer.setToolTipText("FBI");
        jl_tb_explorer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_explorerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_explorerMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_explorerMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_explorer);

        jl_tb_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_text.png"))); // NOI18N
        jl_tb_text.setToolTipText("Editor de Texto");
        jl_tb_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_textMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_textMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_textMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_text);

        jl_tb_pics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_pics.png"))); // NOI18N
        jl_tb_pics.setToolTipText("Imágenes");
        jl_tb_pics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_picsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_picsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_picsMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_pics);

        jl_tb_agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_calendar.png"))); // NOI18N
        jl_tb_agenda.setToolTipText("Agenda y Calendario");
        jl_tb_agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_agendaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_agendaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_agendaMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_agenda);

        jl_tb_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_cmd.png"))); // NOI18N
        jl_tb_cmd.setToolTipText("Terminal");
        jl_tb_cmd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_cmdMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_cmdMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_cmdMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_cmd);

        jl_tb_player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_mplayer.png"))); // NOI18N
        jl_tb_player.setToolTipText("Reproductor");
        jl_tb_player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_playerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_playerMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_playerMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_player);

        jl_tb_msgr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_msg.png"))); // NOI18N
        jl_tb_msgr.setToolTipText("Messenger");
        jl_tb_msgr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_msgrMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_msgrMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_msgrMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_msgr);

        jl_tb_socialnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_socialnet.png"))); // NOI18N
        jl_tb_socialnet.setToolTipText("SocialNet");
        jl_tb_socialnet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_socialnetMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_socialnetMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_socialnetMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_socialnet);

        jl_tb_netbeens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_netbeens.png"))); // NOI18N
        jl_tb_netbeens.setToolTipText("NetBeens");
        jl_tb_netbeens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_tb_netbeensMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_tb_netbeensMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_tb_netbeensMouseEntered(evt);
            }
        });
        jToolBar1.add(jl_tb_netbeens);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(964, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jm_start.setText("Start");

        jmi_login.setText("Sign In");
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        jm_start.add(jmi_login);

        jmi_logout.setText("Sign Out");
        jmi_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_logoutActionPerformed(evt);
            }
        });
        jm_start.add(jmi_logout);
        jm_start.add(jSeparator1);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jm_start.add(jMenuItem3);

        jMenuBar1.add(jm_start);

        jm_admin.setText("Administración");
        jMenuBar1.add(jm_admin);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jl_tb_explorerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_explorerMouseClicked
        mostrarFBI();
    }//GEN-LAST:event_jl_tb_explorerMouseClicked

    private void jl_tb_explorerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_explorerMouseEntered
        jl_tb_explorer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_explorer.png")));
    }//GEN-LAST:event_jl_tb_explorerMouseEntered

    private void jl_tb_explorerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_explorerMouseExited
        jl_tb_explorer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_explorer.png")));
    }//GEN-LAST:event_jl_tb_explorerMouseExited


    private void jl_tb_textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_textMouseEntered
        jl_tb_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_text.png")));
    }//GEN-LAST:event_jl_tb_textMouseEntered

    private void jl_tb_textMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_textMouseExited
        jl_tb_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_text.png")));
    }//GEN-LAST:event_jl_tb_textMouseExited

    private void jl_tb_picsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_picsMouseClicked
        mostrarPics();
    }//GEN-LAST:event_jl_tb_picsMouseClicked

    private void jl_tb_picsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_picsMouseEntered
        jl_tb_pics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_pics.png")));
    }//GEN-LAST:event_jl_tb_picsMouseEntered

    private void jl_tb_picsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_picsMouseExited
        jl_tb_pics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_pics.png")));
    }//GEN-LAST:event_jl_tb_picsMouseExited

    private void jl_tb_agendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_agendaMouseClicked
        mostrarAgenda();
    }//GEN-LAST:event_jl_tb_agendaMouseClicked

    private void jl_tb_agendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_agendaMouseEntered
        jl_tb_agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_calendar.png")));
    }//GEN-LAST:event_jl_tb_agendaMouseEntered

    private void jl_tb_agendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_agendaMouseExited
        jl_tb_agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_calendar.png")));
    }//GEN-LAST:event_jl_tb_agendaMouseExited

    private void jl_tb_cmdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_cmdMouseClicked
        mostrarTerminal();
    }//GEN-LAST:event_jl_tb_cmdMouseClicked

    private void jl_tb_cmdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_cmdMouseEntered
        jl_tb_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_cmd.png")));
    }//GEN-LAST:event_jl_tb_cmdMouseEntered

    private void jl_tb_cmdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_cmdMouseExited
        jl_tb_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_cmd.png")));
    }//GEN-LAST:event_jl_tb_cmdMouseExited

    private void jl_tb_playerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_playerMouseClicked
        mostrarPlayer();
    }//GEN-LAST:event_jl_tb_playerMouseClicked

    private void jl_tb_playerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_playerMouseEntered
        jl_tb_player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_mplayer.png")));
    }//GEN-LAST:event_jl_tb_playerMouseEntered

    private void jl_tb_playerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_playerMouseExited
        jl_tb_player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_mplayer.png")));
    }//GEN-LAST:event_jl_tb_playerMouseExited

    private void jl_tb_msgrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_msgrMouseClicked
        mostrarMessenger();
    }//GEN-LAST:event_jl_tb_msgrMouseClicked

    private void jl_tb_msgrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_msgrMouseEntered
        jl_tb_msgr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_msg.png")));
    }//GEN-LAST:event_jl_tb_msgrMouseEntered

    private void jl_tb_msgrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_msgrMouseExited
        jl_tb_msgr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_msg.png")));
    }//GEN-LAST:event_jl_tb_msgrMouseExited

    private void jl_tb_socialnetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_socialnetMouseClicked
        mostrarSocialNet();
    }//GEN-LAST:event_jl_tb_socialnetMouseClicked

    private void jl_tb_socialnetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_socialnetMouseEntered
        jl_tb_socialnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_socialnet.png")));
    }//GEN-LAST:event_jl_tb_socialnetMouseEntered

    private void jl_tb_socialnetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_socialnetMouseExited
        jl_tb_socialnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_socialnet.png")));
    }//GEN-LAST:event_jl_tb_socialnetMouseExited

    private void jl_tb_netbeensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_netbeensMouseClicked
        mostrarNetBeens();
    }//GEN-LAST:event_jl_tb_netbeensMouseClicked

    private void jl_tb_netbeensMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_netbeensMouseEntered
        jl_tb_netbeens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/48x48_netbeens.png")));
    }//GEN-LAST:event_jl_tb_netbeensMouseEntered

    private void jl_tb_netbeensMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_netbeensMouseExited
        jl_tb_netbeens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/45x45_netbeens.png")));
    }//GEN-LAST:event_jl_tb_netbeensMouseExited

    private void jl_tb_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_tb_textMouseClicked
        mostrarTextEdit();
    }//GEN-LAST:event_jl_tb_textMouseClicked

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        login();
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void bt_login_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_login_inMouseClicked

        if (tf_login_user.getText().equals(admin) && tf_login_password.getText().equals(password)) {
            File dir = new File("Z");
            jd_login.dispose();
            
            if (dir.exists()) {
                
                JOptionPane.showMessageDialog(this, "Welcome!" + tf_login_user.getText());
                

            } else {
                
                dir.mkdir();
                JOptionPane.showMessageDialog(this, "Welcome Administrator!");
                
            }

            jm_admin.setVisible(true);
            tf_login_password.setText("");
            tf_login_user.setText("");
            jmi_login.setEnabled(false);
            jmi_logout.setEnabled(true);

        }
    }//GEN-LAST:event_bt_login_inMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "¿Salir del sistema?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        
        if (response == JOptionPane.OK_OPTION) {
            
            if (jmi_login.isEnabled() == false) {
                JOptionPane.showMessageDialog(this, "Primero termine la sesión de usuario");

            }else{
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmi_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_logoutActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "¿Cerrar sesión de Usuario?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            jm_admin.setVisible(false);
            jmi_login.setEnabled(true);
            jmi_logout.setEnabled(false);
        }
    }//GEN-LAST:event_jmi_logoutActionPerformed

    public void login() {
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }

    public void mostrarFBI() {
        jd_explorer.pack();
        jd_explorer.setModal(true);
        jd_explorer.setLocationRelativeTo(this);
        jd_explorer.setVisible(true);
    }

    public void mostrarTextEdit() {
        jd_editorTexto.pack();
        jd_editorTexto.setModal(true);
        jd_editorTexto.setLocationRelativeTo(this);
        jd_editorTexto.setVisible(true);
    }

    public void mostrarAgenda() {
        jd_agenda.pack();
        jd_agenda.setModal(true);
        jd_agenda.setLocationRelativeTo(this);
        jd_agenda.setVisible(true);
    }

    public void mostrarTerminal() {
        jd_shell.pack();
        jd_shell.setModal(true);
        jd_shell.setLocationRelativeTo(this);
        jd_shell.setVisible(true);
    }

    public void mostrarPics() {
        jd_visorImagenes.pack();
        jd_visorImagenes.setModal(true);
        jd_visorImagenes.setLocationRelativeTo(this);
        jd_visorImagenes.setVisible(true);
    }

    public void mostrarPlayer() {
        jd_reproductor.pack();
        jd_reproductor.setModal(true);
        jd_reproductor.setLocationRelativeTo(this);
        jd_reproductor.setVisible(true);
    }

    public void mostrarMessenger() {
        jd_messenger.pack();
        jd_messenger.setModal(true);
        jd_messenger.setLocationRelativeTo(this);
        jd_messenger.setVisible(true);
    }

    public void mostrarSocialNet() {
        jd_redSocial.pack();
        jd_redSocial.setModal(true);
        jd_redSocial.setLocationRelativeTo(this);
        jd_redSocial.setVisible(true);
    }

    public void mostrarNetBeens() {
        jd_netbeens.pack();
        jd_netbeens.setModal(true);
        jd_netbeens.setLocationRelativeTo(this);
        jd_netbeens.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(MiniWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login_in;
    private javax.swing.JButton bt_login_xl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_agenda;
    private javax.swing.JDialog jd_editorTexto;
    private javax.swing.JDialog jd_explorer;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_messenger;
    private javax.swing.JDialog jd_netbeens;
    private javax.swing.JDialog jd_redSocial;
    private javax.swing.JDialog jd_reproductor;
    private javax.swing.JDialog jd_shell;
    private javax.swing.JDialog jd_visorImagenes;
    private javax.swing.JLabel jl_tb_agenda;
    private javax.swing.JLabel jl_tb_cmd;
    private javax.swing.JLabel jl_tb_explorer;
    private javax.swing.JLabel jl_tb_msgr;
    private javax.swing.JLabel jl_tb_netbeens;
    private javax.swing.JLabel jl_tb_pics;
    private javax.swing.JLabel jl_tb_player;
    private javax.swing.JLabel jl_tb_socialnet;
    private javax.swing.JLabel jl_tb_text;
    private javax.swing.JMenu jm_admin;
    private javax.swing.JMenu jm_start;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JPasswordField tf_login_password;
    private javax.swing.JTextField tf_login_user;
    // End of variables declaration//GEN-END:variables

    String admin = "admin", password = "admin";

}
