package com.example.annah.dhakacity.commom.base.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.annah.dhakacity.R;
import com.example.annah.dhakacity.commom.callback.ActionBarController;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anik on 3/8/2018.
 */

public abstract class BaseAppCompatActivity extends AppCompatActivity implements ActionBarController {

    @BindView(R.id.toolbar) protected Toolbar toolbar;

    private ActionBarDrawerToggle actionBarDrawerToggle;
    private View navigationHeader;
    ImageView hideDrawerImageView;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUpContentView();
        ButterKnife.bind(this);
        initToolbar();
    }

    private void initToolbar() {

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    protected abstract void setUpContentView();

    @Override
    public void setActoinBarText(String text) {
        getSupportActionBar().setTitle(text);
    }





}
