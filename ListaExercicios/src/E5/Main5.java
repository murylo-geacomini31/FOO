package E5;
public class Main5 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João";
        funcionario.idade = 16;
        funcionario.email = "joao@email.com";

        funcionario.salario = 1500.00;
        funcionario.cargo = "Auxiliar";
        funcionario.departamento = "Administrativo";

        if (funcionario.idade <= 16) {
            funcionario.aprendiz = true;
        } else {
            funcionario.aprendiz = false;
        }

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Email: " + funcionario.email);
        System.out.println("Salário: R$ " + funcionario.salario);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Departamento: " + funcionario.departamento);
        System.out.println("É aprendiz? " + funcionario.aprendiz);
    }
}