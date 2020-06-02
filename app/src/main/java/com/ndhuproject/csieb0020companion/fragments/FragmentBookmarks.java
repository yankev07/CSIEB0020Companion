package com.ndhuproject.csieb0020companion.fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ndhuproject.csieb0020companion.FunctionDetailsActivity;
import com.ndhuproject.csieb0020companion.QueryResults;
import com.ndhuproject.csieb0020companion.R;
import com.ndhuproject.csieb0020companion.adapter.BookmarkAdapter;
import com.ndhuproject.csieb0020companion.adapter.ListAdapter;
import com.ndhuproject.csieb0020companion.database.DatabaseSQL;

import java.util.ArrayList;

import static com.ndhuproject.csieb0020companion.R.id.lyt_not_found;

/**
 * Created by kevin on 5/4/18.
 */

public class FragmentBookmarks extends android.support.v4.app.Fragment implements BookmarkAdapter.ItemClickListener {

    public ArrayList<String> functionsList;
    private LinearLayout emptyBookmarks;
    public RecyclerView recyclerView;
    public BookmarkAdapter adapter;
    private DatabaseSQL myDB;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view  = inflater.inflate(R.layout.fragment_bookmarks, container, false);
        myDB = new DatabaseSQL(getActivity());

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        emptyBookmarks = (LinearLayout) view.findViewById(R.id.lyt_not_found);
        functionsList = myDB.displayBookmarks();

        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        adapter = new BookmarkAdapter(getActivity(), functionsList);

        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);

        adapter.setLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getActivity(), adapter.getItem(i).toString(), Toast.LENGTH_LONG).show();
                showDeleteDialog(adapter.getItem(i).toString(), i);
                return true;
            }
        });

        if (adapter.getItemCount() == 0) {
            emptyBookmarks.setVisibility(View.VISIBLE);
        } else {
            emptyBookmarks.setVisibility(View.GONE);
        }

        return view;
    }

    public void showDeleteDialog(String functionName, final int position){

        final Dialog alertDialog = new Dialog(getActivity());
        final String thisFunction = functionName.toString();
        alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        alertDialog.setContentView(R.layout.dialog_deletebookmark);
        alertDialog.setTitle("My Custom Dialog");

        TextView function = (TextView)alertDialog.findViewById(R.id.bookmark_keyWord);
        Button Cancel = (Button)alertDialog.findViewById(R.id.button_cancel);
        Button Yes = (Button)alertDialog.findViewById(R.id.button_delete);

        function.setText(thisFunction);
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
                myDB.deleteBookmark(thisFunction);
                functionsList.remove(position);
                adapter.notifyItemRemoved(position);
                alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }

    @Override
    public void onItemClick(View view, int position){
        //Toast.makeText(getActivity(), functionsList.get(position).toString(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getActivity().getBaseContext(), FunctionDetailsActivity.class);
        intent.putExtra("function", functionsList.get(position).toString());
        getActivity().startActivity(intent);
    }

    @Override
    public void onItemLongClick(View view, int position){
        //Toast.makeText(getActivity(), "Long Click", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onResume(){
        super.onResume();
        //getListName();
        //Toast.makeText(ListActivity.this, listname, Toast.LENGTH_LONG).show();
    }
}
