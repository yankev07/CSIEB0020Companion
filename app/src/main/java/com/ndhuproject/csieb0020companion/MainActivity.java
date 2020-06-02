package com.ndhuproject.csieb0020companion;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.BottomNavigationView;
import android.os.Bundle;
import android.view.MenuItem;

import com.ndhuproject.csieb0020companion.fragments.FragmentAbout;
import com.ndhuproject.csieb0020companion.fragments.FragmentBookmarks;
import com.ndhuproject.csieb0020companion.fragments.FragmentSearch;
import com.ndhuproject.csieb0020companion.fragments.FragmentTutorials;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        // Display Fragment Home by default
        loadFragment(new FragmentSearch());
    }


    // Replace the Current Fragment
    private boolean loadFragment(Fragment fragment){
        if(fragment != null){

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        // Check which menu item is checked
        Fragment fragment = null;

        switch(item.getItemId()){

            case R.id.navigation_search:
                fragment = new FragmentSearch();
                break;

            case R.id.navigation_Bookmarks:
                fragment = new FragmentBookmarks();
                break;

            case R.id.navigation_Tutorials:
                fragment = new FragmentTutorials();
                break;

            case R.id.navigation_About:
                fragment = new FragmentAbout();
                break;
        }

        // Call the method that replaces the fragment
        return loadFragment(fragment);
    }
}
