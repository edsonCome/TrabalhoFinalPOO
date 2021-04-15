package controller;

import model_Bean.ModelCFuncionario;
import model_Dao.DAOCFuncionario;
import java.util.ArrayList;

/**
*
* @author Edson Come
*/
public class ControllerCFuncionario {

    private DAOCFuncionario daoCFuncionario = new DAOCFuncionario();

    /**
    * grava CFuncionario
    * @param pModelCFuncionario
    * @return int
    */
    public int salvarCFuncionarioController(ModelCFuncionario pModelCFuncionario){
        return this.daoCFuncionario.salvarCFuncionarioDAO(pModelCFuncionario);
    }

    /**
    * recupera CFuncionario
    * @param pId
    * @return ModelCFuncionario
    */
    public ModelCFuncionario getCFuncionarioController(int pId){
        return this.daoCFuncionario.getCFuncionarioDAO(pId);
    }

    /**
    * recupera uma lista deCFuncionario
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelCFuncionario> getListaCFuncionarioController(){
        return this.daoCFuncionario.getListaCFuncionarioDAO();
    }

    /**
    * atualiza CFuncionario
    * @param pModelCFuncionario
    * @return boolean
    */
    public boolean atualizarCFuncionarioController(ModelCFuncionario pModelCFuncionario){
        return this.daoCFuncionario.atualizarCFuncionarioDAO(pModelCFuncionario);
    }

    /**
    * exclui CFuncionario
    * @param pId
    * @return boolean
    */
    public boolean excluirCFuncionarioController(int pId){
        return this.daoCFuncionario.excluirCFuncionarioDAO(pId);
    }
}