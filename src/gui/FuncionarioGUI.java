package gui;

import dao.FuncionarioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Funcionario;

public class FuncionarioGUI extends javax.swing.JFrame {

    public FuncionarioGUI() {
        initComponents();
        leiaJTable();
    }
    
    public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtFuncionarios.getModel();
        modelo.setNumRows(0);
        FuncionarioDAO dao = new FuncionarioDAO();
        for (Funcionario funcionario : dao.leitura()) {
            modelo.addRow(new Object[]{
                funcionario.getIdFuncionario(),
                funcionario.getIdPessoa(),
                funcionario.getIdRegistro(),
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txfIdPessoa = new javax.swing.JTextField();
        txfIdRegistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFuncionarios = new javax.swing.JTable();
        jbAtualizar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfIdPessoa.setBackground(new java.awt.Color(0, 153, 153));
        txfIdPessoa.setForeground(new java.awt.Color(255, 255, 255));
        txfIdPessoa.setBorder(null);
        jPanel1.add(txfIdPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, -1));

        txfIdRegistro.setBackground(new java.awt.Color(0, 153, 153));
        txfIdRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txfIdRegistro.setBorder(null);
        jPanel1.add(txfIdRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IdPessoa:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IdRegistro:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de funcionários");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        jbCadastrar.setBackground(new java.awt.Color(0, 204, 204));
        jbCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jtFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Funcionario", "ID Pessoa", "ID Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtFuncionarios);

        jbAtualizar.setBackground(new java.awt.Color(0, 204, 204));
        jbAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jbExcluir.setBackground(new java.awt.Color(0, 204, 204));
        jbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSair.setBackground(new java.awt.Color(0, 204, 204));
        jbSair.setForeground(new java.awt.Color(255, 255, 255));
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSair))
                .addGap(56, 56, 56))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 470, 400));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, -1));

        jbLimpar.setBackground(new java.awt.Color(0, 204, 204));
        jbLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
          
        Funcionario funcionario = new Funcionario();
        funcionario.setIdPessoa(Integer.parseInt(txfIdPessoa.getText()));
        funcionario.setIdRegistro(Integer.parseInt(txfIdRegistro.getText()));
     

        if ((txfIdPessoa.getText().isEmpty() || txfIdRegistro.getText().isEmpty() )) {
            JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
        } else {
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.adiciona(funcionario);
            JOptionPane.showMessageDialog(null,"Funcionário inserido com sucesso! ");
        }
        txfIdPessoa.setText("");
        txfIdRegistro.setText("");
        txfIdPessoa.requestFocus();
        
        leiaJTable();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        txfIdPessoa.setText("");
        txfIdRegistro.setText("");
        txfIdPessoa.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        
        if (jtFuncionarios.getSelectedRow() != -1) {

            Funcionario funcionario = new Funcionario();
            
            funcionario.setIdPessoa(Integer.parseInt(txfIdPessoa.getText()));
            funcionario.setIdRegistro(Integer.parseInt(txfIdRegistro.getText()));
            funcionario.setIdFuncionario((int) jtFuncionarios.getValueAt(jtFuncionarios.getSelectedRow(), 0));

            if ((txfIdPessoa.getText().isEmpty() || txfIdRegistro.getText().isEmpty() )) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                FuncionarioDAO dao = new FuncionarioDAO();
                dao.update(funcionario);
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso! ");
            }

            txfIdPessoa.setText("");
            txfIdRegistro.setText("");
            txfIdPessoa.requestFocus();
            
            leiaJTable();
        }
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        if (jtFuncionarios.getSelectedRow() != -1) {

            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario((int) jtFuncionarios.getValueAt(jtFuncionarios.getSelectedRow(), 0)); 

            if ((txfIdPessoa.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                FuncionarioDAO dao = new FuncionarioDAO();
                dao.delete(funcionario);
            }

            txfIdPessoa.setText("");
            txfIdRegistro.setText("");
            txfIdPessoa.requestFocus();
            leiaJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFuncionariosMouseClicked
        if (jtFuncionarios.getSelectedRow() != -1) {
            
            txfIdPessoa.setText(jtFuncionarios.getValueAt(jtFuncionarios.getSelectedRow(), 1).toString());
            txfIdRegistro.setText(jtFuncionarios.getValueAt(jtFuncionarios.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jtFuncionariosMouseClicked

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        
        MenuGui mn = new MenuGui();
        mn.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JTable jtFuncionarios;
    private javax.swing.JTextField txfIdPessoa;
    private javax.swing.JTextField txfIdRegistro;
    // End of variables declaration//GEN-END:variables
}
