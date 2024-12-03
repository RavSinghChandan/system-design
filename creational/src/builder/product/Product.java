package builder.product;

public class Product {

    private String partA;
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productA='" + partA + '\'' +
                ", productB='" + partB + '\'' +
                ", productC='" + partC + '\'' +
                '}';
    }
}
