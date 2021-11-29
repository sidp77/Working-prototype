import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class button extends Applet implements ActionListener
{
	Button b1,b2,b3;
	public void init()
	{
		b1=new Button("emergency contact");
		b2=new Button("Medicine data");
		b3=new Button("doctor checkup");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setBackground(Color.pink);
		add(b1);
		add(b2);
		add(b3);
		add(new Label("hit a button to view contact/data/checkup"));
		
	}
	
	public void actionPerformed(ActionEvent e )
	{
		
			Object src = e.getSource();
			if(src==b1){
			JOptionPane.showMessageDialog(null, "020-24204289 Doctor\n 9120000000 Home \n", "Emergency contact", 1);
				setBackground(Color.red);
			}
			else if(src==b2){
				JOptionPane.showMessageDialog(null, "Cistanche Extract#3\n Galantamine(razadyne)\n","Medicine data", 1); 
				 setBackground(Color.green);
			}
			else if(src==b3){
				JOptionPane.showMessageDialog(null, "Last date visit\n \n New date ","doctor checkup", 1); 
				 setBackground(Color.blue);
			}
	}
}	