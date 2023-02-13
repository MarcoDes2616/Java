public class Externo_ControlBono {
    private static double total;

    public double registrarSalario(Class_Super_Funcionario funcionario){
        this.total += funcionario.getBono();
        System.out.println("El total actual es de: " + this.total);
        return this.total;
    }
}
