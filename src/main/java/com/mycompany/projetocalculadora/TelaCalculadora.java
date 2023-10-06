

package com.mycompany.projetocalculadora;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
   
/**
 *
 * @author joaoh
 */
public class TelaCalculadora extends javax.swing.JFrame {
    private Calculo calculo = new Calculo();
    private StringBuilder
            expressao = new StringBuilder();
    
    public TelaCalculadora() {
        initComponents();
        setupButtonListeners();
    }

    private void setupButtonListeners() {
        // Configurar listeners para os botões de números e operadores
        JButton[] botoesNumeros = {botao0, botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9};
        
        for (JButton botao : botoesNumeros) {
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    expressao.append(botao.getText());
                    visorCalculadora.setText(expressao.toString());
                }
            });
        }

        // Configurar listeners para os botões de operadores
        JButton[] botoesOperadores = {botaoSoma, botaoSub, botaoMult, botaoDiv, botaoRaiz, botaoPonto};
        
        for (JButton botao : botoesOperadores) {
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (expressao.length() > 0) {
                        char ultimoCaracter = expressao.charAt(expressao.length() - 1);
                        if (!Character.isDigit(ultimoCaracter)) {
                            // Remover o último operador (se houver) antes de adicionar um novo
                            expressao.deleteCharAt(expressao.length() - 1);
                        }
                    }
                    expressao.append(botao.getText());
                    visorCalculadora.setText(expressao.toString());
                }
            });
        }

        botaoCE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expressao.setLength(0);
                visorCalculadora.setText("");
            }
        });

        botaoIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resultado = calculo.toString();
                visorCalculadora.setText(resultado);
                expressao.setLength(0);
                expressao.append(resultado);
            }
        });
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton12 = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        titulo = new javax.swing.JLabel();
        botaoAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorCalculadora = new javax.swing.JTextPane();
        botaoCE = new javax.swing.JButton();
        botaoSoma = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botaoSub = new javax.swing.JButton();
        botaoMult = new javax.swing.JButton();
        botaoDiv = new javax.swing.JButton();
        botaoRaiz = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoPonto = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton12.setText("+");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame2.setBackground(new java.awt.Color(246, 246, 246));
        jInternalFrame2.setPreferredSize(new java.awt.Dimension(400, 500));
        jInternalFrame2.setVisible(true);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        titulo.setText("Projeto Calculadora Master");

        botaoAdd.setBackground(new java.awt.Color(0, 153, 153));
        botaoAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        botaoAdd.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdd.setText("+");

        jScrollPane1.setViewportView(visorCalculadora);

        botaoCE.setBackground(new java.awt.Color(204, 0, 51));
        botaoCE.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoCE.setForeground(new java.awt.Color(255, 255, 255));
        botaoCE.setText("CE");
        botaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCEMouseClicked(evt);
            }
        });

        botaoSoma.setBackground(new java.awt.Color(0, 102, 153));
        botaoSoma.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoSoma.setForeground(new java.awt.Color(255, 255, 255));
        botaoSoma.setText("+");
        botaoSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSomaMouseClicked(evt);
            }
        });

        botao2.setText("2");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao2MouseClicked(evt);
            }
        });

        botao1.setText("1");
        botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao1MouseClicked(evt);
            }
        });

        botao3.setText("3");
        botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao3MouseClicked(evt);
            }
        });

        botao5.setText("5");
        botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao5MouseClicked(evt);
            }
        });
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao4.setText("4");
        botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao4MouseClicked(evt);
            }
        });
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao6.setText("6");
        botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao6MouseClicked(evt);
            }
        });

        botaoSub.setBackground(new java.awt.Color(0, 102, 153));
        botaoSub.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoSub.setForeground(new java.awt.Color(255, 255, 255));
        botaoSub.setText("-");
        botaoSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSubMouseClicked(evt);
            }
        });

        botaoMult.setBackground(new java.awt.Color(0, 102, 153));
        botaoMult.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoMult.setForeground(new java.awt.Color(255, 255, 255));
        botaoMult.setText("*");
        botaoMult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMultMouseClicked(evt);
            }
        });

        botaoDiv.setBackground(new java.awt.Color(0, 102, 153));
        botaoDiv.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoDiv.setForeground(new java.awt.Color(255, 255, 255));
        botaoDiv.setText("/");
        botaoDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDivMouseClicked(evt);
            }
        });

        botaoRaiz.setBackground(new java.awt.Color(0, 102, 153));
        botaoRaiz.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoRaiz.setForeground(new java.awt.Color(255, 255, 255));
        botaoRaiz.setText("√");
        botaoRaiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRaizMouseClicked(evt);
            }
        });
        botaoRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRaizActionPerformed(evt);
            }
        });

        botaoIgual.setBackground(new java.awt.Color(0, 153, 0));
        botaoIgual.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoIgual.setForeground(new java.awt.Color(255, 255, 255));
        botaoIgual.setText("=");
        botaoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIgualMouseClicked(evt);
            }
        });

        botao7.setText("7");
        botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao7MouseClicked(evt);
            }
        });
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setText("8");
        botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao8MouseClicked(evt);
            }
        });
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao9.setText("9");
        botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao9MouseClicked(evt);
            }
        });
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao0.setText("0");
        botao0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao0MouseClicked(evt);
            }
        });
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botaoPonto.setText(".");
        botaoPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPontoMouseClicked(evt);
            }
        });
        botaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(botaoAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo)
                                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                                .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(botaoPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                                .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(botao9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(botaoRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                        .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(botao2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42)
                .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void botaoPontoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          
    
    
    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void botaoRaizActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
    }                                         

    private void botao1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botaoCEMouseClicked(java.awt.event.MouseEvent evt) {                                     
        visorCalculadora.setText("");
    }                                    

    private void botao2MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botao3MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botao4MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botao5MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botaoSomaMouseClicked(java.awt.event.MouseEvent evt) {                                       
       visorCalculadora.getText();
    }                                      

    private void botaoIgualMouseClicked(java.awt.event.MouseEvent evt) {                                        
        String valor = visorCalculadora.getText();
        System.out.println(">>>"+valor);
        Calculo calc = new Calculo();
        calc.equals(valor);
    }                                       

    private void botaoMultMouseClicked(java.awt.event.MouseEvent evt) {                                       
        visorCalculadora.getText();
    }                                      

    private void botao7MouseClicked(java.awt.event.MouseEvent evt) {                                    
       visorCalculadora.getText();
    }                                   

    private void botao8MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botao9MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botaoDivMouseClicked(java.awt.event.MouseEvent evt) {                                      
        visorCalculadora.getText();
    }                                     

    private void botao6MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botaoSubMouseClicked(java.awt.event.MouseEvent evt) {                                      
        visorCalculadora.getText();
    }                                     

    private void botao0MouseClicked(java.awt.event.MouseEvent evt) {                                    
        visorCalculadora.getText();
    }                                   

    private void botaoPontoMouseClicked(java.awt.event.MouseEvent evt) {                                        
        visorCalculadora.getText();
    }                                       

    private void botaoRaizMouseClicked(java.awt.event.MouseEvent evt) {                                       
        visorCalculadora.getText();
    }                                      

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDiv;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMult;
    private javax.swing.JButton botaoPonto;
    private javax.swing.JButton botaoRaiz;
    private javax.swing.JButton botaoSoma;
    private javax.swing.JButton botaoSub;
    private javax.swing.JButton jButton12;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextPane visorCalculadora;
    // End of variables declaration                   
}

