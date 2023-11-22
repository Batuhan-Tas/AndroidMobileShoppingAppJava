package com.example.techcareerandroiddeveloperodev6.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.techcareerandroiddeveloperodev6.data.entity.Items;
import com.example.techcareerandroiddeveloperodev6.databinding.CardTasarimBinding;
import com.example.techcareerandroiddeveloperodev6.ui.fragment.AnasayfaFragmentDirections;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.CardTasarimTutucu> {
    private List<Items> itemsList;
    private Context mContext;

    public  ItemsAdapter(List<Items> itemsList,Context mContext){
        this.itemsList = itemsList;
        this.mContext = mContext;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim){
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Items item = itemsList.get(position);
        CardTasarimBinding t = holder.tasarim;

        t.imageViewItem.setImageResource(mContext.getResources().getIdentifier(item.getPhoto(),"drawable",mContext.getPackageName()));
        t.textViewName.setText(item.getName());
        t.cardViewItem.setOnClickListener(view -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(item);
            Navigation.findNavController(view).navigate(gecis);
        });




    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}
