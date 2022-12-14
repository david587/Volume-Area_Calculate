package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import views.MainWindow;

public class MainController {
    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.handleEvents();
    }

    public void handleEvents(){
        JButton calcButton = this.mainWindow.buttonsPanel.calcButton;
        JButton aboutButton = this.mainWindow.buttonsPanel.aboutButton;
        calcButton.addActionListener(e -> onClickCalcButton());
        aboutButton.addActionListener(e -> onClickABoutButton());
    }
    public void onClickCalcButton(){
        String aedgeStr = this.mainWindow.aedgePanel.getValue();
        String alfaStr = this.mainWindow.alfaPanel.getValue();
        double alfa = Double.parseDouble(alfaStr);
        double aedge = Double.parseDouble(aedgeStr);
        Double volume = 4* aedge;
        Double radian = alfa* Math.PI/180;
        Double area = Math.pow(aedge, 2)*Math.sin(radian);
        this.mainWindow.volumePanel.setValue(volume.toString());
        this.mainWindow.areaPanel.setValue(area.toString());
    }
    
    public void onClickABoutButton(){
        String aboutString = "Rombitak\nVerzió: 0.1\nBaráth Dávid Szoft 2 N\n 2022-12-14";
        JOptionPane.showMessageDialog(mainWindow,aboutString);
    }
}
