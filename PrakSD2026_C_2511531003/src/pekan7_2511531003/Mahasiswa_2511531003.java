package pekan7_2511531003;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class Mahasiswa_1003 {
	private String nama_1003;
	private String nim_1003;
	private String prodi_1003;

	public Mahasiswa_1003(String nama_1003, String nim_1003, String prodi_1003) {
		this.nama_1003 = nama_1003;
		this.nim_1003 = nim_1003;
		this.prodi_1003 = prodi_1003;
	}

	public String getNama_1003() {
		return nama_1003;
	}

	public String toString() {
		return nama_1003 + " - " + nim_1003 + " - " + prodi_1003;
	}
}

public class Mahasiswa_2511531003 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField namaField_1003, nimField_1003, prodiField_1003;
	private JTextArea outputArea_1003;
	private JButton tambahButton_1003, sortButton_1003, resetButton_1003;
	private JComboBox<String> comboSort_1003;

	private ArrayList<Mahasiswa_1003> dataMahasiswa_1003 = new ArrayList<>();

	public Mahasiswa_2511531003() {
		setTitle("Sorting Nama Mahasiswa - 2511531003");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		JPanel inputPanel_1003 = new JPanel(new FlowLayout());

		namaField_1003 = new JTextField(10);
		nimField_1003 = new JTextField(10);
		prodiField_1003 = new JTextField(10);
		tambahButton_1003 = new JButton("Tambah Data");

		inputPanel_1003.add(new JLabel("Nama:"));
		inputPanel_1003.add(namaField_1003);
		inputPanel_1003.add(new JLabel("NIM:"));
		inputPanel_1003.add(nimField_1003);
		inputPanel_1003.add(new JLabel("Prodi:"));
		inputPanel_1003.add(prodiField_1003);
		inputPanel_1003.add(tambahButton_1003);

		JPanel controlPanel_1003 = new JPanel(new FlowLayout());

		comboSort_1003 = new JComboBox<>(new String[] {
				"Insertion Sort",
				"Selection Sort",
				"Bubble Sort"
		});

		sortButton_1003 = new JButton("Mulai Sorting");
		resetButton_1003 = new JButton("Reset");

		controlPanel_1003.add(new JLabel("Pilih Algoritma:"));
		controlPanel_1003.add(comboSort_1003);
		controlPanel_1003.add(sortButton_1003);
		controlPanel_1003.add(resetButton_1003);

		outputArea_1003 = new JTextArea();
		outputArea_1003.setEditable(false);
		outputArea_1003.setFont(new Font("Monospaced", Font.PLAIN, 14));

		JScrollPane scrollPane_1003 = new JScrollPane(outputArea_1003);

		add(inputPanel_1003, BorderLayout.NORTH);
		add(scrollPane_1003, BorderLayout.CENTER);
		add(controlPanel_1003, BorderLayout.SOUTH);

		tambahButton_1003.addActionListener(e -> tambahData_1003());
		sortButton_1003.addActionListener(e -> mulaiSorting_1003());
		resetButton_1003.addActionListener(e -> reset_1003());
	}

	private void tambahData_1003() {
		String nama_1003 = namaField_1003.getText().trim();
		String nim_1003 = nimField_1003.getText().trim();
		String prodi_1003 = prodiField_1003.getText().trim();

		if (nama_1003.isEmpty() || nim_1003.isEmpty() || prodi_1003.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Semua data harus diisi!");
			return;
		}

		dataMahasiswa_1003.add(new Mahasiswa_1003(nama_1003, nim_1003, prodi_1003));

		namaField_1003.setText("");
		nimField_1003.setText("");
		prodiField_1003.setText("");

		outputArea_1003.setText("");
		tampilkanDataLengkap_1003("Data Mahasiswa:");
	}

	private void mulaiSorting_1003() {
		if (dataMahasiswa_1003.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Data masih kosong!");
			return;
		}

		outputArea_1003.append("\n");

		String pilihan_1003 = comboSort_1003.getSelectedItem().toString();

		if (pilihan_1003.equals("Insertion Sort")) {
			insertionSort_1003();
		} else if (pilihan_1003.equals("Selection Sort")) {
			selectionSort_1003();
		} else {
			bubbleSort_1003();
		}
	}

	private void insertionSort_1003() {
		outputArea_1003.append("=== INSERTION SORT ===\n");

		for (int i_1003 = 1; i_1003 < dataMahasiswa_1003.size(); i_1003++) {
			Mahasiswa_1003 key_1003 = dataMahasiswa_1003.get(i_1003);
			int j_1003 = i_1003 - 1;

			while (j_1003 >= 0 &&
					dataMahasiswa_1003.get(j_1003).getNama_1003()
							.compareToIgnoreCase(key_1003.getNama_1003()) > 0) {

				dataMahasiswa_1003.set(j_1003 + 1, dataMahasiswa_1003.get(j_1003));
				j_1003--;
			}

			dataMahasiswa_1003.set(j_1003 + 1, key_1003);

			outputArea_1003.append("Langkah " + i_1003 + " : "
					+ namaArray_1003() + "\n");
		}

		tampilkanNamaSaja_1003("\nHasil Akhir Insertion Sort:");
	}

	private void selectionSort_1003() {
		outputArea_1003.append("=== SELECTION SORT ===\n");

		for (int i_1003 = 0; i_1003 < dataMahasiswa_1003.size() - 1; i_1003++) {
			int minIndex_1003 = i_1003;

			for (int j_1003 = i_1003 + 1; j_1003 < dataMahasiswa_1003.size(); j_1003++) {
				if (dataMahasiswa_1003.get(j_1003).getNama_1003()
						.compareToIgnoreCase(dataMahasiswa_1003.get(minIndex_1003).getNama_1003()) < 0) {
					minIndex_1003 = j_1003;
				}
			}

			Mahasiswa_1003 temp_1003 = dataMahasiswa_1003.get(i_1003);
			dataMahasiswa_1003.set(i_1003, dataMahasiswa_1003.get(minIndex_1003));
			dataMahasiswa_1003.set(minIndex_1003, temp_1003);

			outputArea_1003.append("Pass " + (i_1003 + 1) + " : "
					+ namaArray_1003() + "\n");
		}

		tampilkanNamaSaja_1003("\nHasil Akhir Selection Sort:");
	}

	private void bubbleSort_1003() {
		outputArea_1003.append("=== BUBBLE SORT ===\n");

		for (int i_1003 = 0; i_1003 < dataMahasiswa_1003.size() - 1; i_1003++) {
			for (int j_1003 = 0; j_1003 < dataMahasiswa_1003.size() - i_1003 - 1; j_1003++) {
				if (dataMahasiswa_1003.get(j_1003).getNama_1003()
						.compareToIgnoreCase(dataMahasiswa_1003.get(j_1003 + 1).getNama_1003()) > 0) {

					Mahasiswa_1003 temp_1003 = dataMahasiswa_1003.get(j_1003);
					dataMahasiswa_1003.set(j_1003, dataMahasiswa_1003.get(j_1003 + 1));
					dataMahasiswa_1003.set(j_1003 + 1, temp_1003);
				}
			}

			outputArea_1003.append("Pass " + (i_1003 + 1) + " : "
					+ namaArray_1003() + "\n");
		}

		tampilkanNamaSaja_1003("\nHasil Akhir Bubble Sort:");
	}

	private void tampilkanDataLengkap_1003(String judul_1003) {
		outputArea_1003.append(judul_1003 + "\n");

		for (Mahasiswa_1003 m_1003 : dataMahasiswa_1003) {
			outputArea_1003.append(m_1003.toString() + "\n");
		}
	}

	private void tampilkanNamaSaja_1003(String judul_1003) {
		outputArea_1003.append(judul_1003 + "\n");
		outputArea_1003.append("[" + namaArray_1003() + "]\n");
	}
	private String namaArray_1003() {
		StringBuilder sb_1003 = new StringBuilder();

		for (int i_1003 = 0; i_1003 < dataMahasiswa_1003.size(); i_1003++) {
			sb_1003.append(dataMahasiswa_1003.get(i_1003).getNama_1003());

			if (i_1003 < dataMahasiswa_1003.size() - 1) {
				sb_1003.append(", ");
			}
		}

		return sb_1003.toString();
	}

	private void reset_1003() {
		namaField_1003.setText("");
		nimField_1003.setText("");
		prodiField_1003.setText("");
		outputArea_1003.setText("");
		dataMahasiswa_1003.clear();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Mahasiswa_2511531003 gui_1003 =
					new Mahasiswa_2511531003();
			gui_1003.setVisible(true);
		});
	}
}