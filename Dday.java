import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Dday {

	private JFrame frame;
	private JTextField ddaymf;
	private JTextField ddaysf;
	private JTextField dayyf;
	private JTextField daymf;
	private JTextField daysf;
	private JTextField calculation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dday window = new Dday();
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
	public Dday() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("D-DAY \uACC4\uC0B0\uAE30");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 19));
		lblNewLabel.setBounds(140, 25, 145, 23);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC2DC\uC791\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(162, 157, 97, 23);
		panel.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\\uC131\uD654\\Desktop\\\uC5F0\uAD6C\uC2E4 \uD65C\uB3D9\\1.\uB514\uB370\uC774\uACC4\uC0B0\\33.PNG"));
		label.setBounds(0, 0, 434, 261);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uD2B9\uC815 \uB0A0\uC9DC");
		lblNewLabel_1.setBounds(33, 40, 57, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel ddayy = new JLabel("\uB144\uB3C4 :");
		ddayy.setBounds(33, 65, 57, 15);
		panel_1.add(ddayy);
		
		JLabel ddaym = new JLabel("\uC6D4 :");
		ddaym.setBounds(33, 90, 57, 15);
		panel_1.add(ddaym);
		
		JLabel ddays = new JLabel("\uC77C :");
		ddays.setBounds(33, 120, 57, 15);
		panel_1.add(ddays);
		
		ddaymf = new JTextField();
		ddaymf.setBounds(69, 91, 116, 12);
		ddaymf.setFont(new Font("±º∏≤", Font.PLAIN, 10));
		panel_1.add(ddaymf);
		ddaymf.setColumns(10);
		
		JTextField ddayyf = new JTextField();
		ddayyf.setBounds(69, 65, 116, 13);
		ddayyf.setFont(new Font("±º∏≤", Font.PLAIN, 10));
		ddayyf.setColumns(10);
		panel_1.add(ddayyf);
		
		ddaysf = new JTextField();
		ddaysf.setBounds(69, 117, 116, 12);
		ddaysf.setFont(new Font("±º∏≤", Font.PLAIN, 10));
		ddaysf.setColumns(10);
		panel_1.add(ddaysf);
		
		JLabel mday = new JLabel("DDAY");
		mday.setBounds(209, 40, 73, 15);
		panel_1.add(mday);
		
		JLabel dayy = new JLabel("\uB144\uB3C4 :");
		dayy.setBounds(209, 65, 57, 15);
		panel_1.add(dayy);
		
		JLabel daym = new JLabel("\uC6D4 :");
		daym.setBounds(209, 90, 57, 15);
		panel_1.add(daym);
		
		JLabel days_1 = new JLabel("\uC77C :");
		days_1.setBounds(209, 120, 57, 15);
		panel_1.add(days_1);
		
		dayyf = new JTextField();
		dayyf.setBounds(247, 66, 116, 12);
		dayyf.setFont(new Font("±º∏≤", Font.PLAIN, 10));
		dayyf.setColumns(10);
		panel_1.add(dayyf);
		
		daymf = new JTextField();
		daymf.setBounds(247, 90, 116, 12);
		daymf.setFont(new Font("±º∏≤", Font.PLAIN, 10));
		daymf.setColumns(10);
		panel_1.add(daymf);
		
		daysf = new JTextField();
		daysf.setBounds(247, 117, 116, 12);
		daysf.setFont(new Font("±º∏≤", Font.PLAIN, 10));
		daysf.setColumns(10);
		panel_1.add(daysf);
		
		calculation = new JTextField();
		calculation.setBounds(109, 192, 254, 21);
		panel_1.add(calculation);
		calculation.setColumns(10);
		
		JButton btncal = new JButton("\uACC4\uC0B0\uD558\uAE30");
		btncal.setBounds(150, 148, 97, 23);
		btncal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int y,m,s,y1,m1,s1;;
			
			int oneDay = 24 * 60 * 60 * 1000;
			int longYearDays = 366;
			int normalYearDays = 365;
			
			y=Integer.parseInt(ddayyf.getText());
			m=Integer.parseInt(ddaymf.getText());
			s=Integer.parseInt(ddaysf.getText());
			
			y1=Integer.parseInt(dayyf.getText());
			m1=Integer.parseInt(daymf.getText());
			s1=Integer.parseInt(daysf.getText());
			
			
			
			Calendar dday = GregorianCalendar.getInstance();
			dday.set(y, m - 1, s);

			GregorianCalendar cal = new GregorianCalendar();
			cal.set(y1, m1 - 1, s1);

			long millis = cal.getTimeInMillis() - dday.getTimeInMillis();
			long days = millis /oneDay;
			int tYear = dday.get(Calendar.YEAR);
			long remainDays = s-1;
			long remainYears = 0;
			
			for (int i = tYear; i < y; i++) {
				if (((i % 4) == 0) && ((i % 100) != 0) && ((i % 400) == 0)) {
					if (remainDays > longYearDays) {
						remainDays -= 366;
						remainYears++;
					}
				} else {
					if (remainDays > normalYearDays) {
						remainDays -= 365;
						remainYears++;
					}
				}
			}
			
		calculation.setText(days+remainDays+"¿œ"+'\n');
		
			}
		});
		
		panel_1.add(btncal);
		
		JLabel Ddaycal = new JLabel("\uB514\uB370\uC774 :");
		Ddaycal.setBounds(33, 190, 64, 24);
		Ddaycal.setFont(new Font("±º∏≤", Font.BOLD, 15));
		panel_1.add(Ddaycal);
		
		
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 434, 261);
		panel_1.add(label_1);
		label_1.setIcon(new ImageIcon("C:\\Users\\\uC131\uD654\\Desktop\\\uC5F0\uAD6C\uC2E4 \uD65C\uB3D9\\1.\uB514\uB370\uC774\uACC4\uC0B0\\33.PNG"));
	}
}
