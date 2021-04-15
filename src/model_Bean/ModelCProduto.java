package model_Bean;
/**
*
* @author Edson Come
*/
public class ModelCProduto {

    private int id;
    private String descricao;
    private String nome;
    private int quant;
    private double valor;

    /**
    * Construtor
    */
    public ModelCProduto(){}

    /**
    * seta o valor de id
    * @param pId
    */
    public void setId(int pId){
        this.id = pId;
    }
    /**
    * @return pk_id
    */
    public int getId(){
        return this.id;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * @return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de quant
    * @param pQuant
    */
    public void setQuant(int pQuant){
        this.quant = pQuant;
    }
    /**
    * @return quant
    */
    public int getQuant(){
        return this.quant;
    }

    /**
    * seta o valor de valor
    * @param pValor
    */
    public void setValor(double pValor){
        this.valor = pValor;
    }
    /**
    * @return valor
    */
    public double getValor(){
        return this.valor;
    }

    @Override
    public String toString(){
        return "ModelCProduto {" + "::id = " + this.id + "::descricao = " + this.descricao + "::nome = " + this.nome + "::quant = " + this.quant + "::valor = " + this.valor +  "}";
    }
}