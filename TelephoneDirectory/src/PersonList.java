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
        System.out.print("Rehbere eklemek istediğiniz kişinin adını yazınız : ");
        name = scan.nextLine();
        System.out.print("Rehbere eklemek istediğiniz kişinin soyadını yazınız : ");
        surname = scan.nextLine();
        System.out.print("Rehbere eklemek istediğiniz kişinin numarasını yazınız : ");
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

    void sil(){
        if(head == null){
            System.out.println("Liste boş silinecek kayıt yok!");
        }else{
            System.out.println("Silmek istediğiniz kayıtın numarasını giriniz: ");
            phoneNumber = scan.nextLong();

            if(phoneNumber == head.phoneNumber && head.next == null){
                head = null;
                tail = null;
                System.out.println(phoneNumber + " numaralı kayıt rehberden silindi, rehberde kayıtlı kişi kalmadı");
            }else if(phoneNumber == head.phoneNumber && head.next != null){
                head.next = head;
                System.out.println(phoneNumber + " numaralı kayıt silindi");
            }else{
                temp = head;
                temp2 = head;

                while(temp.next != null){
                    if(phoneNumber == temp.phoneNumber){
                        temp2.next = temp.next;
                        System.out.println(phoneNumber + " numaralı kayıt silindi");
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if(phoneNumber == temp.phoneNumber){
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(phoneNumber + " numaralı öğrenci silindi");
                }

            }

        }
    }

    void yazdir(){
        if(head == null){
            System.out.println("Rehberde kayıtlı kişi yok");
        }else{
            temp = head;
            while(temp != null){
                System.out.println("İsim : " + name);
                System.out.println("Surname : " + surname);
                System.out.println("Telefon Numarası : " + phoneNumber);
                temp = temp.next;
            }
        }


    }
}
