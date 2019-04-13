import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NoScreen extends JFrame implements MouseListener
{
	private JLabel nLabel;
	private JPanel panel;
	private JButton againBtn,exitBtn;
	private Color backColor;

	public NoScreen()
	{
		super("Fool Game");
		this.setSize(700,580);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		backColor = new Color(204,255,255);
		panel.setBackground(backColor);
		panel.setLayout(null);
      	    
		this.add(panel);

		nLabel = new JLabel("Great,You are not a Fool.");
		nLabel.setBounds(150,200,500,100);
		nLabel.setBackground(new Color(204,255,255));
		nLabel.setFont(new Font("Georgia",Font.BOLD,30));
		nLabel.setForeground(Color.GREEN);
		nLabel.setOpaque(true);
		panel.add(nLabel);

		againBtn = new JButton("AGAIN");
		againBtn.setBounds(170,300,150,80);
		againBtn.setBackground(Color.GREEN);
		againBtn.setFont (new Font("Georgia",Font.BOLD,20));
		againBtn.addMouseListener(this);
		panel.add(againBtn);

		exitBtn = new JButton("EXIT");
		exitBtn.setBounds(340,300,150,80);
		exitBtn.setBackground(Color.YELLOW);
		exitBtn.setFont (new Font("Georgia",Font.BOLD,30));
		exitBtn.addMouseListener(this);
		panel.add(exitBtn);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource() == againBtn)
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
		if(me.getSource() == againBtn)
		{
			againBtn.setBackground(Color.BLUE);
			againBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else{}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == againBtn)
		{
			againBtn.setBackground(Color.GREEN);
			againBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else{}
	}


}
