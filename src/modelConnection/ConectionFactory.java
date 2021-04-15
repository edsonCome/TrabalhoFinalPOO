
package modelConnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectionFactory {
  private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("myPU"); 
  
  public EntityManager getConnection(){
      return em.createEntityManager();
  }
}
