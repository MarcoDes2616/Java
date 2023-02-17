package alura;

public class TestAutenticable {
    public static void main(String[] args) {
        ClassSistemaInterno sistema = new ClassSistemaInterno();
        ClassGerente gerente = new ClassGerente();
        ClassAdministrador administrador = new ClassAdministrador();

        sistema.autentica(gerente);
        sistema.autentica(administrador);
    }
}
