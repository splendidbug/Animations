package com.example.android.animations;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class FragmentPractice extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


       // setHasOptionsMenu(true);

        return inflater.inflate(R.layout.fragment_practice,container, false);


    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        // Inflate the fragment menu items.
//        inflater.inflate(R.menu.menu_top, menu);
//        super.onCreateOptionsMenu(menu, inflater);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch(item.getItemId())
//        {
//            case R.id.top_star:
//            {
//                break;
//            }
//
//            case R.id.top_notifications:
//            {
//                break;
//            }
//
//            case R.id.top_group:
//            {
//                break;
//            }
//        }
//
//
//            return true;
//    }
}


