package Lab_11;
import java.awt.*;
import javafx.scene.control.CheckBox;
public class Awt4 {
    //Label l =new label("ok");
    
    
    
    public static void main(String args[]){
        Frame f =new Frame("hello");
        //Panel p = new Panel();
        
                //f.setLocation(100,200);
        //f.add(b1);
        //f.setVisible(true);
        //Panel p1 =new Panel();
        
        //f.add(p1);
        //f.add(p);// last one to be added is shown
        Checkbox ch =new Checkbox("ABC");
        ch.setBounds(120,80,100,80);
        f.add(ch);
        Checkbox ch1 =new Checkbox("DEF");
        ch1.setBounds(120,160,100,80);
        f.add(ch1);
        
        Button b =new Button("click here");
        b.setBounds(120,240,100,80);
        
        //p.add(b);
        Button b1 =new Button("click here yourself");
        b1.setBounds(120,320,100,80);
        f.add(b);
        f.add(b1);
        //p1.add(b1);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(800,500);
    }
}