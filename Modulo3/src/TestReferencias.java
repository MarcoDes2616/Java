public class TestReferencias {
    public static void main(String[] args) {
        Funcionario newFuncionario = new Funcionario();
        Gerente gerenteNew = new Gerente();
        newFuncionario.setSalario(2000);
        gerenteNew.setSalario(2000);
        ControlBono control = new ControlBono();
        control.registrarSalario(newFuncionario);
        control.registrarSalario(gerenteNew);

        // newFuncionario.sesion() no compila por ser declarado como un funcionario
        System.out.println(newFuncionario.getBono());
        System.out.println(gerenteNew.getBono());

    }
}
