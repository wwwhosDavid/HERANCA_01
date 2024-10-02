//Criando a classe pessoa juridica, para adicionar a classe pessoa
class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String email;

    public PessoaJuridica (String nome, String cnpj, String endereco, String email) {

    super(nome, endereco);
    this.cnpj = cnpj;
    this.email = email;

    }

    public String toString() {

    return "Pessoa jurídica: " + super.toString() + ", Cnpj: " + cnpj + ", Email: " + email;

    }
}