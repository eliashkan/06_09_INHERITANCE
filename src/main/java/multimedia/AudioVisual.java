package multimedia;

import javax.persistence.Entity;

@Entity
public abstract class AudioVisual extends MultiMedia {
   private long duration;

   public long getDuration() {
      return duration;
   }

   public void setDuration(long duration) {
      this.duration = duration;
   }

   @Override
   public String toString() {
      return "AudioVisual [duration=" + duration
            + ", toString()=" + super.toString() + "]";
   }
   
}
