package multimedia;

import javax.persistence.*;

public class GetMultiMedia {
   public static void main(String[] args) throws Exception {
      EntityManagerFactory emf = null;
      EntityManager em = null;
      try {
         emf = Persistence.createEntityManagerFactory("course");
         em = emf.createEntityManager();
         EntityTransaction tx = em.getTransaction();
         tx.begin();

         MultiMedia mm = em.find(MultiMedia.class, 3L);
         System.out
               .println(mm.getAuthor() + " " + mm.getTitle());

         tx.commit();
      } finally {
         if (em != null)
            em.close();
         if (emf != null)
            emf.close();
      }
   }
}
