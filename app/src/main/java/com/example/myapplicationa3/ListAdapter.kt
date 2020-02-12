package com.example.myapplicationa3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.name_list_item.view.*

class ListAdapter(private val names: List<String>,
                  private val clickListener: MainActivity
) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.name_list_item, parent, false)
        return ListViewHolder(v, clickListener)
    }

    override fun getItemCount():Int = names.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) = holder.onBind(names[position])

    public class ListViewHolder(
        private val item: View,
        private val clickListener: MainActivity
    ) : RecyclerView.ViewHolder(item) {

        fun onBind(name: String) {
            item.txtName.text = name
            item.setOnClickListener {
                clickListener.onClick(name)

                 }
            }
        }
    }