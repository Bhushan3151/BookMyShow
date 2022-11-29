
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BookMyShowMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form BookMyShowMainFrame
     */
    int cal,cal2,total,total2;
    String MovieName,SeatType,SeatNumber,Food,FoodQuantity,Total_Cost ;
    public BookMyShowMainFrame() {
        initComponents();
        
        mainimage();
        firstimage();
        secondimage();
        thirdimage();
        forthimage();
        
        SeatTypeCombo.setEnabled(false);
        SeatNumberCombo.setEnabled(false);
        FoodCombo.setEnabled(false);
        FoodQuantityCombo.setEnabled(false); 
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);

    }
    void savedata()
    {
        if(first_img_label.isEnabled()==true)
        {
            MovieName = "Sholey";
        }
        if(second_img_label.isEnabled()==true)
        {
            MovieName = "3 idiots";
        }
        if(third_img_label.isEnabled()==true)
        {
            MovieName = "Avengers Endgame";
        }
        if(forth_img_label.isEnabled()==true)
        {
            MovieName = "Fast & Furious";
        }
        SeatType = SeatTypeCombo.getSelectedItem().toString();
        SeatNumber = (String) SeatNumberCombo.getSelectedItem();
        Food = (String) FoodCombo.getSelectedItem();
        FoodQuantity = (String) FoodQuantityCombo.getSelectedItem();
        Total_Cost = total_label.getText();
    }
    void mainimage()
    {
        BufferedImage  img = null;
        try{
            img = ImageIO.read(new File("images/main.jpg"));
        }catch(IOException e){
        e.printStackTrace();
        }
       
        Image dimg = img.getScaledInstance(img_label.getWidth() ,img_label.getHeight(),Image.SCALE_SMOOTH);
       
        ImageIcon imageIcon = new ImageIcon(dimg);
        img_label.setIcon(imageIcon);
    }
    
     void firstimage()
    {
        BufferedImage  img = null;
        try{
            img = ImageIO.read(new File("images/movie1.jpg"));
        }catch(IOException e){
        e.printStackTrace();
        }
       
        Image dimg = img.getScaledInstance(first_img_label.getWidth() ,first_img_label.getHeight(),Image.SCALE_SMOOTH);
       
        ImageIcon imageIcon = new ImageIcon(dimg);
        first_img_label.setIcon(imageIcon);
    }
     void secondimage()
    {
        BufferedImage  img = null;
        try{
            img = ImageIO.read(new File("images/movie2.jpeg"));
        }catch(IOException e){
        e.printStackTrace();
        }
       
        Image dimg = img.getScaledInstance(second_img_label.getWidth() ,second_img_label.getHeight(),Image.SCALE_SMOOTH);
       
        ImageIcon imageIcon = new ImageIcon(dimg);
        second_img_label.setIcon(imageIcon);
    }
    void thirdimage()
    {
        BufferedImage  img = null;
        try{
            img = ImageIO.read(new File("images/movie3.jpg"));
        }catch(IOException e){
        e.printStackTrace();
        }
       
        Image dimg = img.getScaledInstance(third_img_label.getWidth() ,third_img_label.getHeight(),Image.SCALE_SMOOTH);
       
        ImageIcon imageIcon = new ImageIcon(dimg);
        third_img_label.setIcon(imageIcon);
    }
     void forthimage()
    {
        BufferedImage  img = null;
        try{
            img = ImageIO.read(new File("images/movie4.jpeg"));
        }catch(IOException e){
        e.printStackTrace();
        }
       
        Image dimg = img.getScaledInstance(forth_img_label.getWidth() ,forth_img_label.getHeight(),Image.SCALE_SMOOTH);
       
        ImageIcon imageIcon = new ImageIcon(dimg);
        forth_img_label.setIcon(imageIcon);
    }
    
    void Calculation()
    {
        if(SeatTypeCombo.getSelectedItem().equals("Select Seat Type"))
        {
            seattypelabel.setText("");
            total_label.setText("");
        }
        
        else if(SeatTypeCombo.getSelectedItem().equals("Platinum - Rs.300"))
        {
            seattypelabel.setText("Rs.300");
            cal = 300*SeatNumberCombo.getSelectedIndex();
            seatnumlabel.setText("Rs."+cal);
            if(SeatTypeCombo.getSelectedItem().equals("Select Seat Type"))
            {
                total=cal;
                total_label.setText("Rs."+total);
            }
            else
            {
                total=300+cal;
                total_label.setText("Rs."+total);
            }
               
        }
        else if(SeatTypeCombo.getSelectedItem().equals("Diamond - Rs.200"))
        {
            seattypelabel.setText("Rs.200");
            cal = 200*SeatNumberCombo.getSelectedIndex();
            seatnumlabel.setText("Rs."+cal);
            if(SeatTypeCombo.getSelectedItem().equals("Select Seat Type"))
            {
                total=cal;
                total_label.setText("Rs."+total);
            }
            else
            {
                total=200+cal;
                total_label.setText("Rs."+total);
            }
            
        }
        else if(SeatTypeCombo.getSelectedItem().equals("Gold - Rs.150"))
        {
            seattypelabel.setText("Rs.150");
            cal = 150*SeatNumberCombo.getSelectedIndex();
            seatnumlabel.setText("Rs."+cal);
            if(SeatTypeCombo.getSelectedItem().equals("Select Seat Type"))
            {
                total=cal;
                total_label.setText("Rs."+total);
            }
            else
            {
                total=150+cal;
                total_label.setText("Rs."+total);
            }
        }
        else if(SeatTypeCombo.getSelectedItem().equals("Silver - Rs.100"))
        {
            seattypelabel.setText("Rs.100");
            cal = 100*SeatNumberCombo.getSelectedIndex();
            seatnumlabel.setText("Rs."+cal);
            if(SeatTypeCombo.getSelectedItem().equals("Select Seat Type"))
            {
                total=cal;
                total_label.setText("Rs."+total);
            }
            else
            {
                total=100+cal;
                total_label.setText("Rs."+total);
            }
        }
        if(SeatNumberCombo.getSelectedItem().equals("Select No. Of Seats"))
        {
            seatnumlabel.setText("");
        }
                
    }
    void FoodCalculation()
    {
        
        if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
        {
            foodcombolabel.setText("");
        }
        
        else if(FoodCombo.getSelectedItem().equals("Samosa - Rs.100"))
        {
            foodcombolabel.setText("Rs.100");
            cal2= 100*FoodQuantityCombo.getSelectedIndex();
            foodquantitylabel.setText("Rs."+cal2);
            if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
            {
                total2 = total + cal2 ;
                total_label.setText("Rs."+total2);
            }
            else
            {
                total2 = total + cal2 + 100;
                total_label.setText("Rs."+total2);
            }
        }
        else if(FoodCombo.getSelectedItem().equals("PopCorn - Rs.150"))
        {
            foodcombolabel.setText("Rs.150");
            cal2= 150*FoodQuantityCombo.getSelectedIndex();
            foodquantitylabel.setText("Rs."+cal2);
            
            if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
            {
                total2 = total + cal2 ;
                total_label.setText("Rs."+total2);
            }
            else
            {
                total2 = total + cal2 + 150;
                total_label.setText("Rs."+total2);
            }
            
        }
        else if(FoodCombo.getSelectedItem().equals("Coke - Rs.120"))
        {
            foodcombolabel.setText("Rs.120");
            cal2= 120*FoodQuantityCombo.getSelectedIndex();
            foodquantitylabel.setText("Rs."+cal2);
            
            if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
            {
                total2 = total + cal2 ;
                total_label.setText("Rs."+total2);
            }
            else
            {
                total2 = total + cal2 + 120;
                total_label.setText("Rs."+total2);
            }
            
        }
        else if(FoodCombo.getSelectedItem().equals("Special Food Combo - Rs.200"))
        {
            foodcombolabel.setText("Rs.200");
            cal2= 200*FoodQuantityCombo.getSelectedIndex();
            foodquantitylabel.setText("Rs."+cal2);
            
            if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
            {
                total2 = total + cal2 ;
                total_label.setText("Rs."+total2);
            }
            else
            {
                total2 = total + cal2 + 200;
                total_label.setText("Rs."+total2);
            }
            
        }
        else if(FoodCombo.getSelectedItem().equals("PopCorn + Chips + Coke Combo  - Rs.250"))
        {
            foodcombolabel.setText("Rs.250");
            cal2= 250*FoodQuantityCombo.getSelectedIndex();
            foodquantitylabel.setText("Rs."+cal2);
            
            if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
            {
                total2 = total + cal2 ;
                total_label.setText("Rs."+total2);
            }
            else
            {
                total2 = total + cal2 + 250;
                total_label.setText("Rs."+total2);
            }
        }
        else if(FoodCombo.getSelectedItem().equals("Samosa + PopCorn + Pepsi Combo - Rs.300"))
        {
            foodcombolabel.setText("Rs.300");
            cal2= 300*FoodQuantityCombo.getSelectedIndex();
            foodquantitylabel.setText("Rs."+cal2);
            
            if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
            {
                total2 = total + cal2 ;
                total_label.setText("Rs."+total2);
            }
            else
            {
                total2 = total + cal2 + 300;
                total_label.setText("Rs."+total2);
            }
            
        }
        if(FoodQuantityCombo.getSelectedItem().equals("Select Food & Beverage Quantity"))
        {
            foodquantitylabel.setText("");
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

        main_panel = new javax.swing.JPanel();
        first_img_label = new javax.swing.JLabel();
        second_img_label = new javax.swing.JLabel();
        third_img_label = new javax.swing.JLabel();
        forth_img_label = new javax.swing.JLabel();
        SeatTypeCombo = new javax.swing.JComboBox<>();
        SeatNumberCombo = new javax.swing.JComboBox<>();
        FoodCombo = new javax.swing.JComboBox<>();
        FoodQuantityCombo = new javax.swing.JComboBox<>();
        NewBtn = new javax.swing.JButton();
        PayBtn = new javax.swing.JButton();
        seattypelabel = new javax.swing.JLabel();
        seatnumlabel = new javax.swing.JLabel();
        foodcombolabel = new javax.swing.JLabel();
        foodquantitylabel = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        img_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Book My Show");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        first_img_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                first_img_labelMouseClicked(evt);
            }
        });
        main_panel.add(first_img_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 150, 170));

        second_img_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                second_img_labelMouseClicked(evt);
            }
        });
        main_panel.add(second_img_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 150, 170));

        third_img_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                third_img_labelMouseClicked(evt);
            }
        });
        main_panel.add(third_img_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 150, 170));

        forth_img_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forth_img_labelMouseClicked(evt);
            }
        });
        main_panel.add(forth_img_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 40, 150, 170));

        SeatTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Seat Type", "Platinum - Rs.300", "Diamond - Rs.200", "Gold - Rs.150", "Silver - Rs.100" }));
        SeatTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatTypeComboActionPerformed(evt);
            }
        });
        main_panel.add(SeatTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 380, 35));

        SeatNumberCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select No. Of Seats", "01", "02", "03", "04", "05" }));
        SeatNumberCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatNumberComboActionPerformed(evt);
            }
        });
        main_panel.add(SeatNumberCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 380, 35));

        FoodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food & Beverage", "Samosa - Rs.100", "PopCorn - Rs.150", "Coke - Rs.120", "Special Food Combo - Rs.200", "PopCorn + Chips + Coke Combo  - Rs.250", "Samosa + PopCorn + Pepsi Combo - Rs.300" }));
        FoodCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodComboActionPerformed(evt);
            }
        });
        main_panel.add(FoodCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 380, 35));

        FoodQuantityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food & Beverage Quantity", "For 1 Person", "For 2 Persons", "For 3 Persons", "For 4 Persons", "For 5 Persons" }));
        FoodQuantityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodQuantityComboActionPerformed(evt);
            }
        });
        main_panel.add(FoodQuantityCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 380, 35));

        NewBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NewBtn.setText("New");
        NewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtnActionPerformed(evt);
            }
        });
        main_panel.add(NewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, 100, 35));

        PayBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PayBtn.setText("Pay");
        PayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayBtnActionPerformed(evt);
            }
        });
        main_panel.add(PayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, 100, 35));

        seattypelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        main_panel.add(seattypelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 260, 100, 25));

        seatnumlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        main_panel.add(seatnumlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 340, 100, 25));

        foodcombolabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        main_panel.add(foodcombolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 410, 100, 25));

        foodquantitylabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        main_panel.add(foodquantitylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 480, 100, 25));

        total_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        main_panel.add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 560, 100, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gross Amount");
        main_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 560, 100, 25));
        main_panel.add(img_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 720));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void second_img_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_second_img_labelMouseClicked
        first_img_label.setEnabled(false);
        second_img_label.setEnabled(true);
        third_img_label.setEnabled(false);
        forth_img_label.setEnabled(false);
        
        SeatTypeCombo.setEnabled(true);
    }//GEN-LAST:event_second_img_labelMouseClicked

    private void forth_img_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forth_img_labelMouseClicked
        first_img_label.setEnabled(false);
        second_img_label.setEnabled(false);
        third_img_label.setEnabled(false);
        forth_img_label.setEnabled(true);
        
        SeatTypeCombo.setEnabled(true);
    }//GEN-LAST:event_forth_img_labelMouseClicked

    private void third_img_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_third_img_labelMouseClicked
        first_img_label.setEnabled(false);
        second_img_label.setEnabled(false);
        third_img_label.setEnabled(true);
        forth_img_label.setEnabled(false);
        
        SeatTypeCombo.setEnabled(true);
    }//GEN-LAST:event_third_img_labelMouseClicked

    private void first_img_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_first_img_labelMouseClicked
        first_img_label.setEnabled(true);
        second_img_label.setEnabled(false);
        third_img_label.setEnabled(false);
        forth_img_label.setEnabled(false);
        
        SeatTypeCombo.setEnabled(true);
        
    }//GEN-LAST:event_first_img_labelMouseClicked

    private void NewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtnActionPerformed
        first_img_label.setEnabled(true);
        second_img_label.setEnabled(true);
        third_img_label.setEnabled(true);
        forth_img_label.setEnabled(true);
        
        SeatTypeCombo.setSelectedItem("Select Seat Type");
        SeatNumberCombo.setSelectedItem("Select No. Of Seats");
        FoodCombo.setSelectedItem("Select Food & Beverage");
        FoodQuantityCombo.setSelectedItem("Select Food & Beverage Quantity");
        
        SeatTypeCombo.setEnabled(false);
        SeatNumberCombo.setEnabled(false);
        FoodCombo.setEnabled(false);
        FoodQuantityCombo.setEnabled(false);  
    }//GEN-LAST:event_NewBtnActionPerformed

    private void SeatTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatTypeComboActionPerformed
        if(SeatTypeCombo.getSelectedItem().equals("Select Seat Type"))
        {
            SeatNumberCombo.setSelectedItem("Select No. Of Seats");
            FoodCombo.setSelectedItem("Select Food & Beverage");
            FoodQuantityCombo.setSelectedItem("Select Food & Beverage Quantity");
            
            SeatNumberCombo.setEnabled(false);
            FoodCombo.setEnabled(false);
            FoodQuantityCombo.setEnabled(false); 
            
            Calculation();
        }
        else 
        {
            SeatNumberCombo.setSelectedItem("Select No. Of Seats");
            FoodCombo.setSelectedItem("Select Food & Beverage");
            FoodQuantityCombo.setSelectedItem("Select Food & Beverage Quantity");
            
            SeatNumberCombo.setEnabled(true);
            FoodCombo.setEnabled(false);
            FoodQuantityCombo.setEnabled(false);
            
            Calculation();
        }
      
    }//GEN-LAST:event_SeatTypeComboActionPerformed

    private void SeatNumberComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatNumberComboActionPerformed
        if(SeatNumberCombo.getSelectedItem().equals("Select No. Of Seats"))
        {
            FoodCombo.setSelectedItem("Select Food & Beverage");
            FoodQuantityCombo.setSelectedItem("Select Food & Beverage Quantity");
            
            FoodCombo.setEnabled(false);
            FoodQuantityCombo.setEnabled(false);
            
            Calculation();
        }
        else 
        {
            FoodCombo.setSelectedItem("Select Food & Beverage");
            FoodQuantityCombo.setSelectedItem("Select Food & Beverage Quantity");
            
            FoodCombo.setEnabled(true);
            FoodQuantityCombo.setEnabled(false);
                        
            Calculation();
        }
        
    }//GEN-LAST:event_SeatNumberComboActionPerformed

    private void FoodComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodComboActionPerformed
        if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
        {
            FoodQuantityCombo.setSelectedItem("Select Food & Beverage Quantity");
            FoodQuantityCombo.setEnabled(false);
            
            FoodCalculation();
        }
        else 
        {
            FoodQuantityCombo.setSelectedItem("Select Food & Beverage Quantity");
            FoodQuantityCombo.setEnabled(true);
            
            FoodCalculation();
        }
    }//GEN-LAST:event_FoodComboActionPerformed

    private void FoodQuantityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodQuantityComboActionPerformed
        FoodCalculation();
    }//GEN-LAST:event_FoodQuantityComboActionPerformed

    private void PayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayBtnActionPerformed
        if(SeatTypeCombo.getSelectedItem().equals("Select Seat Type")&&SeatNumberCombo.getSelectedItem().equals("Select No. Of Seats")&&FoodCombo.getSelectedItem().equals("Select Food & Beverage")&&FoodQuantityCombo.getSelectedItem().equals("Select Food & Beverage Quantity"))
        {
            JOptionPane.showMessageDialog(null,"All Fields are Mandatory for Ticket Booking !");
        }
        else if(SeatTypeCombo.getSelectedItem().equals("Select Seat Type"))
        {
            JOptionPane.showMessageDialog(null,"Seat Type is not Selected");
        }
        else if(SeatNumberCombo.getSelectedItem().equals("Select No. Of Seats"))
        {
            JOptionPane.showMessageDialog(null,"Seat Numbers are not Selected");
        }
        else if(FoodCombo.getSelectedItem().equals("Select Food & Beverage"))
        {
            JOptionPane.showMessageDialog(null,"Food & Beverage is not Selected");
        }
        else if(FoodQuantityCombo.getSelectedItem().equals("Select Food & Beverage Quantity"))
        {
            JOptionPane.showMessageDialog(null,"Food & Beverage Quantity is not Selected");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Payment is Successful");
            savedata();
            new FinalReceipt(MovieName,SeatType,SeatNumber,Food,FoodQuantity,Total_Cost).show();
            dispose();
        }
        /*
        else
        {
            JOptionPane.showMessageDialog(null,"Payment is Successful");
        
            first_img_label.setEnabled(true);
            second_img_label.setEnabled(true);
            third_img_label.setEnabled(true);
            forth_img_label.setEnabled(true);
        
            SeatTypeCombo.setSelectedItem("Select Seat Type");
            SeatNumberCombo.setSelectedItem("Select No. Of Seats");
            FoodCombo.setSelectedItem("Select Food & Beverage");
            FoodQuantityCombo.setSelectedItem("Select Food & Beverage Quantity");
        
            SeatTypeCombo.setEnabled(false);
            SeatNumberCombo.setEnabled(false);
            FoodCombo.setEnabled(false);
            FoodQuantityCombo.setEnabled(false);
        }*/
    }//GEN-LAST:event_PayBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public 
            static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(BookMyShowMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookMyShowMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookMyShowMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookMyShowMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookMyShowMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FoodCombo;
    private javax.swing.JComboBox<String> FoodQuantityCombo;
    private javax.swing.JButton NewBtn;
    private javax.swing.JButton PayBtn;
    private javax.swing.JComboBox<String> SeatNumberCombo;
    private javax.swing.JComboBox<String> SeatTypeCombo;
    private javax.swing.JLabel first_img_label;
    private javax.swing.JLabel foodcombolabel;
    private javax.swing.JLabel foodquantitylabel;
    private javax.swing.JLabel forth_img_label;
    private javax.swing.JLabel img_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel seatnumlabel;
    private javax.swing.JLabel seattypelabel;
    private javax.swing.JLabel second_img_label;
    private javax.swing.JLabel third_img_label;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
