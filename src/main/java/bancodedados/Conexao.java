package bancodedados;

import classe.Coord;
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
            System.out.println("Conexão realizada!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // fechar conexão
    public void FecharConexao() {

        try {

            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    // inserir os dados no banco
    public void inserirDados(String nome, Map<String, ArrayList<Coord>> dadosCoord) {

        try {

            Statement stm = conexao.createStatement();
            
            // método de buscar id
            // (tabela, atributo, valor)
            int id_sismica2d = buscarID("sismica2d", "nome", nome);
            
            ArrayList<Coord> listaCoord = dadosCoord.get(nome);
            
            if (listaCoord == null) {
                System.out.println("Linha " + nome + " não encntrada!");
                return;
            }
            
            // o id não existe, então inserir um novo dado
            if (id_sismica2d <= 0) {
                String sqlSismica = "INSERT INTO sismica2d (nome)"
                        + " values ('" + nome + "')";
                        
                stm.executeUpdate(sqlSismica);
                id_sismica2d = buscarID("sismica2d", "nome", nome);
            }
            
            // salvando os dados da tabela coord junto a chave de referência
            for (Coord coord : listaCoord) {
                
                String sqlCoord = "INSERT INTO coord ("
                        + "lat, lon, x, y, z, stn, id_sismica2d) "
                        + "values ( '" + coord.getLat() + "', '" + coord.getLon() + "', "
                        + coord.getX() + ", " + coord.getY() + ", "
                        + coord.getZ() + ", " + coord.getStn() + ", "
                        + id_sismica2d + ")";

                stm.executeUpdate(sqlCoord);
                
            }

            System.out.println("Dados cadastrados no banco de dados!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // buscar id (select)
    public int buscarID(String tabela, String coluna, String valor) {

        try {
            
            String sql = "SELECT * FROM " + tabela + " WHERE " + coluna +
                    " = '" + valor + "'";

            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            // se o id da consulta for diferente de nulo (id precisa ser > 0)
            // retorna (adiciona) o valor do id na tabela
            if (rs != null && rs.next()) {
                return rs.getInt("id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // id inválido (id < 0)
        return -1;

    }
    
    // atualizar id
    public void atualizarID(String id, String tabela, String coluna, 
            String valor) {
        
        try {
            
            String sql = "UPDATE" + tabela + "SET" + coluna + 
                    " = '" + "WHERE" + id + " = '" + valor + "'";
            
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    // deletar id
    public void deletarID(String tabela, String coluna, String valor) {
    
        try {
            
            String sql = "DELETE * FROM "+ tabela + "WHERE" + coluna + 
                    " = '" + valor + "'";
            
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

}
