package model_Dao;

import model_Bean.ModelUsuario;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Edson Come
*/
public class DAOUsuario extends ConexaoMySql {

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO usuarios ("
                    + "userNome,"
                    + "userLogin,"
                    + "userSenha"
                + ") VALUES ("
                    + "'" + pModelUsuario.getUserNome() + "',"
                    + "'" + pModelUsuario.getUserLogin() + "',"
                    + "'" + pModelUsuario.getUserSenha() + "'"
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
    * recupera Usuario
    * @param pIdUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pIdUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idusuarios,"
                    + "userNome,"
                    + "userLogin,"
                    + "userSenha"
                 + " FROM"
                     + " usuarios"
                 + " WHERE"
                     + " idusuarios = '" + pIdUsuario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUserNome(this.getResultSet().getString(2));
                modelUsuario.setUserLogin(this.getResultSet().getString(3));
                modelUsuario.setUserSenha(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idusuarios,"
                    + "userNome,"
                    + "userLogin,"
                    + "userSenha"
                 + " FROM"
                     + " usuarios"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUserNome(this.getResultSet().getString(2));
                modelUsuario.setUserLogin(this.getResultSet().getString(3));
                modelUsuario.setUserSenha(this.getResultSet().getString(4));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE usuarios SET "
                    + "idusuarios = '" + pModelUsuario.getIdUsuario() + "',"
                    + "userNome = '" + pModelUsuario.getUserNome() + "',"
                    + "userLogin = '" + pModelUsuario.getUserLogin() + "',"
                    + "userSenha = '" + pModelUsuario.getUserSenha() + "'"
                + " WHERE "
                    + "idusuarios = '" + pModelUsuario.getIdUsuario() + "'"
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
    * exclui Usuario
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuarioDAO(int pIdUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM usuarios "
                + " WHERE "
                    + "idusuarios = '" + pIdUsuario + "'"
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
     * Validacao do login
     * @param pmodelUsuario
     * @return 
     */

    public boolean getValidarUsuarioDao(ModelUsuario pmodelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idusuarios,"
                    + "userNome,"
                    + "userLogin,"
                    + "userSenha"
                 + " FROM"
                     + " usuarios"
                 + " WHERE"
                     + " userLogin = '" + pmodelUsuario.getUserLogin() + "' AND userSenha = '"+pmodelUsuario.getUserSenha()+"'"
                + ";"
            );
            if(getResultSet().next()){
              return true;
            }else{
               return false;  
            }

            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        
       
        }
    }
}