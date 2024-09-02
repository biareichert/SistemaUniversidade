package apresentacao;

import dados.Estudantes;
import regrasNegocio.RegrasNegocio;
import javax.swing.JOptionPane;

public class telaPesquisarEstudante extends javax.swing.JFrame {

    public telaPesquisarEstudante() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        botaoVoltar7 = new javax.swing.JButton();
        botaoPesquisar4 = new javax.swing.JButton();
        inputNumMatricula = new javax.swing.JTextField();
        outNumMatricula = new javax.swing.JLabel();
        outNome = new javax.swing.JLabel();
        outIdade = new javax.swing.JLabel();
        outCurso = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        outAconselhador = new javax.swing.JLabel();
        outNumDep = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/Imagem3.png"))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Informe o número de matrícula:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel59.setText("Número de Matrícula:");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel60.setText("Nome:");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel61.setText("Idade:");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel62.setText("Curso:");

        botaoVoltar7.setBackground(new java.awt.Color(0, 51, 102));
        botaoVoltar7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoVoltar7.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar7.setText("Voltar");
        botaoVoltar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar7ActionPerformed(evt);
            }
        });

        botaoPesquisar4.setBackground(new java.awt.Color(0, 51, 102));
        botaoPesquisar4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoPesquisar4.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisar4.setText("Pesquisar");
        botaoPesquisar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisar4ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel63.setText("Estudante Aconselhador:");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel64.setText("Número do Departamento:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoPesquisar4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(51, 51, 51)
                        .addComponent(outNumDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(62, 62, 62)
                        .addComponent(outAconselhador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel62))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(outNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(outCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(outNome, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(outIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(botaoVoltar7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(inputNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(inputNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoPesquisar4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(outNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(outNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(outIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(outCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addComponent(outAconselhador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(outNumDep, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(botaoVoltar7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar7ActionPerformed
        dispose();
        telaMenu menu = new telaMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_botaoVoltar7ActionPerformed

    private void botaoPesquisar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisar4ActionPerformed
        String num = this.inputNumMatricula.getText();
        try{
            int numEst = Integer.parseInt(num);
            Estudantes est = RegrasNegocio.pesquisarEstudante(numEst);
            if(est!=null){
                outNumMatricula.setText(""+est.getNumMatriculaEstudante());
                outNome.setText(""+est.getNome());
                outIdade.setText(""+est.getIdade());
                outCurso.setText(""+est.getCurso());
                outAconselhador.setText(""+est.getNumMatriculaEstudanteAconselhador());
                outNumDep.setText(""+est.getNumDepartamento());
               
            }else{
                JOptionPane.showMessageDialog(null, "O estudante não existe", "Erro", 0);
            }
        }
        catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Digite um valor inteiro para o número de matrícula do estudante.", "Erro", 0);
        }
    }//GEN-LAST:event_botaoPesquisar4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisar4;
    private javax.swing.JButton botaoVoltar7;
    private javax.swing.JTextField inputNumMatricula;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel outAconselhador;
    private javax.swing.JLabel outCurso;
    private javax.swing.JLabel outIdade;
    private javax.swing.JLabel outNome;
    private javax.swing.JLabel outNumDep;
    private javax.swing.JLabel outNumMatricula;
    // End of variables declaration//GEN-END:variables
}
