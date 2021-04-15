/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_Bean;

import java.util.ArrayList;

/**
 *
 * @author Edson Come
 */
public class ModelVendaCliente {
    private ModelVenda modelVenda;
    private ModelcadastroCliente modelcadastroCliente;
    private ArrayList<ModelVendaCliente> listaModelVendaClientes;

    /**
     * @return the modelVenda
     */
    public ModelVenda getModelVenda() {
        return modelVenda;
    }

    /**
     * @param modelVenda the modelVenda to set
     */
    public void setModelVenda(ModelVenda modelVenda) {
        this.modelVenda = modelVenda;
    }

    /**
     * @return the modelcadastroCliente
     */
    public ModelcadastroCliente getModelcadastroCliente() {
        return modelcadastroCliente;
    }

    /**
     * @param modelcadastroCliente the modelcadastroCliente to set
     */
    public void setModelcadastroCliente(ModelcadastroCliente modelcadastroCliente) {
        this.modelcadastroCliente = modelcadastroCliente;
    }

    /**
     * @return the listaModelVendaClientes
     */
    public ArrayList<ModelVendaCliente> getListaModelVendaClientes() {
        return listaModelVendaClientes;
    }

    /**
     * @param listaModelVendaClientes the listaModelVendaClientes to set
     */
    public void setListaModelVendaClientes(ArrayList<ModelVendaCliente> listaModelVendaClientes) {
        this.listaModelVendaClientes = listaModelVendaClientes;
    }
    
    
}
