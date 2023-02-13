public class ClassCliente implements Class_Super_Autenticable {
    private String nombre;
    private String telefono;
    private String documento;
    private Externo_utils utils;
    private String clave;

    //constructor de cliente
    public ClassCliente(){
        this.utils = new Externo_utils();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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
