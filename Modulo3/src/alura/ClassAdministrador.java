package alura;

public class ClassAdministrador extends Class_Super_Funcionario implements Class_Super_Autenticable{
    private Externo_utils utils;


    // constructor administrador
    public ClassAdministrador(){
        this.utils = new Externo_utils();
    }


    public double getBono() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
        this.utils.setClave(clave);
    }

    @Override
    public boolean getSesion(String clave) {
        return this.utils.getSesion(clave);
    }
}
