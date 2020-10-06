package multimedia;

import java.time.LocalDate;

import javax.persistence.*;

public class SaveMultiMedia {
   public static void main(String[] args) throws Exception {
      EntityManagerFactory emf = null;
      EntityManager em = null;
      try {
         emf = Persistence.createEntityManagerFactory("course");
         em = emf.createEntityManager();
         EntityTransaction tx = em.getTransaction();
         tx.begin();
         Book book = new Book();
         book.setAuthor("Noel Vaes");
         book.setDate(LocalDate.now());
         book.setPages(200);
         book.setPublisher("Myself");
         book.setTitle("Java Basics");
         em.persist(book);

         EBook ebook = new EBook();
         ebook.setAuthor("Noel Vaes");
         ebook.setDate(LocalDate.now());
         ebook.setPages(200);
         ebook.setPublisher("Myself");
         ebook.setTitle("Java Basics EBook version");
         ebook.setUrl("www.noelvaes.eu/syllabi");
         em.persist(ebook);

         CD cd = new CD();
         cd.setAuthor("Noel Vaes");
         cd.setDate(LocalDate.now());
         cd.setDuration(34);
         cd.setPublisher("Noel Vaes Music Center");
         cd.setTitle("Limburgse gezangen");
         cd.setTracks(7);
         em.persist(cd);

         DVD dvd = new DVD();
         dvd.setAuthor("Noel Vaes");
         dvd.setDate(LocalDate.now());
         dvd.setPublisher("Noel Vaes Movie Center");
         dvd.setTitle("Kataflop");
         dvd.setSubtitles(4);
         em.persist(dvd);

         tx.commit();
      } finally {
         if (em != null)
            em.close();
         if (emf != null)
            emf.close();
      }
   }
}
