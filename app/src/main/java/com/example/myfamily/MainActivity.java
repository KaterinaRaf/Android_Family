package com.example.myfamily;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCreateFamily(View view) {
        TextView text_family = (TextView) findViewById(R.id.text_family);
        Spinner familyKin = (Spinner) findViewById(R.id.familyKin);
        Spinner nameKin = (Spinner) findViewById(R.id.nameKin);
        String result1 = String.valueOf(familyKin.getSelectedItem());
        String result2 = String.valueOf(nameKin.getSelectedItem());
        String resultFamily = result1 + " " + result2;
        text_family.setText(resultFamily);
    }
}