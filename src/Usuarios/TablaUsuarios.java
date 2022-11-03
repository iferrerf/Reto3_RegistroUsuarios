/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Usuarios;

import Modelo.Usuario;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ismae
 */
public class TablaUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form TablaUsuarios
     */
    public TablaUsuarios() {
        initComponents();
        inicializarTabla();
    }

    
    private void inicializarTabla(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[] {"Nombre", "Primer Apellido", "Segundo Apellido", "Fecha Nacimiento", "Sexo M", "Nacionalidad"});
        tblUsuarios.setModel(dtm);
    }
    
    public void añadirCliente(Usuario usuario){
        DefaultTableModel dtm = (DefaultTableModel) tblUsuarios.getModel();
        dtm.addRow(usuario.toArrayList());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        pnlTable.setLayout(new java.awt.GridLayout(1, 0));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        pnlTable.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlTable;
    public static javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
