import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BirthdayListener implements ActionListener {
	
	private BirthdayWindow window;
	
	public BirthdayListener(BirthdayWindow window) { 
		
		this.window = window; 
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		window.openCard();
		
	}
	
}
