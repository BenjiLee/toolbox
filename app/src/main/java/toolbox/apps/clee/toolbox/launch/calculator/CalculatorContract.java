package toolbox.apps.clee.toolbox.launch.calculator;

import android.support.annotation.NonNull;


/**
 * Created by cleeedx on 8/14/16.
 */

public class CalculatorContract {
    interface View {
        void showResult();
        void clearCalculator(); // Maybe showResults will do this.
    }

    interface UserActionsListener {
        void calculate();
        void clear();
    }
}
