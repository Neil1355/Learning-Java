package Event_AWT;

import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
	String msg = "";
	int MouseX = 0, MouseY = 0;

	public MouseEventsDemo() {
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());

	}

	public void mouseClicked(MouseEvent me) {
		msg = msg + "- - click received.";
		repaint();
	}

	public void mouseEntered(MouseEvent me) {
		MouseX = 100;
		MouseY = 100;
		msg = "Mouse entered. ";
		repaint();
	}

	public void mouseExited(MouseEvent me) {
		MouseX = 100;
		MouseY = 100;
		msg = "mouse Exited.";
		repaint();
	}

	public void mouseReleased(MouseEvent me) {
		MouseX = me.getX();
		MouseY = me.getY();
		msg = "Button released.";
		repaint();
	}

	public void mousePressed(MouseEvent me) {
		MouseX = me.getX();
		MouseY = me.getY();
		msg = "Button pressed.";
		repaint();
	}

	public void mouseDragged(MouseEvent me) {
		MouseX = me.getX();
		MouseY = me.getY();
		msg = "*" + " Mouse at " + MouseX + " , " + MouseY;
		repaint();
	}

	public void mouseMoved(MouseEvent me) {
		msg = "Mouse moved at " + me.getX() + "," + me.getY();
	}

	public void paint(Graphics g) {
		g.drawString(msg, MouseX, MouseY);
	}

	public static void main(String[] args) {
		MouseEventsDemo appwin = new MouseEventsDemo();

		appwin.setSize(new Dimension(300, 300));
		appwin.setTitle("Mouse Event Demo");
		appwin.setVisible(true);
	}

	class MyWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
}