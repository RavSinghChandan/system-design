package instagram.photo;

public class Photo {
    private int id;
    private int userId;
    private String url;

    private Photo(PhotoBuilder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.url = builder.url;
    }

    public static class PhotoBuilder {
        private int id;
        private int userId;
        private String url;

        public PhotoBuilder setId(int id) { this.id = id; return this; }
        public PhotoBuilder setUserId(int userId) { this.userId = userId; return this; }
        public PhotoBuilder setUrl(String url) { this.url = url; return this; }

        public Photo build() { return new Photo(this); }
    }
}
