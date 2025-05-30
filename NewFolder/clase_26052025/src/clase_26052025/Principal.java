/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase_26052025;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author claudiacortes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        //Limpiar elementos del combobox.
//        jcb_opciones.removeAllItems();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        jcb_opciones.setModel(modelo);
        jcb_editar.setModel(modelo);
        jcb_eliminar.setModel(modelo);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtp_tabs = new javax.swing.JTabbedPane();
        jp_agregar = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jp_ver = new javax.swing.JPanel();
        lbl_mensaje = new javax.swing.JLabel();
        jcb_opciones = new javax.swing.JComboBox<>();
        lbl_item = new javax.swing.JLabel();
        lbl_pos = new javax.swing.JLabel();
        lbl_item_display = new javax.swing.JLabel();
        lbl_pos_display = new javax.swing.JLabel();
        lbl_nombre_persona = new javax.swing.JLabel();
        lbl_nombre_display = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_apellido_display = new javax.swing.JLabel();
        lbl_id_display = new javax.swing.JLabel();
        jp_editar = new javax.swing.JPanel();
        jcb_editar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        txt_id_editar = new javax.swing.JTextField();
        txt_apellido_editar = new javax.swing.JTextField();
        txt_nombre_editar = new javax.swing.JTextField();
        jp_eliminar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jcb_eliminar = new javax.swing.JComboBox<>();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_agregar.setText("Agregar");
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregarMouseEntered(evt);
            }
        });

        lbl_nombre.setText("Nombre");

        javax.swing.GroupLayout jp_agregarLayout = new javax.swing.GroupLayout(jp_agregar);
        jp_agregar.setLayout(jp_agregarLayout);
        jp_agregarLayout.setHorizontalGroup(
            jp_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_agregarLayout.createSequentialGroup()
                .addGroup(jp_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_agregarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_nombre)
                        .addGap(91, 91, 91)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_agregarLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btn_agregar)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jp_agregarLayout.setVerticalGroup(
            jp_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_agregarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jp_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(btn_agregar)
                .addGap(104, 104, 104))
        );

        jtp_tabs.addTab("Agregar", jp_agregar);

        jcb_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peras", "Manzanas", "Uvas" }));
        jcb_opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_opcionesActionPerformed(evt);
            }
        });

        lbl_item.setText("Item");

        lbl_pos.setText("Pos: ");

        lbl_nombre_persona.setText("Nombre de la Persona");

        jLabel1.setText("Usuarios");

        jLabel2.setText("Apellido de la persona");

        jLabel3.setText("ID persona: ");

        javax.swing.GroupLayout jp_verLayout = new javax.swing.GroupLayout(jp_ver);
        jp_ver.setLayout(jp_verLayout);
        jp_verLayout.setHorizontalGroup(
            jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_verLayout.createSequentialGroup()
                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_verLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(lbl_mensaje))
                    .addGroup(jp_verLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(jcb_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_verLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jp_verLayout.createSequentialGroup()
                                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_pos)
                                    .addComponent(lbl_item)
                                    .addComponent(lbl_nombre_persona))
                                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_verLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(lbl_item_display))
                                    .addGroup(jp_verLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_nombre_display))
                                    .addGroup(jp_verLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_apellido_display)
                                            .addComponent(lbl_pos_display)
                                            .addComponent(lbl_id_display)))))
                            .addComponent(jLabel3))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jp_verLayout.setVerticalGroup(
            jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_verLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55)
                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_item)
                    .addComponent(lbl_item_display))
                .addGap(12, 12, 12)
                .addComponent(lbl_mensaje)
                .addGap(18, 18, 18)
                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pos)
                    .addComponent(lbl_pos_display))
                .addGap(65, 65, 65)
                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre_persona)
                    .addComponent(lbl_nombre_display))
                .addGap(18, 18, 18)
                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_apellido_display))
                .addGap(26, 26, 26)
                .addGroup(jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_id_display))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jtp_tabs.addTab("Visualizar", jp_ver);

        jcb_editar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_editarActionPerformed(evt);
            }
        });

        jLabel4.setText("Usuarios");

        jLabel5.setText("ID");

        jLabel6.setText("Nombre");

        jLabel7.setText("Apellido");

        btn_editar.setText("Guardar");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_editarLayout = new javax.swing.GroupLayout(jp_editar);
        jp_editar.setLayout(jp_editarLayout);
        jp_editarLayout.setHorizontalGroup(
            jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_editarLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_editarLayout.createSequentialGroup()
                        .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_editarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jcb_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_editarLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellido_editar)
                                    .addComponent(txt_id_editar)))))
                    .addGroup(jp_editarLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addComponent(txt_nombre_editar)))
                .addGap(146, 146, 146))
            .addGroup(jp_editarLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(btn_editar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp_editarLayout.setVerticalGroup(
            jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_editarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(59, 59, 59)
                .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_id_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nombre_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_apellido_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btn_editar))
        );

        jtp_tabs.addTab("Editar", jp_editar);

        jLabel8.setText("Usuarios");

        jcb_eliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_eliminarLayout = new javax.swing.GroupLayout(jp_eliminar);
        jp_eliminar.setLayout(jp_eliminarLayout);
        jp_eliminarLayout.setHorizontalGroup(
            jp_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_eliminarLayout.createSequentialGroup()
                .addGroup(jp_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_eliminarLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_eliminarLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btn_eliminar)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jp_eliminarLayout.setVerticalGroup(
            jp_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_eliminarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jp_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addComponent(btn_eliminar)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jtp_tabs.addTab("Eliminar", jp_eliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jtp_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jtp_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_opcionesActionPerformed
        int pos = jcb_opciones.getSelectedIndex();
        lbl_pos_display.setText(pos+"");

        Object item = jcb_opciones.getSelectedItem();
        lbl_item_display.setText(item.toString());
        if(item instanceof Persona){
            Persona p = (Persona) item;
            lbl_apellido_display.setText(p.getApellido());
            lbl_id_display.setText(p.getId());
            lbl_nombre_display.setText(p.getNombre());
        }

    }//GEN-LAST:event_jcb_opcionesActionPerformed

    private void btn_agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarMouseEntered

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        Persona p = new Persona(txt_nombre.getText(), txt_nombre.getText()+"Perez", "12345678");
        ArrayList personas = new ArrayList();

        //Obtener el modelo.
        //Casteo
        DefaultComboBoxModel modeoCasteado = (DefaultComboBoxModel)jcb_opciones.getModel();
        modeoCasteado.addElement(p);
        JOptionPane.showMessageDialog(this, "Objeto agregado");

    }//GEN-LAST:event_btn_agregarMouseClicked

    private void jcb_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_editarActionPerformed
        Object objeto = jcb_editar.getSelectedItem();
        if(objeto instanceof Persona){
            Persona p = (Persona)objeto;
            txt_id_editar.setText(p.getId());
            txt_nombre_editar.setText(p.getNombre());
            txt_apellido_editar.setText(p.getApellido());
            
        }
    }//GEN-LAST:event_jcb_editarActionPerformed

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
          Object objeto = jcb_editar.getSelectedItem();
        if(objeto instanceof Persona){
           Persona p = (Persona)objeto;
           p.setId(txt_id_editar.getText());
           p.setNombre(txt_nombre_editar.getText());
           p.setApellido(txt_apellido_editar.getText());
           JOptionPane.showMessageDialog(this, "Objeto Actualizado");
        }
    }//GEN-LAST:event_btn_editarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        int pos = jcb_eliminar.getSelectedIndex();
        
        jcb_eliminar.removeItemAt(pos);
        JOptionPane.showMessageDialog(this, "Objeto Eliminado");
    }//GEN-LAST:event_btn_eliminarMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jcb_editar;
    private javax.swing.JComboBox<String> jcb_eliminar;
    private javax.swing.JComboBox<String> jcb_opciones;
    private javax.swing.JPanel jp_agregar;
    private javax.swing.JPanel jp_editar;
    private javax.swing.JPanel jp_eliminar;
    private javax.swing.JPanel jp_ver;
    private javax.swing.JTabbedPane jtp_tabs;
    private javax.swing.JLabel lbl_apellido_display;
    private javax.swing.JLabel lbl_id_display;
    private javax.swing.JLabel lbl_item;
    private javax.swing.JLabel lbl_item_display;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre_display;
    private javax.swing.JLabel lbl_nombre_persona;
    private javax.swing.JLabel lbl_pos;
    private javax.swing.JLabel lbl_pos_display;
    private javax.swing.JTextField txt_apellido_editar;
    private javax.swing.JTextField txt_id_editar;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre_editar;
    // End of variables declaration//GEN-END:variables
}
