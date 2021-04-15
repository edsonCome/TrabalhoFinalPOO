
package View;

import java.awt.Color;
import View.CFuncionarios;
import View.CProdutos;
import controller.ControllerUsuario;
import javax.swing.JFrame;
import model_Bean.ModelUsuario;

public class TelaPrinc extends javax.swing.JFrame {
    

   
    public TelaPrinc() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setBackground(new Color(0,0,0,0));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemPEfectuados = new javax.swing.JMenuItem();
        jMenuItemPReservados = new javax.swing.JMenuItem();
        jMenuItemVEfectuadas = new javax.swing.JMenuItem();
        jMenuItemSaidas = new javax.swing.JMenuItem();
        jMenuItemFeixo = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TPrincip.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 1280, 620);

        jMenuCadastros.setText("Cadastros");

        jMenuItemFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Func.png"))); // NOI18N
        jMenuItemFuncionario.setText("Funcionario");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFuncionario);

        jMenuItemProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto.png"))); // NOI18N
        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemProdutos);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jMenuItem1.setText("User");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem1);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatorios");

        jMenuItemPEfectuados.setText("Pedidos efectuados");
        jMenuItemPEfectuados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPEfectuadosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemPEfectuados);

        jMenuItemPReservados.setText("Pedidos reservados");
        jMenuItemPReservados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPReservadosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemPReservados);

        jMenuItemVEfectuadas.setText("Vendas efectuadas");
        jMenuItemVEfectuadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVEfectuadasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemVEfectuadas);

        jMenuItemSaidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close.png"))); // NOI18N
        jMenuItemSaidas.setText("Saidas");
        jMenuItemSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaidasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemSaidas);

        jMenuItemFeixo.setText("Feixo do dia");
        jMenuRelatorios.add(jMenuItemFeixo);

        jMenuBar1.add(jMenuRelatorios);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemLogin.setText("Login");
        jMenuFerramentas.add(jMenuItemLogin);

        jMenuItem3.setText("Venda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItem3);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1296, 668));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
       // conecta.desconeta();
        System.exit(0);  
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemPEfectuadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPEfectuadosActionPerformed
      // PedidosEfectuados tela = new PedidosEfectuados();
       //tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemPEfectuadosActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        CProdutos tela = new CProdutos();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
       
        TelaAcesso tela = new TelaAcesso();
        tela.setVisible(true);
        //dispose();
        
       
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemPReservadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPReservadosActionPerformed
        //PedidosEfectuados tela = new PedidosEfectuados();
        //tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemPReservadosActionPerformed

    private void jMenuItemVEfectuadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVEfectuadasActionPerformed
        //PedidosEfectuados tela = new PedidosEfectuados();
         //tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemVEfectuadasActionPerformed

    private void jMenuItemSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaidasActionPerformed
        //PedidosEfectuados tela = new PedidosEfectuados();
        //tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemSaidasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CUser tela = new CUser();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Tela de vendas
       
        viewVendas tela = new viewVendas();
        tela.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemFeixo;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemPEfectuados;
    private javax.swing.JMenuItem jMenuItemPReservados;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemSaidas;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVEfectuadas;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
