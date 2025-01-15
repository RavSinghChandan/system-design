package webapps.urlshort;

import java.util.HashMap;
import java.util.Random;

public class URLShorteningService {

    // 1. Define the constants
    private static  final  String BASE_URL = "http://short.lly/";
    private static final  String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final  int SHORT_URL_LENGTH = 6;

    // 2. In memory database : to store (shortToLongMap - (shortCode,longUrl), longToShortMap(longUrl,shortCode)
    private HashMap<String,String> shortToLongMap = new HashMap<>();
    private HashMap<String,String> longToShortMap = new HashMap<>();

    public String shortenURL(String longUrl) {

        // 3 . Shorted already ? - return: base-url+shortened-url
        if(longToShortMap.containsKey(longUrl)){
            return BASE_URL+longToShortMap.get(longUrl);
        }
        //4 . Generate the code : long characters -> 6 character hashcode
        String shortGeneratedHashCode = generateShortCode();
        while (shortToLongMap.containsKey(shortGeneratedHashCode)){
            shortGeneratedHashCode = generateShortCode();
        }
        // 5. Save to the tables
        shortToLongMap.put(shortGeneratedHashCode,longUrl);
        longToShortMap.put(longUrl,shortGeneratedHashCode);

        return BASE_URL + shortGeneratedHashCode;
    }

    // 6. Return the shortened url
    public String getOriginalURL(String shortUrl) {
        String shortGeneratedHashCode = shortUrl.replace(BASE_URL, "");
        return shortToLongMap.get(shortGeneratedHashCode);
    }

    private String generateShortCode() {
        Random random = new Random();
        StringBuilder shortGeneratedHashCode =  new StringBuilder();

        for(int i=0;i<SHORT_URL_LENGTH;i++){
            int createARandomIndex = random.nextInt(CHARACTERS.length());
            shortGeneratedHashCode.append(CHARACTERS.charAt(createARandomIndex));
        }
        return shortGeneratedHashCode.toString();
    }

}
