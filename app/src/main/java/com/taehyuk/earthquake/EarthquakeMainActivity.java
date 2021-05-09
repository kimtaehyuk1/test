package com.taehyuk.earthquake;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EarthquakeMainActivity extends AppCompatActivity {


    private static final String TAG_LIST_FRAGMENT = "TAG_LIST_FRAGMENT";

    //밑에는 fragment객체를 저장한 변수 만들기기
   EarthquakeListFragment mEarthquakeListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake_main);

        //fragment 객체 생성성
       FragmentManager fm = getSupportFragmentManager();

       //밑에 null인경우 UI상태에 한번도 저장한적이 없는, 처음불릴때는 트랜잭션 시작. 시작하면 이 코드와 commit코드 사이에 fragment관련 코드 넣기.
        if(savedInstanceState == null) {
            FragmentTransaction ft = fm.beginTransaction();
            mEarthquakeListFragment = new EarthquakeListFragment();
            ft.add(R.id.main_activity_frame,mEarthquakeListFragment,TAG_LIST_FRAGMENT);
            ft.commitNow();
        } else {
            mEarthquakeListFragment = (EarthquakeListFragment)fm.findFragmentByTag(TAG_LIST_FRAGMENT);
        }
    }
}