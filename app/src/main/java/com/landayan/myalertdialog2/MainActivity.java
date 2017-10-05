package com.landayan.myalertdialog2;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog (View view){
        CustomDialog dialog = new CustomDialog();
        dialog.show(getFragmentManager(), "Hello");
    }
}
