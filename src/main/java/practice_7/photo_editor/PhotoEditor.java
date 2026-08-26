package practice_7.photo_editor;

import java.util.Stack;

public class PhotoEditor {
    //save last action
    //opportunity to undo last action

    private Stack<String> actions;


    public PhotoEditor() {
        this.actions = new Stack<>();
    }

    public void addNewAction(String action) {
        actions.push(action);
    }

    public void undoAction() {
        actions.pop();
    }

    public void printActions() {
        System.out.println("All actions: ");
        actions.forEach(System.out::println);
    }

    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();
        photoEditor.addNewAction("ActionFirst");
        photoEditor.addNewAction("ActionSecond");
        photoEditor.addNewAction("ActionThird");
        photoEditor.addNewAction("ActionFourth");
        photoEditor.printActions();
        photoEditor.undoAction();
        photoEditor.printActions();

    }
}
