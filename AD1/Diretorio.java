class Diretorio {
  String nome;
  String arquivos[];
  String diretorios[];

  // questão E
  Diretorio(String nome, String arquivos[], String diretorios[]) {
    this.nome = nome;
    this.arquivos = arquivos;
    this.diretorios = diretorios;
  }
  //./
  // questao F
  public String toString() {
    return nome + "." + arquivos + " " + diretorios;
  }
  //./
}