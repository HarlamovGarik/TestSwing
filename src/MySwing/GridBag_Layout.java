package MySwing;

import javax.swing.*;
import java.awt.*;

public class GridBag_Layout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new GridBagLayout());


        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.gridx =0;
        bagConstraints.gridy =0;
     //   bagConstraints.gridheight=2;
        bagConstraints.weightx=0;
        bagConstraints.weighty=1;
        bagConstraints.anchor = GridBagConstraints.WEST;
        bagConstraints.fill = GridBagConstraints.VERTICAL;
        bagConstraints.insets = new Insets(100,2,20,2);
      //  bagConstraints.ipadx=3;
        bagConstraints.ipady=6;

        GridBagConstraints bagConstraints2 = new GridBagConstraints();
        bagConstraints2.gridx =1;
        bagConstraints2.gridy =0;
       // bagConstraints2.gridheight=2;
        bagConstraints2.weightx=1;
       // bagConstraints2.weighty=0.5;
        bagConstraints2.anchor = GridBagConstraints.NORTH;
        bagConstraints2.fill = GridBagConstraints.HORIZONTAL;
        bagConstraints2.insets = new Insets(100,2,20,2);
      //  bagConstraints2.ipadx=3;
        bagConstraints2.ipady=6;

        GridBagConstraints bagConstraints3 = new GridBagConstraints();
        bagConstraints3.gridx =2;
        bagConstraints3.gridy =0;
      //  bagConstraints3.gridheight=2;
        //bagConstraints3.weightx=0.5;
       // bagConstraints3.weighty=0.5;
        bagConstraints3.anchor = GridBagConstraints.CENTER;
        bagConstraints3.fill = GridBagConstraints.VERTICAL;
        bagConstraints3.insets = new Insets(100,2,20,2);
        //bagConstraints3.ipadx=3;
        bagConstraints3.ipady=6;

        JButton jButton = new JButton("This next 1");
        JButton jButton2 = new JButton("This next 2");
        JButton jButton3 = new JButton("This next 3");


        jFrame.add(jButton,bagConstraints);
        jFrame.add(jButton2,bagConstraints2);
        jFrame.add(jButton3,bagConstraints3);


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.pack();
    }
}
