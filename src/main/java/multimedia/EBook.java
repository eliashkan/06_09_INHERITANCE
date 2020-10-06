package multimedia;

import javax.persistence.*;

@Entity
@DiscriminatorValue("EBOOK")
public class EBook extends Book {
   private String url;

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   @Override
   public String toString() {
      return "EBook [url=" + url + ", toString()="
            + super.toString() + "]";
   }
   
}
