/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hu765630
 * Name: Sylvia Hurst
 * Teacher's Name: Mr. Yeung
 * Course: ICS
 * Start Date: November 26, 2019
 * End Date: December 5, 2019
 * Description: A program that converts decimals to and from binary numbers,
 * and decimals to and from hexadecimals.
 * 
 */
public class FrmBinaryHexadec extends javax.swing.JFrame {

    /**
     * Creates new form FrmBinaryHexadec
     */
    public FrmBinaryHexadec() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblDesc1 = new javax.swing.JLabel();
        lblDesc2 = new javax.swing.JLabel();
        lblEnter1 = new javax.swing.JLabel();
        lblEnter2 = new javax.swing.JLabel();
        lblOut1 = new javax.swing.JLabel();
        lblOut2 = new javax.swing.JLabel();
        lblEnter3 = new javax.swing.JLabel();
        lblEnter4 = new javax.swing.JLabel();
        lblOut3 = new javax.swing.JLabel();
        lblOut4 = new javax.swing.JLabel();
        txtIn1 = new javax.swing.JTextField();
        txtIn2 = new javax.swing.JTextField();
        txtIn3 = new javax.swing.JTextField();
        txtIn4 = new javax.swing.JTextField();
        btnConvert1 = new javax.swing.JButton();
        btnConvert2 = new javax.swing.JButton();
        btnConvert3 = new javax.swing.JButton();
        btnConvert4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("~~ NUMBER CONVERTER ~~");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(140, 20, 300, 40);

        lblDesc1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblDesc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc1.setText("Decimal and Binary");
        getContentPane().add(lblDesc1);
        lblDesc1.setBounds(190, 70, 190, 40);

        lblDesc2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblDesc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc2.setText("Decimal and Hexadecimal");
        getContentPane().add(lblDesc2);
        lblDesc2.setBounds(180, 290, 210, 40);

        lblEnter1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblEnter1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEnter1.setText("Enter a decimal:");
        getContentPane().add(lblEnter1);
        lblEnter1.setBounds(20, 140, 140, 30);

        lblEnter2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblEnter2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEnter2.setText("Enter a binary num:");
        getContentPane().add(lblEnter2);
        lblEnter2.setBounds(20, 230, 140, 30);

        lblOut1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblOut1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOut1.setText("...");
        getContentPane().add(lblOut1);
        lblOut1.setBounds(420, 140, 130, 30);

        lblOut2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblOut2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOut2.setText("...");
        getContentPane().add(lblOut2);
        lblOut2.setBounds(420, 230, 130, 30);

        lblEnter3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblEnter3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEnter3.setText("Enter a decimal:");
        getContentPane().add(lblEnter3);
        lblEnter3.setBounds(20, 360, 140, 30);

        lblEnter4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblEnter4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEnter4.setText("Enter a hexadecimal:");
        getContentPane().add(lblEnter4);
        lblEnter4.setBounds(10, 450, 150, 30);

        lblOut3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblOut3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOut3.setText("...");
        getContentPane().add(lblOut3);
        lblOut3.setBounds(420, 360, 130, 30);

        lblOut4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblOut4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOut4.setText("...");
        getContentPane().add(lblOut4);
        lblOut4.setBounds(420, 450, 130, 30);

        txtIn1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        getContentPane().add(txtIn1);
        txtIn1.setBounds(180, 140, 110, 30);

        txtIn2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        getContentPane().add(txtIn2);
        txtIn2.setBounds(180, 230, 110, 30);

        txtIn3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        getContentPane().add(txtIn3);
        txtIn3.setBounds(180, 360, 110, 30);

        txtIn4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        getContentPane().add(txtIn4);
        txtIn4.setBounds(180, 450, 110, 30);

