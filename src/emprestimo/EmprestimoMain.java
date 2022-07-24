package emprestimo;

public class EmprestimoMain {

    public static void main(String[] args) {

        var valorEmprestimo = 8000.0F;
        var valorTaxa = Emprestimo.retornaValorTaxa(valorEmprestimo);

        System.out.println("A taxa para empréstimo de " + valorEmprestimo + " é "
                + valorTaxa*10 + "% e o valor final é " +  (valorEmprestimo * (1+valorTaxa)));
    }
}
