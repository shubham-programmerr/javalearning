package package2;

import package1.AccessModifiers;

public class TestAccess {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println("Accessing from package2:");
        System.out.println("publicVar = " + obj.publicVar); // Accessible

        // The following lines will cause compile-time errors if uncommented:

        // System.out.println("protectedVar = " + obj.protectedVar); //  Not accessible (not subclass)
        // System.out.println("defaultVar = " + obj.defaultVar);     // Not accessible (not same package)
        // System.out.println("privateVar = " + obj.privateVar);     // Not accessible (private)

        obj.display(); // This works because it's a public method
    }
}
