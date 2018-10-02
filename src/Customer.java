public class Customer extends Osoba {

    private int wydatki;

    public Customer(String miejscowość, double kodpocztowy, int wydatki) {
        super(miejscowość, kodpocztowy);
        this.wydatki = wydatki;
    }

    public int getWydatki() {
        return wydatki;
    }

    public void setWydatki(int wydatki) {
        this.wydatki = wydatki;
    }

    void showInfo(){
        System.out.println(getMiejscowość() + " " + getKodpocztowy() + " " + wydatki);
    }
}
