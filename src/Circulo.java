public class Circulo implements IFiguraPlana {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }


    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        System.out.println("A área do circulo é: ");
        return Math.PI * Math.pow(raio, 2);

    }



}
