package gui;

public class MenuGui extends javax.swing.JFrame {

    public MenuGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmProduto = new javax.swing.JMenuItem();
        jmPessoa = new javax.swing.JMenuItem();
        jmPagamento = new javax.swing.JMenuItem();
        jmItemPedido = new javax.swing.JMenuItem();
        jmFuncionario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmLogout = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenuBar1.setToolTipText("");

        jMenu2.setText("Cadastros");

        jmProduto.setText("Produto");
        jmProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jmProduto);

        jmPessoa.setText("Pessoa");
        jmPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPessoaActionPerformed(evt);
            }
        });
        jMenu2.add(jmPessoa);

        jmPagamento.setText("Pagamento");
        jmPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPagamentoActionPerformed(evt);
            }
        });
        jMenu2.add(jmPagamento);

        jmItemPedido.setText("Item Pedido");
        jmItemPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemPedidoActionPerformed(evt);
            }
        });
        jMenu2.add(jmItemPedido);

        jmFuncionario.setText("Funcionário");
        jmFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmFuncionario);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Gerenciamento");

        jmLogout.setText("Logout");
        jmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(jmLogout);

        jmSair.setText("Sair");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdutoActionPerformed
        
        ProdutoGUI pd= new ProdutoGUI();
        pd.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_jmProdutoActionPerformed

    private void jmPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPagamentoActionPerformed
        PagamentoGUI pg = new PagamentoGUI();
        pg.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jmPagamentoActionPerformed

    private void jmPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPessoaActionPerformed
        PessoaGUI ps = new PessoaGUI();
        ps.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jmPessoaActionPerformed

    private void jmItemPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemPedidoActionPerformed
        ItemPedidoGUI it = new ItemPedidoGUI();
        it.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jmItemPedidoActionPerformed

    private void jmFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFuncionarioActionPerformed
        FuncionarioGUI fc = new FuncionarioGUI();
        fc.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jmFuncionarioActionPerformed

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jmSairActionPerformed

    private void jmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLogoutActionPerformed
        LoginGUI lg = new LoginGUI();
        lg.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jmLogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmFuncionario;
    private javax.swing.JMenuItem jmItemPedido;
    private javax.swing.JMenuItem jmLogout;
    private javax.swing.JMenuItem jmPagamento;
    private javax.swing.JMenuItem jmPessoa;
    private javax.swing.JMenuItem jmProduto;
    private javax.swing.JMenuItem jmSair;
    // End of variables declaration//GEN-END:variables
}
