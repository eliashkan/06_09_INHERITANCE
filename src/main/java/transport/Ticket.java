package transport;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
public abstract class Ticket {
   @Id
   @GeneratedValue(strategy = GenerationType.TABLE, generator = "TicketGenerator")
   @TableGenerator(name = "TicketGenerator", table = "TicketSequence")
   private long id;

   private String departure;
   private String arrival;

   public String getDeparture() {
      return departure;
   }

   public void setDeparture(String departure) {
      this.departure = departure;
   }

   public String getArrival() {
      return arrival;
   }

   public void setArrival(String arrival) {
      this.arrival = arrival;
   }

   public long getId() {
      return id;
   }
}
