package github;

public class Cercle {
        
    private float x; 
    private float y; 
         
    Cercle(float xx, float yy){     
        x=xx;     
        y=yy;       
    }   
         
    Cercle(){
        x=0;
        y=0;
    }
    
    public Cercle(Cercle c){
        this.x = c.x;
        this.y = c.y;
    }
 
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    
    public String toString(){
        return "X: " + x + ", Y:" + y;
    }
    
    public Boolean equals(Cercle c){
        return c.getX()==x && c.getY()==y;
    }         
    
    public static void main(String[] args) {             
        Cercle c = new Cercle();
        
        c.setX(30);
        c.setY(30);
        
        System.out.println(c.toString());
        
    }

}//Arnau Calleja Martin <arnau.cm123@gmail.com>
