package controleatividades.Reports;
import controleatividades.Class.Atividade; 
import controleatividades.Class.Questao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author stefa
 */
public class FormReport extends javax.swing.JFrame {

     
    private ArrayList<Atividade> atividade;
    
    public FormReport() {
        initComponents();
        tfdata.setEnabled(false);
        tfNumero.setEnabled(false);
    }

    public FormReport(ArrayList atividade) {
        initComponents();
        this.atividade = atividade; 
        tfdata.setEnabled(false);
        tfNumero.setEnabled(false);
    }
 
    public void imprimeAtividade() {       
       /* Imprime o cabeçalho (número da turma, disciplina, data de início e data de fim)
       e questões da atividade (enunciado e alternativas, sem o gabarito) escolhida pelo usuário; */
     taSaida.setText("");
       try { 
           for(Atividade a: atividade){
           if(a.getCod() == (Integer.parseInt(tfNumero.getText()))){
               taSaida.append("\nDADOS DA ATIVIDADE: TURMA Nº " + a.getTurma().getNumero()+ "\n "
                       + "DISCIPLINA: "+a.getTurma().getDisciplina().getNome()+"\n  "
                       + "DATA INICIO: "+a.getDataI()+"\n "
                       + "DATA FIM: "+a.getDataF()+"\n"); 
                taSaida.append("QUESTÕES: \n "); 
                for(Questao q : a.getQuestoes()){  
                     taSaida.append(q.getEnunciado()+"\n"); 
                }  
            }
        } 
    }catch (Exception exe) {
          JOptionPane.showMessageDialog(null, "INSIRA TODOS OS DADOS");
           System.out.println(exe); 
      } 
    }
  
    public void imprimeGabaritoData() {
       /* Imprimir gabarito de todas as atividades que finalizam em uma data indicada pelo usuário; */
     taSaida.setText("");
       try { 
        for(Atividade a: atividade){
           if(a.getDataF().equals(tfdata.getText())){
             taSaida.append("ATIVIDADE: Nº "+ a.getCod()+"\n");
             for(Questao q : a.getQuestoes()){
             taSaida.append("QUESTÃO: "+ q.getEnunciado()+
                     " GABARITO: "+q.getAlternativas().getCerta()+"\n"); 
             }  
          }
       } 
    }catch (Exception exe) {
          JOptionPane.showMessageDialog(null, "INSIRA TODOS OS DADOS");
           System.out.println(exe); 
      } 
    }

    public void imprimeTodasAtividades() {
     /* o código, número da turma, disciplina, data de início e data de fim de todas as atividades. */
     taSaida.setText("ATIVIDADES: \n");
     try {   
         for(Atividade a : atividade){
               taSaida.append("ATIVIDADE Nº: "+a.getCod()+
                       " TURMA Nº: "+a.getTurma().getNumero()+
                       " DISCIPLINA: "+a.getTurma().getDisciplina().getNome()+
                       " DATA INICIO: "+a.getDataI()+
                       " DATA FIM:"+ a.getDataF()+"\n"); 
         }
    }catch (Exception exe) {
          JOptionPane.showMessageDialog(null, "INSIRA TODOS OS DADOS");
           System.out.println(exe); 
      } 
    }

    private void imprimeGabarito() {
     /* Imprimir gabarito de uma atividade específica indicada pelo usuário; */
     taSaida.setText("");
     try {
         for(Atividade a: atividade){ 
           if(a.getCod() == (Integer.parseInt(tfNumero.getText()))){
                for(Questao q : a.getQuestoes()){
                     taSaida.append("QUESTÃO: "+ q.getEnunciado() +
                             "  GABARITO: "+q.getAlternativas().getCerta()+"\n"); 
                }  
            }
        } 
      }catch (Exception exe) {
          JOptionPane.showMessageDialog(null, "INSIRA TODOS OS DADOS");
           System.out.println(exe); 
      } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdata = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        rbA = new javax.swing.JRadioButton();
        rbGD = new javax.swing.JRadioButton();
        rbTA = new javax.swing.JRadioButton();
        rdG = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("ATIVIDADE:");

        jLabel1.setText("NÚMERO");

        jLabel3.setText("DATA");

        buttonGroup1.add(rbA);
        rbA.setText("ATIVIDADE");
        rbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbGD);
        rbGD.setText("GABARITO POR DATA");
        rbGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGDActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTA);
        rbTA.setText("TODAS AS ATIVIDADES");
        rbTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTAActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdG);
        rdG.setText("GABARITO");
        rdG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfdata, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbTA)
                                .addGap(18, 18, 18)
                                .addComponent(rdG))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbA)
                                .addGap(30, 30, 30)
                                .addComponent(rbGD)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbA)
                            .addComponent(rbGD))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbTA)
                            .addComponent(rdG))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        jButton1.setText("IMPRMIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("REPORTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGDActionPerformed
      tfdata.setEnabled(true);
       tfNumero.setEnabled(false);
    }//GEN-LAST:event_rbGDActionPerformed

    private void rdGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdGActionPerformed
       tfdata.setEnabled(false);
       tfNumero.setEnabled(true);
    }//GEN-LAST:event_rdGActionPerformed

    private void rbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAActionPerformed
         tfdata.setEnabled(false);
         tfNumero.setEnabled(true);
    }//GEN-LAST:event_rbAActionPerformed

    private void rbTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTAActionPerformed
        tfdata.setEnabled(false);
        tfNumero.setEnabled(false);
    }//GEN-LAST:event_rbTAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
       taSaida.setText(null);     
       if(rbA.isSelected()){
           imprimeAtividade();
       }else if (rbGD.isSelected()){
           imprimeGabaritoData();
       }else if (rbTA.isSelected()){
           imprimeTodasAtividades();
       }else{
            imprimeGabarito();
       } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbGD;
    private javax.swing.JRadioButton rbTA;
    private javax.swing.JRadioButton rdG;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfdata;
    // End of variables declaration//GEN-END:variables

   
}
