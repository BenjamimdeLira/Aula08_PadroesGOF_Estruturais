package exercicio_5_ABRIR_ARQUIVO;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class IOFacade {

    public static void main(String[] args) throws IOException {
        //arquivo de texto ser� abertp no editor de texto padr�o
        File file = new File("/Users/benjamimdelira/source.txt");
        
        //checando se � suportado
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
        //tentando abrir arquivo bin�rio
        file = new File("/Users/benjamimdelira/java.bin");
        if(file.exists()) desktop.open(file);
    }

}
