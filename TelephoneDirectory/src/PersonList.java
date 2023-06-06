import java.util.Scanner;

public class PersonList {
    String name;
    String surname;
    long phoneNumber;
    PersonNode head = null;
    PersonNode tail = null;
    PersonNode temp = null;
    PersonNode temp2 = null;

    Scanner scan = new Scanner(System.in);

    void ekle() {
        System.out.println("Rehbere eklemek istediğiniz kişinin adını yazınız");
        name = scan.nextLine();
        System.out.println("Rehbere eklemek istediğiniz kişinin soyadını yazınız");
        surname = scan.nextLine();
        System.out.println("Rehbere eklemek istediğiniz kişinin numarasını yazınız");
        phoneNumber = scan.nextInt();

        PersonNode kayit = new PersonNode(name, surname, phoneNumber);

        if(head == null){
            head = kayit;
            tail = kayit;
            System.out.println("İlk kayıt eklendi");
        } else{
            kayit.next = head;
            head = kayit;
            System.out.println(name + " isimli kişi rehbere kayıt edildi");
        }
    }
}
