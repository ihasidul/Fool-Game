import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FoolGame extends JFrame implements MouseListener, ActionListener
{
	private JLabel qLabel;
	private JButton yesBtn,noBtn;
	private JPanel panel;
	private Color backColor;
	private Font qFont;
	
	public FoolGame()
	{
		super("Fool Game");
		this.setSize(700,580);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		backColor = new Color(204,255,255);
		panel.setBackground(backColor);
		panel.setLayout(null);
		this.add(panel);
		
		qFont = new Font("Georgia",Font.BOLD,30);
		qLabel = new JLabel("ARE YOU A FOOL?");
		qLabel.setBounds(180,380,330,30);
		qLabel.setBackground(new Color(204,255,255));
		qLabel.setFont(qFont);
		qLabel.setOpaque(true);
		panel.add(qLabel);
	 	
		yesBtn = new JButton("YES");
		yesBtn.setBounds(200,430,100,40);
		yesBtn.setBackground(Color.GREEN);
		yesBtn.addMouseListener(this);
		yesBtn.addActionListener(this);
		panel.add(yesBtn);

		noBtn = new JButton("NO");
		noBtn.setBounds(350,430,100,40);
		noBtn.setBackground(Color.RED);
		noBtn.addMouseListener(this);
		noBtn.addActionListener(this);
		panel.add(noBtn);
		panel.setBackground(backColor);
	}

	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource() == yesBtn)
		{
			YesScreen ys = new YesScreen();
			ys.setVisible(true);
			this.setVisible(false);
		}
		else if(me.getSource() == noBtn)
		{
			System.exit(0);
		}
		else{}
	}
	
	public void mousePressed(MouseEvent me){}
	
	public void mouseReleased(MouseEvent me){}

	Random r1= new Random();
	Random r2= new Random();

	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == yesBtn)
		{
			yesBtn.setBackground(Color.BLUE);
			yesBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource().equals(noBtn))
		{
			noBtn.setBounds(r1.nextInt(650), r2.nextInt(520), 80, 30);
		}
		else{}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == yesBtn)
		{
			yesBtn.setBackground(Color.GREEN);
			yesBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == noBtn)
		{
			noBtn.setBackground(Color.RED);
			noBtn.setForeground(Color.BLACK);
		}
		else{}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		

		if(ae.getSource() == yesBtn)
		{
			YesScreen ys = new YesScreen();
			ys.setVisible(true);
			this.setVisible(false);

		}
		else if(ae.getSource() == noBtn)
		{
			NoScreen ns = new NoScreen();
			ns.setVisible(true);
			this.setVisible(false);

		}
		else{}
    }
}
