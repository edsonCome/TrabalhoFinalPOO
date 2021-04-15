package model_Bean;

import java.sql.Date;

/**
*
* @author Edson Come
*/
public class ModelVenda {

    private int idVenda;
    private int cliente;
    private Date venDataVenda;
    private double vendaValorLiquido;
    private double vendaValorProduto;
    private double venDesconto;

    /**
    * Construtor
    */
    public ModelVenda(){}

    /**
    * seta o valor de idVenda
    * @param pIdVenda
    */
    public void setIdVenda(int pIdVenda){
        this.idVenda = pIdVenda;
    }
    /**
    * @return pk_idVenda
    */
    public int getIdVenda(){
        return this.idVenda;
    }

    /**
    * seta o valor de cliente
    * @param pCliente
    */
    public void setCliente(int pCliente){
        this.cliente = pCliente;
    }
    /**
    * @return fk_cliente
    */
    public int getCliente(){
        return this.cliente;
    }

    /**
    * seta o valor de venDataVenda
    * @param pVenDataVenda
    */
    public void setVenDataVenda(Date pVenDataVenda){
        this.venDataVenda = pVenDataVenda;
    }
    /**
    * @return venDataVenda
    */
    public Date getVenDataVenda(){
        return this.venDataVenda;
    }

    /**
    * seta o valor de vendaValorLiquido
    * @param pVendaValorLiquido
    */
    public void setVendaValorLiquido(double pVendaValorLiquido){
        this.vendaValorLiquido = pVendaValorLiquido;
    }
    /**
    * @return vendaValorLiquido
    */
    public double getVendaValorLiquido(){
        return this.vendaValorLiquido;
    }

    /**
    * seta o valor de vendaValorProduto
    * @param pVendaValorProduto
    */
    public void setVendaValorProduto(double pVendaValorProduto){
        this.vendaValorProduto = pVendaValorProduto;
    }
    /**
    * @return vendaValorProduto
    */
    public double getVendaValorProduto(){
        return this.vendaValorProduto;
    }

    /**
    * seta o valor de venDesconto
    * @param pVenDesconto
    */
    public void setVenDesconto(double pVenDesconto){
        this.venDesconto = pVenDesconto;
    }
    /**
    * @return venDesconto
    */
    public double getVenDesconto(){
        return this.venDesconto;
    }

    @Override
    public String toString(){
        return "ModelVenda {" + "::idVenda = " + this.idVenda + "::cliente = " + this.cliente + "::venDataVenda = " + this.venDataVenda + "::vendaValorLiquido = " + this.vendaValorLiquido + "::vendaValorProduto = " + this.vendaValorProduto + "::venDesconto = " + this.venDesconto +  "}";
    }
}