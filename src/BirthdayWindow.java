import javax.swing.JFrame; // window
import javax.swing.JLabel; // text
import javax.swing.SwingConstants; // location
import java.awt.Font; // font
import javax.swing.JButton; // button
import javax.swing.JPanel; // container that holds GUI components
import java.awt.FlowLayout; // controls how components are arranged inside the panel 
import java.awt.Color; // color
import javax.swing.ImageIcon; // image
import java.awt.Image;

public class BirthdayWindow {
	
	private JFrame frame; 
	private JLabel message;
	private JButton openButton;
	private JPanel panel;
	private FlowLayout layout;
	private BirthdayListener listener;
	private JLabel note;
	private ImageIcon cakeImage;
	private JLabel cakeLabel;
	private ImageIcon balloonImage;
	private JLabel balloonLabel;
	
	public BirthdayWindow() { // constructor
		
		frame = new JFrame("Happy Birthday"); 
		
		panel = new JPanel();
		
		layout = new FlowLayout();
		
		panel.setLayout(layout); 
		
		panel.setBackground(Color.PINK);
		
		message = new JLabel("Click to open the card", SwingConstants.CENTER);
		
		note = new JLabel("", SwingConstants.CENTER);
		
		note.setFont(new Font("Arial", Font.PLAIN, 18));
				
		openButton = new JButton("Open Card");
		
		listener = new BirthdayListener(this);
		
		openButton.addActionListener(listener);
		
		cakeImage = new ImageIcon(getClass().getResource("/images/cake.png"));
		
		balloonImage = new ImageIcon(getClass().getResource("/images/balloon.png"));
		
		Image resizedCake = cakeImage.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		
		Image resizedBalloon = balloonImage.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		
		cakeImage = new ImageIcon(resizedCake);
		
		balloonImage = new ImageIcon(resizedBalloon);
		
		cakeLabel = new JLabel(cakeImage);
		
		balloonLabel = new JLabel(balloonImage);
		
		cakeLabel.setVisible(false);
		
		balloonLabel.setVisible(false);
		
		message.setFont(new Font("Arial", Font.BOLD, 32));
		
		panel.add(message);
		
		panel.add(openButton);
		
		panel.add(note);
		
		panel.add(cakeLabel);
		
		panel.add(balloonLabel);
		
		frame.add(panel);
		
		frame.setSize(600, 400); // setting size of window
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes program once user clicks X
		
		frame.setVisible(true); // this shows the window on the screen
	
	}
	
	public void openCard() {
		
		message.setText("Happy Birthday!");
		
		note.setText("Have a good day!");
		
		openButton.setVisible(false);
		
		cakeLabel.setVisible(true);
		
		balloonLabel.setVisible(true);
		
	}
	
}
