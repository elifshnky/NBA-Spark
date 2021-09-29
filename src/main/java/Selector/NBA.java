package Selector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NBA extends JFrame {
    private JPanel panel1;
    private JButton goButton;
    private JTextField TextField;
    private JLabel labeltotal;

    public NBA(){
        add(panel1);
        setSize(400,250);
        setTitle("Search Window");
        AppSelect back= new AppSelect();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sea;
                sea = TextField.getText();
                String total=back.backre(sea);
                labeltotal.setText(total);
            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
