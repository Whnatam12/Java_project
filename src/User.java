public class User {
      String nome;
      String cpf;
      String email;


    public User(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
       
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
  


    @Override
    public String toString() {
        return nome + " (" + email + ")";
    }
}
