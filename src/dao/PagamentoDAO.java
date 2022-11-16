package dao;

import factory.ConnectionFactory;
import modelo.Pagamento;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PagamentoDAO {
    
    private Connection connection;
    
    int idPagamento;
    String formaPag;
    
    public PagamentoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Pagamento pagamento) {
        String sql = "INSERT INTO pagamento ( formaPagamento ) VALUES( ? ) ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pagamento.getFormaPag());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }
    
    public void update(Pagamento pagamento) {
        String sql = "UPDATE pagamento SET formaPagamento = ? WHERE idPagamento  = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pagamento.getFormaPag());
            stmt.setInt(2, pagamento.getIdPagamento());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }

    public void delete(Pagamento pagamento) {
        String sql = "DELETE FROM pagamento WHERE idPagamento = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pagamento.getIdPagamento());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
        }
    }

    public List<Pagamento> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Pagamento> pagamentos = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM pagamento");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setIdPagamento(rs.getInt("idPagamento"));
                pagamento.setFormaPag(rs.getString("formaPagamento"));
                pagamentos.add(pagamento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pagamentos;
    }
    
    
    
    
}
