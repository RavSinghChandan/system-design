package bitmanupulation;

import static bitmanupulation.BitwiseOperations.*;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Bitwise AND: " + bitwiseAND(a, b));
        System.out.println("Bitwise OR: " + bitwiseOR(a, b));
        System.out.println("Bitwise XOR: " + bitwiseXOR(a, b));
        System.out.println("Left Shift: " + leftShift(a, 2));
        System.out.println("Right Shift: " + rightShift(a, 2));
    }
}
