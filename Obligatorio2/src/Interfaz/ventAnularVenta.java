
package Interfaz;

import Dominio.Sistema;
import Dominio.Venta;
import javax.swing.JOptionPane;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class ventAnularVenta extends javax.swing.JFrame {

    Sistema sistema;
    /**
     * Creates new form ventAnularVenta
     */
    public ventAnularVenta(Sistema sis) {
        initComponents();
        sistema=sis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFacAnuVenta = new javax.swing.JLabel();
        txtNumFact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listInfo = new javax.swing.JList();
        lbDatAnuVenta = new javax.swing.JLabel();
        btnAnular = new javax.swing.JButton();
        btnCancAnular = new javax.swing.JButton();
        lbAnuVenta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anular Venta");
        getContentPane().setLayout(null);

        lbFacAnuVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFacAnuVenta.setText("Ingrese el número de factura: ");
        getContentPane().add(lbFacAnuVenta);
        lbFacAnuVenta.setBounds(30, 50, 210, 20);

        txtNumFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFactActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumFact);
        txtNumFact.setBounds(220, 50, 100, 22);

        jScrollPane1.setViewportView(listInfo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 420, 110);

        lbDatAnuVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDatAnuVenta.setText("Datos de la Venta:");
        getContentPane().add(lbDatAnuVenta);
        lbDatAnuVenta.setBounds(30, 90, 160, 20);

        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnular);
        btnAnular.setBounds(260, 290, 72, 23);

        btnCancAnular.setText("Cancelar");
        btnCancAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancAnularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancAnular);
        btnCancAnular.setBounds(380, 290, 76, 23);

        lbAnuVenta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbAnuVenta.setForeground(new java.awt.Color(255, 0, 0));
        lbAnuVenta.setText("Anular Venta");
        getContentPane().add(lbAnuVenta);
        lbAnuVenta.setBounds(110, 10, 160, 20);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 50, 72, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Fecha:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 120, 120, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 120, 70, 20);

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(lblFecha);
        lblFecha.setBounds(80, 120, 140, 20);

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(lblCliente);
        lblCliente.setBounds(310, 120, 170, 20);

        setSize(new java.awt.Dimension(518, 353));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancAnularActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancAnularActionPerformed

    private void txtNumFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFactActionPerformed

    }//GEN-LAST:event_txtNumFactActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Se hace con try catch por si no ingresan un número en el num de factura
        try{
            if(!sistema.existeVenta(Integer.parseInt(txtNumFact.getText()))){
                JOptionPane.showMessageDialog(null, "No existe una venta con ese numero de factura", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Venta escogida = sistema.ubicarVenta(Integer.parseInt(txtNumFact.getText()));
                lblFecha.setText(escogida.getFecha());
                lblCliente.setText(escogida.getCliente());
                listInfo.setListData(escogida.getListaDeVenta().toArray());
            }
        } 
        catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        try{
            if(!sistema.existeVenta(Integer.parseInt(txtNumFact.getText()))){
                JOptionPane.showMessageDialog(null, "No existe una venta con ese numero de factura", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Venta aEliminarse = sistema.ubicarVenta(Integer.parseInt(txtNumFact.getText()));
                sistema.anularVenta(aEliminarse.getListaDeVenta(), Integer.parseInt(txtNumFact.getText()) ); //se le pasa el arraylist de infoventa para reestockear los libros y su numero de factura para eliminarlo del sistema 
                JOptionPane.showMessageDialog(null, "Venta anulada correctamente", "Anulación de Venta", JOptionPane.INFORMATION_MESSAGE);
                lblFecha.setText("");
                lblCliente.setText("");
                listInfo.setListData(new String[0]); //Se le carga con un array de string vacío para que la lista quede vacía
                txtNumFact.setText("");
            }
        } 
        catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAnularActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCancAnular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAnuVenta;
    private javax.swing.JLabel lbDatAnuVenta;
    private javax.swing.JLabel lbFacAnuVenta;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JList listInfo;
    private javax.swing.JTextField txtNumFact;
    // End of variables declaration//GEN-END:variables
}
