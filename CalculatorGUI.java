/**
 * Constructor class for Calculator to multiply, divide, 
 * add or subtract two integers between 0 and 9.
 */

public class CalculatorGUI extends JFrame implements ActionListener
{
  //create all buttons
	JButton sumButton = new JButton("+");
	JButton minusButton = new JButton("-");
	JButton multButton = new JButton("*");
	JButton divButton = new JButton("/");
	JButton clearButton = new JButton("C");
	JButton equalsButton = new JButton("=");
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");

	//create display field at the top
	JTextField displayField = new JTextField();

	//create member variables for the first and second numbers plus the total
	double firstEntry;
	double secondEntry;
	double totalAmount;

	//direct to the proper operation
	String action = null;

	public CalculatorGUI()
	{
		setSize(300,300);
		setTitle("CALCULATOR");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4));

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		// add both panels to the main
		mainPanel.add(buttonPanel, BorderLayout.CENTER);
		mainPanel.add(displayField, BorderLayout.NORTH);

		// add all of the action listeners
		sumButton.addActionListener(this);
		minusButton.addActionListener(this);
		multButton.addActionListener(this);
		divButton.addActionListener(this);
		clearButton.addActionListener(this);
		equalsButton.addActionListener(this);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		//add buttons to the panel
		buttonPanel.add(b0);
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(sumButton);
		buttonPanel.add(b3);
		buttonPanel.add(b4);
		buttonPanel.add(b5);
		buttonPanel.add(minusButton);
		buttonPanel.add(b6);
		buttonPanel.add(b7);
		buttonPanel.add(b8);
		buttonPanel.add(multButton);
		buttonPanel.add(b9);
		buttonPanel.add(clearButton);
		buttonPanel.add(equalsButton);	
		buttonPanel.add(divButton);		

		// add main panel to the 300x300 sframe
		this.add(mainPanel);
	}

	/**
	 * Action Performed method for Calculator class.
	 * Displays result of calculations.
	 */
	public void actionPerformed(ActionEvent e)
	{
		String input = displayField.getText();

		// places numbers on the display
		if(e.getSource()==clearButton)
		{
			displayField.setText("");
		} 
		else if(e.getSource()==b0)
		{
			displayField.setText(input + "0");
		}
		else if(e.getSource()==b1)
		{
			displayField.setText(input + "1");
		} 
		else if(e.getSource()==b2)
		{
			displayField.setText(input + "2");
		}
		else if(e.getSource()==b3)
		{
			displayField.setText(input + "3");
		}
		else if(e.getSource()==b4)
		{
			displayField.setText(input + "4");
		}
		else if(e.getSource()==b5)
		{
			displayField.setText(input + "5");
		}
		else if(e.getSource()==b6)
		{
			displayField.setText(input + "6");
		}
		else if(e.getSource()==b7)
		{
			displayField.setText(input + "7");
		}
		else if(e.getSource()==b8)
		{
			displayField.setText(input + "8");
		}
		else if(e.getSource()==b9)
		{
			displayField.setText(input + "9");
		}

		//converts entry to double
		else if(e.getSource()==sumButton)
		{
			firstEntry = Double.parseDouble(displayField.getText());

			action = "+";

			displayField.setText("");
		}
		else if(e.getSource() == minusButton)
		{
			firstEntry = Double.parseDouble(displayField.getText());

			action = "-";

			displayField.setText("");
		}
		else if(e.getSource() == multButton)
		{
			firstEntry = Double.parseDouble(displayField.getText());

			action = "*";

			displayField.setText("");

		}
		else if(e.getSource() == divButton)
		{
			firstEntry = Double.parseDouble(displayField.getText());

			action = "/";

			displayField.setText("");
		}

		// after equals it will do the operation 
		else if(e.getSource()==equalsButton)
		{
			secondEntry = Double.parseDouble(displayField.getText());

			if(action.equals("+"))
			{
				totalAmount = firstEntry + secondEntry;
			}
			else if(action.equals("-"))
			{ 
				totalAmount = firstEntry - secondEntry;
			}
			else if(action.equals("*"))
			{
				totalAmount = firstEntry * secondEntry;
			}
			else if(action.equals("/"))
			{
				totalAmount = firstEntry / secondEntry;
			}

			displayField.setText("" + totalAmount);
		}

	}
}
