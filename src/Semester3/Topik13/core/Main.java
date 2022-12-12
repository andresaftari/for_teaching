package Semester3.Topik13.core;

import Semester3.Topik13.ui.FoodApp;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FoodApp app = new FoodApp();

            JPanel rootPanel = app.getRootPanel();
            JFrame frame = new JFrame("Simple Food App");

            frame.setContentPane(rootPanel);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setSize(1200, 800);
            frame.pack();
            frame.setVisible(true);
        });
    }
}