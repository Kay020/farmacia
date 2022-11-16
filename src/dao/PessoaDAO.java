package dao;

import factory.ConnectionFactory;
import modelo.Pessoa;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PessoaDAO {
    
    private Connection connection;
    
    String cpf;
    String nome;
    String end;
    String telefone;
    
    public PessoaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa ( nome, end, telefone, cpf) VALUES( ?, ?, ?, ?) ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEnd());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getCpf());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }
    
    public void update(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET nome = ?, end = ?, telefone = ?, cpf = ? WHERE idPessoa  = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEnd());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getCpf());
            stmt.setInt(5, pessoa.getIdPessoa());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }

    public void delete(Pessoa pessoa) {
        String sql = "DELETE FROM pessoa WHERE idPessoa = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pessoa.getIdPessoa());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
        }
    }

    public List<Pessoa> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM pessoa");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("idPessoa"));
                pessoa.setCpf(rs.getString("Cpf"));
                pessoa.setNome(rs.getString("Nome"));
                pessoa.setEnd(rs.getString("End"));
                pessoa.setTelefone(rs.getString("Telefone"));
                pessoas.add(pessoa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoas;
    }


    
    
    
    
}
