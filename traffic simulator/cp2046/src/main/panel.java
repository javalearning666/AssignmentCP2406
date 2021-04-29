package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
public class Mypanel extends JPanel {
    light l0,l2,l3,l4,l5,l6,l7,l8;   
    lamp lamp1,lamp2,lamp3,lamp4;           
    static int islight;                
    Random r=new Random();
    static public ArrayList<light> lightlist= new ArrayList<light>();  
    static public ArrayList<car> carlist= new ArrayList<car>();          
    public Mypanel() {
        // TODO Auto-generated constructor stub
        l0=addlist(l0, 212, 316, false);
        l2=addlist(l2, 242, 316, false);    
        l3=addlist(l3, 272, 316, true); 
        l4=addlist(l4, 316, 116, true); 
        l5=addlist(l5, 316, 146, false);    
        l6=addlist(l6, 316, 176, false);    
        l7=addlist(l7,116 , 70, true);  
        l8=addlist(l8, 146, 70, false); 
           
        lamp1=new lamp(l9,l0,2000,false,0);
        lamp2=new lamp(l11,l5,2000,false,1);
        lamp3=new lamp(l10,l6,2000,false,2);
        lamp4=new lamp(l8,l2,2000,false,3);
        
        islight = 0 ;       
        Thread t1=new Thread(lamp1);      
        Thread t2=new Thread(lamp2);
        Thread t3=new Thread(lamp3);
        Thread t4=new Thread(lamp4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    light addlist(light a,int x,int y,boolean sta) {
        a=new light(x,y,sta);
        lightlist.add(a);
        return a;
    }
    public void addcar() {          
        int now,next;
        now=r.nextInt(4);
        next=r.nextInt(4);
        car testcar=null;
        while(now==next) 
            next=r.nextInt(4);
        switch(now) {
        case 0:
            testcar=new car(now,next,l0,l2,l3);
            break;
        case 1:
            testcar=new car(now,next,l6,l5,l4);
            break;
        case 2:
            testcar=new car(now,next,l9,l8,l7);
            break;
        case 3:
            testcar=new car(now,next,l10,l11,l12);
            break;
        }
        carlist.add(testcar);
        Thread catt=new Thread(testcar);
        catt.start();
    }
    public void LampChange() {
        islight=(islight+1)%4;
    }
    public void paint(Graphics g) {
        super.paint(g);
         
       
        car buf;
        for(int i=0;i<carlist.size();i++) {   
            buf=carlist.get(i);
            g.setColor(Color.BLUE);
            g.fillRect(buf.x, buf.y, 12, 6);
        }
        
    }
}
