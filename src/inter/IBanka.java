package inter;
  //İnterface bir sınıfı değildir bir sınıfın şablonu gibidir.
// interfacelere değişken tanımlayamıyoruz. ama varsayılan bir değer vererek oluşturulabilir ve değiştirilemeyecek değerler verilir.
//interfacelerde sadece metod isimleri yazılır,
public interface IBanka {

      final String hostIpAdress="127,0,0,1";

     boolean connect(String ipAdress);
     boolean payment(double price,String cardNumber,String expirationDate,String cvc);

    }
