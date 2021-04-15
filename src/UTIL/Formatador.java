
package UTIL;

/**
 *
 * @author Edson Come
 */
public class Formatador {
    /**
     * Converter virgula para ponto
     * @param pString
     * @return 
     */
   public double converterVirgulaParaPonto(String pString){
       String retorno = new String();
       int tamanhoString = pString.length();
       for(int i = 0; 1 < tamanhoString; i++){
          if(pString.charAt(i) == ','){
              retorno += '.';
          }else{
              retorno += pString.charAt(i);
          } 
       }
       return Double.parseDouble(retorno);
   } 
}
