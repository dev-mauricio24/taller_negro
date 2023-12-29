public class Circulo extends FiguraGeometrica {
  private double radio;

  public Circulo(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  @Override
  double calcularArea() {
    double resultado = Math.pow(this.radio, 2);
    return Math.PI * resultado;
  }
}
