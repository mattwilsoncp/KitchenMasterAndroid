package com.mattwilsoncp16.recipemaster.recipes;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mattwilsoncp16.recipemaster.R;

public class RecipesCreateNewFragment extends Fragment {

    private RecipesCreateNewViewModel mViewModel;

    public static RecipesCreateNewFragment newInstance() {
        return new RecipesCreateNewFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recipes_create_new_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RecipesCreateNewViewModel.class);
        // TODO: Use the ViewModel
    }

}
