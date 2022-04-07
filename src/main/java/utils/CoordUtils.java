package utils;

public class CoordUtils {

    public static Double convertLatDMStoDD(String lat) {
        
        // convertendo latitude
        int ponteiro = lat.length();
        
        String tipo = lat.substring(ponteiro - 1, lat.length());
        ponteiro--;
        
        String p3 = lat.substring(ponteiro - 5, ponteiro);
        ponteiro -= 5;
        
        String p2 = lat.substring(ponteiro - 2, ponteiro);
        ponteiro -= 2;
        
        String p1 = lat.substring(0, ponteiro);
        
        // passando string para double
        Double dP1 = Double.parseDouble(p1);
        Double dP2 = Double.parseDouble(p2);
        Double dP3 = Double.parseDouble(p3);

        // calculando latitude
        Double south = dP1 + (dP2 / 60.0) + (dP3 / 3600.0);
        
        if (tipo.equals("S")) {
            south *= -1.0;
        }
        
        return south;
 
    }
    
    public static Double convertLonDMStoDD(String lon) {
    
        // convertendo longitude
        int ponteiro = lon.length();
        
        String tipo = lon.substring(ponteiro - 1, lon.length());
        ponteiro--;
        
        String p3 = lon.substring(ponteiro - 5, ponteiro);
        ponteiro -= 5;
        
        String p2 = lon.substring(ponteiro - 2, ponteiro);
        ponteiro -=2;
        
        String p1 = lon.substring(0, ponteiro);
        
        // passando string para double
        Double dP1 = Double.parseDouble(p1);
        Double dP2 = Double.parseDouble(p2);
        Double dP3 = Double.parseDouble(p3);
        
        // calculando longitude
        Double west = dP1 + (dP2 / 60.0) + (dP3 / 3600.0);
        
        if (tipo.equals("W")) {
            west *= (-1.0);
        }
        
        return west;
        
    }
    
}
