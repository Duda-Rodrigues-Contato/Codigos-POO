import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Circulo c1 = new Circulo();

        System.out.print("Digite o raio: ");
        //Errado: c1.raio = sc.nextInt();
        c1.setRaio(sc.nextDouble()); // Correto

        System.out.println("Informações do Círculo: ");
        System.out.println(c1.toString());

        sc.close();

    }
}


class Circulo{

    //usuário só dve mexer no raio.

    protected double raio;

    public Circulo() {
        this.raio = 0.0;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getComprimento() {
        return 2 * Math.PI * raio;
    }
    
    @Override
    public String toString() {
        return "Comprimento: " + getComprimento() + "  " + "Area: " + getArea() + "  " + "Raio: " + getRaio(); 
    }

}