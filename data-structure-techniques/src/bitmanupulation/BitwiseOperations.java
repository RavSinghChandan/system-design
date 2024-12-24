package bitmanupulation;

public class BitwiseOperations {

    public static int bitwiseAND(int a, int b) {
        return a & b;
    }

    public static int bitwiseOR(int a, int b) {
        return a | b;
    }

    public static int bitwiseXOR(int a, int b) {
        return a ^ b;
    }

    public static int leftShift(int a, int positions) {
        return a << positions;
    }

    public static int rightShift(int a, int positions) {
        return a >> positions;
    }

}
