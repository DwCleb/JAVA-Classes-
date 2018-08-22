class Arquivo {
  String nome;
  String extensao;
  double tamanho;

  // questão A
  Arquivo(String nome, String extensao, double tamanho) {
    this.nome = nome;
    this.extensao = extensao;
    this.tamanho = tamanho;
  }
  //./

  // questão B
  public String toString() {
    return nome + "." + extensao + " " + tamanho;
  }
  //./
  // questão C
  public double getTamanho() {
    return tamanho;
  }
  //./

}

