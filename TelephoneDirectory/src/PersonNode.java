public class PersonNode {

    String name;
    String surname;
    long phoneNumber;
    PersonNode next;

    public PersonNode(String name, String surname, long phoneNumber){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        next = null;
    }

}
