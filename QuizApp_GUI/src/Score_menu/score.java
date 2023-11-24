package Score_menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main_menu.main_menu;
import quiz1.quiz1;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class score extends quiz1 {

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
					score framescore = new score();
					framescore.setVisible(true);
					framescore.setResizable(false);
					

					
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
	public score() throws IOException {
	    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\QuizApp_GUI\\src\\quizz.png"));
		setTitle("SCORE");
		AudioPlayer player = new AudioPlayer("src/nawhji.wav");
		player.play();
		score framescore = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YOU MADE IT!");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel.setBounds(164, 52, 198, 97);
		contentPane.add(lblNewLabel);
		
		JLabel lblScore = new JLabel("SCORE: " + Score);
		lblScore.setForeground(Color.WHITE);
		lblScore.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblScore.setBounds(196, 136, 107, 97);
		contentPane.add(lblScore);
		
		JButton btnNewButton = new JButton("TRY AGAIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quiz1 ywa = null;
				try {
					AudioPlayer.clip.stop();
					Score -=Score;
					
					ywa = new quiz1();
					ywa.setVisible(true);
					ywa.setResizable(false);
					framescore.dispose();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(51, 362, 142, 54);
		contentPane.add(btnNewButton);
		
		JButton btnBackToMenu = new JButton("BACK TO MENU");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				main_menu frame = new main_menu();
				Score -=Score;
				AudioPlayer.clip.stop();
				frame.setVisible(true);
				frame.setResizable(false);
				framescore.dispose();
			}
		});
		btnBackToMenu.setBounds(302, 362, 142, 54);
		contentPane.add(btnBackToMenu);
		
		JLabel lblYouAreSo = new JLabel("YOU ARE SO AWESOME!");
		lblYouAreSo.setForeground(Color.WHITE);
		lblYouAreSo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblYouAreSo.setBounds(117, 225, 279, 97);
		lblYouAreSo.setVisible(false);
		contentPane.add(lblYouAreSo);
		
		JLabel lblAlmostCloseMate = new JLabel("ALMOST CLOSE MATE!");
		lblAlmostCloseMate.setForeground(Color.WHITE);
		lblAlmostCloseMate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblAlmostCloseMate.setBounds(117, 225, 319, 97);
		lblAlmostCloseMate.setVisible(false);
		contentPane.add(lblAlmostCloseMate);
		
		JLabel lblEee = new JLabel("BETTER LUCK NEXT TIME");
		lblEee.setForeground(Color.WHITE);
		lblEee.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblEee.setBounds(104, 225, 334, 97);
		lblEee.setVisible(false);
		contentPane.add(lblEee);
		
		if ( Score ==0 || Score==1 || Score==2  || Score==3) {
			lblEee.setVisible(true);
		}

if (Score==4) {
	lblAlmostCloseMate.setVisible(true);
}
if (Score==5) {
	lblYouAreSo.setVisible(true);
}
	

	}
	public class AudioPlayer {
	    public static Clip clip;

	    public AudioPlayer(String s) {
	        try {
	            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("src/nawhji.wav"));
	            clip = AudioSystem.getClip();
	            clip.open(ais);
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void play() {
	        if (clip == null || !clip.isOpen() || clip.isRunning()) return;
	        stop();
	        clip.setFramePosition(0);
	        clip.loop(Clip.LOOP_CONTINUOUSLY);
	        clip.start();
	    }
	    public void stop() {
	        if (clip.isRunning()) clip.stop();
	    }	
	}
}
