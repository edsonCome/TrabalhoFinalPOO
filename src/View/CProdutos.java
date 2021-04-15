/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import UTIL.Formatador;
import controller.ControllerCProduto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model_Bean.ModelCProduto;



public class CProdutos extends javax.swing.JFrame {
    
    ControllerCProduto controllerCProduto = new ControllerCProduto();
    ModelCProduto modelCProduto = new ModelCProduto();
    ArrayList<ModelCProduto> listaModelPorduto = new ArrayList<>();
    Formatador formatador = new Formatador();
    String salvarAlterar;
    

    /*Produto mod01 = new Produto();
    ProdutoDao control = new ProdutoDao();
    ConectionFactory conex = new ConectionFactory();
    private Produto ProdutoDao;*/
    public CProdutos() {
        initComponents();
        carregarProduto();
        //this.desabilitaHabilita(false);
        //this.limparCampos();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jComboBoxDescrisao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCanselar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JFormattedTextField();
        jTextFieldQuantidade = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Produto");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Produtos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 200, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 50, 20);

        jTextFieldNome.setEnabled(false);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(90, 90, 230, 30);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(530, 110, 80, 23);

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(530, 150, 80, 23);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(530, 190, 80, 23);

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListar);
        jButtonListar.setBounds(530, 230, 80, 23);

