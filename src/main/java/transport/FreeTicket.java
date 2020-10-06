package transport;

import javax.persistence.*;

@Entity
@DiscriminatorValue("FREE")
public class FreeTicket extends OccasionalTicket {
   private String sponsor;

   public String getSponsor() {
      return sponsor;
   }

   public void setSponsor(String sponsor) {
      this.sponsor = sponsor;
   }
   
}
