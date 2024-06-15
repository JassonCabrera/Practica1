
package Interfaces;

import javax.swing.JOptionPane;
import modelo.Logica.LogicadeUsuario;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Iniciodesesion extends javax.swing.JFrame {

    Fondopanel fondo=new Fondopanel();
    public Iniciodesesion() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
        BotonIngresar.setEnabled(false);
    }

    public void validar1(){
        
if (TextoUsuario.getText().isEmpty()){
    ObligatorioCodigo.setText("*Obligatorio");
}else{
    ObligatorioCodigo.setText("");
            }

if (TextoContraseña.getText().isEmpty()){
    ObligatorioContraseña.setText("*Obligatorio");
}else{
    ObligatorioContraseña.setText("");
            }

if (TextoUsuario.getText().isEmpty() || TextoContraseña.getText().isEmpty()){
    BotonIngresar.setEnabled(false);
}else{
    BotonIngresar.setEnabled(true);
}
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondopanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoUsuario = new javax.swing.JTextField();
        TextoContraseña = new javax.swing.JPasswordField();
        BotonIngresar = new javax.swing.JButton();
        MostrarContraseña = new javax.swing.JCheckBox();
        ErrorCC = new javax.swing.JLabel();
        ObligatorioContraseña = new javax.swing.JLabel();
        ObligatorioCodigo = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setText("Contraseña:");

        TextoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoUsuarioKeyTyped(evt);
            }
        });

        TextoContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoContraseñaKeyReleased(evt);
            }
        });

        BotonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        BotonIngresar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BotonIngresar.setText("Ingresar");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });

        MostrarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        MostrarContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MostrarContraseña.setText("Mostrar Contraseña");
        MostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContraseñaActionPerformed(evt);
            }
        });

        ErrorCC.setBackground(new java.awt.Color(255, 255, 255));
        ErrorCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ErrorCC.setForeground(new java.awt.Color(255, 0, 0));

        ObligatorioContraseña.setBackground(new java.awt.Color(255, 255, 255));
        ObligatorioContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ObligatorioContraseña.setForeground(new java.awt.Color(255, 0, 0));

        ObligatorioCodigo.setBackground(new java.awt.Color(255, 255, 255));
        ObligatorioCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ObligatorioCodigo.setForeground(new java.awt.Color(255, 0, 0));

        BotonRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        BotonRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ObligatorioContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(ObligatorioCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MostrarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ErrorCC, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ObligatorioCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ObligatorioContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MostrarContraseña)
                .addGap(8, 8, 8)
                .addComponent(ErrorCC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarContraseñaActionPerformed
        if(MostrarContraseña.isSelected()){
            TextoContraseña.setEchoChar((char)0);
        }else{
            TextoContraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_MostrarContraseñaActionPerformed

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        if(!TextoUsuario.getText().isEmpty()&&!TextoContraseña.getText().isEmpty()){
            if(LogicadeUsuario.autentificar(TextoUsuario.getText(), TextoContraseña.getText())){
                JOptionPane.showMessageDialog(this, "Bienvenido"+TextoUsuario);
                this.dispose();
                PaginadelUsuario paginadelusuario=new PaginadelUsuario();
                paginadelusuario.setVisible(true);
            }else{
              JOptionPane.showMessageDialog(this, "Codigo o Contraseña invalido");  
            }
        }else{
            JOptionPane.showMessageDialog(this, "Falta Codigo o Contraseña");
        }
        
        String codigomodulador="202010033";
        String contraseñamodulador="p1IPC1";
        String codigoadministrador="202100047";
        String contraseñaadministrador="p1IPC1";
        
        String pass=new String (TextoContraseña.getPassword());
        if (TextoUsuario.getText().equals(codigomodulador)&& pass.equals(contraseñamodulador)){
            Moderador newmod = new Moderador();
            newmod.setVisible(true);
            this.dispose();
            }else{
            ErrorCC.setText("Codigo o Contraseña erronea");
        }
        
        if (TextoUsuario.getText().equals(codigoadministrador)&& pass.equals(contraseñaadministrador)){
            
        PaginaAdministrador newmad = new PaginaAdministrador();
        newmad.setVisible(true);
        this.dispose();    
        }else{
            ErrorCC.setText("Codigo o Contraseña erronea");
        }
    }//GEN-LAST:event_BotonIngresarActionPerformed

    
    
    private void TextoUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoUsuarioKeyReleased
           validar1();
    }//GEN-LAST:event_TextoUsuarioKeyReleased

    private void TextoContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoContraseñaKeyReleased
           validar1();
    }//GEN-LAST:event_TextoContraseñaKeyReleased

    private void TextoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoUsuarioKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_TextoUsuarioKeyTyped

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        NuevoRegistro nuevoregistro = new NuevoRegistro();
        nuevoregistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(Iniciodesesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciodesesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciodesesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciodesesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Iniciodesesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel ErrorCC;
    private javax.swing.JCheckBox MostrarContraseña;
    private javax.swing.JLabel ObligatorioCodigo;
    private javax.swing.JLabel ObligatorioContraseña;
    private javax.swing.JPasswordField TextoContraseña;
    private javax.swing.JTextField TextoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    class Fondopanel extends JPanel
{
    private Image imagen;
    @Override
    public void paint (Graphics g)
    {
        imagen = new ImageIcon(getClass().getResource("/ImagenesChat/fondo3.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(), getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
    
}
