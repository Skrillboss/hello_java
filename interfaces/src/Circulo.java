class Circulo implements Dibujable, Figura, Rotable{

    private double radio;

    Circulo(){
    }
    Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("El circulo rota");
    }
}
