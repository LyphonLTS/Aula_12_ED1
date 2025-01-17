package Controller;

public class Pessoa {
  private String name;
  private int num;
  private String phone;
  private String end;
  private String CPF;

  public Pessoa(String name, int num, String phone, String end, String CPF) {
    this.CPF = CPF;
    this.end = end;
    this.name = name;
    this.num = num;
    this.phone = phone;
  }

  public String getCPF() {
    return this.CPF;
  }

  public String getEnd() {
    return this.end;
  }

  public String getName() {
    return this.name;
  }

  public int getNum() {
    return this.num;
  }

  public String getPhone() {
    return this.phone;
  }

  @Override
  public String toString() {
    return "\nNome: " + this.name + "\nCPF: " + this.CPF + "\nTelefone: " + this.phone + "\nEndereço: " + this.end;
  }
}
