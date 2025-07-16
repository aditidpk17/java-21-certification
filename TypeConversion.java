public class TypeConversion {
    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = intNum; // implicit conversion from int to float
        System.out.println("Float value: " + floatNum);

        float floatNum2 = 15.3F;
        int intToFloatNum = (int) floatNum2; // explicit conversion from float to int
        System.out.println("Int value: " + intToFloatNum);

        String str = "123";
        int strToInt = Integer.parseInt(str);
        System.out.println("Converted String to Int: " + strToInt);
    }
}
