public class Aluno {
    private String nome;
    private int idade;
    private int Ra;
    private int[] notas = new int[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRa() {
        return Ra;
    }

    public void setRa(int ra) {
        Ra = ra;
    }

    public int getNotas(int indice) {
        return notas[indice];
    }

    public void setNotas(int nota, int indice) {
        notas[indice] = nota;
    }

    //public void setPreco(double valor, int indice){
    //    preco[indice] = valor;
    //}


    public Aluno(String nome, int idade, int ra, int[] notas){
    this.nome = nome;
    this.idade = idade;
    this.Ra = ra;
    this.notas = notas;
    }
}
