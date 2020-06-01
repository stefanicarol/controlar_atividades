/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatividades.Forms;

import controleatividades.Reports.FormReport;
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
     professores.add(new Professor(1,"Fabiano","Mestre"));
     professores.add(new Professor(2,"Jackson","Doutor"));
     professores.add(new Professor(3,"Carlos","Bacharel"));
     professores.add(new Professor(4,"Ana Maria","Mestra")); 
     professores.add(new Professor(5,"Stéfani Carol","Doutora"));
     
     disciplina.add(new Disciplina(1,"LPOO",50 ));
     disciplina.add(new Disciplina(2,"REDES",55 ));
     disciplina.add(new Disciplina(3,"LPWEB",50 ));
     disciplina.add(new Disciplina(4,"BANCO DE DADOS",55 ));
     disciplina.add(new Disciplina (5,"MATEMATICA DISCRETA",55) );
     disciplina.add(new Disciplina(6,"QUALIDADE DE SOFTWARE",8));
     disciplina.add(new Disciplina(7,"CAROL - DISCIPLINA",8));
     
     conteudo.add(new Conteudo(1,"Polimorfismo e Herança"));
     conteudo.add(new Conteudo(2,"Linux"));
     conteudo.add(new Conteudo(3,"PHP e Django"));
     conteudo.add(new Conteudo(4,"Comandos SQL"));
     conteudo.add(new Conteudo(5,"Teoria de Conjuntos"));
     conteudo.add(new Conteudo(6,"CMMI e ISO")); 
     conteudo.add(new Conteudo(7,"CAROL - CONTEUDO")); 
     
 
     alternativa.add(new Alternativa(1,"Classes","Interface","Herança","Polimorfismo","Entidades","C"));
     alternativa.add(new Alternativa(2,"Apaga Diretorio","Cria Diretorio","Mostra Senha do USER"," Lista USER","Reincia o Linux","B"));
     alternativa.add(new Alternativa(3,"Listas Encadeadas","Classes","Entidades","Geometria basica","Calculos Proposicionais","A")); 
     alternativa.add(new Alternativa(4,"Carol A","Carol B","Carol C","Carol D","Carol E","C"));
     
     /* ALTERNATIVAS DE LINUX - DISCIPLINA REDES */
     alternativa.add(new Alternativa(5,"Apaga Diretorio","Cria Diretorio","Mostra Senha do USER"," Cria Diretorios e Arquivos","Reincia o Linux","D"));
     alternativa.add(new Alternativa(6,"Permissão de Root","Cria Diretorio","Mostra Senha do USER"," Cria Diretorios e Arquivos","Reincia o Linux","A"));
     alternativa.add(new Alternativa(7,"Mostra espaço em disco usado","Cria Diretorio","Mostra Senha do USER"," Cria Diretorios e Arquivos","Reincia o Linux","A"));
     alternativa.add(new Alternativa(8,"Mostra espaço em disco usado","Cria Diretorio","Procura arquivo"," Cria Diretorios e Arquivos","Reincia o Linux","C"));
     alternativa.add(new Alternativa(9,"Mostra espaço em disco usado","Cria Diretorio","Procura arquivo"," Cria Diretorios e Arquivos","Visualizar conteúdo","E"));
    
     
     
     
     questao.add(new Questao(1,"O que permite que classes compartilhem atributos e métodos?",disciplina.get(0),conteudo.get(0),alternativa.get(0)));
     questao.add(new Questao(2,"O que o comando mkdir faz?",disciplina.get(1),conteudo.get(1),alternativa.get(1)));
     questao.add(new Questao(3,"Das Alternativas abaixo qual dos conteudos Possui em Est. de Dados?",disciplina.get(3),conteudo.get(5),alternativa.get(2)));
     questao.add(new Questao(4,"Questões CAROL TESTE?",disciplina.get(6),conteudo.get(5),alternativa.get(3)));
     
     /* QUESTÕES DE LINUX - DISCIPLINA REDES */
     questao.add(new Questao(5,"O que o comando ls faz?",disciplina.get(1),conteudo.get(1),alternativa.get(4))); 
     questao.add(new Questao(6,"O que o comando sudo faz?",disciplina.get(1),conteudo.get(1),alternativa.get(5))); 
     questao.add(new Questao(7,"O que o comando df faz?",disciplina.get(1),conteudo.get(1),alternativa.get(6))); 
     questao.add(new Questao(8,"O que o comando grep faz?",disciplina.get(1),conteudo.get(1),alternativa.get(7))); 
     questao.add(new Questao(9,"O que o comando cat faz?",disciplina.get(1),conteudo.get(1),alternativa.get(8))); 
     
      
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
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("CADASTRAR");

        jMenuItem2.setText("PROFESSOR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setText("DISCIPLINA");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem3.setText("QUESTOES");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("TURMA");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("ATIVIDADE");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("IMPRESSOES");

        jMenuItem9.setText("IMPRIMIR RELATORIOS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("SOBRE");

        jMenuItem8.setText("DESENVOLVEDORES");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

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
        FormAtividade formatividade = new FormAtividade(conteudo, questao, turma, alternativa, atividade, disciplina);
        formatividade.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FormSobre forms = new FormSobre();
        forms.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       FormReport formp = new FormReport(atividade);
       formp.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
