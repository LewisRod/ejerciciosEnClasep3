package ejerciciosEnClasep3.EjerciciosTema6y7;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area(){
        return base * altura; 
    }
}
