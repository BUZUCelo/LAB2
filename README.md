Creational Design Patterns
1. Singleton: Clasa "Customer" folosește un model singleton pentru a se asigura că există întotdeauna o singură instanță a clasei în cadrul aplicației. Acest lucru este realizat prin intermediul unei variabile statice "instance" și a unei metode statice "getInstance", care returnează întotdeauna aceeași instanță a clasei.

public class Customer {
    private static Customer instance = null;

    private Customer(String name, String address, String contactInfo) {
        // ...
    }

    public static Customer getInstance(String name, String address, String contactInfo) {
        if (instance == null) {
            instance = new Customer(name, address, contactInfo);
        }
        return instance;
    }

    // ...
}
2.
