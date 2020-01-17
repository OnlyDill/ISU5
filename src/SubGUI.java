
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SubGUI extends javax.swing.JFrame {

    ArrayList<Food> sandwichitems = new ArrayList();
    Patron [] orders = new Patron [5];
    int  size, index;
    JLabel foodlabels[] = new JLabel[10];

    public SubGUI() {
        initComponents();
        foodlabels[0] = lbl1;
        foodlabels[1] = lbl2;
        foodlabels[2] = lbl3;
        foodlabels[3] = lbl4;
        btnmsubmit.setEnabled(false);
        btnisubmit.setEnabled(false);
        size = 0;
        index = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn6 = new javax.swing.JRadioButton();
        btn12 = new javax.swing.JRadioButton();
        btnbsubmit = new javax.swing.JButton();
        btnT = new javax.swing.JRadioButton();
        btnNT = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnisubmit = new javax.swing.JButton();
        cblettuce = new javax.swing.JCheckBox();
        cbelettuce = new javax.swing.JCheckBox();
        lbl2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn7 = new javax.swing.JRadioButton();
        btn13 = new javax.swing.JRadioButton();
        btnmsubmit = new javax.swing.JButton();
        btnT1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        btnorder = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        btnprevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(btn6);
        btn6.setText("6 Inch");
        btn6.setActionCommand("I6");

        buttonGroup1.add(btn12);
        btn12.setText("12 Inch");
        btn12.setActionCommand("I12");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btnbsubmit.setText("Submit");
        btnbsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbsubmitActionPerformed(evt);
            }
        });

        buttonGroup2.add(btnT);
        btnT.setText("Toasted");
        btnT.setActionCommand("T");

        buttonGroup2.add(btnNT);
        btnNT.setText("Not Toasted");
        btnNT.setActionCommand("NT");
        btnNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bread");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNT)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbsubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl3.setBackground(new java.awt.Color(255, 255, 255));
        lbl3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl1.setBackground(new java.awt.Color(255, 255, 255));
        lbl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnisubmit.setText("Submit");
        btnisubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnisubmitActionPerformed(evt);
            }
        });

        cblettuce.setText("Lettuce");

        cbelettuce.setText("Extra");
        cbelettuce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbelettuceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnisubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cblettuce)
                        .addGap(43, 43, 43)
                        .addComponent(cbelettuce)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cblettuce)
                    .addComponent(cbelettuce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnisubmit)
                .addContainerGap())
        );

        lbl2.setBackground(new java.awt.Color(255, 255, 255));
        lbl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup3.add(btn7);
        btn7.setText("Ham");
        btn7.setActionCommand("HAM");

        buttonGroup3.add(btn13);
        btn13.setText("Meatball");
        btn13.setActionCommand("MB");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btnmsubmit.setText("Submit");
        btnmsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmsubmitActionPerformed(evt);
            }
        });

        buttonGroup3.add(btnT1);
        btnT1.setText("Turkey");
        btnT1.setActionCommand("TUR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Meat");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnT1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnmsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnT1)
                .addGap(18, 18, 18)
                .addComponent(btnmsubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl4.setBackground(new java.awt.Color(255, 255, 255));
        lbl4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnorder.setText("Order");
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });

        btnprevious.setText("<");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(btnprevious)
                                                .addGap(338, 338, 338))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnnext)
                                                .addGap(86, 86, 86)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnorder)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnorder)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnprevious)
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbsubmitActionPerformed
        String slength; //determines length oif sandwich based on button chosen
        String toasted; //determine if buns are to be toasted
        try {
            slength = buttonGroup1.getSelection().getActionCommand(); //gets the length of sandwich you selected
            toasted = buttonGroup2.getSelection().getActionCommand(); //get the yes or no for toast
            sandwichitems.add(new Bread(1, 1, "Bun", "data/Bun.png")); //first item to always be added is a bottom bun

            if (slength == "I12") { //if you selected twelve inch, turn the static boolean is12Inch to true
                Food.TwelveInchSub();
            }

            if (toasted == "T") { //if you selected toasted, set toasted variable for bread to true
                ((Bread) sandwichitems.get(0)).toast();
            }
            
            //print image of bottom bun
            int loc = sandwichitems.size() - 1;
            foodlabels[loc].setIcon(sandwichitems.get(loc).getImage()); 
            
            //calculate calories, grams, price
            sandwichitems.get(loc).calcCalories(); 
            sandwichitems.get(loc).calcGrams();
            sandwichitems.get(loc).calcPrice();
            
            btnbsubmit.setEnabled(false); //disable bread submit button because you're done with this stage
            btnmsubmit.setEnabled(true); //enable meat button because this is next stage
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Must fill out form correctly"); // if you did not fill our two buttons, you get an error
            return;
        }


    }//GEN-LAST:event_btnbsubmitActionPerformed

    private void btnNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNTActionPerformed

    private void btnisubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnisubmitActionPerformed
        int loc;
        if (cblettuce.isSelected()) {
            sandwichitems.add(new Ingredient(10, 1, "Lettuce", "data/6lettuce.png", "data/12lettuce.png", "Regular")); //create the lettuce
            //print image of lettuce
            loc = sandwichitems.size() - 1;
            foodlabels[loc].setIcon(sandwichitems.get(loc).getImage()); //print lettuce
            sandwichitems.get(loc).calcCalories();
            sandwichitems.get(loc).calcGrams();
            sandwichitems.get(loc).calcPrice();
            cblettuce.setEnabled(false); //disable checkbox
        }
        if (cbelettuce.isSelected()){
            sandwichitems.add(new Ingredient((Ingredient) sandwichitems.get(sandwichitems.size()-1))); //creates a duplicate lettuce
            
            loc = sandwichitems.size() - 1;
            ((Ingredient)sandwichitems.get(loc)).setExtraCost(); //set extra cost because its a new ingredient
            sandwichitems.get(loc).calcPrice(); //calcualte new price for extra ingredient
            foodlabels[loc].setIcon(sandwichitems.get(loc).getImage()); //print lettuce
            cbelettuce.setEnabled(false); //disable checkbox
        }
        
        
    }//GEN-LAST:event_btnisubmitActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn13ActionPerformed

    private void btnmsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmsubmitActionPerformed
        String meattype; //type of meat selected
        try{
            meattype = buttonGroup3.getSelection().getActionCommand(); //gets the meat type you selected
            if (meattype == "HAM") { //if you selected twelve inch, turn the static boolean is12Inch to true
                sandwichitems.add(new Ingredient(1, 1, "Ham", "data/6ham.png", "data/12ham.png", "Regular")); 
            }
            
            //print image of selected meat
            int loc = sandwichitems.size() - 1;
            foodlabels[loc].setIcon(sandwichitems.get(loc).getImage());
            
            //calculate calories, grams, price
            sandwichitems.get(loc).calcCalories(); 
            sandwichitems.get(loc).calcGrams();
            sandwichitems.get(loc).calcPrice();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Must select a meat"); // if you did not fill out buttons, you get an error
            return;
        }
        
        btnmsubmit.setEnabled(false);
        btnisubmit.setEnabled(true);
        
    }//GEN-LAST:event_btnmsubmitActionPerformed

    private void cbelettuceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbelettuceActionPerformed
        
    }//GEN-LAST:event_cbelettuceActionPerformed
    
    public void showOrder(){
        System.out.format("%s\n==============\n", orders[index-1].getName());
        for (int i = 0; i < orders[index-1].getSubItems().size(); i++) {
            System.out.println(orders[index-1].getSubItems().get(i));
        }
        System.out.println(index);
    }
    
    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        
        //make new array for patron copied form sandwichitems
        ArrayList<Food> a = new ArrayList<Food>();
        for (int i = 0; i < sandwichitems.size(); i++) {
            a.add(sandwichitems.get(i));
        }
        //get name for patron
        String n = txtname.getText();
        
        //make patron
        orders[size] = (new Patron(a, n));
        sandwichitems.clear(); //clear sandwich items so you can now make new sandwich order
        size++;
        index = size;
        //show order
        showOrder();
        
        
    }//GEN-LAST:event_btnorderActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        if (index > 0 && index <= size) {
            index--;
        }
        showOrder();
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
       if (index < size-1 && index >=0) {
            index++;
        }
        showOrder();
    }//GEN-LAST:event_btnnextActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(SubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn12;
    private javax.swing.JRadioButton btn13;
    private javax.swing.JRadioButton btn6;
    private javax.swing.JRadioButton btn7;
    private javax.swing.JRadioButton btnNT;
    private javax.swing.JRadioButton btnT;
    private javax.swing.JRadioButton btnT1;
    private javax.swing.JButton btnbsubmit;
    private javax.swing.JButton btnisubmit;
    private javax.swing.JButton btnmsubmit;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnorder;
    private javax.swing.JButton btnprevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cbelettuce;
    private javax.swing.JCheckBox cblettuce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
