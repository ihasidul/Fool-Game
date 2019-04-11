import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt,event.*;

public class FoolGame extends JFrame implements MouseListener
{
	private JLabel qLabel;
	private JButton yesBtn,noBtn;
	private JPanel panel;

	public FoolGame()
	{
		super("Welcome to FoolGame");
		this.setSize(700,580);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		backColor = new Color();
	}
}
