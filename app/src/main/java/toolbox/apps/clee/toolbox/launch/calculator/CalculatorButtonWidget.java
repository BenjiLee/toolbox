package toolbox.apps.clee.toolbox.launch.calculator;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;

import toolbox.apps.clee.toolbox.R;

public class CalculatorButtonWidget extends Button {

    public CalculatorButtonWidget(Context context) {
        super(context);
    }

    public CalculatorButtonWidget(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setBackground(getResources().getDrawable(R.drawable.calculator_button, null));

        } else {
            setBackgroundDrawable(getResources().getDrawable(R.drawable.calculator_button));
        }
    }

}