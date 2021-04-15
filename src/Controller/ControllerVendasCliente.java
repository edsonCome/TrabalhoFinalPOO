/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model_Bean.ModelVendaCliente;
import model_Dao.DAOVendasClientes;

/**
 *
 * @author Edson Come
 */
public class ControllerVendasCliente {
    
    private final model_Dao.DAOVendasClientes dAOVendasClientes = new DAOVendasClientes();

   /* public ArrayList<ModelVendaCliente> getListaVendaCliente() {
        return this.dAOVendasClientes.getListaVendaCienteDAO();
    }*/

    public ArrayList<ModelVendaCliente> getListaVendaClienteController() {
         return this.dAOVendasClientes.getListaVendaCienteDAO();
    
}
}
