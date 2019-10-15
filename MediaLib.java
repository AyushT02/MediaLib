
public class MediaLib

{
    
    public static void main() {
     double totalCost;
     int numSongs;
     int totalRatings;
     double avgCost;
        totalCost = 0;
        numSongs = 0;
        totalRatings = 0;
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song("Stairway to Heaven", .99, 7);
        totalCost = totalCost + song1.getPrice();
        totalRatings = totalRatings + song1.getRating();
        numSongs++;
        Song song2 = new Song("Peace of Mind",1.29,9);
        totalCost = totalCost + song2.getPrice();
        totalRatings = totalRatings + song2.getRating();
        numSongs++;
        Song song3 = new Song("Bohemian Rhapsody", .99, 8);
        totalCost = totalCost + song3.getPrice();
        totalRatings = totalRatings + song3.getRating();
        numSongs++;
        Song song4 = new Song("Don't Stop me now", 1.29, 9);
        totalCost = totalCost + song4.getPrice();
        totalRatings = totalRatings + song4.getRating();
        numSongs++;
        Song song5 = new Song("Rocket Man", .99, 8);
        totalCost = totalCost + song5.getPrice();
        totalRatings = totalRatings + song5.getRating();
        numSongs++;
        Song song6 = new Song("Gimme Shelter", 1.29, 9);
        totalCost = totalCost + song6.getPrice();
        totalRatings = totalRatings + song6.getRating();
        numSongs++;
        Song song7 = new Song("Fortunate Son", .99, 9);
        totalCost = totalCost + song7.getPrice();
        totalRatings = totalRatings + song7.getRating();
        numSongs++;
        Song song8 = new Song("Highway to Hell", 1.29, 9);
        totalCost = totalCost + song8.getPrice();
        totalRatings = totalRatings + song8.getRating();
        numSongs++;
        Movie movie1 = new Movie("The Godfather", 178,  9);
        System.out.println("The movie's length is " + movie1.hrsMins());
        avgCost = totalCost/numSongs;
        System.out.println("The average cost of the songs is  " + avgCost);
        String songInfo1 = song1.getTitle()+"|" + song1.getRating()+ "|";
        String songInfo2 = song2.getTitle() +"|"+ song2.getRating() + "|";
        String songInfo3 = song3.getTitle() + "|" + song3.getRating() + "|";
        String songInfo4 = song4.getTitle() + "|" + song4.getRating()+ "|";
        String songInfo5 = song5.getTitle() + "|" + song5.getRating()+ "|";
        String songInfo6 = song6.getTitle() + "|" + song6.getRating()+ "|";
        String songInfo7 = song7.getTitle() + "|" + song7.getRating()+ "|";
        String songInfo8 = song8.getTitle() + "|" + song8.getRating()+ "|";
        MediaFile.writeString(songInfo1 + songInfo2 + songInfo3 + songInfo4 + songInfo5 + songInfo6 + songInfo7 + songInfo8);
        String s1Title = song1.getTitle();
        int s1Rating = song1.getRating();
        String s2Title = song2.getTitle();
        int s2Rating = song2.getRating();
        String s3Title = song3.getTitle();
        int s3Rating = song3.getRating();
        String s4Title = song4.getTitle();
        int s4Rating = song4.getRating();
        String s5Title = song5.getTitle();
        int s5Rating = song5.getRating();
        String s6Title = song6.getTitle();
        int s6Rating = song6.getRating();
        String s7Title = song7.getTitle();
        int s7Rating = song7.getRating();
        String s8Title = song8.getTitle();
        int s8Rating = song8.getRating();
        MediaFile.saveAndClose();
    }
   
}
