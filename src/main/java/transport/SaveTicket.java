package transport;

import java.time.LocalDate;

import javax.persistence.*;

public class SaveTicket {
   public static void main(String[] args) {
      EntityManagerFactory emf = null;
      EntityManager em = null;
      try {
         emf = Persistence.createEntityManagerFactory("course");
         em = emf.createEntityManager();
         EntityTransaction tx = em.getTransaction();
         tx.begin();

         SubscriberTicket st = new SubscriberTicket();
         st.setName("Jan Jansen");
         st.setDeparture("Brussel");
         st.setArrival("Gent");
         st.setStart(LocalDate.of(2019, 1, 1));
         st.setEnd(LocalDate.of(2019, 12, 31));
         em.persist(st);

         FreeTicket ft = new FreeTicket();
         ft.setDeparture("Hasselt");
         ft.setArrival("Knokke");
         ft.setDate(LocalDate.of(2019, 6, 21));
         ft.setSponsor("NMBS");
         em.persist(ft);

         NormalTicket nt = new NormalTicket();
         nt.setDeparture("Aalst");
         nt.setArrival("Luik");
         nt.setDate(LocalDate.of(2019, 3, 20));
         nt.setPrice(5);
         em.persist(nt);

         tx.commit();
         System.out.println("Bewaard");
      } finally {
         if (em != null)
            em.close();
         if (emf != null)
            emf.close();
      }
   }
}
