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