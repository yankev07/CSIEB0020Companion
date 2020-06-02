package com.ndhuproject.csieb0020companion.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.ndhuproject.csieb0020companion.HelpActivity;
import com.ndhuproject.csieb0020companion.ProblemsActivity;
import com.ndhuproject.csieb0020companion.QueryResults;
import com.ndhuproject.csieb0020companion.R;
import com.ndhuproject.csieb0020companion.database.DatabaseSQL;

/**
 * Created by kevin on 5/4/18.
 */

public class FragmentSearch extends android.support.v4.app.Fragment {

    public static EditText searchField;
    private Button validateButton;
    private boolean dataAdded = false;
    DatabaseSQL myDB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_search, container, false);

        searchField = (EditText) view.findViewById(R.id.searchField);
        validateButton = (Button) view.findViewById(R.id.validate_button);

        validateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                executeQuery(searchField.getText().toString());
            }
        });

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.floating_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getBaseContext(), HelpActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return view;
    }


    /** Query the User's input in the database **/
    private void executeQuery(String keyWord){
        if(searchField.getText().toString().trim().isEmpty()){
            Toast.makeText(getActivity(), "Input a C library or a function name", Toast.LENGTH_LONG).show();
        }
        else{
            /** Open the Query Results window using the input keyWord **/
            if(!dataAdded){
                myDB = new DatabaseSQL(getActivity());
                myDB.initializeData("assert.h", "assert");
            }
            Intent intent = new Intent(getActivity().getBaseContext(), QueryResults.class);
            intent.putExtra("keyWord", keyWord);
            getActivity().startActivity(intent);
        }
        return;
    }

}
