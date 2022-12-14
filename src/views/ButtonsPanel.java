/*
* File: ButtonsPanel.java
* Author: Baráth Dávid
* Copyright: 2022, Baráth Dávid
* Group: Szoft 2 N
* Date: 2022-12-14
* Github: https://github.com/david587/
* Licenc: GNU GPL
*/
package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
    public JButton calcButton;
    public JButton aboutButton;
    public ButtonsPanel() {
        this.calcButton = new JButton("Számít");
        this.aboutButton = new JButton("Névjegy");
        this.addComponents();
    }
    public void addComponents() {
        this.add(this.calcButton);
        this.add(this.aboutButton);
    }
    
}
