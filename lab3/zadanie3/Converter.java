package lab3.zadanie3;

public class Converter {
    private double exchangeRateEURtoRUB;
    public Converter(double exchangeRateEURtoRUB) {
        this.exchangeRateEURtoRUB = exchangeRateEURtoRUB;
    }
    public double convertRUBtoEUR(double RUB) {
        return RUB / exchangeRateEURtoRUB;
    }
    public double convertEURtoRUB(double EUR) {
        return EUR * exchangeRateEURtoRUB;
    }
    public void changeExchangeRate(double exchangeRateEURtoRUB) {
        this.exchangeRateEURtoRUB = exchangeRateEURtoRUB;
    }
    public double getExchangeRate() {
        return exchangeRateEURtoRUB;
    }
    public static void main(String[] args) {
        Converter converter = new Converter(103.09);
        double RUB = 100;
        double EUR = converter.convertRUBtoEUR(RUB);
        System.out.println(RUB + " RUB равно " + EUR + " EUR");
        EUR = 100;
        RUB = converter.convertEURtoRUB(EUR);
        System.out.println(EUR + " EUR равно " + RUB + " RUB");
    }
}

