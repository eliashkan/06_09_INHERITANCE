package multimedia;

import javax.persistence.*;

@Entity
@DiscriminatorValue("SUB")
public class Book extends MultiMedia {
   private int pages;

   public int getPages() {
      return pages;
   }

   public void setPages(int pages) {
      this.pages = pages;
   }

   @Override
   public String toString() {
      return "Book [pages=" + pages + ", toString()="
            + super.toString() + "]";
   }
   
}
