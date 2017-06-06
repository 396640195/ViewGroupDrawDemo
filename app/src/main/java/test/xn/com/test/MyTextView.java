package test.xn.com.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by xn068074 on 2017/6/5.
 */

public class MyTextView extends RelativeLayout implements  IView {
    public MyTextView(Context context,int resource) {
        super(context);

        View inflated = LayoutInflater.from(getContext()).inflate(resource, this);

        inflated.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        inflated.measure(MeasureSpec.makeMeasureSpec(500, MeasureSpec.AT_MOST), MeasureSpec.makeMeasureSpec(500, MeasureSpec.AT_MOST));

        // measure(getWidth(), getHeight());
        inflated.layout(0, 0, inflated.getMeasuredWidth(), inflated.getMeasuredHeight());
    }
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void draw(Canvas canvas, float x, float y) {
        int saveId = canvas.save();
        // translate to the correct position and draw
        canvas.translate(100+x, 100+y);
        super.draw(canvas);
        canvas.drawText("DDDDDDDDDD",50,100,new Paint());
        canvas.restoreToCount(saveId);
    }
}
