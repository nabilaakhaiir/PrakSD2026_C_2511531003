package pekan7_2511531003;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InsertionGUI_2511531003 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array;
	private JLabel [] labelArray_1003;
	private JButton stepButton_1003, resetButton_1003, setButton_1003;
	private JTextField inputField_1003;
	private JPanel panelArray_1003;
	private JTextArea stepArea_1003;
	private JPanel contentPane_1003;

	private int i = 1, j;
	private boolean sorting_1003 = false;
	private int stepcount_1003 = 1;
	
	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511531003() {
		setTitle ("Insertion Sort Langkah per Langkah");
		setSize (750, 400);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo (null);
		setLayout (new BorderLayout());
		
		//panel input
		JPanel inputPanel = new JPanel (new FlowLayout());
		inputField_1003 = new JTextField (30);
		setButton_1003 = new JButton ("Set Array");
		inputPanel.add(new JLabel ("Masukkanangka (pisahkan dengan koma):"));
		inputPanel.add (inputField_1003);
		inputPanel.add (setButton_1003);
		
		//panel array visual
		panelArray_1003 = new JPanel();
		panelArray_1003.setLayout (new FlowLayout());
		
		//panel kontrol
		JPanel controlPanel = new JPanel();
		stepButton_1003 = new JButton ("Langkah Selanjutnya");
		resetButton_1003 = new JButton ("Reset");
		stepButton_1003.setEnabled (false);
		controlPanel.add (stepButton_1003);
		controlPanel.add (resetButton_1003);
		
		//area teks untuk log langkah langkah
		stepArea_1003 = new JTextArea (8, 60);
		stepArea_1003.setEditable (false);
		stepArea_1003.setFont (new Font ("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane (stepArea_1003);
		
		//tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_1003, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		//event set Array
		setButton_1003.addActionListener (e -> setArrayFromInput());
		
		//Event Langkah Selanjutnya
		setButton_1003.addActionListener (e -> performStep());
		
		//event reset
		resetButton_1003.addActionListener (e -> reset());
	}
	
	private void setArrayFromInput() {
		String text = inputField_1003.getText().trim();
		if (text.isEmpty()) return;
		String [] parts = text.split(",");
		array = new int [parts.length];
		try {
			for (int k = 0; k < parts.length; k++) {
				array[k] = Integer.parseInt(parts[k].trim());   }
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog (this, "Masukkan hanya angka yang dipisahkan "
						+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
				return;   }
				i = 1;
				stepcount_1003 = 1;
				sorting_1003 = true;
				stepButton_1003.setEnabled(true);
				stepArea_1003.setText("");
				panelArray_1003.removeAll();
				labelArray_1003 = new JLabel [array.length];
				for (int k = 0; k < array.length; k++) {
					labelArray_1003[k] = new JLabel (String.valueOf(array[k]));
					labelArray_1003[k].setFont (new Font ("Arial", Font.BOLD, 24));
					labelArray_1003[k].setBorder (BorderFactory.createLineBorder(Color.BLACK));
					labelArray_1003[k].setPreferredSize (new Dimension(50,50));
					labelArray_1003[k].setHorizontalAlignment (SwingConstants.CENTER);
					panelArray_1003.add(labelArray_1003[k]);					
				}
				panelArray_1003.revalidate();
				panelArray_1003.repaint();
			}
			
			private void performStep () {
				if (i < array.length && sorting_1003) {
					int key = array [i];
					j = i - 1;
					
					StringBuilder stepLog = new StringBuilder();
					stepLog.append("Langkah ").append(stepcount_1003).
					append(": Memasukkan ").append(key).append("\n");
					
					while (j >= 0 && array [j] > key) {
						array [j + 1] = array [j];
						j--;
					}
					array [j + 1] = key;
					
					updateLabels();
					stepLog.append("Hasil: ").append(arrayToString(array)).append("\n\n");
					stepArea_1003.append(stepLog.toString());
					
					i++;
					stepcount_1003++;
					
					if (i == array.length) {
						sorting_1003 = false;
						stepButton_1003.setEnabled(false);
						JOptionPane.showMessageDialog(this, "Sorting selesai");
					}
				}
			}
			
			private void updateLabels() {
				for (int k = 0; k < array.length; k++) {
					labelArray_1003[k].setText(String.valueOf(array[k]));
				}
			}
			
			private void reset() {
				inputField_1003.setText("");
				panelArray_1003.removeAll();
				panelArray_1003.revalidate();
				panelArray_1003.repaint();
				stepArea_1003.setText("");
				stepButton_1003.setEnabled(false);
				sorting_1003 = false;
				i = 1;
				stepcount_1003 = 1;
			}
			
			private String arrayToString (int[] arr) {
				StringBuilder sb = new StringBuilder ();
				for (int k = 0; k < arr.length; k++) {
					sb.append(arr[k]);
					if(k < arr.length - 1) sb.append(", ");
				}
				return sb.toString();
			}
		}
	
