public class Employee extends Osoba {

    private int wypłata;

    public Employee(String miejscowość, double kodpocztowy, int wypłata) {
        super(miejscowość, kodpocztowy);
        this.wypłata = wypłata;
    }


    public int getWypłata() {
        return wypłata;
    }

    public void setWypłata(int wypłata) {
        this.wypłata = wypłata;
    }

    void showInfo() {
        System.out.println(getMiejscowość() + " " + getKodpocztowy() + " " + wypłata);
    }
}
