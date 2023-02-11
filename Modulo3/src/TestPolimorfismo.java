public class TestPolimorfismo {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Contador contador = new Contador();

        funcionario.setSalario(1000);
        gerente.setSalario(2000);
        contador.setSalario(1500);

        ControlBono control = new ControlBono();
        control.registrarSalario(funcionario);
        control.registrarSalario(gerente);
        control.registrarSalario(contador);

    }
}
