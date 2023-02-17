package alura;

public class ClassSistemaInterno {
    private String clave = "12345678";
    public boolean autentica(Class_Super_Autenticable autenticable){
        boolean iniciarSesion = autenticable.getSesion(clave);
        if(iniciarSesion){
            System.out.println("Login Exitoso");
            return true;
        } else {
            System.out.println("Login Erroneo");
            return false;
        }

    }
}
