package multimedia;

import javax.persistence.*;

@Entity
@DiscriminatorValue("DVD")
public class DVD extends MultiMedia {
   private int subtitles;

   public int getSubtitles() {
      return subtitles;
   }

   public void setSubtitles(int subtitles) {
      this.subtitles = subtitles;
   }

   @Override
   public String toString() {
      return "DVD [subtitles=" + subtitles + ", toString()="
            + super.toString() + "]";
   }
   
}
