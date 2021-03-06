package proyectoat;

import java.io.File;
import javax.swing.JOptionPane;
import filesystem.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import messenger.Mensaje;
import messenger.UsuarioMsj;
import messenger.adminUsuariosMsj;

public class MiniWindows extends javax.swing.JFrame {

    int posImg = 0;

    public MiniWindows() {

        initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);

        showImage(posImg);

        adminHora h = new adminHora(jlb_desktop_hora);
        Thread proceso1 = new Thread(h);
        proceso1.start();

        jmi_logout.setEnabled(false);
        //jm_admin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_explorer = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree2 = new javax.swing.JTree();
        jd_editorTexto = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        tbt_b = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jep_texto = new javax.swing.JTextPane();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jd_visorImagenes = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jlb_visor_pic = new javax.swing.JLabel();
        bt_visorimg_antes = new javax.swing.JButton();
        bt_visorimg_despues = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        bt_visorimg_primera = new javax.swing.JButton();
        bt_visorimg_ultima = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jd_agenda = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jSpinField1 = new com.toedter.components.JSpinField();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jd_shell = new javax.swing.JDialog();
        jd_reproductor = new javax.swing.JDialog();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jlb_player_intime = new javax.swing.JLabel();
        jlb_player_outime = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jd_messenger = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_msg_chatfield = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_msg_txt = new javax.swing.JTextArea();
        bt_msg_send = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtree_msg_users = new javax.swing.JTree();
        jLabel7 = new javax.swing.JLabel();
        tf_msg_para = new javax.swing.JTextField();
        bt_msg_select = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jlb_msg_de = new javax.swing.JLabel();
        bt_msg_sendT = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jd_redSocial = new javax.swing.JDialog();
        tpane = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_amigos = new javax.swing.JList<>();
        jButton14 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jlb_redsocial_perfil_pic = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabla_reds_comments = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        ta_reds_perfil_comment = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        bt_reds_perfil_addcomment = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jl_sn_red_users = new javax.swing.JList<>();
        jButton15 = new javax.swing.JButton();
        jd_netbeens = new javax.swing.JDialog();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane16 = new javax.swing.JScrollPane();
        jep_netbeens = new javax.swing.JTextPane();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jmi_netb_save = new javax.swing.JMenuItem();
        jmi_netb_saveas = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jd_login = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_login_user = new javax.swing.JTextField();
        bt_login_in = new javax.swing.JButton();
        bt_login_xl = new javax.swing.JButton();
        tf_login_password = new javax.swing.JPasswordField();
        jd_admin_users = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_admin_agregar_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_admin_agregar_password = new javax.swing.JPasswordField();
        bt_admin_agregar_crearUsuario = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtree_admin_users = new javax.swing.JTree();
        bt_admin_cargar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ppm_desktop = new javax.swing.JPopupMenu();
        jmi_ppm_desktop_bg = new javax.swing.JMenuItem();
        ppm_editor = new javax.swing.JPopupMenu();
        jmi_ppm_copy = new javax.swing.JMenuItem();
        jmi_ppm_cut = new javax.swing.JMenuItem();
        jmi_ppm_paste = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmi_ppm_select = new javax.swing.JMenuItem();
        ppm_chat = new javax.swing.JPopupMenu();
        jmi_ppm_chat = new javax.swing.JMenuItem();
        ppm_generate = new javax.swing.JPopupMenu();
        jmi_ppm_constructor = new javax.swing.JMenuItem();
        jmi_ppm_getter = new javax.swing.JMenuItem();
        jmi_ppm_setter = new javax.swing.JMenuItem();
        jmi_ppm_gs = new javax.swing.JMenuItem();
        jmi_ppm_tostring = new javax.swing.JMenuItem();
        jmi_ppm_AddProperty = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jlb_desktop_user = new javax.swing.JLabel();
        jlb_desktop_hora = new javax.swing.JLabel();
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
        jButton16 = new javax.swing.JButton();
        jlb_bg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_start = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jm_admin = new javax.swing.JMenu();
        jmi_admin_users = new javax.swing.JMenuItem();

