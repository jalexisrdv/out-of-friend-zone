package outoffriendzone;

import controllers.CButtons;
import javax.swing.JFrame;
import models.RandomPosition;
import views.PanelOutOfFriendZone;

/**
 *
 * @author jarv
 */
public class OutOfFriendZone {

    public static void main(String[] args) {
        RandomPosition model = new RandomPosition();
        PanelOutOfFriendZone view = new PanelOutOfFriendZone();
        CButtons controller = new CButtons(model, view);
        JFrame f = new JFrame();
        f.setBounds(350, 150, 600, 450);
        f.add(view);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
