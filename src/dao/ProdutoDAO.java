package dao;

import factory.ConnectionFactory;
import modelo.Produto;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    private Connection connection;
    
    int idRemedio;
    String nome;
    double peso;
    String receita;
    double valor;
    
    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Produto produto) {
        String sql = "INSERT INTO produto ( nome, peso, receita, valor) VALUES( ?, ?, ?, ?) ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPeso());
            stmt.setString(3, produto.getReceita());
            stmt.setDouble(4, produto.getValor());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }   

    public void update(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, peso = ?, receita = ?, valor = ? WHERE idRemedio  = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPeso());
            stmt.setString(3, produto.getReceita());
            stmt.setDouble(4, produto.getValor());
            stmt.setInt(5, produto.getIdRemedio());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }

    public void delete(Produto produto) {
        String sql = "DELETE FROM produto WHERE idRemedio = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produto.getIdRemedio());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
        }
    }

    public List<Produto> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdRemedio(rs.getInt("idRemedio"));
                produto.setNome(rs.getString("nome"));
                produto.setPeso(rs.getDouble("peso"));
                produto.setReceita(rs.getString("receita"));
                produto.setValor(rs.getDouble("valor"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }


    
    
}
