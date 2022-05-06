package com.example.appfragment6a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import static com.example.appfragment6a.R.layout.fragment_second;

public class GridAdapter extends BaseAdapter {

    private String[] numre;
    private String[] navne;
    private Context context;
    private LayoutInflater inflater;

    public GridAdapter(String[] numre, String[] navne, Context context) {
        this.numre = numre;
        this.navne = navne;
        this.context = context;
      }


    @Override
    public int getCount() {
        return numre.length;
    }

    @Override
    public Object getItem(int i) {
        return numre[i];
    }


    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View ConvertView, ViewGroup viewGroup) {
        View GridView=ConvertView;
        if(ConvertView==null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            GridView = inflater.inflate(R.layout.custom_layout, null);
        }
        TextView tNr=(TextView) GridView.findViewById(R.id.textView2);
        TextView tNavn=(TextView) GridView.findViewById(R.id.textView3);

        tNr.setText(numre[i]);
        tNavn.setText(navne[i]);
        return GridView;
    }
}
