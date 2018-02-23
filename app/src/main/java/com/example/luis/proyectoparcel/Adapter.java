package com.example.luis.proyectoparcel;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by Luis on 22/02/2018.
 */

public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<Modelo> arrayList;
    public Adapter(Context context, ArrayList<Modelo> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int postion) {
        return postion;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.item,null);
        }
        TextView nombre=(TextView)convertView.findViewById(R.id.i_tv_nombre);
        TextView descripcion=(TextView)convertView.findViewById(R.id.i_tv_descripcion);

        nombre.setText(arrayList.get(position).getNombre());
        descripcion.setText(arrayList.get(position).getDescripcion());
        return convertView;
    }
}
