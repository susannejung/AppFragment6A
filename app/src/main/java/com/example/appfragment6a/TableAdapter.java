package com.example.appfragment6a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TableLayout;
import android.widget.TextView;


public class TableAdapter extends BaseAdapter {

    private String[] numre;
    private String[] navne;
    private Context context;
    private LayoutInflater inflater;

    public TableAdapter(String[] numre, String[] navne, Context context) {
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
        TableLayout tableView=(TableLayout) ConvertView;
        if(ConvertView==null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             tableView= (TableLayout)inflater.inflate(R.layout.custom_layout, null);
        }
        TextView tNr=(TextView) tableView.findViewById(R.id.textView2);
        TextView tNavn=(TextView) tableView.findViewById(R.id.textView3);

        tNr.setText(numre[i]);
        tNavn.setText(navne[i]);
        return tableView;

    }
}
