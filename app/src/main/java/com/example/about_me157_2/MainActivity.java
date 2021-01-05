package com.example.about_me157_2;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageView = findViewById(R.id.iVPortada);
        //GLIDE Cargar una foto de internet y mostrarla en un IV.
        Glide.with(this)
                .load("https://lh3.googleusercontent.com/6rA2IY8tYBSLi96oI-K2tcn6EKNS1qp_Ky437UU8s0hQIBTaxD3fQWRX9M_lNzPv5QadmYHSDn-iZDdXL9OsqueAP5kWDzQ8w4-EphGL-RVLqCJUH3CUauN2YkjJDg31tAnm8ywIAy9mhgnOSEj04RSKXj7lcXkkKdSRrNdfFcUunG7lSItwpOpccAnUqhmvK-_J0YSh_vH0lu8vWWMN2dCG2JIsUicJD8SxB6VVqqnEEonVAhE0NWzflUbvSXxJx5X9Zj5q0jMbRrN274TgduDbVN4egLdWkM1CF2O19Z8qeuvlqa3W5U7DTfV_7sxfs9TrjEj-pNAucARWgLFGzgIxqkPq6MiPchh-rqwKgod79cvxobTauW1pHShXB-ml0kFwl7-j30ngD0kHrlzC9ISBxV1DykXwoSSrgZQMP-Ofy__9H2Jem8mxW6jF709ZDqE4R4OSMp97iHO-qQIUAiYv7hXUii4547KmnVhjm_fpHNkCXduragL9zAfL90P9PbKHIBciTDOpepCwZKGUcc5OB_GWCCLWKApTPpvYEzLRuqoz-L563gI6eZ16QkOJVi6R8K7LqJH93LiPb6pfT97yMjQg0iy0kpuOBKLvYMaoYewd-Z2SC6dsIjQ804BFUXMXHBz7_yjfSW_T5DQrOtynzjZSY1Nkjr_DqsFYgNzR8q4EJh837_tC0oo8kg=w735-h979-no?authuser=0")
                .into(imageView);
    }

    //TODO 1  Arreglar la interface grafica respecto a lo solicitado
    //TODO 2 Tener una vista Landscape para la MainActivity
    //TODO 3 Opcional, Utilizar ViewBinding en toda la MainActivity.


}