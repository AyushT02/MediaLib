
public class LoopingMediaLib
{
   public static void main() { 
     String songInfo = MediaFile.readString();
     System.out.println(songInfo);
     while(songInfo != null) {
     System.out.println(MediaFile.readString());
        }
         
      
    }
}
