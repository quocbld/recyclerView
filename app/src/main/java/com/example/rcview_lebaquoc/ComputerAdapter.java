package com.example.rcview_lebaquoc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.support.v7.widget.RecyclerView;

import java.util.List;
public class ComputerAdapter extends RecyclerView.Adapter<ComputerAdapter.ViewHolder> {

    public List<Mode> computerList;

    public ComputerAdapter(List<Mode> ModeList) {
        computerList = ModeList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView ten, gia;

        public ViewHolder(View itemView) {
            super(itemView);
            ten = (TextView) itemView.findViewById(R.id.computername);
            gia = (TextView) itemView.findViewById(R.id.gia);
        }
    }

    public ComputerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.computer,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ComputerAdapter.ViewHolder holder, int position) {
        holder.ten.setText(computerList.get(position).getTen());
        holder.gia.setText(computerList.get(position).getGia());
    }

    @Override
    public int getItemCount() {
        return computerList.size();
    }
}