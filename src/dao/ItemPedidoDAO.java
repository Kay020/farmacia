package dao;

import factory.ConnectionFactory;
import modelo.ItemPedido;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ItemPedidoDAO {
    
    private Connection connection;
    int idItem;
    int idPagamento;
    int idPessoa;
    int idRemedio;
    String produto;
    int quant;
    
    public ItemPedidoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(ItemPedido itempedido) {
        String sql = "INSERT INTO itempedido (idPagamento, idPessoa, idRemedio, produto, quant ) VALUES( ?, ?, ?, ?, ?) ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt (1, itempedido.getIdPagamento());
            stmt.setInt (2, itempedido.getIdPessoa());
            stmt.setInt (3, itempedido.getIdRemedio());
            stmt.setString(4, itempedido.getProduto());
            stmt.setInt(5, itempedido.getQuant());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }
    
    public void update(ItemPedido it) {
        String sql = "UPDATE itempedido SET idPagamento  = ?, idPessoa = ?, idRemedio = ?, produto = ?, quant = ? WHERE idItem  = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, it.getIdPagamento());
            stmt.setInt(2, it.getIdPessoa());
            stmt.setInt(3, it.getIdRemedio());
            stmt.setString(4, it.getProduto());
            stmt.setInt(5, it.getQuant());
            stmt.setInt(6, it.getIdItem());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }

    public void delete(ItemPedido it) {
        String sql = "DELETE FROM itempedido WHERE idItem = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, it.getIdItem());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
        }
    }

    public List<ItemPedido> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ItemPedido> ip = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM itempedido");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ItemPedido item = new ItemPedido();
                item.setIdItem(rs.getInt("idItem"));
                item.setIdPagamento(rs.getInt("idPagamento"));
                item.setIdPessoa(rs.getInt("idPessoa"));
                item.setIdRemedio(rs.getInt("idRemedio"));
                item.setProduto(rs.getString("produto"));
                item.setQuant(rs.getInt("quant"));
                ip.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemPedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ip;
    }    
    
    
    
    
}

