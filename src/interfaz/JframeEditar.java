/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import agenda.Agenda;
import agenda.Contacto;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;


/**
 *
 * @author kanutto
 */
public class JframeEditar extends javax.swing.JFrame {

    /**
     * Creates new form JframeInicio
     */
   private Contacto cont=new Contacto();
   private DefaultListModel<String> model = new DefaultListModel<>(); 
   private Agenda agenda;
    
    public DefaultListModel modelList() throws FileNotFoundException {
   
     
        for(Integer tel:cont.getTelefono())
         model.addElement(Integer.toString(tel));
    
        return model;
    }

   
    public JframeEditar() throws FileNotFoundException   {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(6); 
    }
    
     public JframeEditar(Contacto co,String ruta) throws FileNotFoundException   {
     this.agenda = new Agenda(ruta);
        initComponents();
        this.setVisible(true);
        this.setExtendedState(6); 
        cont=co;
        
        jTextFieldNombre.setText(cont.getNombre());
        jListTelefonos.setModel(modelList());
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
        jButtonAñadir = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTelefonos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSeleccionar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Añadir Contacto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        jButtonAñadir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 110, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 220, -1));

        jListTelefonos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jListTelefonos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        jTextFieldTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 220, -1));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 520, -1, -1));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, -1, -1));

        jButtonSeleccionar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSeleccionar.setText("Seleccionar");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/62863877-red-white-wallpapers.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        int i=jListTelefonos.getSelectedIndex();
        String tele=jTextFieldTelefono.getText();
        if((tele.length()>=3)&&(tele.length()<=12)){
            if(!jTextFieldNombre.getText().equals(model.get(i))){
                cont=agenda.Modificar(cont.getNombre(),Integer.parseInt(model.get(i)),Integer.parseInt(tele));
                model.removeAllElements();
                try {
                    jListTelefonos.setModel(modelList());
                    jTextFieldTelefono.setText("");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JframeEditar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                
                jTextFieldNombre.setText(jTextFieldTelefono.getText());
                cont=agenda.Modificar(cont.getNombre(),Integer.parseInt(model.get(i)),Integer.parseInt(tele));
                model.removeAllElements();
                try {
                    jListTelefonos.setModel(modelList());
                    jTextFieldTelefono.setText("");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JframeEditar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else {
             JOptionPane.showMessageDialog(null,  "El numero de telefono no es valido", "Mensaje de Error", JOptionPane.ERROR_MESSAGE); 

        }
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            agenda.EliminarContacto(cont.getNombre());
            cont.set_nombre(jTextFieldNombre.getText());
            for(int tel:cont.getTelefono())
                agenda.Anadir(cont.getNombre(),tel);
           
            agenda.guardarDatos();
            JframeInicio volver=new JframeInicio(agenda);
            volver.setVisible(true);
            JframeEditar.this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(JframeEditar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    try {
            JframeInicio volver=new JframeInicio();
            volver.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JframeContacto.class.getName()).log(Level.SEVERE, null, ex);
        }
        JframeEditar.this.dispose();
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
     int i=jListTelefonos.getSelectedIndex();
     jTextFieldTelefono.setText(model.get(i));
     
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    /**
     * @param args the command line arguments
     */
  
   

    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(JframeEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                try {
                    new JframeEditar().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JframeEditar.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                  
            }
        });
        
       
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JList<String> jListTelefonos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
