/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao.carro;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Carro;
import modelo.Cliente;
import modelo.Pessoa;
import modelo.dao.CarroDao;
import visualizacao.Inicializacao;
import visualizacao.componentes.table.NonEditableTableModel;

/**
 *
 * @author Rosaine Fiorio
 */
public class TelaSelecaoVeiculo extends javax.swing.JInternalFrame {

    private Cliente cliente;
    private List<Carro> veiculos;
    private Carro veiculoSelecionado;

    /**
     * Creates new form TelaSelecaoVeiculo
     */
    public TelaSelecaoVeiculo(Cliente cliente) {
        initComponents();
        this.cliente = cliente;

        this.lblCliente.setText(this.cliente.getNome());
        this.veiculos = this.buscarVeiculos(this.cliente);
        this.popularTabelaVeiculos();

        this.tblVeiculos.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                super.mouseClicked(me);
                if(me.getClickCount()==2){
                    selecionarVeiculo();
                }
            }
            
        });
    }

    public TelaSelecaoVeiculo(String placa, Cliente cliente) {
        initComponents();
        this.cliente = cliente;

        this.lblCliente.setText(this.cliente.getNome());
        this.veiculos = this.buscarVeiculos(placa, cliente);
        this.popularTabelaVeiculos();
    }

    private void popularTabelaVeiculos() {
        NonEditableTableModel defaultTableModel = new NonEditableTableModel();
        defaultTableModel.setColumnIdentifiers(new String[]{"Placa", "Modelo"});

        for (Carro carro : veiculos) {
            defaultTableModel.addRow(new String[]{carro.getPlaca(), carro.getModelo()});
        }

        this.tblVeiculos.setModel(defaultTableModel);
        this.tblVeiculos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                btnSelecionarVeiculo.setEnabled(!tblVeiculos.getSelectionModel().isSelectionEmpty());
                veiculoSelecionado = veiculos.get(tblVeiculos.getSelectedRow());
            }
        });
        this.tblVeiculos.getSelectionModel().setSelectionInterval(0, 0);
        this.tblVeiculos.setRowSelectionInterval(0, 0);
        this.tblVeiculos.requestFocus();
    }

    private List<Carro> buscarVeiculos(Pessoa cliente) {
        return new CarroDao().buscarCarros(cliente);
    }

    private List<Carro> buscarVeiculos(String placa, Pessoa cliente) {
        return new CarroDao().buscarCarro(placa, cliente);
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
        jLabel2 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSelecionarVeiculo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Seleção de veículo");

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel1.setPreferredSize(new java.awt.Dimension(405, 35));

        jLabel2.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblVeiculos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVeiculos.setSurrendersFocusOnKeystroke(true);
        tblVeiculos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblVeiculosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVeiculos);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(405, 50));

        btnSelecionarVeiculo.setText("Selecionar veículo");
        btnSelecionarVeiculo.setEnabled(false);
        btnSelecionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarVeiculoActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar veículo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarVeiculo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarVeiculo)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaVeiculo telaCadastroVeiculo = new TelaVeiculo(cliente);
        Inicializacao.AREA_DE_TRABALHO.add(telaCadastroVeiculo);
        telaCadastroVeiculo.setVisible(true);

        telaCadastroVeiculo.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                veiculos = buscarVeiculos(cliente);
                popularTabelaVeiculos();
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSelecionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarVeiculoActionPerformed
        selecionarVeiculo();
    }//GEN-LAST:event_btnSelecionarVeiculoActionPerformed

    private void tblVeiculosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVeiculosKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            selecionarVeiculo();
        }
    }//GEN-LAST:event_tblVeiculosKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelecionarVeiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JTable tblVeiculos;
    // End of variables declaration//GEN-END:variables

    public Carro getVeiculoSelecionado() {
        return veiculoSelecionado;
    }

    public void setVeiculoSelecionado(Carro veiculoSelecionado) {
        this.veiculoSelecionado = veiculoSelecionado;
    }

    private void selecionarVeiculo() {
        this.setVeiculoSelecionado(this.veiculos.get(this.tblVeiculos.getSelectedRow()));
        this.fireInternalFrameEvent(InternalFrameEvent.INTERNAL_FRAME_CLOSING);
        this.dispose();
    }
}
