import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FoolGame extends JFrame 
{
	private JLabel qLabel;
	private JButton yesBtn,noBtn;
	private JPanel panel;
	private Color backColor;
	private Font qFont;
	public FoolGame()
	{
		super("FoolGame");
		this.setSize(700,580);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		backColor = new Color(204,255,255);
		panel.setBackground(backColor);
		panel.setLayout(null);

		qFont = new Font("Georgia",Font.BOLD,30);
		
		qLabel = new JLabel("ARE YOU A FOOL?");
		qLabel.setBounds(180,380,330,30);
		qLabel.setBackground(new Color(204,255,255));
		qLabel.setFont(qFont);
		qLabel.setOpaque(true);
		panel.add(qLabel);
	 	
		yesBtn = new JButton("YES");
		yesBtn.setBounds(200,430,100,40);
		panel.add(yesBtn);

		noBtn = new JButton("NO");
		noBtn.setBounds(350,430,100,40);
		panel.add(noBtn);
		this.add(panel);

	}
}
