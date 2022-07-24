package areaQuadrilatero;

public class AreaQuadrilatero {

    public static int calculaArea(int lado){
        return lado * lado;
    }

    public static int calculaArea(int base, int altura){
        return base * altura;
    }

    public static float calculaArea(int baseMaior, int baseMenor, int altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }

}
