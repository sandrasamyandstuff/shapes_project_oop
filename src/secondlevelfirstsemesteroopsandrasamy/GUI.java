package secondlevelfirstsemesteroopsandrasamy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 17));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 195, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of objects");
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 65, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 31, SpringLayout.EAST, lblNewLabel_1);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("create");
		btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 11));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 52, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 149, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(e -> {
		    try {
		        int num = Integer.parseInt(textField.getText());
		        Drawable[] shapes = new Drawable[num];
		        double sum = 0;

		        for (int i = 0; i < num; i++) {
		            String type = JOptionPane.showInputDialog(null, "Enter Type: Circle or Cube");
		            String len = JOptionPane.showInputDialog(null, "Enter Length:");
		            double length = Double.parseDouble(len);

		            switch (type.toLowerCase()) {
		                case "circle":
		                    shapes[i] = new Circle(length);
		                    sum += ((Circle) shapes[i]).getArea();
		                    break;
		                case "cube":
		                    shapes[i] = new Cube(length);
		                    sum += ((Cube) shapes[i]).getArea();
		                    break;
		                default:
		                    JOptionPane.showMessageDialog(null, "Invalid type! Please enter Circle or Cube.");
		                    i--; // Retry this iteration
		                    break;
		            }
		        }

		        JOptionPane.showMessageDialog(null, "Total area: " + sum);
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(null, "Please enter a valid number!");
		    } catch (Exception ex) {
		        JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
		    }
		});
	}
}
