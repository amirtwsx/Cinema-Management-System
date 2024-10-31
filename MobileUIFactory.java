package org.example.cinemamanagementsystemprojectassignment;

public class MobileUIFactory implements UIFactory {
    public Button createButton() {
        return new MobileButton();
    }
}
