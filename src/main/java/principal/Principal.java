package principal;

import coordenada.Coord;
import arquivos.Arquivo;
import arquivos.Kml;
import bancodedados.Conexao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class Principal {

    public static void main(String[] args) throws IOException, SQLException {
        
        // nova conexão
        Conexao conexao = new Conexao();
        
        // passando arquivo para método de leitura
        String path = "/Z/soarescarol/compartilhado/0294_POT_302_BOA_VISTA_2D.UKOOA.txt";
        Map <String, ArrayList<Coord>> dadosCoord = Arquivo.lerCoord(path);
        
        conexao.inserirDados("0294-0181", null);
        
//        // métodos
//        Kml.exportKml("0294-0181", dadosCoord);
//        Kml.exportKml("0294-0182", dadosCoord);
//        Kml.exportKml("0294-0183", dadosCoord);
//        Kml.exportKml("0294-0184", dadosCoord);
        
        conexao.FecharConexao();
        
    }
    
}
