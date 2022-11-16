package gui;

import dao.PessoaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pessoa;

public class PessoaGUI extends javax.swing.JFrame {

    public PessoaGUI() {
        initComponents();
        leiaJTable();
    }
      public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtPessoa.getModel();
        modelo.setNumRows(0);
        PessoaDAO dao = new PessoaDAO();
        for (Pessoa pessoa : dao.leitura()) {
            modelo.addRow(new Object[]{
                pessoa.getIdPessoa(),
                pessoa.getCpf(),
                pessoa.getNome(),
                pessoa.getEnd(),
                pessoa.getTelefone(),
            });
        }
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jbLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPessoa = new javax.swing.JTable();
        jbAtualizar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro de Pessoas");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 218, -1));

        txtCpf.setBackground(new java.awt.Color(0, 153, 153));
        txtCpf.setForeground(new java.awt.Color(255, 255, 255));
        txtCpf.setBorder(null);
        jPanel2.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 180, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cpf:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtNome.setBackground(new java.awt.Color(0, 153, 153));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, -1));

        txtEnd.setBackground(new java.awt.Color(0, 153, 153));
        txtEnd.setForeground(new java.awt.Color(255, 255, 255));
        txtEnd.setBorder(null);
        jPanel2.add(txtEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, -1));

        txtTelefone.setBackground(new java.awt.Color(0, 153, 153));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(null);
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, -1));

        btnCadastrar.setBackground(new java.awt.Color(0, 204, 204));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, -1));

        jbLimpar.setBackground(new java.awt.Color(0, 204, 204));
        jbLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jPanel2.add(jbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 440));

        jtPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pessoa", "CPF", "Nome", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPessoa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 460, 250));

        jbAtualizar.setBackground(new java.awt.Color(0, 204, 204));
        jbAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 100, -1));

        jbExcluir.setBackground(new java.awt.Color(0, 204, 204));
        jbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 100, -1));

        jbSair.setBackground(new java.awt.Color(0, 204, 204));
        jbSair.setForeground(new java.awt.Color(255, 255, 255));
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jPanel1.add(jbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
      
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(txtNome.getText());
        pessoa.setEnd(txtEnd.getText());
        pessoa.setTelefone(txtTelefone.getText());
        pessoa.setCpf(txtCpf.getText());

        if ((txtEnd.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtNome.getText().isEmpty() || txtCpf.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
        } else {
            PessoaDAO dao = new PessoaDAO();
            dao.adiciona(pessoa);
            JOptionPane.showMessageDialog(null,txtNome.getText() + " inserido com sucesso! ");
        }
        txtNome.setText("");
        txtCpf.setText("");
        txtEnd.setText("");
        txtTelefone.setText("");

        leiaJTable();
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        MenuGui mn = new MenuGui();
        mn.setVisible(true);

        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
       txtCpf.setText("");
       txtNome.setText("");
       txtEnd.setText("");
       txtTelefone.setText("");
       txtCpf.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed

        if (jtPessoa.getSelectedRow() != -1) {

            Pessoa pessoa = new Pessoa();
            
            pessoa.setNome(txtNome.getText());
            pessoa.setCpf(txtCpf.getText());
            pessoa.setNome(txtNome.getText());
            pessoa.setEnd(txtEnd.getText());
            pessoa.setTelefone(txtTelefone.getText());
            pessoa.setIdPessoa((int) jtPessoa.getValueAt(jtPessoa.getSelectedRow(), 0));

            if ((txtCpf.getText().isEmpty() || txtNome.getText().isEmpty() || txtEnd.getText().isEmpty() || txtTelefone.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                PessoaDAO dao = new PessoaDAO();
                dao.update(pessoa);
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso! ");
            }

            txtCpf.setText("");
            txtNome.setText("");
            txtEnd.setText("");
            txtTelefone.setText("");
            
            leiaJTable();
        }
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jtPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPessoaMouseClicked
       
        if (jtPessoa.getSelectedRow() != -1) {
            
            txtCpf.setText(jtPessoa.getValueAt(jtPessoa.getSelectedRow(), 1).toString());
            txtNome.setText(jtPessoa.getValueAt(jtPessoa.getSelectedRow(), 2).toString());
            txtEnd.setText(jtPessoa.getValueAt(jtPessoa.getSelectedRow(), 3).toString());
            txtTelefone.setText(jtPessoa.getValueAt(jtPessoa.getSelectedRow(), 4).toString());
        }
        
    }//GEN-LAST:event_jtPessoaMouseClicked

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       
        if (jtPessoa.getSelectedRow() != -1) {

            Pessoa pessoa = new Pessoa();
            pessoa.setIdPessoa((int) jtPessoa.getValueAt(jtPessoa.getSelectedRow(), 0)); 

            if ((txtNome.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                PessoaDAO dao = new PessoaDAO();
                dao.delete(pessoa);
            }

            txtNome.setText("");
            txtCpf.setText("");
            txtEnd.setText("");
            txtTelefone.setText("");
            
            leiaJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PessoaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JTable jtPessoa;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
