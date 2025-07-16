public class UnderscoreExample {
    public static void main(String[] args) {
        int million = 1_000_000; // valid
        int num1 = 1000_; // invalid, underscore cannot be at the end
        int num2 = _1000; // invalid, underscore cannot be at the start
        int num3 = 0b1010_1011; // valid, binary literal with underscore
        int hex = 0xFF_FF; // valid, hexadecimal literal with underscore
        double pi = 3.14_15; // valid, underscore in floating-point literal
        double num4 = 3_.14; // invalid, underscore cannot be at the end of a floating-point literal
    }
}