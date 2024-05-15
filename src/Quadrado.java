public class Quadrado implements  IFiguraPlana{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        System.out.println("A área do quadrado é: ");
        return  lado*lado;
    }
}

