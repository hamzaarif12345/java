package Lab_11;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.control.CheckBox;
public class awt6 implements ActionListener,ItemListener {
    //Label l =new label("ok");
    TextField tf=new TextField();
    Choice c1,c2,c3;
    Label l;
    
    awt6(){
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
        l=new Label();
        l.setBounds(400,120,100,100);
        Button b =new Button("click here");
        b.setBounds(120,240,100,80);
        b.addActionListener(this);
        tf =new TextField();
        tf.setBounds(300,100,120,120);
        //p.add(b);
        Button b1 =new Button("click here yourself");
        b1.setBounds(120,320,100,80);
        f.add(b);
        f.add(b1);
        //p1.add(b1);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(800,500);
        c1=new Choice();
      //  c2=new Choice();
       // c3=new Choice();
        c1.add("1");
        c1.add("2");
        c1.add("3");
        
        
        c1.setBounds(120,400,100,100);
        c1.addItemListener(this);
        f.add(c1);
        f.add(l);
        f.add(tf);
        
    }
    public void actionPerformed(ActionEvent ae){
         l.setText(c1.getSelectedItem());  
         tf.setText("HAMZA");
    }
    public void itemStateChanged(ItemEvent i){
             l.setText(c1.getSelectedItem());  

    }
    public static void main(String args[]){
        awt6 a=new awt6();
    }
    
}
