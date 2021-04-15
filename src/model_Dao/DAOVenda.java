package model_Dao;

import model_Bean.ModelVenda;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Edson Come
*/
public class DAOVenda extends ConexaoMySql {

    /**
    * grava Venda
    * @param pModelVenda
    * @return int
    */
    public int salvarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO vendas ("
                    + "cliente,"
                    + "data_venda,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "ven_desconto"
                + ") VALUES ("
                    + "'" + pModelVenda.getCliente() + "',"
                    + "'" + pModelVenda.getVenDataVenda() + "',"
                    + "'" + pModelVenda.getVendaValorLiquido() + "',"
                    + "'" + pModelVenda.getVendaValorProduto() + "',"
                    + "'" + pModelVenda.getVenDesconto() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Venda
    * @param pIdVenda
    * @return ModelVenda
    */
    public ModelVenda getVendaDAO(int pIdVenda){
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idvendas,"
                    + "cliente,"
                    + "data_venda,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "ven_desconto"
                 + " FROM"
                     + " vendas"
                 + " WHERE"
                     + " idvenda = '" + pIdVenda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVenDataVenda(this.getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVendaValorProduto(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
    * recupera uma lista de Venda
        * @return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaDAO(){
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idvenda,"
                    + "cliente,"
                    + "data_venda,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "ven_desconto"
                 + " FROM"
                     + " vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVenDataVenda(this.getResultSet().getDate(3));
                modelVenda.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVendaValorProduto(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
                listamodelVenda.add(modelVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * @return boolean
    */
    public boolean atualizarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE vendas SET "
                    + "idvenda = '" + pModelVenda.getIdVenda() + "',"
                    + "cliente = '" + pModelVenda.getCliente() + "',"
                    + "data_venda = '" + pModelVenda.getVenDataVenda() + "',"
                    + "valor_liquido = '" + pModelVenda.getVendaValorLiquido() + "',"
                    + "valor_bruto = '" + pModelVenda.getVendaValorProduto() + "',"
                    + "ven_desconto = '" + pModelVenda.getVenDesconto() + "'"
                + " WHERE "
                    + "idvenda = '" + pModelVenda.getIdVenda() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Venda
    * @param pIdVenda
    * @return boolean
    */
    public boolean excluirVendaDAO(int pIdVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM vendas "
                + " WHERE "
                    + "idvenda = '" + pIdVenda + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}