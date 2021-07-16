/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Categoria;
import entidades.GestorDeEstoque;
import entidades.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.Estoque;

/**
 *
 * @author vinic
 */
public class JListaCategorias extends javax.swing.JFrame {
    Estoque est;
    GestorDeEstoque gestor;
    /**
     * Creates new form JListaCategorias
     */
    public JListaCategorias() {
        initComponents();
    }
    
    /**
     * Creates new form JListaCategorias
     * @param est
     * @param gestor
     */
    public JListaCategorias(Estoque est, GestorDeEstoque gestor) {
        initComponents();
        this.est = est;
        this.gestor = gestor;
        jButtonExibirProdutos.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameEditar = new javax.swing.JFrame();
        jButtonSalvarEdicao = new javax.swing.JButton();
        jLabelTitulo2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCodCategoria2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNomeCategoriaEditado = new javax.swing.JTextField();
        jButtonVoltar2 = new javax.swing.JButton();
        jDialogListaProdutosCategoria = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutosCategoria = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExibirProdutos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();

        jButtonSalvarEdicao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonSalvarEdicao.setText("Salvar");
        jButtonSalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEdicaoActionPerformed(evt);
            }
        });

        jLabelTitulo2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelTitulo2.setText("Editar categoria");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Código:");

        jTextFieldCodCategoria2.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Nome:");

        jButtonVoltar2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonVoltar2.setText("Voltar");
        jButtonVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameEditarLayout = new javax.swing.GroupLayout(jFrameEditar.getContentPane());
        jFrameEditar.getContentPane().setLayout(jFrameEditarLayout);
        jFrameEditarLayout.setHorizontalGroup(
            jFrameEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCodCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar2))
                .addGap(18, 18, 18)
                .addGroup(jFrameEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameEditarLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jFrameEditarLayout.createSequentialGroup()
                        .addGap(0, 209, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarEdicao))
                    .addComponent(jTextFieldNomeCategoriaEditado))
                .addContainerGap())
            .addGroup(jFrameEditarLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabelTitulo2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrameEditarLayout.setVerticalGroup(
            jFrameEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo2)
                .addGap(26, 26, 26)
                .addGroup(jFrameEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrameEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeCategoriaEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jFrameEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar2)
                    .addComponent(jButtonSalvarEdicao))
                .addContainerGap())
        );

        jTableProdutosCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome", "Marca", "Categoria", "Quant.", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableProdutosCategoria);
        if (jTableProdutosCategoria.getColumnModel().getColumnCount() > 0) {
            jTableProdutosCategoria.getColumnModel().getColumn(0).setMinWidth(80);
            jTableProdutosCategoria.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableProdutosCategoria.getColumnModel().getColumn(0).setMaxWidth(80);
            jTableProdutosCategoria.getColumnModel().getColumn(2).setMinWidth(100);
            jTableProdutosCategoria.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableProdutosCategoria.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableProdutosCategoria.getColumnModel().getColumn(3).setMinWidth(100);
            jTableProdutosCategoria.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableProdutosCategoria.getColumnModel().getColumn(3).setMaxWidth(100);
            jTableProdutosCategoria.getColumnModel().getColumn(4).setMinWidth(80);
            jTableProdutosCategoria.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTableProdutosCategoria.getColumnModel().getColumn(4).setMaxWidth(80);
            jTableProdutosCategoria.getColumnModel().getColumn(5).setMinWidth(80);
            jTableProdutosCategoria.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTableProdutosCategoria.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Produtos da categoria");

        javax.swing.GroupLayout jDialogListaProdutosCategoriaLayout = new javax.swing.GroupLayout(jDialogListaProdutosCategoria.getContentPane());
        jDialogListaProdutosCategoria.getContentPane().setLayout(jDialogListaProdutosCategoriaLayout);
        jDialogListaProdutosCategoriaLayout.setHorizontalGroup(
            jDialogListaProdutosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaProdutosCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialogListaProdutosCategoriaLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogListaProdutosCategoriaLayout.setVerticalGroup(
            jDialogListaProdutosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogListaProdutosCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Lista de categorias");

        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Lista de produtos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCategorias);
        if (jTableCategorias.getColumnModel().getColumnCount() > 0) {
            jTableCategorias.getColumnModel().getColumn(0).setMinWidth(80);
            jTableCategorias.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableCategorias.getColumnModel().getColumn(0).setMaxWidth(80);
            jTableCategorias.getColumnModel().getColumn(2).setMinWidth(160);
            jTableCategorias.getColumnModel().getColumn(2).setPreferredWidth(160);
            jTableCategorias.getColumnModel().getColumn(2).setMaxWidth(160);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Nome:");

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExibirProdutos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonExibirProdutos.setText("Exibir produtos");
        jButtonExibirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExibirProdutosActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setText("Exibir todas as categorias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(38, 38, 38)
                                .addComponent(jButtonExibirProdutos))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExibirProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // Botao voltar
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botao para listar todas as categorias
        carregarCategorias();
        jButtonExibirProdutos.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // Botao pesquisar
        pesquisarCategoria();
        jButtonExibirProdutos.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Botão excluir categotia
        excluirCategoria();
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        carregarCategorias();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Botão editar categotia
        
        if(jTableCategorias.getSelectedRow() != -1){
            jFrameEditar.setVisible(true);
            jFrameEditar.setSize(400,250);
            jFrameEditar.setLocationRelativeTo(null);
            Object ob = jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 0);
            String texto = ob.toString();
            jTextFieldCodCategoria2.setText(texto);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "É necessário selecionar, na tabela, a categoria que deseja editar.");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExibirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExibirProdutosActionPerformed
        // Botão de exibir lista de produtos da categoria selecionada.
        if(jTableCategorias.getSelectedRow() != -1){
            if((boolean )jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 2)){
                jDialogListaProdutosCategoria.setVisible(true);
                jDialogListaProdutosCategoria.setSize(700, 350);
                jDialogListaProdutosCategoria.setLocationRelativeTo(null);
                exibirListaProdutos();
            }else{
                JOptionPane.showMessageDialog(null, "A categoria selecionada não possui produtos.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "É necessário selecionar, na tabela, a categoria que deseja editar.");
        }
    }//GEN-LAST:event_jButtonExibirProdutosActionPerformed

    private void jButtonSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEdicaoActionPerformed
        // Botao salvar tela de editar
        editarCategoria();
    }//GEN-LAST:event_jButtonSalvarEdicaoActionPerformed

    private void jButtonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar2ActionPerformed
        // Botao voltar tela de editar
        jFrameEditar.setVisible(false);
        dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButtonVoltar2ActionPerformed

    private void jTableCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriasMouseClicked
        // TODO add your handling code here:
        Object ob = jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 0);
        String texto = ob.toString();
        jTextFieldCod.setText(texto);
        ob =jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 1);
        texto = ob.toString();
        jTextFieldNome.setText(texto);
    }//GEN-LAST:event_jTableCategoriasMouseClicked

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
            java.util.logging.Logger.getLogger(JListaCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JListaCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JListaCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JListaCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JListaCategorias().setVisible(true);
            }
        });
    }
    //Preenchimento da tabela
    public void carregarCategorias(){
        DefaultTableModel model = (DefaultTableModel) jTableCategorias.getModel();
        for(Categoria categoria: est.getCategorias()){
            if(categoria.getProdutos().isEmpty()){
                model.addRow(new Object[]{categoria.getCodigoCategoria(), categoria.getNomeCategoria(),false});
            }else{
                model.addRow(new Object[]{categoria.getCodigoCategoria(), categoria.getNomeCategoria(),true});
            }
        }
    }
    
    public void pesquisarCategoria(){
        Categoria categoria;
        DefaultTableModel model = (DefaultTableModel) jTableCategorias.getModel();
        model.setRowCount(0);
        if(jTextFieldCod.getText().isEmpty() && jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, preencha algum campo para pesquisa.");
        }
        else if(jTextFieldCod.getText().isEmpty()){
            categoria = est.encontrarCategoriaNome(jTextFieldNome.getText());
            if(categoria == null){
                JOptionPane.showMessageDialog(null, "Categoria não encontrada.");
                jTextFieldCod.requestFocus();
            }else{
             model.addRow(new Object[]{categoria.getCodigoCategoria(), categoria.getNomeCategoria(),true});   
            }
        } else if(jTextFieldNome.getText().isEmpty()){
            categoria = est.encontrarCategoriaCodigo(Integer.parseInt(jTextFieldCod.getText()));
            if(categoria == null){
                JOptionPane.showMessageDialog(null, "Categoria não encontrada.");
                jTextFieldCod.requestFocus();
            }else{
             model.addRow(new Object[]{categoria.getCodigoCategoria(), categoria.getNomeCategoria(),true});   
            }
        } else {
            categoria = est.encontrarCategoriaCodigo(Integer.parseInt(jTextFieldCod.getText()));
            if(categoria == null){
                JOptionPane.showMessageDialog(null, "Categoria não encontrada.");
                jTextFieldCod.requestFocus();
            }else{
             model.addRow(new Object[]{categoria.getCodigoCategoria(), categoria.getNomeCategoria(),true});   
            }
        }
    }
    
    public void exibirListaProdutos(){
        DefaultTableModel model = (DefaultTableModel) jTableProdutosCategoria.getModel();
        Categoria categoria;
        categoria = est.encontrarCategoriaCodigo((int) jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 0));
        if(categoria.getProdutos().isEmpty()){
            JOptionPane.showMessageDialog(null, "Categoria sem produtos.");
            
        }else{
            for(Produto produto: categoria.getProdutos()){
                model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome() ,produto.getMarca(),produto.getCategoria().getNomeCategoria(),produto.getQuantidadeEstoque(),produto.getPreco(),});
            }
        }
        //jButtonExibirProdutos.setEnabled(true);
    }
    
    public void editarCategoria(){
        int id;
        Categoria categoria;
        DefaultTableModel model = (DefaultTableModel) jTableCategorias.getModel();
        id = (int) jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 0);
        if(jTextFieldNomeCategoriaEditado.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo \"nome\" está vazio.");
        } else{
            if(gestor.editarCategoria(id, jTextFieldNomeCategoriaEditado.getText())){
                JOptionPane.showMessageDialog(null, "Categoria editada.");
                model.removeRow(jTableCategorias.getSelectedRow());
                categoria = est.encontrarCategoriaCodigo(id);
                if(categoria.getProdutos().isEmpty()){
                model.addRow(new Object[]{categoria.getCodigoCategoria(), categoria.getNomeCategoria(),false});
                }else{
                model.addRow(new Object[]{categoria.getCodigoCategoria(), categoria.getNomeCategoria(),true});
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao editar categoria");
            }
        }
    }
    
    public void excluirCategoria(){
        if(jTableCategorias.getSelectedRow() != -1){
            DefaultTableModel model = (DefaultTableModel) jTableCategorias.getModel();
            if(gestor.excluirCategoria((int) jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 0))){
                JOptionPane.showMessageDialog(null, "Categoria excluida.");
                model.removeRow(jTableCategorias.getSelectedRow());
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao excluir categoria");
            }
        }else{
            JOptionPane.showMessageDialog(null, "É necessário selecionar, na tabela, a categoria que deseja excluir.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonExibirProdutos;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvarEdicao;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonVoltar2;
    private javax.swing.JDialog jDialogListaProdutosCategoria;
    private javax.swing.JFrame jFrameEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCategorias;
    private javax.swing.JTable jTableProdutosCategoria;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldCodCategoria2;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeCategoriaEditado;
    // End of variables declaration//GEN-END:variables
}
