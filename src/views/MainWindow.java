/*
* File: MainWindow.java
* Author: Baráth Dávid
* Copyright: 2022, Baráth Dávid
* Group: Szoft 2 N
* Date: 2022-12-14
* Github: https://github.com/david587/
* Licenc: GNU GPL
*/
package views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    TitlePanel titlePanel;
    public AedgePanel aedgePanel;
    public AlfaPanel alfaPanel;
    public AreaPanel areaPanel;
    public VolumePanel volumePanel;
    public ButtonsPanel buttonsPanel;

    public MainWindow() {
        this.titlePanel = new TitlePanel();
        this.aedgePanel = new AedgePanel();
        this.alfaPanel = new AlfaPanel();
        this.volumePanel = new VolumePanel();
        this.areaPanel = new AreaPanel();
        this.buttonsPanel = new ButtonsPanel();
        this.initWindow();
    }
    public void initWindow() {
        this.setIconImage(new ImageIcon("dbLogo.png").getImage());
        this.setTitle("rombitak");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    public void addComponents() {
        this.add(this.titlePanel);
        this.add(this.aedgePanel);
        this.add(this.alfaPanel);
        this.add(this.buttonsPanel);
        this.add(this.volumePanel);
        this.add(this.areaPanel);
        
    }
    
}
