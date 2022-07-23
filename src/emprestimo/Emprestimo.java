package emprestimo;

public class Emprestimo {

    public float retornaValorTaxa(float valorEmprestimo){

        if(valorEmprestimo < 10000){
            return retornaDoisPorCentoDeTaxa();
        }
        else if((valorEmprestimo >= 10000)&&(valorEmprestimo < 50000)){
            return retornaCincoPorCentoDeTaxa();
        }
        else if((valorEmprestimo >= 50000)&&(valorEmprestimo <= 250000)){
            return retornaOitoPorCentoDeTaxa();
        }
        else{
            return retornaDezPorCentoDeTaxa();
        }
    }

    public float retornaDoisPorCentoDeTaxa(){
        return 0.02F;
    }

    public float retornaCincoPorCentoDeTaxa(){
        return 0.05F;
    }

    public float retornaOitoPorCentoDeTaxa(){
        return 0.08F;
    }

    public float retornaDezPorCentoDeTaxa(){
        return 0.10F;
    }

}
