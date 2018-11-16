/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonitorSerial.Gui;

import MonitorSerial.Controle.ControleMonitor;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author fmaia
 */
public class GuiMonitor extends javax.swing.JFrame {

    private String[] listaPortas = null;
    private Integer[] listaBaudrates;
    private ControleMonitor controleMonitor;
    private Integer tempoLoopBack;
    private SimpleDateFormat sdf;
    
    /**
     * Creates new form GuiMonitor
     */
    public GuiMonitor() {
        initComponents();
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTARecebimento = new javax.swing.JTextArea();
        jTFEnviarDados = new javax.swing.JTextField();
        jCBBaudrates = new javax.swing.JComboBox<>();
        jCBPortas = new javax.swing.JComboBox<>();
        jBEnviar = new javax.swing.JButton();
        jBAjuda = new javax.swing.JButton();
        jToggleBConexao = new javax.swing.JToggleButton();
        jTBLoopBack = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMIRecarregarComs = new javax.swing.JMenuItem();
        jMICleanTextArea = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCBMIBreakLine = new javax.swing.JCheckBoxMenuItem();
        jCBMIAutoRolagem = new javax.swing.JCheckBoxMenuItem();
        jCBMIExibirData = new javax.swing.JCheckBoxMenuItem();
        jCBMIEnviarBraekLine = new javax.swing.JCheckBoxMenuItem();
        jMContPactsCOM = new javax.swing.JMenu();
        jMIContadorPacotes = new javax.swing.JMenuItem();
        jMIMonitorSerie = new javax.swing.JMenuItem();
        jMISetTimeLoopBack = new javax.swing.JMenuItem();

        jLIcon.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitor Serial 2.0 - By Fellipe Maia");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        jTARecebimento.setEditable(false);
        jTARecebimento.setColumns(20);
        jTARecebimento.setRows(5);
        jTARecebimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTARecebimentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTARecebimento);

