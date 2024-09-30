public class h01 {
    public static void main(String[] args) {

    PessoaFisica pessoaFisica1 = new PessoaFisica("João Frango", "123.456.789-00", "Rua A, 123", "joao@email.com");
    PessoaFisica pessoaFisica2 = new PessoaFisica("Maria Joaquina", "987.654.321-00", "Av. B, 456", "maria@email.com");

// Criando objetos para pessoa jurídica
    PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa A", "12.345.678/0001-99", "Rua C, 789", "contato@empresax.com");
    PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Empresa B", "98.765.432/0001-00", "Av. D, 321", "contato@empresay.com");

// Criando objetos para funcionário
    Funcionario funcionario1 = new Funcionario("Donald Trump", "123.456.789-11", "Rua E, 111", 3000.00);
    Funcionario funcionario2 = new Funcionario("Vladimir Putin", "987.654.321-22", "Av. F, 222", 4500.00);

// Printando os objetos
    System.out.println(pessoaFisica1);
    System.out.println(pessoaFisica2);
    System.out.println(pessoaJuridica1);
    System.out.println(pessoaJuridica2);
    System.out.println(funcionario1);
    System.out.println(funcionario2);


    }
}

// Criando a classe pessoa
    class Pessoa {

    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {

        this.nome = nome;
        this.endereco = endereco;

    }

    public String toString() {

    return "Nome: " + nome + ", Endereço: " + endereco;

    }
}

//Criando a classe pessoa fisica, para adicionar com a classe pessoa
    class PessoaFisica extends Pessoa {

    private String cpf;
    private String email;

    public PessoaFisica (String nome, String endereco, String cpf, String email) {

    super(nome, endereco);
    this.cpf = cpf;
    this.email = email;

    }

    @Override
    public String toString() {

    return "Pessoa fisica: " + super.toString() + ", CPF: " + cpf + ", Email: " + email;

    }
}

//Criando a classe pessoa juridica, para adicionar a classe pessoa
    class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String email;

    public PessoaJuridica (String nome, String cnpj, String endereco, String email) {

    super(nome, endereco);
    this.cnpj = cnpj;
    this.email = email;

    }

    @Override
    public String toString() {

    return "Pessoa jurídica: " + super.toString() + ", Cnpj: " + cnpj + ", Email: " + email;

    }
}

//Criando a classe funcionario, para adicionar a classe pessoa
    class Funcionario extends Pessoa {

    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, double salario) {

    super(nome, endereco);
    this.cpf = cpf;
    this.salario = salario;

    }

    @Override
    public String toString() {

    return "Funcionario: " + super.toString() + ", Cpf: " + cpf + ", Salario: R$ " + String.format("%.2f", salario);

    }

}


