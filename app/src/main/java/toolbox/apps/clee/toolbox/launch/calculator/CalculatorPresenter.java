package toolbox.apps.clee.toolbox.launch.calculator;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;


public class CalculatorPresenter implements CalculatorContract.UserActionsListener {

    public CalculatorPresenter() {
    }

    @Override
    public void calculate() {
        System.out.println("calculate called on presenter");
    }

    @Override
    public void clear() {
        System.out.println("clear called on presenter");
    }
}
