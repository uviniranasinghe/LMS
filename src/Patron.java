public class Patron {

    private String name;
    private String address;
    private String contact;
    private String ID;

    public Patron(String name, String address, String contact, String ID) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getID() {
        return ID;
    }
}
