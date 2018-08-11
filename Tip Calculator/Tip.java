//Tip Calculator


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

public class Tip extends JFrame {
	private JTextField amountValue;
	private JTextField tipValue;
	private JTextField totalfinal;
	
	
	public Tip() {
		setTitle("Tip Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amount");
		lblNewLabel.setBounds(31, 30, 46, 14);
		getContentPane().add(lblNewLabel);
		
		amountValue = new JTextField();
		amountValue.setBounds(87, 27, 148, 20);
		getContentPane().add(amountValue);
		amountValue.setColumns(10);
		
		JLabel sliderValue = new JLabel(" ");
		sliderValue.setBounds(31, 55, 35, 26);
		getContentPane().add(sliderValue);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent e) {
				sliderValue.setText(slider.getValue()+ " ");
			}
		});
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setMaximum(30);
		slider.setBounds(87, 58, 148, 23);
		getContentPane().add(slider);
		
		JLabel tip = new JLabel("Tip");
		tip.setBounds(31, 96, 46, 14);
		getContentPane().add(tip);
		
		JLabel total = new JLabel("Total");
		total.setBounds(31, 138, 46, 14);
		getContentPane().add(total);
		
		tipValue = new JTextField();
		tipValue.setBounds(87, 93, 148, 20);
		getContentPane().add(tipValue);
		tipValue.setColumns(10);
		
		totalfinal = new JTextField();
		totalfinal.setBounds(87, 135, 148, 20);
		getContentPane().add(totalfinal);
		totalfinal.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				double tipAmount = Double.parseDouble(amountValue.getText());
				double amountvaluefinal = Double.parseDouble(amountValue.getText());
				double slider = Double.parseDouble(sliderValue.getText());
				double tipamountfinal = tipAmount * (slider/100);
				double totalbill = tipamountfinal + amountvaluefinal;
				
				tipValue.setText(String.valueOf(tipamountfinal));
				totalfinal.setText(String.valueOf(totalbill));
			}
		});
		btnNewButton.setBounds(113, 177, 89, 23);
		getContentPane().add(btnNewButton);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tip tips = new Tip();
		tips.setSize(new Dimension(300, 300));
		tips.setVisible(true);

	}
}
