package com.taehyuk.earthquake;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class EarthquakeListFragment extends Fragment {

    //Fragment 이면서 지진 배열 저장하기
    private ArrayList<Earthquake> mEarthquakes = new ArrayList<Earthquake>();

    //빈 생성자 만들기
    public EarthquakeListFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater. inflate(R.layout.fragment_earthquake_list,container,false);

        return view;
    }
}
