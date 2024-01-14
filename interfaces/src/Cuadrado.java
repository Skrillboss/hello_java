class Cuadrado implements Figura, Dibujable{

    private double x;
    private double y;

    Cuadrado(){
    }

    Cuadrado(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double calcularArea() {
        return x * y;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un cuadrado");
    }
}
