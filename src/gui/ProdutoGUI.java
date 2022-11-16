package gui;

import dao.ProdutoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

public class ProdutoGUI extends javax.swing.JFrame {

    public ProdutoGUI() {
        initComponents();
        leiaJTable();
    }

    
    public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();
        modelo.setNumRows(0);
        ProdutoDAO dao = new ProdutoDAO();
        for (Produto produto : dao.leitura()) {
            modelo.addRow(new Object[]{
                produto.getIdRemedio(),
                produto.getNome(),
                produto.getPeso(),
                produto.getReceita(),
                produto.getValor()
            });
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPeso = new javax.swing.JTextField();
        txtReceita = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jbCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        jbAtualizar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peso:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Receita:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtNome.setBackground(new java.awt.Color(0, 153, 153));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 200, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 10));

        txtPeso.setBackground(new java.awt.Color(0, 153, 153));
        txtPeso.setForeground(new java.awt.Color(255, 255, 255));
        txtPeso.setBorder(null);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, -1));

        txtReceita.setBackground(new java.awt.Color(0, 153, 153));
        txtReceita.setForeground(new java.awt.Color(255, 255, 255));
        txtReceita.setBorder(null);
        txtReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceitaActionPerformed(evt);
            }
        });
        jPanel2.add(txtReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 20));

        txtValor.setBackground(new java.awt.Color(0, 153, 153));
        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        txtValor.setBorder(null);
        jPanel2.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 200, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, -1));

        jbCadastrar.setBackground(new java.awt.Color(0, 204, 204));
        jbCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro de Produtos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, -1));

        jbLimpar.setBackground(new java.awt.Color(0, 204, 204));
        jbLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jPanel2.add(jbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 410));

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Remedio", "Nome", "Peso", "Receita", "Valor"
            }
        ));
        jtProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProduto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 530, 250));

        jbAtualizar.setBackground(new java.awt.Color(0, 204, 204));
        jbAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 100, -1));

        jbExcluir.setBackground(new java.awt.Color(0, 204, 204));
        jbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 100, -1));

        jbSair.setBackground(new java.awt.Color(0, 204, 204));
        jbSair.setForeground(new java.awt.Color(255, 255, 255));
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jPanel1.add(jbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceitaActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
       
        Produto produto = new Produto();
        produto.setNome(txtNome.getText());
        produto.setPeso(Double.parseDouble(txtPeso.getText()));
        produto.setReceita(txtReceita.getText());
        produto.setValor(Double.parseDouble(txtValor.getText()));

        if ((txtNome.getText().isEmpty() || txtPeso.getText().isEmpty() || txtReceita.getText().isEmpty() || txtValor.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
        } else {
            ProdutoDAO dao = new ProdutoDAO();
            dao.adiciona(produto);
            JOptionPane.showMessageDialog(null,txtNome.getText() + " inserido com sucesso! ");
        }
        txtNome.setText("");
        txtPeso.setText("");
        txtReceita.setText("");
        txtValor.setText("");
        
        leiaJTable();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        MenuGui mn = new MenuGui();
        mn.setVisible(true);

        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
   txtNome.setText("");
   txtPeso.setText("");
   txtReceita.setText("");
   txtValor.setText("");
   txtNome.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        
        if (jtProduto.getSelectedRow() != -1) {

            Produto produto = new Produto();
            
            produto.setNome(txtNome.getText());
            produto.setPeso(Double.parseDouble(txtPeso.getText()));
            produto.setReceita(txtReceita.getText());
            produto.setValor(Double.parseDouble(txtValor.getText()));
            produto.setIdRemedio((int) jtProduto.getValueAt(jtProduto.getSelectedRow(), 0));

            if ((txtNome.getText().isEmpty() || txtReceita.getText().isEmpty() || txtPeso.getText().isEmpty() || txtValor.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                ProdutoDAO dao = new ProdutoDAO();
                dao.update(produto);
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso! ");
            }

            txtNome.setText("");
            txtPeso.setText("");
            txtValor.setText("");
            txtReceita.setText("");
            
            leiaJTable();
        }
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (jtProduto.getSelectedRow() != -1) {

            Produto produto = new Produto();
            produto.setIdRemedio((int) jtProduto.getValueAt(jtProduto.getSelectedRow(), 0)); 

            if ((txtNome.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                ProdutoDAO dao = new ProdutoDAO();
                dao.delete(produto);
            }

            txtNome.setText("");
            txtPeso.setText("");
            txtValor.setText("");
            txtReceita.setText("");
            txtNome.requestFocus();
            leiaJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutoMouseClicked
        
        if (jtProduto.getSelectedRow() != -1) {
            
            txtNome.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 1).toString());
            txtPeso.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 2).toString());
            txtReceita.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 3).toString());
            txtValor.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 4).toString());
        }
        
    }//GEN-LAST:event_jtProdutoMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtReceita;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
