package com.ndhuproject.csieb0020companion.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ndhuproject.csieb0020companion.R;

/**
 * Created by kevin on 5/4/18.
 */

public class FragmentAbout extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_about, container, false);

        // Inflate the layout for this fragment
        return view;

    }
}
