import java.util.Scanner;

import Controller.Josephus;
import Controller.Pessoa;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Josephus sorteador = new Josephus();

    System.out.println("Bem vindo ao sorteador de pessoas!");
    System.out.print("Por favor, digite o número de participantes: ");
    int numPessoas = Integer.parseInt(scanner.nextLine());
    System.out.print("Agora digite um número maior que 0: ");
    int val = Integer.parseInt(scanner.nextLine());

    Pessoa sorteado = sorteador.girarRoda(numPessoas, val);

    System.out.println("O sorteado foi o:" + sorteado.toString());
    System.out.println("O número é: " + sorteado.getNum());

    scanner.close();
  }
}