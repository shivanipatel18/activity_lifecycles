package com.example.shivanipatel.activitylifecycledemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnDialog,btnMultiple;
    String msg= "Activity Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(msg, "OnCreate was called");

        btnDialog=(Button)findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("Alert message to be shown");
                alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });


    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.e(msg, "OnResume was called");

    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.e(msg, "onStart was called");

    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.e(msg, "onPause was called");
    }



    @Override
    protected void onStop() {

        super.onStop();
        Log.e(msg, "onStop was called");

    }

    @Override
    protected void onRestart() {

        super.onRestart();
        Log.e(msg, "onRestart was called");

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.e(msg, "onDestroy was called");
    }
}
