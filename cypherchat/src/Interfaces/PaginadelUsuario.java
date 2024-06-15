
package Interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class PaginadelUsuario extends javax.swing.JFrame {
    
    private JMenuItem ListadeContactos1;
    private JMenuItem Edicionperfil;
    private JMenuItem notificaciones1;
    Color colorfondo = new Color(0,102,102);
   
    public PaginadelUsuario() {
        initComponents();
        
        ListadeContactos1 = new JMenuItem("Lista de Contactos");
        ListadeContactos1.setOpaque(true);
        MenuUsuarios.add(ListadeContactos1);
        ListadeContactos1.setBackground(colorfondo);
        ListadeContactos1.setForeground(Color.WHITE);
        
        notificaciones1 = new JMenuItem("Notificaciones");
        notificaciones1.setOpaque(true);
        MenuUsuarios.add(notificaciones1);
        notificaciones1.setBackground(colorfondo);
        notificaciones1.setForeground(Color.WHITE);
        
        Edicionperfil = new JMenuItem("Editar Perfil");
        Edicionperfil.setOpaque(true);
        MenuUsuarios.add(Edicionperfil);
        Edicionperfil.setBackground(colorfondo);
        Edicionperfil.setForeground(Color.WHITE);
        
        ListadeContactos1.addActionListener((ActionEvent e)->{
            CambiardePanel(FondoContactos);
        });
        
        notificaciones1.addActionListener((ActionEvent e)->{
            CambiardePanel(FondoNotificaciones);
        });
        
        Edicionperfil.addActionListener((ActionEvent e)->{
            CambiardePanel(FondoEditar);
        });
        
        }
    
    private void CambiardePanel(JPanel jPanel){
         jPanel.setSize(FondoUsuarios.getWidth(), FondoUsuarios.getHeight());
            FondoUsuarios.removeAll();
            FondoUsuarios.add(jPanel);
            FondoUsuarios.repaint();
            ActivaciondePaneles(jPanel);
    }
    
    private void ActivaciondePaneles(JPanel jPanel){
    FondoContactos.setEnabled(false);
    FondoContactos.setVisible(false);
    
    FondoNotificaciones.setEnabled(false);
    FondoNotificaciones.setVisible(false);
    
    FondoEditar.setEnabled(false);
    FondoEditar.setVisible(false);
    
    jPanel.setVisible(true);
    jPanel.setEnabled(true);
    }
       
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoUsuarios = new javax.swing.JPanel();
        FondoContactos = new javax.swing.JPanel();
        Contactosusuarios = new javax.swing.JLabel();
        Buscarcontactos = new javax.swing.JLabel();
        TextoBuscarcontactos = new javax.swing.JTextField();
        BuscarContactos = new javax.swing.JButton();
        FondoNotificaciones = new javax.swing.JPanel();
        Pendientes = new javax.swing.JLabel();
        FondoEditar = new javax.swing.JPanel();
        Codigo2 = new javax.swing.JLabel();
        TextoCodigo2 = new javax.swing.JTextField();
        Nombre2 = new javax.swing.JLabel();
        TextoNombre2 = new javax.swing.JTextField();
        Apellido2 = new javax.swing.JLabel();
        TextoApellido2 = new javax.swing.JTextField();
        Genero2 = new javax.swing.JLabel();
        Contraseña2 = new javax.swing.JLabel();
        TextoGenero2 = new javax.swing.JTextField();
        TextoContraseña2 = new javax.swing.JTextField();
        Edad2 = new javax.swing.JLabel();
        Telefono2 = new javax.swing.JLabel();
        TextoEdad2 = new javax.swing.JTextField();
        TextoTelefono2 = new javax.swing.JTextField();
        BotonActualizar = new javax.swing.JButton();
        MenuUsuarios = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        FondoContactos.setBackground(new java.awt.Color(255, 255, 255));

        Contactosusuarios.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Contactosusuarios.setText("CONTACTOS");

        Buscarcontactos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Buscarcontactos.setText("Buscar Contactos:");

        TextoBuscarcontactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoBuscarcontactosActionPerformed(evt);
            }
        });

        BuscarContactos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BuscarContactos.setText("Buscar");

        javax.swing.GroupLayout FondoContactosLayout = new javax.swing.GroupLayout(FondoContactos);
        FondoContactos.setLayout(FondoContactosLayout);
        FondoContactosLayout.setHorizontalGroup(
            FondoContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoContactosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Contactosusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(FondoContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoContactosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TextoBuscarcontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Buscarcontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoContactosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        FondoContactosLayout.setVerticalGroup(
            FondoContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoContactosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(FondoContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contactosusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscarcontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoBuscarcontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BuscarContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        FondoNotificaciones.setBackground(new java.awt.Color(255, 255, 255));

        Pendientes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Pendientes.setText("Pendientes");

        javax.swing.GroupLayout FondoNotificacionesLayout = new javax.swing.GroupLayout(FondoNotificaciones);
        FondoNotificaciones.setLayout(FondoNotificacionesLayout);
        FondoNotificacionesLayout.setHorizontalGroup(
            FondoNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoNotificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(468, Short.MAX_VALUE))
        );
        FondoNotificacionesLayout.setVerticalGroup(
            FondoNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoNotificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        FondoEditar.setBackground(new java.awt.Color(255, 255, 255));

        Codigo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Codigo2.setText("Codigo:");

        Nombre2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombre2.setText("Nombre:");

        Apellido2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Apellido2.setText("Apellido:");

        Genero2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Genero2.setText("Genero:");

        Contraseña2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Contraseña2.setText("Contraseña:");

        Edad2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Edad2.setText("Edad:");

        Telefono2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Telefono2.setText("Telefono:");

        BotonActualizar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BotonActualizar.setText("Actualizar");

        javax.swing.GroupLayout FondoEditarLayout = new javax.swing.GroupLayout(FondoEditar);
        FondoEditar.setLayout(FondoEditarLayout);
        FondoEditarLayout.setHorizontalGroup(
            FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoEditarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoEditarLayout.createSequentialGroup()
                        .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoEditarLayout.createSequentialGroup()
                                .addComponent(Codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Genero2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(FondoEditarLayout.createSequentialGroup()
                                .addComponent(TextoCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(TextoGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)))
                        .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(FondoEditarLayout.createSequentialGroup()
                        .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edad2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(256, 256, 256))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoEditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        FondoEditarLayout.setVerticalGroup(
            FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoEditarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FondoUsuariosLayout = new javax.swing.GroupLayout(FondoUsuarios);
        FondoUsuarios.setLayout(FondoUsuariosLayout);
        FondoUsuariosLayout.setHorizontalGroup(
            FondoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoContactos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoNotificaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FondoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoUsuariosLayout.setVerticalGroup(
            FondoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoContactos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoNotificaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FondoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuUsuarios.setMaximumSize(new java.awt.Dimension(2, 4));
        MenuUsuarios.setMinimumSize(new java.awt.Dimension(2, 4));
        setJMenuBar(MenuUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoBuscarcontactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoBuscarcontactosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoBuscarcontactosActionPerformed

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
            java.util.logging.Logger.getLogger(PaginadelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginadelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginadelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginadelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PaginadelUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido2;
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BuscarContactos;
    private javax.swing.JLabel Buscarcontactos;
    private javax.swing.JLabel Codigo2;
    private javax.swing.JLabel Contactosusuarios;
    private javax.swing.JLabel Contraseña2;
    private javax.swing.JLabel Edad2;
    private javax.swing.JPanel FondoContactos;
    private javax.swing.JPanel FondoEditar;
    private javax.swing.JPanel FondoNotificaciones;
    private javax.swing.JPanel FondoUsuarios;
    private javax.swing.JLabel Genero2;
    private javax.swing.JMenuBar MenuUsuarios;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Pendientes;
    private javax.swing.JLabel Telefono2;
    private javax.swing.JTextField TextoApellido2;
    private javax.swing.JTextField TextoBuscarcontactos;
    private javax.swing.JTextField TextoCodigo2;
    private javax.swing.JTextField TextoContraseña2;
    private javax.swing.JTextField TextoEdad2;
    private javax.swing.JTextField TextoGenero2;
    private javax.swing.JTextField TextoNombre2;
    private javax.swing.JTextField TextoTelefono2;
    // End of variables declaration//GEN-END:variables
}
