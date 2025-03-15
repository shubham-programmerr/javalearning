class PrimitiveTypes {
    public static void main(String args[]) {
        System.out.println("Primitive Type Information in Java:");
        System.out.println("byte: Size = " + Byte.BYTES + " bytes, Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
        System.out.println("short: Size = " + Short.BYTES + " bytes, Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
        System.out.println("int: Size = " + Integer.BYTES + " bytes, Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
        System.out.println("long: Size = " + Long.BYTES + " bytes, Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
        System.out.println("float: Size = " + Float.BYTES + " bytes, Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
        System.out.println("double: Size = " + Double.BYTES + " bytes, Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
        System.out.println("char: Size = " + Character.BYTES + " bytes, Min = " + (int) Character.MIN_VALUE + ", Max = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: Size = JVM dependent, Min = " + Boolean.FALSE + ", Max = " + Boolean.TRUE);
    }
}

