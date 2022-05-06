package com.example.appfragment6a;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;


public class SecondFragment extends Fragment {

GridView gv;
TableLayout tv;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        View view=inflater.inflate(R.layout.fragment_second,container,false);
        return view;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String []navne={"Anne","Bent","Carl","Dennis","Erik","Frederik","Karen","Jakob","Lars","Morten"};
        String[] tal={"1","2","3","4","5","6","7","8","9","10"};
        ArrayList<person> mCur=new ArrayList<>();
        ArrayList<TextView> felter=new ArrayList<>();
        person p=new person("1","Anne");
        person p1=new person("2","Bent");
        person p2=new person("3","Carl");
        person p3=new person("4","Dan");
        person p4=new person("5","Emma");
        person p5=new person("6","Frederik");
        mCur.add(p); mCur.add(p1); mCur.add(p2);mCur.add(p3);mCur.add(p4);mCur.add(p5);

        //ArrayAdapter<person> adapter=new ArrayAdapter<person>(getActivity(), android.R.layout.simple_list_item_1,mCur);
         gv=(GridView) view.findViewById(R.id.gridview);
         GridAdapter adapter=new GridAdapter(tal,navne, view.getContext());
         gv.setAdapter(adapter);


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
       // binding = null;
    }

}
