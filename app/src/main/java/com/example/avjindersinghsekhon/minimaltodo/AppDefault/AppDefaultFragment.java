package com.example.avjindersinghsekhon.minimaltodo.AppDefault;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class AppDefaultFragment extends Fragment {


    @Override
    public View onCreateView(
            LayoutInflater inflater,
             ViewGroup container,
             Bundle savedInstanceState
    ) {
        return inflater.inflate(layoutRes(), container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    protected abstract int layoutRes();
}
