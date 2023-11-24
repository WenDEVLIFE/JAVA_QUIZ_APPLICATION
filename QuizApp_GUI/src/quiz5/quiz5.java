package quiz5;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Score_menu.score;
import quiz1.quiz1;


public class quiz5 extends quiz1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quiz5 frame5 = new quiz5();
					frame5.setVisible(true);
					frame5.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public quiz5() throws IOException {
		quiz5 frame5  = this;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\QuizApp_GUI\\src\\quizz.png"));
		//to dispose you need this
	
		
		setTitle("Quiz5");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(55, 112, 549, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setBounds(324, 230, 195, 49);
		panel.add(btnNewButton);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Object Oriented Programming");
		rdbtnNewRadioButton.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(16, 57, 254, 23);
		panel.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Object Oriented Program");
		rdbtnNewRadioButton_1.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBounds(16, 100, 167, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Objecting Orientation Programming");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton_2.setBounds(16, 146, 233, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("None of the Above");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton_3.setBounds(16, 184, 109, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton_1 = new JButton("See your Results");
		btnNewButton_1.setBounds(324, 230, 195, 49);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score framescore = null;
				try {
					framescore = new score();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				framescore.setVisible(true);
				framescore.setResizable(false);
				frame5.dispose();

			}
		});
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(55, 35, 549, 78);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setForeground(Color.WHITE);
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblScore.setBounds(10, 11, 81, 37);
		panel_1.add(lblScore);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTime.setBounds(402, 11, 81, 37);
		panel_1.add(lblTime);
		
		JProgressBar progressBar = new JProgressBar(0, 30);
		progressBar.setValue(0);
		boolean running = true;

		if (running) {
		    while (progressBar.getValue() < 1) {
		        progressBar.setValue(progressBar.getValue() + 1);
		        try {
		            Thread.sleep(1000); // wait for 100 milliseconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }
		    running = false;
		}
		progressBar.setBackground(new Color(0, 255, 128));
		progressBar.setForeground(new Color(255, 255, 255));
		progressBar.setBounds(333, 45, 206, 22);
		panel_1.add(progressBar);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel = new JLabel("5. OOP acronym");
		lblNewLabel.setBounds(10, 13, 359, 37);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		final Timer timer = new Timer(1000, new ActionListener() {
		    int i = 30;
		    public void actionPerformed(ActionEvent e) {
		        progressBar.setValue(i);
		        i--;
		        if (i == 0) {
		        	JOptionPane.showMessageDialog(null, "Times Up!",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
		            ((Timer)e.getSource()).stop();
		            btnNewButton_1.setVisible(true);
	                btnNewButton.setVisible(false);
		        }
		    }
		});

		btnNewButton.addActionListener(new ActionListener() {
		    @SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
		    	int QuestionScore = Score;	// use the Score variable from q1 class in order to add
				// the total Score by using increment operator
		        if (e.getSource()==btnNewButton) {

		    		
		            if(rdbtnNewRadioButton.isSelected()) {
		            	
		            	QuestionScore++;			// now use the increment since the answer is correct		
		    			Score = QuestionScore;	
		    			   
		                try {
							File file = new File("src\\sucess.wav");
							AudioInputStream audio = AudioSystem.getAudioInputStream(file);
							Clip clip = AudioSystem.getClip();
							clip.open(audio);
							if (e.getSource()==btnNewButton) {
								clip.start();
								
								JOptionPane.showMessageDialog(null, "You are correct " + Score,
	                                     "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	                btnNewButton_1.setVisible(true);
	                btnNewButton.setVisible(false);
	                final int Score = QuestionScore;
								
							}
						}
					
						
						catch(LineUnavailableException e1) {
							e1.printStackTrace();			
						}
						catch(UnsupportedAudioFileException e1) {
							e1.printStackTrace();
						}
						catch(IOException e1) {
							e1.printStackTrace();
						}
					
		            } else {
		            	try {
							File file = new File("src\\fail.wav");
							AudioInputStream audio = AudioSystem.getAudioInputStream(file);
							Clip clip = AudioSystem.getClip();
							clip.open(audio);
							if (e.getSource()==btnNewButton) {
								clip.start();
								  JOptionPane.showMessageDialog(null, "You Are Wrong",
			                                 "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
			                btnNewButton_1.setVisible(true);
			                btnNewButton.setVisible(false);
								
								
							}
						}
					
						
						catch(LineUnavailableException e1) {
							e1.printStackTrace();			
						}
						catch(UnsupportedAudioFileException e1) {
							e1.printStackTrace();
						}
						catch(IOException e1) {
							e1.printStackTrace();
						}
		           
		            }
		        }
		        timer.stop();
		    }
		});

		timer.start();
	}
	
}
