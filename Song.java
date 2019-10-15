

public class Song
{
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    
     
    public Song(String title, double price, int rating) {
       this.title = title;
       this.price = price; 
       this.rating = rating;
    }
    public void addToFavorites() {
     favorite = true;   
    }
    public void setPrice(double p) {
     p = price;   
    }
    public double getPrice () {
        return price; 
    }
    public int getRating() {
        return rating;
    }
    
    public String getTitle() {
        return title;
    
    }
    public void setTitle(String t) {
        title = t;
    }
}
