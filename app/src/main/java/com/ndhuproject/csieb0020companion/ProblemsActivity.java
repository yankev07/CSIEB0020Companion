package com.ndhuproject.csieb0020companion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by kevin on 5/27/18.
 */

public class ProblemsActivity extends AppCompatActivity {

    ListView problemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);

        problemsList = (ListView) findViewById(R.id.problems_list);

        String[] problems = new String[] {
                "Problem 1",
                "Problem 2",
                "Problem 3",
                "Problem 4",
                "Problem 5",
                "Problem 6",
                "Problem 7",
                "Problem 8",
                "Problem 9",
                "Problem 10",
                "Problem 11",
                "Problem 12",
                "Problem 13",
                "Problem 14",
                "Problem 15",
                "Problem 16",
                "Problem 17",
                "Problem 18",
                "Problem 19",
                "Problem 20"
        };

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, problems);
        problemsList.setAdapter(adapter);

        problemsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(getApplicationContext(), adapter.getItem(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProblemsActivity.this, ProblemsDetailsActivity.class);
                intent.putExtra("title", adapter.getItem(position));
                startActivity(intent);
            }
        });
    }


    @Override
    public void onResume(){
        super.onResume();
    }
}




