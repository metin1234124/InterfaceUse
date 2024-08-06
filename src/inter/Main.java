package inter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double price=input.nextDouble();

        System.out.print("Kart no giriniz : ");
        String cartNumber=input.next();

        System.out.print("Son kullanma tarihi giriniz : ");
        String expiration=input.next();

        System.out.print("Guvenlik kodu giriniz : ");
        String cvc=input.next();

        System.out.println("1. A Bankasi");
        System.out.println("2. B Bankasi");
        System.out.println("Banka Seciniz: ");

        int selectBank=input.nextInt();

        switch (selectBank){
            case 1:
            ABankasi apos=new ABankasi("A Bankasi","132546678965","5469875");
            apos.connect("127.0.1.1");
            apos.payment(price,cartNumber,expiration,cvc);
            break;
            case 2:
                BBankasi bpos=new BBankasi("B Bankasi","56489799533","564878");
                bpos.connect("127.0.1.1");
                bpos.payment(price,cartNumber,expiration,cvc);
                break;
            default:
                System.out.println("Gecerli bir banka giriniz !");
        }


    }
}
