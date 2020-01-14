package cola;


public class market extends javax.swing.JFrame {
    
    Cola c=new Cola();
    Cola caja1 = new Cola();
    Cola caja2 = new Cola();
    Cola caja3 = new Cola();

    public market() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        lb1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ed1 = new javax.swing.JLabel();
        ed2 = new javax.swing.JLabel();
        ed3 = new javax.swing.JLabel();
        ed4 = new javax.swing.JLabel();
        ed6 = new javax.swing.JLabel();
        ed5 = new javax.swing.JLabel();
        ed7 = new javax.swing.JLabel();
        ed8 = new javax.swing.JLabel();
        ed9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usadd = new javax.swing.JTextField();
        edadd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        HC1 = new javax.swing.JButton();
        HC2 = new javax.swing.JButton();
        HC3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("MINIMARKET");

        cj1.setText("Atender");
        cj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj1ActionPerformed(evt);
            }
        });

        cj2.setText("Atender");
        cj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj2ActionPerformed(evt);
            }
        });

        cj3.setText("Atender");
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

        lb1.setText("Usuario a adicionar: ");

        jLabel5.setText("->");

        ed9.setText("      ");

        jLabel6.setText("Caja 3ra Edad");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Edad:");

        usadd.setText("usr1");
        usadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usaddActionPerformed(evt);
            }
        });

        edadd.setText("18");
        edadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edaddActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre:");

        jLabel10.setText("Edad:");

        HC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Caja.jpg"))); // NOI18N
        HC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HC1ActionPerformed(evt);
            }
        });

        HC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Caja.jpg"))); // NOI18N
        HC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HC2ActionPerformed(evt);
            }
        });

        HC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Caja.jpg"))); // NOI18N
        HC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HC3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Caja 2");

        jLabel11.setText("Caja 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cj3)
                            .addComponent(cj2)
                            .addComponent(cj1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HC2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(HC3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HC1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(llena)
                            .addComponent(vacia)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero)
                            .addComponent(primer)
                            .addComponent(ultimo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(adicionar)
                        .addGap(32, 32, 32)
                        .addComponent(lb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usadd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel9))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edadd)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(us1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(u2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ed2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(us2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ed3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(u3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(us3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(u4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ed4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(us4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(u5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ed5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(us5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(us6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(ed6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ed7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(us7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ed8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(us8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(u9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(us9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ed9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HC1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cj1)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HC2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cj2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)
                                .addComponent(HC3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cj3)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(u2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(u9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(us9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ed1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed9)
                            .addComponent(ed2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(llena)
                                .addGap(18, 18, 18)
                                .addComponent(vacia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(primer, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ultimo)
                                .addGap(24, 24, 24)
                                .addComponent(numero))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionar)
                            .addComponent(lb1)
                            .addComponent(jLabel5)
                            .addComponent(usadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj1ActionPerformed
        Usuario aux=c.Pop();
        if(aux!=null){
            if(caja1.EstaLlena().equals("Llena")){
                caja1.Pop();
            }
            caja1.Push(aux.getNombre(),aux.getEdad());
        }
        vista();
    }//GEN-LAST:event_cj1ActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        c.Push(usadd.getText(),Integer.parseInt(edadd.getText()));
        vista();
        usadd.setText("usr"+c.getContador());
        edadd.setText("18");
    }//GEN-LAST:event_adicionarActionPerformed

    private void cj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj2ActionPerformed
        Usuario aux=c.Pop();
        if(aux!=null){
            if(caja2.EstaLlena().equals("Llena")){
                caja2.Pop();
            }
            caja2.Push(aux.getNombre(),aux.getEdad());
        }
        vista();
    }//GEN-LAST:event_cj2ActionPerformed

    private void cj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj3ActionPerformed
        Usuario aux=Determinar();
        if(aux!=null){
            if(caja3.EstaLlena().equals("Llena")){
                caja3.Pop();
            }
            caja3.Push(aux.getNombre(),aux.getEdad());
        }
        vista();
    }//GEN-LAST:event_cj3ActionPerformed

    private void adicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarMouseClicked
    }//GEN-LAST:event_adicionarMouseClicked

    private void usaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usaddActionPerformed

    private void edaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edaddActionPerformed

    private void HC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HC1ActionPerformed
        // TODO add your handling code here:Caja1
        Historial abrir = new Historial(caja1);
        abrir.setVisible(true);
    }//GEN-LAST:event_HC1ActionPerformed

    private void HC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HC2ActionPerformed
        // TODO add your handling code here:
        Historial abrir = new Historial(caja2);
        abrir.setVisible(true);
    }//GEN-LAST:event_HC2ActionPerformed

    private void HC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HC3ActionPerformed
        // TODO add your handling code here:
        Historial abrir = new Historial(caja3);
        abrir.setVisible(true);
    }//GEN-LAST:event_HC3ActionPerformed

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
    
    public Usuario Determinar(){
        Usuario r=null;
        Usuario us=null;
        int sw=0;
        Cola aux = new Cola();
        while(!c.EstaVacia().equals("Vacia")){
            us=c.Pop();
            if(us.getEdad()>=60 && sw==0){
                r=us;
                sw=1;
            }else{
                aux.Push(us.getNombre(),us.getEdad());
            }
        }
        while(!aux.EstaVacia().equals("Vacia")){
            us=aux.Pop();
            c.Push(us.getNombre(),us.getEdad());
        }
        if(r==null){
            r=c.Pop();
            if(r!=null){
            if(caja2.EstaLlena().equals("Llena")){
                caja2.Pop();
            }
            caja2.Push(r.getNombre(),r.getEdad());
        }
        }
        return r;
    }
    
    public void vista(){
        int id=0;
        
        if(c.Elementos()>=1){
            id=1;
            us1.setText(c.getColaN(id));
            ed1.setText(c.getColaE(id)+"");
            u1.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us1.setText(" ");
            ed1.setText(" ");
            u1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=2){
            id=2;
            us2.setText(c.getColaN(id));
            ed2.setText(c.getColaE(id)+"");
            u2.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us2.setText(" ");
            ed2.setText(" ");
            u2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=3){
            id=3;
            us3.setText(c.getColaN(id));
            ed3.setText(c.getColaE(id)+"");
            u3.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us3.setText(" ");
            ed3.setText(" ");
            u3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=4){
            id=4;
            us4.setText(c.getColaN(id));
            ed4.setText(c.getColaE(id)+"");
            u4.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us4.setText(" ");
            ed4.setText(" ");
            u4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=5){
            id=5;
            us5.setText(c.getColaN(id));
            ed5.setText(c.getColaE(id)+"");
            u5.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us5.setText(" ");
            ed5.setText(" ");
            u5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=6){
            id=6;
            us6.setText(c.getColaN(id));
            ed6.setText(c.getColaE(id)+"");
            u6.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us6.setText(" ");
            ed6.setText(" ");
            u6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=7){
            id=7;
            us7.setText(c.getColaN(id));
            ed7.setText(c.getColaE(id)+"");
            u7.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us7.setText(" ");
            ed7.setText(" ");
            u7.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=8){
            id=8;
            us8.setText(c.getColaN(id));
            ed8.setText(c.getColaE(id)+"");
            u8.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us8.setText(" ");
            ed8.setText(" ");
            u8.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if(c.Elementos()>=9){
            id=9;
            us9.setText(c.getColaN(id));
            ed9.setText(c.getColaE(id)+"");
            u9.setIcon(new javax.swing.ImageIcon(getClass().getResource(DelimitarEdad(c.getColaE(id)))));
        }else{
            us9.setText(" ");
            ed9.setText(" ");
            u9.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        primer.setText("Primer Usuario: "+c.Primero() );
        ultimo.setText("Ultimo Usuario: "+c.Ultimo());
        numero.setText("Nro. de Usuarios: "+c.Elementos());
        llena.setText(c.EstaLlena());
        vacia.setText(c.EstaVacia());
    }
    public String DelimitarEdad(int edad){
        String img = "/img/UsJoven.jpg";
        if(edad <= 30){
            img = "/img/UsJoven.jpg";
        }else{
            if(edad>=60){
                img = "/img/UsAnciano.jpg";
            }else{
                img = "/img/UsAdulto.jpg";
            }
        }
        return img;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HC1;
    private javax.swing.JButton HC2;
    private javax.swing.JButton HC3;
    private javax.swing.JButton adicionar;
    private javax.swing.JButton cj1;
    private javax.swing.JButton cj2;
    private javax.swing.JButton cj3;
    private javax.swing.JLabel ed1;
    private javax.swing.JLabel ed2;
    private javax.swing.JLabel ed3;
    private javax.swing.JLabel ed4;
    private javax.swing.JLabel ed5;
    private javax.swing.JLabel ed6;
    private javax.swing.JLabel ed7;
    private javax.swing.JLabel ed8;
    private javax.swing.JLabel ed9;
    private javax.swing.JTextField edadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField usadd;
    private javax.swing.JLabel vacia;
    // End of variables declaration//GEN-END:variables
}
