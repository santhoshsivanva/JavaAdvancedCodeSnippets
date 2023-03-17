package javaDoc;
import java.awt.*;

// javax.swing.plaf.basic.BasicInternalFrameTitlePane;
public class FirstAppDemo {

public static void main(String[] args) {
	//There are two methods to create Gui in awt 
	//method 1
	//For frame there are four constructors arethere..
	Frame f = new Frame("My First App");
	//borderlayout is default in java you know
	//you need to convert to flowlayout() in some occution
	f.setLayout(new FlowLayout());
	 //for visible
	//Here you gave the title as well as graphical configuration
	 //for size of the frame
	Button b = new Button("santhoshsivan");
	//you must add to the frame
	Label l = new Label("Name");
	TextField tf= new TextField(20);
	f.add(l);
	f.add(tf);
	f.add(b);
	
	//setSize and setVisible will be last because of simple shake of things cool
	
	f.setSize(300,300);
	f.setVisible(true);
	//There will be ok 
	
}
}
