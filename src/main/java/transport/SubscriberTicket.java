package transport;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@DiscriminatorValue("SUB")
public class SubscriberTicket extends Ticket{
   private String name;
   private LocalDate start;
   private LocalDate end;

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }

   public LocalDate getStart() {
      return start;
   }

   public void setStart(LocalDate start) {
      this.start = start;
   }

   public LocalDate getEnd() {
      return end;
   }

   public void setEnd(LocalDate end) {
      this.end = end;
   }
   
}
