/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Docentes;

/**
 *
 * @author PC
 */
public class Consultar_Reportes_Docente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultar_Reportes_Docente
     */
    public Consultar_Reportes_Docente() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_Imprimir_Docente = new javax.swing.JButton();
        btn_Salir_Docente = new javax.swing.JButton();
        txt_Docente = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Docente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 55, -1, -1));

        btn_Imprimir_Docente.setText("Imprimir");
        getContentPane().add(btn_Imprimir_Docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 144, 81, 39));

        btn_Salir_Docente.setText("Salir");
        getContentPane().add(btn_Salir_Docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 142, 70, 42));
        getContentPane().add(txt_Docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 52, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Imprimir_Docente;
    public javax.swing.JButton btn_Salir_Docente;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField txt_Docente;
    // End of variables declaration//GEN-END:variables
}
