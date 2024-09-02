package apresentacao;

public class telaMenu extends javax.swing.JFrame {

    public telaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoPesquisarEstudante = new javax.swing.JButton();
        botaoPesquisarProfessor = new javax.swing.JButton();
        botaoInserirEstudante = new javax.swing.JButton();
        botaoInserirProfessor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoCriarProjeto = new javax.swing.JButton();
        botaoPesquisarProjeto = new javax.swing.JButton();
        botaoInserirDepartamento = new javax.swing.JButton();
        botaoPesquisarDepartamento = new javax.swing.JButton();
        botaoCriarRelacao = new javax.swing.JButton();
        botaoPesquisarRelacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botaoPesquisarEstudante.setBackground(new java.awt.Color(0, 51, 102));
        botaoPesquisarEstudante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPesquisarEstudante.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarEstudante.setText("Pesquisar Estudante");
        botaoPesquisarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarEstudanteActionPerformed(evt);
            }
        });

        botaoPesquisarProfessor.setBackground(new java.awt.Color(0, 51, 102));
        botaoPesquisarProfessor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPesquisarProfessor.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarProfessor.setText("Pesquisar Professor");
        botaoPesquisarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarProfessorActionPerformed(evt);
            }
        });

        botaoInserirEstudante.setBackground(new java.awt.Color(0, 51, 102));
        botaoInserirEstudante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoInserirEstudante.setForeground(new java.awt.Color(255, 255, 255));
        botaoInserirEstudante.setText("Inserir Estudante");
        botaoInserirEstudante.setToolTipText("");
        botaoInserirEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirEstudanteActionPerformed(evt);
            }
        });

        botaoInserirProfessor.setBackground(new java.awt.Color(0, 51, 102));
        botaoInserirProfessor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoInserirProfessor.setForeground(new java.awt.Color(255, 255, 255));
        botaoInserirProfessor.setText("Inserir Professor ");
        botaoInserirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirProfessorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/Imagem1.png"))); // NOI18N

        botaoCriarProjeto.setBackground(new java.awt.Color(0, 51, 102));
        botaoCriarProjeto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCriarProjeto.setForeground(new java.awt.Color(255, 255, 255));
        botaoCriarProjeto.setText("Criar Projeto");
        botaoCriarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarProjetoActionPerformed(evt);
            }
        });

        botaoPesquisarProjeto.setBackground(new java.awt.Color(0, 51, 102));
        botaoPesquisarProjeto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPesquisarProjeto.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarProjeto.setText("Pesquisar Projeto");
        botaoPesquisarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarProjetoActionPerformed(evt);
            }
        });

        botaoInserirDepartamento.setBackground(new java.awt.Color(0, 51, 102));
        botaoInserirDepartamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoInserirDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        botaoInserirDepartamento.setText("Inserir Departamento");
        botaoInserirDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirDepartamentoActionPerformed(evt);
            }
        });

        botaoPesquisarDepartamento.setBackground(new java.awt.Color(0, 51, 102));
        botaoPesquisarDepartamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPesquisarDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarDepartamento.setText("Pesquisar Departamento");
        botaoPesquisarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarDepartamentoActionPerformed(evt);
            }
        });

        botaoCriarRelacao.setBackground(new java.awt.Color(0, 51, 102));
        botaoCriarRelacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCriarRelacao.setForeground(new java.awt.Color(255, 255, 255));
        botaoCriarRelacao.setText("Criar Projeto/Estudante");
        botaoCriarRelacao.setActionCommand("Criar Projeto->Estudante");
        botaoCriarRelacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarRelacaoActionPerformed(evt);
            }
        });

        botaoPesquisarRelacao.setBackground(new java.awt.Color(0, 51, 102));
        botaoPesquisarRelacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPesquisarRelacao.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarRelacao.setText("Pesq. Projeto/Estudantes");
        botaoPesquisarRelacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarRelacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoInserirEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoInserirDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(botaoInserirProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCriarRelacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCriarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botaoPesquisarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoPesquisarEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoPesquisarProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botaoPesquisarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarRelacao))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserirEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoInserirProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(botaoInserirDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoPesquisarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(botaoPesquisarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoPesquisarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCriarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCriarRelacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarRelacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarEstudanteActionPerformed
        dispose();
        telaPesquisarEstudante pes = new telaPesquisarEstudante();
        pes.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarEstudanteActionPerformed

    private void botaoPesquisarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarProfessorActionPerformed
        dispose();
        telaPesquisarProfessor pes = new telaPesquisarProfessor();
        pes.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarProfessorActionPerformed

    private void botaoInserirEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirEstudanteActionPerformed
       dispose();
       telaInserirEstudante in = new telaInserirEstudante();
       in.setVisible(true);
    }//GEN-LAST:event_botaoInserirEstudanteActionPerformed

    private void botaoInserirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirProfessorActionPerformed
        dispose();
        telaInserirProfessor in = new telaInserirProfessor();
        in.setVisible(true);
    }//GEN-LAST:event_botaoInserirProfessorActionPerformed

    private void botaoCriarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarProjetoActionPerformed
        dispose();
        telaCriarProjeto criar = new telaCriarProjeto();
        criar.setVisible(true);
    }//GEN-LAST:event_botaoCriarProjetoActionPerformed

    private void botaoPesquisarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarProjetoActionPerformed
        dispose();
        telaPesquisarProjeto pes = new telaPesquisarProjeto();
        pes.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarProjetoActionPerformed

    private void botaoInserirDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirDepartamentoActionPerformed
        dispose();
        telaInserirDepartamento in = new telaInserirDepartamento();
        in.setVisible(true);
    }//GEN-LAST:event_botaoInserirDepartamentoActionPerformed

    private void botaoPesquisarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarDepartamentoActionPerformed
        dispose();
        telaPesquisarDepartamento pes = new telaPesquisarDepartamento();
        pes.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarDepartamentoActionPerformed

    private void botaoCriarRelacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarRelacaoActionPerformed
        dispose();
        telaCriarRelacao rel = new telaCriarRelacao();
        rel.setVisible(true);
    }//GEN-LAST:event_botaoCriarRelacaoActionPerformed

    private void botaoPesquisarRelacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarRelacaoActionPerformed
        dispose();
        telaPesquisarRelacao rel = new telaPesquisarRelacao();
        rel.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarRelacaoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriarProjeto;
    private javax.swing.JButton botaoCriarRelacao;
    private javax.swing.JButton botaoInserirDepartamento;
    private javax.swing.JButton botaoInserirEstudante;
    private javax.swing.JButton botaoInserirProfessor;
    private javax.swing.JButton botaoPesquisarDepartamento;
    private javax.swing.JButton botaoPesquisarEstudante;
    private javax.swing.JButton botaoPesquisarProfessor;
    private javax.swing.JButton botaoPesquisarProjeto;
    private javax.swing.JButton botaoPesquisarRelacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
