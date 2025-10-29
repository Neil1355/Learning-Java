package Event_AWT;

import java.awt.*;
import java.awt.event.*;

public class AWT_Demo extends Frame {
	public AWT_Demo() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		g.drawRect(100, 100, 100, 100);
		g.setColor(Color.red);
		g.fillRect(300, 300, 100, 100);
		g.drawOval(50, 250, 150, 150);
	}

	public static void main(String[] args) {
		AWT_Demo awt = new AWT_Demo();

		awt.setSize(new Dimension(370, 700));
		awt.setTitle("Graphic Demo");
		awt.setVisible(true);
	}
}