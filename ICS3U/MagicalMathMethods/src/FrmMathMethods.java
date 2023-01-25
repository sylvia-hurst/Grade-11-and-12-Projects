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
 * Start Date: November 5, 2019
 * End Date: November 6, 2019
 * Description: Magical Math Methods
 */
public class FrmMathMethods extends javax.swing.JFrame {

    /**
     * Creates new form FrmMathMethods
     */
    public FrmMathMethods() {
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
        lblText1 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        lblText3 = new javax.swing.JLabel();
        lblText4 = new javax.swing.JLabel();
        lblText5 = new javax.swing.JLabel();
        lblText6 = new javax.swing.JLabel();
        lblText7 = new javax.swing.JLabel();
        lblText8 = new javax.swing.JLabel();
        lblOut8 = new javax.swing.JLabel();
        lblOut1 = new javax.swing.JLabel();
        lblOut2 = new javax.swing.JLabel();
        lblOut3 = new javax.swing.JLabel();
        lblOut4 = new javax.swing.JLabel();
        lblOut5 = new javax.swing.JLabel();
        lblOut6 = new javax.swing.JLabel();
        lblOut7 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        txt1a = new javax.swing.JTextField();
        txt1b = new javax.swing.JTextField();
        txt2b = new javax.swing.JTextField();
        txt2a = new javax.swing.JTextField();
        txt3a = new javax.swing.JTextField();
        txt3b = new javax.swing.JTextField();
        txt4b = new javax.swing.JTextField();
        txt4a = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        btn8 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Magical Math Methods");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(290, 30, 210, 40);

        lblText1.setText("Enter two numbers and click the button. The program will display the largest of the two numbers.");
        getContentPane().add(lblText1);
        lblText1.setBounds(30, 80, 620, 30);

        lblText2.setText("Enter two numbers and click the button. The program will display the smallest of the two numbers.");
        getContentPane().add(lblText2);
        lblText2.setBounds(30, 150, 610, 30);

        lblText3.setText("Enter two numbers and click the button. The program will display the first number to the power of the second.");
        getContentPane().add(lblText3);
        lblText3.setBounds(30, 220, 610, 30);

        lblText4.setText("Enter two side lengths of a right triangle. The program will display the hypotenuse of the triangle.");
        getContentPane().add(lblText4);
        lblText4.setBounds(30, 290, 620, 30);

        lblText5.setText("Enter a decimal value. The program will display the value rounded down to the nearest integer.");
        getContentPane().add(lblText5);
        lblText5.setBounds(30, 360, 610, 30);

        lblText6.setText("Enter a decimal value. The program will display the value rounded up to the nearest integer.");
        getContentPane().add(lblText6);
        lblText6.setBounds(30, 430, 620, 30);

        lblText7.setText("Enter an integer. The program will display the square root of the integer.");
        getContentPane().add(lblText7);
        lblText7.setBounds(30, 500, 600, 30);

        lblText8.setText("Enter an angle in degrees. The program will display the angle in radians.");
        getContentPane().add(lblText8);
        lblText8.setBounds(30, 570, 600, 30);

        lblOut8.setText("...");
        getContentPane().add(lblOut8);
        lblOut8.setBounds(680, 570, 50, 30);

        lblOut1.setText("...");
        getContentPane().add(lblOut1);
        lblOut1.setBounds(680, 90, 50, 30);

        lblOut2.setText("...");
        getContentPane().add(lblOut2);
        lblOut2.setBounds(680, 150, 50, 30);

        lblOut3.setText("...");
        getContentPane().add(lblOut3);
        lblOut3.setBounds(680, 220, 50, 30);

        lblOut4.setText("...");
        getContentPane().add(lblOut4);
        lblOut4.setBounds(680, 290, 50, 30);

        lblOut5.setText("...");
        getContentPane().add(lblOut5);
        lblOut5.setBounds(680, 360, 50, 30);

        lblOut6.setText("...");
        getContentPane().add(lblOut6);
        lblOut6.setBounds(680, 430, 50, 30);

        lblOut7.setText("...");
        getContentPane().add(lblOut7);
        lblOut7.setBounds(680, 500, 50, 30);

        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });
        getContentPane().add(txt8);
        txt8.setBounds(250, 600, 40, 30);

        txt1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1aActionPerformed(evt);
            }
        });
        getContentPane().add(txt1a);
        txt1a.setBounds(190, 110, 40, 30);

        txt1b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1bActionPerformed(evt);
            }
        });
        getContentPane().add(txt1b);
        txt1b.setBounds(300, 110, 40, 30);

        txt2b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2bActionPerformed(evt);
            }
        });
        getContentPane().add(txt2b);
        txt2b.setBounds(300, 180, 40, 30);

        txt2a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2aActionPerformed(evt);
            }
        });
        getContentPane().add(txt2a);
        txt2a.setBounds(190, 180, 40, 30);

        txt3a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3aActionPerformed(evt);
            }
        });
        getContentPane().add(txt3a);
        txt3a.setBounds(190, 250, 40, 30);

        txt3b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3bActionPerformed(evt);
            }
        });
        getContentPane().add(txt3b);
        txt3b.setBounds(300, 250, 40, 30);

        txt4b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4bActionPerformed(evt);
            }
        });
        getContentPane().add(txt4b);
        txt4b.setBounds(300, 320, 40, 30);

        txt4a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4aActionPerformed(evt);
            }
        });
        getContentPane().add(txt4a);
        txt4a.setBounds(190, 320, 40, 30);

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        getContentPane().add(txt5);
        txt5.setBounds(250, 390, 40, 30);

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        getContentPane().add(txt6);
        txt6.setBounds(250, 460, 40, 30);

        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });
        getContentPane().add(txt7);
        txt7.setBounds(250, 530, 40, 30);

        btn8.setText("CLICK");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(420, 600, 80, 30);

        btn1.setText("CLICK");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(420, 110, 80, 30);

        btn2.setText("CLICK");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(420, 180, 80, 30);

        btn3.setText("CLICK");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(420, 250, 80, 30);

        btn4.setText("CLICK");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(420, 320, 80, 30);

        btn5.setText("CLICK");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(420, 390, 80, 30);

        btn6.setText("CLICK");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(420, 460, 80, 30);

        btn7.setText("CLICK");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(420, 530, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Variable delcaration
    double num1a, num1b, num2a, num2b, num3a, num3b, num4a, num4b, num5, num6, num7, num8;
    double calc1, calc2, calc3, calc4, calc5, calc6, calc7, calc8;
    
    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1aActionPerformed

    private void txt1bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1bActionPerformed

    private void txt2bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2bActionPerformed

    private void txt2aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2aActionPerformed

    private void txt3aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3aActionPerformed

    private void txt3bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3bActionPerformed

    private void txt4bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4bActionPerformed

    private void txt4aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4aActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        //1: Outputs higher of two nums
        
        //Getting user input from text boxes
        num1a = Double.parseDouble(txt1a.getText());
        num1b = Double.parseDouble(txt1b.getText());
        
        //Performing the calculation
        calc1 = Math.max(num1a, num1b);
        
        //Setting the label to display the result
        lblOut1.setText(String.valueOf(calc1));
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //2: Outputs smaller of two nums
        
        //Getting user input from text boxes
        num2a = Double.parseDouble(txt2a.getText());
        num2b = Double.parseDouble(txt2b.getText());
        
        //Performing the calculation
        calc2 = Math.min(num2a, num2b);
        
        //Setting the label to display the result
        lblOut2.setText(String.valueOf(calc2));
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        //3: Outputs first num to the power of the second
        
        //Getting user input from text boxes
        num3a = Double.parseDouble(txt3a.getText());
        num3b = Double.parseDouble(txt3b.getText());
        
        //Performing the calculation
        calc3 = Math.pow(num3a, num3b);
        
        //Setting the label to display the result
        lblOut3.setText(String.valueOf(calc3));
        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        //4: Outputs the hypotenuse of a right triangle with the given legs
        
        //Getting user input from text boxes
        num4a = Double.parseDouble(txt4a.getText());
        num4b = Double.parseDouble(txt4b.getText());
        
        //Performing the calculation
        calc4 = Math.hypot(num4a, num4b);
        
        //Setting the label to display the result
        lblOut4.setText(String.valueOf(calc4));
        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        //5: Outputs the decimal rounded down to the nearest whole number
        
        //Getting user input from text boxes
        num5 = Double.parseDouble(txt5.getText());
        
        //Performing the calculation
        calc5 = Math.floor(num5);
        
        //Setting the label to display the result
        lblOut5.setText(String.valueOf(calc5));
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        //6: Outputs the decimal rounded up to the nearest whole number
        
        //Getting user input from text boxes
        num6 = Double.parseDouble(txt6.getText());
        
        //Performing the calculation
        calc6 = Math.ceil(num6);
        
        //Setting the label to display the result
        lblOut6.setText(String.valueOf(calc6));
        
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        //7: Outputs the square root of a num
        
        //Getting user input from text boxes
        num7 = Double.parseDouble(txt7.getText());
        
        //Performing the calculation
        calc7 = Math.sqrt(num7);
        
        //Setting the label to display the result
        lblOut7.setText(String.valueOf(calc7));
        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        //8: Outputs an angle in radians when given in degrees
        
        //Getting user input from text boxes
        num8 = Double.parseDouble(txt8.getText());
        
        //Performing the calculation
        calc8 = Math.toRadians(num8);
        
        //Setting the label to display the result
        lblOut8.setText(String.valueOf(calc8));
        
    }//GEN-LAST:event_btn8ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JLabel lblOut1;
    private javax.swing.JLabel lblOut2;
    private javax.swing.JLabel lblOut3;
    private javax.swing.JLabel lblOut4;
    private javax.swing.JLabel lblOut5;
    private javax.swing.JLabel lblOut6;
    private javax.swing.JLabel lblOut7;
    private javax.swing.JLabel lblOut8;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblText3;
    private javax.swing.JLabel lblText4;
    private javax.swing.JLabel lblText5;
    private javax.swing.JLabel lblText6;
    private javax.swing.JLabel lblText7;
    private javax.swing.JLabel lblText8;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txt1a;
    private javax.swing.JTextField txt1b;
    private javax.swing.JTextField txt2a;
    private javax.swing.JTextField txt2b;
    private javax.swing.JTextField txt3a;
    private javax.swing.JTextField txt3b;
    private javax.swing.JTextField txt4a;
    private javax.swing.JTextField txt4b;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    // End of variables declaration//GEN-END:variables
}
