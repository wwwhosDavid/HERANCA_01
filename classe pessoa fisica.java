//Criando a classe pessoa fisica, para adicionar com a classe pessoa
class PessoaFisica extends Pessoa {

    private String cpf;
    private String email;

    public PessoaFisica (String nome, String endereco, String cpf, String email) {

    super(nome, endereco);
    this.cpf = cpf;
    this.email = email;

    }

    public String toString() {

    return "Pessoa fisica: " + super.toString() + ", CPF: " + cpf + ", Email: " + email;

    }
}