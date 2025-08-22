import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Circulo c1 = new Circulo();

        System.out.print("Digite o raio: ");
        c1.raio = sc.nextInt();
        c1.setRaio(c1.raio);

        System.out.println("Comprimento = "+c1.getComprimento());
        System.out.println("Area  = "+c1.getArea());
        System.out.println(c1.gettoString());

        sc.close();

    }
}


class Circulo{

    //usuário só dve mexer no raio.

    protected int raio;

    public Circulo() {
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setArea(int raio) {
        this.raio = raio;
    }
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getComprimento() {
        return 2 * Math.PI * raio;
    }

    public String gettoString() {
        return "Comprimento: " + getComprimento() + "  " + "Area: " + getArea() + "  " + "Raio: " + getRaio(); 
    }

}