package Interfaz;

import Dominio.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class menuPrincipal extends javax.swing.JFrame {

    Sistema sistema;

    /**
     * Creates new form menuPrincipal
     *
     * @param sis
     */
    public menuPrincipal(Sistema sis) {
        initComponents();
        sistema = sis;
        cerrar();
    }

    //metodo para que cuando cierre guarde un archivo con los datos
    public void cerrar() {
        
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    try {
                        FileOutputStream ff = new FileOutputStream("datos.ser");
                        ObjectOutputStream out = new ObjectOutputStream(ff);
                        out.writeObject(sistema);
                        out.close();

                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "Error al encontrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error al escribir archivo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        registro = new javax.swing.JMenu();
        registroEditorial = new javax.swing.JMenuItem();
        registroGenero = new javax.swing.JMenuItem();
        registroAutor = new javax.swing.JMenuItem();
        registroLibro = new javax.swing.JMenuItem();
        ventas = new javax.swing.JMenu();
        registrarVenta = new javax.swing.JMenuItem();
        anularVenta = new javax.swing.JMenuItem();
        consultas = new javax.swing.JMenu();
        consultaLibros = new javax.swing.JMenuItem();
        consultaVenta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de librerias - Realizado por: Juan Pedro Longo (329112) - José Ignacio Arbilla (338084)");
        setMaximumSize(null);
        setMinimumSize(null);
        setSize(new java.awt.Dimension(200, 200));
        getContentPane().setLayout(null);

        registro.setText("Registros");

        registroEditorial.setText("Editorial");
        registroEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEditorialActionPerformed(evt);
            }
        });
        registro.add(registroEditorial);

        registroGenero.setText("Género");
        registroGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroGeneroActionPerformed(evt);
            }
        });
        registro.add(registroGenero);

        registroAutor.setText("Autor");
        registroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroAutorActionPerformed(evt);
            }
        });
        registro.add(registroAutor);

        registroLibro.setText("Libro");
        registroLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroLibroActionPerformed(evt);
            }
        });
        registro.add(registroLibro);

        jMenuBar1.add(registro);

        ventas.setText("Ventas");

        registrarVenta.setText("Registrar Venta");
        registrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVentaActionPerformed(evt);
            }
        });
        ventas.add(registrarVenta);

        anularVenta.setText("Anular Venta");
        anularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anularVentaActionPerformed(evt);
            }
        });
        ventas.add(anularVenta);

        jMenuBar1.add(ventas);

        consultas.setText("Consultas");

        consultaLibros.setText("Consulta de libros");
        consultaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaLibrosActionPerformed(evt);
            }
        });
        consultas.add(consultaLibros);

        consultaVenta.setText("Consulta de ventas");
        consultaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaVentaActionPerformed(evt);
            }
        });
        consultas.add(consultaVenta);

        jMenuBar1.add(consultas);

        jMenu1.setText("Terminar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(393, 205));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroAutorActionPerformed
        // TODO add your handling code here:
        ventRegAutor vent = new ventRegAutor(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_registroAutorActionPerformed

    private void registroLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroLibroActionPerformed
        // TODO add your handling code here:
        ventRegLibro vent = new ventRegLibro(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_registroLibroActionPerformed

    private void anularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anularVentaActionPerformed
        // TODO add your handling code here:
        ventAnularVenta vent = new ventAnularVenta(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_anularVentaActionPerformed

    private void registroEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEditorialActionPerformed
        // TODO add your handling code here:
        //se crea la ventana y se le manda el sistema
        ventRegEditorial vent = new ventRegEditorial(sistema);
        vent.setVisible(true);

    }//GEN-LAST:event_registroEditorialActionPerformed

    private void registroGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroGeneroActionPerformed
        // TODO add your handling code here:
        ventRegGenero vent = new ventRegGenero(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_registroGeneroActionPerformed

    private void registrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVentaActionPerformed
        // TODO add your handling code here:
        ventRegVentas vent = new ventRegVentas(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_registrarVentaActionPerformed

    private void consultaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaLibrosActionPerformed
        // TODO add your handling code here:
        ventConsLibros vent = new ventConsLibros(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_consultaLibrosActionPerformed

    private void consultaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaVentaActionPerformed
        // TODO add your handling code here:
        ventConsVentas vent = new ventConsVentas(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_consultaVentaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem anularVenta;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem consultaLibros;
    private javax.swing.JMenuItem consultaVenta;
    private javax.swing.JMenu consultas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem registrarVenta;
    private javax.swing.JMenu registro;
    private javax.swing.JMenuItem registroAutor;
    private javax.swing.JMenuItem registroEditorial;
    private javax.swing.JMenuItem registroGenero;
    private javax.swing.JMenuItem registroLibro;
    private javax.swing.JMenu ventas;
    // End of variables declaration//GEN-END:variables
}