        jTFEnviarDados.setEnabled(false);
        jTFEnviarDados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFEnviarDadosKeyPressed(evt);
            }
        });

        jCBBaudrates.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBPortas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBPortasItemStateChanged(evt);
            }
        });

        jBEnviar.setText("Enviar");
        jBEnviar.setEnabled(false);
        jBEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarActionPerformed(evt);
            }
        });

        jBAjuda.setText("Ajuda");
        jBAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAjudaActionPerformed(evt);
            }
        });

        jToggleBConexao.setText("Conectar");
        jToggleBConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBConexaoActionPerformed(evt);
            }
        });

        jTBLoopBack.setText("Loop Back");
        jTBLoopBack.setEnabled(false);
        jTBLoopBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBLoopBackActionPerformed(evt);
            }
        });

        jMenu3.setText("Opções");

        jMIRecarregarComs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMIRecarregarComs.setText("Recarregar COMs");
        jMIRecarregarComs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRecarregarComsActionPerformed(evt);
            }
        });
        jMenu3.add(jMIRecarregarComs);

        jMICleanTextArea.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMICleanTextArea.setText("Limpar Area de Texto");
        jMICleanTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICleanTextAreaActionPerformed(evt);
            }
        });
        jMenu3.add(jMICleanTextArea);

        jMenu1.setText("Opções de exibição");

        jCBMIBreakLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jCBMIBreakLine.setSelected(true);
        jCBMIBreakLine.setText("Adicionar Quebra de linha");
        jMenu1.add(jCBMIBreakLine);

        jCBMIAutoRolagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jCBMIAutoRolagem.setSelected(true);
        jCBMIAutoRolagem.setText("Auto Rolagem");
        jMenu1.add(jCBMIAutoRolagem);

        jCBMIExibirData.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jCBMIExibirData.setSelected(true);
        jCBMIExibirData.setText("Exibir Data");
        jMenu1.add(jCBMIExibirData);

        jCBMIEnviarBraekLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jCBMIEnviarBraekLine.setText("Enviar com quebra de linha");
        jMenu1.add(jCBMIEnviarBraekLine);

        jMenu3.add(jMenu1);

        jMenuBar1.add(jMenu3);

        jMContPactsCOM.setText("Funções extras");

        jMIContadorPacotes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMIContadorPacotes.setText("Contador de Pacotes");
        jMIContadorPacotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIContadorPacotesActionPerformed(evt);
            }
        });
        jMContPactsCOM.add(jMIContadorPacotes);

        jMIMonitorSerie.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMIMonitorSerie.setText("Monitor em Serie");
        jMIMonitorSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMonitorSerieActionPerformed(evt);
            }
        });
        jMContPactsCOM.add(jMIMonitorSerie);

        jMISetTimeLoopBack.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMISetTimeLoopBack.setText("Setar Tempo do loop back");
        jMISetTimeLoopBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISetTimeLoopBackActionPerformed(evt);
            }
        });
        jMContPactsCOM.add(jMISetTimeLoopBack);

        jMenuBar1.add(jMContPactsCOM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBAjuda)
                        .addGap(186, 186, 186)
                        .addComponent(jCBPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBBaudrates, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleBConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFEnviarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTBLoopBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEnviarDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEnviar)
                    .addComponent(jTBLoopBack))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBBaudrates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAjuda)
                    .addComponent(jToggleBConexao)
                    .addComponent(jCBPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if(!jToggleBConexao.isSelected()){
            this.listaPortas = this.controleMonitor.getPortas();
            jCBPortas.removeAllItems();
            if(this.listaPortas != null){
                for(String porta: listaPortas){
                    if(porta!=null){
                        jCBPortas.addItem(porta);
                    }
                }
            }
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.controleMonitor = new ControleMonitor(this);
        jCBPortas.removeAllItems();
        jCBBaudrates.removeAllItems();
        this.formWindowActivated(null);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.jTBLoopBack.setSelected(false);
        this.jTBLoopBackActionPerformed(null);
        this.jToggleBConexao.setSelected(false);
        this.jToggleBConexaoActionPerformed(null);
    }//GEN-LAST:event_formWindowClosed

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed
        // TODO add your handling code here:
        String msn = jTFEnviarDados.getText();
        if(jToggleBConexao.isSelected()){
            if(jCBMIEnviarBraekLine.isSelected())
                msn += "\n";
            this.controleMonitor.transmicao(msn);
            jTFEnviarDados.setText("");
        }
    }//GEN-LAST:event_jBEnviarActionPerformed

    private void jBAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAjudaActionPerformed
        // TODO add your handling code here:
        new GuiAjuda().setVisible(true);
    }//GEN-LAST:event_jBAjudaActionPerformed

    private void jTFEnviarDadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFEnviarDadosKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10 && jBEnviar.isEnabled()){
            jBEnviarActionPerformed(null);
        }
    }//GEN-LAST:event_jTFEnviarDadosKeyPressed

    private void jTARecebimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTARecebimentoMouseClicked
        // TODO add your handling code here:
        if(evt.getButton() == 3){
            
        }
    }//GEN-LAST:event_jTARecebimentoMouseClicked

    private void jToggleBConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBConexaoActionPerformed
        // TODO add your handling code here:
        Exception erro = null;
        if(jToggleBConexao.isSelected()){
            jToggleBConexao.setText("Desconectar");
            jCBPortas.setEnabled(false);
            jCBBaudrates.setEnabled(false);
            jBEnviar.setEnabled(true);
            jTBLoopBack.setEnabled(true);
            jTFEnviarDados.setEnabled(true);
            try {
                this.controleMonitor.startComunicacao((String)jCBPortas.getSelectedItem(),
                    Integer.parseInt((String)jCBBaudrates.getSelectedItem()), 0);
            } catch (NoSuchPortException ex) {
                erro = ex;
                Logger.getLogger(GuiMonitor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PortInUseException ex) {
                erro = ex;
                Logger.getLogger(GuiMonitor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TooManyListenersException ex) {
                erro = ex;
                Logger.getLogger(GuiMonitor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedCommOperationException ex) {
                erro = ex;
                Logger.getLogger(GuiMonitor.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                if(erro != null){
                    jToggleBConexao.setSelected(false);
                    jToggleBConexao.setText("Conectar");
                    jCBPortas.setEnabled(true);
                    jCBBaudrates.setEnabled(true);
                    jBEnviar.setEnabled(false);
                    jTBLoopBack.setEnabled(false);
                    jTFEnviarDados.setEditable(false);
                    jTBLoopBack.setSelected(false);
                    jTBLoopBackActionPerformed(null);
                }
            }
        }else{
            jTBLoopBack.setSelected(false);
            jTBLoopBackActionPerformed(null);
            jToggleBConexao.setText("Conectar");
            jCBPortas.setEnabled(true);
            jCBBaudrates.setEnabled(true);
            jBEnviar.setEnabled(false);
            jTBLoopBack.setEnabled(false);
            jTFEnviarDados.setEditable(false);
            this.controleMonitor.stopComunicacao();
        }
    }//GEN-LAST:event_jToggleBConexaoActionPerformed

    private void jCBPortasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBPortasItemStateChanged
        // TODO add your handling code here:
        if(!jToggleBConexao.isSelected()){
            this.listaBaudrates = this.controleMonitor.getBaudrates("Não aplicavel");
            jCBBaudrates.removeAllItems();
            if(this.listaBaudrates != null){
                for(Integer baudrate: listaBaudrates){
                    jCBBaudrates.addItem(baudrate.toString());
                }
            }
        }
    }//GEN-LAST:event_jCBPortasItemStateChanged

    private void jTBLoopBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBLoopBackActionPerformed
        if(jTBLoopBack.isSelected()){
            System.out.println("Botão para Iniciar");
            try {
                this.controleMonitor.iniciarLoopBack();
            } catch (InterruptedException ex) {
                System.out.println("Erro n Sleep do Loop Back");
                Logger.getLogger(GuiMonitor.class.getName()).log(Level.SEVERE, null, ex);
            }
            jBEnviar.setEnabled(false);
            jTFEnviarDados.setEnabled(false);
        }else{
            System.out.println("Botão para para");
            this.controleMonitor.paraLoopBack();
            this.jTBLoopBack.setEnabled(true);
            this.jTFEnviarDados.setText("");
            jTFEnviarDados.setEnabled(true);
            jBEnviar.setEnabled(true);
        }
    }//GEN-LAST:event_jTBLoopBackActionPerformed

    private void jMICleanTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICleanTextAreaActionPerformed
        this.jTARecebimento.setText("");
    }//GEN-LAST:event_jMICleanTextAreaActionPerformed

    private void jMISetTimeLoopBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISetTimeLoopBackActionPerformed
        String p = JOptionPane.showInputDialog(this,"Em milisegundos!",this.controleMonitor.getTempoLoopBack());
        if(p!=null){
            this.controleMonitor.setTempoLoopBackGui(Integer.parseInt(p));
        }
    }//GEN-LAST:event_jMISetTimeLoopBackActionPerformed

    private void jMIContadorPacotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIContadorPacotesActionPerformed
        // TODO add your handling code here:
        this.controleMonitor.newContadorPacotes();
    }//GEN-LAST:event_jMIContadorPacotesActionPerformed

    private void jMIRecarregarComsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRecarregarComsActionPerformed
        this.formWindowActivated(null);
    }//GEN-LAST:event_jMIRecarregarComsActionPerformed

    private void jMIMonitorSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMonitorSerieActionPerformed
        this.controleMonitor.setVisibilidadeMonitorSerie();
    }//GEN-LAST:event_jMIMonitorSerieActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMonitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAjuda;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JComboBox<String> jCBBaudrates;
    private javax.swing.JCheckBoxMenuItem jCBMIAutoRolagem;
    private javax.swing.JCheckBoxMenuItem jCBMIBreakLine;
    private javax.swing.JCheckBoxMenuItem jCBMIEnviarBraekLine;
    private javax.swing.JCheckBoxMenuItem jCBMIExibirData;
    private javax.swing.JComboBox<String> jCBPortas;
    private javax.swing.JLabel jLIcon;
    private javax.swing.JMenu jMContPactsCOM;
    private javax.swing.JMenuItem jMICleanTextArea;
    private javax.swing.JMenuItem jMIContadorPacotes;
    private javax.swing.JMenuItem jMIMonitorSerie;
    private javax.swing.JMenuItem jMIRecarregarComs;
    private javax.swing.JMenuItem jMISetTimeLoopBack;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTARecebimento;
    private javax.swing.JToggleButton jTBLoopBack;
    private javax.swing.JTextField jTFEnviarDados;
    private javax.swing.JToggleButton jToggleBConexao;
    // End of variables declaration//GEN-END:variables

    public void ajustarDados(String dados){
        if(this.jCBMIExibirData.isSelected())
            dados = sdf.format(Calendar.getInstance().getTime())+ ": " + dados;
        if(this.jCBMIBreakLine.isSelected())
            dados+= "\n";
        this.jTARecebimento.append(dados);
        if(this.jCBMIAutoRolagem.isSelected()){  
            jTARecebimento.getCaret().setDot( jTARecebimento.getText().length() );
            jScrollPane1.scrollRectToVisible(jTARecebimento.getVisibleRect() );
        }
    }
    
    public void enviarTexto(String texto){
        this.jTFEnviarDados.setText(texto);
        this.jBEnviarActionPerformed(null);
    }
    
    public void setTempoLoopBack(Integer tempo){
        this.tempoLoopBack = tempo;
    }
    
    public void bloquearConexao(Boolean boo){
        jToggleBConexao.setEnabled(!boo);
        jCBPortas.setEnabled(!boo);
        jCBBaudrates.setEnabled(!boo);
        jCBMIEnviarBraekLine.setEnabled(!boo);
    }
}