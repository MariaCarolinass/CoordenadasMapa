package coordenadas;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter @Setter 
@NoArgsConstructor @AllArgsConstructor

public class Coord {
    
    private String nome;
    private String lat;
    private String lon;
    private Double x;
    private Double y;
    private Double z;
    private Integer stn;
    
}
