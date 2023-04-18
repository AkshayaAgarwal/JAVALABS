package cacproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.EventQueue;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
public class Menu extends JFrame {

	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frm = new Menu();
					frm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
    public Menu() {
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(450, 190, 1219, 705);
         setResizable(true);
		getContentPane().setBackground(new Color(250, 170, 5));
//	       setSize(1920,1080);

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBounds(0, 0, 1006, 79);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(553, 49, 516, 26);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(340, 10, 251, 29);
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(10, 89, 529, 424);

        setTitle("Burger Shot..!!");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("BurgerShotFrame");
        setPreferredSize(new java.awt.Dimension(1020, 560));
        

        jPanel1.setBackground(new Color(85, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Spread the love from its sweetness and aroma");

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kill Your Hunger");
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(889, 11, 85, 42);
        
                jLabel5.setBackground(new java.awt.Color(153, 51, 0));
                jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel5.setText("Now Open");

        jPanel2.setBackground(new Color(45, 27, 8));
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(274, 393, 125, 21);
        
                jButton1.setText("Silence Shot");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
        jButton8 = new javax.swing.JButton();
        jButton8.setBounds(274, 118, 125, 21);
        
                jButton8.setText("Sei The Smoke");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton8ActionPerformed(evt);
                    }
                });
        jButton9 = new javax.swing.JButton();
        jButton9.setBounds(406, 118, 111, 21);
        
