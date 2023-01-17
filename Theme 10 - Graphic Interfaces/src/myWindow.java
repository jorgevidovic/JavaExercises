import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class myWindow extends JFrame implements ActionListener {
	JButton btnEuros, btnDolares;
	JLabel lblEuros, lblDolares;
	JTextField txtEuros, txtDolares;

	public myWindow() {
		this.setTitle("My first window");

		Toolkit tl = Toolkit.getDefaultToolkit();
		Dimension sizeDimention = tl.getScreenSize();
		int width = sizeDimention.width;
		int height = sizeDimention.height;

		setSize(width / 2, height / 2);
		setLocation(width / 4, height / 4);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		inicializarComponentes();

		// getContentPane().add(lblEuros, BorderLayout.NORTH);
		// getContentPane().add(txtEuros, BorderLayout.CENTER);

		// add(btnEuros, BorderLayout.SOUTH);

		// setLayout(new FlowLayout());
		setLayout(null);
		lblEuros.setBounds(50, 20, 20, 30);
		lblDolares.setBounds(140, 20, 50, 30);
		txtEuros.setBounds(50, 55, 80, 20);
		btnEuros.setBounds(50, 90, 150, 30);
		txtDolares.setBounds(140, 55, 80, 20);

		getContentPane().add(lblEuros);
		getContentPane().add(lblDolares);
		getContentPane().add(txtEuros);
		getContentPane().add(btnEuros);
		getContentPane().add(txtDolares);

		btnEuros.addActionListener(this);

		this.setVisible(true);
	}

	private void inicializarComponentes() {
		lblEuros = new JLabel("Euros: ");
		lblDolares = new JLabel("Dolares: ");
		txtEuros = new JTextField(10);
		txtEuros.setText("Euros");
		txtDolares = new JTextField();
		// txtEuros.setToolTipText("Euros");
		btnEuros = new JButton("Pasar a dólares");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float euros = Float.parseFloat(txtEuros.getText());
		float dolares = euros * 0.92f;
		txtDolares.setText(Float.toString(dolares));

	}
}
