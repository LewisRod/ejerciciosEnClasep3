package ejerciciosEnClasep3.EjerciciosTema6y7;

public class EmpleadoFijo extends Empleado {
    private String nombre;
    private double salario;

    public EmpleadoFijo(String nombre,double salario){
        super(nombre);
        this.salario = salario;
    }

    @Override
    public void calcularSalario(){
        System.out.println(salario);
    };
}
