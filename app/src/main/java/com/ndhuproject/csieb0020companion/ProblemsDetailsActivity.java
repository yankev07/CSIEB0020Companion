package com.ndhuproject.csieb0020companion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by kevin on 5/27/18.
 */

public class ProblemsDetailsActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problemdetails);

        imageView = (ImageView)findViewById(R.id.imageView);

        findProblem(getProblemTitle());
    }


    public void findProblem(String title){
        PhotoViewAttacher photoView = new PhotoViewAttacher(imageView);
        switch(title){
            case "Problem 1":
                imageView.setImageResource(R.drawable.problem1);
                photoView.update();
                break;
            case "Problem 2":
                imageView.setImageResource(R.drawable.problem2);
                photoView.update();
                break;
            case "Problem 3":
                imageView.setImageResource(R.drawable.problem3);
                photoView.update();
                break;
            case "Problem 4":
                imageView.setImageResource(R.drawable.problem4);
                photoView.update();
                break;
            case "Problem 5":
                imageView.setImageResource(R.drawable.problem5);
                photoView.update();
                break;
            case "Problem 6":
                imageView.setImageResource(R.drawable.problem6);
                photoView.update();
                break;
            case "Problem 7":
                imageView.setImageResource(R.drawable.problem7);
                photoView.update();
                break;
            case "Problem 8":
                imageView.setImageResource(R.drawable.problem8);
                photoView.update();
                break;
            case "Problem 9":
                imageView.setImageResource(R.drawable.problem9);
                photoView.update();
                break;
            case "Problem 10":
                imageView.setImageResource(R.drawable.problem10);
                photoView.update();
                break;
            case "Problem 11":
                imageView.setImageResource(R.drawable.problem11);
                photoView.update();
                break;
            case "Problem 12":
                imageView.setImageResource(R.drawable.problem12);
                photoView.update();
                break;
            case "Problem 13":
                imageView.setImageResource(R.drawable.problem13);
                photoView.update();
                break;
            case "Problem 14":
                imageView.setImageResource(R.drawable.problem14);
                photoView.update();
                break;
            case "Problem 15":
                imageView.setImageResource(R.drawable.problem15);
                photoView.update();
                break;
            case "Problem 16":
                imageView.setImageResource(R.drawable.problem16);
                photoView.update();
                break;
            case "Problem 17":
                imageView.setImageResource(R.drawable.problem17);
                photoView.update();
                break;
            case "Problem 18":
                imageView.setImageResource(R.drawable.problem18);
                photoView.update();
                break;
            case "Problem 19":
                imageView.setImageResource(R.drawable.problem19);
                photoView.update();
                break;
            case "Problem 20":
                imageView.setImageResource(R.drawable.problem20);
                photoView.update();
                break;
        }
    }



    public String getProblemTitle(){
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        return title;
    }
}
