public class Circulo {
    private double radio;
    private double area;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = (radio < 0) ? 0 : radio;
        calculateArea();
    }

    public double getArea() {
        return area;
    }

    private void calculateArea() {
        area = radio * radio * Math.PI;
    }
}