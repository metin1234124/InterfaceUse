package inter;

public class ABankasi implements IBanka{
    private String bankaAdi;
    private String terminalId;
    private String password;

    public ABankasi(String bankaAdi, String terminal_id, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminal_id;
        this.password = password;
    }
    @Override
    public boolean connect(String ipAdress){
        System.out.println("Kullanici ip "+ ipAdress);
        System.out.println("Makina ip "+this.hostIpAdress);
        System.out.println(this.bankaAdi+" baglanildi !");
        return true;
    }


    @Override
    public boolean payment(double price, String cardNumber, String expirationDate, String cvc){
        // Banka odeme islemleri
        System.out.println("Bankadan cevap bekleniyor !");
        System.out.println("islem basarili oldu !");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
