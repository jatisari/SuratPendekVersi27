package net.agusharyanto.suratpendek;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SuratAdapter extends RecyclerView.Adapter<SuratAdapter.IconViewHolder>{
    List<Surat> surats;
    Context context;
    int selpos;
    SuratAdapter(Context mcontext, List<Surat> persons){
        this.context = mcontext;
        this.surats = persons;
        //this.selpos = selpos;
    }
    @Override
    public IconViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_audio, viewGroup, false);
        IconViewHolder ivh = new IconViewHolder(v);
        return ivh;
    }
    @Override
    public void onBindViewHolder(IconViewHolder holder, int position) {
        holder.textViewAudio.setText(surats.get(position).getName());
    }
    @Override
    public int getItemCount() {
        return surats.size();
    }
    public Surat getItem(int pos){
        return surats.get(pos);
    }
    public static class IconViewHolder extends RecyclerView.ViewHolder {
        ImageView eventIcon;
        TextView textViewAudio;
        IconViewHolder(View itemView) {
            super(itemView);
            eventIcon = (ImageView) itemView.findViewById(R.id.imageView2);
            textViewAudio = (TextView) itemView.findViewById(R.id.textViewRowAudio);
        }
    }
}