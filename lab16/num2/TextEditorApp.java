package lab16.num2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditorApp extends JFrame {
    private JTextArea textArea;
    private JMenu fontMenu;
    private JMenu colorMenu;

    public TextEditorApp() {
        setTitle("Текстовый редактор");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));

        createFontMenu();
        createColorMenu();

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fontMenu);
        menuBar.add(colorMenu);
        setJMenuBar(menuBar);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void createFontMenu() {
        fontMenu = new JMenu("Шрифт");

        String[] fontNames = {"Times New Roman", "MS Sans Serif", "Courier New"};
        for (String fontName : fontNames) {
            JMenuItem menuItem = new JMenuItem(fontName);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedFont = menuItem.getText();
                    textArea.setFont(new Font(selectedFont, Font.PLAIN, 16));
                }
            });
            fontMenu.add(menuItem);
        }
    }

    private void createColorMenu() {
        colorMenu = new JMenu("Цвет");

        String[] colors = {"Синий", "Красный", "Черный"};
        Color[] colorValues = {Color.BLUE, Color.RED, Color.BLACK};

        for (int i = 0; i < colors.length; i++) {
            JMenuItem menuItem = new JMenuItem(colors[i]);
            final Color selectedColor = colorValues[i];

            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setForeground(selectedColor);
                }
            });

            colorMenu.add(menuItem);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextEditorApp().setVisible(true);
            }
        });
    }
}

