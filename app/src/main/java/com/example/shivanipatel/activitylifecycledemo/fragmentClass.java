package com.example.shivanipatel.activitylifecycledemo;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by shivani.patel on 25-05-2016.
 */
public class fragmentClass extends Fragment {
    String msg="Fragment";
    public fragmentClass() {
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(msg, "on attach method is called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(msg,"on create method is called");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_layout,container,false);
        Log.e(msg, "on create view is called");
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(msg,"on activity created is called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(msg,"on start is called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(msg, "on resume is called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(msg, "on pause is called");
    }



    @Override
    public void onStop() {
        super.onStop();
        Log.e(msg, "on stop is called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(msg, "on destroy view is called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(msg, "on destroy is called");
    }



    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(msg, "on detach is called");
    }
}
