/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Genero;
import Dominio.Libro;
import Dominio.Sistema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class ventRegVentas extends javax.swing.JFrame implements Observer {

    Sistema sistema;
    HashMap<Libro, Integer> librosEnVenta;
    /**
     * Creates new form ventRegVentas
     */
    public ventRegVentas(Sistema sis) {
        initComponents();
        sistema=sis;
        librosEnVenta=new HashMap<>();
        cargarListaLibros();
        
       
    }
    
    public void update(Observable o, Object ob){
        cargarListaLibros();
        
        sistema.addObserver(this);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFacturaRegVenta = new javax.swing.JLabel();
        lblFechaRegVenta = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        lblClienteRegVenta = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblLibroRegVenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLibros = new javax.swing.JList();
        btnEliminarLbr = new javax.swing.JButton();
        btnAgregarlbr1 = new javax.swing.JButton();
        lblVentaRegVenta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listVentas = new javax.swing.JList();
        lblTotalVenta = new javax.swing.JLabel();
        btnCancVenta = new javax.swing.JButton();
        btnRegVenta = new javax.swing.JButton();
        lblRegVenta = new javax.swing.JLabel();
        lblNumFac = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venta de Libros");
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        lblFacturaRegVenta.setText("Factura : ");
        getContentPane().add(lblFacturaRegVenta);
        lblFacturaRegVenta.setBounds(20, 20, 50, 16);

        lblFechaRegVenta.setText("Fecha");
        getContentPane().add(lblFechaRegVenta);
        lblFechaRegVenta.setBounds(20, 50, 30, 16);

        txtFechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVentaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaVenta);
        txtFechaVenta.setBounds(60, 50, 200, 22);

        lblClienteRegVenta.setText("Cliente");
        getContentPane().add(lblClienteRegVenta);
        lblClienteRegVenta.setBounds(280, 50, 37, 16);

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCliente);
        txtNombreCliente.setBounds(330, 50, 230, 22);

        lblLibroRegVenta.setText("Libros");
        getContentPane().add(lblLibroRegVenta);
        lblLibroRegVenta.setBounds(20, 100, 32, 16);

        jScrollPane1.setViewportView(listLibros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 220, 120);

        btnEliminarLbr.setText("<-");
        btnEliminarLbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLbrActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarLbr);
        btnEliminarLbr.setBounds(260, 190, 50, 40);

        btnAgregarlbr1.setText("->");
        btnAgregarlbr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarlbr1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarlbr1);
        btnAgregarlbr1.setBounds(260, 140, 50, 40);

        lblVentaRegVenta.setText("Venta");
        getContentPane().add(lblVentaRegVenta);
        lblVentaRegVenta.setBounds(340, 100, 30, 16);

        jScrollPane2.setViewportView(listVentas);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(330, 120, 230, 120);

        lblTotalVenta.setText("Total: $ número total de venta");
        getContentPane().add(lblTotalVenta);
        lblTotalVenta.setBounds(330, 260, 220, 16);

        btnCancVenta.setText("Cancelar");
        btnCancVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancVenta);
        btnCancVenta.setBounds(390, 300, 74, 23);

        btnRegVenta.setText("Registrar");
        btnRegVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegVenta);
        btnRegVenta.setBounds(130, 300, 80, 23);

        lblRegVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRegVenta.setForeground(new java.awt.Color(0, 171, 0));
        lblRegVenta.setText("Registro de Ventas");
        getContentPane().add(lblRegVenta);
        lblRegVenta.setBounds(210, 0, 210, 25);

        lblNumFac.setText("1");
        getContentPane().add(lblNumFac);
        lblNumFac.setBounds(90, 20, 100, 16);

        setSize(new java.awt.Dimension(602, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVentaActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnEliminarLbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLbrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarLbrActionPerformed

    private void btnAgregarlbr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarlbr1ActionPerformed
        // TODO add your handling code here:
       if(listLibros.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null,"Debe seleccionar un libro", "Error", JOptionPane.ERROR_MESSAGE);
       }
       else{
           guardarEnLista();
           cargarListaVentas();
       }
    }//GEN-LAST:event_btnAgregarlbr1ActionPerformed

    private void btnCancVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancVentaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancVentaActionPerformed

    private void btnRegVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegVentaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRegVentaActionPerformed

   public void cargarListaLibros(){
        listLibros.setListData(sistema.ordenarXTitulo().toArray());
    }
   
   public void cargarListaVentas(){
        ArrayList<String> aux = new ArrayList<>();
        Iterator<Libro> it = librosEnVenta.keySet().iterator();
        System.out.println("1");
        while(it.hasNext()){
           Libro l = it.next();
           int cantidad = librosEnVenta.get(l);
           String itemTexto = cantidad + " - " + l.getTitulo() + " - $" + l.getPrecioVenta();
           aux.add(itemTexto); 
        }
        listVentas.setListData(aux.toArray());
   }
   //HASHMAP
   public void guardarEnLista(){
       Libro actual = (Libro) listLibros.getSelectedValue();
       boolean esta = false;
       Iterator<Libro> it = librosEnVenta.keySet().iterator();
       while(it.hasNext() && !esta){
           Libro aux = it.next();
           int auxCant = librosEnVenta.get(aux);
           if(aux.equals(actual)){
               esta = true;
               librosEnVenta.put(aux, auxCant+1);
           }
       }
       if(!esta){
           librosEnVenta.put(actual,1);
       }
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarlbr1;
    private javax.swing.JButton btnCancVenta;
    private javax.swing.JButton btnEliminarLbr;
    private javax.swing.JButton btnRegVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClienteRegVenta;
    private javax.swing.JLabel lblFacturaRegVenta;
    private javax.swing.JLabel lblFechaRegVenta;
    private javax.swing.JLabel lblLibroRegVenta;
    private javax.swing.JLabel lblNumFac;
    private javax.swing.JLabel lblRegVenta;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JLabel lblVentaRegVenta;
    private javax.swing.JList listLibros;
    private javax.swing.JList listVentas;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables

    
}
