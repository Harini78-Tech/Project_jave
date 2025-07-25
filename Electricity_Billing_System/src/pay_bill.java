import java.awt.*;
import javax.swing.*;

public class pay_bill extends JFrame {
    pay_bill() {
        JLabel qrCodeLabel = new JLabel();
         try {
            ImageIcon qrCodeIcon = new ImageIcon(ClassLoader.getSystemResource("images/qr_code.png"));
            Image img = qrCodeIcon.getImage(); 
            Image newImg = img.getScaledInstance(921, 1000, Image.SCALE_SMOOTH); 
            qrCodeLabel.setIcon(new ImageIcon(newImg)); 
        } catch (Exception e) {
            qrCodeLabel.setText("QR Code not available.");
            e.printStackTrace(); 
        }
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        panel.add(qrCodeLabel); 
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(921, 1280)); 
        setSize(921, 1280);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new pay_bill().setVisible(true)); 
    }
}


