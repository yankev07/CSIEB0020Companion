package com.ndhuproject.csieb0020companion;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ndhuproject.csieb0020companion.database.DatabaseSQL;

/**
 * Created by kevin on 5/9/18.
 */

public class FunctionDetailsActivity extends AppCompatActivity {

    public TextView keyword;
    public TextView functionName;
    public TextView functionSynopsis;
    public TextView functionDescription;
    private DatabaseSQL myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functiondetails);
        myDB = new DatabaseSQL(FunctionDetailsActivity.this);
        keyword = (TextView) findViewById(R.id.keyWord);
        functionName = (TextView) findViewById(R.id.function_name);
        functionSynopsis = (TextView) findViewById(R.id.function_synopsis);
        functionDescription = (TextView) findViewById(R.id.function_description);
        keyword.setText(getFunctionName() + " - Details");


        functionName.setText(myDB.displayFunctionName(getFunctionName()));
        functionSynopsis.setText(myDB.displayFunctionSynopsis(getFunctionName()));
        functionDescription.setText(myDB.displayFunctionDescription(getFunctionName()));
    }

    @Override
    public void onResume(){
        super.onResume();
        //getListName();
        //Toast.makeText(ListActivity.this, listname, Toast.LENGTH_LONG).show();
    }


    public String getFunctionName(){
        Intent intent = getIntent();
        String function = intent.getStringExtra("function");
        return function;
    }
}
