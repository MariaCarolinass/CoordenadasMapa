package bancodedados;

import coordenadas.Coord;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class Conexao {

    private String url;
    private String usuario;
    private String senha;
    private Connection conexao;

    // abrir conexão
    public Conexao() {

        url = "jdbc:postgresql://localhost:15432/coordenadas";
        usuario = "postgres";
        senha = "1234";

        try {

            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão do banco realizada!\n");
            
        } catch (Exception e) {
            System.out.println("Erro de conexão com o banco!");
            e.printStackTrace();
        }

    }

    // fechar conexão
    public void FecharConexao() {

        try {

            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão com o banco!");
            e.printStackTrace();
        }

    }

    // inserir os dados no banco
    public void inserirDados(String nome, 
            Map<String, ArrayList<Coord>> dadosCoord) throws SQLException {

        try {
            
            Statement stm = conexao.createStatement();
            
            ArrayList<Coord> listaCoord = dadosCoord.get(nome);
            
            // chamando método para buscar id (tabela, atributo, valor)
            int id_sismica2d = buscarID("sismica2d", "nome", nome);
            
            // inserindo os dados de sismica2d, caso id não exista
            if (id_sismica2d <= 0) {
                        
                stm.executeUpdate("INSERT INTO sismica2d (nome) values "
                    + "('" + nome + "')");
                id_sismica2d = buscarID("sismica2d", "nome", nome);
                
            }
            
            // inserirndo os dados de coord
            if (listaCoord != null) {
             
                for (Coord coord : listaCoord) {

                    stm.executeUpdate("INSERT INTO coord ("
                        + "lat, lon, x, y, z, stn, id_sismica2d) "
                        + "values ( '" + coord.getLat() + "', '"
                        + coord.getLon() + "', " + coord.getX() + ", "
                        + coord.getY() + ", " + coord.getZ() + ", "
                        + coord.getStn() + ", " + id_sismica2d + ")");
                    
                }
            
                System.out.println("Dados cadastrados no banco de dados!"); 
                
            } else {
                System.out.println("Linha " + nome + " não encntrada!");
            }
               
        } catch (SQLException e) {
            System.out.println("Erro ao inserir os dados!");
            e.printStackTrace();
        }
    
    }

    // buscar id (select)
    public int buscarID(String tabela, String coluna, String valor) 
            throws SQLException {

        try {
           
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM " + tabela + 
                " WHERE " + coluna + " = '" + valor + "'");
            
            // se a consulta for diferente de nulo, o id é retornado
            if (rs != null && rs.next()) {
                return rs.getInt("id");
            }

        }
        
        catch (SQLException e) {
            System.out.println("Erro ao buscar por id!");
            e.printStackTrace();
        }
        
        return -1;

    }
    
    // atualizar id
    public int atualizarID(String id, String tabela, String coluna, 
            String valor) throws SQLException {
        
        try {
            
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery("UPDATE" + tabela + "SET" + 
                coluna + " = '" + "WHERE" + id + " = '" + valor + "'");
            
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar id!");
            e.printStackTrace();
        }
        
        return 0;
        
    }
    
    // deletar id
    public int deletarID(String tabela, String coluna, String valor) 
            throws SQLException {
    
        try {
            
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery("DELETE * FROM "+ tabela + 
                    "WHERE" + coluna + " = '" + valor + "'");
            
        } catch (SQLException e) {
            System.out.println("Erro ao deletar id!");
            e.printStackTrace();
        }
        
        return 0;
        
    }

}
