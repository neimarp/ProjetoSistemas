package View;

import javax.swing.DefaultListModel;
import Model.Curso;
import Persistencia.CursoDAO;

public class FormCadCurso extends javax.swing.JFrame {
    
    int flag;
    Curso curso = new Curso();
    CursoDAO dao = new CursoDAO();
    public FormCadCurso() {
        initComponents();
        this.setTitle("CADASTRAR CURSO");
        PreencherCursos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCurso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalvarCurso = new javax.swing.JButton();
        limparCaixaDados = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        regime = new javax.swing.JTextField();
        sigla = new javax.swing.JTextField();
        grauInstrucao = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        areaConhecimento = new javax.swing.JTextField();
        duracao = new javax.swing.JTextField();
        turno = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jLabelTituloCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelCurso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCurso.setLayout(null);

        jLabel1.setText("DESCRICAO:");
        jPanelCurso.add(jLabel1);
        jLabel1.setBounds(20, 50, 90, 20);

        jButtonSalvarCurso.setText("Salvar");
        jButtonSalvarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCursoActionPerformed(evt);
            }
        });
        jPanelCurso.add(jButtonSalvarCurso);
        jButtonSalvarCurso.setBounds(200, 390, 80, 23);

        limparCaixaDados.setText("Limpar");
        limparCaixaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCaixaDadosActionPerformed(evt);
            }
        });
        jPanelCurso.add(limparCaixaDados);
        limparCaixaDados.setBounds(330, 390, 80, 23);

        jLabel3.setText("GRAU INSTRUCAO:");
        jPanelCurso.add(jLabel3);
        jLabel3.setBounds(20, 210, 140, 30);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanelCurso.add(nome);
        nome.setBounds(120, 10, 200, 30);

        jLabel4.setText("NOME:");
        jPanelCurso.add(jLabel4);
        jLabel4.setBounds(20, 20, 90, 20);

        jLabel5.setText("REGIME:");
        jPanelCurso.add(jLabel5);
        jLabel5.setBounds(20, 80, 90, 20);

        jLabel6.setText("DURACAO:");
        jPanelCurso.add(jLabel6);
        jLabel6.setBounds(20, 110, 60, 20);

        jLabel7.setText("TURNO:");
        jPanelCurso.add(jLabel7);
        jLabel7.setBounds(180, 110, 50, 20);

        jLabel8.setText("SIGLA:");
        jPanelCurso.add(jLabel8);
        jLabel8.setBounds(350, 110, 40, 20);

        jLabel9.setText("AREA CONHECIMENTO:");
        jPanelCurso.add(jLabel9);
        jLabel9.setBounds(20, 160, 140, 30);

        regime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regimeActionPerformed(evt);
            }
        });
        jPanelCurso.add(regime);
        regime.setBounds(120, 70, 200, 30);

        sigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siglaActionPerformed(evt);
            }
        });
        jPanelCurso.add(sigla);
        sigla.setBounds(390, 110, 90, 30);

        grauInstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grauInstrucaoActionPerformed(evt);
            }
        });
        jPanelCurso.add(grauInstrucao);
        grauInstrucao.setBounds(160, 210, 320, 30);

        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });
        jPanelCurso.add(descricao);
        descricao.setBounds(120, 40, 200, 30);

        areaConhecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaConhecimentoActionPerformed(evt);
            }
        });
        jPanelCurso.add(areaConhecimento);
        areaConhecimento.setBounds(160, 160, 320, 30);

        duracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracaoActionPerformed(evt);
            }
        });
        jPanelCurso.add(duracao);
        duracao.setBounds(80, 110, 50, 30);

        turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoActionPerformed(evt);
            }
        });
        jPanelCurso.add(turno);
        turno.setBounds(240, 110, 50, 30);

        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelCurso.add(jButtonVoltar);
        jButtonVoltar.setBounds(10, 390, 100, 23);

        getContentPane().add(jPanelCurso);
        jPanelCurso.setBounds(20, 30, 500, 440);

        jLabelTituloCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloCurso.setText("Informe os dados");
        getContentPane().add(jLabelTituloCurso);
        jLabelTituloCurso.setBounds(210, 0, 130, 30);

        setSize(new java.awt.Dimension(546, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void PreencherCursos()
    {
        
        
    }
    
    private void jButtonSalvarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCursoActionPerformed
       
       curso.setNome(nome.getText());
       curso.setRegime(regime.getText());
       curso.setDescricao(descricao.getText());
       curso.setDuracao(Integer.parseInt(duracao.getText()));
       curso.setTurno(sigla.getText());
       curso.setSigla(sigla.getText());
       curso.setAreaConhecimento(areaConhecimento.getText());
       curso.setGrauInstrucao(grauInstrucao.getText());
       dao.inserir(curso);
       
    }//GEN-LAST:event_jButtonSalvarCursoActionPerformed
    
    DefaultListModel model = new DefaultListModel();
    private void limparCaixaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCaixaDadosActionPerformed
        limpaCampos();
    }//GEN-LAST:event_limparCaixaDadosActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void regimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regimeActionPerformed

    private void siglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siglaActionPerformed

    private void grauInstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grauInstrucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grauInstrucaoActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void areaConhecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaConhecimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaConhecimentoActionPerformed

    private void duracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracaoActionPerformed

    private void turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnoActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        FormMenuCrud crud = new FormMenuCrud();
        crud.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaConhecimento;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField duracao;
    private javax.swing.JTextField grauInstrucao;
    private javax.swing.JButton jButtonSalvarCurso;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTituloCurso;
    private javax.swing.JPanel jPanelCurso;
    private javax.swing.JButton limparCaixaDados;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField regime;
    private javax.swing.JTextField sigla;
    private javax.swing.JTextField turno;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        this.nome.setText("");
        this.descricao.setText("");
        this.regime.setText("");
        this.duracao.setText("");
        this.sigla.setText("");
        this.sigla.setText("");
        this.grauInstrucao.setText("");
        this.areaConhecimento.setText("");
        this.turno.setText("");
    }
}
