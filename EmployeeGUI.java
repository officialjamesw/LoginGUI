// EmployeeGUI.java

import javax.swing.*;
import java.awt.*;

public class EmployeeGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Employee Panel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;

            // Add components for work progress and statistics
            gbc.gridx = 0;
            gbc.gridy = 0;
            panel.add(new JLabel("Assigned Work:"), gbc);

            gbc.gridx = 1;
            panel.add(new JButton("View Assigned Work"), gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            panel.add(new JLabel("Work Progress:"), gbc);

            gbc.gridx = 1;
            panel.add(new JButton("View Work Progress"), gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            panel.add(new JLabel("Completed Tasks:"), gbc);

            gbc.gridx = 1;
            panel.add(new JButton("View Completed Tasks"), gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            panel.add(new JLabel("Payment Status:"), gbc);

            gbc.gridx = 1;
            panel.add(new JButton("Check Payment Status"), gbc);

            gbc.gridx = 0;
            gbc.gridy = 4;
            panel.add(new JLabel("Time Spent on Projects:"), gbc);

            gbc.gridx = 1;
            panel.add(new JButton("View Time Spent"), gbc);

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
