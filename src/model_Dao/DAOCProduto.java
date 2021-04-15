package model_Dao;

import model_Bean.ModelCProduto;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Edson Come
*/
public class DAOCProduto extends ConexaoMySql {

    /**
    * grava CProduto
    * @param pModelCProduto
    * @return int
    */
    public int salvarCProdutoDAO(ModelCProduto pModelCProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO produto ("
                    + "descricao,"
                    + "nome,"
                    + "quant,"
                    + "valor"
                + ") VALUES ("
                    + "'" + pModelCProduto.getDescricao() + "',"
                    + "'" + pModelCProduto.getNome() + "',"
                    + "'" + pModelCProduto.getQuant() + "',"
                    + "'" + pModelCProduto.getValor() + "'"
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
    * recupera CProduto
    * @param pId
    * @return ModelCProduto
    */
    public ModelCProduto getCProdutoDAO(int pId){
        ModelCProduto modelCProduto = new ModelCProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "descricao,"
                    + "nome,"
                    + "quant,"
                    + "valor"
                 + " FROM"
                     + " produto"
                 + " WHERE"
                     + " id = '" + pId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCProduto.setId(this.getResultSet().getInt(1));
                modelCProduto.setDescricao(this.getResultSet().getString(2));
                modelCProduto.setNome(this.getResultSet().getString(3));
                modelCProduto.setQuant(this.getResultSet().getInt(4));
                modelCProduto.setValor(this.getResultSet().getDouble(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCProduto;
    }
    /**
    * recupera CProduto
    * @param pNomeProduto
    * @return ModelCProduto
    */
    public ModelCProduto getCProdutoDAO(String pNomeProduto){
        ModelCProduto modelCProduto = new ModelCProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "descricao,"
                    + "nome,"
                    + "quant,"
                    + "valor"
                 + " FROM"
                     + " produto"
                 + " WHERE"
                     + " nome = '" + pNomeProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCProduto.setId(this.getResultSet().getInt(1));
                modelCProduto.setDescricao(this.getResultSet().getString(2));
                modelCProduto.setNome(this.getResultSet().getString(3));
                modelCProduto.setQuant(this.getResultSet().getInt(4));
                modelCProduto.setValor(this.getResultSet().getDouble(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCProduto;
    }

    /**
    * recupera uma lista de CProduto
        * @return ArrayList
    */
    public ArrayList<ModelCProduto> getListaCProdutoDAO(){
        ArrayList<ModelCProduto> listamodelCProduto = new ArrayList();
        ModelCProduto modelCProduto = new ModelCProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "descricao,"
                    + "nome,"
                    + "quant,"
                    + "valor"
                 + " FROM"
                     + " produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCProduto = new ModelCProduto();
                modelCProduto.setId(this.getResultSet().getInt(1));
                modelCProduto.setDescricao(this.getResultSet().getString(2));
                modelCProduto.setNome(this.getResultSet().getString(3));
                modelCProduto.setQuant(this.getResultSet().getInt(4));
                modelCProduto.setValor(this.getResultSet().getDouble(5));
                listamodelCProduto.add(modelCProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCProduto;
    }

    /**
    * atualiza CProduto
    * @param pModelCProduto
    * @return boolean
    */
    public boolean atualizarCProdutoDAO(ModelCProduto pModelCProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE produto SET "
                    + "id = '" + pModelCProduto.getId() + "',"
                    + "descricao = '" + pModelCProduto.getDescricao() + "',"
                    + "nome = '" + pModelCProduto.getNome() + "',"
                    + "quant = '" + pModelCProduto.getQuant() + "',"
                    + "valor = '" + pModelCProduto.getValor() + "'"
                + " WHERE "
                    + "id = '" + pModelCProduto.getId() + "'"
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
    * exclui CProduto
    * @param pId
    * @return boolean
    */
    public boolean excluirCProdutoDAO(int pId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM produto "
                + " WHERE "
                    + "id = '" + pId + "'"
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
     * Alterar a quabtidade de produtos no banco
     * @param plistaModelCProduto
     * @return 
     */
    public boolean alterarStockCProdutoDAO(ArrayList<ModelCProduto> plistaModelCProduto) {
        try {
            this.conectar();
           
            for (int i = 0; i < plistaModelCProduto.size(); i++) {
                
            
            this.executarUpdateDeleteSQL(
                "UPDATE produto SET "
                    + "quant = '" + plistaModelCProduto.get(i).getQuant() + "',"
                  
                + " WHERE "
                    + "id = '" + plistaModelCProduto.get(i).getId() + "'"
                + ";"
            );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}