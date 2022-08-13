package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay y = new CharDisplay('y');
        AbstractDisplay stringDisplay = new StringDisplay("Fight,YP");
        y.display();
        stringDisplay.display();
    }
}
