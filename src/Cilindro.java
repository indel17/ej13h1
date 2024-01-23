public class Cilindro extends Circulo {
    private double altura;
    private double volumen;

    public Cilindro(double radio, double altura, double volumen) {
        super(radio);
        setAltura(altura);
        this.volumen = volumen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = (altura < 0) ? 0 : altura;
        calculateArea();
    }

    public double getVolumen() {
        return getArea() * altura;
    }

    private void calculateArea() {
       double aria = (2 * Math.PI * getRadio() * (getRadio() + altura));
    }
}