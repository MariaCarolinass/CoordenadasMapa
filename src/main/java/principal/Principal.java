package principal;

import classe.Coord;
import arquivo.Arquivo;
import bancodedados.Conexao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        Conexao conexao = new Conexao();
        
        String path = "/Z/soarescarol/compartilhado/0294_POT_302_BOA_VISTA_2D.UKOOA.txt";
        Map <String, ArrayList<Coord>> dadosCoord = Arquivo.lerCoord(path);
        // insert into
        conexao.inserirDados("0294-0189", dadosCoord);
        
        conexao.FecharConexao();
        
    }
    
}
