package toolbox.apps.clee.toolbox.launch.calculator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import toolbox.apps.clee.toolbox.R;
import toolbox.apps.clee.toolbox.databinding.CalculatorBinding;

public class CalculatorActivity extends AppCompatActivity implements CalculatorContract.View {

    private CalculatorBinding calculatorBinding;
    private CalculatorContract.UserActionsListener userActionsListener;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calculatorBinding = DataBindingUtil.setContentView(this, R.layout.calculator);

        userActionsListener = new CalculatorPresenter(CalculatorActivity.this);

        calculatorBinding.calculateButton.setOnClickListener(new View.OnClickListener() {
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
