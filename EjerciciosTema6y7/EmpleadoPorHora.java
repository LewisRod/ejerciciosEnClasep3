package ejerciciosEnClasep3.EjerciciosTema6y7;

public class EmpleadoPorHora extends Empleado {
     private double horasTrabajadas;
    private double pagoPorHora;
    private double salario;

    public EmpleadoPorHora(String nombre, double horasTrabajadas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public void calcularSalario(){
        salario = horasTrabajadas * pagoPorHora;
       System.out.println(salario);
    };
}
