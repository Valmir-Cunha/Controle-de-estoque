/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author vinic
 */
public class JFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form JFuncionarios
     */
    public JFuncionarios() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCodFuncionario = new javax.swing.JLabel();
        jLabelNomeFuncionario = new javax.swing.JLabel();
        jTextFieldCodFuncionario = new javax.swing.JTextField();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jLabelCelularFuncionario = new javax.swing.JLabel();
        jTextFieldCelularFuncionario = new javax.swing.JTextField();
        jLabelEnderecoFuncionario = new javax.swing.JLabel();
        jTextFieldEnderecoFuncionario = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelSalarioFuncionario = new javax.swing.JLabel();
        jTextFieldSalarioFuncionario = new javax.swing.JTextField();
        jTextFieldUsuarioFuncionario = new javax.swing.JTextField();
        jLabeUsuarioFuncionariol = new javax.swing.JLabel();
        jLabelSenhaFuncionario = new javax.swing.JLabel();
        jTextFieldSenhaFuncionario = new javax.swing.JTextField();
        jLabelFuncaoFuncionario = new javax.swing.JLabel();
        jComboBoxFuncaoFuncionario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelTitulo.setText("Cadastro Funcionário");

        jLabelCodFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCodFuncionario.setText("Cód funcionário:");

        jLabelNomeFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelNomeFuncionario.setText("Nome:");

        jLabelCelularFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCelularFuncionario.setText("Celular:");

        jLabelEnderecoFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelEnderecoFuncionario.setText("Endereço:");

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonCancelar.setText("Cancelar");

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");

        jLabelSalarioFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelSalarioFuncionario.setText("Salário:");

        jLabeUsuarioFuncionariol.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabeUsuarioFuncionariol.setText("Usuário:");

        jLabelSenhaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelSenhaFuncionario.setText("Senha:");

        jLabelFuncaoFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelFuncaoFuncionario.setText("Função:");

        jComboBoxFuncaoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(43, 410, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCodFuncionario)
                                .addComponent(jLabelCelularFuncionario)
                                .addComponent(jLabelSalarioFuncionario)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldSalarioFuncionario)
                                    .addGap(21, 21, 21)))
                            .addComponent(jTextFieldCelularFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabeUsuarioFuncionariol)
                                    .addComponent(jTextFieldUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSenhaFuncionario)
                                    .addComponent(jTextFieldSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFuncaoFuncionario)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButtonCadastrar))
                                            .addComponent(jComboBoxFuncaoFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEnderecoFuncionario)
                                    .addComponent(jLabelNomeFuncionario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabelTitulo))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEnderecoFuncionario)))
                                .addGap(32, 32, 32))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodFuncionario)
                    .addComponent(jLabelNomeFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelularFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCelularFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeUsuarioFuncionariol)
                    .addComponent(jLabelSenhaFuncionario)
                    .addComponent(jLabelFuncaoFuncionario)
                    .addComponent(jLabelSalarioFuncionario))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxFuncaoFuncionario;
    private javax.swing.JLabel jLabeUsuarioFuncionariol;
    private javax.swing.JLabel jLabelCelularFuncionario;
    private javax.swing.JLabel jLabelCodFuncionario;
    private javax.swing.JLabel jLabelEnderecoFuncionario;
    private javax.swing.JLabel jLabelFuncaoFuncionario;
    private javax.swing.JLabel jLabelNomeFuncionario;
    private javax.swing.JLabel jLabelSalarioFuncionario;
    private javax.swing.JLabel jLabelSenhaFuncionario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldCelularFuncionario;
    private javax.swing.JTextField jTextFieldCodFuncionario;
    private javax.swing.JTextField jTextFieldEnderecoFuncionario;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldSalarioFuncionario;
    private javax.swing.JTextField jTextFieldSenhaFuncionario;
    private javax.swing.JTextField jTextFieldUsuarioFuncionario;
    // End of variables declaration//GEN-END:variables
}
