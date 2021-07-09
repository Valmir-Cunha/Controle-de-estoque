/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.GestorDeEstoque;
import servicos.Administracao;
import servicos.Estoque;

/**
 *
 * @author vinic
 */
public class jMenu extends javax.swing.JFrame {
    Administracao adm;
    Estoque est;
    GestorDeEstoque gestor;
    /**
     * Creates new form jMenu
     */
    public jMenu() {
        initComponents();
    }
    /**
     * Creates new form jMenu
     * @param adm
     * @param estoque
     * @param gestor
     */
    public jMenu(Administracao adm,Estoque estoque,GestorDeEstoque gestor) {
        this.est = estoque;
        this.adm = adm;
        this.gestor = gestor;
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

        jLabelMenu = new javax.swing.JLabel();
        jButtonClientes = new javax.swing.JButton();
        jButtonProduto = new javax.swing.JButton();
        jButtonCategorias = new javax.swing.JButton();
        jButtonCaixa = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenu.setText("Menu");
        getContentPane().add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jButtonClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClientes.setText("Clientes");
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jButtonProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonProduto.setText("Produtos");
        jButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jButtonCategorias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCategorias.setText("Categorias");
        jButtonCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategoriasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jButtonCaixa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCaixa.setText("Caixa");
        jButtonCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaixaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 80, -1));

        jButtonFechar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        imagem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        imagem.setForeground(new java.awt.Color(255, 255, 255));
        imagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\Documents\\GitHub\\Controle-de-Estoque\\src\\imagem\\png-clipart-online-marketplace-marketing-e-commerce-shopping-marketplace-logo-supermarket.png")); // NOI18N
        imagem.setText("Menu");
        getContentPane().add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 10, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategoriasActionPerformed
        // Botão categoria
        JCategoria categoria = new JCategoria(est, gestor);
        categoria.setVisible(true);
    }//GEN-LAST:event_jButtonCategoriasActionPerformed

    private void jButtonCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaixaActionPerformed
        //Botão do caixa
        JCaixa caixa = new JCaixa(adm,est);
        caixa.setVisible(true);
    }//GEN-LAST:event_jButtonCaixaActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        // Botão cliente
        JClientes clientes = new JClientes(adm);
        clientes.setVisible(true);
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoActionPerformed
        // Botão produtos
        JProdutos produtos = new JProdutos(est,gestor);
        produtos.setVisible(true);
    }//GEN-LAST:event_jButtonProdutoActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Botão fechar
        System.exit(0);
    }//GEN-LAST:event_jButtonFecharActionPerformed

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
            java.util.logging.Logger.getLogger(jMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem;
    private javax.swing.JButton jButtonCaixa;
    private javax.swing.JButton jButtonCategorias;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonProduto;
    private javax.swing.JLabel jLabelMenu;
    // End of variables declaration//GEN-END:variables
}
