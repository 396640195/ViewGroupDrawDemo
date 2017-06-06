package test.xn.com.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyLinearLayout mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView = (MyLinearLayout)this.findViewById(R.id.container);

        MyTextView mt = new MyTextView(this,R.layout.markview);
        mView.setView(mt);


    }
}
