package quiz4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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

import quiz1.quiz1;
import quiz5.quiz5;
import java.awt.Toolkit;

public class quiz4 extends quiz1 {

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
					quiz4 frame4 = new quiz4();
					frame4.setVisible(true);
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
	public quiz4() throws IOException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\QuizApp_GUI\\src\\quizz.png"));
		//to dispose you need this
		quiz4 frame4 = this;
		
		setTitle("Quiz4");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(55, 112, 551, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setBounds(330, 228, 195, 49);
		panel.add(btnNewButton);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Rubber band");
		rdbtnNewRadioButton.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(29, 133, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("None of the Above");
		rdbtnNewRadioButton_1.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBounds(29, 171, 172, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Anti Static Wrist Strap");
		rdbtnNewRadioButton_2.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBounds(29, 96, 229, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Wrist Strap");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton_3.setBounds(29, 57, 109, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton_1 = new JButton("Proceed");
		btnNewButton_1.setBounds(330, 228, 195, 49);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quiz5 frame5 = null;
				try {
					frame5 = new quiz5();
					frame5.setVisible(true);
					frame5.setResizable(false);
					frame4.dispose();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnNewButton_1.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(55, 27, 551, 86);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblYourScore = new JLabel(" Score");
		lblYourScore.setBounds(10, 11, 96, 38);
		panel_1.add(lblYourScore);
		lblYourScore.setForeground(Color.WHITE);
		lblYourScore.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblYourTime = new JLabel("Your Time");
		lblYourTime.setBounds(360, 11, 136, 38);
		panel_1.add(lblYourTime);
		lblYourTime.setForeground(Color.WHITE);
		lblYourTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
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
		progressBar.setForeground(new Color(255, 255, 255));
		progressBar.setBounds(284, 50, 244, 25);
		panel_1.add(progressBar);
		progressBar.setBackground(new Color(0, 255, 128));
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel = new JLabel("4. It was a wrist strap that protect you from electrocnic components");
		lblNewLabel.setBounds(10, 11, 530, 37);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
		        	
		            if(rdbtnNewRadioButton_2.isSelected()) {
		            	
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
		            timer.stop();
		            }
		        }
		        timer.stop();
		    }
		});

		timer.start();
	}
	
}