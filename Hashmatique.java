import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Physical" , "Common love isn't for us. We created something phenomenal. Don't you agree? Don't you agree? You got me feeling diamond rich. Nothing on this planet compares to it. Don't you agree? Don't you agree?");
        trackList.put("Black Sheep", "Black sheep, come home. Black sheep, come home. Black sheep, come home. Black sheep, come home. Black sheep, come home");
        trackList.put("Rain on Me", "I didn't ask for a free ride. I only asked you to show me a real good time. I never asked for the rainfall. At least I showed up, you showed me nothing at all");
        trackList.put("Say So", "Day to night to morning, keep with me in the moment. I'd let you had I known it, why don't you say so? Didn't even notice, no punches left to roll with. You got to keep me focused, you want it, say so");

        String lyric = trackList.get("Physical");
        System.out.println(lyric);
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}