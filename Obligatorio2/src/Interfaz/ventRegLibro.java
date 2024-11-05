package Interfaz;

import Dominio.*;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class ventRegLibro extends javax.swing.JFrame implements Observer {

    Sistema sistema;

    /**
     * Creates new form ventRegLibro
     */
    public ventRegLibro(Sistema sis) {
        initComponents();
        sistema = sis;
        cargarListaEditoriales();
        cargarListaGenero();

        sis.addObserver(this);
    }

    public void update(Observable o, Object ob) {
        cargarListaEditoriales();
        cargarListaGenero();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        lbRegLibro = new javax.swing.JLabel();
        lbTitRegLib = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        lbEdiRegLib = new javax.swing.JLabel();
        lbGenRegLib = new javax.swing.JLabel();
        lbAutRegLib = new javax.swing.JLabel();
        lbPrecCosRegLib = new javax.swing.JLabel();
        txtPrecioCosto = new javax.swing.JTextField();
        lbisbnRegLib = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        lbPrecVentaRegLib = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        btnRegLibro = new javax.swing.JButton();
        btnCancLibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listGenero = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEdi = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        listAut = new javax.swing.JList();
        btnFoto = new javax.swing.JButton();
        lbFotoRegLib = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        lbStockRegLib = new javax.swing.JLabel();
        pnllistGen = new javax.swing.JPanel();
        pnlListEdi = new javax.swing.JPanel();
        pnlListAut = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        pnlFoto = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Libro");
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        lbRegLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbRegLibro.setForeground(new java.awt.Color(0, 171, 0));
        lbRegLibro.setText("Registrar Libro");
        getContentPane().add(lbRegLibro);
        lbRegLibro.setBounds(120, 10, 170, 25);

        lbTitRegLib.setText("Titulo");
        getContentPane().add(lbTitRegLib);
        lbTitRegLib.setBounds(30, 40, 100, 16);

        txtTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLibroActionPerformed(evt);
            }
        });
        getContentPane().add(txtTituloLibro);
        txtTituloLibro.setBounds(30, 60, 180, 20);

        lbEdiRegLib.setText("Editorial:");
        getContentPane().add(lbEdiRegLib);
        lbEdiRegLib.setBounds(30, 160, 70, 16);

        lbGenRegLib.setText("Género:");
        getContentPane().add(lbGenRegLib);
        lbGenRegLib.setBounds(30, 86, 130, 20);

        lbAutRegLib.setText("Autor:");
        getContentPane().add(lbAutRegLib);
        lbAutRegLib.setBounds(30, 230, 90, 20);

        lbPrecCosRegLib.setText("Precio costo");
        getContentPane().add(lbPrecCosRegLib);
        lbPrecCosRegLib.setBounds(280, 120, 100, 16);
        getContentPane().add(txtPrecioCosto);
        txtPrecioCosto.setBounds(280, 140, 64, 22);

        lbisbnRegLib.setText("ISBN");
        getContentPane().add(lbisbnRegLib);
        lbisbnRegLib.setBounds(410, 50, 70, 16);

        txtISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBNActionPerformed(evt);
            }
        });
        getContentPane().add(txtISBN);
        txtISBN.setBounds(410, 70, 71, 22);

        lbPrecVentaRegLib.setText("Precio venta");
        getContentPane().add(lbPrecVentaRegLib);
        lbPrecVentaRegLib.setBounds(410, 120, 80, 16);
        getContentPane().add(txtPrecioVenta);
        txtPrecioVenta.setBounds(410, 140, 70, 22);

        btnRegLibro.setText("Registrar");
        btnRegLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegLibro);
        btnRegLibro.setBounds(370, 290, 80, 23);

        btnCancLibro.setText("Cancelar");
        btnCancLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancLibro);
        btnCancLibro.setBounds(470, 290, 80, 23);

        listGenero.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listGenero.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listGeneroValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listGenero);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 190, 50);

        jScrollPane2.setToolTipText("");

        listEdi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listEdi);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(27, 176, 190, 50);

        listAut.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(listAut);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(30, 260, 190, 50);

        btnFoto.setText("Subir foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto);
        btnFoto.setBounds(280, 210, 100, 23);

        lbFotoRegLib.setText("Foto");
        getContentPane().add(lbFotoRegLib);
        lbFotoRegLib.setBounds(280, 190, 90, 16);

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        getContentPane().add(txtStock);
        txtStock.setBounds(280, 70, 64, 22);

        lbStockRegLib.setText("Stock");
        getContentPane().add(lbStockRegLib);
        lbStockRegLib.setBounds(280, 50, 60, 16);
        getContentPane().add(pnllistGen);
        pnllistGen.setBounds(10, 90, 230, 70);
        getContentPane().add(pnlListEdi);
        pnlListEdi.setBounds(20, 160, 210, 70);
        getContentPane().add(pnlListAut);
        pnlListAut.setBounds(20, 230, 200, 90);

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("Sin Fotos");
        getContentPane().add(lblFoto);
        lblFoto.setBounds(390, 180, 140, 90);
        getContentPane().add(pnlFoto);
        pnlFoto.setBounds(380, 170, 70, 70);

        setSize(new java.awt.Dimension(590, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancLibroActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancLibroActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        // TODO add your handling code here:
        //cargar foto en el panel
        JFileChooser fc = new JFileChooser();
        int seleccion = fc.showOpenDialog(this);
        File carpetaImagenes = new File("src/Interfaz/imgs");
        if (!carpetaImagenes.exists()) {
            carpetaImagenes.mkdir();
        }
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            String nombreNuevo = txtISBN.getText() + ".jpg";
            System.out.println(nombreNuevo);
            File destino = new File(carpetaImagenes, nombreNuevo);
            File foto = fc.getSelectedFile();
            try {
                // Copiar el archivo a la carpeta de imágenes con el nuevo nombre
                Files.copy(foto.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);

                //JOptionPane.showMessageDialog(this, "Imagen guardada exitosamente como: " + nombreNuevo);
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al guardar la imagen.");
            }
            boolean waitforfile = true;
            while (waitforfile) {
                File f = new File("src//Interfaz/imgs/" + nombreNuevo);
                if (f.exists() && !f.isDirectory()) {
                    waitforfile = false;
                }
            }
            String path = "/Interfaz/imgs/"+nombreNuevo;
            System.out.println(path);
            //System.out.println(foto.getAbsolutePath());
            Icon icono = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                    .getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), 0));
            lblFoto.setIcon(icono);
            //en ql caso de que no exista la carpeta de imagenes la tiene que crear y guardar la imagen con el nombre de isbn
        }

    }//GEN-LAST:event_btnFotoActionPerformed

    private void listGeneroValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listGeneroValueChanged
        // TODO add your handling code here:
        //se toma con el index el numero que tiene ese genero seleccionado y se toma de la lista de generos
        //cuando no hay nada seleccionado es -1
        Genero gen = (Genero) listGenero.getSelectedValue();
        if (gen != null) {
            cargarListaAutores(gen);
        }

    }//GEN-LAST:event_listGeneroValueChanged

    private void txtISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtISBNActionPerformed

    private void btnRegLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegLibroActionPerformed
        // TODO add your handling code here:
        //a la hora de registrar el libro hay que fijarse si ya existia el isbn
        try {
            if (!sistema.chequearNum(Integer.parseInt(txtPrecioCosto.getText()))) {
                JOptionPane.showMessageDialog(null, "El precio de costo debe de ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                txtPrecioCosto.setText("");
            } else if (!sistema.chequearNum(Integer.parseInt(txtPrecioVenta.getText()))) {
                JOptionPane.showMessageDialog(null, "El precio de venta debe de ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                txtPrecioVenta.setText("");
            } else if (!sistema.chequearISBN(txtISBN.getText())) {
                JOptionPane.showMessageDialog(null, "ISBN duplicado", "Error", JOptionPane.ERROR_MESSAGE);
                txtISBN.setText("");

            } else if (!sistema.chequearNum(Integer.parseInt(txtStock.getText()))) {
                //chequeo del stock, tiene que ser mayor a 0
                JOptionPane.showMessageDialog(null, "El stock debe de ser mayor que 0", "Error", JOptionPane.ERROR_MESSAGE);
                txtStock.setText("");
            } else {
                //si los datos anterirores estan bien, hay que crear el libro y agregarlo a la lista
                Genero gen = (Genero) listGenero.getSelectedValue();
                Editorial edi = (Editorial) listEdi.getSelectedValue();
                Autor aut = (Autor) listAut.getSelectedValue();

                //hay que parsear los datos que vienen en string
                int stock = Integer.parseInt(txtStock.getText());
                int precioCosto = Integer.parseInt(txtPrecioCosto.getText());
                int precioVenta = Integer.parseInt(txtPrecioVenta.getText());

                if (gen != null && edi != null && aut != null) {
                    Libro lib = new Libro(txtTituloLibro.getText(), edi, txtISBN.getText(), aut, gen, stock, precioCosto, precioVenta);
                    sistema.regLibro(lib);

                    JOptionPane.showMessageDialog(null, "guardo", "Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccion genero, editorial y autor", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No pueden haber datos vacios y los números tienen que ser positivos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegLibroActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloLibroActionPerformed

    //se carga la lista de generos
    public void cargarListaGenero() {
        if (sistema.getListaGeneros().size() > 0) {
            listGenero.setListData(sistema.getListaGeneros().toArray());
            //pnllistGen.setVisible(false);
            //}else{
            //  pnllistGen.setVisible(true);
        }
    }

    //se carga la lista de editoriales
    public void cargarListaEditoriales() {
        listEdi.setListData(sistema.getListaEditoriales().toArray());
    }

    //se carga la lista de autores dependiendo del genero que escriban
    public void cargarListaAutores(Genero gen) {
        listAut.setListData(sistema.getAutoresPorGénero(gen).toArray());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancLibro;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnRegLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbAutRegLib;
    private javax.swing.JLabel lbEdiRegLib;
    private javax.swing.JLabel lbFotoRegLib;
    private javax.swing.JLabel lbGenRegLib;
    private javax.swing.JLabel lbPrecCosRegLib;
    private javax.swing.JLabel lbPrecVentaRegLib;
    private javax.swing.JLabel lbRegLibro;
    private javax.swing.JLabel lbStockRegLib;
    private javax.swing.JLabel lbTitRegLib;
    private javax.swing.JLabel lbisbnRegLib;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JList listAut;
    private javax.swing.JList listEdi;
    private javax.swing.JList listGenero;
    private javax.swing.JPanel pnlFoto;
    private javax.swing.JPanel pnlListAut;
    private javax.swing.JPanel pnlListEdi;
    private javax.swing.JPanel pnllistGen;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables

}
