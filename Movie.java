

public class Movie
{
   private int rating;
   private String title;
   private int duration;
   
   public Movie(String title, int duration, int rating)  {
       this.title = title;
       this.duration = duration;
       this.rating = rating;
    }
    public void setRating(int r) {
     r = rating;   
    }
    public int getRating() {
     return rating;   
    }
    public String hrsMins() {
   int hours = duration/60;
   int minutes = duration % 60;
   return hours + " Hours " + minutes + " Minutes "; 
    }
    public void setTitle(String t) {
        t = title;
    }
    public String getTitle() {
        return title;
    }
}
