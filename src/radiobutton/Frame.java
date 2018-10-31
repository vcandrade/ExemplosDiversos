package exemplos.radiobutton;

import java.util.Enumeration;
import javax.swing.AbstractButton;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstadoCivil = new javax.swing.ButtonGroup();
        pnEstadoCivil = new javax.swing.JPanel();
        rbCasado = new javax.swing.JRadioButton();
        rbSolteiro = new javax.swing.JRadioButton();
        tbSeparado = new javax.swing.JRadioButton();
        rbDivorciado = new javax.swing.JRadioButton();
        rbViuvo = new javax.swing.JRadioButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil"));

        bgEstadoCivil.add(rbCasado);
        rbCasado.setText("Casado");

        bgEstadoCivil.add(rbSolteiro);
        rbSolteiro.setText("Solteiro");

        bgEstadoCivil.add(tbSeparado);
        tbSeparado.setText("Separado");

        bgEstadoCivil.add(rbDivorciado);
        rbDivorciado.setText("Divorciado");

        bgEstadoCivil.add(rbViuvo);
        rbViuvo.setText("Viuvo");

        javax.swing.GroupLayout pnEstadoCivilLayout = new javax.swing.GroupLayout(pnEstadoCivil);
        pnEstadoCivil.setLayout(pnEstadoCivilLayout);
        pnEstadoCivilLayout.setHorizontalGroup(
            pnEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstadoCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCasado)
                    .addComponent(rbSolteiro)
                    .addComponent(tbSeparado)
                    .addComponent(rbDivorciado)
                    .addComponent(rbViuvo))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        pnEstadoCivilLayout.setVerticalGroup(
            pnEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstadoCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSolteiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbSeparado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbDivorciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbViuvo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed

        Enumeration<AbstractButton> buttons = bgEstadoCivil.getElements();      //Insere os radio buttons que pertencem ao "bgEstadoCivil" em "buttons"
        String nomeButton = "";

        while (buttons.hasMoreElements()) {                                      //Enquanto buttons possuir um próximo elemento

            AbstractButton abTmp = buttons.nextElement();                       //"abTmp" recebe um dos elementos

            if (abTmp.isSelected()) {                                            //Caso esse elemento esteja selecionado

                nomeButton = abTmp.getText();                                   //nomeButton recebe o texto do elemento
            }
        }

        System.out.println(nomeButton);                                         //Imprime no console o nome do button

    }//GEN-LAST:event_btConfirmarActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstadoCivil;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JPanel pnEstadoCivil;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbDivorciado;
    private javax.swing.JRadioButton rbSolteiro;
    private javax.swing.JRadioButton rbViuvo;
    private javax.swing.JRadioButton tbSeparado;
    // End of variables declaration//GEN-END:variables
}
