package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Formularz extends JFrame {
    private JPanel rootPanel;
    private JTextField imie;
    private JTextField nazwisko;
    private JComboBox wylotz;
    private JComboBox przylotdo;
    private JRadioButton vipTak;
    private JRadioButton vipNie;
    private JCheckBox przystawkaCheckBox;
    private JCheckBox obiadCheckBox;
    private JCheckBox desertCheckBox;
    private JTextArea uwagi;
    private JButton dodajRezerwacjeButton;
    private JTable tableRezerwacje;
    private JButton usuńReyerwacjęButton;
    private JButton zakończProgramButton;

    private ArrayList<Rezerwacja> listaRezerwacji = new ArrayList<>();

    public Formularz() {
        add(rootPanel);
        setTitle("Formularz rezerwacji biletów");
        pack();

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //------------------model Tab
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Imię");
        model.addColumn("Nazwisko");
        model.addColumn("Wylot z");
        model.addColumn("Prylot do");
        model.addColumn("VIP");
        model.addColumn("Posiłek");
        model.addColumn("Uwagi");

        vipNie.setSelected(true);

        tableRezerwacje.setModel(model);
        zakończProgramButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        dodajRezerwacjeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!imie.getText().equals("") && !nazwisko.getText().equals("")) {
                    ArrayList<String> posilek = new ArrayList<>();
                    if (przystawkaCheckBox.isSelected()) {
                        posilek.add("Przystawka");
                    }
                    if (obiadCheckBox.isSelected()) {
                        posilek.add("Obiad");
                    }
                    if (desertCheckBox.isSelected()) {
                        posilek.add("Desert");
                    }
                    if (wylotz.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Proszę wybrać wzlot z");
                        return;
                    }
                    if (przylotdo.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Proszę wybrać przylot do");
                        return;
                    }
                    if (posilek.size() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Zoznacz Posiłek");
                        return;
                    }
//------------------------------------------------------------------------->
                    Rezerwacja element = new Rezerwacja(imie.getText(),
                            nazwisko.getText(),
                            (String) wylotz.getSelectedItem(),
                            (String) przylotdo.getSelectedItem(),
                            vipTak.isSelected(),
                            posilek,
                            uwagi.getText()
                    );

                    listaRezerwacji.add(element);

                    //-------------------------------------------------------->
                    imie.setText("");
                    nazwisko.setText("");
                    wylotz.setSelectedIndex(0);
                    przylotdo.setSelectedIndex(0);
                    vipTak.setSelected(false);
                    vipNie.setSelected(true);
                    przystawkaCheckBox.setSelected(false);
                    obiadCheckBox.setSelected(false);
                    desertCheckBox.setSelected(false);
                    uwagi.setText("");

                    showReserv(model);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Podaj imię oraz nazwisko!");
                }
            }
        });


        usuńReyerwacjęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = tableRezerwacje.getSelectedRow();
                if (n != -1) {
                    listaRezerwacji.remove(n);
                    model.removeRow(n);
                }else {
                    JOptionPane.showMessageDialog(rootPane,"Wybierz rezervacje do usunięcia.");
                }
            }
        });
    }

    private void showReserv(DefaultTableModel model) {

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        for (Rezerwacja rez : listaRezerwacji) {
            for (String s : rez.posilek) {
                String posilek = "";
                posilek += s + " ";
            }
            model.addRow(new Object[]{rez.imie, rez.nazwisko, rez.wylot, rez.przylot, rez.vip, rez.posilek, rez.uwagi});
        }
    }
}
