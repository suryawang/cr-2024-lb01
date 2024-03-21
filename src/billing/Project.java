package billing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("Electricity Billing System");

        setSize(1500,800);

        /* Adding background image */
        JLabel l1 = new JLabel(ImageGenerator.getIcon("images/main.jpg",1420,720));
        add(l1);

        /* First Column */
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Customer");
        JMenuItem m2 = new JMenuItem("Customer Details");
        JMenuItem m3 = new JMenuItem("Deposit Details");
        master.setForeground(Color.BLUE);


        /* ---- Customer Details ---- */
        m1.setFont(new Font("monospaced",Font.PLAIN,12));
        m1.setIcon(ImageGenerator.getIcon("images/icon1.jpg",20,20));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);

        /* ---- Meter Details ---- */
        m2.setFont(new Font("monospaced",Font.PLAIN,12));
        m2.setIcon(ImageGenerator.getIcon("images/icon2.png",20,20));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);

        /* ---- Deposit Details  ----- */
        m3.setFont(new Font("monospaced",Font.PLAIN,12));
        m3.setIcon(ImageGenerator.getIcon("images/icon3.png",20,20));
        m3.setMnemonic('N');
        m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        m3.setBackground(Color.WHITE);

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);

        // --------------------------------------------------------------------------------------------


        /* Second Column */
        JMenu user = new JMenu("User");
        JMenuItem u1 = new JMenuItem("Pay Bill");
        JMenuItem u2 = new JMenuItem("Calculate Bill");
        JMenuItem u3 = new JMenuItem("Last Bill");
        user.setForeground(Color.RED);

        /* ---- Pay Bill ---- */
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
        u1.setIcon(ImageGenerator.getIcon("images/icon4.png",20,20));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);

        /* ---- Bill Details ---- */
        u2.setFont(new Font("monospaced",Font.PLAIN,12));
        u2.setIcon(ImageGenerator.getIcon("images/icon5.png",20,20));
        u2.setMnemonic('B');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);

        /* ---- Last Bill ----*/
        u3.setIcon(ImageGenerator.getIcon("images/icon6.png",20,20));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);

        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);


        // --------------------------------------------------------------------------------------------- 

        /* Third Column*/
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        report.setForeground(Color.BLUE);

        /* ---- Report ---- */
        r1.setFont(new Font("monospaced",Font.PLAIN,12));
        r1.setIcon(ImageGenerator.getIcon("images/icon7.png",20,20));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);

        r1.addActionListener(this);

        // -----------------------------------------------------------------------------------------------

        /* Fourth Column*/
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);

        /* ---- Calender ---- */
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ut1.setIcon(ImageGenerator.getIcon("images/icon12.png",20,20));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);

        /* ---- Calculator ---- */
        ut2.setFont(new Font("monospaced",Font.PLAIN,12));
        ut2.setIcon(ImageGenerator.getIcon("images/icon9.png",20,20));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);

        /* ---- Web Browser ---- */
        ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ut3.setIcon(ImageGenerator.getIcon("images/icon10.png",20,20));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);


        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);

        // ---------------------------------------------------------------------------------------

        /*Fifth Column */
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLUE);

        /* ---- Exit ---- */
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
        ex.setIcon(ImageGenerator.getIcon("images/icon11.png",20,20));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);


        // ---------------------------------------------------------------------------------------------


        master.add(m1);
        master.add(m2);
        //master.add(m3);

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

        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Customer Details")){
            new customer_details().setVisible(true);

        }else if(msg.equals("New Customer")){
            new new_customer().setVisible(true);

        }else if(msg.equals("Calculate Bill")){
            new calculate_bill().setVisible(true);

        }else if(msg.equals("Pay Bill")){
            new pay_bill().setVisible(true);

        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Exit")){
            System.exit(0);
        }else if(msg.equals("Generate Bill")){
            new generate_bill().setVisible(true);

        }else if(msg.equals("Last Bill")){
            new LastBill().setVisible(true);

        }


    }


    public static void main(String[] args){
        new Project().setVisible(true);
    }

}