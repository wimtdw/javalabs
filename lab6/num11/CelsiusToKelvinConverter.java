package lab6.num11;


class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

