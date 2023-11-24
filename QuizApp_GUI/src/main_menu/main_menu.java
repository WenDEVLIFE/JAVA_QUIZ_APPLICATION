package main_menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import quiz1.quiz1;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
public class main_menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=1,-31
	 */
	@SuppressWarnings("unused")
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 * 
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_menu frame = new main_menu();
					frame.setVisible(true);
					frame.setResizable(false);
				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main_menu() {
		main_menu frame = this;
		// play the song 
		AudioPlayer player = new AudioPlayer("src/BALDI.wav");
		player.play();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\QuizApp_GUI\\src\\quizz.png"));
		setTitle("QUIZZ_GAME_VER1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUIZZ GAME ");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 80));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(158, 69, 309, 136);
		contentPane.add(lblNewLabel);
		
		JLabel lblTapToStart = new JLabel("                               TAP TO START");
		lblTapToStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				quiz1 ywa = null;
				try {
					ywa = new quiz1();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				ywa.setVisible(true);
				ywa.setResizable(false);
				frame.dispose();
				// when it click stops the song
				try {
					AudioPlayer.clip.stop();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} // calling stop() method
			}
		});
		lblTapToStart.setForeground(Color.WHITE);
		lblTapToStart.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblTapToStart.setBounds(0, 0, 592, 581);
		contentPane.add(lblTapToStart);
	}
	//this are the code to autoplay the song
	public class AudioPlayer {
	    public static Clip clip;

	    public AudioPlayer(String s) {
	        try {
	            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("src/BALDI.wav"));
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
