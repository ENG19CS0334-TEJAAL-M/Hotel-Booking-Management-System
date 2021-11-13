
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3;
    
    Dashboard(){
        mb=new JMenuBar();
        add(mb);
        
        m1=new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.DARK_GRAY);
        mb.add(m1);
        
        m2=new JMenu("ADMIN");
        m2.setForeground(Color.DARK_GRAY);
        mb.add(m2);
        
        i1=new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);
        
        i2=new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);
        
        i3=new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
        m2.add(i3);
        
        
        
        mb.setBounds(0,0,1300,30);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/third.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,1300,700);
        add(l1);
        
        JLabel l2=new JLabel("THE TAJ GROUP WELCOMES YOU");
        l2.setBounds(100,90,1300,70);
        l2.setForeground(Color.darkGray);
        l2.setFont(new Font("Serif",Font.PLAIN,70));
        l1.add(l2);//to print the text before the image
        
        
        
        setLayout(null);
        setBounds(0,0,1300,700);
        setVisible(true);
               
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("RECEPTION")){
            new Reception().setVisible(true);
            
        }else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms().setVisible(true);
        }
        
    }
    
    
    public static void main(String args[]){
        new Dashboard().setVisible(true);
    }
    
}
