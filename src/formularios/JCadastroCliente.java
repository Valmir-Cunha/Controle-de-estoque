/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Administrador;
import javax.swing.JOptionPane;
import servicos.Administracao;

/**
 *
 * @author vinic
 */
public class JCadastroCliente extends javax.swing.JFrame {
    Administracao adm ;
    Administrador administrador;
    
    /**
     * Creates new form JCliente
     *
     */
    public JCadastroCliente() {
        initComponents();
    }
    
    /**
     * Creates new form JCliente
     * @param adm
     * @param administrador
     */
    public JCadastroCliente(Administracao adm,Administrador administrador) {
        initComponents();
        this.adm = adm;
        this.administrador = administrador;
        carregarCodigo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodCliente = new javax.swing.JLabel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodCliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCodCliente.setText("Cód. cliente:");

        jLabelNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelNomeCliente.setText("Nome:");

        jTextFieldCodCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldCodCliente.setEnabled(false);

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCelular.setText("Celular:");

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelTitulo.setText("Cadastro Clientes");

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelEndereco.setText("Endereço:");

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCelular)
                            .addComponent(jTextFieldCodCliente))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeCliente)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEndereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCadastrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodCliente)
                            .addComponent(jLabelNomeCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo)
                        .addGap(50, 50, 50)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelular)
                    .addComponent(jLabelEndereco))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonCadastrar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // Botão de cadastrar
        if(validarTextFieldNumerica(jTextFieldCelular.getText().trim())){
            cadastrarCliente();
            jTextFieldNomeCliente.setText("");
            jTextFieldCelular.setText("");
            jTextFieldEndereco.setText("");
            carregarCodigo();
        }else{
            JOptionPane.showMessageDialog(null, "Número de calular inválido.");
        }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
    
    /*
    *Limpa os campos e fecha tela;
    */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Botão cancelar
        jTextFieldNomeCliente.setText("");
        jTextFieldCelular.setText("");
        jTextFieldEndereco.setText("");
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
 
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
            java.util.logging.Logger.getLogger(JCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JCadastroCliente().setVisible(true);
            }
        });
    }
    
    /*
    *Busca na classe administração o id livre para cadastro e carrega para o campo de texto;
    */
    public void carregarCodigo(){
        String texto = String.valueOf(adm.getIdClientes());
        jTextFieldCodCliente.setText(texto);
    }
    
    /*
    *Realiza a leitura dos campos e chama a função de cadastro do cliente na classe administrador
    */
    public void cadastrarCliente(){
        if(jTextFieldNomeCliente.getText().trim().isEmpty() || jTextFieldCelular.getText().trim().isEmpty() || jTextFieldEndereco.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos os campos devem está preenchidos");
        }else{
            administrador.cadastrarCliente(Integer.parseInt(jTextFieldCodCliente.getText()),
            jTextFieldNomeCliente.getText() , jTextFieldCelular.getText(), jTextFieldEndereco.getText());
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
        }
        
    }

    public boolean validarTextFieldNumerica(String txt){
        String caracteres="0987654321.";
        if(!caracteres.contains(txt+"")){
            return true;
        }else{
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCodCliente;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCodCliente;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNomeCliente;
    // End of variables declaration//GEN-END:variables
}
