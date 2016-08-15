package toolbox.apps.clee.toolbox.launch.calculator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import toolbox.apps.clee.toolbox.R;
import toolbox.apps.clee.toolbox.databinding.CalculatorActivityBinding;

public class CalculatorActivity extends AppCompatActivity implements CalculatorContract.View {

    private CalculatorActivityBinding calculatorActivityBinding;
    private CalculatorContract.UserActionsListener userActionsListener;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calculatorActivityBinding = DataBindingUtil.setContentView(this, R.layout.calculator_activity);

        userActionsListener = new CalculatorPresenter();

        calculatorActivityBinding.numberPad.equationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userActionsListener.calculate();
            }
        });
    }

    @Override
    public void showResult() {
        Toast.makeText(getApplicationContext(), "calculate called on view", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clearCalculator() {
        Toast.makeText(getApplicationContext(), "clear called on view", Toast.LENGTH_SHORT).show();
    }
}
