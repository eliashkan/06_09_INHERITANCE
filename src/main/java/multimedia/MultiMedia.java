package multimedia;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
public abstract class MultiMedia implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.TABLE, generator = "MultiMediaGenerator")
   @TableGenerator(name = "MultiMediaGenerator", table = "MultiMediaSequence")
   private long id;
   
   private String title;
   private String author;
   private LocalDate pubdate;
   private String publisher;
   
   public String getPublisher() {
      return publisher;
   }
   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getAuthor() {
      return author;
   }
   public void setAuthor(String author) {
      this.author = author;
   }

   public LocalDate getDate() {
      return pubdate;
   }

   public void setDate(LocalDate date) {
      this.pubdate = date;
   }
   public long getId() {
      return id;
   }

   @Override
   public String toString() {
      return "MultiMedia [id=" + id + ", title=" + title
            + ", author=" + author + ", pubdate=" + pubdate
            + ", publisher=" + publisher + "]";
   }
   
}
