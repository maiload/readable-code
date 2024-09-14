package cleancode.studycafe.prac.io;

import cleancode.studycafe.prac.model.StudyCafePass;
import cleancode.studycafe.prac.model.StudyCafePassType;

import java.util.List;

public interface InputHandler {
    StudyCafePassType getPassTypeSelectingUserAction();

    StudyCafePass getSelectPass(List<StudyCafePass> passes);

    boolean getLockerSelection();
}
