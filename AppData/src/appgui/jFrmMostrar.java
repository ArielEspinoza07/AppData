/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgui;

import appdata.Persistencia;
import appdata.PersonaDAO;
import appentities.Persona;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marisol molina rosal
 */
public class jFrmMostrar extends javax.swing.JFrame {

    /**
     * Creates new form jFrmMostrar
     */
    private DefaultTableModel modeloTabla ;
    public jFrmMostrar() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDatos = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jbtnInsert = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtCed = new javax.swing.JTextField();
        jtxtNom = new javax.swing.JTextField();
        jtxtApe = new javax.swing.JTextField();
        jtxtTel = new javax.swing.JTextField();
        jtxtEma = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTblDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTblDatos);

        jToolBar1.setRollover(true);

        jbtnInsert.setText("Insertar");
        jbtnInsert.setFocusable(false);
        jbtnInsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnInsert.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInsertActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnInsert);

        jbtnUpdate.setText("Modificar");
        jbtnUpdate.setFocusable(false);
        jbtnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnUpdate);

        jbtnDelete.setText("Eliminar");
        jbtnDelete.setFocusable(false);
        jbtnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbtnDelete);

        jbtnSalir.setText("Salir");
        jbtnSalir.setFocusable(false);
        jbtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnSalir);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Telefono");

        jLabel5.setText("Email");

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnGuardar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtCed, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(jtxtNom)
                                .addComponent(jtxtApe)
                                .addComponent(jtxtTel))
                            .addComponent(jbtnCancelar)
                            .addComponent(jtxtEma, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtxtApe, jtxtCed, jtxtEma, jtxtNom, jtxtTel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtEma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnGuardar)
                            .addComponent(jbtnCancelar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.asignarModelo();
        
        this.ocultar();
        
        try {
            this.llenarTabla();
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInsertActionPerformed
        // TODO add your handling code here:
        this.ventanaGrande();
        this.mostrar();
        this.jtxtCed.requestFocus();
    }//GEN-LAST:event_jbtnInsertActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        Persona p = new Persona();
        String ced = this.jtxtCed.getText();
        if(ced.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el numero de cedula");
            this.jtxtCed.requestFocus();
            return;
        }else{
            p.setCedula(ced);
        }

        String nom = this.jtxtNom.getText();
        if(nom.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre");
            this.jtxtNom.requestFocus();
            return;
        }else{
            p.setNombre(nom);
        }

        String ape = this.jtxtApe.getText();
        if(ape.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el apellido");
            this.jtxtApe.requestFocus();
            return;
        }else{
            p.setApellidos(ape);
        }

        String tel = this.jtxtTel.getText();
        if(tel.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el numero de telefono");
            this.jtxtTel.requestFocus();
            return;
        }else{
            p.setTelefono(tel);
        }

        String ema = this.jtxtEma.getText();
        if(ema.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el email");
            this.jtxtEma.requestFocus();
            return;
        }else{
            p.setEmail(ema);
        }
        
        PersonaDAO.Guardar(p);
        
        this.asignarModelo();
        try {
            this.llenarTabla();
        } catch (SQLException ex) {}
        
        this.limpiar();
        this.ventanaNormal();
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        this.limpiar();
        this.ocultar();
        this.ventanaNormal();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        // TODO add your handling code here:
       this.ventanaGrande();
       this.mostrar();
        
       String ced = (String)this.jTblDatos.getValueAt(this.jTblDatos.getSelectedRow(),this.jTblDatos.getSelectedColumn());
       Persona p = new Persona();
       p.setCedula(ced);
       
               
        try {
            Persona P = PersonaDAO.getPersona(p);
            
            this.jtxtCed.setText(P.getCedula());
            this.jtxtNom.setText(P.getNombre());
            this.jtxtApe.setText(P.getApellidos());
            this.jtxtTel.setText(P.getTelefono());
            this.jtxtEma.setText(P.getEmail());
        } catch (SQLException ex) {}
        
        
    }//GEN-LAST:event_jbtnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jFrmMostrar mos = new jFrmMostrar();
                mos.setSize(650, 480);
                mos.setVisible(true);
                mos.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblDatos;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnInsert;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtApe;
    private javax.swing.JTextField jtxtCed;
    private javax.swing.JTextField jtxtEma;
    private javax.swing.JTextField jtxtNom;
    private javax.swing.JTextField jtxtTel;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() throws SQLException {
        LinkedList lista = PersonaDAO.getALL();
        if(!lista.isEmpty()){
            ListIterator ite = lista.listIterator();
                        
            while(ite.hasNext()){
                String Datos[] = new String[5];
                Persona per = (Persona)ite.next();
                Datos[0]=per.getCedula();
                Datos[1]=per.getNombre();
                Datos[2]=per.getApellidos();
                Datos[3]=per.getTelefono();
                Datos[4]=per.getEmail();
                
                this.modeloTabla.addRow(Datos);
            }
        }
    }

    private void asignarModelo() {
        String datos[] = {"Cedula","Nombre","Apellidos","Telefono","Email"};
        this.modeloTabla = new DefaultTableModel(datos,0);
        this.jTblDatos.setModel(modeloTabla);
        this.jTblDatos.setRowSelectionAllowed(true);
    }
    
    private void ocultar(){
        this.jtxtCed.setVisible(false);
        this.jtxtApe.setVisible(false);
        this.jtxtTel.setVisible(false);
        this.jtxtEma.setVisible(false);
        this.jbtnGuardar.setVisible(false);
        this.jbtnCancelar.setVisible(false);
        
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);
    }
    
    private void mostrar(){
        this.jtxtCed.setVisible(true);
        this.jtxtApe.setVisible(true);
        this.jtxtTel.setVisible(true);
        this.jtxtEma.setVisible(true);
        this.jbtnGuardar.setVisible(true);
        this.jbtnCancelar.setVisible(true);
        
        this.jLabel1.setVisible(true);
        this.jLabel2.setVisible(true);
        this.jLabel3.setVisible(true);
        this.jLabel4.setVisible(true);
        this.jLabel5.setVisible(true);
    }
    
    private void limpiar(){
        String limpiar="";
        this.jtxtCed.setText(limpiar);
        this.jtxtNom.setText(limpiar);
        this.jtxtApe.setText(limpiar);
        this.jtxtTel.setText(limpiar);
        this.jtxtEma.setText(limpiar);
    }
    
    private void ventanaNormal(){
        this.setSize(650, 480);
        this.setLocationRelativeTo(null);
    }
    
    private void ventanaGrande(){
        this.setSize(1033, 480);
        this.setLocationRelativeTo(null);
    }
}