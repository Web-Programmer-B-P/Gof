package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Chat {
    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void sendMessage(String msg, Colleague me) {
        colleagueList.forEach(coll -> {
            if (coll != me) {
                coll.printMessage(msg);
            }
        });
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagueList.add(colleague);
    }
}
