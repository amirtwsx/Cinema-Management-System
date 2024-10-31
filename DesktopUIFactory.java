package org.example.cinemamanagementsystemprojectassignment;

public class DesktopUIFactory implements UIFactory {
    public Button createButton() {
        return new DesktopButton();
    }
}
