package b.classNesting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {

	public static void main(String[] args) {

		// create a window
		JFrame fr = new JFrame("my app");
		fr.setBounds(100, 100, 600, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);

		// create a button
		JButton bt = new JButton("click");
		bt.setBounds(100, 100, 125, 25);
		// register the button with a listener - defined in the static nested class
		bt.addActionListener(new MyListener());
		fr.getContentPane().add(bt);

		fr.setVisible(true);
	}

	// static nested class
	public static class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("button clicked");

		}

	}

}
