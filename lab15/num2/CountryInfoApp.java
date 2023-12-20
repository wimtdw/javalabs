package lab15.num2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryInfoApp extends JFrame {
    private JComboBox<String> countryComboBox;
    private JTextArea infoTextArea;

    private String[] countries = {"Select a Country", "USA", "Canada", "France", "Germany", "Japan"};
    private String[] countryInfo = {
            "Please select a country for information.",
            "The United States of America (USA) is a country located in North America.",
            "Canada is a country located in North America.",
            "France is a country located in Western Europe.",
            "Germany is a country located in Central Europe.",
            "Japan is an island country located in East Asia."
    };

    public CountryInfoApp() {
        super("Country Information");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        countryComboBox = new JComboBox<>(countries);
        countryComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = countryComboBox.getSelectedIndex();
                if (selectedIndex >= 0) {
                    infoTextArea.setText(countryInfo[selectedIndex]);
                }
            }
        });

        infoTextArea = new JTextArea(6, 30);
        infoTextArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Select a Country: "));
        panel.add(countryComboBox);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(infoTextArea), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CountryInfoApp();
            }
        });
    }
}

