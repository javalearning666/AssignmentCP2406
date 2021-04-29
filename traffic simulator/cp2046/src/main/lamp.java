package main;

public class lamp implements Runnable {
    light opposite, now;      
    int greentime;         
    int name;            
    boolean status;         
    static Object lock = new Object();
  
    public lamp(light l0, light l2,int gt, boolean st, int name) {
        now = l0;
        opposite = l2;
        status = st;
        greentime = gt;
        this.name = name;
        lightstatues();
    }
  
    public void change() { 
        this.status = !(this.status);
        lightstatues();
    }
    public void setgreentime(int time) {
        this.greentime=time;
    }
    public int getgreentime() {
        return this.greentime;
    }
    public void lightstatues() {
        opposite.setlight(status);
        now.setlight(status);
    }
  
    public void run() {
        while (true) {
            synchronized (lock) {       
                if (name == mainclass.panel.islight) {      
                    //System.out.println("now is: "+name);
                    change();
                    mainclass.panel.repaint();
                    try {
                        Thread.sleep(greentime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notifyAll();        
                    change();
                    mainclass.panel.LampChange();
                    mainclass.panel.repaint();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        lock.wait();      
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}