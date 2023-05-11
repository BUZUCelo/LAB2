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

2.Builder: Clasa "Chef" folosește un model de construire numit "Builder Pattern" pentru a crea obiecte "Chef" cu diferite caracteristici, într-un mod ușor de utilizat și intuitiv. Acest lucru este realizat prin intermediul unei clase statice interne numită "ChefBuilder", care conține metode de setare a diferitelor caracteristici ale bucătarului și o metodă "build" care creează și returnează un obiect "Chef" cu aceste caracteristici.

public class Chef {
    private Chef(ChefBuilder builder) {
        // ...
    }

    public static class ChefBuilder {
        private String name;
        private String specialization;
        private int experience;

        public ChefBuilder(String name) {
            this.name = name;
        }

        public ChefBuilder setSpecialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public ChefBuilder setExperience(int experience) {
            this.experience = experience;
            return this;
        }

        public Chef build() {
            return new Chef(this);
        }
    }

    // ...
}

3.Factory: În acest cod nu există exemple de Factory Design Pattern. Cu toate acestea, clasa "Order" ar putea fi refăcută pentru a utiliza un astfel de model. De exemplu, o fabrică de comenzi ar putea fi creată pentru a produce obiecte "Order" cu diferite caracteristici, cum ar fi numele clientului sau elementele de meniu comandate.
