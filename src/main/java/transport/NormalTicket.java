package transport;

import javax.persistence.*;

@Entity
@DiscriminatorValue("NORMAL")
public class NormalTicket extends OccasionalTicket {
   private float price;

   public float getPrice() {
      return price;
   }

   public void setPrice(float price) {
      this.price = price;
   }
}
