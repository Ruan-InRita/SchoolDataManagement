
package View.Telas;

import java.awt.Component;
import java.awt.Frame;

public class ClienteMenu extends javax.swing.JFrame {

    public ClienteMenu() {
        initComponents();
    }
    
    int baseX = -1;  
    int baseY = -1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Meus Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 500, 165, 60));

        jButton2.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Designer/lupa.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 190, 50, 40));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Cadastrar Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 430, -1, 60));

        jButton9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 204, 204));
        jButton9.setText("Home");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, 30));
        jButton9.setBackground(new java.awt.Color(0, 0, 0,0));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 204));
        jTextField1.setForeground(new java.awt.Color(0, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        jTextField1.setSelectionColor(new java.awt.Color(0, 0, 153));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 1130, 10));

        jButton5.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 204, 204));
        jButton5.setText("Cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, 30));

        jButton6.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 204, 204));
        jButton6.setText("Produto");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, 30));

        jButton7.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButton7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 204, 204));
        jButton7.setText("Equipamento");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 160, 30));

        jButton8.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 204, 204));
        jButton8.setText("Venda");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 110, 30));

        jButton10.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 204, 204));
        jButton10.setText("Turma");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 100, 30));

        jButton11.setBackground(new java.awt.Color(0, 0, 0,0));
        jButton11.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 204, 204));
        jButton11.setText("Relatório");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 120, 30));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Designer/ENG.png"))); // NOI18N
        jButton12.setBorder(null);
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, 40, 40));
        jButton12.setBackground(new java.awt.Color(0, 0, 0,0));

        jButton13.setBackground(new java.awt.Color(0,0,0,0));
        jButton13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 255, 255));
        jButton13.setText("-");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 50, -1, 30));

        jButton14.setBackground(new java.awt.Color(0,0,0,0));
        jButton14.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 255, 255));
        jButton14.setText("X");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 50, 50, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 370, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Procurar Cliente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Designer/Design sem nome.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListarClientes LC = new ListarClientes();
        LC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
        CadastroCliente CC = new CadastroCliente();
        CC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ClienteMenu CM = new ClienteMenu();
        CM.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ProdutoMenu PM = new ProdutoMenu();
        PM.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Equipamento EP = new Equipamento();
        EP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        RealizarVenda rv = new RealizarVenda();
        rv.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Turma t = new Turma();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.setState ( Frame.ICONIFIED );

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal MP = new MenuPrincipal();
        MP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
         try{
           Component b = evt.getComponent();
        
           if ((this.baseX != -1) && (this.baseY != -1)) {  
               int x = b.getX() + evt.getX() - this.baseX;  
               int y = b.getY() + evt.getY() - this.baseY;  
               b.setLocation(x, y);  
               b.getParent().repaint();  
            } 
        }catch(java.lang.NullPointerException e){
            
        }
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        this.baseX = evt.getX();  
        this.baseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        this.baseX = -1;  
        this.baseY = -1;
    }//GEN-LAST:event_formMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
