package baseball.domain;

import baseball.console.Constant;

public class TerminationCondition {

    private static final int RESTART_NUMBER = 1;
    private static final int TERMINATION_NUMBER = 2;

    private final int number;

    public TerminationCondition(String condition) {
        int num = condition.charAt(0) - Constant.CHAR_ZERO;
        isValidFormat(num);
        this.number = num;
    }

    private static void isValidFormat(int number) {
        if (number != RESTART_NUMBER && number != TERMINATION_NUMBER) {
            throw new IllegalArgumentException(Constant.EXCEPTION_RESTART_CONDITION_FORMAT_MESSAGE);
        }
    }

    public boolean isRestart() {
        return number == RESTART_NUMBER;
    }
}
