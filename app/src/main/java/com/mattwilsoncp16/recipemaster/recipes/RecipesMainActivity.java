package com.mattwilsoncp16.recipemaster.recipes;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

import com.mattwilsoncp16.recipemaster.R;

public class RecipesMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Recipes");

        RecipesPagerAdapter pa = new RecipesPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(pa);
        TabLayout tabLayout = findViewById(R.id.recipe_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }




}
