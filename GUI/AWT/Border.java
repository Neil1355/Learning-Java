package Event_AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;

public class Border {
	Frame JF;

	Border() {
		JF = new Frame();
		TextArea text = new TextArea();
		
		
		Button b1 = new Button("NORTH");
		Button b2 = new Button("SOUTH");
		Button b3 = new Button("EAST");
		Button b4 = new Button("WEST");
		Button b5 = new Button("CENTER");
		JF.add(b1, BorderLayout.NORTH);
		JF.add(b2, BorderLayout.SOUTH);
		JF.add(text,BorderLayout.CENTER);
		JF.add(b3, BorderLayout.EAST);
		JF.add(b4, BorderLayout.WEST);
		//JF.add(b5, BorderLayout.CENTER);
		JF.setSize(300, 300);
		JF.setVisible(true);
		JF.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Border();
	}
}