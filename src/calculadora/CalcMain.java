package calculadora;

public class CalcMain {

    public static void main(String[] args) {

        var n1 = 10;
        var n2 = 7;
        var calc = new Calculadora();

        var soma = calc.soma(n1, n2);
        var subrtracao = calc.subtracao(n1, n2);
        var multiplicacao = calc.multiplicacao(n1, n2);
        var divisao = calc.divisao(n1, n2);

        System.out.println("soma: " + soma);
        System.out.println("subrtração: " + subrtracao);
        System.out.println("multiplicação: " + multiplicacao);
        System.out.println("divisão: " + divisao);
    }

}
