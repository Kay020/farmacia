package dao;

import factory.ConnectionFactory;
import modelo.Funcionario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    
    private Connection connection;
    
    int idFuncionario;
    int idPessoa;
    int idRegistro;
    
    
    public FuncionarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario ( idPessoa, idRegistro) VALUES( ?, ?) ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, funcionario.getIdPessoa());
            stmt.setInt(2, funcionario.getIdRegistro());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

 public void update(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET idPessoa  = ?, idRegistro = ? WHERE idFuncionario  = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, funcionario.getIdPessoa());
            stmt.setInt(2, funcionario.getIdRegistro());
            stmt.setInt(3, funcionario.getIdFuncionario());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }

    public void delete(Funcionario funcionario) {
        String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, funcionario.getIdFuncionario());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
        }
    }

    public List<Funcionario> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setIdPessoa(rs.getInt("idPessoa"));
                funcionario.setIdRegistro(rs.getInt("idRegistro"));
                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return funcionarios;
    }    
    
    
    
}
