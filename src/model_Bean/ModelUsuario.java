package model_Bean;
/**
*
* @author Edson Come
*/
public class ModelUsuario {

    private int idUsuario;
    private String userNome;
    private String userLogin;
    private String userSenha;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de idUsuario
    * @param pIdUsuario
    */
    public void setIdUsuario(int pIdUsuario){
        this.idUsuario = pIdUsuario;
    }
    /**
    * @return pk_idUsuario
    */
    public int getIdUsuario(){
        return this.idUsuario;
    }

    /**
    * seta o valor de userNome
    * @param pUserNome
    */
    public void setUserNome(String pUserNome){
        this.userNome = pUserNome;
    }
    /**
    * @return userNome
    */
    public String getUserNome(){
        return this.userNome;
    }

    /**
    * seta o valor de userLogin
    * @param pUserLogin
    */
    public void setUserLogin(String pUserLogin){
        this.userLogin = pUserLogin;
    }
    /**
    * @return userLogin
    */
    public String getUserLogin(){
        return this.userLogin;
    }

    /**
    * seta o valor de userSenha
    * @param pUserSenha
    */
    public void setUserSenha(String pUserSenha){
        this.userSenha = pUserSenha;
    }
    /**
    * @return userSenha
    */
    public String getUserSenha(){
        return this.userSenha;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::idUsuario = " + this.idUsuario + "::userNome = " + this.userNome + "::userLogin = " + this.userLogin + "::userSenha = " + this.userSenha +  "}";
    }
}