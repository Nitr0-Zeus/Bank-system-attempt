public class Conta {

    private String nomeCliente;
    private int numeroConta;
    protected float saldo;

    public Conta(String nomeCliente, int numeroConta, float saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void sacar(float valor){
        saldo -= valor;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    @Override
    public String toString() {
        return "\nDados da Conta:" +
                "\nCliente: " + nomeCliente +
                "\nN° da conta: " + numeroConta +
                "\nSaldo atual: R$" + saldo;
    }

    
}