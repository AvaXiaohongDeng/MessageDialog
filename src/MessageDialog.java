import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageDialog extends JFrame implements ActionListener {
    JPanel pnl = new JPanel();

    JButton btl1 = new JButton("Show Information Message");
    JButton btl2 = new JButton("Show Warning Message");
    JButton btl3 = new JButton("Show Error Message");

    public MessageDialog(){
        super("Swing Window");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);

        pnl.add(btl1);
        pnl.add(btl2);
        pnl.add(btl3);

        //make buttons generate their ActionEvent event
        btl1.addActionListener(this);
        btl2.addActionListener(this);
        btl3.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btl1){
            JOptionPane.showMessageDialog(this,"Information......","Message " +
                    "Dialog",JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource()==btl2){
            JOptionPane.showMessageDialog(this,"Warning......","Message " +
                    "Dialog",JOptionPane.WARNING_MESSAGE);
        }
        if(e.getSource()==btl3){
            JOptionPane.showMessageDialog(this,"Error......","Message " +
                    "Dialog",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        MessageDialog gui = new MessageDialog();
    }
}
