/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 03001072180
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AbaPrincipal = new javax.swing.JTabbedPane();
        AbaCadastros = new javax.swing.JPanel();
        AbaCadastrosLabelCodigo = new javax.swing.JLabel();
        AbaCadastrosCaixaCodigo = new javax.swing.JTextField();
        AbaCadastrosCaixaFornecedor = new javax.swing.JComboBox();
        AbaCadastrosLabelFornecedor = new javax.swing.JLabel();
        AbaCadastrosLabelQuantidade = new javax.swing.JLabel();
        AbaCadastrosCaixaQuantidade = new javax.swing.JTextField();
        AbaCadastrosLabelNomeDoProduto = new javax.swing.JLabel();
        AbaCadastrosCaixaNomeDoProduto = new javax.swing.JTextField();
        AbaCadastrosCaixaNotaFiscal = new javax.swing.JTextField();
        AbaCadastrosLabelNotaFiscal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        AbaConsulta = new javax.swing.JPanel();
        AbaConsultaLabelNomeDoProduto = new javax.swing.JLabel();
        AbaConsultaCaixaNomeDoProduto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        AbaRequisicao = new javax.swing.JPanel();
        AbaRequisicaoLabelQuantidade = new javax.swing.JLabel();
        AbaRequisicaoCaixaQuantidade = new javax.swing.JTextField();
        AbaRequisicaoLabelNomeDoProduto = new javax.swing.JLabel();
        AbaRequisicaoCaixaNomeDoProduto = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        AbaSaida = new javax.swing.JPanel();
        AbaSaidaLabelCodigo = new javax.swing.JLabel();
        AbaSaidaCaixaCodigo = new javax.swing.JTextField();
        AbaSaidaLabelQuantidade = new javax.swing.JLabel();
        AbaSaidaCaixaQuantidade = new javax.swing.JTextField();
        AbaSaidaLabelNomeDoProduto = new javax.swing.JLabel();
        AbaSaidaCaixaNomeDoProduto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        CampoHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu BotaoArquivo = new javax.swing.JMenu();
        BotaoGerenciamento = new javax.swing.JMenu();
        BotaoUsuario = new javax.swing.JMenu();
        BotaoUsuarioNovo = new javax.swing.JMenuItem();
        BotaoUsuarioEditar = new javax.swing.JMenuItem();
        BotaoSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AbaCadastrosLabelCodigo.setText("Código");

        AbaCadastrosCaixaFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AbaCadastrosCaixaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbaCadastrosCaixaFornecedorActionPerformed(evt);
            }
        });

        AbaCadastrosLabelFornecedor.setText("Fornecedor");

        AbaCadastrosLabelQuantidade.setText("Quantidade");

        AbaCadastrosLabelNomeDoProduto.setText("Nome do Produto");

        AbaCadastrosLabelNotaFiscal.setText("Nota Fiscal");

        javax.swing.GroupLayout AbaCadastrosLayout = new javax.swing.GroupLayout(AbaCadastros);
        AbaCadastros.setLayout(AbaCadastrosLayout);
        AbaCadastrosLayout.setHorizontalGroup(
            AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaCadastrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(AbaCadastrosLayout.createSequentialGroup()
                        .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AbaCadastrosLabelCodigo)
                            .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AbaCadastrosCaixaCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addComponent(AbaCadastrosLabelQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AbaCadastrosCaixaQuantidade, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AbaCadastrosLayout.createSequentialGroup()
                                .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AbaCadastrosLabelFornecedor)
                                    .addComponent(AbaCadastrosCaixaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AbaCadastrosCaixaNotaFiscal)
                                    .addGroup(AbaCadastrosLayout.createSequentialGroup()
                                        .addComponent(AbaCadastrosLabelNotaFiscal)
                                        .addGap(0, 98, Short.MAX_VALUE))))
                            .addGroup(AbaCadastrosLayout.createSequentialGroup()
                                .addComponent(AbaCadastrosLabelNomeDoProduto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(AbaCadastrosCaixaNomeDoProduto, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        AbaCadastrosLayout.setVerticalGroup(
            AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaCadastrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbaCadastrosLabelCodigo)
                    .addComponent(AbaCadastrosLabelFornecedor)
                    .addComponent(AbaCadastrosLabelNotaFiscal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AbaCadastrosCaixaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AbaCadastrosCaixaNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AbaCadastrosCaixaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AbaCadastrosLabelNomeDoProduto)
                    .addComponent(AbaCadastrosLabelQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbaCadastrosCaixaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbaCadastrosCaixaNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        AbaPrincipal.addTab("Cadastros", AbaCadastros);

        AbaConsultaLabelNomeDoProduto.setText("Nome do Produto");

        javax.swing.GroupLayout AbaConsultaLayout = new javax.swing.GroupLayout(AbaConsulta);
        AbaConsulta.setLayout(AbaConsultaLayout);
        AbaConsultaLayout.setHorizontalGroup(
            AbaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaConsultaLayout.createSequentialGroup()
                        .addComponent(AbaConsultaLabelNomeDoProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(AbaConsultaCaixaNomeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        AbaConsultaLayout.setVerticalGroup(
            AbaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AbaConsultaLabelNomeDoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbaConsultaCaixaNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AbaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AbaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        AbaPrincipal.addTab("Consulta", jPanel2);

        AbaRequisicaoLabelQuantidade.setText("Quantidade");

        AbaRequisicaoLabelNomeDoProduto.setText("Nome do Produto");

        javax.swing.GroupLayout AbaRequisicaoLayout = new javax.swing.GroupLayout(AbaRequisicao);
        AbaRequisicao.setLayout(AbaRequisicaoLayout);
        AbaRequisicaoLayout.setHorizontalGroup(
            AbaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaRequisicaoLayout.createSequentialGroup()
                        .addGroup(AbaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AbaRequisicaoLayout.createSequentialGroup()
                                .addComponent(AbaRequisicaoLabelNomeDoProduto)
                                .addGap(0, 450, Short.MAX_VALUE))
                            .addComponent(AbaRequisicaoCaixaNomeDoProduto))
                        .addGap(18, 18, 18)
                        .addGroup(AbaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AbaRequisicaoCaixaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AbaRequisicaoLabelQuantidade)))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        AbaRequisicaoLayout.setVerticalGroup(
            AbaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbaRequisicaoLabelNomeDoProduto)
                    .addComponent(AbaRequisicaoLabelQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbaRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbaRequisicaoCaixaNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbaRequisicaoCaixaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AbaRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AbaRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        AbaPrincipal.addTab("Requisição", jPanel3);

        AbaSaidaLabelCodigo.setText("Código");

        AbaSaidaLabelQuantidade.setText("Quantidade");

        AbaSaidaLabelNomeDoProduto.setText("Nome do Produto");

        AbaSaidaCaixaNomeDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbaSaidaCaixaNomeDoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AbaSaidaLayout = new javax.swing.GroupLayout(AbaSaida);
        AbaSaida.setLayout(AbaSaidaLayout);
        AbaSaidaLayout.setHorizontalGroup(
            AbaSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaSaidaLayout.createSequentialGroup()
                        .addGroup(AbaSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AbaSaidaCaixaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AbaSaidaLabelCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(AbaSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AbaSaidaLayout.createSequentialGroup()
                                .addComponent(AbaSaidaLabelNomeDoProduto)
                                .addGap(0, 371, Short.MAX_VALUE))
                            .addComponent(AbaSaidaCaixaNomeDoProduto))
                        .addGap(18, 18, 18)
                        .addGroup(AbaSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AbaSaidaCaixaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AbaSaidaLabelQuantidade)))
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        AbaSaidaLayout.setVerticalGroup(
            AbaSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbaSaidaLabelCodigo)
                    .addComponent(AbaSaidaLabelNomeDoProduto)
                    .addComponent(AbaSaidaLabelQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbaSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbaSaidaCaixaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbaSaidaCaixaNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbaSaidaCaixaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AbaSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AbaSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        AbaPrincipal.addTab("Saída", jPanel4);

        CampoHora.setText(produto.setData);

        BotaoArquivo.setText("Arquivo");
        jMenuBar1.add(BotaoArquivo);

        BotaoGerenciamento.setText("Gerenciamento");

        BotaoUsuario.setText("Usuário");

        BotaoUsuarioNovo.setText("Novo");
        BotaoUsuario.add(BotaoUsuarioNovo);

        BotaoUsuarioEditar.setText("Editar");
        BotaoUsuario.add(BotaoUsuarioEditar);

        BotaoGerenciamento.add(BotaoUsuario);

        jMenuBar1.add(BotaoGerenciamento);

        BotaoSair.setText("Sair");
        jMenuBar1.add(BotaoSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AbaPrincipal)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CampoHora)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CampoHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbaPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbaCadastrosCaixaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbaCadastrosCaixaFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbaCadastrosCaixaFornecedorActionPerformed

    private void AbaSaidaCaixaNomeDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbaSaidaCaixaNomeDoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbaSaidaCaixaNomeDoProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbaCadastros;
    private javax.swing.JTextField AbaCadastrosCaixaCodigo;
    private javax.swing.JComboBox AbaCadastrosCaixaFornecedor;
    private javax.swing.JTextField AbaCadastrosCaixaNomeDoProduto;
    private javax.swing.JTextField AbaCadastrosCaixaNotaFiscal;
    private javax.swing.JTextField AbaCadastrosCaixaQuantidade;
    private javax.swing.JLabel AbaCadastrosLabelCodigo;
    private javax.swing.JLabel AbaCadastrosLabelFornecedor;
    private javax.swing.JLabel AbaCadastrosLabelNomeDoProduto;
    private javax.swing.JLabel AbaCadastrosLabelNotaFiscal;
    private javax.swing.JLabel AbaCadastrosLabelQuantidade;
    private javax.swing.JPanel AbaConsulta;
    private javax.swing.JTextField AbaConsultaCaixaNomeDoProduto;
    private javax.swing.JLabel AbaConsultaLabelNomeDoProduto;
    private javax.swing.JTabbedPane AbaPrincipal;
    private javax.swing.JPanel AbaRequisicao;
    private javax.swing.JTextField AbaRequisicaoCaixaNomeDoProduto;
    private javax.swing.JTextField AbaRequisicaoCaixaQuantidade;
    private javax.swing.JLabel AbaRequisicaoLabelNomeDoProduto;
    private javax.swing.JLabel AbaRequisicaoLabelQuantidade;
    private javax.swing.JPanel AbaSaida;
    private javax.swing.JTextField AbaSaidaCaixaCodigo;
    private javax.swing.JTextField AbaSaidaCaixaNomeDoProduto;
    private javax.swing.JTextField AbaSaidaCaixaQuantidade;
    private javax.swing.JLabel AbaSaidaLabelCodigo;
    private javax.swing.JLabel AbaSaidaLabelNomeDoProduto;
    private javax.swing.JLabel AbaSaidaLabelQuantidade;
    private javax.swing.JMenu BotaoGerenciamento;
    private javax.swing.JMenu BotaoSair;
    private javax.swing.JMenu BotaoUsuario;
    private javax.swing.JMenuItem BotaoUsuarioEditar;
    private javax.swing.JMenuItem BotaoUsuarioNovo;
    private javax.swing.JLabel CampoHora;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
