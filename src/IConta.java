public interface IConta{

    public void sacar(double saldo);
    public void depositar(double saldo);
    public void transferir(double saldo, IConta contaDestino);
    void imprimirExtrato();

} 