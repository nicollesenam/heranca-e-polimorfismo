import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    ContaCorrente novoObj = new ContaCorrente();
    Scanner leituraConsole = new Scanner(System.in);

    novoObj.setConta(12345);
    novoObj.setSaldo(1000);
    novoObj.setAgencia(01);
    System.out.println("Nome do cliente: ");
    novoObj.setNomeCliente(leituraConsole.nextLine());

    novoObj.sacar(200);
    novoObj.imprimir();
    novoObj.depositar(100);
    novoObj.imprimir();

  }
}