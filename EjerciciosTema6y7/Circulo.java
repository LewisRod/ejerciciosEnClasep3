package ejerciciosEnClasep3.EjerciciosTema6y7;

public class Circulo extends Figura {

    private double radio;
    private double pi;

    public Circulo(double radio, double pi){
        this.pi = pi;
        this.radio = radio;
    }

    @Override
    public double area(){
        return pi * (radio * radio);
    }
}
