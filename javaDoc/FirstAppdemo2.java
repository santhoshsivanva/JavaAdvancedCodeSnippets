package javaDoc;

import java.awt.*;

public class FirstAppdemo2 extends Frame {
	
	Label l;
	TextField tf;
	Button b;
	
	public FirstAppdemo2() {
		super("fuck");
		setLayout(new FlowLayout());
		
		l= new Label("name");
		tf= new TextField(20);
		add(l);
		add(tf);
	//Here you can make this app as visible which is also possible here....
		
	}
	
	
public static void main(String[] args) {
	//Frame f = new Frame(); method one
	FirstAppdemo2 a = new FirstAppdemo2();
	a.setSize(400,400);
	a.setVisible(true);
	
	
}

}
