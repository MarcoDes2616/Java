public class Externo_utils {
    private String clave;

    public boolean getSesion(String clave){
        return this.clave == clave;
    };
    public void setClave(String clave){
        this.clave = clave;
    }
}
