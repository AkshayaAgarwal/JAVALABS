package cacproject;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;

public class CartList extends JPanel {
	public interface RefreshListener{
		void refresh();
	}

	/**
	 * Create the panel.
	 */
	public CartList(int mid,String mname,String size, int qty,double cost,RefreshListener rListener) {
		setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setHgap(25);
		
		JLabel lblNewLabel = new JLabel(String.valueOf(mid));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblNewLabel);
		
		JLabel lblMname = new JLabel(mname);
		lblMname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblMname);
		
		JLabel lblSize = new JLabel(size);
		lblSize.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblSize);
		
		JLabel lblQty = new JLabel(String.valueOf(qty));
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblQty);
		
		JLabel lblCost = new JLabel(String.format("₹%.2f", cost));
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblCost);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SQL sql = new SQL();
				try(Statement stmt = sql.getConnect().createStatement()){
					int result = JOptionPane.showConfirmDialog(CartList.this, "Are you sure?");
					if(result==JOptionPane.YES_OPTION) {
						int res = stmt.executeUpdate("delete from menu where mid="+mid);
						if(res>0) {
							JOptionPane.showMessageDialog(CartList.this, "Delete Successfull");
						}else {
							JOptionPane.showMessageDialog(CartList.this, "Item not Found");
						}
					}
					sql.closeConnection();
					rListener.refresh();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(CartList.this, "Some error happened");
					e1.printStackTrace();
				}
			}
			
		});

	}

}
