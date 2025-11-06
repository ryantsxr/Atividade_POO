package atividades;

public class contato {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    public contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = "";
        this.endereco = "";
    }

    public contato(String nome, String telefone, String email, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
               "\nTelefone: " + telefone + 
               (email.isEmpty() ? "" : "\nEmail: " + email) +
               (endereco.isEmpty() ? "" : "\nEndereço: " + endereco);
    }
}
