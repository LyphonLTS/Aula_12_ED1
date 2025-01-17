package Controller;

import java.util.ArrayList;
import java.util.Random;

public class Josephus {
  public Pessoa girarRoda(int numPessoas, int max) {
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    int sorteado = 0;

    for (int i = 0; i < numPessoas; i++) {
      pessoas.add(criarPessoa(i + 1, numPessoas));
    }

    for (int i = pessoas.size(); 1 < i; i--) {
      sorteado = ((sorteado + max) - 1) % pessoas.size();

      pessoas.remove(sorteado);
    }

    return pessoas.getFirst();
  }

  private int getRandom(int max) {
    return new Random().nextInt(max);
  }

  private Pessoa criarPessoa(int posicao, int numPessoas) {
    String CPF = "";
    String phone = "";

    for (int i = 0; i < 11; i++) {
      switch (i) {
        case 3:
        case 6:
          CPF += ".";
          break;

        case 9:
          CPF += "-";
          break;

      }

      CPF += getRandom(9);
    }

    for (int i = 0; i < 8; i++) {
      if (i == 4) {
        phone += "-";
      }

      phone += getRandom(9);
    }

    return new Pessoa("Pessoa_" + posicao, posicao, "(" + getRandom(90) + ") 9 " + phone,
        "Rua " + getRandom(numPessoas),
        CPF);
  }
}
