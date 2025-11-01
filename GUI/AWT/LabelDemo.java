package Event_AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelDemo extends Frame {
	Label lbl;
	TextField tf;

	public LabelDemo() {
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		lbl = new Label();
		tf = new TextField();
		tf.setSize(50, 550);
		lbl.setText("Name: ");
		add(lbl);
		add(tf);
		this.setBounds(500,500,500, 300);
		   addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent we) {
	                System.exit(0); 
	            }
	        });
	}

	public static void main(String[] args) {
		LabelDemo obj = new LabelDemo();
		obj.setTitle("Label display demo");
		obj.setVisible(true);
	}
}
