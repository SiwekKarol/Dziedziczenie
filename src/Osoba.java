public class Osoba {
    private String miejscowość;
    private double kodpocztowy;




    public String getMiejscowość() {
        return miejscowość;
    }

    public void setMiejscowość(String miejscowość) {
        this.miejscowość = miejscowość;
    }

    public double getKodpocztowy() {
        return kodpocztowy;
    }

    public void setKodpocztowy(double kodpocztowy) {
        this.kodpocztowy = kodpocztowy;
    }

    public Osoba(String miejscowość, double kodpocztowy) {
        this.miejscowość = miejscowość;
        this.kodpocztowy = kodpocztowy;
    }
}
