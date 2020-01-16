package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import models.RandomPosition;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import views.PanelOutOfFriendZone;

public class CButtons extends MouseAdapter implements ActionListener {

    private final RandomPosition model;
    private final PanelOutOfFriendZone panel;

    public CButtons(RandomPosition model, PanelOutOfFriendZone panel) {
        this.model = model;
        this.panel = panel;
        addEvents();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int width = panel.getPanelButtonNo().getWidth();
        int height = panel.getPanelButtonNo().getHeight();
        int x = model.getRandomPosition(width, panel.getButtonNo().getWidth());
        int y = model.getRandomPosition(height, panel.getButtonNo().getHeight());
        panel.getPanelButtonNo().removeAll();
        panel.getPanelButtonNo().revalidate();
        panel.getPanelButtonNo().add(panel.getButtonNo(), new AbsoluteConstraints(x, y, -1, -1));
        panel.getPanelButtonNo().repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = "SABIA QUE DIRIAS QUE SI <3";
        String title = "TKM";
        JOptionPane.showMessageDialog(panel, msg, title, JOptionPane.PLAIN_MESSAGE);
    }

    private void addEvents() {
        panel.getButtonNo().addMouseMotionListener(this);
        panel.getButtonYes().addActionListener(this);
    }

}
