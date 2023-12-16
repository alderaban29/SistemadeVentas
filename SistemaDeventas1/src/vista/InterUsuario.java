package vista;

import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Usuario;


public class InterUsuario extends javax.swing.JInternalFrame {
    
    public InterUsuario() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Usuario");
        
        txt_password.setVisible(true);
        txt_password_visible.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        txt_telefono = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jCheckBox_ver_clave = new javax.swing.JCheckBox();
        txt_password_visible = new javax.swing.JTextField();
        txt_palabra_secreta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Rol = new javax.swing.JComboBox<>();
        jLabel_wallpaper = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Rol:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 170, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 170, -1));

        txt_usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, -1));

        jButton_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 90, 30));

        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, -1));

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, -1));

        jCheckBox_ver_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_ver_claveMouseClicked(evt);
            }
        });
        jCheckBox_ver_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ver_claveActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox_ver_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 20));

        txt_password_visible.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_password_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, -1));

        txt_palabra_secreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_palabra_secretaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_palabra_secreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cod. recuperacion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, -1));

        txt_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Registrador", "EncargadoVentas" }));
        txt_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RolActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel_wallpaper.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        jLabel_wallpaper.setText("aaaaa");
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 420, 400));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Telefono:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Rol:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Rol:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_usuario.getText().isEmpty()
                || txt_password.getText().isEmpty() || txt_telefono.getText().isEmpty() || txt_palabra_secreta.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuaro ya esta registrado
            Usuario usuario = new Usuario();
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            if (!controlUsuario.existeUsuario(txt_usuario.getText().trim())) {
                //enviamos datos del usuario
                usuario.setNombre(txt_nombre.getText().trim());
                usuario.setApellido(txt_apellido.getText().trim());
                usuario.setUsuario(txt_usuario.getText().trim());
                usuario.setPassword(txt_password.getText().trim());
                usuario.setTelefono(txt_telefono.getText().trim());
                usuario.setRol((String) txt_Rol.getSelectedItem());
                usuario.setPalabra_secreta(txt_palabra_secreta.getText().trim());
                usuario.setEstado(1);
                
                
                if (controlUsuario.guardar(usuario)) {
                    JOptionPane.showMessageDialog(null, "¡Usuario Registrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar Usuario!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario ya esta registrado, ingrese otro.");
            }
        }
        this.Limpiar();

    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void jCheckBox_ver_claveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_ver_claveMouseClicked
        if (jCheckBox_ver_clave.isSelected() == true) {
            String pass = "";
            char[] passIngresado = txt_password.getPassword();
            for (int i = 0; i < passIngresado.length; i++) {
                pass += passIngresado[i];
            }
            txt_password_visible.setText(pass);
            txt_password.setVisible(false);
            txt_password_visible.setVisible(true);
        } else {
            String passwordIngresado = txt_password_visible.getText().trim();
            txt_password.setText(passwordIngresado);
            txt_password.setVisible(true);
            txt_password_visible.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox_ver_claveMouseClicked

    private void jCheckBox_ver_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ver_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_ver_claveActionPerformed

    private void txt_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RolActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_palabra_secretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_palabra_secretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_palabra_secretaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JCheckBox jCheckBox_ver_clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JComboBox<String> txt_Rol;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_palabra_secreta;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_password_visible;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
     /**
     *
     * Metodo para limpiar campos
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_password.setText("");
        txt_usuario.setText("");
        txt_telefono.setText("");
    }
    
}