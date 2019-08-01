package com.example.a15fragments_ii;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorCorreos extends ArrayAdapter<Correo> {

    private ArrayList<Correo> correos;

    public AdaptadorCorreos(Context context, ArrayList<Correo> correos) {
        super(context, R.layout.listitem_correo, correos);
        this.correos = correos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        ViewHolder holder;

        if (item == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(R.layout.listitem_correo, null);

            holder = new ViewHolder();
            holder.de = item.findViewById(R.id.tvDe);
            holder.asunto = item.findViewById(R.id.tvAsunto);

            item.setTag(holder);
        }
        else {
            holder = (ViewHolder) item.getTag();
        }

        holder.de.setText(correos.get(position).getDe());
        holder.asunto.setText(correos.get(position).getAsunto());

        return item;
    }

    static class ViewHolder {
        TextView de;
        TextView asunto;
    }
}
