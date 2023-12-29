public class Cuadrado extends FiguraGeometrica{
  private double ladoA;
  private double ladoB;

  public Cuadrado(double ladoA, double ladoB) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
  }

  public double getLadoA() {
    return ladoA;
  }

  public void setLadoA(int ladoA) {
    this.ladoA = ladoA;
  }

  public double getLadoB() {
    return ladoB;
  }

  public void setLadoB(int ladoB) {
    this.ladoB = ladoB;
  }

  @Override
  double calcularArea() {
    double valorLados = this.ladoA * this.ladoB; // 3 * 2 = 6
    return  Math.pow(valorLados, 2);
  }
}
