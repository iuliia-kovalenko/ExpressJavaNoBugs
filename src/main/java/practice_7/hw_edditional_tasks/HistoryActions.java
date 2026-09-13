package practice_7.hw_edditional_tasks;

import java.util.ArrayDeque;

public class HistoryActions {
    ArrayDeque<String> actions = new ArrayDeque<>();
    ArrayDeque<String> actionsUnDo = new ArrayDeque<>();

    public void doAction(String action) {
        actions.push(action);
        actionsUnDo.clear();
        System.out.println(action + " is Done");
    }

    public void reDo() {
        if (!actionsUnDo.isEmpty()) {
            String action = actionsUnDo.pop();
            actions.push(action);
            System.out.println(action + " is Redone");
        } else {
            System.out.println("There is nothing to Redo");
        }
    }

    public void unDo() {
        if (!actions.isEmpty()) {
            String action = actions.pop();
            actionsUnDo.push(action);
            System.out.println(action + " is Undone");
        } else {
            System.out.println("There is nothing to Undo");
        }
    }

    public void printAllDoneActions() {
        actions.forEach(System.out::println);
    }

    public void printUndoneActions() {
        actionsUnDo.forEach(System.out::println);
    }


    public static void main(String[] args) {
        HistoryActions historyActions = new HistoryActions();
        historyActions.doAction("Action1");
        historyActions.doAction("Action2");
        historyActions.doAction("Action3");

        historyActions.reDo();
        historyActions.unDo();
        historyActions.reDo();
        historyActions.doAction("Action4");
        historyActions.printAllDoneActions();
        historyActions.printUndoneActions();
    }
}