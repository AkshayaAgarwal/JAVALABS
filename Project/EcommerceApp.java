package Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EcommerceApp extends JFrame {

    private DefaultListModel<String> productList;
    private DefaultListModel<String> cartList;
    private JList<String> productListUI;
    private JList<String> cartListUI;
    private JLabel cartTotalLabel;
    private double cartTotal = 0.0;

    // Constructor
    public EcommerceApp() {
        super("StickersBaba");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create product panel
        JPanel productPanel = new JPanel(new BorderLayout());
        JLabel productLabel = new JLabel("Products");
        productLabel.setFont(new Font("Arial", Font.BOLD, 20));
        productPanel.add(productLabel, BorderLayout.NORTH);

        productList = new DefaultListModel<>();
        productList.addElement("Product 1 - $19.99");
        productList.addElement("Product 2 - $29.99");
        productList.addElement("Product 3 - $39.99");
        productList.addElement("Product 4 - $49.99");
        productList.addElement("Product 5 - $59.99");

        productListUI = new JList<>(productList);
        productListUI.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        productListUI.setVisibleRowCount(5);
        JScrollPane productScrollPane = new JScrollPane(productListUI);
        productPanel.add(productScrollPane, BorderLayout.CENTER);

        JButton addToCartButton = new JButton("Add to Cart");
        addToCartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = productListUI.getSelectedIndex();
                if (index != -1) {
                    String product = productList.getElementAt(index);
                    String[] productParts = product.split(" - ");
                    double productPrice = Double.parseDouble(productParts[1].substring(1));
                    cartList.addElement(product);
                    cartTotal += productPrice;
                    cartTotalLabel.setText("Total: $" + String.format("%.2f", cartTotal));
                }
            }
        });
        productPanel.add(addToCartButton, BorderLayout.SOUTH);

        // Create cart panel
        JPanel cartPanel = new JPanel(new BorderLayout());
        JLabel cartLabel = new JLabel("Shopping Cart");
        cartLabel.setFont(new Font("Arial", Font.BOLD, 20));
        cartPanel.add(cartLabel, BorderLayout.NORTH);

        cartList = new DefaultListModel<>();
        cartListUI = new JList<>(cartList);
        cartListUI.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cartListUI.setVisibleRowCount(5);
        JScrollPane cartScrollPane = new JScrollPane(cartListUI);
        cartPanel.add(cartScrollPane, BorderLayout.CENTER);

        cartTotalLabel = new JLabel("Total: $0.00");
        cartTotalLabel.setFont(new Font("Arial", Font.BOLD, 16));
        cartPanel.add(cartTotalLabel, BorderLayout.SOUTH);

        // Add panels to frame
        add(productPanel, BorderLayout.WEST);
        add(cartPanel, BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new EcommerceApp();
    }
}
