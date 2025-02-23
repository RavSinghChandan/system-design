package adapter.image;

public class PNGAdapter implements Image{

    private PNGImage image;

    public PNGAdapter(PNGImage image){
        this.image=image;
    }
    @Override
    public void loadImage(String imagePath) {
        image.loadPNG(imagePath);
    }

    @Override
    public void displayImage() {
        image.displayPNG();
    }
}
