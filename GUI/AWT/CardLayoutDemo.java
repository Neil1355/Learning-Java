package Event_AWT;

import java.awt.*;
import java.awt.event.*;

class CardLayoutExample extends Frame implements ActionListener {
	CardLayout card;

	CardLayoutExample() {
		card = new CardLayout(200, 200);
		setLayout(card);
		Button Btnfirst = new Button("first ");
		Button BtnSecond = new Button("Second");
		Button BtnThird = new Button("Third");
		add(Btnfirst, "Card1");
		add(BtnSecond, "Card2");
		add(BtnThird, "Card3");
		Btnfirst.addActionListener(this);
		BtnSecond.addActionListener(this);
		BtnThird.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0); 
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		card.next(this);
	}
}

public class CardLayoutDemo {
	public static void main(String args[]) {
		CardLayoutExample frame = new CardLayoutExample();
		frame.setTitle("CardLayout in Java Example");
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}