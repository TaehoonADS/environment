package kr.co.insighter.environment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("t", "test");
        Log.d("t", "test2");
        Log.d("t", "test3");
        Log.d("t", "test4");
    }

    @Override
    protected  void onStart(){
        super.onStart();
        Log.d("t", "onStart");
    }
}
