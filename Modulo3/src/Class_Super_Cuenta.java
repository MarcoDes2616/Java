public abstract class Class_Super_Cuenta {
    private int numero;
    private double saldo;
    private int agencia;
    private ClassCliente titular;

    private static int total;


    public Class_Super_Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("cuenta # " + numero + "creada");
        Class_Super_Cuenta.total++;
    }


    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
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
    public boolean transferir(double monto, Class_Super_Cuenta cuenta){
        if(this.saldo >= monto){
            this.saldo -= monto;
            cuenta.depositar(monto);
            return true;
        } else {
            return false;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
