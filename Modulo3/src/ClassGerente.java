public class ClassGerente extends Class_Super_Funcionario implements Class_Super_Autenticable  {
    private Externo_utils utils;
    private String agencia;

// constructor gerente
    public ClassGerente(){
        this.utils = new Externo_utils();
    }

    @Override
    public double getBono(){
        //probamos un nuevo calculo de bonificación del 5%
        System.out.println("ejecutado desde gerente");
        return 2000;
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
