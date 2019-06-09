package application;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class Button extends JFrame {

	Container c;
	JButton b1, b2, b3;

	public Button() {
		c = getContentPane();
		c.setLayout(new GridLayout(3, 4));

		b1 = new JButton("Start Game");
		b2 = new JButton("Highscore");
		b3 = new JButton("Exit");

		Listener l = new Listener();

		b1.addActionListener(l);

		c.add(b1);
		c.add(b2);
		c.add(b3);
		pack();
	}

	// Listener
	class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Main.main(null);

		}

	}

	public static void main(String[] args) {
		Button but = new Button();
		but.setVisible(true);
		but.setLocation(400, 400);
		but.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
