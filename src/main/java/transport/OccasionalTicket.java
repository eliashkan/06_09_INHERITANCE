package transport;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
//@MappedSuperclass
//@DiscriminatorValue("OCCAS")
public abstract class OccasionalTicket extends Ticket {
   private LocalDate date;

   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }   
}
