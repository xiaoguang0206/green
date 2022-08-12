package game.body;
import javax.swing.*;
public class windos {
    public static void main(String[] args) {
        JFrame jf = new JFrame("snake");
        jf.setVisible(true);
        jf.setBounds(500,300,600,450);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.add(new gameP());


    }
}
