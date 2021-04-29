
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane; 
public class mainclass extends JFrame implements ActionListener{
    static Mypanel panel;   
    JMenuBar jmb;
    JMenu jm1, jm2;
    JMenuItem jmi1, jmi2,jmi3,jmi4;   
    mainclass(){
        this.setTitle("traffic lamp");
        this.setSize(420,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jmb=new JMenuBar(); 
        jm1=new JMenu("");
        jm2=new JMenu("");    
        jmi1=new JMenuItem("");
        jmi1.addActionListener(this);
        jmi2=new JMenuItem("");
        jmi2.addActionListener(this);
        jmi3=new JMenuItem("");
        jmi3.addActionListener(this);
        jmi4=new JMenuItem("");
        jmi4.addActionListener(this);
        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(jmi3);
        jm2.add(jmi4);
        jmb.add(jm1);
        jmb.add(jm2);
         
        this.setJMenuBar(jmb);
         
        
     
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jmi1) {
            sp.isLive=false;
            this.remove(sp);
            panel = new Mypanel();
            this.setContentPane(panel);
            this.setVisible(true);
        }else if(e.getSource()==jmi2) {
            System.exit(0);
        }else if(e.getSource()==jmi3) {
            if(panel==null)
            JOptionPane.showMessageDialog(this, "", "error", JOptionPane.INFORMATION_MESSAGE);
            else panel.addcar();
        }else if (e.getSource() == jmi4) {
            if(mainclass.panel==null)
            JOptionPane.showMessageDialog(this, "", "error", JOptionPane.INFORMATION_MESSAGE);
            else new set();
            }
        }
    public static void main(String[] args) {
        new mainclass();
    }
}