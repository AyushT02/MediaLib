
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{   
    public static void main() {
       String fileString = MediaFile.readString();
       int fileIndex1 = fileString.indexOf("|");
       
       while(fileIndex1 >= 0) {
       
       String s1sub = fileString.substring(0,fileIndex1);
       System.out.println(s1sub);
       fileString = fileString.substring(fileIndex1 + 1);
       fileIndex1 = fileString.indexOf("|");    
           
        }
    }
}
