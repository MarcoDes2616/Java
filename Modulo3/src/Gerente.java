public class Gerente extends Funcionario{
    private String clave;
    private String sesion;
    private String agencia;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    // sobreescritura de metodo
    public double getBono(){
        //probamos un nuevo calculo de bonificación del 5%
        System.out.println("ejecutado desde gerente");
        return super.getSalario() +
                super.getBono();
    }

    public boolean getSesion(String clave) {
        if (this.clave == clave){
            return true;
        } else {
            return false;
        }
    }
}
