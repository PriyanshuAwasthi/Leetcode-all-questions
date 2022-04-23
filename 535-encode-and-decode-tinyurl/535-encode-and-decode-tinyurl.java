public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<String,String> hm = new HashMap<>();
    public String encode(String longUrl) {
        String str= longUrl.hashCode()+"";
        hm.put(str,longUrl);
        return str;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if(hm.containsKey(shortUrl)) return hm.get(shortUrl);
        return "";
    }
}