package arquivos;

import utils.CoordUtils;
import coordenadas.Coord;
import java.util.ArrayList;
import java.util.Map;

public class Kml {
    
    public static void exportKml(String nome, Map<String, ArrayList<Coord>> dadosCoord ) {
        
        ArrayList<Coord> listaCoord = dadosCoord.get(nome);
        
        // construindo documento kml
        StringBuilder builder = new StringBuilder();

        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        builder.append("<kml xmlns=\"http://www.opengis.net/kml/2.2\">\n");
        builder.append("<Document>\n");
        builder.append("<name>Coordenadas</name>\n");
        
        builder.append("<Placemark>\n");
        builder.append("<LineString>\n");
        builder.append("<coordinates>\n");
        
        // passando as coordenadas latitude e longitude
        for (Coord coordenadas: listaCoord) {
        
            builder.append(CoordUtils.convertLonDMStoDD(coordenadas.getLon()) +
                ","+CoordUtils.convertLatDMStoDD(coordenadas.getLat())+",0");
            builder.append("\n");
    
        }
    
        builder.append("</coordinates>\n");
        builder.append("</LineString>\n");
        builder.append("</Placemark>\n");
        builder.append("</Document>\n");
        builder.append("</kml>\n");
        
        System.out.println("Arquivo kml construido!");
        //System.out.println(builder.toString());
        
    }
    
}
