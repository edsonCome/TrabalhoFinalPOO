package model_Dao;

import model_Bean.ModelcadastroCliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Edson Come
*/
public class DAOcadastroCliente extends ConexaoMySql {

    /**
    * grava cadastroCliente
    * @param pModelcadastroCliente
    * @return int
    */
    public int salvarcadastroClienteDAO(ModelcadastroCliente pModelcadastroCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO cadastrocliente ("
                   
                    + "nome_Cliente,"
                    + "endereco_cliente,"
                    + "bairro_cliente,"
                    + "cidade_cliente,"
                    + "telefone_cliente"
                + ") VALUES ("
                    + "'" + pModelcadastroCliente.getNome_Cliente() + "',"
                    + "'" + pModelcadastroCliente.getEndereco_cliente() + "',"
                    + "'" + pModelcadastroCliente.getBairro_cliente() + "',"
                    + "'" + pModelcadastroCliente.getCidade_cliente() + "',"
                    + "'" + pModelcadastroCliente.getTelefone_cliente() + "'"
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
    * recupera cadastroCliente
    * @param pId_Cliente
    * @return ModelcadastroCliente
    */
    public ModelcadastroCliente getcadastroClienteDAO(int pId_Cliente){
        ModelcadastroCliente modelcadastroCliente = new ModelcadastroCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_Cliente,"
                    + "nome_Cliente,"
                    + "endereco_cliente,"
                    + "bairro_cliente,"
                    + "cidade_cliente,"
                    + "telefone_cliente"
                 + " FROM"
                     + " cadastrocliente"
                 + " WHERE"
                     + " id_Cliente = '" + pId_Cliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelcadastroCliente.setId_Cliente(this.getResultSet().getInt(1));
                modelcadastroCliente.setNome_Cliente(this.getResultSet().getString(2));
                modelcadastroCliente.setEndereco_cliente(this.getResultSet().getString(3));
                modelcadastroCliente.setBairro_cliente(this.getResultSet().getString(4));
                modelcadastroCliente.setCidade_cliente(this.getResultSet().getString(5));
                modelcadastroCliente.setTelefone_cliente(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelcadastroCliente;
    }
    
     /**
    * recupera cadastroCliente
    * @param pNomeCliente
    * @return ModelcadastroCliente
    */
    public ModelcadastroCliente getcadastroClienteDAO(String pNomeCliente){
        ModelcadastroCliente modelcadastroCliente = new ModelcadastroCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_Cliente,"
                    + "nome_Cliente,"
                    + "endereco_cliente,"
                    + "bairro_cliente,"
                    + "cidade_cliente,"
                    + "telefone_cliente"
                 + " FROM"
                     + " cadastrocliente"
                 + " WHERE"
                     + " nome_Cliente = '" + pNomeCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelcadastroCliente.setId_Cliente(this.getResultSet().getInt(1));
                modelcadastroCliente.setNome_Cliente(this.getResultSet().getString(2));
                modelcadastroCliente.setEndereco_cliente(this.getResultSet().getString(3));
                modelcadastroCliente.setBairro_cliente(this.getResultSet().getString(4));
                modelcadastroCliente.setCidade_cliente(this.getResultSet().getString(5));
                modelcadastroCliente.setTelefone_cliente(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelcadastroCliente;
    }

    /**
    * recupera uma lista de cadastroCliente
        * @return ArrayList
    */
    public ArrayList<ModelcadastroCliente> getListacadastroClienteDAO(){
        ArrayList<ModelcadastroCliente> listamodelcadastroCliente = new ArrayList();
        ModelcadastroCliente modelcadastroCliente = new ModelcadastroCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_Cliente,"
                    + "nome_Cliente,"
                    + "endereco_cliente,"
                    + "bairro_cliente,"
                    + "cidade_cliente,"
                    + "telefone_cliente"
                 + " FROM"
                     + " cadastrocliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelcadastroCliente = new ModelcadastroCliente();
                modelcadastroCliente.setId_Cliente(this.getResultSet().getInt(1));
                modelcadastroCliente.setNome_Cliente(this.getResultSet().getString(2));
                modelcadastroCliente.setEndereco_cliente(this.getResultSet().getString(3));
                modelcadastroCliente.setBairro_cliente(this.getResultSet().getString(4));
                modelcadastroCliente.setCidade_cliente(this.getResultSet().getString(5));
                modelcadastroCliente.setTelefone_cliente(this.getResultSet().getInt(6));
                listamodelcadastroCliente.add(modelcadastroCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelcadastroCliente;
    }

    /**
    * atualiza cadastroCliente
    * @param pModelcadastroCliente
    * @return boolean
    */
    public boolean atualizarcadastroClienteDAO(ModelcadastroCliente pModelcadastroCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE cadastrocliente SET "
                    + "id_Cliente = '" + pModelcadastroCliente.getId_Cliente() + "',"
                    + "nome_Cliente = '" + pModelcadastroCliente.getNome_Cliente() + "',"
                    + "endereco_cliente = '" + pModelcadastroCliente.getEndereco_cliente() + "',"
                    + "bairro_cliente = '" + pModelcadastroCliente.getBairro_cliente() + "',"
                    + "cidade_cliente = '" + pModelcadastroCliente.getCidade_cliente() + "',"
                    + "telefone_cliente = '" + pModelcadastroCliente.getTelefone_cliente() + "'"
                + " WHERE "
                    + "id_Cliente = '" + pModelcadastroCliente.getId_Cliente() + "'"
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
    * exclui cadastroCliente
    * @param pId_Cliente
    * @return boolean
    */
    public boolean excluircadastroClienteDAO(int pId_Cliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM cadastrocliente "
                + " WHERE "
                    + "id_Cliente = '" + pId_Cliente + "'"
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