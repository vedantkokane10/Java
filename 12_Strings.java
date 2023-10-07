class Strings{
    public static void main(String[] args) {
        String name = "Vedant";
        // no need to use new key word for creating object of string class it is done automatically
        System.out.println(name.charAt(4));
        System.out.println(name.concat(" Kokane"));
        // String is stored in string constant pool in heap and is referenced by objects of string class
        // string with same value are only assigned once in the meomary
        // by deafult string are immutable
    }
}