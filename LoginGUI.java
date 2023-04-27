// LoginGUI.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Login");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;

            // User type selection
            gbc.gridx = 0;
            gbc.gridy = 0;
            panel.add(new JLabel("User Type:"), gbc);

            String[] userTypes = {"Admin", "Employee"};
            JComboBox<String> userTypeComboBox = new JComboBox<>(userTypes);
            gbc.gridx = 1;
            panel.add(userTypeComboBox, gbc);

            // Username input
            gbc.gridx = 0;
            gbc.gridy = 1;
            panel.add(new JLabel("Username:"), gbc);

            JTextField usernameField = new JTextField(20);
            gbc.gridx = 1;
            panel.add(usernameField, gbc);

            // Password input
            gbc.gridx = 0;
            gbc.gridy = 2;
            panel.add(new JLabel("Password:"), gbc);

            JPasswordField passwordField = new JPasswordField(20);
            gbc.gridx = 1;
            panel.add(passwordField, gbc);

            // Login button
            JButton loginButton = new JButton("Login");
            gbc.gridx = 1;
            gbc.gridy = 3;
            panel.add(loginButton, gbc);

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            // Add action listener for login button
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userType = (String) userTypeComboBox.getSelectedItem();
                    String username = usernameField.getText();
                    String password = new String(passwordField.getPassword());

                    // Implement your authentication logic here
                    // For now, we'll just open the respective GUI without validation
                    if (userType.equals("Admin")) {
                        AdminGUI.main(null);
                    } else if (userType.equals("Employee")) {
                        EmployeeGUI.main(null);
                    }

                    // Close the login window
                    frame.dispose();
                }
            });
        });
    }
}
