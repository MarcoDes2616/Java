package alura;

public abstract class Class_Super_Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;


    public void funcionario() {

    }
// getter y setter nombre, salario, documento
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getTipo() {
        return tipo;
    }
    public abstract double getBono();


}
