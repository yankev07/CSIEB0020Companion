package com.ndhuproject.csieb0020companion;

import android.content.Context;

import com.ndhuproject.csieb0020companion.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 5/15/18.
 */

public class Constant {

    public List<Item> getAllItem(Context context) {
        List<Item> items = new ArrayList<>();
        ArrayList<String> tutorialsList = new ArrayList<String>();
        tutorialsList.add("Get Started");
        tutorialsList.add("C Hello World");
        tutorialsList.add("The a+b Problem");
        tutorialsList.add("Integers Sorting");
        tutorialsList.add("Pointers in C");

        if(tutorialsList.size() > 0){
            for(int i=0; i < tutorialsList.size(); i++){
                items.add(new Item(context.getResources().getIdentifier("icon_tutorials", "drawable", context.getPackageName()), tutorialsList.get(i)));
            }
        }
        return items;
    }
}
