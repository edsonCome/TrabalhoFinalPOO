package controller;

import model_Bean.ModelcadastroCliente;
import model_Dao.DAOcadastroCliente;
import java.util.ArrayList;

/**
*
* @author Edson Come
*/
public class ControllercadastroCliente {

    private DAOcadastroCliente daocadastroCliente = new DAOcadastroCliente();

    /**
    * grava cadastroCliente
    * @param pModelcadastroCliente
    * @return int
    */
    public int salvarcadastroClienteController(ModelcadastroCliente pModelcadastroCliente){
        return this.daocadastroCliente.salvarcadastroClienteDAO(pModelcadastroCliente);
    }

    /**
    * recupera cadastroCliente
    * @param pId_Cliente
    * @return ModelcadastroCliente
    */
    public ModelcadastroCliente getcadastroClienteController(int pId_Cliente){
        return this.daocadastroCliente.getcadastroClienteDAO(pId_Cliente);
    }
     /**
    * recupera cadastroCliente
    * @param pNomeCliente
    * @return ModelcadastroCliente
    */
    public ModelcadastroCliente getcadastroClienteController(String pNomeCliente){
        return this.daocadastroCliente.getcadastroClienteDAO(pNomeCliente);
    }

    /**
    * recupera uma lista decadastroCliente
    * @param pId_Cliente
    * @return ArrayList
    */
    public ArrayList<ModelcadastroCliente> getListacadastroClienteController(){
        return this.daocadastroCliente.getListacadastroClienteDAO();
    }

    /**
    * atualiza cadastroCliente
    * @param pModelcadastroCliente
    * @return boolean
    */
    public boolean atualizarcadastroClienteController(ModelcadastroCliente pModelcadastroCliente){
        return this.daocadastroCliente.atualizarcadastroClienteDAO(pModelcadastroCliente);
    }

    /**
    * exclui cadastroCliente
    * @param pId_Cliente
    * @return boolean
    */
    public boolean excluircadastroClienteController(int pId_Cliente){
        return this.daocadastroCliente.excluircadastroClienteDAO(pId_Cliente);
    }
}