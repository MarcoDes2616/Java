public class Cuenta {
    private int numero;
    private String saldo;
    private int agencia;

    private Cliente titular;

    private static int total;


    public Cuenta( int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("cuenta # " + numero + "creada");
        Cuenta.total++;
    }


    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public String getSaldo() {
        return saldo;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }
    public boolean retirar(double monto){
        if(this.saldo > monto) {
            this.saldo -= monto;
            return true;
        } else
            return false;
    }
    public boolean transferir(double monto, int numero){

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
