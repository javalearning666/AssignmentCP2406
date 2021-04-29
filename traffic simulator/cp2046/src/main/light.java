package main;
 public class light {
    int x,y;         
    boolean status;      
    public light(int x,int y,boolean islight) {
        this.x=x;        
        this.y=y;
        this.status=islight;
    }
    public void setlight(boolean sta) {   
        this.status=sta;
    }
}