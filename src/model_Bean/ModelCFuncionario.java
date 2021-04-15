package model_Bean;
/**
*
* @author Edson Come
*/
public class ModelCFuncionario {

    private int Id;
    private String cargo;
    private int contactoP;
    private String morada;
    private String nome;
    private String sexo;

    /**
    * Construtor
    */
    public ModelCFuncionario(){}

    /**
    * seta o valor de Id
    * @param pId
    */
    public void setId(int pId){
        this.Id = pId;
    }
    /**
    * @return pk_Id
    */
    public int getId(){
        return this.Id;
    }

    /**
    * seta o valor de cargo
    * @param pCargo
    */
    public void setCargo(String pCargo){
        this.cargo = pCargo;
    }
    /**
    * @return cargo
    */
    public String getCargo(){
        return this.cargo;
    }

    /**
    * seta o valor de contactoP
    * @param pContactoP
    */
    public void setContactoP(int pContactoP){
        this.contactoP = pContactoP;
    }
    /**
    * @return contactoP
    */
    public int getContactoP(){
        return this.contactoP;
    }

    /**
    * seta o valor de morada
    * @param pMorada
    */
    public void setMorada(String pMorada){
        this.morada = pMorada;
    }
    /**
    * @return morada
    */
    public String getMorada(){
        return this.morada;
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
    * seta o valor de sexo
    * @param pSexo
    */
    public void setSexo(String pSexo){
        this.sexo = pSexo;
    }
    /**
    * @return sexo
    */
    public String getSexo(){
        return this.sexo;
    }

    @Override
    public String toString(){
        return "ModelCFuncionario {" + "::Id = " + this.Id + "::cargo = " + this.cargo + "::contactoP = " + this.contactoP + "::morada = " + this.morada + "::nome = " + this.nome + "::sexo = " + this.sexo +  "}";
    }
}