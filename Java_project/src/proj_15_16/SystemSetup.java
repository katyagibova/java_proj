package proj_15_16;
import java.util.ArrayList;

public class SystemSetup {
    private final ArrayList<Integer> number = new ArrayList<>();
    private final ArrayList<String> action = new ArrayList<>();
    private final ArrayList<SystemSetup> nextState = new ArrayList<>();

    public void addition(Integer num, String act, SystemSetup nextSt) {
        number.add(num);
        action.add(act);
        nextState.add(nextSt);
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    public ArrayList<String> getAction() {
        return action;
    }

    public ArrayList<SystemSetup> getNextState() {
        return nextState;
    }
}