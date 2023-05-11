package restaurant;

public class Customer {
    private static Customer instance = null;
    private String name;
    private String address;
    private String contactInfo;

    private Customer(String name, String address, String contactInfo) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public static Customer getInstance(String name, String address, String contactInfo) {
        if (instance == null) {
            instance = new Customer(name, address, contactInfo);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
