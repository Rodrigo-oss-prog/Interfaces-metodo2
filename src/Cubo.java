public class Cubo implements IFiguraPlana, IFiguraTridimensional{

    private double aresta;


    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    @Override
    public double calcularArea() {
        System.out.println("A area do cubo é: ");
        return Math.pow(aresta, 2) * 6;
    }
    @Override
    public double CalcularVolume() {
        System.out.println("O volume do cubo é: ");
        return  Math.pow(aresta, 3);
    }
}
