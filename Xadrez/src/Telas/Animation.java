package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Animation {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animation window = new Animation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Animation() {
		initialize();
	}
	
	JProgressBar progressBar = new JProgressBar();
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		 ImageIcon img = new ImageIcon(this.getClass().getResource("/TelaAnimação.jpg"));
		 	frame.getContentPane().setLayout(null);
			
		 	progressBar.setBounds(0, 311, 557, 45);
			progressBar.setStringPainted(true);
			progressBar.setValue(0);
			progressBar.setMaximum(100);
			progressBar.setForeground(new Color(79,79,79));
			new Temporizador().start();
			
			frame.getContentPane().add(progressBar);
			JLabel fundotela = new JLabel("");
			fundotela.setIcon(img);
			
			fundotela.setBounds(0, 0, 557, 314);
			frame.getContentPane().add(fundotela);
			
}
	public class Temporizador extends Thread{
		public void run() {
			while(progressBar.getValue()<100)
			{
				try {
					sleep(20);
					progressBar.setValue(progressBar.getValue()+1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Tabuleiro back = new Tabuleiro();
            frame.setVisible(false);
            back.main(null);
		}
	}
}
