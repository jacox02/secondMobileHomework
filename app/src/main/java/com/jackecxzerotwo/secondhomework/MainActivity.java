package com.jackecxzerotwo.secondhomework;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    EditText moneyCounter = (EditText)findViewById(R.id.coinTotal);

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_VOLUME_UP:
                Toast.makeText(this,"Volumen UP pressed", Toast.LENGTH_SHORT).show();
                event.startTracking();
                return false;
        }
        return super.onKeyDown(keyCode, event);
    }

}

