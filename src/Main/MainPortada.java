/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JTextField;

/**
 *
 * @author Leo Family
 */
public class MainPortada extends javax.swing.JFrame {

    
    public GameOfLife gol; 
            
    public MainPortada() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Juego de la vida por Leonardo Hernandez");
    }

    
    public int getLargo() {
        
        int largo = Integer.parseInt(Largo.getText());
        
        return largo;
    }

    public int getAncho() {
        
        int ancho = Integer.parseInt(Ancho.getText());
        
        return ancho;
    }
    
    public int getLimite() {
        
        int limite = Integer.parseInt(Limite.getText());
        
        return limite;
    }
    
    public int getTiempo(){
        
        int tiempo = Integer.parseInt(Tiempo.getText());
        
        return tiempo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        Largo = new javax.swing.JTextField();
        Ancho = new javax.swing.JTextField();
        Start = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Tiempo = new javax.swing.JTextField();
        Limite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada.png"))); // NOI18N

        Largo.setBackground(new java.awt.Color(153, 153, 153));
        Largo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Largo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Largo.setText("25");

        Ancho.setBackground(new java.awt.Color(153, 153, 153));
        Ancho.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Ancho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ancho.setText("50");
        Ancho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnchoActionPerformed(evt);
            }
        });

        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comenzar portada 1.png"))); // NOI18N
        Start.setContentAreaFilled(false);
        Start.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comenzar portada 2.png"))); // NOI18N
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada salir 1.png"))); // NOI18N
        Salir.setContentAreaFilled(false);
        Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada salir 2.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Tiempo.setBackground(new java.awt.Color(153, 153, 153));
        Tiempo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Tiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tiempo.setText("200");

        Limite.setBackground(new java.awt.Color(153, 153, 153));
        Limite.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Limite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Limite.setText("3");

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Ancho)
                            .addComponent(Largo)
                            .addComponent(Tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Largo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed

        gol= new GameOfLife(getAncho(),getLargo(),getTiempo(),getLimite());
        gol.setVisible(true);
        dispose();

        System.out.println("el largo pasado es"+getLargo());
        System.out.println(" el ancho pasado es " + getAncho());
    }//GEN-LAST:event_StartActionPerformed

    private void AnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnchoActionPerformed

  
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
            java.util.logging.Logger.getLogger(MainPortada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPortada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPortada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPortada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPortada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ancho;
    private javax.swing.JTextField Largo;
    private javax.swing.JTextField Limite;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Start;
    private javax.swing.JTextField Tiempo;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}
