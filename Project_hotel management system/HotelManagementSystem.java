
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
// the * after awt imports all classes but not the package so we need to import sparately the events package
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
    
    HotelManagementSystem(){
    setBounds(200,200,550,396);
    //setSize(400,400);
    //setLocation(300,300);
    
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
    JLabel l1=new JLabel(i1); 
    l1.setBounds(0,0,550,396);
    add(l1);
    
    JLabel l2=new JLabel("Hotel Management System");
    l2.setBounds(15,5,1000,90);
    l2.setForeground(Color.yellow);
    l2.setFont(new Font("serif",Font.ROMAN_BASELINE,45));
    l1.add(l2);
    
    JButton b1=new JButton("NEXT");
    b1.setBackground(Color.yellow);
    b1.setForeground(Color.BLACK);
    b1.setBounds(400,280,80,30);
    b1.addActionListener(this);
    l1.add(b1);
    
    setLayout(null);
    setVisible(true);
    //must always be in last line
    
    while(true){
        l2.setVisible(false);
        try{
            Thread.sleep(500);
        }catch(Exception e){}
        
        l2.setVisible(true);
        try{
            Thread.sleep(500);
        }catch(Exception e){}
        
               }
   
    }
        public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);
        //"this" closes the current class    

    
        }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
