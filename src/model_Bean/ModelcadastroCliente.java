package model_Bean;
/**
*
* @author Edson Come
*/
public class ModelcadastroCliente {

    private int id_Cliente;
    private String nome_Cliente;
    private String endereco_cliente;
    private String bairro_cliente;
    private String cidade_cliente;
    private int telefone_cliente;

    /**
    * Construtor
    */
    public ModelcadastroCliente(){}

    /**
    * seta o valor de id_Cliente
    * @param pId_Cliente
    */
    public void setId_Cliente(int pId_Cliente){
        this.id_Cliente = pId_Cliente;
    }
    /**
    * @return pk_id_Cliente
    */
    public int getId_Cliente(){
        return this.id_Cliente;
    }

    /**
    * seta o valor de nome_Cliente
    * @param pNome_Cliente
    */
    public void setNome_Cliente(String pNome_Cliente){
        this.nome_Cliente = pNome_Cliente;
    }
    /**
    * @return nome_Cliente
    */
    public String getNome_Cliente(){
        return this.nome_Cliente;
    }

    /**
    * seta o valor de endereco_cliente
    * @param pEndereco_cliente
    */
    public void setEndereco_cliente(String pEndereco_cliente){
        this.endereco_cliente = pEndereco_cliente;
    }
    /**
    * @return endereco_cliente
    */
    public String getEndereco_cliente(){
        return this.endereco_cliente;
    }

    /**
    * seta o valor de bairro_cliente
    * @param pBairro_cliente
    */
    public void setBairro_cliente(String pBairro_cliente){
        this.bairro_cliente = pBairro_cliente;
    }
    /**
    * @return bairro_cliente
    */
    public String getBairro_cliente(){
        return this.bairro_cliente;
    }

    /**
    * seta o valor de cidade_cliente
    * @param pCidade_cliente
    */
    public void setCidade_cliente(String pCidade_cliente){
        this.cidade_cliente = pCidade_cliente;
    }
    /**
    * @return cidade_cliente
    */
    public String getCidade_cliente(){
        return this.cidade_cliente;
    }

    /**
    * seta o valor de telefone_cliente
    * @param pTelefone_cliente
    */
    public void setTelefone_cliente(int pTelefone_cliente){
        this.telefone_cliente = pTelefone_cliente;
    }
    /**
    * @return telefone_cliente
    */
    public int getTelefone_cliente(){
        return this.telefone_cliente;
    }

    @Override
    public String toString(){
        return "ModelcadastroCliente {" + "::id_Cliente = " + this.id_Cliente + "::nome_Cliente = " + this.nome_Cliente + "::endereco_cliente = " + this.endereco_cliente + "::bairro_cliente = " + this.bairro_cliente + "::cidade_cliente = " + this.cidade_cliente + "::telefone_cliente = " + this.telefone_cliente +  "}";
    }
}