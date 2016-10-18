package biz.somos.coordinatorlayout.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import biz.somos.coordinatorlayout.Model.MenuItem;
import biz.somos.coordinatorlayout.R;

/**
 * Created by sbv23 on 17/10/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    protected ArrayList<MenuItem> menuItems;


    public static class  RecyclerViewHolder extends RecyclerView.ViewHolder{

        protected TextView categoria, nombre;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            categoria = (TextView) itemView.findViewById(R.id.txtCategoria);
            nombre = (TextView) itemView.findViewById(R.id.txtNombre);
        }
    }

    public RecyclerAdapter(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_recycler, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.RecyclerViewHolder holder, int position) {
        holder.categoria.setText(menuItems.get(position).getCategoria());
        holder.nombre.setText(menuItems.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }
}
