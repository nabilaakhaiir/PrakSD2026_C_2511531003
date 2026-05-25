package pekan8_2511531003;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BubbleSort_2511531003 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_1003;
    private JLabel[] labelArray_1003;
    private JButton stepButton_1003, resetButton_1003, setButton_1003;
    private JTextField inputField_1003;
    private JPanel panelArray_1003;
    private JTextArea stepArea_1003;
    private int i_1003 = 1, j_1003;
    private boolean sorting_1003 = false;
    private int stepCount_1003 = 1;

	
	
	public BubbleSort_2511531003() {
		setTitle("Insertion Sort Langkah per Langkah");
	    setSize(750, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setLayout(new BorderLayout());

	    // Panel input
	    JPanel inputPanel_1003 = new JPanel(new FlowLayout());
	    inputField_1003 = new JTextField(30);
	    setButton_1003 = new JButton("Set Array");
	    inputPanel_1003.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	    inputPanel_1003.add(inputField_1003);
	    inputPanel_1003.add(setButton_1003);

	    // Panel array visual
	    panelArray_1003 = new JPanel();
	    panelArray_1003.setLayout(new FlowLayout());

	    // Panel kontrol
	    JPanel controlPanel_1003 = new JPanel();
	    stepButton_1003 = new JButton("Langkah Selanjutnya");
	    resetButton_1003 = new JButton("Reset");
	    stepButton_1003.setEnabled(false);
	    controlPanel_1003.add(stepButton_1003);
	    controlPanel_1003.add(resetButton_1003);
		
	    // Area teks untuk log langkah-langkah
	    stepArea_1003 = new JTextArea(8, 60);
	    stepArea_1003.setEditable(false);
	    stepArea_1003.setFont(new Font("Monospaced", Font.PLAIN, 14));
	    JScrollPane scrollPane_1003 = new JScrollPane(stepArea_1003);

	    // Tambahkan panel ke frame
	    add(inputPanel_1003, BorderLayout.NORTH);
	    add(panelArray_1003, BorderLayout.CENTER);
	    add(controlPanel_1003, BorderLayout.SOUTH);
	    add(scrollPane_1003, BorderLayout.EAST);
	    
	    // Event Set Array
	    setButton_1003.addActionListener(e -> setArrayFromInput_1003());
	    
	    // Event Langkah Selanjutnya\
	    stepButton_1003.addActionListener(e -> performStep_1003());
	    
	    // Event reset
	    resetButton_1003.addActionListener(e -> reset_1003 ());
	    }

	private void setArrayFromInput_1003() {
	    String text_1003 = inputField_1003.getText().trim();

	    if (text_1003.isEmpty())
	        return;

	    String[] parts_1003 = text_1003.split(",");
	    array_1003 = new int[parts_1003.length];
	    try {
	        for (int k_1003 = 0; k_1003 < parts_1003.length; k_1003++) {
	            array_1003[k_1003] =
	                    Integer.parseInt(parts_1003[k_1003].trim());
	        }
	    } catch (NumberFormatException e_1003) {
	        JOptionPane.showMessageDialog(
	                this,
	                "Masukkan hanya angka "
	                        + "yang dipisahkan koma!",
	                "Error",
	                JOptionPane.ERROR_MESSAGE
	        );

	        return;
	    }

	    i_1003 = 0;
	    j_1003 = 0;
	    stepCount_1003 = 1;
	    sorting_1003 = true;

	    stepButton_1003.setEnabled(true);
	    stepArea_1003.setText("");
	    panelArray_1003.removeAll();
	    labelArray_1003 = new JLabel[array_1003.length];

	    for (int k_1003 = 0; k_1003 < array_1003.length; k_1003++) {

	        labelArray_1003[k_1003] =new JLabel(String.valueOf(array_1003[k_1003]));
	        labelArray_1003[k_1003].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_1003[k_1003].setOpaque(true);
	        labelArray_1003[k_1003].setBackground(Color.WHITE);
	        labelArray_1003[k_1003].setBorder(BorderFactory.createLineBorder(Color.BLACK)
	                );

	        labelArray_1003[k_1003].setPreferredSize(new Dimension(50, 50));
	        labelArray_1003[k_1003].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_1003.add(labelArray_1003[k_1003]);
	    }

	    panelArray_1003.revalidate();
	    panelArray_1003.repaint();
	}
	private void performStep_1003() {

	    if (!sorting_1003 || i_1003 >= array_1003.length - 1) {

	        sorting_1003 = false;
	        stepButton_1003.setEnabled(false);
	        JOptionPane.showMessageDialog(
	                this,
	                "Sorting selesai!"
	        );

	        return;
	    }

	    resetHighlights_1003();
	    StringBuilder stepLog_1003 = new StringBuilder();
	    labelArray_1003[j_1003].setBackground(Color.CYAN);
	    labelArray_1003[j_1003 + 1].setBackground(Color.CYAN);
	    if (array_1003[j_1003] > array_1003[j_1003 + 1]) {

	        // Swap
	        int temp_1003 = array_1003[j_1003];
	        array_1003[j_1003] =array_1003[j_1003 + 1];
	        array_1003[j_1003 + 1] =temp_1003;

	        labelArray_1003[j_1003].setBackground(Color.RED);
	        labelArray_1003[j_1003 + 1].setBackground(Color.RED);
	        stepLog_1003.append("Langkah ").append(stepCount_1003).append(": Menukar elemen ke-")
	                .append(j_1003).append(" (").append(array_1003[j_1003 + 1]).append(") dengan ke-")
	                .append(j_1003 + 1).append(" (").append(array_1003[j_1003]).append(")\n");

	    } else {
	        stepLog_1003.append("Langkah ")
	                .append(stepCount_1003).append(": Tidak ada pertukaran antara ke-")
	                .append(j_1003).append(" dan ke-").append(j_1003 + 1).append("\n");
	    }

	    stepLog_1003.append("Hasil: ").append(arrayToString_1003(array_1003)).append("\n\n");
	    stepArea_1003.append(stepLog_1003.toString());
	    updateLabels_1003();
	    j_1003++;

	    if (j_1003 >= array_1003.length - i_1003 - 1) {
	        j_1003 = 0;
	        i_1003++;
	    }

	    stepCount_1003++;
	    if (i_1003 >= array_1003.length - 1) {

	        sorting_1003 = false;
	        stepButton_1003.setEnabled(false);
	        JOptionPane.showMessageDialog(
	                this,
	                "Sorting selesai!"
	        );
	    }
	}
	private void updateLabels_1003() {
	    for (int k_1003 = 0; k_1003 < array_1003.length; k_1003++) {
	        labelArray_1003[k_1003].setText(String.valueOf(array_1003[k_1003]));
	    }
	}

	private void resetHighlights_1003() {
	    for (JLabel label_1003 : labelArray_1003) {
	        label_1003.setBackground(Color.WHITE);
	    }
	}

	private void reset_1003() {
	    inputField_1003.setText("");
	    panelArray_1003.removeAll();
	    panelArray_1003.revalidate();
	    panelArray_1003.repaint();
	    stepArea_1003.setText("");
	    stepButton_1003.setEnabled(false);
	    sorting_1003 = false;
	    i_1003 = 0;
	    j_1003 = 0;
	    stepCount_1003 = 1;
	}

	private String arrayToString_1003(int[] arr_1003) {
	    StringBuilder sb_1003 = new StringBuilder();
	    for (int k_1003 = 0; k_1003 < arr_1003.length; k_1003++) {
	        sb_1003.append(arr_1003[k_1003]);
	        if (k_1003 < arr_1003.length - 1)
	            sb_1003.append(", ");
	    }
	    return sb_1003.toString();
	}
	public static void main (String [] args) {
		SwingUtilities.invokeLater(() -> {
			BubbleSort_2511531003 gui_1003 = new BubbleSort_2511531003 () ;
			gui_1003.setVisible(true);
		}); 
	}
}