        jComboBoxDescrisao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBoxDescrisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Humburguer", "Santes", "Cachoro", "Batata", "Refregerante", "Sumo", "Bebida" }));
        jComboBoxDescrisao.setEnabled(false);
        jComboBoxDescrisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDescrisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDescrisao);
        jComboBoxDescrisao.setBounds(90, 130, 120, 20);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 70, 20);

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar);
        jButtonConfirmar.setBounds(420, 380, 90, 23);

        jButtonCanselar.setText("Cancelar");
        jButtonCanselar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanselarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCanselar);
        jButtonCanselar.setBounds(510, 380, 80, 23);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 50, 40, 17);

        jTextFieldID.setBackground(new Color(0,0,0,50));
        jTextFieldID.setEditable(false);
        jTextFieldID.setEnabled(false);
        getContentPane().add(jTextFieldID);
        jTextFieldID.setBounds(90, 50, 150, 30);

        jTableProdutos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Preco"
            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 510, 130);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Preco:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 170, 33, 14);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 200, 80, 14);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(513, 50, 100, 23);

        jTextFieldPesquisar.setEnabled(false);
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(330, 50, 170, 30);

        jTextFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        getContentPane().add(jTextFieldPreco);
        jTextFieldPreco.setBounds(90, 160, 140, 30);

        jTextFieldQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidade);
        jTextFieldQuantidade.setBounds(90, 200, 140, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vista-superior-da-tabua-de-cortar-pizza-na-mesa-de-madeira_23-2148643474.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 630, 450);

        setSize(new java.awt.Dimension(643, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCanselarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanselarActionPerformed
        //Botao para canselar a acao
        TelaPrinc tela = new TelaPrinc();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonCanselarActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
       //Metodo de salvar Produtos
       if(salvarAlterar.equals("salvar")){
      
       modelCProduto.setNome(this.jTextFieldNome.getText());
       modelCProduto.setDescricao(this.jComboBoxDescrisao.getSelectedItem().toString());
       modelCProduto.setValor(Double.parseDouble(this.jTextFieldPreco.getText()));
       modelCProduto.setQuant(Integer.parseInt(this.jTextFieldQuantidade.getText()));
       if(controllerCProduto.salvarCProdutoController(modelCProduto)>0){
           JOptionPane.showMessageDialog (this, " Dados gravados com sucesso "," Atencao ", JOptionPane.WARNING_MESSAGE);
          //Carregar os Produtos
          carregarProduto();
          limparCampos();
          //this.desabilitaHabilita(true);
          //this.limparCampos();
          
       }else{
           JOptionPane.showMessageDialog (this, " Erro ao gravar os dados "," Erro ", JOptionPane.ERROR_MESSAGE);
       }    
       }else{
       modelCProduto.setId(Integer.parseInt(this.jTextFieldID.getText()));    
       modelCProduto.setNome(this.jTextFieldNome.getText());
       modelCProduto.setDescricao(this.jComboBoxDescrisao.getSelectedItem().toString());
       modelCProduto.setValor(Double.parseDouble(this.jTextFieldPreco.getText()));
       modelCProduto.setQuant(Integer.parseInt(this.jTextFieldQuantidade.getText()));
       if(controllerCProduto.atualizarCProdutoController(modelCProduto)){
          JOptionPane.showMessageDialog (this, " Dados editados com sucesso "," Atencao ", JOptionPane.WARNING_MESSAGE);
        //Carregar os Produtos
          carregarProduto();
          limparCampos();
          //this.desabilitaHabilita(true);
          //this.limparCampos();
          
       }else{
           JOptionPane.showMessageDialog (this, " Erro ao editar os dados "," Erro ", JOptionPane.ERROR_MESSAGE);
       }    
       }
        
       
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jComboBoxDescrisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDescrisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDescrisaoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       //Excluir um produto
       int linha = jTableProdutos.getSelectedRow();
        int codigoProduto = (int) jTableProdutos.getValueAt(linha, 0);
        if(controllerCProduto.excluirCProdutoController(codigoProduto)){
         JOptionPane.showMessageDialog (this, " Usuario excluido com sucesso "," Atencao ", JOptionPane.WARNING_MESSAGE); 
         this.carregarProduto();
        }else{
          JOptionPane.showMessageDialog (this, " Erro ao excluir o usuario "," Erro ", JOptionPane.ERROR_MESSAGE);   
        }
       
        /*ProdutoDao dao = new ProdutoDao();
        new ControllerProdutos().RemoveControllerProdutos(Integer.parseInt(jTextFieldID.getText()));
        JOptionPane.showMessageDialog(rootPane, " Dados gravados excluidos com sucesso");
        TelaPrinc tela = new TelaPrinc();
        tela.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       //Botao para adicionar novo produto
        this.desabilitaHabilita(true);
        this.limparCampos();
        salvarAlterar = "salvar";
        jComboBoxDescrisao.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonCanselar.setEnabled(true);
        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
       //Botao para listar todos os produtos
       
        
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Alterar os produtos
        //salvarAlterar = "Alterar";
        jTextFieldNome.setEnabled(true);
        jTextFieldPesquisar.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jButtonConfirmar.setEnabled(true);
        jComboBoxDescrisao.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonCanselar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        
        int linha = jTableProdutos.getSelectedRow();
        int codigoProduto = (int) this.jTableProdutos.getValueAt(linha, 0);
        modelCProduto = controllerCProduto.getCProdutoController(codigoProduto);
        salvarAlterar = "Alterar";
        
        jTextFieldID.setText(String.valueOf(modelCProduto.getId()));
        jTextFieldNome.setText(modelCProduto.getNome());
        jComboBoxDescrisao.setSelectedItem(modelCProduto.getDescricao());
        jTextFieldPreco.setText(String.valueOf(modelCProduto.getValor()));
        jTextFieldQuantidade.setText(String.valueOf(modelCProduto.getQuant()));
         this.desabilitaHabilita(true);
        
       
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // Pesquisar os produtos
    
        boolean  pesquisa = true;
         jTextFieldPesquisar.setEnabled(true);
         JOptionPane.showMessageDialog(this, "Digite o artigo que pretende pesquisar e clique em pesquisar");
       
       //if(pesquisa == true){
        DefaultTableModel modelo = (DefaultTableModel) this.jTableProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jTableProdutos.setRowSorter(classificador);
        String texto = jTextFieldPesquisar.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
         
      // }else{
         // JOptionPane.showMessageDialog(this, "O artigo que pretende pesquisar nao existe na no stock"); 
       //}
        
        
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        // Metodo para selecionar item na tabela
        jTextFieldID.setEnabled(true);
        jComboBoxDescrisao.setEnabled(false);
        jTextFieldPreco.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jButtonConfirmar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonCanselar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonListar.setEnabled(true);
        
        
    }//GEN-LAST:event_jTableProdutosMouseClicked

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
            java.util.logging.Logger.getLogger(CProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CProdutos().setVisible(true);
            }
        });
    }
    private void desabilitaHabilita(boolean condicao){
        jTextFieldNome.setEnabled(condicao);
        jComboBoxDescrisao.setEnabled(condicao);
        jTextFieldPreco.setEnabled(condicao);
        jTextFieldQuantidade.setEnabled(condicao);
        jTextFieldPesquisar.setEnabled(condicao);
        jButtonConfirmar.setEnabled(condicao);  
    }
    private void limparCampos(){
        jTextFieldNome.setText("");
        jTextFieldPreco.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldPesquisar.setText("");
       
    }
     /**
     * Preenche a tabela de produtos com os produtos do banco
     */
    private void carregarProduto(){
        listaModelPorduto = controllerCProduto.getListaCProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        modelo.setNumRows(0);
        int cont = listaModelPorduto.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
              listaModelPorduto.get(i).getId(),
              listaModelPorduto.get(i).getNome(),
              listaModelPorduto.get(i).getQuant(),
              listaModelPorduto.get(i).getValor()
              
          });
        }
    }
    
    
    /**
     * Metodo de salvar o produto
     */
    private void salvarProduto(){
    
    }
    private void alterarProduto(){
        //Altarar um produto no banco
        /*ProdutoDao dao = new ProdutoDao();
        DefaultTableModel dtmProdutos = (DefaultTableModel) jTableProdutos.getModel();
        
        Object[] dados = {jTextFieldID.getText(),jTextFieldNome.getText(),jTextFieldQuantidade.getText(),jTextFieldPreco.getText()};
        dtmProdutos.addRow(dados);
        mod01.setId(Integer.parseInt(salvarAlterar));
        mod01.setDescricao((String) jComboBoxDescrisao.getSelectedItem());
        mod01.setNome(jTextFieldNome.getText());
        mod01.setValor(Double.parseDouble(jTextFieldPreco.getText()));
        mod01.setQuant(Integer.parseInt(jTextFieldQuantidade.getText()));
       dao.editar(mod01);*/
       JOptionPane.showMessageDialog(rootPane, " Dados gravados com sucesso");
       //jComboBoxDescrisao.setSelectedItem(dao);
       jTextFieldNome.setText("");
       jTextFieldPreco.setText("");
       jTextFieldQuantidade.setText(""); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCanselar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox<String> jComboBoxDescrisao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JFormattedTextField jTextFieldPreco;
    private javax.swing.JFormattedTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
