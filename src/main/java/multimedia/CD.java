package multimedia;

import javax.persistence.*;

@Entity
@DiscriminatorValue("CD")
public class CD extends AudioVisual {
   private int tracks;

   public int getTracks() {
      return tracks;
   }

   public void setTracks(int tracks) {
      this.tracks = tracks;
   }

   @Override
   public String toString() {
      return "CD [tracks=" + tracks + ", toString()="
            + super.toString() + "]";
   }
   
}
