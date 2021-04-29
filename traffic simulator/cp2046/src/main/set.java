package main;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField; 
public class set extends JFrame implements ActionListener {   
  JLabel lab1,lab2,lab3,lab4;
  JTextField jtext1,jtext2,jtext3,jtext4;
  JPanel panel1,panel2,panel3,panel4;
  JButton jb1,jb2;
  int time1,time2,time3,time4;
    public set(){ 
    lab1=new JLabel("turn right");
    lab2=new JLabel("EWstraight£º");
    lab3=new JLabel("turn right");
    lab4=new JLabel("SNstraight");
    time1=mainclass.panel.lamp1.getgreentime();
    time2=mainclass.panel.lamp2.getgreentime();
    time3=mainclass.panel.lamp3.getgreentime();
    time4=mainclass.panel.lamp4.getgreentime();
    jtext1=new JTextField(String.valueOf(time1));
    jtext2=new JTextField(String.valueOf(time2));
    jtext3=new JTextField(String.valueOf(time3));
    jtext4=new JTextField(String.valueOf(time4));
     
    jb1=new JButton("ok");
    jb1.addActionListener(this);
    jb2=new JButton("canel");
    jb2.addActionListener(this);    
    this.setLayout(new GridLayout(5,2,10,5));
    this.add(lab1);
    this.add(jtext1);
    this.add(lab2);
    this.add(jtext2);
    this.add(lab3);
    this.add(jtext3);
    this.add(lab4);
    this.add(jtext4);
    this.add(jb1);
    this.add(jb2);      
    this.setLocationRelativeTo(null); 
    this.setSize(200, 200); 
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setResizable(false);
    this.setVisible(true); 
  }
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==jb1) {
         
        if(jtext1.getText().length()==0||jtext2.getText().length()==0||jtext3.getText().length()==0||jtext4.getText().length()==0) 
            JOptionPane.showMessageDialog(this, "", "error", JOptionPane.INFORMATION_MESSAGE);
        else {
            mainclass.panel.lamp1.setgreentime(Integer.parseInt(jtext1.getText()));
            mainclass.panel.lamp2.setgreentime(Integer.parseInt(jtext2.getText()));
            mainclass.panel.lamp3.setgreentime(Integer.parseInt(jtext3.getText()));
            mainclass.panel.lamp4.setgreentime(Integer.parseInt(jtext4.getText()));
            this.dispose();
        }
    }else if(e.getSource()==jb2){
        this.dispose();
    }
  }
}
