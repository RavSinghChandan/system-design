package adapter.image;

// Adapter implements target and calls Adaptee  :
public class JPEGAdapter implements Image{

    public JPEGImage image ;

    public JPEGAdapter(JPEGImage image ){
        this.image = image;
    }
    @Override
    public void loadImage(String imagePath) {
        image.loadJPEG(imagePath);
    }

    @Override
    public void displayImage() {
        image.displayJPEG();
    }
}
