package model_Dao;

import model_Bean.ModelCFuncionario;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Edson Come
*/
public class DAOCFuncionario extends ConexaoMySql {

    /**
    * grava CFuncionario
    * @param pModelCFuncionario
    * @return int
    */
    public int salvarCFuncionarioDAO(ModelCFuncionario pModelCFuncionario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO cadastrofun ("
                 
                    + "cargo,"
                    + "contactoP,"
                    + "morada,"
                    + "nome,"
                    + "sexo"
                + ") VALUES ("
                 
                    + "'" + pModelCFuncionario.getCargo() + "',"
                    + "'" + pModelCFuncionario.getContactoP() + "',"
                    + "'" + pModelCFuncionario.getMorada() + "',"
                    + "'" + pModelCFuncionario.getNome() + "',"
                    + "'" + pModelCFuncionario.getSexo() + "'"
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
    * recupera CFuncionario
    * @param pId
    * @return ModelCFuncionario
    */
    public ModelCFuncionario getCFuncionarioDAO(int pId){
        ModelCFuncionario modelCFuncionario = new ModelCFuncionario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "Id,"
                    + "cargo,"
                    + "contactoP,"
                    + "morada,"
                    + "nome,"
                    + "sexo"
                 + " FROM"
                     + " cadastrofun"
                 + " WHERE"
                     + " Id = '" + pId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCFuncionario.setId(this.getResultSet().getInt(1));
                modelCFuncionario.setCargo(this.getResultSet().getString(2));
                modelCFuncionario.setContactoP(this.getResultSet().getInt(3));
                modelCFuncionario.setMorada(this.getResultSet().getString(4));
                modelCFuncionario.setNome(this.getResultSet().getString(5));
                modelCFuncionario.setSexo(this.getResultSet().getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCFuncionario;
    }

    /**
    * recupera uma lista de CFuncionario
        * @return ArrayList
    */
    public ArrayList<ModelCFuncionario> getListaCFuncionarioDAO(){
        ArrayList<ModelCFuncionario> listamodelCFuncionario = new ArrayList();
        ModelCFuncionario modelCFuncionario = new ModelCFuncionario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "Id,"
                    + "cargo,"
                    + "contactoP,"
                    + "morada,"
                    + "nome,"
                    + "sexo"
                 + " FROM"
                     + " cadastrofun"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCFuncionario = new ModelCFuncionario();
                modelCFuncionario.setId(this.getResultSet().getInt(1));
                modelCFuncionario.setCargo(this.getResultSet().getString(2));
                modelCFuncionario.setContactoP(this.getResultSet().getInt(3));
                modelCFuncionario.setMorada(this.getResultSet().getString(4));
                modelCFuncionario.setNome(this.getResultSet().getString(5));
                modelCFuncionario.setSexo(this.getResultSet().getString(6));
                listamodelCFuncionario.add(modelCFuncionario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCFuncionario;
    }

    /**
    * atualiza CFuncionario
    * @param pModelCFuncionario
    * @return boolean
    */
    public boolean atualizarCFuncionarioDAO(ModelCFuncionario pModelCFuncionario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE cadastrofun SET "
                    + "Id = '" + pModelCFuncionario.getId() + "',"
                    + "cargo = '" + pModelCFuncionario.getCargo() + "',"
                    + "contactoP = '" + pModelCFuncionario.getContactoP() + "',"
                    + "morada = '" + pModelCFuncionario.getMorada() + "',"
                    + "nome = '" + pModelCFuncionario.getNome() + "',"
                    + "sexo = '" + pModelCFuncionario.getSexo() + "'"
                + " WHERE "
                    + "Id = '" + pModelCFuncionario.getId() + "'"
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
    * exclui CFuncionario
    * @param pId
    * @return boolean
    */
    public boolean excluirCFuncionarioDAO(int pId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM cadastrofun "
                + " WHERE "
                    + "Id = '" + pId + "'"
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