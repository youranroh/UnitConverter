import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;
import javax.swing.*;

public class UnitConverter extends JFrame {
    private double input;
    private double output;
    protected JTextField textField;
    private JTextField outcome = new JTextField();
    private JPanel panelHeader = new JPanel(new FlowLayout());
    private JPanel panel1 = new JPanel(new FlowLayout());
    private JPanel panel2 = new JPanel(new FlowLayout());
    private JPanel panel3 = new JPanel(new GridLayout());
    private JLabel label;
    protected JButton convert = new JButton("Convert", null);
    protected JComboBox<String> typeOfUnit;// dropdown menu
    protected JComboBox<String> convertFrom;
    protected JComboBox<String> convertTo;

    // create constructor
    public UnitConverter() {
        /*----------basic frame setting--------------*/
        setTitle("Unit Converter");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        /*-------------------------------------------*/

        /*-----------------------------------------------------------------------*/
        // add panels and check their placements(*commented out);
        add(panelHeader);
        // panelHeader.setBorder(BorderFactory.createLineBorder(Color.black));
        add(panel1);
        // panel1.setBorder(BorderFactory.createLineBorder(Color.red));
        add(panel2);
        // panel2.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(panel3);
        // panel3.setBorder(BorderFactory.createLineBorder(Color.green));
        /*-----------------------------------------------------------------------*/

        /*-----------------------------------------------------------------------*/
        // create header
        Font headlineFont = new Font("Arial", Font.BOLD, 26);
        JLabel header = new JLabel("Unit Converter");
        header.setFont(headlineFont);
        panelHeader.add(header);
        /*-----------------------------------------------------------------------*/

        /*-----------------------------------------------------------------------*/
        // add labels
        addLabel(panel1, label, "Choose the base unit");
        // add a dropdown menu so that the user may choose.
        String[] units = { "", "length", "time", "temperature", "mass", "volume" };
        /*-----------------------------------------------------------------------*/

        /*-----------------------------------------------------------------------*/
        String[] empty = {};
        String[] tempArray = { "celcius", "farenheit", "Kelvin" };
        String[] lengthArray = { "meter", "centimeter", "millimeter", "kilometer", "inch", "feet", "yard", "mile" };
        String[] volumeArray = { "liter", "milliliter", "teaspoon", "tablespoon", "cup", "pint", "fluid ounce",
                "gallon", "quart" };
        String[] massArray = { "gram", "milligram", "kilogram", "pound", "ton" };
        String[] timeArray = { "second", "minute", "hour", "day", "week", "month", "year" };
        /*-----------------------------------------------------------------------*/

        // set the dropdown menu for the list of units
        typeOfUnit = new JComboBox<>(units);
        convertFrom = new JComboBox<>(empty);
        convertTo = new JComboBox<>(empty);
        textField = new JTextField(10);
        /*-----------------------------------------------------------------------*/

        // add an actionlistener for the dropdown$
        typeOfUnit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) typeOfUnit.getSelectedItem();
                switch (s) {
                    case "":
                        // reset both from, to comboboxes
                        convertFrom.setModel(new DefaultComboBoxModel(empty));
                        convertTo.setModel(new DefaultComboBoxModel(empty));
                        System.out.println("you chose null");
                        break;

                    case "length":
                        // if the user selects length: change the dropdown option to length
                        convertFrom.setModel(new DefaultComboBoxModel(lengthArray));
                        convertTo.setModel(new DefaultComboBoxModel(lengthArray));
                        System.out.println("you chose Length");
                        break;
                    case "time":
                        // if the user selects time: change the dropdown option to time
                        convertFrom.setModel(new DefaultComboBoxModel(timeArray));
                        convertTo.setModel(new DefaultComboBoxModel(timeArray));
                        System.out.println("you chose time");
                        break;
                    case "temperature":
                        // if the user selects temp: change the dropdown option to temp
                        convertFrom.setModel(new DefaultComboBoxModel(tempArray));
                        convertTo.setModel(new DefaultComboBoxModel(tempArray));
                        System.out.println("you chose temperature");
                        break;
                    case "mass":
                        // if the user selects mass: change the dropdown option to mass
                        convertFrom.setModel(new DefaultComboBoxModel(massArray));
                        convertTo.setModel(new DefaultComboBoxModel(massArray));
                        System.out.println("you chose mass");
                        break;
                    case "volume":
                        // if the user selects volume: change the dropdown option to volume
                        convertFrom.setModel(new DefaultComboBoxModel(volumeArray));
                        convertTo.setModel(new DefaultComboBoxModel(volumeArray));
                        System.out.println("you chose volume");
                        break;
                }
            }
        });
        /*-----------------------------------------------------------------------*/
        panel1.add(typeOfUnit); // set in inside the Jframe
        addLabel(panel2, label, "Convert");
        panel2.add(textField);
        panel2.add(convertFrom);
        addLabel(panel2, label, "to");
        panel2.add(convertTo);

        /*-----------------------------------------------------------------------*/

        /*-----------------------------------------------------------------------*/
        // create convert button. get actionlistener.
        convert.setForeground(Color.RED);
        panel2.add(convert);

        // create textfield at the bottom to print outcome.
        outcome.setEditable(false);
        panel3.add(outcome);
        outcome.setHorizontalAlignment(JTextField.CENTER);
        outcome.setFont(headlineFont);

        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get input from the textfield.
                String s = textField.getText();
                input = Double.parseDouble(s);
                // System.out.println(input);

                // make cases.
                String unit = (String) typeOfUnit.getSelectedItem();
                String from = (String) convertFrom.getSelectedItem();
                String to = (String) convertTo.getSelectedItem();

                // call conversions class object.
                Conversions c = new Conversions();
                DecimalFormat pattern = new DecimalFormat("0.######");

                switch (unit) {
                    case "length":
                        output = c.lengthConverter(input, from, to);
                        System.out.println(pattern.format(output));

                        outcome.setText(String.valueOf(pattern.format(output)));
                        break;

                    // time
                    case "time":
                        output = c.timeConverter(input, from, to);
                        System.out.println(pattern.format(output));

                        outcome.setText(String.valueOf(pattern.format(output)));
                        break;

                    case "temperature":
                        output = c.tempConverter(input, from, to);
                        System.out.println(pattern.format(output));

                        outcome.setText(String.valueOf(pattern.format(output)));
                        break;

                    case "mass":
                        output = c.massConverter(input, from, to);
                        System.out.println(pattern.format(output));

                        outcome.setText(String.valueOf(pattern.format(output)));
                        break;

                    case "volume":
                        output = c.volumeConverter(input, from, to);
                        System.out.println(pattern.format(output));

                        outcome.setText(String.valueOf(pattern.format(output)));
                        break;

                }
            }
        });
        /*-----------------------------------------------------------------------*/
    }

    public void addLabel(JPanel p, JLabel l, String s) {
        l = new JLabel(s);
        p.add(l);
        l.setHorizontalAlignment(JLabel.CENTER);
    }// method that adds JLabel
}