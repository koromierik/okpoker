/*
* File: App.java
* Author: Körömi Erik
* Copyright: 2023, Körömi Erik 
* Date: 2023-12-02
* Licenc: MIT
*
*/
public class App { 
    public static void main(String[] args) throws Exception { 
        
        MainWindow mainWindow = new MainWindow();
        MainController mainController = new MainController(mainWindow);
        
        mainWindow.setVisible(true);
    }
}