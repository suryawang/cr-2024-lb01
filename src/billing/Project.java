package billing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener {
	Project() {
		super("Electricity Billing System");

		setSize(1500, 800);

		/* Adding background image */
		JLabel l1 = new JLabel(ImageGenerator.getIcon("images/main.jpg", 1420, 720));
		add(l1);

		/* First Column */
		JMenuBar mb = new JMenuBar();
		JMenu master = new JMenu("Master");
		JMenuItem m1 = new JMenuItem("New Customer");
		JMenuItem m2 = new JMenuItem("Customer Details");
		JMenuItem m3 = new JMenuItem("Deposit Details");
		master.setForeground(Color.BLUE);

		setMenuItem(m1, "icon1.jpg", 'D', KeyEvent.VK_D);
		setMenuItem(m2, "icon2.png", 'M', KeyEvent.VK_M);
		setMenuItem(m3, "icon3.png", 'N', KeyEvent.VK_N);

		// --------------------------------------------------------------------------------------------

		/* Second Column */
		JMenu user = new JMenu("User");
		JMenuItem u1 = new JMenuItem("Pay Bill");
		JMenuItem u2 = new JMenuItem("Calculate Bill");
		JMenuItem u3 = new JMenuItem("Last Bill");
		user.setForeground(Color.RED);

		setMenuItem(u1, "icon4.png", 'P', KeyEvent.VK_P);
		setMenuItem(u2, "icon5.png", 'B', KeyEvent.VK_B);
		setMenuItem(u3, "icon6.png", 'L', KeyEvent.VK_L);

		// ---------------------------------------------------------------------------------------------

		/* Third Column */
		JMenu report = new JMenu("Report");
		JMenuItem r1 = new JMenuItem("Generate Bill");
		report.setForeground(Color.BLUE);

		setMenuItem(r1, "icon7.png", 'R', KeyEvent.VK_R);

		// -----------------------------------------------------------------------------------------------

		/* Fourth Column */
		JMenu utility = new JMenu("Utility");
		JMenuItem ut1 = new JMenuItem("Notepad");
		JMenuItem ut2 = new JMenuItem("Calculator");
		JMenuItem ut3 = new JMenuItem("Web Browser");
		utility.setForeground(Color.RED);

		setMenuItem(ut1, "icon12.png", 'C', KeyEvent.VK_C);
		setMenuItem(ut2, "icon9.png", 'X', KeyEvent.VK_X);
		setMenuItem(ut3, "icon10.png", 'W', KeyEvent.VK_W);

		// ---------------------------------------------------------------------------------------

		/* Fifth Column */
		JMenu exit = new JMenu("Exit");
		JMenuItem ex = new JMenuItem("Exit");
		exit.setForeground(Color.BLUE);

		setMenuItem(ex, "icon11.png", 'Z', KeyEvent.VK_Z);

		// ---------------------------------------------------------------------------------------------

		master.add(m1);
		master.add(m2);
		// master.add(m3);

		user.add(u1);
		user.add(u2);
		user.add(u3);

		report.add(r1);

		utility.add(ut1);
		utility.add(ut2);
		utility.add(ut3);

		exit.add(ex);

		mb.add(master);
		mb.add(user);
		mb.add(report);
		mb.add(utility);
		mb.add(exit);

		setJMenuBar(mb);

		setFont(new Font("Senserif", Font.BOLD, 16));
		setLayout(new FlowLayout());
		setVisible(false);
	}

	private void setMenuItem(JMenuItem item, String file, char mnemonic, int key) {
		item.setFont(new Font("monospaced", Font.PLAIN, 12));
		item.setIcon(ImageGenerator.getIcon("images/" + file, 20, 20));
		item.setMnemonic(mnemonic);
		item.setAccelerator(KeyStroke.getKeyStroke(key, ActionEvent.CTRL_MASK));
		item.setBackground(Color.WHITE);
		item.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		String msg = ae.getActionCommand();
		if (msg.equals("Customer Details")) {
			new customer_details().setVisible(true);

		} else if (msg.equals("New Customer")) {
			new new_customer().setVisible(true);

		} else if (msg.equals("Calculate Bill")) {
			new calculate_bill().setVisible(true);

		} else if (msg.equals("Pay Bill")) {
			new pay_bill().setVisible(true);

		} else if (msg.equals("Notepad")) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			} catch (Exception e) {
			}
		} else if (msg.equals("Calculator")) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			} catch (Exception e) {
			}
		} else if (msg.equals("Web Browser")) {
			try {
				Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			} catch (Exception e) {
			}
		} else if (msg.equals("Exit")) {
			System.exit(0);
		} else if (msg.equals("Generate Bill")) {
			new generate_bill().setVisible(true);

		} else if (msg.equals("Last Bill")) {
			new LastBill().setVisible(true);

		}

	}

	public static void main(String[] args) {
		new Project().setVisible(true);
	}

}