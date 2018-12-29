
package Main;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.SwingUtilities;
        
        
public class GameOfLife extends javax.swing.JFrame {

    //final int ancho =50, largo = 25;
    //int ancho= 50, largo=25;
    
    int ancho,largo;
    public MainPortada mp;
    
    int tiempo, vivas=0, muertas=0,totales;
    int segs, limite;
    //final int ancho= mp.getAncho(); 
    //final int largo = mp.getLargo();
    
    //wid es ancho y hei es largo
    
    //boolean[][]CurrentMove = new boolean [largo][ancho], nextMove = new boolean [largo][ancho];
    
    boolean[][]CurrentMove,nextMove;
    
    boolean play;
    
    Image offscreenImg;
    Graphics offscreenGraps;
    
    
    public GameOfLife(int A,int L, int Tiempo, int Limite) {

        initComponents();
        setIcon();
        
        this.ancho=A;
        this.largo=L;
        this.tiempo=Tiempo;
        this.limite=Limite;
        
        //this.ancho=50;
        //this.largo=25;
        
        this.CurrentMove = new boolean[largo][ancho];
        this.nextMove = new boolean [largo][ancho];
        
        this.setLocationRelativeTo(null);
        this.setTitle("Juego de la Vida por Leonardo Hernandez");
        
        offscreenImg = createImage(jPanel1.getWidth(),jPanel1.getHeight());
        
        offscreenGraps = offscreenImg.getGraphics();
        
        Timer time = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                if(play){
                    for(int i = 0; i < largo; i++){
                        for(int j = 0; j < ancho; j++){
                            nextMove[i][j] = decidir(i,j);
                            //if()
                        }
                    }
                    for(int i = 0; i < largo; i++){
                        for(int j = 0; j < ancho; j++){
                            CurrentMove[i][j] = nextMove[i][j];
                        }
                    }
                    repain();
                    segs++;
                }
            }
        };
                
        time.scheduleAtFixedRate(task, 0, tiempo);
        //time.scheduleAtFixedRate(task, 0, tiempo);
        repain();
        
        
    }

    
    private boolean decidir (int i, int j){//decide si esta viva o muerta
        
        int vecinos = 0;
        
        if(j > 0){ //compara la parte de arriba
            if(CurrentMove[i][j-1]) vecinos++;//Compara arriba si es true
            if(i>0) if(CurrentMove[i-1][j-1]) vecinos++; //izquierda superior 
            if(i<largo-1) if(CurrentMove[i+1][j-1]) vecinos++;//derecha superior
        }
        
        
        if(j < ancho-1){ //Compara la partde de abajo
            if(CurrentMove[i][j+1]) vecinos++;//compara la de abajo
            if(i>0) if(CurrentMove[i-1][j+1]) vecinos++;//compara izquina izquierda
            if(i<largo-1) if(CurrentMove[i+1][j+1]) vecinos++;//compara izquina derecha
        }
        
        if(i>0) if(CurrentMove[i-1][j]) vecinos++;//compara la izquierda
        if(i<largo-1) if(CurrentMove[i+1][j]) vecinos++;//compara derecha
        
        if(vecinos == 3) {//si tiene 3 vecinos sigue vivo
            vivas++;
            //totales++;
            return true;
        }
        
        if(vecinos > limite) {//si tiene 3 vecinos sigue vivo
            muertas++;   
        }
        
        
        if(CurrentMove[i][j] && vecinos == 0) {
            muertas++;
        }
        
        
        if(CurrentMove[i][j] && vecinos == limite-1) {
            vivas++;
            //totales++;
            return true;
        }
        
        
        return false;//porque no tiene vecinos o no tiene 3 vecinos
    }
    
    private void repain()
    {
        
        offscreenGraps.setColor(jPanel1.getBackground());//dibuja el grafico del color del panel
        offscreenGraps.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());//dibuja un rectangulo del tamaño del panel
     
        for (int i=0; i< largo;i++){
            for(int j =0;j<ancho;j++){
                
                
                if(CurrentMove[i][j])
                {
                    Random rn = new Random();
                    float r = rn.nextFloat() % 1;
                    float g = rn.nextFloat() % 1;
                    float b = rn.nextFloat()% 1;
                   offscreenGraps.setColor(new Color(r,g,b,1));//pinta en rojo si es verdadero la casilla
                int x= j*jPanel1.getWidth()/ancho;
                int y= i*jPanel1.getHeight()/largo;
                offscreenGraps.fillRect(x, y, jPanel1.getWidth()/ancho, jPanel1.getHeight()/largo);// x y y la posiocion y los demas 
                
                }
            }
            
        }
        
        offscreenGraps.setColor(Color.BLACK);
        
        //dibuja la linea largo en el grafico
        for (int i = 1;i<largo;i++ ){
            int y= i*jPanel1.getHeight()/largo;
            offscreenGraps.drawLine(0,y,jPanel1.getWidth(),y);
            
        }
        
        //dibujo la lineas del ancho en el grafico
        for (int j = 1; j<ancho;j++){
               int x= j*jPanel1.getWidth()/ancho; 
                offscreenGraps.drawLine(x,0,x,jPanel1.getHeight());
                
        }
        
        jPanel1.getGraphics().drawImage(offscreenImg, 0, 0, jPanel1);
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel1 = new javax.swing.JPanel();
        Atras = new javax.swing.JButton();
        Empezar = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Oficial.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada salir 1.png"))); // NOI18N
        Atras.setContentAreaFilled(false);
        Atras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada salir 2.png"))); // NOI18N
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Empezar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Play 1.png"))); // NOI18N
        Empezar.setContentAreaFilled(false);
        Empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpezarActionPerformed(evt);
            }
        });

        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stop boton 1.png"))); // NOI18N
        Reset.setContentAreaFilled(false);
        Reset.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stop boton 3.png"))); // NOI18N
        Reset.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stop boton 2.png"))); // NOI18N
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(Empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Empezar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
        if(!play){
        //Valida si das Click en el Panel nadamas
        int i= largo *evt.getY()/jPanel1.getHeight();//calcula posicion de i
        int j= ancho *evt.getX()/jPanel1.getWidth();// calcula posicion de j
        
        CurrentMove[i][j] = !CurrentMove[i][j];
        repain();
        

        }else 
            System.out.println("Es falso");
        //repain();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized
        offscreenImg = createImage(jPanel1.getWidth(),jPanel1.getHeight());
        
        offscreenGraps = offscreenImg.getGraphics();
        
        repain();
        
        
    }//GEN-LAST:event_jPanel1ComponentResized

    private void EmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpezarActionPerformed
        
        play = !play;//pasa a verdadero
        System.out.println(play);
        if(play){//si es verdadero prendio y se pone paysa
            
            Empezar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/Imagenes/Boton Pause.png")));
            //Empezar.setText("pausa");
        }else{
            
            Empezar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/Imagenes/Boton Play 1.png")));
            //Empezar.setText("Empezar");
        }
        
        repain();
    }//GEN-LAST:event_EmpezarActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        
        play=!play;//pasara a falso
        Empezar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/Imagenes/Boton Play 1.png")));
        CurrentMove = new boolean [largo][ancho];
        repain();
        estadisticas es = new estadisticas(vivas,muertas,totales,segs);
        es.setVisible(true);
        
    }//GEN-LAST:event_ResetActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        
        //ancho= Integer.parseInt(Ancho.getText()); 
        //largo = Integer.parseInt(Largo.getText());
        
       if(!play){
        int j = ancho * evt.getX() / jPanel1.getWidth();
        int i = largo * evt.getY() / jPanel1.getHeight();
        
        if(SwingUtilities.isLeftMouseButton(evt)){
            CurrentMove[i][j] = true;
        }else CurrentMove[i][j] = false;
        
        repain();
        
       }else
           System.out.println("Es falso");
           

    }//GEN-LAST:event_jPanel1MouseDragged

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        MainPortada mp = new MainPortada();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_AtrasActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Empezar;
    private javax.swing.JButton Reset;
    private javax.swing.JPanel jPanel1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Logo_icon.png")));
    }
}
