package adapter.image;

public class TIFFAdapter implements Image{

    private TIFFImage image;

    public TIFFAdapter(TIFFImage image){
        this.image=image;
    }
    @Override
    public void loadImage(String imagePath) {
        image.loadTIFF(imagePath);
    }

    @Override
    public void displayImage() {
        image.displayTIFF();
    }
}
