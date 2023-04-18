package cacproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cacproject.CartList.RefreshListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

public class Cart extends JDialog implements RefreshListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart frame = new Cart();
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
	public Cart() {
		setModal(true);
		setBounds(100, 100, 1000, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(134, 0, 0));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBounds(0, 0, 987, 139);
		jPanel1.setBackground(new Color(153, 0, 0));
		contentPane.add(jPanel1);
		jPanel1.setLayout(null);
//		jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 376, 134);
		jPanel1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\logo.png"));
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("Kill Your Hunger");
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setForeground(new Color(255, 204, 204));
		jLabel1.setFont(new Font("Pristina", Font.BOLD, 26));
		jLabel1.setBounds(404, 10, 165, 32);
		jPanel1.add(jLabel1);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("Spread the love from its sweetness and aroma");
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setForeground(new Color(255, 204, 204));
		jLabel2.setFont(new Font("Segoe Print", Font.BOLD, 23));
		jLabel2.setBounds(438, 93, 546, 41);
		jPanel1.add(jLabel2);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setText("Now Open");
		jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel5.setForeground(Color.WHITE);
		jLabel5.setFont(new Font("Gabriola", Font.BOLD, 24));
		jLabel5.setBackground(new Color(153, 51, 0));
		jLabel5.setBounds(894, 13, 83, 42);
		jPanel1.add(jLabel5);
		
		
		addProducts();
	
		}
	private double total = 0;
	private void addProducts() {
		if(contentPane.getComponentCount()>1)
		contentPane.remove(1);
		total =0;
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 0, 0));
		panel.setBounds(0, 141, 987, 375);
		panel.setLayout(new BorderLayout(0, 0));
		SQL sql = new SQL();
		JPanel products = new JPanel();
		products.setBackground(new Color(204, 0, 0));
		products.setLayout(new GridLayout(0,1));
		try(Statement stmt = sql.getConnect().createStatement()){
			ResultSet rs = stmt.executeQuery("select * from menu");
			while(rs.next()) {
				products.add(new CartList(rs.getInt("mid"),rs.getString("mname"),rs.getString("size"),rs.getInt("quantity"),rs.getDouble("cost"),this));
				total += rs.getDouble("cost");
			}
			sql.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JScrollPane scrollPane = new JScrollPane(products);
		scrollPane.setBackground(new Color(204, 0, 0));
		panel.add(scrollPane);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel(String.format("Total: ₹%.2f", total));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(303, 540, 346, 33);
		contentPane.add(lblNewLabel_1);
		revalidate();
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		addProducts();
	}
}
