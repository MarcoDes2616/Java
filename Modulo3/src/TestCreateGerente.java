public class TestCreateGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNombre("Marco");
        gerente.setDocumento("1758612574");
        gerente.setSalario(6000.00);
        gerente.setTipo(1);
        gerente.setClave("12345678");

        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBono());
        System.out.println(gerente.getSesion("12345678"));

    }
}
