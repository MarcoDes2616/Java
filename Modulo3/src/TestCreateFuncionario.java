public class TestCreateFuncionario {
    public static void main(String[] args) {
        Funcionario pFuncionario = new Funcionario();
        pFuncionario.setNombre("Juan");
        pFuncionario.setDocumento("18975386");
        pFuncionario.setSalario(1000.00);
        pFuncionario.setTipo(0);

        System.out.println(pFuncionario.getSalario());
        System.out.println(pFuncionario.getBono());
    }
}
