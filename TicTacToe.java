/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane; /* Memanggil Library javax.swing */

public class TicTacToe extends javax.swing.JFrame { //kelas TicTacToeToe yang dibuat dari JFrame 
    
    int nilai, nilaiX, nilaiO; //Mendelrasaikan variabel nilai, nilaiX, nilaiO

    public TicTacToe() { //Kelas TicTacToeToe
        initComponents();
        nilai = 1; //Menentukan value variabel nilai
        nilaiX = 0; //Menentukan value variabel nilaiX
        nilaiO = 0; //Menentukan value variabel nilaiO
    }
    
    void pemenang() {
        if ("X".equals(btn1.getText()) && "X".equals(btn2.getText()) && "X".equals(btn3.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn4.getText()) && "X".equals(btn5.getText()) && "X".equals(btn6.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn7.getText()) && "X".equals(btn8.getText()) && "X".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn1.getText()) && "X".equals(btn5.getText()) && "X".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn3.getText()) && "X".equals(btn5.getText()) && "X".equals(btn7.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn1.getText()) && "X".equals(btn4.getText()) && "X".equals(btn7.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn2.getText()) && "X".equals(btn5.getText()) && "X".equals(btn8.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn3.getText()) && "X".equals(btn6.getText()) && "X".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }

        if ("O".equals(btn1.getText()) && "O".equals(btn2.getText()) && "O".equals(btn3.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn4.getText()) && "O".equals(btn5.getText()) && "O".equals(btn6.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn7.getText()) && "O".equals(btn8.getText()) && "O".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn1.getText()) && "O".equals(btn5.getText()) && "O".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn3.getText()) && "O".equals(btn5.getText()) && "O".equals(btn7.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn1.getText()) && "O".equals(btn4.getText()) && "O".equals(btn7.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn2.getText()) && "O".equals(btn5.getText()) && "O".equals(btn8.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn3.getText()) && "O".equals(btn6.getText()) && "O".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        
  
    }
    
    void draw (){
    if ("O".equals(btn2.getText()) && "X".equals(btn1.getText()) && "X".equals(btn3.getText()) && "O".equals(btn4.getText()) && "O".equals(btn5.getText()) && "X".equals(btn6.getText()) && "X".equals(btn7.getText()) && btn8.getText() == "X" && btn9.getText() == "O"
            ) {
        } else if ("O".equals(btn1.getText()) && "X".equals(btn2.getText()) && "O".equals(btn3.getText()) && "X".equals(btn4.getText())
                && btn5.getText() == "X" && btn6.getText() == "O" && btn7.getText() == "X" && btn8.getText() == "O" && btn9.getText() == "X"
                ) {
            JOptionPane.showMessageDialog(rootPane, "Game Draw !!!");
        }
        
        else if ("X".equals(btn1.getText()) && "X".equals(btn2.getText()) && "O".equals(btn3.getText()) && "O".equals(btn4.getText())
                && "O".equals(btn5.getText()) && "X".equals(btn6.getText()) && btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "O"
                ) {
            JOptionPane.showMessageDialog(rootPane, "Game Draw !!!");
        }
        
        else if ("X".equals(btn5.getText())
                && "O".equals(btn1.getText()) && "O".equals(btn2.getText()) && "X".equals(btn3.getText()) && "X".equals(btn4.getText()) && btn6.getText() == "O" && btn7.getText() == "O" && btn8.getText() == "X" && btn9.getText() == "X"
                ) {
            JOptionPane.showMessageDialog(rootPane, "Game Draw !!!");
        }
        
        else {
            JOptionPane.showMessageDialog(rootPane, "Game Draw !!!");
        }
    
    }
    
    void reset() {
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;

        lblX.setText("0");
        lblO.setText("0");

        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        lblO = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btn3.setBackground(new java.awt.Color(0, 102, 51));
        btn3.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 102, 102));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 102, 51));
        btn1.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 102, 102));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 102, 51));
        btn4.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 102, 102));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 102, 51));
        btn5.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 102, 102));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 102, 51));
        btn6.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(0, 102, 102));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 102, 51));
        btn7.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(0, 102, 102));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        lblO.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblO.setText("0 kali");

        lblX.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("0 kali");

        resetbtn.setBackground(new java.awt.Color(0, 102, 0));
        resetbtn.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("RESET");
        resetbtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 102, 51));
        btn2.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 102, 102));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 102, 51));
        btn8.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 102, 102));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 102, 51));
        btn9.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(0, 102, 102));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Let's Play Tic Tac Toe");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel2)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblO, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         if (nilai == 1) {
            btn4.setText("X");
            btn4.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn4.setText("O");
            btn4.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
        }
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         if (nilai == 1) {
            btn5.setText("X");
            btn5.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn5.setText("O");
            btn5.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
        }
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         if (nilai == 1) {
            btn6.setText("X");
            btn6.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn6.setText("O");
            btn6.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
         }
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         if (nilai == 1) {
            btn3.setText("X");
            btn3.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn3.setText("O");
            btn3.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
         }
    }                                    

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        reset();
    }                                        

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         if (nilai == 1) {
            btn7.setText("X");
            btn7.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn7.setText("O");
            btn7.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
         }
    }                                    

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if (nilai == 1) {
            btn1.setText("X");
            btn1.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn1.setText("O");
            btn1.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
        }
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if (nilai == 1) {
            btn2.setText("X");
            btn2.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn2.setText("O");
            btn2.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
        }        // TODO add your handling code here:
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
            // TODO add your handling code here:
        if (nilai == 1) {
            btn8.setText("X");
            btn8.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn8.setText("O");
            btn8.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
        }
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
           // TODO add your handling code here:
        if (nilai == 1) {
            btn9.setText("X");
            btn9.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
            draw ();
        } else {
            btn9.setText("O");
            btn9.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
            draw ();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TicTacToe().setVisible(true);
        });
    }   

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblO;
    private javax.swing.JLabel lblX;
    private javax.swing.JButton resetbtn;
    // End of variables declaration                   
}