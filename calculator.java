import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener{
    // necessary data types for calculations
    int c,n;
    String s1,s2,s3,s4,s5;
    
    // creating frame 
    Frame f;
    // creating buttons we required 
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, beq, bclr;
    
    // creating panel
    Panel p;
    // creating textfield were the result display
    TextField t1;
    // creating layout
    GridLayout g;
    // constructor of class calculator
    calculator(){
        // setting up the default/given values to the frame and buttons
        f = new Frame("Calculator");
        f.setLayout(new FlowLayout());
        p = new Panel();
        b0 = new Button("0");
        b0.addActionListener(this);
        // when we click on button the action listener uses. same for other buttons.

        b1 = new Button("1");
        b1.addActionListener(this);
        
        b2 = new Button("2");
        b2.addActionListener(this);

        b3 = new Button("3");
        b3.addActionListener(this);

        b4 = new Button("4");
        b4.addActionListener(this);

        b5 = new Button("5");
        b5.addActionListener(this);

        b6 = new Button("6");
        b6.addActionListener(this);

        b7 = new Button("7");
        b7.addActionListener(this);

        b8 = new Button("8");
        b8.addActionListener(this);

        b9 = new Button("9");
        b9.addActionListener(this);

        badd = new Button("+");
        badd.addActionListener(this);

        bsub = new Button("-");
        bsub.addActionListener(this);

        bmul = new Button("*");
        bmul.addActionListener(this);

        bdiv = new Button("/");
        bdiv.addActionListener(this);

        beq = new Button("=");
        beq.addActionListener(this);

        bclr = new Button("CLR");
        bclr.addActionListener(this);

        t1 = new TextField(20);
        f.add(t1);
        // creating new grid of size 4 X 4 = 16
        g = new GridLayout(4,4);
        p.setLayout(g);
        // adding numeric values to the panel 'p'
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        // adding operation to panel 'p'
        p.add(badd);
        p.add(bsub);
        p.add(bmul);
        p.add(bdiv);
        p.add(beq);
        p.add(bclr);

        f.add(p);
        // setting the panel size heigh and width
        f.setSize(200,180);
        // visible true
        f.setVisible(true);
        // setting up the color
        f.setBackground(Color.LIGHT_GRAY);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // logic part to do calculation part 
        if(e.getSource()==b0){ // b0 = 0
            s3 = t1.getText();
            s4 = "0";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b1){ // b1 = 1
            s3 = t1.getText();
            s4 = "1";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b2){ // b2 = 2
            s3 = t1.getText();
            s4 = "2";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b3){ // b3 = 3
            s3 = t1.getText();
            s4 = "3";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b4){ // b4 = 4
            s3 = t1.getText();
            s4 = "4";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b5){ // b5 = 5
            s3 = t1.getText();
            s4 = "5";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b6){ // b6 = 6
            s3 = t1.getText();
            s4 = "6";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b7){ // b7 = 7
            s3 = t1.getText();
            s4 = "7";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b8){ // b8 = 8
            s3 = t1.getText();
            s4 = "8";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b9){ // b9 = 9
            s3 = t1.getText();
            s4 = "9";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==badd){ // badd = add operation
            s1 = t1.getText();
            t1.setText("");
            c = 1;
        }
        if(e.getSource()==bsub){ // bsub = sub operation
            s1 = t1.getText();
            t1.setText("");
            c = 2;
        }
        if(e.getSource()==bmul){ // bmul = multiply operation
            s1 = t1.getText();
            t1.setText("");
            c = 3;
        }
        if(e.getSource()==bdiv){ /// bdiv = divide operation
            s1 = t1.getText();
            t1.setText("");
            c = 4;
        }
        if(e.getSource()==beq){ // beq = equal operation
            s2 = t1.getText();
            if(c==1){
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==2){
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==3){
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==4){
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==bclr){ // bclr = button clear which clear the output screen
            t1.setText("");
        }
    }

    // main functino 
    public static void main(String[] args) {
        calculator c = new calculator();
    }
}
