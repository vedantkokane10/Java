class StringBufferClass{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Vedant");
        System.out.println(sb.capacity()); // total bits should be 16 but stringbuffer gives extra bits (5+)

        // to convert stringBuffer to string
        String s = sb.toString();
        System.out.println(s);
        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}