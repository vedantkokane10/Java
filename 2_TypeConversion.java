class TypeConversion{
    public static void main(String[] args) {
        // byte < short < int < long
        // for type conversion order left to right only
        byte b = 12;
        int a = b;
        System.out.println(a);
        int a1 = 245;
        byte b1 = (byte)a1; // using modulo it converts 245 to -11 i.e  byte equivalent
        System.out.println(b1);

        float f1 = 223.33f;
        int a2 = (int) f1;
        System.out.println(a2);

        byte b3 = 10;
        byte b4 = 30;
        int a3 = b3*b4; // type promotions
        System.out.println(a3);
    }
}