        jd_explorer.setTitle("Explorador");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mi PC");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Documentos");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Imagenes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Musica");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Calendario");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mensajes");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Correo");
        treeNode1.add(treeNode2);
        jtree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jtree1);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mi PC");
        tree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(tree2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_explorerLayout = new javax.swing.GroupLayout(jd_explorer.getContentPane());
        jd_explorer.getContentPane().setLayout(jd_explorerLayout);
        jd_explorerLayout.setHorizontalGroup(
            jd_explorerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_explorerLayout.setVerticalGroup(
            jd_explorerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_editorTexto.setTitle("Editor de Texto");

        jLabel5.setText("Formato:");

        jButton1.setText("B");

        jButton2.setText("I");

        jButton3.setText("U");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12 pt", "14 pt", "18 pt", "24 pt", "30 pt" }));

        jLabel6.setText("Tamaño:");

        jButton4.setText("Color");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Sombra");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("HTML");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        tbt_b.setText("B");
        tbt_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbt_bMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tbt_b))
                    .addComponent(jButton6))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton5)
                    .addComponent(tbt_b))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jep_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jep_textoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jep_texto);

        jMenu10.setText("File");

        jMenuItem4.setText("Nuevo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem4);

        jMenuItem5.setText("Guardar");
        jMenu10.add(jMenuItem5);
        jMenu10.add(jSeparator3);

        jMenuItem6.setText("Cerrar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem6);

        jMenuBar7.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar7.add(jMenu11);

        jd_editorTexto.setJMenuBar(jMenuBar7);

        javax.swing.GroupLayout jd_editorTextoLayout = new javax.swing.GroupLayout(jd_editorTexto.getContentPane());
        jd_editorTexto.getContentPane().setLayout(jd_editorTextoLayout);
        jd_editorTextoLayout.setHorizontalGroup(
            jd_editorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jd_editorTextoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_editorTextoLayout.setVerticalGroup(
            jd_editorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_editorTextoLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jd_visorImagenes.setTitle("Imágenes");

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlb_visor_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg/bg_5.jpg"))); // NOI18N
        jlb_visor_pic.setPreferredSize(new java.awt.Dimension(500, 420));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlb_visor_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 912, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlb_visor_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 481, Short.MAX_VALUE)
        );

        bt_visorimg_antes.setText("<<");
        bt_visorimg_antes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_visorimg_antesMouseClicked(evt);
            }
        });

        bt_visorimg_despues.setText(">>");
        bt_visorimg_despues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_visorimg_despuesMouseClicked(evt);
            }
        });

        jButton9.setText("Seleccionar...");

        bt_visorimg_primera.setText("|<");
        bt_visorimg_primera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_visorimg_primeraMouseClicked(evt);
            }
        });

        bt_visorimg_ultima.setText(">|");
        bt_visorimg_ultima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_visorimg_ultimaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(bt_visorimg_primera)
                        .addGap(39, 39, 39)
                        .addComponent(bt_visorimg_antes)
                        .addGap(60, 60, 60)
                        .addComponent(bt_visorimg_despues)
                        .addGap(25, 25, 25)
                        .addComponent(bt_visorimg_ultima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_visorimg_antes)
                    .addComponent(bt_visorimg_despues)
                    .addComponent(jButton9)
                    .addComponent(bt_visorimg_primera)
                    .addComponent(bt_visorimg_ultima))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar3.add(jMenu3);

        jd_visorImagenes.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout jd_visorImagenesLayout = new javax.swing.GroupLayout(jd_visorImagenes.getContentPane());
        jd_visorImagenes.getContentPane().setLayout(jd_visorImagenesLayout);
        jd_visorImagenesLayout.setHorizontalGroup(
            jd_visorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_visorImagenesLayout.setVerticalGroup(
            jd_visorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_agenda.setTitle("Agenda");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hora", "Nota", "Aviso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLocaleChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSpinField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLocaleChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu4.setText("File");
        jMenuBar4.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar4.add(jMenu5);

        jd_agenda.setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout jd_agendaLayout = new javax.swing.GroupLayout(jd_agenda.getContentPane());
        jd_agenda.getContentPane().setLayout(jd_agendaLayout);
        jd_agendaLayout.setHorizontalGroup(
            jd_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_agendaLayout.setVerticalGroup(
            jd_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agendaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jButton10.setText("Stop");

        jButton11.setText("Play");

        jButton12.setText("Pause");

        jlb_player_intime.setText("00:00:00");

        jlb_player_outime.setText("00:00:00");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Album", "Duracion", "Favorito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable2);

        jButton13.setText("Directorio");

        jMenu6.setText("File");
        jMenuBar5.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar5.add(jMenu7);

        jd_reproductor.setJMenuBar(jMenuBar5);

        javax.swing.GroupLayout jd_reproductorLayout = new javax.swing.GroupLayout(jd_reproductor.getContentPane());
        jd_reproductor.getContentPane().setLayout(jd_reproductorLayout);
        jd_reproductorLayout.setHorizontalGroup(
            jd_reproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_reproductorLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jd_reproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_reproductorLayout.createSequentialGroup()
                        .addComponent(jlb_player_intime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_player_outime)))
                .addGap(72, 72, 72))
            .addGroup(jd_reproductorLayout.createSequentialGroup()
                .addGroup(jd_reproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_reproductorLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton10)
                        .addGap(30, 30, 30)
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12))
                    .addGroup(jd_reproductorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_reproductorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(188, 188, 188))
        );
        jd_reproductorLayout.setVerticalGroup(
            jd_reproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_reproductorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_reproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_player_intime)
                    .addComponent(jlb_player_outime))
                .addGap(18, 18, 18)
                .addGroup(jd_reproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jd_messenger.setTitle("Messenger");

        ta_msg_chatfield.setColumns(20);
        ta_msg_chatfield.setRows(5);
        jScrollPane4.setViewportView(ta_msg_chatfield);

        ta_msg_txt.setColumns(20);
        ta_msg_txt.setRows(5);
        jScrollPane5.setViewportView(ta_msg_txt);

        bt_msg_send.setText("Enviar");
        bt_msg_send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_msg_sendMouseClicked(evt);
            }
        });

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Usuarios");
        jtree_msg_users.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree_msg_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtree_msg_usersMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtree_msg_users);

        jLabel7.setText("Para:");

        bt_msg_select.setText("...");
        bt_msg_select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_msg_selectMouseClicked(evt);
            }
        });

        jLabel11.setText("De:");

        jlb_msg_de.setText("usuario");

        bt_msg_sendT.setText("Send");
        bt_msg_sendT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_msg_sendTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(bt_msg_sendT)
                                .addGap(99, 99, 99)
                                .addComponent(bt_msg_send)))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_msg_para)
                            .addGap(18, 18, 18)
                            .addComponent(bt_msg_select)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jlb_msg_de)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_msg_para, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_msg_select))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jlb_msg_de))
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_msg_send)
                    .addComponent(bt_msg_sendT))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nuevo Chat");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Cerrar");
        jMenu1.add(jMenuItem2);

        jMenuBar2.add(jMenu1);

        jd_messenger.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jd_messengerLayout = new javax.swing.GroupLayout(jd_messenger.getContentPane());
        jd_messenger.getContentPane().setLayout(jd_messengerLayout);
        jd_messengerLayout.setHorizontalGroup(
            jd_messengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_messengerLayout.setVerticalGroup(
            jd_messengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_messengerLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jd_redSocial.setTitle("SocialNet");

        tpane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpaneStateChanged(evt);
            }
        });

        jScrollPane9.setViewportView(jt_amigos);

        jButton14.setText("Eliminar");

        jLabel8.setText("Amigos");

        jlb_redsocial_perfil_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/180x220_pp.jpg"))); // NOI18N

        tabla_reds_comments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comentario", "Fecha", "Like"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tabla_reds_comments);

        ta_reds_perfil_comment.setColumns(20);
        ta_reds_perfil_comment.setRows(5);
        jScrollPane12.setViewportView(ta_reds_perfil_comment);

        jLabel10.setText("Estado:");

        bt_reds_perfil_addcomment.setText("Agregar");
        bt_reds_perfil_addcomment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_reds_perfil_addcommentMouseClicked(evt);
            }
        });

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_reds_perfil_addcomment)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_reds_perfil_addcomment)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_redsocial_perfil_pic)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jButton14)
                                .addGap(59, 59, 59)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jlb_redsocial_perfil_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addGap(47, 47, 47))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tpane.addTab("Perfil", jPanel11);

        jLabel9.setText("Usuarios");

        jl_sn_red_users.setModel(new DefaultListModel());
        jScrollPane10.setViewportView(jl_sn_red_users);

        jButton15.setText("Agregar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton15))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel9)))
                .addContainerGap(795, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        tpane.addTab("Red", jPanel12);

        javax.swing.GroupLayout jd_redSocialLayout = new javax.swing.GroupLayout(jd_redSocial.getContentPane());
        jd_redSocial.getContentPane().setLayout(jd_redSocialLayout);
        jd_redSocialLayout.setHorizontalGroup(
            jd_redSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpane)
        );
        jd_redSocialLayout.setVerticalGroup(
            jd_redSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpane)
        );

        jd_netbeens.setTitle("NetbEEns");

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Proyectos");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Nuevo");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("file.jaca");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Otro");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("new.jaca");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane14.setViewportView(jTree1);

        jep_netbeens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jep_netbeensMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(jep_netbeens);

        jMenu8.setText("File");

        jMenuItem7.setText("Nuevo Proyecto");
        jMenu8.add(jMenuItem7);

        jMenuItem8.setText("Nuevo Archivo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jmi_netb_save.setText("Guardar");
        jMenu8.add(jmi_netb_save);

        jmi_netb_saveas.setText("Guardar Cómo...");
        jMenu8.add(jmi_netb_saveas);
        jMenu8.add(jSeparator4);

        jMenuItem9.setText("Salir");
        jMenu8.add(jMenuItem9);

        jMenuBar6.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar6.add(jMenu9);

        jd_netbeens.setJMenuBar(jMenuBar6);

        javax.swing.GroupLayout jd_netbeensLayout = new javax.swing.GroupLayout(jd_netbeens.getContentPane());
        jd_netbeens.getContentPane().setLayout(jd_netbeensLayout);
        jd_netbeensLayout.setHorizontalGroup(
            jd_netbeensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_netbeensLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jd_netbeensLayout.setVerticalGroup(
            jd_netbeensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_netbeensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_netbeensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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

        tf_login_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_login_passwordKeyPressed(evt);
            }
        });

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

        jLabel3.setText("Usuario:");

        jLabel4.setText("Password:");

        tf_admin_agregar_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_admin_agregar_passwordKeyPressed(evt);
            }
        });

        bt_admin_agregar_crearUsuario.setText("Crear Usuario");
        bt_admin_agregar_crearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_admin_agregar_crearUsuarioMouseClicked(evt);
            }
        });

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Usuarios");
        jtree_admin_users.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane13.setViewportView(jtree_admin_users);

        bt_admin_cargar.setText("Cargar");
        bt_admin_cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_admin_cargarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_admin_agregar_crearUsuario)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_admin_agregar_user, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(tf_admin_agregar_password)))
                    .addComponent(bt_admin_cargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_admin_agregar_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_admin_agregar_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(bt_admin_cargar)
                        .addGap(52, 52, 52)
                        .addComponent(bt_admin_agregar_crearUsuario)
                        .addGap(107, 107, 107))))
        );

        jTabbedPane1.addTab("Agregar", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ver", jPanel5);

        javax.swing.GroupLayout jd_admin_usersLayout = new javax.swing.GroupLayout(jd_admin_users.getContentPane());
        jd_admin_users.getContentPane().setLayout(jd_admin_usersLayout);
        jd_admin_usersLayout.setHorizontalGroup(
            jd_admin_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jd_admin_usersLayout.setVerticalGroup(
            jd_admin_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jmi_ppm_desktop_bg.setText("Cambiar Background");
        jmi_ppm_desktop_bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ppm_desktop_bgActionPerformed(evt);
            }
        });
        ppm_desktop.add(jmi_ppm_desktop_bg);

        jmi_ppm_copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24_copy.png"))); // NOI18N
        jmi_ppm_copy.setText("Copiar");
        ppm_editor.add(jmi_ppm_copy);

        jmi_ppm_cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24_cut.png"))); // NOI18N
        jmi_ppm_cut.setText("Cortar");
        ppm_editor.add(jmi_ppm_cut);

        jmi_ppm_paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24_paste.png"))); // NOI18N
        jmi_ppm_paste.setText("Pegar");
        ppm_editor.add(jmi_ppm_paste);
        ppm_editor.add(jSeparator2);

        jmi_ppm_select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24_select.png"))); // NOI18N
        jmi_ppm_select.setText("Seleccionar");
        ppm_editor.add(jmi_ppm_select);

        jmi_ppm_chat.setText("Chat");
        jmi_ppm_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ppm_chatActionPerformed(evt);
            }
        });
        ppm_chat.add(jmi_ppm_chat);

        jmi_ppm_constructor.setText("Constructor");
        ppm_generate.add(jmi_ppm_constructor);

        jmi_ppm_getter.setText("Getter");
        ppm_generate.add(jmi_ppm_getter);

        jmi_ppm_setter.setText("Setter");
        ppm_generate.add(jmi_ppm_setter);

        jmi_ppm_gs.setText("Getter y Setter");
        ppm_generate.add(jmi_ppm_gs);

        jmi_ppm_tostring.setText("toString()");
        ppm_generate.add(jmi_ppm_tostring);

        jmi_ppm_AddProperty.setText("Add Property...");
        ppm_generate.add(jmi_ppm_AddProperty);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_desktop_user.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jlb_desktop_user.setText("Usuario");
        jPanel1.add(jlb_desktop_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, -1, -1));

        jlb_desktop_hora.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jlb_desktop_hora.setText("00:00");
        jPanel1.add(jlb_desktop_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 40, -1, -1));

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

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 56, 433));

        jButton16.setText("Usuario Actual");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1040, -1, -1));

        jlb_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg/bg_3.jpg"))); // NOI18N
        jlb_bg.setPreferredSize(new java.awt.Dimension(1450, 1100));
        jPanel1.add(jlb_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jmi_admin_users.setText("Usuarios");
        jmi_admin_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_admin_usersActionPerformed(evt);
            }
        });
        jm_admin.add(jmi_admin_users);

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
        
        DefaultTreeModel modelo1 = (DefaultTreeModel) jtree1.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo1.getRoot();

        //JFileChooser jf = new JFileChooser("./");
        //jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //int s = jf.showOpenDialog(this);
        adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
        au.leerUsuarioB();
        String usuario = au.getListaUsuarios().get(posicion_usuario_logged).getUsuario();
        
        if(usuario.equals("admin")){
            File f = new File("./Z/");

            modelo1.setRoot(new DefaultMutableTreeNode(f.getName()));
            listarTodo(f, (DefaultMutableTreeNode) modelo1.getRoot());
        
        
        
        }else{
            File f = new File("./Z/Usuarios/"+usuario+"/");

        
            modelo1.setRoot(new DefaultMutableTreeNode(f.getName()));
            listarTodo(f, (DefaultMutableTreeNode) modelo1.getRoot());
        }
        
        
        //listar_no_orden(f, (DefaultMutableTreeNode)modelo1.getRoot());
        
        mostrarFBI();

        
    }//GEN-LAST:event_jl_tb_explorerMouseClicked

    public void listar_no_orden(File p_raiz, DefaultMutableTreeNode nodo) {
        try {
            for (File temp : p_raiz.listFiles()) {
                if (temp.isFile()) {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getName());
                    nodo.add(n);
                } else {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getName());
                    nodo.add(n);
                    listar_no_orden(temp, n);
                }
            }
        } catch (Exception e) {

        }
    }

    public void listarTodo(File raiz, DefaultMutableTreeNode nodo) {
        try {
            ArrayList<File> fl1 = new ArrayList();
            ArrayList<File> fl2 = new ArrayList();
            ArrayList<File> fl3 = new ArrayList();

            for (File file : raiz.listFiles()) {
                if (file.isDirectory()) {
                    fl1.add(file);
                } else {
                    fl2.add(file);
                }
            }
            fl3.addAll(fl1);
            fl3.addAll(fl2);

            for (File temp : fl3) {
                if (temp.isFile()) {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getName());
                    nodo.add(n);
                } else {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getName());
                    nodo.add(n);
                    listarTodo(temp, n);
                }
            }

        } catch (Exception e) {

        }
    }

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
        tpane.setSelectedIndex(0);
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

        //Admin ingresa por primera
        File dir = new File("Z");
        File users = new File("./" + dir + "/Usuarios");
        File system = new File("./" + dir + "/Sistema");
        //reg = new FileWriter(system+"/passwords.txt");

        if (tf_login_user.getText().equals("admin") && tf_login_password.getText().equals("admin")) {

            jd_login.dispose();

            if (dir.exists()) {

                //JOptionPane.showMessageDialog(this, "Welcome!" + tf_login_user.getText());
            } else {

                try {

                    dir.mkdir();
                    users.mkdir();
                    system.mkdir();

                    FileWriter reg = null;
                    BufferedWriter bw = null;
                    try {
                        reg = new FileWriter(system + "/data.txt");
                        bw = new BufferedWriter(reg);
                        bw.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    reg.close();
                    bw.close();
                    //reg.write("");
                    //reg.flush();
                    //JOptionPane.showMessageDialog(this, "Welcome Administrator!");

                } catch (IOException ex) {

                }

            }

            //jm_admin.setVisible(true);
            tf_login_password.setText("");
            tf_login_user.setText("");
            jmi_login.setEnabled(false);
            jmi_logout.setEnabled(true);

        }

    }//GEN-LAST:event_bt_login_inMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        //Salir del sistema desde JMenu Exit
        int response = JOptionPane.showConfirmDialog(this, "¿Salir del sistema?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {

            //Validar que el usario termina la sesión.
            if (jmi_login.isEnabled() == false) {
                JOptionPane.showMessageDialog(this, "Primero termine la sesión de usuario");

            } else {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmi_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_logoutActionPerformed
        //Cerrar sesión de usuario
        int response = JOptionPane.showConfirmDialog(this, "¿Cerrar sesión de Usuario?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            //jm_admin.setVisible(false);

            jmi_login.setEnabled(true);
            jmi_logout.setEnabled(false);
        }
    }//GEN-LAST:event_jmi_logoutActionPerformed

    private void jmi_admin_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_admin_usersActionPerformed

        //Reset de la vista para agregar archivos al JTree
        DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Usuarios");
        jtree_admin_users.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane13.setViewportView(jtree_admin_users);

        DefaultTreeModel m = (DefaultTreeModel) jtree_admin_users.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

        int cent = 0;
        adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
        au.leerUsuarioB();

        /*
        for (Usuario u : au.getListaUsuarios()) {
            String usuario = au.getListaUsuarios().get(cent).getUsuario();
            String password = au.getListaUsuarios().get(cent).getPassword();

            //Usuario n = new Usuario(usuario, password);

            DefaultMutableTreeNode nodo_usuario;
            nodo_usuario = new DefaultMutableTreeNode(new Usuario(usuario, password));
        
            DefaultMutableTreeNode info;
            info = new DefaultMutableTreeNode(au.getListaUsuarios().get(0).getPassword());
        
            nodo_usuario.add(info);
            raiz.add(nodo_usuario);
            m.reload();
            cent++;
        }
        
         */
        for (int i = 0; i < au.getListaUsuarios().size(); i++) {

            String usuario = au.getListaUsuarios().get(i).getUsuario();
            String password = au.getListaUsuarios().get(i).getPassword();

            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(new Usuario(usuario, password));
            raiz.add(nodo);
            m.reload();

        }
        jd_admin_users.pack();
        jd_admin_users.setModal(true);
        jd_admin_users.setLocationRelativeTo(this);
        jd_admin_users.setVisible(true);
    }//GEN-LAST:event_jmi_admin_usersActionPerformed

    private void bt_admin_agregar_crearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_admin_agregar_crearUsuarioMouseClicked

        String usuario, password;
        try {
            usuario = tf_admin_agregar_user.getText();
            password = tf_admin_agregar_password.getText();

            Usuario u = new Usuario(usuario, password);
            adminUsuario ap = new adminUsuario("./usuarios.txt");
            ap.agregarUsuario(u);
            ap.escribirUsuarioT();

            adminDirectorio d = new adminDirectorio();
            d.crearDirectorioUsuario(usuario);

            try {
                BufferedReader input = new BufferedReader(new FileReader("./Z/Sistema/data.txt"));
                String line = input.readLine();
                while (line != null) {
                    StringTokenizer st = new StringTokenizer(line);
                    if (tf_admin_agregar_user.getText().equals(st.nextToken())) {
                        System.out.println("User already exists");
                        break;
                    }
                    line = input.readLine();
                }

                input.close();

                MessageDigest md = MessageDigest.getInstance("SHA-256");
                md.update(tf_admin_agregar_password.getText().getBytes());
                byte byteData[] = md.digest();
                StringBuffer sb = new StringBuffer();

                for (int i = 0; i < byteData.length; i++) {
                    sb.append(Integer.toString((byteData[i] & 0xFF) + 0x100, 16).substring(1));
                }

                BufferedWriter output = new BufferedWriter(new FileWriter("./Z/Sistema/data.txt", true));

                output.write(tf_admin_agregar_user.getText() + " " + sb.toString() + "\n");
                output.close();

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }

            tf_admin_agregar_user.setText("");
            tf_admin_agregar_password.setText("");

        } catch (Exception e) {

        }

    }//GEN-LAST:event_bt_admin_agregar_crearUsuarioMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
            Highlighter h1 = jep_texto.getHighlighter();
            Highlighter.HighlightPainter sombreador;

            Color c = JColorChooser.showDialog(this, "Color?", Color.yellow);

            sombreador = new DefaultHighlighter.DefaultHighlightPainter(c);
            //DefaultHighlightPainter(Color.YELLOW);

            h1.addHighlight(jep_texto.getSelectionStart(),//devuelve desde donde tengo marcado el texto hasta donde termina
                    jep_texto.getSelectionEnd(), sombreador);
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //obtener estilo actual
        StyledDocument doc = jep_texto.getStyledDocument();

        //hacer mi estilo
        Style estilo = jep_texto.addStyle("miEstilo", null);
        StyleConstants.setForeground(estilo, Color.red);
        StyleConstants.setUnderline(estilo, true);
        StyleConstants.setFontSize(estilo, 24);
        StyleConstants.setBold(estilo, true);
        StyleConstants.setItalic(estilo, true);

        //colorear una selección del textPane
        doc.setCharacterAttributes(jep_texto.getSelectionStart(),
                jep_texto.getSelectionEnd()
                - jep_texto.getSelectionStart(),
                jep_texto.getStyle("miEstilo"), true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        jep_texto.setContentType("text/html");
        jep_texto.setText("<h1>Encabezado 1 </h1>"
                + "<h2>Tipo 2</h2>"
                + "<b>Texto negrita</b><br>"
                + "<i>Texto cursiva</i><br>"
                + "<u>Texto subrayado</u><br>");
    }//GEN-LAST:event_jButton6MouseClicked

    private void tbt_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbt_bMouseClicked

        if (tbt_b.isSelected()) {
            //obtener estilo actual
            StyledDocument doc = jep_texto.getStyledDocument();

            //hacer mi estilo
            Style estilo = jep_texto.addStyle("miEstilo", null);
            StyleConstants.setForeground(estilo, Color.red);
            StyleConstants.setUnderline(estilo, true);
            StyleConstants.setFontSize(estilo, 24);
            StyleConstants.setBold(estilo, true);
            StyleConstants.setItalic(estilo, true);

            //colorear una selección del textPane
            doc.setCharacterAttributes(jep_texto.getSelectionStart(),
                    jep_texto.getSelectionEnd()
                    - jep_texto.getSelectionStart(),
                    jep_texto.getStyle("miEstilo"), true);
        } else {
            System.out.println("sd");
        }

    }//GEN-LAST:event_tbt_bMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if (evt.isMetaDown()) {
            ppm_desktop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jmi_ppm_desktop_bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ppm_desktop_bgActionPerformed

        //cambiar fondo del background
        JFileChooser fc = new JFileChooser("./src/img/bg");
        FileFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "png", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(1450, 1100, 0);
            this.jlb_bg.setIcon(new ImageIcon(img));
        }
        
    }//GEN-LAST:event_jmi_ppm_desktop_bgActionPerformed

    private void jep_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jep_textoMouseClicked
        if (evt.isMetaDown()) {
            ppm_editor.show(evt.getComponent(), evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_jep_textoMouseClicked

    private void jtree_msg_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtree_msg_usersMouseClicked
        if (evt.isMetaDown()) {

            int row = jtree_msg_users.getClosestRowForLocation(evt.getX(), evt.getY());
            jtree_msg_users.setSelectionRow(row);

            Object v1 = jtree_msg_users.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;

            if (nodo_seleccionado.getUserObject() instanceof Usuario) {
                usuario_seleccionado
                        = (Usuario) nodo_seleccionado.getUserObject();
                ppm_chat.show(evt.getComponent(), evt.getX(), evt.getY());
            }

        }
    }//GEN-LAST:event_jtree_msg_usersMouseClicked

    private void bt_msg_sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_msg_sendMouseClicked

        adminUsuariosMsj au = new adminUsuariosMsj("./mensajes.txt");

        String textoEnviar = ta_msg_txt.getText();

        UsuarioMsj ums1 = new UsuarioMsj("User1", "Apellido", "user01");
        UsuarioMsj ums2 = new UsuarioMsj("Usuario2", "LastName", "uzer02");

        Mensaje m1 = new Mensaje(ums1.getUsuario(), ums2.getUsuario(), textoEnviar);
        //Agregar el mismo mensaje ambos contactos
        ums1.agregarMensaje(m1);
        ums2.agregarMensaje(m1);

        au.agregarUsuarioMsj(ums1);
        au.agregarUsuarioMsj(ums2);

        try {

            au.escribirMensaje();
            ta_msg_chatfield.append("user01" + ":" + textoEnviar + "\n");
            //JOptionPane.showMessageDialog(jd_messenger,"Mensaje envíado");
            ta_msg_txt.setText("");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //au.leerMensaje();
        System.out.println(au.getListaUsuariosMsj().get(0).getApellido());

        for (int i = 0; i < au.getListaUsuariosMsj().size(); i++) {
            for (int j = 0; j < au.getListaUsuariosMsj().get(i).getListaMensajes().size(); j++) {
                System.out.println(au.getListaUsuariosMsj().get(i).getListaMensajes().get(i).getMensaje());

            }

        }
    }//GEN-LAST:event_bt_msg_sendMouseClicked

    private void bt_reds_perfil_addcommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_reds_perfil_addcommentMouseClicked

        String comentario = ta_reds_perfil_comment.getText();
        Date fecha = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        JButton like = new JButton("like");

        //like.add(like);

        Object[] tabla = {comentario, dateFormat.format(fecha), like};

        DefaultTableModel model = (DefaultTableModel) tabla_reds_comments.getModel();
        model.addRow(tabla);
        tabla_reds_comments.setModel(model);

        ta_reds_perfil_comment.setText("");
    }//GEN-LAST:event_bt_reds_perfil_addcommentMouseClicked

    private void tf_login_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_login_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
            au.leerUsuarioB();

            if (au.validarUsuario(tf_login_user.getText(), tf_login_password.getText())) {

                posicion_usuario_logged = au.posicionUsuario(tf_login_user.getText());

                JOptionPane.showMessageDialog(jd_login, "Welcome");

                jlb_desktop_user.setText(au.getListaUsuarios().get(posicion_usuario_logged).getUsuario());

                jd_login.dispose();
                tf_login_user.setText("");
                tf_login_password.setText("");
            } else {
                JOptionPane.showMessageDialog(jd_login, "No existe el usario");
            }
        }
    }//GEN-LAST:event_tf_login_passwordKeyPressed

    private void tf_admin_agregar_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_admin_agregar_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String usuario = tf_admin_agregar_user.getText();
            String password = tf_admin_agregar_password.getText();

            Usuario n = new Usuario(usuario, password);

            adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
            au.leerUsuarioB();

            if (au.buscarUsuario(usuario)) {
                JOptionPane.showMessageDialog(jd_admin_users, "Ya existe ese usuario, elija otro");
                tf_admin_agregar_user.setText("");
                tf_admin_agregar_password.setText("");
            } else {

                au.agregarUsuario(n);
                au.escribirUsuarioB();

                DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Usuarios");
                jtree_admin_users.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
                jScrollPane13.setViewportView(jtree_admin_users);

                au.leerUsuarioB();
                DefaultTreeModel m = (DefaultTreeModel) jtree_admin_users.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

                for (int i = 0; i < au.getListaUsuarios().size(); i++) {

                    String u = au.getListaUsuarios().get(i).getUsuario();
                    String p = au.getListaUsuarios().get(i).getPassword();

                    raiz.add(new DefaultMutableTreeNode(new Usuario(u, p)));
                    m.reload();
                }

                JOptionPane.showMessageDialog(jd_login, "Usuario agregado con éxito");
                tf_admin_agregar_password.setText("");
                tf_admin_agregar_user.setText("");
            }
        }
    }//GEN-LAST:event_tf_admin_agregar_passwordKeyPressed

    private void bt_admin_cargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_admin_cargarMouseClicked

        adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
        au.leerUsuarioB();

        System.out.println(au.posicionUsuario("vegeta"));

        String usr1 = "Usuario", pwd1 = "password";

        DefaultTreeModel m = (DefaultTreeModel) jtree_admin_users.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

        DefaultMutableTreeNode nodo_usuario;
        nodo_usuario = new DefaultMutableTreeNode(new Usuario(usr1, pwd1));

        DefaultMutableTreeNode info;
        info = new DefaultMutableTreeNode(au.getListaUsuarios().get(0).getPassword());

        nodo_usuario.add(info);
        raiz.add(nodo_usuario);
        m.reload();

        int cent = 0;
        String s = "";

        for (Usuario u : au.getListaUsuarios()) {
            String usr = au.getListaUsuarios().get(cent).getUsuario();
            String pwd = au.getListaUsuarios().get(cent).getPassword();

            s += usr + "\n";

        }

        System.out.println(s);
        
    }//GEN-LAST:event_bt_admin_cargarMouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked

        adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
        au.leerUsuarioB();

        JOptionPane.showMessageDialog(this, "Usuario acutal: " + au.getListaUsuarios().get(posicion_usuario_logged).getUsuario());
    }//GEN-LAST:event_jButton16MouseClicked

    private void jmi_ppm_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ppm_chatActionPerformed

        adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
        au.leerUsuarioB();

        int row = jtree_msg_users.getLeadSelectionRow() - 1;

        //posicion_seleccionado = row - 1;
        jtree_msg_users.setSelectionRow(row);

        tf_msg_para.setText(au.getListaUsuarios().get(row).getUsuario());
        posicion_seleccionado = au.posicionUsuario(tf_msg_para.getText());

    }//GEN-LAST:event_jmi_ppm_chatActionPerformed

    private void bt_msg_sendTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_msg_sendTMouseClicked

        ta_msg_chatfield.setText("");
        adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
        au.leerUsuarioB();

        Mensaje m = new Mensaje(au.getListaUsuarios().get(posicion_usuario_logged).getUsuario(),
                au.getListaUsuarios().get(posicion_seleccionado).getUsuario(), ta_msg_txt.getText());

        au.agregarMensaje(posicion_usuario_logged, m);
        au.agregarMensaje(posicion_seleccionado, m);

        au.escribirUsuarioB();

        au.leerUsuarioB();
        System.out.println("Para:" + au.getListaUsuarios().get(posicion_seleccionado).getUsuario() + " \n" + au.getListaUsuarios().get(posicion_usuario_logged).getListaMensajes().get(0).getMensaje());
        //au.getListaUsuarios().get(posicion_usuario).getListaMensajes().add(m);

        String t = "";

        for (int i = 0; i < au.getListaUsuarios().get(posicion_usuario_logged).getListaMensajes().size(); i++) {
            t += au.getListaUsuarios().get(posicion_usuario_logged).getListaMensajes().get(i).getEmisor() + ": " + au.getListaUsuarios().get(posicion_usuario_logged).getListaMensajes().get(i).getMensaje() + "\n";

        }

        ta_msg_chatfield.setText(t);

        ta_msg_txt.setText("");


    }//GEN-LAST:event_bt_msg_sendTMouseClicked

    private void bt_msg_selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_msg_selectMouseClicked

        ta_msg_chatfield.setText("");
        adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
        au.leerUsuarioB();

        String s = "", t = "";
        for (int i = 0; i < au.getListaUsuarios().size(); i++) {

            s += i + " - " + au.getListaUsuarios().get(i).getUsuario() + "\n";

        }
        boolean bo = true;
        while (bo) {
            try {

                posicion_seleccionado = Integer.parseInt(JOptionPane.showInputDialog(jd_messenger, s + "\n" + "Seleccione un usuario:"));
                tf_msg_para.setText(au.getListaUsuarios().get(posicion_seleccionado).getUsuario());

                //String user = au.getListaUsuarios().get(posicion_usuario_logged).getListaMensajes().get(0).getEmisor();
                for (int i = 0; i < au.getListaUsuarios().get(posicion_usuario_logged).getListaMensajes().size(); i++) {
                    t += au.getListaUsuarios().get(posicion_usuario_logged).getListaMensajes().get(i).getEmisor() + ": " + au.getListaUsuarios().get(posicion_usuario_logged).getListaMensajes().get(i).getMensaje() + "\n";

                }

                ta_msg_chatfield.setText(t);

                bo = false;
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(jd_messenger, "Ingrese únicamente los valores enumerados", "Error de Usuario", JOptionPane.ERROR_MESSAGE);
                bo = true;
            } catch (java.lang.IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(jd_messenger, "Ese número no está en la lista", "Error de Usuario", JOptionPane.ERROR_MESSAGE);
                bo = true;
            }
        }


    }//GEN-LAST:event_bt_msg_selectMouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        jep_netbeens.setText("");

        //obtener estilo actual
        StyledDocument doc = jep_texto.getStyledDocument();

        //hacer mi estilo
        Style estilo = jep_texto.addStyle("miEstilo", null);
        StyleConstants.setForeground(estilo, Color.red);
        StyleConstants.setUnderline(estilo, true);
        StyleConstants.setFontSize(estilo, 24);
        StyleConstants.setBold(estilo, true);
        StyleConstants.setItalic(estilo, true);

        Style style = jep_netbeens.addStyle("I'm a Style", null);
        StyleConstants.setForeground(style, Color.red);

        try {
            doc.insertString(doc.getLength(), "private", style);
        } catch (BadLocationException e) {
        }

        StyleConstants.setForeground(style, Color.blue);

        try {
            doc.insertString(doc.getLength(), "class", style);
        } catch (BadLocationException e) {
        }

        //colorear una selección del textPane
        doc.setCharacterAttributes(0, WIDTH, estilo, rootPaneCheckingEnabled);
        doc.setCharacterAttributes(jep_texto.getSelectionStart(),
                jep_texto.getSelectionEnd()
                - jep_texto.getSelectionStart(),
                jep_texto.getStyle("miEstilo"), true);


    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jep_netbeensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jep_netbeensMouseClicked

        if (evt.isMetaDown()) {
            ppm_generate.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jep_netbeensMouseClicked

    private void bt_visorimg_despuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_visorimg_despuesMouseClicked
        //botón next de imagenes

        posImg = posImg + 1;
        if (posImg >= getImages().length) {
            posImg = getImages().length - 1;
        }
        showImage(posImg);
    }//GEN-LAST:event_bt_visorimg_despuesMouseClicked

    private void bt_visorimg_primeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_visorimg_primeraMouseClicked
        posImg = 0;
        showImage(posImg);
    }//GEN-LAST:event_bt_visorimg_primeraMouseClicked

    private void bt_visorimg_antesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_visorimg_antesMouseClicked
        posImg = posImg - 1;
        if (posImg < 0) {
            posImg = 0;
        }
        showImage(posImg);
    }//GEN-LAST:event_bt_visorimg_antesMouseClicked

    private void bt_visorimg_ultimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_visorimg_ultimaMouseClicked
        posImg = getImages().length - 1;
        showImage(posImg);
    }//GEN-LAST:event_bt_visorimg_ultimaMouseClicked

    private void tpaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpaneStateChanged

        if (tpane.getSelectedIndex() == 1) {

            jl_sn_red_users.setModel(new DefaultListModel());
            adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
            au.leerUsuarioB();
            
            DefaultListModel modeloLista = (DefaultListModel)jl_sn_red_users.getModel();
            String s="";
            for (int i = 0; i < au.getListaUsuarios().size(); i++) {
                s=au.getListaUsuarios().get(i).getUsuario()+"\n";
                modeloLista.addElement(s);
                jl_sn_red_users.setModel(modeloLista);
            }
            

            DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Usuarios");
            jtree_admin_users.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
            jScrollPane13.setViewportView(jtree_admin_users);

            
        }
    }//GEN-LAST:event_tpaneStateChanged

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        if(jep_texto.getText().length()>0){
            JOptionPane.showMessageDialog(jd_editorTexto,"Guardar cambios!");
        }else{
            jep_texto.setText("");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //cerrar sin guardar
        if(jep_texto.getText().length()>0){
            JOptionPane.showMessageDialog(jd_editorTexto,"Guardar cambios!");
        }else{
            jep_texto.setText("");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public void EachRowRendererEditor() {
        /*
        String[] columnNames = {"Type", "Value"};
        Object[][] data = {
            {"String", "I'm a string"},
            {"Date", new Date()},
            {"Integer", new Integer(123)},
            {"Double", new Double(123.45)},
            {"Boolean", Boolean.TRUE}};
        
        DefaultTableModel modeloTable = (DefaultTableModel)tabala.getModel();
        modeloTable.addRow(data);
        tabala.setModel(modeloTable);
        
        
        tabala = new JTable(data, columnNames) {

            private static final long serialVersionUID = 1L;
            private Class editingClass;

            @Override
            public TableCellRenderer getCellRenderer(int row, int column) {
                editingClass = null;
                int modelColumn = convertColumnIndexToModel(column);
                if (modelColumn == 1) {
                    Class rowClass = getModel().getValueAt(row, modelColumn).getClass();
                    return getDefaultRenderer(rowClass);
                } else {
                    return super.getCellRenderer(row, column);
                }
            }

            @Override
            public TableCellEditor getCellEditor(int row, int column) {
                editingClass = null;
                int modelColumn = convertColumnIndexToModel(column);
                if (modelColumn == 1) {
                    editingClass = getModel().getValueAt(row, modelColumn).getClass();
                    return getDefaultEditor(editingClass);
                } else {
                    return super.getCellEditor(row, column);
                }
            }
            //  This method is also invoked by the editor when the value in the editor
            //  component is saved in the TableModel. The class was saved when the
            //  editor was invoked so the proper class can be created.

            @Override
            public Class getColumnClass(int column) {
                return editingClass != null ? editingClass : super.getColumnClass(column);
            }
        };
        tabala.setPreferredScrollableViewportSize(tabala.getPreferredSize());
        jScrollPane15 = new JScrollPane(tabala);
        this.add(jScrollPane15);
        */
    }
    
    public String[] getImages() {
        File file = new File(getClass().getResource("/img/bg/").getFile());

        String[] imageList = file.list();
        return imageList;

    }

    public void showImage(int index) {
        String[] imagesList = getImages();
        String imageName = imagesList[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/bg/" + imageName));
        Image image = icon.getImage().getScaledInstance(700, 530, 0);
        jlb_visor_pic.setIcon(new ImageIcon(image));
    }

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

        //Reset de la vista para agregar archivos al JTree
        DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Usuarios");
        jtree_msg_users.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane6.setViewportView(jtree_msg_users);

        adminUsuario au = new adminUsuario("./Z/Sistema/usr.att");
        au.leerUsuarioB();

        jlb_msg_de.setText(au.getListaUsuarios().get(posicion_usuario_logged).getUsuario());

        DefaultTreeModel m = (DefaultTreeModel) jtree_msg_users.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            raiz.add(new DefaultMutableTreeNode(new Usuario(
                    au.getListaUsuarios().get(i).getUsuario(),
                    au.getListaUsuarios().get(i).getPassword())));
            m.reload();
        }

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
    private javax.swing.JButton bt_admin_agregar_crearUsuario;
    private javax.swing.JButton bt_admin_cargar;
    private javax.swing.JButton bt_login_in;
    private javax.swing.JButton bt_login_xl;
    private javax.swing.JButton bt_msg_select;
    private javax.swing.JButton bt_msg_send;
    private javax.swing.JButton bt_msg_sendT;
    private javax.swing.JButton bt_reds_perfil_addcomment;
    private javax.swing.JButton bt_visorimg_antes;
    private javax.swing.JButton bt_visorimg_despues;
    private javax.swing.JButton bt_visorimg_primera;
    private javax.swing.JButton bt_visorimg_ultima;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTree1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JDialog jd_admin_users;
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
    private javax.swing.JTextPane jep_netbeens;
    private javax.swing.JTextPane jep_texto;
    private javax.swing.JList<String> jl_sn_red_users;
    private javax.swing.JLabel jl_tb_agenda;
    private javax.swing.JLabel jl_tb_cmd;
    private javax.swing.JLabel jl_tb_explorer;
    private javax.swing.JLabel jl_tb_msgr;
    private javax.swing.JLabel jl_tb_netbeens;
    private javax.swing.JLabel jl_tb_pics;
    private javax.swing.JLabel jl_tb_player;
    private javax.swing.JLabel jl_tb_socialnet;
    private javax.swing.JLabel jl_tb_text;
    private javax.swing.JLabel jlb_bg;
    private javax.swing.JLabel jlb_desktop_hora;
    private javax.swing.JLabel jlb_desktop_user;
    private javax.swing.JLabel jlb_msg_de;
    private javax.swing.JLabel jlb_player_intime;
    private javax.swing.JLabel jlb_player_outime;
    private javax.swing.JLabel jlb_redsocial_perfil_pic;
    private javax.swing.JLabel jlb_visor_pic;
    private javax.swing.JMenu jm_admin;
    private javax.swing.JMenu jm_start;
    private javax.swing.JMenuItem jmi_admin_users;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JMenuItem jmi_netb_save;
    private javax.swing.JMenuItem jmi_netb_saveas;
    private javax.swing.JMenuItem jmi_ppm_AddProperty;
    private javax.swing.JMenuItem jmi_ppm_chat;
    private javax.swing.JMenuItem jmi_ppm_constructor;
    private javax.swing.JMenuItem jmi_ppm_copy;
    private javax.swing.JMenuItem jmi_ppm_cut;
    private javax.swing.JMenuItem jmi_ppm_desktop_bg;
    private javax.swing.JMenuItem jmi_ppm_getter;
    private javax.swing.JMenuItem jmi_ppm_gs;
    private javax.swing.JMenuItem jmi_ppm_paste;
    private javax.swing.JMenuItem jmi_ppm_select;
    private javax.swing.JMenuItem jmi_ppm_setter;
    private javax.swing.JMenuItem jmi_ppm_tostring;
    private javax.swing.JList<String> jt_amigos;
    private javax.swing.JTree jtree1;
    private javax.swing.JTree jtree_admin_users;
    private javax.swing.JTree jtree_msg_users;
    private javax.swing.JPopupMenu ppm_chat;
    private javax.swing.JPopupMenu ppm_desktop;
    private javax.swing.JPopupMenu ppm_editor;
    private javax.swing.JPopupMenu ppm_generate;
    private javax.swing.JTextArea ta_msg_chatfield;
    private javax.swing.JTextArea ta_msg_txt;
    private javax.swing.JTextArea ta_reds_perfil_comment;
    private javax.swing.JTable tabla_reds_comments;
    private javax.swing.JToggleButton tbt_b;
    private javax.swing.JPasswordField tf_admin_agregar_password;
    private javax.swing.JTextField tf_admin_agregar_user;
    private javax.swing.JPasswordField tf_login_password;
    private javax.swing.JTextField tf_login_user;
    private javax.swing.JTextField tf_msg_para;
    private javax.swing.JTabbedPane tpane;
    private javax.swing.JTree tree2;
    // End of variables declaration//GEN-END:variables

    int posicion_usuario_logged = -1;
    int posicion_seleccionado = -1;
    int flag = 0;

    DefaultMutableTreeNode nodo_seleccionado;
    Usuario usuario_seleccionado;
}
