import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Áreas, Arestas e Volumes"+"\n");

        System.out.println("Círculo");
        Circulo circulo = new Circulo(6);
        System.out.println(circulo.calcularArea()+"\n");

        System.out.println("Quadrado");
        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.calcularArea()+"\n");

        System.out.println("Cubo");
        Cubo cubo = new Cubo(18);
        System.out.println(cubo.CalcularVolume()+'\n');
        System.out.println("\nCubo");
        Cubo cubo1 = new Cubo(10);
        System.out.println(cubo1.calcularArea());
    }



}