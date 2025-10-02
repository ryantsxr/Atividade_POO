public class canal {
    private int numero;
    private String nome;

    public canal(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }   
    public int getNumero() {
        return numero;
    }
    public String getNome() {
        return nome;
    }
    public String toString() {
        return "Canal " + numero + ": " + nome;
    }



}
