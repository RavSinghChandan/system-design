package instagram.photo;

public class PhotoProxy {
    private PhotoService photoService;

    public PhotoProxy(PhotoService photoService) {
        this.photoService = photoService;
    }

    public void uploadPhoto(Photo photo) {
        System.out.println("Validating photo before uploading...");
        photoService.uploadPhoto(photo);
    }
}
