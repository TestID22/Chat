package com.septemberEatMe.testChat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Chat");
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 0, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(72, 50, 150, 15);
		contentPane.add(textArea);
		
		JLabel label = new JLabel("Введите Логин:");
		label.setBounds(98, 24, 98, 15);
		contentPane.add(label);
	}
}
