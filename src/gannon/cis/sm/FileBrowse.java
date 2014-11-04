package gannon.cis.sm;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class provide an interface which allow user choose the file from their file system.
 *
 */

public class FileBrowse extends JFrame {
	private JTextField filename = new JTextField(), dir = new JTextField();

	private JButton open = new JButton("Open");
	
	public FileBrowse() {
		JPanel p = new JPanel();
		open.addActionListener(new OpenL());
		p.add(open);
		
		Container cp = getContentPane();
		cp.add(p, BorderLayout.SOUTH);
		dir.setEditable(false);
		filename.setEditable(false);
		
		p = new JPanel();
		
		p.setLayout(new GridLayout(2, 1));
		p.add(filename);
		p.add(dir);
		cp.add(p, BorderLayout.NORTH);
	}

	class OpenL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser c = new JFileChooser();
			
			int rVal = c.showOpenDialog(FileBrowse.this);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				filename.setText(c.getSelectedFile().getName());
				c.getSelectedFile();
				dir.setText(c.getCurrentDirectory().toString());
			}
			if (rVal == JFileChooser.CANCEL_OPTION) {
				filename.setText("You pressed cancel");
				dir.setText("");
			}
		}
		
	
			
			
	
		
	}

	public static void run(JFrame frame, int width, int height) {
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("Choose A File");
	    frame.setSize(width, height);
	    frame.setVisible(true);
	  }
}