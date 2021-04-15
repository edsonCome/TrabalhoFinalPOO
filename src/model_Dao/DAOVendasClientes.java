/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_Dao;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model_Bean.ModelVenda;
import model_Bean.ModelVendaCliente;
import model_Bean.ModelcadastroCliente;

/**
 *
 * @author Edson Come
 */
public class DAOVendasClientes extends ConexaoMySql{
    public ArrayList<ModelVendaCliente> getListaVendaCienteDAO(){
    ArrayList<ModelVendaCliente> listamodelVendaClientes = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        ModelcadastroCliente modelcadastroCliente = new ModelcadastroCliente();
        ModelVendaCliente modelVendaCliente = new ModelVendaCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "vendas.idvendas,"
                    + "vendas.cliente,"
                    + "vendas.data_venda,"
                    + "vendas.valor_liquido,"
                    + "vendas.valor_bruto,"
                    + "vendas.ven_desconto"
                    + "cadastrocliente.id_Cliente,"
                    + "cadastrocliente.nome_Cliente,"
                    + "cadastrocliente.endereco_cliente,"
                    + "cadastrocliente.bairro_cliente,"
                    + "cadastrocliente.cidade_cliente,"
                    + "cadastrocliente.telefone_cliente"
                 + " FROM"
                     + " vendas INNER JOIN cadastrocliente"
                     + "ON cadastrocliente.id_Cliente = vendas.cliente; "
                     +"vendas_produto.cliente = '"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelcadastroCliente = new ModelcadastroCliente();
                modelVendaCliente  = new ModelVendaCliente();
                //Set Vendas
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVenDataVenda(this.getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVendaValorProduto(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
                //Set dados dos Clientes
                modelcadastroCliente.setId_Cliente(this.getResultSet().getInt(7));
                modelcadastroCliente.setNome_Cliente(this.getResultSet().getString(8));
                modelcadastroCliente.setEndereco_cliente(this.getResultSet().getString(9));
                modelcadastroCliente.setBairro_cliente(this.getResultSet().getString(10));
                modelcadastroCliente.setCidade_cliente(this.getResultSet().getString(11));
                modelcadastroCliente.setTelefone_cliente(this.getResultSet().getInt(12));
                
                modelVendaCliente.setModelVenda(modelVenda);
                modelVendaCliente.setModelcadastroCliente(modelcadastroCliente);
                
                listamodelVendaClientes.add(modelVendaCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendaClientes;
    }
}
