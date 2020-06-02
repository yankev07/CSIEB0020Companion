package com.ndhuproject.csieb0020companion;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ndhuproject.csieb0020companion.adapter.ListAdapter;
import com.ndhuproject.csieb0020companion.database.DatabaseSQL;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by kevin on 5/5/18.
 */

public class QueryResults extends AppCompatActivity implements ListAdapter.ItemClickListener{

    public TextView keyword;
    public TextView function;
    private DatabaseSQL myDB;
    private LinearLayout lyt_not_found;
    public ListAdapter adapter;
    public ArrayList<String> functionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queryresults);
        lyt_not_found = (LinearLayout) findViewById(R.id.lyt_not_found);
        keyword = (TextView) findViewById(R.id.keyWord);
        keyword.setText(getKeyWord());

        myDB = new DatabaseSQL(QueryResults.this);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        if(getKeyWord().equals("all")){
            functionsList = myDB.displayAllFunctions();
        }
        else{
            functionsList = myDB.displayFunctions(getKeyWord());
        }
        adapter = new ListAdapter(this, functionsList);
        adapter.setClickListener(this);
        adapter.setLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                return true;
            }
        });

        adapter.setLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                String function = functionsList.get(i).toString();
                ShowBookmarkDialog(function, i);
                return false;
            }
        });
        recyclerView.setAdapter(adapter);

        if (adapter.getItemCount() == 0) {
            lyt_not_found.setVisibility(View.VISIBLE);
        } else {
            lyt_not_found.setVisibility(View.GONE);
        }
    }


    @Override
    public void onItemClick(View view, int position){

        String function = functionsList.get(position).toString();
        Intent intent = new Intent(QueryResults.this, FunctionDetailsActivity.class);
        intent.putExtra("function", function);
        startActivity(intent);
    }

    @Override
    public void onItemLongClick(View view, int position){
        Toast.makeText(QueryResults.this, "Long Click", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResume(){
        super.onResume();
        //SQLdatabase myDB = new SQLdatabase(QueryResults.this);
        //recyclerView.setAdapter(myAdapter);
    }


    public String getKeyWord(){
        Intent intent = getIntent();
        String keyWord = intent.getStringExtra("keyWord");
        return keyWord;
    }


    public void ShowBookmarkDialog(final String functionName, final int position){

        final Dialog alertDialog = new Dialog(QueryResults.this);
        alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        alertDialog.setContentView(R.layout.dialog_bookmarkfunction);
        alertDialog.setTitle("My Custom Dialog");

        TextView function = (TextView)alertDialog.findViewById(R.id.bookmark_keyWord);
        Button Cancel = (Button)alertDialog.findViewById(R.id.button_cancel);
        Button Yes = (Button)alertDialog.findViewById(R.id.button_delete);

        function.setText(functionName.toString());
        Cancel.setEnabled(true);
        Yes.setEnabled(true);

        Cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                alertDialog.dismiss();
            }
        });

        Yes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(myDB.addBookmark(functionName)){
                    alertDialog.dismiss();
                }
                else{
                    Toast.makeText(QueryResults.this, "Already Exists!", Toast.LENGTH_LONG).show();
                    alertDialog.dismiss();
                }
            }
        });

        alertDialog.show();
    }
}
