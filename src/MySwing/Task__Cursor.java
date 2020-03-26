package MySwing;

import javax.swing.*;
import java.awt.*;

public class Task__Cursor {
    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Wait is the button do nothing ");

        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(new GridBagLayout());
        jFrame.setLocationRelativeTo(null);


        Cursor cursor = new Cursor(Cursor.WAIT_CURSOR);
        jButton.setCursor(cursor);

        JRadioButton r = new JRadioButton();
        JPopupMenu rs = new JPopupMenu();
        JMenuItem s = new JMenuItem("cut");
        r.add(s);

        r.setComponentPopupMenu(rs);

        JLabel loadingLabel = new JLabel("Loading. . .");
        loadingLabel.setFont(new Font("Rockwell",2,20));

        JProgressBar jProgressBar = new JProgressBar();
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);
        jProgressBar.setBackground(new Color(211, 181, 120));
        jProgressBar.setForeground(new Color(55, 137, 145));
        jProgressBar.setCursor(cursor);
        jProgressBar.setBorderPainted(true);
        jProgressBar.setFont(new Font("Rockwell",2,20));
        jProgressBar.setStringPainted(true);

        jFrame.add(loadingLabel, new GridBagConstraints(0,0,1,1,1,1 ,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),1,1));

        jFrame.add(jProgressBar , new  GridBagConstraints(0,1,1,1,1,1 ,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),1,1));
        jFrame.setSize(400,600);
        for(int i=jProgressBar.getMinimum(); i<=jProgressBar.getMaximum(); i++)
        {
            Thread.sleep(60);
            jProgressBar.setValue(i);
        }
        Thread.sleep(200);
        jFrame.remove(jProgressBar);
        jFrame.repaint();
        loadingLabel.setText("Uploaded!");
        jFrame.add(jButton ,  new  GridBagConstraints(1,1,1,1,1,1 ,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),1,1));
        jFrame.add(jScrollPane , new  GridBagConstraints(1,2,1,1,1,1 ,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1,1,1,1),1,1));
    }
}
