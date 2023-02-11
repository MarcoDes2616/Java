public class Contador extends Funcionario{
    @Override
    public double getBono() {
        System.out.println("ejecutado desde contador");
        return super.getBono() + (super.getSalario() * 0.5);
    }
}
