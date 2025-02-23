package adapter.image;

public class AdapterDesignPatternDemo {
    public static void main(String[] args) {

        Image jpegImage = new JPEGAdapter(new JPEGImage());
        Image pngImage = new PNGAdapter(new PNGImage());
        Image tiffImage = new TIFFAdapter(new TIFFImage());

        jpegImage.loadImage("C:workspace/imagepath/jpegfiles");
        jpegImage.displayImage();

        pngImage.loadImage("C:workspace/imagepath/pngfiles");
        pngImage.displayImage();

        tiffImage.loadImage("C:worspace/imagepath/tifffiles");
        tiffImage.displayImage();

    }
}
