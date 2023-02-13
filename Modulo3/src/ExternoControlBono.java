public class ExternoControlBono {
    private static double total;

    public double registrarSalario(Funcionario funcionario){
        this.total += funcionario.getBono();
        System.out.println("El total actual es de: " + this.total);
        return this.total;
    }
}
