package mensagem;

import java.time.LocalDateTime;

public class Mensagem {

    public static String retornamensagem(){

        var hora = LocalDateTime.now();

        if(hora.getHour() < 12) {
            return "Bom dia!";
        }
        else if (hora.getHour() < 18){
            return "Boa tarde!";
        }
        else{
            return "Boa noite!";
        }
    }

}
