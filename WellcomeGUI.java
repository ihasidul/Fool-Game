import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WellcomeGUI extends JFrame  implements MouseListener
{
	private JLabel wellcomeLabel;
	private JButton eBtn,exitBtn;
	private JPanel wPanel;

	public WellcomeGUI()
	{
		super("Wellcome to Fool Game");
		this.setSize(700,580);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		wPanel = new JPanel();
		wPanel.setBackground(new Color(204,255,255));
        wPanel.setLayout(null);

		this.add(wPanel);

		wellcomeLabel = new JLabel("Welcome To Fool Game!");
		wellcomeLabel.setBounds(130,100,500,200);
		wellcomeLabel.setBackground(new Color(204,255,255));
		wellcomeLabel.setFont(new Font("Georgia",Font.BOLD,30));
		wellcomeLabel.setOpaque(true);
		wPanel.add(wellcomeLabel);

		eBtn = new JButton("ENTER");
		eBtn.setBounds(170,300,150,80);
		eBtn.setBackground(Color.GREEN);
		eBtn.setFont (new Font("Georgia",Font.BOLD,30));
		eBtn.addMouseListener(this);
		wPanel.add(eBtn);
		
		exitBtn = new JButton("EXIT");
		exitBtn.setBounds(340,300,150,80);
		exitBtn.setBackground(Color.YELLOW);
		exitBtn.setFont (new Font("Georgia",Font.BOLD,30));
		exitBtn.addMouseListener(this);
		wPanel.add(exitBtn);

	}

	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource() == eBtn)
		{
			FoolGame f1 = new FoolGame();
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(me.getSource() == exitBtn)
		{
			System.exit(0);
		}
		else{}
	}
	
	public void mousePressed(MouseEvent me){}
	
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == eBtn)
		{
			eBtn.setBackground(Color.BLUE);
			eBtn.setForeground(Color.WHITE);
		}
		if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else{}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == eBtn)
		{
			eBtn.setBackground(Color.GREEN);
			eBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else{}
	}
}
