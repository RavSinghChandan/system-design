package webapps.urlshort;

public class Main {
    public static void main(String[] args) {

        URLShorteningService service = new URLShorteningService();

        // Shorten a URL
        String longUrl = "https://aurawithrav.com/this-is-really-a-very-long-url/you-can-read-this/yes!-it-is-long-url!S";
        String shortUrl = service.shortenURL(longUrl);
        System.out.println("Short URL: " + shortUrl);

        // Retrieve the original URL
        String originalUrl = service.getOriginalURL(shortUrl);
        System.out.println("Original URL: " + originalUrl);

    }
}
