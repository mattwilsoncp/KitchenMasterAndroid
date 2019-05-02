package com.mattwilsoncp16.recipemaster.recipes;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class RecipesPagerAdapter extends FragmentPagerAdapter {

    public RecipesPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Find";
            case 1:
                return "Create";
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new RecipesSearchFragment();
            case 1:
                return new RecipesCreateNewFragment();
        }
        return null;
    }
}
