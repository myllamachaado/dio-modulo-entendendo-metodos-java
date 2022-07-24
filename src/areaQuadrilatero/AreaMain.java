package areaQuadrilatero;

public class AreaMain {

    public static void main(String[] args) {

        var quadrado = AreaQuadrilatero.calculaArea(4);
        var retangulo = AreaQuadrilatero.calculaArea(4, 8);
        var trapezio = AreaQuadrilatero.calculaArea(10, 4, 8);

        System.out.println("A área do quadrado é: " + quadrado);
        System.out.println("A área do retângulo é: " + retangulo);
        System.out.println("A área do trapézio é: " + trapezio);

    }

}
