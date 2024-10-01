public class Main {
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
