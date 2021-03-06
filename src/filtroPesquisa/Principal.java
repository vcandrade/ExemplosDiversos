/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtroPesquisa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Vinícius
 */
public class Principal extends javax.swing.JFrame {

    private DefaultListModel modelo;
    private boolean buscarCidades;

    public Principal() {

        initComponents();
        this.setLocationRelativeTo(null);

        this.buscarCidades = true;

        this.lstSugestoes.setVisible(false);
        modelo = new DefaultListModel();
        lstSugestoes.setModel(modelo);
    }

    public void listarCidades() {

        try {

            this.modelo.removeAllElements();

            File arq = new File("");
            BufferedReader documento = new BufferedReader(new FileReader(arq.getAbsolutePath() + "\\src\\filtroPesquisa\\Cidades.txt"));

            String leitura = documento.readLine();

            while (leitura != null) {

                //verifica se há uma ocorrência da busca no documento das cidades.
                //ambas as strings são transformadas para maiúsculo para não ter problema nas pesquisa
                if (leitura.toUpperCase().contains(this.txtPesquisa.getText().toUpperCase())) {

                    this.modelo.addElement(leitura);
                }

                leitura = documento.readLine();
            }

            documento.close();
          
            if (this.txtPesquisa.getText().length() > 0) {

                lstSugestoes.setVisible(true);

            } else {

                lstSugestoes.setVisible(false);
            }

        } catch (FileNotFoundException ex) {

            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {

            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selecionarCidade() {

        String cidade = lstSugestoes.getSelectedValue();
        this.txtCidade.setText(cidade);
        this.txtPesquisa.setText(cidade);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerExterno = new javax.swing.JLayeredPane();
        layerInterno = new javax.swing.JLayeredPane();
        txtPesquisa = new javax.swing.JTextField();
        lstSugestoes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busca de Cidades");

        layerExterno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layerInterno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });
        layerInterno.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, 60));

        lstSugestoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstSugestoes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lstSugestoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstSugestoesMouseReleased(evt);
            }
        });
        layerInterno.add(lstSugestoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 430, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Busca:");
        layerInterno.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        layerExterno.add(layerInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 29, 500, 300));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Cidade:");
        layerExterno.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 203, -1, -1));

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(51, 51, 255));
        layerExterno.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 203, 345, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layerExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layerExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        this.listarCidades();
        
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void lstSugestoesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSugestoesMouseReleased

        this.selecionarCidade();
        this.lstSugestoes.setVisible(false);
        
    }//GEN-LAST:event_lstSugestoesMouseReleased

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane layerExterno;
    private javax.swing.JLayeredPane layerInterno;
    private javax.swing.JList<String> lstSugestoes;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
