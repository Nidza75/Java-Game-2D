/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_TicToe_Game;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikola Pavlovic
 */
public class Java_TicToe_Game extends javax.swing.JFrame {
    
    private String StartGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;

    /**
     * Creates new form Java_TicToe_Game
     */
    public Java_TicToe_Game() {
        initComponents(); 
        
    }
private void gameScore()
{
    jLabelPlayerX.setText(String.valueOf(xCount));
    jLabelPlayerO.setText(String.valueOf(oCount));
}

private void choose_a_Player()
{
    if(StartGame.equalsIgnoreCase("X"))
    {
        StartGame = "O";
    }
        else
    {
        StartGame = "X";
    }
}
private void WinningGame()
{
    String b1 = jbtnTic1.getText();
    String b2 = jbtnTic1.getText();
    String b3 = jbtnTic1.getText();
    String b4 = jbtnTic1.getText();
    String b5 = jbtnTic1.getText();
    String b6 = jbtnTic1.getText();
    String b7 = jbtnTic1.getText();
    String b8 = jbtnTic1.getText();
    String b9 = jbtnTic1.getText();



if (b1 == ("X") && b2 == ("X") && b3 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic1.setBackground(Color.CYAN);
            jbtnTic2.setBackground(Color.CYAN);
            jbtnTic3.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}
if (b4 == ("X") && b5 == ("X") && b6 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}
if (b7 == ("X") && b8 == ("X") && b9 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic7.setBackground(Color.CYAN);
            jbtnTic8.setBackground(Color.CYAN);
            jbtnTic9.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}
if (b4 == ("X") && b5 == ("X") && b6 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}
if (b1 == ("X") && b4 == ("X") && b7 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic1.setBackground(Color.CYAN);
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic7.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}

if (b2 == ("X") && b5 == ("X") && b8 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic2.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic8.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}
if (b3 == ("X") && b6 == ("X") && b9 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic3.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            jbtnTic9.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}
if (b1 == ("X") && b4 == ("X") && b7 ==("X") )
{ 
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic1.setBackground(Color.CYAN);
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic7.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}if (b1 == ("X") && b5 == ("X") && b9 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic1.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic9.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}
if (b3 == ("X") && b5 == ("X") && b7 ==("X") )
{
    JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic3.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic7.setBackground(Color.CYAN);
         xCount++;
         gameScore();
         
}


// this was all X  player winning conditions

if (b1 == ("O") && b2 == ("O") && b3 ==("O") )
{
    JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic3.setBackground(Color.GREEN);
         oCount++;
         gameScore();
         
}

if (b4 == ("O") && b5 == ("O") && b6 ==("O") )
{
    JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
         oCount++;
         gameScore();
         
}
if (b7 == ("O") && b8 == ("O") && b9 ==("O") )
{
    JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
         oCount++;
         gameScore();
         
}

    if (b1 == ("O") && b4 == ("O") && b7 ==("O") )
    {
    JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);
         oCount++;
         gameScore();
         
}
      if (b2 == ("O") && b5 == ("O") && b8 ==("O") )
    {
    JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
         oCount++;
         gameScore();
         
}
          if (b3 == ("O") && b6 == ("O") && b9 ==("O") )
    {
    JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
         oCount++;
         gameScore();
         
}

     if (b1 == ("O") && b5 == ("O") && b9 ==("O") )
    {
    JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
         oCount++;
         gameScore();
         
}
         if (b3 == ("O") && b5 == ("O") && b7 ==("O") )
    {
    JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);
         oCount++;
         gameScore();
         
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jLabelPicture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelPlayerX = new javax.swing.JLabel();
        jLabelPlayerO = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButtonNewGame = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTic3.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 200, 170));

        jbtnTic9.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 200, 170));

        jbtnTic2.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 200, 170));

        jbtnTic4.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, 170));

        jbtnTic5.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 200, 170));

        jbtnTic6.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 200, 170));

        jbtnTic7.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 200, 170));

        jbtnTic8.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 200, 170));

        jbtnTic1.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 170));

        jLabelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Java_TicToe_Game/CP.png"))); // NOI18N
        jLabelPicture.setText("jLabelPic");
        jLabelPicture.setOpaque(true);
        jPanel3.add(jLabelPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 190, 70));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Code Power ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 300, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 680, 690));

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 66)); // NOI18N
        jLabel2.setText("Player O:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 80));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 66)); // NOI18N
        jLabel3.setText("Player X:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 80));

        jLabelPlayerX.setFont(new java.awt.Font("Dialog", 1, 66)); // NOI18N
        jLabelPlayerX.setText("0");
        jLabelPlayerX.setOpaque(true);
        jPanel5.add(jLabelPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 290, 80));

        jLabelPlayerO.setFont(new java.awt.Font("Dialog", 1, 66)); // NOI18N
        jLabelPlayerO.setText("0");
        jLabelPlayerO.setOpaque(true);
        jPanel5.add(jLabelPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 290, 80));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 640, 320));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 200, 170));

        jButtonNewGame.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jButtonNewGame.setText("New Game");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 620, 140));

        jbtnreset.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jbtnreset.setText("Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 290, 130));

        jButtonExit.setFont(new java.awt.Font("Dialog", 2, 65)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 310, 130));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 640, 320));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 690, 690));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 640, 70));

        jPanel8.setBackground(new java.awt.Color(95, 158, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setText("Java Tic Tac Toe Game");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 750, 70));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1380, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
          jbtnTic3.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();

    
                
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        
                jbtnTic9.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();
 
    }//GEN-LAST:event_jbtnTic9ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        jbtnTic2.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();

    
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        
            jbtnTic4.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();

    
    
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        
            jbtnTic5.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();

    
    
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        
            jbtnTic6.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();

    
    
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
            jbtnTic7.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
       
                jbtnTic8.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();
    
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        jbtnTic9.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }                                        
    choose_a_Player();
    WinningGame();
    }//GEN-LAST:event_jButtonNewGameActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
       jbtnTic1.setText(StartGame);
       
       if (StartGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
    }//GEN-LAST:event_jbtnTic1ActionPerformed
    choose_a_Player();
    WinningGame();

    }
    
    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jLabelPlayerX.setText("0");
         jLabelPlayerO.setText("0");
        
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
         jbtnTic1.setBackground(Color.LIGHT_GRAY);
         jbtnTic2.setBackground(Color.LIGHT_GRAY);
         jbtnTic3.setBackground(Color.LIGHT_GRAY);
         jbtnTic4.setBackground(Color.LIGHT_GRAY);
         jbtnTic5.setBackground(Color.LIGHT_GRAY);
         jbtnTic6.setBackground(Color.LIGHT_GRAY);
         jbtnTic7.setBackground(Color.LIGHT_GRAY);
         jbtnTic8.setBackground(Color.LIGHT_GRAY);
         jbtnTic9.setBackground(Color.LIGHT_GRAY);
        
        
        
        
        
    }//GEN-LAST:event_jbtnresetActionPerformed
   private JFrame frame;
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe", 
                JOptionPane.YES_NO_OPTION  )== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

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
            java.util.logging.Logger.getLogger(Java_TicToe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicToe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicToe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicToe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicToe_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelPlayerO;
    private javax.swing.JLabel jLabelPlayerX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JButton jbtnreset;
    // End of variables declaration//GEN-END:variables

    private static class Jframe {

        public Jframe() {
        }
    }
}