        btnConvert1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnConvert1.setText("CONVERT");
        btnConvert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvert1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvert1);
        btnConvert1.setBounds(310, 140, 90, 30);

        btnConvert2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnConvert2.setText("CONVERT");
        btnConvert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvert2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvert2);
        btnConvert2.setBounds(310, 230, 90, 30);

        btnConvert3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnConvert3.setText("CONVERT");
        btnConvert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvert3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvert3);
        btnConvert3.setBounds(310, 360, 90, 30);

        btnConvert4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnConvert4.setText("CONVERT");
        btnConvert4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvert4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvert4);
        btnConvert4.setBounds(310, 450, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvert1ActionPerformed
        
    //DECIMAL TO BINARY
    
    //One line of code that sets the label to display the result from the subroutine
    lblOut1.setText(decToBin(Integer.parseInt(txtIn1.getText())));
        
    }//GEN-LAST:event_btnConvert1ActionPerformed

    private void btnConvert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvert2ActionPerformed
        
    //BINARY TO DECIMAL
    
    //One line of code that sets the label to display the result from the subroutine
    lblOut2.setText(String.valueOf(binToDec(txtIn2.getText())));
        
    }//GEN-LAST:event_btnConvert2ActionPerformed

    private void btnConvert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvert3ActionPerformed
    
    //DECIMAL TO HEXADECIMAL
    
    //One line of code that sets the label to display the result from the subroutine
    lblOut3.setText(decToHex(Integer.parseInt(txtIn3.getText())));
    
    }//GEN-LAST:event_btnConvert3ActionPerformed

    private void btnConvert4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvert4ActionPerformed
    
    //HEXADECIMAL TO DECIMAL
    
    //One line of code that sets the label to display the result from the subroutine
    lblOut4.setText(String.valueOf(hexToDec(txtIn4.getText())));
    
    }//GEN-LAST:event_btnConvert4ActionPerformed

    //METHODS
    
    //1: DECIMAL TO BINARY
    public static String decToBin (int dec) {
        
        String bin = "";
        
        /*
            First step is to multiply 1 by 2 until we get a number that is greater than or equal to the dec
            Then, if the number is GREATER, we divide by 2 so it's as large as possible while smaller than the dec
            This acts as our limiter so that we can work backwards through the place columns of binary
            NOTE: if the decimal given is 1, the while loop will be skipped and the limiter will remain 1.
        
            Using the limiter as 'i', a for loop runs and checks if 'i', the next available place column value (ex. 8), can fit inside the current remaining decimal.
            If so, it sets the place column to 1, but if not, it remains 0.
            If the place column is set to 1, then the place column value is subtracted from the decimal.
            The temporary place column (0 or 1) is added to the binary String. Then the place column is reset to 0 for the next loop.
            This loops, having the i value be divided by 2 (to essentially become the next available place column value).
            This continues until the i value reaches a value below 1.
        */
        
        int limiter = 1;
        
        if (dec > 1) {
            while (limiter <= dec) {
                limiter = limiter * 2;
            }
            if (limiter > dec)
                limiter = limiter / 2;
        }
        
        int placeCol = 0;
        
        for (int i = limiter; i >= 1; i = i / 2){
            
            if (dec - i  >= 0) {
                placeCol = 1;
                dec = dec - i;
            }
                
            bin = bin + placeCol;
            placeCol = 0;
        }
        
        return (bin);
    }
    
    //2: BINARY TO DECIMAL
    public static int binToDec (String bin) {
        
        int dec = 0;
        int tempInt = 0;
        
        String revBin = "";
        
        //This reverses the String so that we can work through it backwards more easily.
        for (int i = bin.length() - 1; i >= 0; i--) {
            revBin = revBin + bin.charAt(i);
        }
        
        /*
            Now we have a String where the first place value on the left is the 1s, then moving to the right, it's the 2s, 4s, 8s, etc.
            Using this we can properly solve 2 to the power of the index value to get the number that the place value represents.
            If the index is 0, 2^0 = 1. If the index is 1, 2^1 = 2. If the index is 2, 2^2 = 4, and etc.
            The above addition plays when a place value is equal to 1. If it is 0, no extra value is added to the new decimal.
            The final resulting decimal will be achieved when the loop ends after adding all place values together.
        */
        
        for (int i = 0; i < revBin.length(); i++) {
            tempInt = Integer.parseInt(String.valueOf(revBin.charAt(i)));
            if (tempInt == 1)
                dec = (int) (dec + Math.pow(2, i));
        }
        
        return (dec);
    }
    
    //3: DECIMAL TO HEXADECIMAL
    public static String decToHex (int dec) {
        
        String revHex = "";
        
        /*
            Hexadecimals are noted in base 16, meaning the rightmost place column represents 1s, and as you move to the left, it's multiples of 16.
            Letters are used to fill in missing characters in the list of 16 elements.
            { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F }

            I take the quotient and remainder of the decimal number. The remainder is the index value for the next hexadecimal place column,
            and the quotient is the number that will be reused for the next loop.
            This goes into a do-while loop that ends when the quotient is equal to zero (when rounded down).
        
            This is all placed into a String in reverse, so it has to be re-read to a new String backwards before being returned to the main program.
        */
        
        char placeCol[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        int quotient = 0;
        int remainder = 0;
        
        do {
            quotient = (int)Math.floor(dec/16);
            remainder = dec%16;
            revHex = revHex + placeCol[remainder];
            dec = quotient;
        } while (quotient>0);
        
        //This reverses the String
        String hex = "";
        for (int i = revHex.length() - 1; i >= 0; i--) {
            hex = hex + revHex.charAt(i);
        }
        
        return (hex);
    }
    
    //4: HEXADECIMAL TO DECIMAL
    public static int hexToDec (String hex) {
        
        /*
            A for loop takes the value of each char, then uses the value (ex. D) multiplied by 16 to the power of the place column index (i).
            This is similar to the conversion from binary to decimal, but since it's base 16, we need to account for the letters.
            I decided to use a switch statement to incorporate all the letters'  values among the usual number values.
            The values for each character are summed up as the loop progresses. The loop ends when all characters have been added together.
        */
        
        int dec = 0;
        
        String revHex = "";
        
        //This reverses the String so that we can work through it backwards more easily.
        for (int i = hex.length() - 1; i >= 0; i--) {
            revHex = revHex + hex.charAt(i);
        }
        
        char tempChar = ' ';
        
        for (int i = 0; i < revHex.length(); i++) {
            tempChar = revHex.charAt(i);
            
            switch (tempChar) {
                case '1':
                {
                    dec = (int) (dec + 1*(Math.pow(16, i)));
                    break;
                }
                case '2':
                {
                    dec = (int) (dec + 2*(Math.pow(16, i)));
                    break;
                }
                case '3':
                {
                    dec = (int) (dec + 3*(Math.pow(16, i)));
                    break;
                }
                case '4':
                {
                    dec = (int) (dec + 4*(Math.pow(16, i)));
                    break;
                }
                case '5':
                {
                    dec = (int) (dec + 5*(Math.pow(16, i)));
                    break;
                }
                case '6':
                {
                    dec = (int) (dec + 6*(Math.pow(16, i)));
                    break;
                }
                case '7':
                {
                    dec = (int) (dec + 7*(Math.pow(16, i)));
                    break;
                }
                case '8':
                {
                    dec = (int) (dec + 8*(Math.pow(16, i)));
                    break;
                }
                case '9':
                {
                    dec = (int) (dec + 9*(Math.pow(16, i)));
                    break;
                }
                case 'A':
                {
                   dec = (int) (dec + 10*(Math.pow(16, i)));
                    break;
                }
                case 'B':
                {
                    dec = (int) (dec + 11*(Math.pow(16, i)));
                    break;
                }
                case 'C':
                {
                    dec = (int) (dec + 12*(Math.pow(16, i)));
                    break;
                }
                case 'D':
                {
                    dec = (int) (dec + 13*(Math.pow(16, i)));
                    break;
                }
                case 'E':
                {
                    dec = (int) (dec + 14*(Math.pow(16, i)));
                    break;
                }
                case 'F':
                {
                    dec = (int) (dec + 15*(Math.pow(16, i)));
                    break;
                }
                default:
                    break;
            }
            
        }
        
        return (dec);
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
            java.util.logging.Logger.getLogger(FrmBinaryHexadec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBinaryHexadec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBinaryHexadec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBinaryHexadec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBinaryHexadec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert1;
    private javax.swing.JButton btnConvert2;
    private javax.swing.JButton btnConvert3;
    private javax.swing.JButton btnConvert4;
    private javax.swing.JLabel lblDesc1;
    private javax.swing.JLabel lblDesc2;
    private javax.swing.JLabel lblEnter1;
    private javax.swing.JLabel lblEnter2;
    private javax.swing.JLabel lblEnter3;
    private javax.swing.JLabel lblEnter4;
    private javax.swing.JLabel lblOut1;
    private javax.swing.JLabel lblOut2;
    private javax.swing.JLabel lblOut3;
    private javax.swing.JLabel lblOut4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtIn1;
    private javax.swing.JTextField txtIn2;
    private javax.swing.JTextField txtIn3;
    private javax.swing.JTextField txtIn4;
    // End of variables declaration//GEN-END:variables
}
