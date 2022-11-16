package gui;

import dao.ItemPedidoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ItemPedido;

public class ItemPedidoGUI extends javax.swing.JFrame {

    public ItemPedidoGUI() {
        initComponents();
        leiaJTable();
    }

     public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtItem.getModel();
        modelo.setNumRows(0);
        ItemPedidoDAO dao = new ItemPedidoDAO();
        for (ItemPedido item : dao.leitura()) {
            modelo.addRow(new Object[]{
                item.getIdItem(),
                item.getIdPagamento(),
                item.getIdPessoa(),
                item.getIdRemedio(),
                item.getProduto(),
                item.getQuant(),
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtPag = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPessoa = new javax.swing.JTextField();
        txtRemedio = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        txtQuant = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jbAtualizar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtItem = new javax.swing.JTable();
        jbSair = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPag.setBackground(new java.awt.Color(0, 153, 153));
        txtPag.setForeground(new java.awt.Color(255, 255, 255));
        txtPag.setBorder(null);
        jPanel2.add(txtPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IdPagamento:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IdPessoa:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IdRemédio:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Produto:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        txtPessoa.setBackground(new java.awt.Color(0, 153, 153));
        txtPessoa.setForeground(new java.awt.Color(255, 255, 255));
        txtPessoa.setBorder(null);
        jPanel2.add(txtPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));

        txtRemedio.setBackground(new java.awt.Color(0, 153, 153));
        txtRemedio.setForeground(new java.awt.Color(255, 255, 255));
        txtRemedio.setBorder(null);
        jPanel2.add(txtRemedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, -1));

        txtProduto.setBackground(new java.awt.Color(0, 153, 153));
        txtProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtProduto.setBorder(null);
        jPanel2.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 190, -1));

        txtQuant.setBackground(new java.awt.Color(0, 153, 153));
        txtQuant.setForeground(new java.awt.Color(255, 255, 255));
        txtQuant.setBorder(null);
        jPanel2.add(txtQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, -1));

        jbCadastrar.setBackground(new java.awt.Color(0, 204, 204));
        jbCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Item de Pedido ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 20, 260, -1));

        jbLimpar.setBackground(new java.awt.Color(0, 204, 204));
        jbLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jPanel2.add(jbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 90, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 190, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 213, 190, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, -1));

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

        jtItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Item", "ID Pagamento", "ID Pessoa", "ID Remedio", "Produto", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtItem);

        jbSair.setBackground(new java.awt.Color(0, 204, 204));
        jbSair.setForeground(new java.awt.Color(255, 255, 255));
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSair))
                .addGap(27, 27, 27))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        ItemPedido itempedido = new ItemPedido();
        itempedido.setIdPagamento(Integer.parseInt(txtPag.getText()));
        itempedido.setIdPessoa(Integer.parseInt(txtPessoa.getText()));
        itempedido.setIdRemedio(Integer.parseInt(txtRemedio.getText()));
        itempedido.setProduto(txtProduto.getText());
        itempedido.setQuant(Integer.parseInt(txtQuant.getText()));

        if ((txtPag.getText().isEmpty() || txtPessoa.getText().isEmpty() || txtRemedio.getText().isEmpty() || txtProduto.getText().isEmpty() || txtQuant.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
        } else {
            ItemPedidoDAO dao = new ItemPedidoDAO();
            dao.adiciona(itempedido);
            JOptionPane.showMessageDialog(null," Item Pedido inserido com sucesso! ");
        }
        txtPag.setText("");
        txtPessoa.setText("");
        txtRemedio.setText("");
        txtProduto.setText("");
        txtQuant.setText("");

        leiaJTable();

    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        MenuGui mn = new MenuGui();
        mn.setVisible(true);

        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
      txtPag.setText("");
      txtPessoa.setText("");
      txtProduto.setText("");
      txtQuant.setText("");
      txtRemedio.setText("");
      txtPag.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
   
        if (jtItem.getSelectedRow() != -1) {

            ItemPedido item = new ItemPedido();

            item.setIdPagamento(Integer.parseInt(txtPag.getText()));
            item.setIdPessoa(Integer.parseInt(txtPessoa.getText()));
            item.setIdRemedio(Integer.parseInt(txtRemedio.getText()));
            item.setProduto((txtProduto.getText()));
            item.setQuant(Integer.parseInt(txtQuant.getText()));
            item.setIdItem((int) jtItem.getValueAt(jtItem.getSelectedRow(), 0));

            if ((txtProduto.getText().isEmpty() || txtPag.getText().isEmpty() || txtQuant.getText().isEmpty() || txtProduto.getText().isEmpty() || txtPessoa.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                ItemPedidoDAO dao = new ItemPedidoDAO();
                dao.update(item);
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso! ");
            }

            txtPag.setText("");
            txtPessoa.setText("");
            txtProduto.setText("");
            txtQuant.setText("");
            txtRemedio.setText("");
            txtPag.requestFocus();

            leiaJTable();
        }
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (jtItem.getSelectedRow() != -1) {

            ItemPedido item = new ItemPedido();
            item.setIdItem((int) jtItem.getValueAt(jtItem.getSelectedRow(), 0)); 

            if ((txtProduto.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {

                ItemPedidoDAO dao = new ItemPedidoDAO();
                dao.delete(item);
            }

            txtPag.setText("");
            txtPessoa.setText("");
            txtProduto.setText("");
            txtQuant.setText("");
            txtRemedio.setText("");
            txtPag.requestFocus();

            leiaJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtItemMouseClicked
        
        if (jtItem.getSelectedRow() != -1) {
            
            txtPag.setText(jtItem.getValueAt(jtItem.getSelectedRow(), 1).toString());
            txtPessoa.setText(jtItem.getValueAt(jtItem.getSelectedRow(), 2).toString());
            txtRemedio.setText(jtItem.getValueAt(jtItem.getSelectedRow(), 3).toString());
            txtProduto.setText(jtItem.getValueAt(jtItem.getSelectedRow(), 4).toString());
            txtQuant.setText(jtItem.getValueAt(jtItem.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jtItemMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemPedidoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JTable jtItem;
    private javax.swing.JTextField txtPag;
    private javax.swing.JTextField txtPessoa;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JTextField txtRemedio;
    // End of variables declaration//GEN-END:variables
}
