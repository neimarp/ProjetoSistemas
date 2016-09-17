package View;

import javax.swing.DefaultListModel;
import Model.Curso;
import Persistencia.CursoDAO;

public class FormExcluirCurso extends javax.swing.JFrame {
    
    
    Curso curso = new Curso();
    CursoDAO dao = new CursoDAO();
    public FormExcluirCurso() {
        initComponents();
        this.setTitle("EXCLUIR CURSO");
        this.jButtonExcluirCurso.setVisible(false);
        //setBuscarCurso();       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCurso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscarCurso = new javax.swing.JButton();
        sigla = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        regime = new javax.swing.JTextField();
        duracao = new javax.swing.JTextField();
        turno = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        idBuscar = new javax.swing.JTextField();
        jButtonExcluirCurso = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelTituloCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelCurso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCurso.setLayout(null);

        jLabel1.setText("DESCRICAO:");
        jPanelCurso.add(jLabel1);
        jLabel1.setBounds(20, 80, 90, 20);

        jButtonBuscarCurso.setText("Buscar");
        jButtonBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCursoActionPerformed(evt);
            }
        });
        jPanelCurso.add(jButtonBuscarCurso);
        jButtonBuscarCurso.setBounds(290, 330, 80, 30);

        sigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siglaActionPerformed(evt);
            }
        });
        jPanelCurso.add(sigla);
        sigla.setBounds(390, 140, 90, 20);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanelCurso.add(nome);
        nome.setBounds(120, 40, 200, 30);

        jLabel4.setText("NOME:");
        jPanelCurso.add(jLabel4);
        jLabel4.setBounds(20, 50, 90, 20);

        jLabel5.setText("REGIME:");
        jPanelCurso.add(jLabel5);
        jLabel5.setBounds(20, 110, 90, 20);

        jLabel6.setText("DURACAO:");
        jPanelCurso.add(jLabel6);
        jLabel6.setBounds(20, 140, 90, 20);

        jLabel7.setText("TURNO:");
        jPanelCurso.add(jLabel7);
        jLabel7.setBounds(180, 140, 50, 20);

        jLabel8.setText("SIGLA:");
        jPanelCurso.add(jLabel8);
        jLabel8.setBounds(350, 140, 40, 20);

        regime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regimeActionPerformed(evt);
            }
        });
        jPanelCurso.add(regime);
        regime.setBounds(120, 100, 200, 30);

        duracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracaoActionPerformed(evt);
            }
        });
        jPanelCurso.add(duracao);
        duracao.setBounds(110, 140, 60, 20);

        turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoActionPerformed(evt);
            }
        });
        jPanelCurso.add(turno);
        turno.setBounds(240, 140, 90, 20);

        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });
        jPanelCurso.add(descricao);
        descricao.setBounds(120, 70, 200, 30);

        jLabel10.setText("ID:");
        jPanelCurso.add(jLabel10);
        jLabel10.setBounds(140, 340, 30, 20);

        idBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBuscarActionPerformed(evt);
            }
        });
        jPanelCurso.add(idBuscar);
        idBuscar.setBounds(220, 340, 40, 20);

        jButtonExcluirCurso.setText("Confirmar");
        jButtonExcluirCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirCursoActionPerformed(evt);
            }
        });
        jPanelCurso.add(jButtonExcluirCurso);
        jButtonExcluirCurso.setBounds(180, 400, 140, 23);

        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelCurso.add(jButtonVoltar);
        jButtonVoltar.setBounds(10, 400, 100, 23);

        getContentPane().add(jPanelCurso);
        jPanelCurso.setBounds(20, 30, 500, 440);

        jLabelTituloCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloCurso.setText("Informe id para buscar");
        getContentPane().add(jLabelTituloCurso);
        jLabelTituloCurso.setBounds(210, 0, 140, 30);

        setSize(new java.awt.Dimension(546, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setBuscarCurso(){
        while(idBuscar.getText().length()<1){this.jButtonBuscarCurso.setVisible(false);}
    }
    
    private void jButtonBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCursoActionPerformed
       
       curso = dao.selecionar(Integer.parseInt(idBuscar.getText()));
       nome.setText(curso.getNome());
       regime.setText(curso.getRegime());
       descricao.setText(curso.getDescricao());
       duracao.setText(String.valueOf(curso.getDuracao()));
       turno.setText(curso.getTurno());
       sigla.setText(curso.getSigla());
       jButtonExcluirCurso.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarCursoActionPerformed
    private void alterarCurso() {
        //fazer alteracao
       curso.setNome(nome.getText());
       curso.setId(Integer.parseInt(idBuscar.getText()));
    }
    DefaultListModel model = new DefaultListModel();
    private void siglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siglaActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void regimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regimeActionPerformed

    private void duracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracaoActionPerformed

    private void turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnoActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void idBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBuscarActionPerformed

    private void jButtonExcluirCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirCursoActionPerformed
        alterarCurso();
        dao.deletar(curso);
        limpaCampos();
        this.jButtonExcluirCurso.setVisible(false);
    }//GEN-LAST:event_jButtonExcluirCursoActionPerformed

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
            java.util.logging.Logger.getLogger(FormExcluirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormExcluirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormExcluirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormExcluirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FormExcluirCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField duracao;
    private javax.swing.JTextField idBuscar;
    private javax.swing.JButton jButtonBuscarCurso;
    private javax.swing.JButton jButtonExcluirCurso;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelTituloCurso;
    private javax.swing.JPanel jPanelCurso;
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
        this.turno.setText("");
        this.sigla.setText("");
        this.idBuscar.setText("");
    }

    
}
