/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatividades.Forms;

import controleatividades.Class.Alternativa;
import controleatividades.Class.Atividade;
import controleatividades.Class.Conteudo;
import controleatividades.Class.Disciplina;
import controleatividades.Class.Professor;
import controleatividades.Class.Questao;
import controleatividades.Class.Turma;
import java.util.ArrayList;

/**
 *
 * @author stefa
 */
public class FormMenu extends javax.swing.JFrame {
        ArrayList <Professor> professores  = new ArrayList();
        ArrayList <Atividade> atividade  = new ArrayList();
        ArrayList <Disciplina> disciplina  = new ArrayList();
        ArrayList <Conteudo> conteudo  = new ArrayList();
        ArrayList <Turma> turma  = new ArrayList();
        ArrayList <Questao> questao  = new ArrayList();
        ArrayList <Alternativa> alternativa  = new ArrayList();
    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
        initComponents();
        inserir();
    }

    
     public void inserir(){
     professores.add(new Professor (153,"Fabiano","MESTRE"));
     professores.add(new Professor(828, "Jackson", "Doutor"));
     professores.add(new Professor (600, "Carlos","LPOO"));
     professores.add(new Professor (453,"Ana Maria","Mestra"));
     
     disciplina.add(new Disciplina(1,"LPOO",50 ));
     disciplina.add(new Disciplina(2,"BD II",55 ));
     disciplina.add(new Disciplina(3,"AP I",50 ));
     disciplina.add(new Disciplina(4,"BD I",55 ));
     disciplina.add(new Disciplina (4,"Conhece Aluno",55) );
     disciplina.add(new Disciplina(6,"Conteudos de Materias",8));
     
     conteudo.add(new Conteudo(1234,"Polimorfismo"));
     conteudo.add(new Conteudo(220,"Classes"));
     conteudo.add(new Conteudo(350,"Interface Gráfica"));
     conteudo.add(new Conteudo(820,"Herança"));
     conteudo.add(new Conteudo(900,"Conhecer Aluno especifico"));
     conteudo.add(new Conteudo(910,"Conhecendo Conteudos de Materias")); 
     
     alternativa.add(new Alternativa(100,"Classes","Interface","Herança","Polimorfismo","Entidades","C"));
     alternativa.add(new Alternativa(200,"Ciencia da computação","Engenharia de Software","Sistema de Informação","Direito","Farmacia","B"));
     alternativa.add(new Alternativa(300,"Listas Encadeadas","Classes","Entidades","Geometria basica","Calculos Proposicionais","A")); 
     
     questao.add(new Questao(10,"Qual o nome que se dar para uma clase que herda outra?",disciplina.get(0),conteudo.get(3),alternativa.get(0)));
     questao.add(new Questao(20,"Qual Curso que o Riquelmmy Na Batera Cursa?",disciplina.get(2),conteudo.get(4),alternativa.get(1)));
     questao.add(new Questao(30,"Das Alternativas abaixo qual dos conteudos Possui em Est. de Dados?",disciplina.get(3),conteudo.get(5),alternativa.get(2)));
     
     turma.add(new Turma(700,disciplina.get(0),"2020/1","2N",professores.get(2)));
     turma.add(new Turma(500,disciplina.get(4),"2020/1","5N",professores.get(1)));
     turma.add(new Turma(400,disciplina.get(3),"2020/1","6N",professores.get(0)));
     
     }
    
    

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("CADASTRAR");

        jMenuItem2.setText("Professor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setText("Disciplina");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem3.setText("Questões");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Turma");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Atividade");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("RELATORIO");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("SOBRE");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormProfessor formprofessor = new FormProfessor(professores);
        formprofessor.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FormQuestoes formquestoes = new FormQuestoes(conteudo, questao, disciplina, alternativa);
        formquestoes.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        FormDisciplina formdisciplina = new FormDisciplina(disciplina);
        formdisciplina.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FormTurma formturma = new FormTurma(professores, disciplina, turma);
        formturma.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FormAtividade formatividade = new FormAtividade(conteudo, questao, turma, alternativa, atividade);
        formatividade.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
