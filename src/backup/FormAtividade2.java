/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import controleatividades.Class.Alternativa;
import controleatividades.Class.Atividade;
import controleatividades.Class.Conteudo; 
import controleatividades.Class.Disciplina;
import controleatividades.Class.Questao;
import controleatividades.Class.Turma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author stefa
 */
public class FormAtividade2 extends javax.swing.JFrame {

    private ArrayList<Conteudo> conteudo;
    private ArrayList<Questao> questao;
    private ArrayList<Alternativa> alternativa;
    private ArrayList<Turma> turma;
    private ArrayList<Atividade> atividade;
    private ArrayList<Disciplina> disciplina;

    int cod = 1; 
       
       
    public FormAtividade2() {
        initComponents();
        preencheComboTurma();
        preencherCombosQuestoe();
//        preencheComboAtividade(); 
//        preencheCombosQuestoes();
//        preencheComboConteudo();
    }

     FormAtividade2(ArrayList conteudo,ArrayList questao, ArrayList turma, ArrayList alternativa, ArrayList atividade, ArrayList disciplina) {
         this.conteudo = conteudo;
         this.questao = questao;
         this.alternativa = alternativa;
         this.turma = turma;
         this.atividade = atividade;
         this.disciplina = disciplina;
         initComponents(); 
         preencheComboTurma();
         preencherCombosQuestoe();
//         preencheComboAtividade();
//         preencheCombosQuestoes();
//         preencheComboConteudo();
    }
     
     
     public void cadastrarAtividade(){
         try{
         Turma tur = null;  
         String dataInicio = tfDataI.getText();
         String dataFim = tfDataF.getText();
            for(Turma t: turma){ 
                 if(t.getNumero() == Integer.parseInt((String) cbxTurma.getSelectedItem())){
                    tur = t;
                    atividade.add(new Atividade(cod, dataInicio, dataFim, tur));
                    cod++;  
                 }
              } JOptionPane.showMessageDialog(null, "ATIVIDADE " +(cod - 1) + " CADASTRADA COM SUCESSO!"); 
           }catch (Exception exe) {
                JOptionPane.showMessageDialog(null, "INSIRA TODOS OS DADOS DA ATIVIDADE");
                System.out.println(exe); 
          }       
     }  
     
     public void inserir(){
        Questao q = null;
        Atividade a = atividade.get(cbxAtividade.getSelectedIndex()); 
        try{
        if(a.getQuestoes().size()<10){ 
            System.out.println(a.getQuestoes().size());
            System.out.println("oo");
        for(Questao v : questao){ 
            if(v.getEnunciado().equals(cbxQuestoes.getSelectedItem())){
               q = v;
            } 
         }  a.setQuestoes(q);
           JOptionPane.showMessageDialog(null, "Questão "+ a.getQuestoes().size() +" inserida com sucesso! Insira a próxima questão");    
           System.out.println(a.getQuestoes());
        }else{
        
         JOptionPane.showMessageDialog(null, "Essa atividade já possui 10 questões");    
        }
      }catch (Exception exe) {
                JOptionPane.showMessageDialog(null, "INSIRA TODOS OS DADOS DA QUESTÃO");
                System.out.println(exe); 
       }  
     }
  
   
    public void preencheComboTurma(){ 
         for(Turma p : turma){  
           cbxTurma.addItem(((Turma)p).getNumero()+"");  
        } 
     }
    
     public void preencheComboAtividade(){ 
          cbxAtividade.removeAllItems();         
          for(Atividade p : atividade){  
           cbxAtividade.addItem(((Atividade)p).getCod()+"");  
        }        
     }
     
      public void preencheComboConteudo(){ 
           cbxConteudo.removeAllItems();  
           for(Conteudo c : conteudo){   
            cbxConteudo.addItem(((Conteudo)c).getDescricao());  
         } 
     } 
 
      public void preencheCombosQuestoes(){ 
           for(Questao q : questao){  
            if(((Questao) q).getConteudo().getDescricao().equals(cbxConteudo.getSelectedItem())){     
               cbxQuestoes.addItem(((Questao)q).getEnunciado());  
             }   
         }  
     }
       public void preenchecont(){ 
          for(Atividade p : atividade){ 
                        for(Questao c : questao){ 
                             if (((Atividade)p).getTurma().getDisciplina().getNome().equals(c.getDisciplina().getNome())){ 
                                      
                                      cbxConteudo.addItem(c.getConteudo().getDescricao());
                                      
                                         
                                    }
                               }
                         } 
     }
      
     
      
      public void preencherCombosQuestoe(){
//        cbxAtividade.removeAllItems();
        for(Atividade p : atividade){
            preencheComboAtividade();
//           cbxAtividade.addItem(((Atividade)p).getCod()+""); 
                if(((Atividade)p).getCod()== Integer.parseInt(cbxAtividade.getSelectedItem().toString())){ 
//                    for(Atividade p2 : atividade){ 
                        for(Questao c : questao){ 
                             if (((Atividade)p).getTurma().getDisciplina().getNome().equals(c.getDisciplina().getNome())){ 
                                    preenchecont();
//                                    cbxConteudo.addItem(c.getConteudo().getDescricao());
                                       preencheCombosQuestoes();
//                                         
                                    }
                               }
//                         }
                   }
             }
       }
      
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        cbxTurma = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        tfDataI = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tfDataF = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfCodAtividade = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        cbxQuestoes = new javax.swing.JComboBox<>();
        cbxAtividade = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxConteudo = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTurmaActionPerformed(evt);
            }
        });

        jLabel29.setText("TURMA");

        jLabel31.setText("DATA FIM");

        jLabel32.setText("DATA INCIO");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ATIVIDADE");

        tfCodAtividade.setText("Código: ....");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDataI, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDataF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfCodAtividade)
                .addGap(31, 31, 31))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodAtividade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDataI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbxQuestoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxQuestoesActionPerformed(evt);
            }
        });

        cbxAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAtividadeActionPerformed(evt);
            }
        });

        jLabel34.setText("ATIVIDADE");

        jLabel35.setText("QUESTÕES");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("QUESTÃO");

        cbxConteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxConteudoActionPerformed(evt);
            }
        });

        jLabel36.setText("CONTEÚDO");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxAtividade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxQuestoes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181))
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxConteudo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxQuestoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btInserir.setText("INSERIR");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btInserir)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
       cadastrarAtividade(); 
       
   
        preencherCombosQuestoe();
        preencheComboAtividade();
       
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cbxAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAtividadeActionPerformed
      preenchecont();      
//        preencherCombosQuestoe();
    }//GEN-LAST:event_cbxAtividadeActionPerformed

    private void cbxQuestoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxQuestoesActionPerformed
      
    }//GEN-LAST:event_cbxQuestoesActionPerformed

    private void cbxConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxConteudoActionPerformed
         
        preencheCombosQuestoes();
    }//GEN-LAST:event_cbxConteudoActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
       inserir();
    }//GEN-LAST:event_btInserirActionPerformed

    private void cbxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTurmaActionPerformed
     
    }//GEN-LAST:event_cbxTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(FormAtividade2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAtividade2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAtividade2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAtividade2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAtividade2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btInserir;
    private javax.swing.JComboBox<String> cbxAtividade;
    private javax.swing.JComboBox<String> cbxConteudo;
    private javax.swing.JComboBox<String> cbxQuestoes;
    private javax.swing.JComboBox<String> cbxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel tfCodAtividade;
    private javax.swing.JTextField tfDataF;
    private javax.swing.JTextField tfDataI;
    // End of variables declaration//GEN-END:variables
}
