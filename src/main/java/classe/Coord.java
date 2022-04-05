package classe;

public class Coord {
    
    private String nome;
    private String lat;
    private String lon;
    private Double x;
    private Double y;
    private Double z;
    private Integer stn;
    private Integer id_sismica2d;
    
    public Coord(String nome, String lat, String lon, Double x, Double y, 
            Double z, Integer stn, Integer id_sismica2d) {
        this.nome = nome;
        this.lat = lat;
        this.lon = lon;
        this.x = x;
        this.y = y;
        this.z = z;
        this.stn = stn;
        this.id_sismica2d = id_sismica2d;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Integer getStn() {
        return stn;
    }

    public void setStn(Integer stn) {
        this.stn = stn;
    }

    public Integer getId_sismica2d() {
        return id_sismica2d;
    }

    public void setId_sismica2d(Integer id_sismica2d) {
        this.id_sismica2d = id_sismica2d;
    }
    
}