                jButton9.setText("Volcano");
                jButton9.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton9ActionPerformed(evt);
                    }
                });
        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(10, 393, 126, 21);
        
                jButton2.setText("Decaf");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });
        jButton10 = new javax.swing.JButton();
        jButton10.setBounds(10, 118, 130, 21);
        
                jButton10.setText("Double Shot");
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton10ActionPerformed(evt);
                    }
                });
        jButton5 = new javax.swing.JButton();
        jButton5.setBounds(140, 256, 115, 21);
        
                jButton5.setText("Espresso Romano");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton5ActionPerformed(evt);
                    }
                });
        jButton6 = new javax.swing.JButton();
        jButton6.setBounds(405, 257, 112, 21);
        
                jButton6.setText("Triple Alert");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton6ActionPerformed(evt);
                    }
                });
        jButton3 = new javax.swing.JButton();
        jButton3.setBounds(267, 257, 132, 21);
        
                jButton3.setText("The GodFather");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                    }
                });
        jButton11 = new javax.swing.JButton();
        jButton11.setBounds(146, 118, 115, 21);
        
                jButton11.setText("Kill Or DIe Dulexe");
                jButton11.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton11ActionPerformed(evt);
                    }
                });
        jButton12 = new javax.swing.JButton();
        jButton12.setBounds(405, 393, 112, 21);
        
                jButton12.setText("Death by Meat");
                jButton12.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton12ActionPerformed(evt);
                    }
                });
        jButton13 = new javax.swing.JButton();
        jButton13.setBounds(142, 393, 126, 21);
        
                jButton13.setText("Lamp Baba");
                jButton13.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton13ActionPerformed(evt);
                    }
                });
        jButton7 = new javax.swing.JButton();
        jButton7.setBounds(10, 257, 126, 21);
        
                jButton7.setText("Greek Frapped");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton7ActionPerformed(evt);
                    }
                });
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(10, 19, 0, 89);
        
                //jLabel4.setIcon(new ImageIcon(Menu.class.getResource("/EmbuscadoCoffee/Iced-coffee.jpg")));
        
        jLabel4_1 = new JLabel();
        jLabel4_1.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\9.png"));
        jLabel4_1.setBounds(10, 298, 105, 89);
        
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(20, 8, 100, 100);
        lblNewLabel.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\1.png"));
        
        lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(155, 8, 100, 100);
        lblNewLabel_1.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\2.png"));
        
        lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBounds(284, 8, 100, 100);
        lblNewLabel_2.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\3.png"));
        
        lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setBounds(417, 8, 100, 100);
        lblNewLabel_3.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\4.png"));
        
        jPanel4_3 = new JPanel();
        jPanel4_3.setBounds(751, 280, 245, 157);
        jPanel4_3.setBackground(new Color(100, 1, 0));
        jLabel16 = new javax.swing.JLabel();
        jLabel16.setForeground(new Color(255, 255, 255));
        
                jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel16.setText("Amt to Pay");
                jTextField8 = new javax.swing.JTextField();
                jTextField8.setEditable(false);
                        jTextField10 = new javax.swing.JTextField();
                        jTextField10.setEditable(false);
                        jLabel18 = new javax.swing.JLabel();
                        jLabel18.setForeground(new Color(255, 255, 255));
                        
                                jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                jLabel18.setText("Net Sum");
                                jLabel17 = new javax.swing.JLabel();
                                jLabel17.setForeground(new Color(255, 255, 255));
                                
                                        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                        jLabel17.setText("GST");
                                        jTextField9 = new javax.swing.JTextField();
                                        jTextField9.setEditable(false);
                                                        jLabel13 = new javax.swing.JLabel();
                                                        jLabel13.setForeground(new Color(255, 255, 255));
                                                        
                                                                jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                                                jLabel13.setText("Discount");
                                                        jTextField5 = new javax.swing.JTextField();
                                                        jTextField5.setEditable(false);
                                                        GroupLayout gl_jPanel4_3 = new GroupLayout(jPanel4_3);
                                                        gl_jPanel4_3.setHorizontalGroup(
                                                        	gl_jPanel4_3.createParallelGroup(Alignment.LEADING)
                                                        		.addGroup(gl_jPanel4_3.createSequentialGroup()
                                                        			.addContainerGap()
                                                        			.addGroup(gl_jPanel4_3.createParallelGroup(Alignment.LEADING)
                                                        				.addComponent(jLabel18)
                                                        				.addComponent(jLabel13)
                                                        				.addComponent(jLabel16)
                                                        				.addComponent(jLabel17))
                                                        			.addPreferredGap(ComponentPlacement.RELATED)
                                                        			.addGroup(gl_jPanel4_3.createParallelGroup(Alignment.LEADING)
                                                        				.addComponent(jTextField9, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                        				.addComponent(jTextField8, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                        				.addComponent(jTextField5, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                        				.addComponent(jTextField10, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                                        			.addContainerGap())
                                                        );
                                                        gl_jPanel4_3.setVerticalGroup(
                                                        	gl_jPanel4_3.createParallelGroup(Alignment.TRAILING)
                                                        		.addGroup(gl_jPanel4_3.createSequentialGroup()
                                                        			.addContainerGap()
                                                        			.addGroup(gl_jPanel4_3.createParallelGroup(Alignment.LEADING)
                                                        				.addComponent(jLabel17)
                                                        				.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        			.addPreferredGap(ComponentPlacement.RELATED)
                                                        			.addGroup(gl_jPanel4_3.createParallelGroup(Alignment.BASELINE)
                                                        				.addComponent(jLabel18)
                                                        				.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                        			.addGroup(gl_jPanel4_3.createParallelGroup(Alignment.LEADING)
                                                        				.addComponent(jLabel13)
                                                        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        			.addGap(24)
                                                        			.addGroup(gl_jPanel4_3.createParallelGroup(Alignment.LEADING)
                                                        				.addComponent(jLabel16)
                                                        				.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        			.addGap(32))
                                                        );
                                                        jPanel4_3.setLayout(gl_jPanel4_3);
        
        jPanel4_1 = new JPanel();
        jPanel4_1.setBounds(549, 200, 192, 237);
        jPanel4_1.setBackground(new Color(100, 1, 0));
        
        jLabel7_1 = new JLabel();
        jLabel7_1.setBounds(24, 0, 136, 42);
        jLabel7_1.setText("Your Preference");
        jLabel7_1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7_1.setForeground(Color.WHITE);
        jLabel7_1.setFont(new Font("Gabriola", Font.BOLD, 24));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setBounds(10, 37, 55, 22);
        
                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel3.setText("Small");
                jButton14 = new javax.swing.JButton();
                jButton14.setBounds(101, 41, 81, 21);
                
                        jButton14.setText("SELECT");
                        jButton14.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton14ActionPerformed(evt);
                            }
                        });
                        jTextField1 = new javax.swing.JTextField();
                        jTextField1.setEditable(false);
                        jTextField1.setBounds(4, 69, 178, 19);
                        jLabel9 = new javax.swing.JLabel();
                        jLabel9.setForeground(new Color(255, 255, 255));
                        jLabel9.setBounds(10, 110, 74, 22);
                        
                                jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                jLabel9.setText("Medium");
                                jTextField2 = new javax.swing.JTextField();
                                jTextField2.setEditable(false);
                                jTextField2.setBounds(4, 136, 178, 19);
                                jButton15 = new javax.swing.JButton();
                                jButton15.setBounds(107, 111, 75, 21);
                                
                                        jButton15.setText("SELECT");
                                        jButton15.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                jButton15ActionPerformed(evt);
                                            }
                                        });
                                        jLabel10 = new javax.swing.JLabel();
                                        jLabel10.setForeground(new Color(255, 255, 255));
                                        jLabel10.setBackground(new Color(255, 255, 255));
                                        jLabel10.setBounds(10, 179, 52, 22);
                                        
                                                jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                                jLabel10.setText("Large");
                                                jTextField3 = new javax.swing.JTextField();
                                                jTextField3.setEditable(false);
                                                jTextField3.setBounds(4, 208, 178, 19);
                                                jButton16 = new javax.swing.JButton();
                                                jButton16.setBounds(101, 183, 81, 21);
                                                
                                                        jButton16.setText("SELECT");
                                                        jButton16.addActionListener(new java.awt.event.ActionListener() {
                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                jButton16ActionPerformed(evt);
                                                            }
                                                        });
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setBounds(549, 89, 447, 105);
        jLabel7 = new javax.swing.JLabel();
        
                jPanel4.setBackground(new Color(100, 1, 0));
                //BufferedImage img = Image.IO.read(new File("D:/Drive/OneDrive/College/saveFiles/java/Eclipse/CAC/EmbuscadoCoffee/coffeeBackground.jpg"));
                
                
                        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
                        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel7.setHorizontalAlignment(SwingConstants.LEFT);
                        jLabel7.setText("Description");
                        jScrollPane2 = new javax.swing.JScrollPane();
                        jTextArea1 = new javax.swing.JTextArea();
                        
                                jTextArea1.setColumns(20);
                                jTextArea1.setEditable(false);
                                jTextArea1.setLineWrap(true);
                                jTextArea1.setRows(5);
                                jScrollPane2.setViewportView(jTextArea1);
                                jTextField4 = new javax.swing.JTextField();
                                jTextField4.setEditable(false);
                                jLabel11 = new javax.swing.JLabel();
                                jLabel11.setForeground(new Color(255, 255, 255));
                                
                                        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                        jLabel11.setText("Your Order");
                                        
                                                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                                                
                                                jPanel4Layout.setHorizontalGroup(
                                                	jPanel4Layout.createParallelGroup(Alignment.TRAILING)
                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                			.addContainerGap()
                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                				.addComponent(jLabel11)
                                                				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                                                			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING, false)
                                                				.addComponent(jScrollPane2)
                                                				.addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                                                			.addContainerGap(21, Short.MAX_VALUE))
                                                );
                                                jPanel4Layout.setVerticalGroup(
                                                	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                			.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING)
                                                				.addGroup(jPanel4Layout.createSequentialGroup()
                                                					.addContainerGap(13, Short.MAX_VALUE)
                                                					.addComponent(jLabel11)
                                                					.addGap(15)
                                                					.addComponent(jLabel7))
                                                				.addGroup(Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                					.addContainerGap()
                                                					.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
                                                			.addContainerGap(13, Short.MAX_VALUE))
                                                );
                                                jPanel4.setLayout(jPanel4Layout);
        
        jPanel4_2 = new JPanel();
        jPanel4_2.setBounds(751, 196, 245, 74);
        jPanel4_2.setBackground(new Color(100, 1, 0));
                jLabel12 = new javax.swing.JLabel();
                jLabel12.setForeground(new Color(255, 255, 255));
                jLabel12.setBackground(new Color(255, 255, 255));
                
                        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jLabel12.setText("Quantity");
                        jTextField6 = new javax.swing.JTextField();
                        jTextField6.setText("1");
               
                        jLabel15 = new javax.swing.JLabel();
                        jLabel15.setForeground(new Color(255, 255, 255));
                        
                                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                jLabel15.setText("Cost");
                        jTextField7 = new javax.swing.JTextField();
                        jTextField7.setEditable(false);
                        GroupLayout gl_jPanel4_2 = new GroupLayout(jPanel4_2);
                        gl_jPanel4_2.setHorizontalGroup(
                        	gl_jPanel4_2.createParallelGroup(Alignment.TRAILING)
                        		.addGroup(gl_jPanel4_2.createSequentialGroup()
                        			.addContainerGap()
                        			.addGroup(gl_jPanel4_2.createParallelGroup(Alignment.LEADING)
                        				.addGroup(gl_jPanel4_2.createSequentialGroup()
                        					.addComponent(jLabel12)
                        					.addGap(15)
                        					.addComponent(jTextField6, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        				.addGroup(gl_jPanel4_2.createSequentialGroup()
                        					.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        					.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
                        			.addContainerGap())
                        );
                        gl_jPanel4_2.setVerticalGroup(
                        	gl_jPanel4_2.createParallelGroup(Alignment.LEADING)
                        		.addGroup(gl_jPanel4_2.createSequentialGroup()
                        			.addContainerGap()
                        			.addGroup(gl_jPanel4_2.createParallelGroup(Alignment.LEADING)
                        				.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        				.addComponent(jLabel12))
                        			.addPreferredGap(ComponentPlacement.RELATED)
                        			.addGroup(gl_jPanel4_2.createParallelGroup(Alignment.LEADING)
                        				.addComponent(jLabel15)
                        				.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        			.addContainerGap(14, Short.MAX_VALUE))
                        );
                        jPanel4_2.setLayout(gl_jPanel4_2);
        jButton17 = new javax.swing.JButton();
        jButton17.setBounds(549, 447, 135, 21);
        
                jButton17.setText("Get Amount");
                jButton17.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton17ActionPerformed(evt);
                    }
                });
        jButton18 = new javax.swing.JButton();
        jButton18.setBounds(549, 478, 135, 21);
        
                jButton18.setText("Add To Cart");
                jButton18.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton18ActionPerformed(evt);
                    }
                });
        
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(694, 447, 272, 54);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel4_1.setLayout(null);
        jPanel4_1.add(jLabel3);
        jPanel4_1.add(jButton14);
        jPanel4_1.add(jTextField2);
        jPanel4_1.add(jLabel10);
        jPanel4_1.add(jButton16);
        jPanel4_1.add(jTextField3);
        jPanel4_1.add(jTextField1);
        jPanel4_1.add(jLabel9);
        jPanel4_1.add(jButton15);
        jPanel4_1.add(jLabel7_1);
        jPanel2.setLayout(null);
        jPanel2.add(jButton2);
        jPanel2.add(jButton13);
        jPanel2.add(jButton1);
        jPanel2.add(jButton12);
        jPanel2.add(jLabel4_1);
        jPanel2.add(jButton7);
        jPanel2.add(jButton5);
        jPanel2.add(jButton3);
        jPanel2.add(jButton6);
        jPanel2.add(jButton10);
        jPanel2.add(jLabel4);
        jPanel2.add(lblNewLabel);
        jPanel2.add(lblNewLabel_1);
        jPanel2.add(lblNewLabel_2);
        jPanel2.add(lblNewLabel_3);
        jPanel2.add(jButton11);
        jPanel2.add(jButton8);
        jPanel2.add(jButton9);
        
        lblNewLabel_5 = new JLabel("New label");
        lblNewLabel_5.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\5.png"));
        lblNewLabel_5.setBounds(20, 149, 100, 100);
        jPanel2.add(lblNewLabel_5);
        
        lblNewLabel_6 = new JLabel("New label");
        lblNewLabel_6.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\7.png"));
        lblNewLabel_6.setBounds(155, 149, 100, 100);
        jPanel2.add(lblNewLabel_6);
        
        lblNewLabel_7 = new JLabel("New label");
        lblNewLabel_7.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\8.png"));
        lblNewLabel_7.setBounds(284, 147, 100, 100);
        jPanel2.add(lblNewLabel_7);
        
        lblNewLabel_8 = new JLabel("New label");
        lblNewLabel_8.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\2(2).png"));
        lblNewLabel_8.setBounds(417, 149, 100, 100);
        jPanel2.add(lblNewLabel_8);
        
        lblNewLabel_9 = new JLabel("New label");
        lblNewLabel_9.setIcon(new ImageIcon("D:\\Drive\\OneDrive\\College\\saveFiles\\java\\Eclipse\\CAC\\EmbuscadoCoffee\\2.png"));
        lblNewLabel_9.setBounds(20, 283, 100, 100);
        jPanel2.add(lblNewLabel_9);
        
        lblNewLabel_10 = new JLabel("New label");
        lblNewLabel_10.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\10.png"));
        lblNewLabel_10.setBounds(155, 283, 100, 100);
        jPanel2.add(lblNewLabel_10);
        
        lblNewLabel_11 = new JLabel("New label");
        lblNewLabel_11.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\4.png"));
        lblNewLabel_11.setBounds(284, 283, 100, 100);
        jPanel2.add(lblNewLabel_11);
        
        lblNewLabel_12 = new JLabel("New label");
        lblNewLabel_12.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\10.png"));
        lblNewLabel_12.setBounds(417, 287, 100, 100);
        jPanel2.add(lblNewLabel_12);
        
        JLabel lblNewLabel_14 = new JLabel("");
        lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_14.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\bg.jpg"));
        lblNewLabel_14.setBounds(0, 0, 529, 424);
        jPanel2.add(lblNewLabel_14);
        getContentPane().setLayout(null);
        jPanel1.setLayout(null);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel1);
        
        lblNewLabel_13 = new JLabel("");
        lblNewLabel_13.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\logo.png"));
        lblNewLabel_13.setBounds(0, 0, 443, 80);
        jPanel1.add(lblNewLabel_13);
        getContentPane().add(jPanel1);
        
        JButton btnNewButton = new JButton("Log Out");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    UserLogin obj = new UserLogin();
                    obj.setTitle("Student-Login");
                    obj.setVisible(true);
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.setBounds(641, 14, 85, 21);
        jPanel1.add(btnNewButton);
        
        btnNewButton_1 = new JButton("Cart");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_1.setBounds(736, 14, 85, 21);
        btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Cart cart = new Cart();
				cart.setVisible(true);
			}
        	
        });
        jPanel1.add(btnNewButton_1);
        getContentPane().add(jPanel2);
        getContentPane().add(jPanel4);
        getContentPane().add(jPanel4_1);
        getContentPane().add(jPanel4_3);
        getContentPane().add(jPanel4_2);
        getContentPane().add(jButton17);
        getContentPane().add(jButton18);
        getContentPane().add(textField);
        
        lblNewLabel_4 = new JLabel("New label");
        lblNewLabel_4.setIcon(new ImageIcon("D:\\AllYash\\Programming\\JAVA\\JavaChrist\\BurgerMenu\\seamless_trendy_pattern_background.jpg"));
        lblNewLabel_4.setBounds(-21, 0, 1330, 706);
        getContentPane().add(lblNewLabel_4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.jTextField4.setText("Volcano");
        jTextField1.setText("65");
        jTextField2.setText("75");
        jTextField3.setText("90");
        jTextArea1.setText("Foam-covered molten cheeze made from 100% organic meat instant Calories.");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        this.jTextField4.setText("Silent Shot");
        this.jTextField1.setText("120");
        this.jTextField2.setText("145");
        this.jTextField3.setText("178");
        this.jTextArea1.setText("Silent but deadly.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jTextField4.setText("Decaf");
        this.jTextField1.setText("88");
        this.jTextField2.setText("120");
        this.jTextField3.setText("N/A");
        this.jTextArea1.setText("Beverage made with decaffeinated Meat. DeTox from less calories");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.jTextField4.setText("The Godfather");
        this.jTextField1.setText("90");
        this.jTextField2.setText("100");
        this.jTextField3.setText("120");
        this.jTextArea1.setText("Father of all Burgers however, instead of his voice  you'll get the burp!!.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.jTextField4.setText("Espresso Romano");
        this.jTextField1.setText("188");
        this.jTextField2.setText("224");
        this.jTextField3.setText("244");
        this.jTextArea1.setText("Just like your everyday coffee expresso with a ring of Onions");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.jTextField1.setText("N/A");
        this.jTextField2.setText("122");
        this.jTextField3.setText("144");
        this.jTextField4.setText("Triple Alert");
        this.jTextArea1.setText("Mutton,Chicken and pork all in one.");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.jTextField1.setText("N/A");
        this.jTextField2.setText("179");
        this.jTextField3.setText("196");
        this.jTextField4.setText("Sei The Smoke");
        this.jTextArea1.setText("One or two shots of hot beef, poured over slices of cheese it can also be served with jalapeno, sometimes with a touch of tomato.");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.jTextField1.setText("N/A");
        this.jTextField2.setText("190");
        this.jTextField3.setText("220");
        this.jTextField4.setText("Greek Frapped");
        this.jTextArea1.setText("Double Max Pro Fat meat added to  to Extra cheese. ratio 1:1");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.jTextField4.setText("Double Shot");
        this.jTextField1.setText("123");
        this.jTextField2.setText("135");
        this.jTextField3.setText("142");
        this.jTextArea1.setText("Dripped meat with a\ntriple shot of cheese.");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        this.jTextField4.setText("Kill Or DIe Dulexe");
        this.jTextField1.setText("126");
        this.jTextField2.setText("145");
        this.jTextField3.setText("N/A");
        this.jTextArea1.setText("A regular mocha with Mutton.");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        //154,166,179
        this.jTextField4.setText("Death by Meat");
        this.jTextField1.setText("154");
        this.jTextField2.setText("166");
        this.jTextField3.setText("179");
        this.jTextArea1.setText("If thats your death wish!");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.jTextField4.setText("Lamp Baba");
        this.jTextField1.setText("97");
        this.jTextField2.setText("127");
        this.jTextField3.setText("143");
        this.jTextArea1.setText("Made of a mixture of\nItalian pizza and Amarican-style\nmeat.");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int smallC,totalEmbuscado,Quant;
        this.jTextField5.setText(String.valueOf(5));
        try{
            smallC=Integer.parseInt(this.jTextField1.getText());
        }
        catch(Exception Embuscdo){
            JOptionPane.showMessageDialog(this,"Price is not ATTENDING","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //inputVal=Integer.parseInt(this.jTextField5.getText());
        Quant=Integer.parseInt(this.jTextField6.getText());
        totalEmbuscado=smallC*Quant;
        String Tot1=String.valueOf(totalEmbuscado);
        this.jTextField7.setText(Tot1);
        sizeSelected = "small";
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
        	SQL sql = new SQL();
        	Statement stmt = sql.getConnect().createStatement();
        	StringBuilder query = new StringBuilder("insert into menu values(null,");
        	query.append("'").append(jTextField4.getText()).append("',");
        	query.append(jTextField6.getText()).append(",");
        	query.append(jTextField8.getText()).append(",");
        	query.append("'").append(sizeSelected).append("')");
        	
        	int res = stmt.executeUpdate(query.toString());
        	
        	if(res>0) {
        		this.textField.setText("Item has been added to cart");
        	}else {
        		this.textField.setText("Some error happened");
        	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int medC,totalEmbuscado2,Quant2;
        this.jTextField5.setText(String.valueOf(10));
        try{
            medC=Integer.parseInt(this.jTextField2.getText());
        }
        catch(Exception Embuscdo2){
            JOptionPane.showMessageDialog(this,"Price is not ATTENDING","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //inputVal2=Integer.parseInt(this.jTextField5.getText());
        Quant2=Integer.parseInt(this.jTextField6.getText());
        totalEmbuscado2=medC*Quant2;
        String Tot1=String.valueOf(totalEmbuscado2);
        this.jTextField7.setText(Tot1);
        sizeSelected = "medium";
        
    }//GEN-LAST:event_jButton15ActionPerformed
    private String sizeSelected;
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int larC,totalEmbuscado3,Quant3;
        this.jTextField5.setText(String.valueOf(15));
        try{
            larC=Integer.parseInt(this.jTextField3.getText());
        }
        catch(Exception Embuscdo3){
            JOptionPane.showMessageDialog(this,"Price is not ATTENDING","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //inputVal3=Integer.parseInt(this.jTextField5.getText());
        Quant3=Integer.parseInt(this.jTextField6.getText());
        totalEmbuscado3=larC*Quant3;
        String Tot4=String.valueOf(totalEmbuscado3);
        this.jTextField7.setText(Tot4);
        sizeSelected = "large";
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        double TotMA,Gross,VAT;
        TotMA=Double.parseDouble(this.jTextField7.getText());
        VAT=TotMA*.12;
        Gross=VAT+TotMA;
        double VATZ=Math.round(VAT);
        double GROZZ=Math.round(Gross);
        String VATs=String.valueOf(VATZ);
        String GROSS=String.valueOf(GROZZ);
        this.jTextField9.setText(VATs);
        this.jTextField10.setText(GROSS);
        double netsum,discount,payable;
        netsum=Double.parseDouble(this.jTextField10.getText());
        discount=Double.parseDouble(this.jTextField5.getText());
        payable = netsum - discount;
        this.jTextField8.setText(String.valueOf(payable));
    }//GEN-LAST:event_jButton17ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private JPanel jPanel4_1;
    private JLabel jLabel7_1;
    private JPanel jPanel4_2;
    private JPanel jPanel4_3;
    private JLabel jLabel4_1;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_8;
    private JLabel lblNewLabel_9;
    private JLabel lblNewLabel_10;
    private JLabel lblNewLabel_11;
    private JLabel lblNewLabel_12;
    private JLabel lblNewLabel_13;
    private JTextField textField;
    private JLabel lblNewLabel_4;
    private JButton btnNewButton_1;
}

