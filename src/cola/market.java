package cola;


public class market extends javax.swing.JFrame {
    
    Cola c=new Cola();

    public market() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cj1 = new javax.swing.JButton();
        cj2 = new javax.swing.JButton();
        cj3 = new javax.swing.JButton();
        u1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        u2 = new javax.swing.JLabel();
        u4 = new javax.swing.JLabel();
        u3 = new javax.swing.JLabel();
        u5 = new javax.swing.JLabel();
        u6 = new javax.swing.JLabel();
        u8 = new javax.swing.JLabel();
        u7 = new javax.swing.JLabel();
        u9 = new javax.swing.JLabel();
        adicionar = new javax.swing.JButton();
        us1 = new javax.swing.JLabel();
        us2 = new javax.swing.JLabel();
        us3 = new javax.swing.JLabel();
        us4 = new javax.swing.JLabel();
        us5 = new javax.swing.JLabel();
        us6 = new javax.swing.JLabel();
        us7 = new javax.swing.JLabel();
        us8 = new javax.swing.JLabel();
        us9 = new javax.swing.JLabel();
        primer = new javax.swing.JLabel();
        ultimo = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        llena = new javax.swing.JLabel();
        vacia = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        editar = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        usadd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SUPERMARKET");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cajero.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cajero.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cajero.jpg"))); // NOI18N

        cj1.setText("Cajero 1");
        cj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj1ActionPerformed(evt);
            }
        });

        cj2.setText("Cajero 2");
        cj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj2ActionPerformed(evt);
            }
        });

        cj3.setText("Cajero 3");
        cj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj3ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        adicionar.setText("Adicionar");
        adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarMouseClicked(evt);
            }
        });
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        us1.setText("      ");

        us2.setText("      ");

        us3.setText("      ");

        us4.setText("      ");

        us5.setText("      ");

        us6.setText("      ");

        us7.setText("      ");

        us8.setText("      ");

        us9.setText("      ");

        primer.setText("Primer Usuario:");

        ultimo.setText("Ultimo Usuario:");

        numero.setText("Nro. de Usuarios:");

        llena.setText("No esta llena");

        vacia.setText("Vacia");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        lb1.setText("Usuario a adicionar:");

        usadd.setText("usr1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cj3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cj2)
                            .addComponent(cj1))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numero)
                                    .addComponent(primer)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ultimo)
                                        .addGap(37, 37, 37))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(us1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(u1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(us2)
                                    .addComponent(u2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(us3)
                                            .addComponent(u3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(us4)
                                            .addComponent(u4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(us5)
                                            .addComponent(u5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(us6)
                                            .addComponent(u6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(us7)
                                                    .addComponent(u7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(us8)
                                                    .addComponent(u8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(us9)
                                                    .addComponent(u9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(llena)
                                            .addComponent(vacia)))
                                    .addComponent(jLabel1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(adicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editar)
                        .addGap(18, 18, 18)
                        .addComponent(lb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usadd)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cj1)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(cj2)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cj3)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(u9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(u2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(u4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(u3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(u6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(u5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(u7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(u8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(us1)
                    .addComponent(us2)
                    .addComponent(us3)
                    .addComponent(us4)
                    .addComponent(us5)
                    .addComponent(us6)
                    .addComponent(us7)
                    .addComponent(us8)
                    .addComponent(us9))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(primer, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ultimo)
                                .addGap(24, 24, 24)
                                .addComponent(numero))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionar)
                            .addComponent(editar)
                            .addComponent(lb1)
                            .addComponent(usadd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(llena)
                        .addGap(18, 18, 18)
                        .addComponent(vacia)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj1ActionPerformed
        c.Pop();
        vista();
    }//GEN-LAST:event_cj1ActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        c.Push(usadd.getText());
        vista();
        usadd.setText("usr"+c.getContador());
    }//GEN-LAST:event_adicionarActionPerformed

    private void cj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj2ActionPerformed
        c.Pop();
        vista();
    }//GEN-LAST:event_cj2ActionPerformed

    private void cj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj3ActionPerformed
        c.Pop();
        vista();
    }//GEN-LAST:event_cj3ActionPerformed

    private void adicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarMouseClicked
    }//GEN-LAST:event_adicionarMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        adicionar abrir = new adicionar();
        abrir.setVisible(true);
    }//GEN-LAST:event_editarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(market.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(market.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(market.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(market.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new market().setVisible(true);
            }
        });
    }
    
    public void vista(){
        if(c.Elementos()>=1){
            us1.setText(c.getElemento(1));
            u1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us1.setText(" ");
            u1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=2){
            us2.setText(c.getElemento(2));
            u2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us2.setText(" ");
            u2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=3){
            us3.setText(c.getElemento(3));
            u3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us3.setText(" ");
            u3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=4){
            us4.setText(c.getElemento(4));
            u4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us4.setText(" ");
            u4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=5){
            us5.setText(c.getElemento(5));
            u5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us5.setText(" ");
            u5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=6){
            us6.setText(c.getElemento(6));
            u6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us6.setText(" ");
            u6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=7){
            us7.setText(c.getElemento(7));
            u7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us7.setText(" ");
            u7.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=8){
            us8.setText(c.getElemento(8));
            u8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us8.setText(" ");
            u8.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=9){
            us9.setText(c.getElemento(9));
            u9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola/cliente.png")));
        }else{
            us9.setText(" ");
            u9.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        primer.setText("Primer Usuario: "+c.Primero() );
        ultimo.setText("Ultimo Usuario: "+c.Ultimo());
        numero.setText("Nro. de Usuarios: "+c.Elementos());
        llena.setText(c.EstaLlena());
        vacia.setText(c.EstaVacia());
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton cj1;
    private javax.swing.JButton cj2;
    private javax.swing.JButton cj3;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel llena;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel primer;
    private javax.swing.JLabel u1;
    private javax.swing.JLabel u2;
    private javax.swing.JLabel u3;
    private javax.swing.JLabel u4;
    private javax.swing.JLabel u5;
    private javax.swing.JLabel u6;
    private javax.swing.JLabel u7;
    private javax.swing.JLabel u8;
    private javax.swing.JLabel u9;
    private javax.swing.JLabel ultimo;
    private javax.swing.JLabel us1;
    private javax.swing.JLabel us2;
    private javax.swing.JLabel us3;
    private javax.swing.JLabel us4;
    private javax.swing.JLabel us5;
    private javax.swing.JLabel us6;
    private javax.swing.JLabel us7;
    private javax.swing.JLabel us8;
    private javax.swing.JLabel us9;
    public static javax.swing.JLabel usadd;
    private javax.swing.JLabel vacia;
    // End of variables declaration//GEN-END:variables
}
