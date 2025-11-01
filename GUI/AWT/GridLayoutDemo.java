
package Event_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutDemo extends Frame {
	Panel p;
	Button b1, b2, b3, b4;
	GridLayout gl;

	public GridLayoutDemo() {
		p = new Panel();
		gl = new GridLayout(3, 3);
		p.setLayout(gl);
		b1 = new Button(" 1 ");
		p.add(b1);
		b2 = new Button(" 2 ");
		p.add(b2);
		b3 = new Button(" 3 ");
		p.add(b3);
		b4 = new Button(" 4 ");
		p.add(b4);
		b4 = new Button(" 5 ");
		p.add(b4);
		b4 = new Button(" 6 ");
		p.add(b4);
		b4 = new Button(" 7 ");
		p.add(b4);
		add(p);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		GridLayoutDemo bl = new GridLayoutDemo();
	}
}
