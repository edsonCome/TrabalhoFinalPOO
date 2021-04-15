package controller;

import model_Bean.ModelCProduto;
import model_Dao.DAOCProduto;
import java.util.ArrayList;

/**
*
* @author Edson Come
*/
public class ControllerCProduto {

    private DAOCProduto daoCProduto = new DAOCProduto();

    /**
    * grava CProduto
    * @param pModelCProduto
    * @return int
    */
    public int salvarCProdutoController(ModelCProduto pModelCProduto){
        return this.daoCProduto.salvarCProdutoDAO(pModelCProduto);
    }
    
    /**
    * recupera CProduto
    * @param pId
    * @return ModelCProduto
    */
    public ModelCProduto getCProdutoController(int pId){
        return this.daoCProduto.getCProdutoDAO(pId);
    }

    /**
    * recupera CProduto
    * @param pNomeProduto
    * @return ModelCProduto
    */
    public ModelCProduto getCProdutoController(String pNomeProduto){
        return this.daoCProduto.getCProdutoDAO(pNomeProduto);
    }

    /**
    * recupera uma lista deCProduto
    * @param pId
    * @return ArrayList
    */
    public ArrayList<ModelCProduto> getListaCProdutoController(){
        return this.daoCProduto.getListaCProdutoDAO();
    }

    /**
    * atualiza CProduto
    * @param pModelCProduto
    * @return boolean
    */
    public boolean atualizarCProdutoController(ModelCProduto pModelCProduto){
        return this.daoCProduto.atualizarCProdutoDAO(pModelCProduto);
    }

    /**
    * exclui CProduto
    * @param pId
    * @return boolean
    */
    public boolean excluirCProdutoController(int pId){
        return this.daoCProduto.excluirCProdutoDAO(pId);
    }
    /**
     * Altera Lista de produtos no banco
     * @param plistaModelCProduto
     * @return 
     */
    public boolean alterarStockCProdutoController(ArrayList<ModelCProduto> plistaModelCProduto) {
        return this.daoCProduto.alterarStockCProdutoDAO(plistaModelCProduto);
    }
}