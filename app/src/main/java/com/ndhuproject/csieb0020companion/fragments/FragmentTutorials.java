package com.ndhuproject.csieb0020companion.fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.ndhuproject.csieb0020companion.Constant;
import com.ndhuproject.csieb0020companion.FunctionDetailsActivity;
import com.ndhuproject.csieb0020companion.ProblemsActivity;
import com.ndhuproject.csieb0020companion.R;
import com.ndhuproject.csieb0020companion.adapter.BookmarkAdapter;
import com.ndhuproject.csieb0020companion.adapter.TutorialAdapter;
import com.ndhuproject.csieb0020companion.model.Item;
import com.ndhuproject.csieb0020companion.tutorials.TutorialAPlusBProblem;
import com.ndhuproject.csieb0020companion.tutorials.TutorialGettingStarted;
import com.ndhuproject.csieb0020companion.tutorials.TutorialHelloWorld;
import com.ndhuproject.csieb0020companion.tutorials.TutorialIntegersSorting;
import com.ndhuproject.csieb0020companion.tutorials.TutorialPointers;

import java.util.List;

/**
 * Created by kevin on 5/4/18.
 */

public class FragmentTutorials extends android.support.v4.app.Fragment {

    private RecyclerView recyclerView;
    private TutorialAdapter mAdapter;
    private Constant constant;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view  = inflater.inflate(R.layout.fragment_tutorials, container, false);

        constant = new Constant();

        recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));

        List<Item> tutorialsList = constant.getAllItem(view.getContext());

        displayTutorials(tutorialsList);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.floating_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getBaseContext(), ProblemsActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }

    private void displayTutorials(List<Item> tutorialsList){
        mAdapter = new TutorialAdapter(view.getContext(), tutorialsList);
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new TutorialAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, Item obj, int position) {
                //Toast.makeText(getActivity(), obj.getName().toString(), Toast.LENGTH_LONG).show();
                //openTutorial(obj.getName().toString());
                switch(obj.getName().toString()){

                    case "Get Started":
                        Intent intent1 = new Intent(getActivity().getBaseContext(), TutorialGettingStarted.class);
                        getActivity().startActivity(intent1);
                        break;
                    case "C Hello World":
                        Intent intent2 = new Intent(getActivity().getBaseContext(), TutorialHelloWorld.class);
                        getActivity().startActivity(intent2);
                        break;
                    case "The a+b Problem":
                        Intent intent3 = new Intent(getActivity().getBaseContext(), TutorialAPlusBProblem.class);
                        getActivity().startActivity(intent3);
                        break;
                    case "Integers Sorting":
                        Intent intent4 = new Intent(getActivity().getBaseContext(), TutorialIntegersSorting.class);
                        getActivity().startActivity(intent4);
                        break;
                    case "Pointers in C":
                        Intent intent5 = new Intent(getActivity().getBaseContext(), TutorialPointers.class);
                        getActivity().startActivity(intent5);
                        break;
                }
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    //public void openTutorial(String tutorialTitle){}
}
