package arquivos;

import coordenadas.Coord;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Arquivo {
    
    public static Map<String, ArrayList<Coord>> lerCoord(String path) throws IOException {
        
        Map <String, ArrayList<Coord>> dadosCoord = new HashMap<>();
        
        try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            
            String linha = "";
            
            while ((linha = buffRead.readLine()) != null) {
                
                if (!linha.startsWith("H")) {
                    
                    String nome = linha.substring(1, 13).trim(); 
                    String lat = linha.substring(25, 35).trim();
                    String lon = linha.substring(35, 46).trim();
                    Double x = Double.parseDouble(linha.substring(46, 55).trim());
                    Double y = Double.parseDouble(linha.substring(55, 64).trim());
                    Double z = Double.parseDouble(linha.substring(64, 70).trim());
                    Integer stn = Integer.parseInt(linha.substring(19, 25).trim());
                    
                    ArrayList <Coord> listaCoord = dadosCoord.get(nome);
                    
                    if (listaCoord == null) {
                        listaCoord = new ArrayList<>();
                        dadosCoord.put(nome, listaCoord);
                    } 
                    
                    listaCoord.add(new Coord(nome, lat, lon, x, y, z, stn));
                    
                }
            
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo!");
            e.printStackTrace();
        }
        
        return dadosCoord;
        
    }

}