package gui;

import dao.PagamentoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pagamento;

public class PagamentoGUI extends javax.swing.JFrame {

    public PagamentoGUI() {
        initComponents();
        leiaJTable();
    }

    public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtPagamento.getModel();
        modelo.setNumRows(0);
        PagamentoDAO dao = new PagamentoDAO();
        for (Pagamento pagamento : dao.leitura()) {
            modelo.addRow(new Object[]{
                pagamento.getIdPagamento(),
                pagamento.getFormaPag(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txfPagamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnLimpa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPagamento = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfPagamento.setBackground(new java.awt.Color(0, 153, 153));
        txfPagamento.setForeground(new java.awt.Color(255, 255, 255));
        txfPagamento.setBorder(null);
        txfPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(txfPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 208, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Pagamento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 280, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forma de Pagamento:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        btnCadastro.setBackground(new java.awt.Color(0, 204, 204));
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, -1));

        btnLimpa.setBackground(new java.awt.Color(0, 204, 204));
        btnLimpa.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpa.setText("Limpar");
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 380));

        jtPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pagamento", "Forma Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPagamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPagamento);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 180));

        btnEditar.setBackground(new java.awt.Color(0, 204, 204));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Atualizar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 90, -1));

        btnDelete.setBackground(new java.awt.Color(0, 204, 204));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 100, -1));

        btnSair.setBackground(new java.awt.Color(0, 204, 204));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel2.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed

        Pagamento pagamento = new Pagamento();
        pagamento.setFormaPag(txfPagamento.getText());

        if ((txfPagamento.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
        } else {
            PagamentoDAO dao = new PagamentoDAO();
            dao.adiciona(pagamento);
            JOptionPane.showMessageDialog(null, "Pagamento inserido com sucesso! ");
        }
        txfPagamento.setText("");
        txfPagamento.requestFocus();
        leiaJTable();

    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txfPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPagamentoActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        txfPagamento.setText("");
        txfPagamento.requestFocus();

    }//GEN-LAST:event_btnLimpaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (jtPagamento.getSelectedRow() != -1) {

            Pagamento pagamento = new Pagamento();

            pagamento.setFormaPag(txfPagamento.getText());
            pagamento.setIdPagamento((int) jtPagamento.getValueAt(jtPagamento.getSelectedRow(), 0));

            if ((txfPagamento.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                PagamentoDAO dao = new PagamentoDAO();
                dao.update(pagamento);
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso! ");
            }

            txfPagamento.setText("");
            txfPagamento.requestFocus();

            leiaJTable();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (jtPagamento.getSelectedRow() != -1) {

            Pagamento pagamento = new Pagamento();
            pagamento.setIdPagamento((int) jtPagamento.getValueAt(jtPagamento.getSelectedRow(), 0));

            if ((txfPagamento.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                PagamentoDAO dao = new PagamentoDAO();
                dao.delete(pagamento);
            }

            txfPagamento.setText("");
            txfPagamento.requestFocus();
            leiaJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jtPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPagamentoMouseClicked
        if (jtPagamento.getSelectedRow() != -1) {

            txfPagamento.setText(jtPagamento.getValueAt(jtPagamento.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_jtPagamentoMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        MenuGui mn = new MenuGui();
        mn.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PagamentoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtPagamento;
    private javax.swing.JTextField txfPagamento;
    // End of variables declaration//GEN-END:variables
}
