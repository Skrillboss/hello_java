//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.25);
        Cuadrado cuadrado = new Cuadrado(6, 8);

        System.out.println("--------CIRCULO---------");
        System.out.println(circulo.calcularArea());
        circulo.dibujar();
        circulo.rotar();
        System.out.println("--------CUADRADO---------");
        System.out.println(cuadrado.calcularArea());
        cuadrado.dibujar();
    }
}