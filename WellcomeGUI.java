import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WellcomeGUI extends JFrame extends MouseListener, ActionListener
{
	private JLabel wellcomeLabel;
	private JButton eBtn;
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
		eBtn.setBounds(190,300,200,100);
		eBtn.setBackground(Color.GREEN);
		eBtn.setFont (new Font("Georgia",Font.BOLD,40));
		wPanel.add(eBtn);
		

	}
}
