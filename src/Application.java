// Final Project CSIT 211: Web Scrapper
// Names:  Rachada Chairangsaris(Bay),  Oluwatobiloba Odebo(Toby),  Matt Kline


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import java.awt.Choice;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.DropMode;

import java.awt.Component;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import java.awt.TextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Scrollbar;


public class Application {

	private JFrame frame;
	private JTextField textField_URL;
	private JTextField textField_SEARCH;
	private JTextField textField_SAVE_AS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 102, 0));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 922, 661);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblCredits = new JLabel("");
		lblCredits.setForeground(new Color(255, 255, 255));
		lblCredits.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		lblCredits.setBounds(300, 108, 79, 27);
		frame.getContentPane().add(lblCredits);
		
		JPanel panel = new JPanel();
		
		panel.setForeground(new Color(255, 0, 102));
		panel.setBackground(new Color(51, 51, 51));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(36, 151, 855, 459);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 18, 821, 424);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Chalkboard SE", Font.PLAIN, 15));
		textArea.setForeground(new Color(255, 255, 255));
		scrollPane.setViewportView(textArea);
		textArea.setBackground(new Color(0, 51, 51));
		
		
		textField_URL = new JTextField();
		textField_URL.setBackground(new Color(255, 255, 255));
		textField_URL.setBounds(87, 71, 292, 26);
		frame.getContentPane().add(textField_URL);
		textField_URL.setColumns(10);
		
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setForeground(new Color(255, 255, 255));
		lblUrl.setFont(new Font("Chalkduster", Font.BOLD, 15));
		lblUrl.setBounds(51, 76, 38, 16);
		frame.getContentPane().add(lblUrl);
		
		textField_SEARCH = new JTextField();
		textField_SEARCH.setBackground(new Color(255, 255, 255));
		textField_SEARCH.setBounds(584, 71, 217, 26);
		frame.getContentPane().add(textField_SEARCH);
		textField_SEARCH.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setForeground(new Color(255, 255, 255));
		lblSearch.setFont(new Font("Chalkduster", Font.PLAIN, 16));
		lblSearch.setBounds(521, 75, 61, 16);
		frame.getContentPane().add(lblSearch);
		
		JButton btnAz = new JButton("A-Z");
		btnAz.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		btnAz.setForeground(new Color(0, 0, 0));
		btnAz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				switch (textField_URL.getText())
				{
				
				case "http://catalog.ccbcmd.edu/preview_program.php?catoid=28&poid=13923":
					CCBCWebScrapper scrapper = new CCBCWebScrapper();
					String result = scrapper.CCBCScrapAndSortAtoZ(textField_URL.getText());
					textArea.setText(result);
					break;
				
					
				case "http://www.imdb.com/chart/top":
					IMDBWebScrapper test = new IMDBWebScrapper();
					result = test.IMDBScrapAndPrint(textField_URL.getText());
					textArea.setText(result);
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "You've entered an invalid URL, please try again.");
				
				}
			}
		});
		btnAz.setBounds(97, 109, 94, 26);
		frame.getContentPane().add(btnAz);
		
		JLabel lblSorting = new JLabel("Sorting");
		lblSorting.setForeground(new Color(255, 255, 255));
		lblSorting.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		lblSorting.setBounds(36, 108, 61, 30);
		frame.getContentPane().add(lblSorting);
		
		JButton btnZa = new JButton("Z-A"); 
		btnZa.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		btnZa.setForeground(new Color(0, 0, 0));
		btnZa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				switch (textField_URL.getText())
				{
				
				case "http://catalog.ccbcmd.edu/preview_program.php?catoid=28&poid=13923":
					CCBCWebScrapper scrapper = new CCBCWebScrapper();
					String result = scrapper.CCBCScrapAndSortZtoA(textField_URL.getText());
					textArea.setText(result);
					break;
				
					
				case "http://www.imdb.com/chart/top":
					IMDBWebScrapper test = new IMDBWebScrapper();
					result = test.IMDBSortRankLastToFirst(textField_URL.getText());
					textArea.setText(result);
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "You've entered an invalid URL, please try again.");
				
				}
				
			}
		});
		btnZa.setBounds(185, 108, 94, 26);
		frame.getContentPane().add(btnZa);
		
		
		JButton btnSubmit = new JButton("Submit");    // Submit button
		btnSubmit.setBackground(new Color(153, 153, 153));
		btnSubmit.setForeground(new Color(0, 0, 0));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch (textField_URL.getText())
				{
				
				case "http://catalog.ccbcmd.edu/preview_program.php?catoid=28&poid=13923":
					CCBCWebScrapper scrapper = new CCBCWebScrapper();
					String result = scrapper.CCBCScrapAndPrint(textField_URL.getText());
					textArea.setText(result);
					lblCredits.setText("Credits");
					btnAz.setText("A-Z");
					btnZa.setText("Z-A");
					break;
				
					
				case "http://www.imdb.com/chart/top":
					IMDBWebScrapper test = new IMDBWebScrapper();
					result = test.IMDBScrapAndPrint(textField_URL.getText());
					textArea.setText(result);
					lblCredits.setText("Ratings");
					btnAz.setText("1-250");
					btnZa.setText("250-1");
					break;
				
					
				default:
					JOptionPane.showMessageDialog(null, "You've entered an invalid URL, please try again.");
				
				}
				
			}
		});
		btnSubmit.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		btnSubmit.setBounds(375, 71, 94, 29);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(new Color(0, 0, 0));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				switch (textField_URL.getText())
				{
				
				case "http://catalog.ccbcmd.edu/preview_program.php?catoid=28&poid=13923":
					CCBCWebScrapper scrapper = new CCBCWebScrapper();
					String result = scrapper.CCBCScrapAndSearch(textField_URL.getText(), textField_SEARCH.getText());
					textArea.setText(result);
					break;
				
					
				case "http://www.imdb.com/chart/top":
					IMDBWebScrapper test = new IMDBWebScrapper();
					result = test.IMDBScrapAndSearch(textField_URL.getText(), textField_SEARCH.getText());
					textArea.setText(result);
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "You've entered an invalid URL, please try again.");
				
				}
			}
		});
		btnSearch.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		btnSearch.setBounds(800, 71, 91, 29);
		frame.getContentPane().add(btnSearch);
		
		JButton btnExport = new JButton("Export");
		btnExport.setForeground(new Color(0, 0, 0));
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Coming Soon!");
				
				/// add code for export method button in this part
				
				
				
			}
		});
		btnExport.setBackground(new Color(216, 191, 216));
		btnExport.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		btnExport.setBounds(800, 108, 91, 29);
		frame.getContentPane().add(btnExport);
		
		JLabel lblWebScrappingTool = new JLabel("Web Scrapping Tool for Cool People");
		lblWebScrappingTool.setForeground(new Color(255, 255, 255));
		lblWebScrappingTool.setFont(new Font("Chalkduster", Font.BOLD, 30));
		lblWebScrappingTool.setBounds(126, 6, 648, 53);
		frame.getContentPane().add(lblWebScrappingTool);
		
		
		
		JButton btnLowhigh = new JButton("Low-High");
		btnLowhigh.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		btnLowhigh.setForeground(new Color(0, 0, 0));
		btnLowhigh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				switch (textField_URL.getText())
				{
				
				case "http://catalog.ccbcmd.edu/preview_program.php?catoid=28&poid=13923":
					CCBCWebScrapper scrapper = new CCBCWebScrapper();
					String result = scrapper.CCBCScrapAndSortCreditsLowToHigh(textField_URL.getText());
					textArea.setText(result);
					break;
				
					
				case "http://www.imdb.com/chart/top":
					IMDBWebScrapper test = new IMDBWebScrapper();
					result = test.IMDBSortRatesLowToHigh(textField_URL.getText());
					textArea.setText(result);
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "You've entered an invalid URL, please try again.");
				
				}
				
			}
		});
		btnLowhigh.setBounds(371, 110, 109, 25);
		frame.getContentPane().add(btnLowhigh);
		
		JButton btnHighlow = new JButton("High-Low");
		btnHighlow.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		btnHighlow.setForeground(new Color(0, 0, 0));
		btnHighlow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				switch (textField_URL.getText())
				{
				
				case "http://catalog.ccbcmd.edu/preview_program.php?catoid=28&poid=13923":
					CCBCWebScrapper scrapper = new CCBCWebScrapper();
					String result = scrapper.CCBCScrapAndSortCreditsHighToLow(textField_URL.getText());
					textArea.setText(result);
					break;
				
					
				case "http://www.imdb.com/chart/top":
					IMDBWebScrapper test = new IMDBWebScrapper();
					result = test.IMDBSortRatesHighToLow(textField_URL.getText());
					textArea.setText(result);
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "You've entered an invalid URL, please try again.");
				
				}
				
			}
		});
		btnHighlow.setBounds(473, 108, 109, 29);
		frame.getContentPane().add(btnHighlow);
		
		
		
		textField_SAVE_AS = new JTextField();
		textField_SAVE_AS.setBackground(new Color(255, 255, 255));
		textField_SAVE_AS.setBounds(671, 109, 130, 26);
		frame.getContentPane().add(textField_SAVE_AS);
		textField_SAVE_AS.setColumns(10);
		
		JLabel lblSaveAs = new JLabel("Save As");
		lblSaveAs.setForeground(new Color(255, 255, 255));
		lblSaveAs.setFont(new Font("Chalkduster", Font.PLAIN, 15));
		lblSaveAs.setBounds(608, 108, 61, 27);
		frame.getContentPane().add(lblSaveAs);
		
		JLabel lblNewLabel = new JLabel("Created by Rachada Chairangsaris (Bay), Toby Odebo, Matt Kline");
		lblNewLabel.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(234, 615, 492, 16);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		
	}
}
