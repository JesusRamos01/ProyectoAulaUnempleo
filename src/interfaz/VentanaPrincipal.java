/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import co.edu.unicolombo.ingsistemas.pb.VentanaBuscarEmpresa;
import co.edu.unicolombo.ingsistemas.pb.VentanaBuscarUsuario;
import co.edu.unicolombo.ingsistemas.pb.VentanaEmpresa;
import co.edu.unicolombo.ingsistemas.pb.VentanaInicioSesionEmpresa;
import co.edu.unicolombo.ingsistemas.pb.VentanaUsuarioInicioSesion;
import co.edu.unicolombo.ingsistemas.pb.VentanaUsuarios;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User_Sena
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    public HashMap<String, ArrayList<String>> Usuario = new HashMap<>();
    
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        itemIniciarSesionUsuario = new javax.swing.JMenuItem();
        itemRegistrarUsuario = new javax.swing.JMenuItem();
        itemBuscarUsuario = new javax.swing.JMenuItem();
        itemReportesUsuario = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenu();
        menuTodosLosUsuarios = new javax.swing.JMenuItem();
        itemerrorUsuario = new javax.swing.JMenuItem();
        menuEmpresas = new javax.swing.JMenu();
        itemInicioEmpresa = new javax.swing.JMenuItem();
        itemRegistrarEmpresa = new javax.swing.JMenuItem();
        itemBuscarEmpresa = new javax.swing.JMenuItem();
        menuReportesEmpresa = new javax.swing.JMenu();
        menuAdminEmpresa = new javax.swing.JMenu();
        itemVerEmpresas = new javax.swing.JMenuItem();
        itemErroresEmpresa = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemIndice = new javax.swing.JMenuItem();
        itemTutorial = new javax.swing.JMenuItem();
        itemAcercade = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LOGO");

        jMenuBar1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N

        menuUsuario.setText("Usuario");
        menuUsuario.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });

        itemIniciarSesionUsuario.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemIniciarSesionUsuario.setText("Iniciar Sesión...");
        itemIniciarSesionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarSesionUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemIniciarSesionUsuario);

        itemRegistrarUsuario.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemRegistrarUsuario.setText("Registrarse...");
        itemRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemRegistrarUsuario);

        itemBuscarUsuario.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemBuscarUsuario.setText("Buscar...");
        itemBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemBuscarUsuario);

        itemReportesUsuario.setText("Reportes...");
        itemReportesUsuario.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N

        menuAdmin.setText("Solo administradores");
        menuAdmin.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N

        menuTodosLosUsuarios.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        menuTodosLosUsuarios.setText("Ver todos los usuarios");
        menuAdmin.add(menuTodosLosUsuarios);

        itemReportesUsuario.add(menuAdmin);

        itemerrorUsuario.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemerrorUsuario.setText("reportar un error");
        itemReportesUsuario.add(itemerrorUsuario);

        menuUsuario.add(itemReportesUsuario);

        jMenuBar1.add(menuUsuario);

        menuEmpresas.setText("Empresas");
        menuEmpresas.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N

        itemInicioEmpresa.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemInicioEmpresa.setText("Iniciar Sesion...");
        itemInicioEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInicioEmpresaActionPerformed(evt);
            }
        });
        menuEmpresas.add(itemInicioEmpresa);

        itemRegistrarEmpresa.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemRegistrarEmpresa.setText("Registrarse...");
        itemRegistrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarEmpresaActionPerformed(evt);
            }
        });
        menuEmpresas.add(itemRegistrarEmpresa);

        itemBuscarEmpresa.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemBuscarEmpresa.setText("Buscar...");
        itemBuscarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarEmpresaActionPerformed(evt);
            }
        });
        menuEmpresas.add(itemBuscarEmpresa);

        menuReportesEmpresa.setText("Reportes...");
        menuReportesEmpresa.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N

        menuAdminEmpresa.setText("Solo administradores");
        menuAdminEmpresa.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N

        itemVerEmpresas.setText("Ver todas las empresas");
        menuAdminEmpresa.add(itemVerEmpresas);

        menuReportesEmpresa.add(menuAdminEmpresa);

        itemErroresEmpresa.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemErroresEmpresa.setText("Reportar un error...");
        menuReportesEmpresa.add(itemErroresEmpresa);

        menuEmpresas.add(menuReportesEmpresa);

        jMenuBar1.add(menuEmpresas);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N

        itemIndice.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemIndice.setText("Indice...");
        menuAyuda.add(itemIndice);

        itemTutorial.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemTutorial.setText("Tutorial...");
        itemTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTutorialActionPerformed(evt);
            }
        });
        menuAyuda.add(itemTutorial);

        itemAcercade.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemAcercade.setText("Acerca de...");
        menuAyuda.add(itemAcercade);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void itemIniciarSesionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSesionUsuarioActionPerformed
     VentanaUsuarioInicioSesion US = new VentanaUsuarioInicioSesion(true, this);
     US.setLocationRelativeTo(this);
     US.setVisible(true);
     
    }//GEN-LAST:event_itemIniciarSesionUsuarioActionPerformed

    private void itemTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTutorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTutorialActionPerformed

    private void itemBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarUsuarioActionPerformed
     VentanaBuscarUsuario VBU = new VentanaBuscarUsuario(this,true);
     VBU.setLocationRelativeTo(this);
     VBU.setVisible(true);
    }//GEN-LAST:event_itemBuscarUsuarioActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
    
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void itemRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarUsuarioActionPerformed
    VentanaUsuarios U = new VentanaUsuarios(this,true);     
    U.setLocationRelativeTo(this);
    U.setVisible(true);
    }//GEN-LAST:event_itemRegistrarUsuarioActionPerformed

    private void itemInicioEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInicioEmpresaActionPerformed
      VentanaInicioSesionEmpresa IE = new VentanaInicioSesionEmpresa (this,true);
      IE.setLocationRelativeTo(this);
      IE.setVisible(true);
    }//GEN-LAST:event_itemInicioEmpresaActionPerformed

    private void itemRegistrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarEmpresaActionPerformed
     VentanaEmpresa VE = new VentanaEmpresa(this,true);
     VE.setLocationRelativeTo(this);
     VE.setVisible(true);
    }//GEN-LAST:event_itemRegistrarEmpresaActionPerformed

    private void itemBuscarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarEmpresaActionPerformed
     VentanaBuscarEmpresa VBE = new VentanaBuscarEmpresa(this,true);
     VBE.setLocationRelativeTo(this);
     VBE.setVisible(true);
    }//GEN-LAST:event_itemBuscarEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAcercade;
    private javax.swing.JMenuItem itemBuscarEmpresa;
    private javax.swing.JMenuItem itemBuscarUsuario;
    private javax.swing.JMenuItem itemErroresEmpresa;
    private javax.swing.JMenuItem itemIndice;
    private javax.swing.JMenuItem itemIniciarSesionUsuario;
    private javax.swing.JMenuItem itemInicioEmpresa;
    private javax.swing.JMenuItem itemRegistrarEmpresa;
    private javax.swing.JMenuItem itemRegistrarUsuario;
    private javax.swing.JMenu itemReportesUsuario;
    private javax.swing.JMenuItem itemTutorial;
    private javax.swing.JMenuItem itemVerEmpresas;
    private javax.swing.JMenuItem itemerrorUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuAdminEmpresa;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEmpresas;
    private javax.swing.JMenu menuReportesEmpresa;
    private javax.swing.JMenuItem menuTodosLosUsuarios;
    private javax.swing.JMenu menuUsuario;
    // End of variables declaration//GEN-END:variables
}