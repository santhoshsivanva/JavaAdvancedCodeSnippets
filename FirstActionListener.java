package javaDoc;

import java.awt.*;
import java.awt.event.*;

class Frst extends Frame implements ActionListener{
	int count=0;
	Label l;
	Button b; //has a aggregation
	Frst(){
		//for title 
		super("Hi Fuck");
		l = new Label("Fuck");
		b = new Button("Yes"); //component
		setLayout(new FlowLayout());
		add(l);
		add(b);
		b.addActionListener(this); //frame itself is a listener
		//listener must be registered with the component
		
			}
	
	public void actionPerformed(ActionEvent e) {
	
		count++;
		l.setText(count+"fuck");
	}
	
}
public class FirstActionListener {

	public static void main(String[] args) {
		Frst a = new Frst();
		a.setSize(300,300);
		a.setVisible(true);
	}
}
