// AdminGUI.java

import javax.swing.*;
import java.awt.*;

public class AdminGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Admin Panel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;

            // Add components for employee, client and assignment management
            gbc.gridx = 0;
            gbc.gridy = 0;
            panel.add(new JLabel("Employees:"), gbc);

            gbc.gridx = 1;
            panel.add(new JButton("Add Employee"), gbc);

            gbc.gridx = 2;
            panel.add(new JButton("Edit Employee"), gbc);

            gbc.gridx = 3;
            panel.add(new JButton("Remove Employee"), gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            panel.add(new JLabel("Clients:"), gbc);

            gbc.gridx = 1;
            panel.add(new JButton("Add Client"), gbc);

            gbc.gridx = 2;
            panel.add(new JButton("Edit Client"), gbc);

            gbc.gridx = 3;
            panel.add(new JButton("Remove Client"), gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            panel.add(new JLabel("Assign Work:"), gbc);

            gbc.gridx = 1;
            panel.add(new JButton("Assign Work to Employee"), gbc);

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
