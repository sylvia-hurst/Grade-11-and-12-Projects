import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author hu765630
 */
public class FrmLeft extends javax.swing.JFrame {

    JFrame parentFrame;   
    
    
    /**
     * Creates new form FrmSimonSays
     */
    public FrmLeft(FrmRight parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
    }
    
    public void frames() {
        FrmRight left = new FrmRight();
        parentFrame.setVisible(true);
        this.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblG00 = new javax.swing.JLabel();
        lblG01 = new javax.swing.JLabel();
        lblG02 = new javax.swing.JLabel();
        lblG10 = new javax.swing.JLabel();
        lblG11 = new javax.swing.JLabel();
        lblG12 = new javax.swing.JLabel();
        lblG20 = new javax.swing.JLabel();
        lblG21 = new javax.swing.JLabel();
        lblG22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblG00.setBackground(new java.awt.Color(0, 0, 102));
        lblG00.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG00.setForeground(new java.awt.Color(255, 255, 255));
        lblG00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG00.setOpaque(true);

        lblG01.setBackground(new java.awt.Color(0, 0, 102));
        lblG01.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG01.setForeground(new java.awt.Color(255, 255, 255));
        lblG01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG01.setOpaque(true);

        lblG02.setBackground(new java.awt.Color(0, 0, 102));
        lblG02.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG02.setForeground(new java.awt.Color(255, 255, 255));
        lblG02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG02.setOpaque(true);

        lblG10.setBackground(new java.awt.Color(0, 0, 102));
        lblG10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG10.setForeground(new java.awt.Color(255, 255, 255));
        lblG10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG10.setOpaque(true);

        lblG11.setBackground(new java.awt.Color(0, 0, 102));
        lblG11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG11.setForeground(new java.awt.Color(255, 255, 255));
        lblG11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG11.setOpaque(true);

        lblG12.setBackground(new java.awt.Color(0, 0, 102));
        lblG12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG12.setForeground(new java.awt.Color(255, 255, 255));
        lblG12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG12.setOpaque(true);

        lblG20.setBackground(new java.awt.Color(0, 0, 102));
        lblG20.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG20.setForeground(new java.awt.Color(255, 255, 255));
        lblG20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG20.setOpaque(true);

        lblG21.setBackground(new java.awt.Color(0, 0, 102));
        lblG21.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG21.setForeground(new java.awt.Color(255, 255, 255));
        lblG21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG21.setOpaque(true);

        lblG22.setBackground(new java.awt.Color(0, 0, 102));
        lblG22.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblG22.setForeground(new java.awt.Color(255, 255, 255));
        lblG22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG22.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblG00, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblG01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblG02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblG10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblG11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblG12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblG20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblG21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblG22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblG00, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblG10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblG20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //SIMON SAYS
    //Variable declarations:
    
    //List of tiles in the pattern
    static ArrayList pattern = new ArrayList();
    
    //Methods:
    
    //Generate pattern
    public static ArrayList genPattern(){
        pattern.add((int)(Math.random()*9)+1);
        return pattern;
    }
    
    //Display pattern
    public static void disPattern(){
        for (int i=0;i<pattern.size();i++){
            switch ((int)(pattern.get(i))){
                case 1:
                    lblG00.setBackground(new java.awt.Color(51, 153, 255));
                    lblG01.setBackground(new java.awt.Color(0, 0, 102));
                    lblG02.setBackground(new java.awt.Color(0, 0, 102));
                    lblG10.setBackground(new java.awt.Color(0, 0, 102));
                    lblG11.setBackground(new java.awt.Color(0, 0, 102));
                    lblG12.setBackground(new java.awt.Color(0, 0, 102));
                    lblG20.setBackground(new java.awt.Color(0, 0, 102));
                    lblG21.setBackground(new java.awt.Color(0, 0, 102));
                    lblG22.setBackground(new java.awt.Color(0, 0, 102));
                    break;
                case 2:
                    lblG01.setBackground(new java.awt.Color(51, 153, 255));
                    lblG00.setBackground(new java.awt.Color(0, 0, 102));
                    lblG02.setBackground(new java.awt.Color(0, 0, 102));
                    lblG10.setBackground(new java.awt.Color(0, 0, 102));
                    lblG11.setBackground(new java.awt.Color(0, 0, 102));
                    lblG12.setBackground(new java.awt.Color(0, 0, 102));
                    lblG20.setBackground(new java.awt.Color(0, 0, 102));
                    lblG21.setBackground(new java.awt.Color(0, 0, 102));
                    lblG22.setBackground(new java.awt.Color(0, 0, 102));
                    break;
                case 3:
                    lblG02.setBackground(new java.awt.Color(51, 153, 255));
                    lblG00.setBackground(new java.awt.Color(0, 0, 102));
                    lblG01.setBackground(new java.awt.Color(0, 0, 102));
                    lblG10.setBackground(new java.awt.Color(0, 0, 102));
                    lblG11.setBackground(new java.awt.Color(0, 0, 102));
                    lblG12.setBackground(new java.awt.Color(0, 0, 102));
                    lblG20.setBackground(new java.awt.Color(0, 0, 102));
                    lblG21.setBackground(new java.awt.Color(0, 0, 102));
                    lblG22.setBackground(new java.awt.Color(0, 0, 102));
                    break;
                case 4:
                    lblG10.setBackground(new java.awt.Color(51, 153, 255));
                    lblG00.setBackground(new java.awt.Color(0, 0, 102));
                    lblG01.setBackground(new java.awt.Color(0, 0, 102));
                    lblG02.setBackground(new java.awt.Color(0, 0, 102));
                    lblG11.setBackground(new java.awt.Color(0, 0, 102));
                    lblG12.setBackground(new java.awt.Color(0, 0, 102));
                    lblG20.setBackground(new java.awt.Color(0, 0, 102));
                    lblG21.setBackground(new java.awt.Color(0, 0, 102));
                    lblG22.setBackground(new java.awt.Color(0, 0, 102));
                    break;
                case 5:
                    lblG11.setBackground(new java.awt.Color(51, 153, 255));
                    lblG00.setBackground(new java.awt.Color(0, 0, 102));
                    lblG01.setBackground(new java.awt.Color(0, 0, 102));
                    lblG02.setBackground(new java.awt.Color(0, 0, 102));
                    lblG10.setBackground(new java.awt.Color(0, 0, 102));
                    lblG12.setBackground(new java.awt.Color(0, 0, 102));
                    lblG20.setBackground(new java.awt.Color(0, 0, 102));
                    lblG21.setBackground(new java.awt.Color(0, 0, 102));
                    lblG22.setBackground(new java.awt.Color(0, 0, 102));
                    break;
                case 6:
                    lblG12.setBackground(new java.awt.Color(51, 153, 255));
                    lblG00.setBackground(new java.awt.Color(0, 0, 102));
                    lblG01.setBackground(new java.awt.Color(0, 0, 102));
                    lblG02.setBackground(new java.awt.Color(0, 0, 102));
                    lblG10.setBackground(new java.awt.Color(0, 0, 102));
                    lblG11.setBackground(new java.awt.Color(0, 0, 102));
                    lblG20.setBackground(new java.awt.Color(0, 0, 102));
                    lblG21.setBackground(new java.awt.Color(0, 0, 102));
                    lblG22.setBackground(new java.awt.Color(0, 0, 102));
                    break;
                case 7:
                    lblG20.setBackground(new java.awt.Color(51, 153, 255));
                    lblG00.setBackground(new java.awt.Color(0, 0, 102));
                    lblG01.setBackground(new java.awt.Color(0, 0, 102));
                    lblG02.setBackground(new java.awt.Color(0, 0, 102));
                    lblG10.setBackground(new java.awt.Color(0, 0, 102));
                    lblG11.setBackground(new java.awt.Color(0, 0, 102));
                    lblG12.setBackground(new java.awt.Color(0, 0, 102));
                    lblG21.setBackground(new java.awt.Color(0, 0, 102));
                    lblG22.setBackground(new java.awt.Color(0, 0, 102));
                    break;
                case 8:
                    lblG21.setBackground(new java.awt.Color(51, 153, 255));
                    lblG00.setBackground(new java.awt.Color(0, 0, 102));
                    lblG01.setBackground(new java.awt.Color(0, 0, 102));
                    lblG02.setBackground(new java.awt.Color(0, 0, 102));
                    lblG10.setBackground(new java.awt.Color(0, 0, 102));
                    lblG11.setBackground(new java.awt.Color(0, 0, 102));
                    lblG12.setBackground(new java.awt.Color(0, 0, 102));
                    lblG20.setBackground(new java.awt.Color(0, 0, 102));
                    lblG22.setBackground(new java.awt.Color(0, 0, 102));
                    break;
                case 9:
                    lblG22.setBackground(new java.awt.Color(51, 153, 255));
                    lblG00.setBackground(new java.awt.Color(0, 0, 102));
                    lblG01.setBackground(new java.awt.Color(0, 0, 102));
                    lblG02.setBackground(new java.awt.Color(0, 0, 102));
                    lblG10.setBackground(new java.awt.Color(0, 0, 102));
                    lblG11.setBackground(new java.awt.Color(0, 0, 102));
                    lblG12.setBackground(new java.awt.Color(0, 0, 102));
                    lblG20.setBackground(new java.awt.Color(0, 0, 102));
                    lblG21.setBackground(new java.awt.Color(0, 0, 102));
                    break;
            }
            
            //Update
            lblG00.paintImmediately(lblG00.getVisibleRect());
            lblG01.paintImmediately(lblG01.getVisibleRect());
            lblG02.paintImmediately(lblG02.getVisibleRect());
            lblG10.paintImmediately(lblG10.getVisibleRect());
            lblG11.paintImmediately(lblG11.getVisibleRect());
            lblG12.paintImmediately(lblG12.getVisibleRect());
            lblG20.paintImmediately(lblG20.getVisibleRect());
            lblG21.paintImmediately(lblG21.getVisibleRect());
            lblG22.paintImmediately(lblG22.getVisibleRect());
            
            waitASec();
            
            lblG00.setBackground(new java.awt.Color(0, 0, 102));
            lblG01.setBackground(new java.awt.Color(0, 0, 102));
            lblG02.setBackground(new java.awt.Color(0, 0, 102));
            lblG10.setBackground(new java.awt.Color(0, 0, 102));
            lblG11.setBackground(new java.awt.Color(0, 0, 102));
            lblG12.setBackground(new java.awt.Color(0, 0, 102));
            lblG20.setBackground(new java.awt.Color(0, 0, 102));
            lblG21.setBackground(new java.awt.Color(0, 0, 102));
            lblG22.setBackground(new java.awt.Color(0, 0, 102));
            
            //Update
            lblG00.paintImmediately(lblG00.getVisibleRect());
            lblG01.paintImmediately(lblG01.getVisibleRect());
            lblG02.paintImmediately(lblG02.getVisibleRect());
            lblG10.paintImmediately(lblG10.getVisibleRect());
            lblG11.paintImmediately(lblG11.getVisibleRect());
            lblG12.paintImmediately(lblG12.getVisibleRect());
            lblG20.paintImmediately(lblG20.getVisibleRect());
            lblG21.paintImmediately(lblG21.getVisibleRect());
            lblG22.paintImmediately(lblG22.getVisibleRect());
            
            waitAMo();
            
        }
    }
    
    //Wait 0.3 second
    public static void waitASec(){
        int millis;
        int currentTime = (int) System.currentTimeMillis();
        while(true){
            millis = (int) (System.currentTimeMillis() - currentTime);
            if (millis>300){
                break;
            }
        }
    }
    
    //Wait 0.1 second
    public static void waitAMo(){
        int millis;
        int currentTime = (int) System.currentTimeMillis();
        while(true){
            millis = (int) (System.currentTimeMillis() - currentTime);
            if (millis>100){
                break;
            }
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(FrmLeft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLeft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLeft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLeft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel lblG00;
    private static javax.swing.JLabel lblG01;
    private static javax.swing.JLabel lblG02;
    private static javax.swing.JLabel lblG10;
    private static javax.swing.JLabel lblG11;
    private static javax.swing.JLabel lblG12;
    private static javax.swing.JLabel lblG20;
    private static javax.swing.JLabel lblG21;
    private static javax.swing.JLabel lblG22;
    // End of variables declaration//GEN-END:variables
}
