import java.awt.Color;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	// class variables aka instance variables aka field variables
	JFrame frame;
	JTextField textField;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, bsub, bmul, bdiv, beq, bclr, bksp, bsqr, bcbe, bsqt,
			blog, bpow, bneg;

	Double firstNumber;
	int operator;
	Double secondNumber;
	Double result;
	boolean autoClear;

	// constructor
	public Calculator() {
		frame = new JFrame("Calculator, created by Coleby K.");
		textField = new JTextField();
		textField.setBounds(30, 40, 410, 30);
		frame.add(textField);
		frame.setLayout(null);
		Color buttonPink = Color.decode("#E5CAE5");
		Color clearRed = Color.decode("#FF5F5F");
		Color eqGreen = Color.decode("#7CF984");
		Color funcGray = Color.decode("#B8B8B8");

		b7 = new JButton("7");
		b7.setBounds(40, 240, 50, 40);
		b7.setFont(b7.getFont().deriveFont(19.0f));
		b7.setBackground(buttonPink);
		frame.add(b7);

		b4 = new JButton("4");
		b4.setBounds(40, 170, 50, 40);
		b4.setFont(b4.getFont().deriveFont(19.0f));
		b4.setBackground(buttonPink);
		frame.add(b4);

		b1 = new JButton("1");
		b1.setBounds(40, 100, 50, 40);
		b1.setFont(b1.getFont().deriveFont(19.0f));
		b1.setBackground(buttonPink);
		frame.add(b1);

		bdec = new JButton(".");
		bdec.setBounds(40, 310, 50, 40);
		bdec.setFont(bdec.getFont().deriveFont(19.0f));
		bdec.setBackground(funcGray);
		frame.add(bdec);

		b8 = new JButton("8");
		b8.setBounds(110, 240, 50, 40);
		b8.setFont(b8.getFont().deriveFont(19.0f));
		b8.setBackground(buttonPink);
		frame.add(b8);

		b5 = new JButton("5");
		b5.setBounds(110, 170, 50, 40);
		b5.setFont(b5.getFont().deriveFont(19.0f));
		b5.setBackground(buttonPink);
		frame.add(b5);

		b2 = new JButton("2");
		b2.setBounds(110, 100, 50, 40);
		b2.setFont(b2.getFont().deriveFont(19.0f));
		b2.setBackground(buttonPink);
		frame.add(b2);

		b9 = new JButton("9");
		b9.setBounds(180, 240, 50, 40);
		b9.setFont(b9.getFont().deriveFont(19.0f));
		b9.setBackground(buttonPink);
		frame.add(b9);

		b6 = new JButton("6");
		b6.setBounds(180, 170, 50, 40);
		b6.setFont(b6.getFont().deriveFont(19.0f));
		b6.setBackground(buttonPink);
		frame.add(b6);

		b3 = new JButton("3");
		b3.setBounds(180, 100, 50, 40);
		b3.setFont(b3.getFont().deriveFont(19.0f));
		b3.setBackground(buttonPink);
		frame.add(b3);

		beq = new JButton("=");
		beq.setBounds(226, 380, 73, 40);
		beq.setFont(beq.getFont().deriveFont(19.0f));
		beq.setBackground(eqGreen);
		frame.add(beq);

		b0 = new JButton("0");
		b0.setBounds(110, 310, 50, 40);
		b0.setFont(b0.getFont().deriveFont(19.0f));
		b0.setBackground(buttonPink);
		frame.add(b0);

		bdiv = new JButton("/");
		bdiv.setBounds(250, 100, 50, 40);
		bdiv.setFont(bdiv.getFont().deriveFont(19.0f));
		bdiv.setBackground(funcGray);
		frame.add(bdiv);

		bmul = new JButton("*");
		bmul.setBounds(250, 170, 50, 40);
		bmul.setFont(bmul.getFont().deriveFont(19.0f));
		bmul.setBackground(funcGray);
		frame.add(bmul);

		bsub = new JButton("-");
		bsub.setBounds(250, 240, 50, 40);
		bsub.setFont(bsub.getFont().deriveFont(19.0f));
		bsub.setBackground(funcGray);
		frame.add(bsub);

		badd = new JButton("+");
		badd.setBounds(250, 310, 50, 40);
		badd.setFont(badd.getFont().deriveFont(19.0f));
		badd.setBackground(funcGray);
		frame.add(badd);

		bclr = new JButton("Clr");
		bclr.setBounds(40, 380, 73, 40);
		bclr.setFont(bclr.getFont().deriveFont(19.0f));
		bclr.setBackground(clearRed);
		frame.add(bclr);

		bksp = new JButton("<--");
		bksp.setBounds(133, 380, 73, 40);
		bksp.setFont(bksp.getFont().deriveFont(19.0f));
		bksp.setBackground(clearRed);
		frame.add(bksp);

		bsqt = new JButton("√");
		bsqt.setBounds(320, 100, 80, 40);
		bsqt.setFont(bsqt.getFont().deriveFont(19.0f));
		bsqt.setBackground(funcGray);
		frame.add(bsqt);

		bcbe = new JButton("^3");
		bcbe.setBounds(320, 310, 80, 40);
		bcbe.setFont(bcbe.getFont().deriveFont(19.0f));
		bcbe.setBackground(funcGray);
		frame.add(bcbe);

		bsqr = new JButton("^2");
		bsqr.setBounds(320, 240, 80, 40);
		bsqr.setFont(bsqr.getFont().deriveFont(19.0f));
		bsqr.setBackground(funcGray);
		frame.add(bsqr);

		blog = new JButton("log");
		blog.setBounds(320, 170, 80, 40);
		blog.setFont(blog.getFont().deriveFont(19.0f));
		blog.setBackground(funcGray);
		frame.add(blog);
		
		bpow = new JButton("^");
		bpow.setBounds(320, 380, 80, 40);
		bpow.setFont(bpow.getFont().deriveFont(19.0f));
		bpow.setBackground(funcGray);
		frame.add(bpow);
		
		bneg = new JButton("+/-");
		bneg.setBounds(180, 310, 50, 40);
		bneg.setFont(bneg.getFont().deriveFont(19.0f));
		bneg.setBackground(funcGray);
		bneg.setMargin(new Insets(2, 2, 2, 2));
		frame.add(bneg);

		frame.setSize(440, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bdec.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bclr.addActionListener(this);
		bksp.addActionListener(this);
		bsqr.addActionListener(this);
		bcbe.addActionListener(this);
		bsqt.addActionListener(this);
		blog.addActionListener(this);
		bpow.addActionListener(this);
		bneg.addActionListener(this);

	}

	// Listener -- waiting for an event, mouse click, mouse over...

	@Override
	public void actionPerformed(ActionEvent e) {
		// handler -- call a handler method
		if (e.getSource() == b0) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("0"));
		}
		if (e.getSource() == b1) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("1"));
		}
		if (e.getSource() == b2) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("2"));
		}
		if (e.getSource() == b3) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("3"));
		}
		if (e.getSource() == b4) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("4"));
		}
		if (e.getSource() == b5) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("5"));
		}
		if (e.getSource() == b6) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("6"));
		}
		if (e.getSource() == b7) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("7"));
		}
		if (e.getSource() == b8) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("8"));
		}
		if (e.getSource() == b9) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("9"));
		}
		if (e.getSource() == bdec) {
			if (autoClear == true) {
				textField.setText("");
				autoClear = false;
			}
			textField.setText(textField.getText().concat("."));
		}
		if (e.getSource() == bclr)
			textField.setText("");

		if (e.getSource() == badd) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(textField.getText().concat("+"));
				operator = 1;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}
		if (e.getSource() == bsub) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(textField.getText().concat("-"));
				operator = 2;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}
		if (e.getSource() == bmul) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(textField.getText().concat("*"));
				operator = 3;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}
		if (e.getSource() == bdiv) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(textField.getText().concat("/"));
				operator = 4;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}

		if (e.getSource() == bksp) {
			// s is what was in the text field
			String s = textField.getText();
			// clear text field
			textField.setText("");
			// for every character in s minus one,
			for (int i = 0; i < s.length() - 1; i++)
				// add that character from s into the text field
				textField.setText(textField.getText() + s.charAt(i));
		}

		if (e.getSource() == blog) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("log₁₀(" + firstNumber + ")");
				operator = 5;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}

		if (e.getSource() == bsqt) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("√" + firstNumber);
				operator = 6;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}

		if (e.getSource() == bsqr) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(textField.getText().concat("²"));
				operator = 7;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}

		if (e.getSource() == bcbe) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(textField.getText().concat("³"));
				operator = 8;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}
		
		if (e.getSource() == bpow) {
			try {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText(textField.getText().concat("^"));
				operator = 9;
			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}
		}
		if (e.getSource() == bneg) {
			String n = textField.getText();
			if (n.contains("+") || n.contains("-") || n.contains("/") || n.contains("*")) {
				if (firstNumber.toString().substring(firstNumber.toString().length() - 2).equals(".0")) {
					textField.setText(n.substring(0,firstNumber.toString().length()-1) + "-" + textField.getText().substring(firstNumber.toString().length()-1));
				}
			}else {
				textField.setText("-" + n);
			}
			autoClear = false;


		}

		if (e.getSource() == beq) {
			try {
				String firstNumberStr = firstNumber.toString();
				if (firstNumberStr.substring(0, 2).equals("0.")) {
					if (textField.getText().substring(0, 1).equals(".")) {
						String f = textField.getText();
						textField.setText("0" + f);
					}
				}

				if (firstNumberStr.substring(firstNumberStr.length() - 2).equals(".0")) {
					String s = firstNumberStr;
					firstNumberStr = "";
					for (int i = 0; i < s.length() - 1; i++) {
						firstNumberStr = s.substring(0, s.length() - 2);
					}
				}
				if (operator == 1 || operator == 2 || operator == 3 || operator == 4 || operator == 9) {
					String s = textField.getText();
					secondNumber = Double.parseDouble(s.substring(firstNumberStr.length() + 1));
				}

				switch (operator) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				case 5:
					result = Math.log10(firstNumber);
					break;
				case 6:
					result = Math.sqrt(firstNumber);
					break;
				case 7:
					result = Math.pow(firstNumber, 2.0);
					break;
				case 8:
					result = Math.pow(firstNumber, 3.0);
					break;
				case 9:
					result = Math.pow(firstNumber, secondNumber);
					break;

				default:
					result = 0.0;
				}
				textField.setText(textField.getText().concat(" = " + result.toString()));
				autoClear = true;

			} catch (Exception e1) {
				textField.setText("Invalid operation!");
				autoClear = true;
			}

		}

	}// end of actionPerformed
}// end of Calculator class