public class ContaCorrente{
  private int conta, agencia;
  private double saldo;
  private String nomeCliente;

  //construtores
  public ContaCorrente(){
    this.conta = 0;
    this.agencia = 0;
    this.saldo = 0;
    this.nomeCliente = "";
  }
  public ContaCorrente(int conta, int agencia, double saldo, String nomeCliente){
    this.conta = conta;
    this.agencia = agencia;
    this.saldo = saldo;
    this.nomeCliente = nomeCliente;
  }
  //metodos
  public void setConta(int conta){
    this.conta = conta;
  }
  public int getConta(){
    return this.conta;
  }
  public void setAgencia(int agencia){
    this.agencia = agencia;
  }
  public int getAgencia(){
    return this.agencia;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }
  public double getSaldo(){
    return this.saldo;
  }
  public void setNomeCliente(String nomeCliente){
    this.nomeCliente = nomeCliente;
  }
  public String getNomeCliente(){
    return this.nomeCliente;
  }

  public int sacar(double valor){
    if(this.saldo >= valor){
      this.saldo = this.saldo - valor;
      return 1;
    }
      return 0;
  }
  public void depositar(double valor){
    this.saldo = this.saldo + valor;
  }
  public void imprimir(){
    System.out.println("Número da conta: " + this.conta);
    System.out.println("Número da agência: " + this.agencia);
    System.out.println("Saldo da conta corrente: " + this.saldo);
    System.out.println("Nome do cliente: " + this.nomeCliente);
  }
}