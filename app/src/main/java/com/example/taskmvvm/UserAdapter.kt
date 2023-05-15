package com.example.taskmvvm

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.taskmvvm.databinding.UserBinding

class UserAdapter(var context: Context, val data: List<User>):RecyclerView.Adapter<UserAdapter.MyViewHolder>() {
    class MyViewHolder(var binding:UserBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=UserBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data=data[position]
        holder.binding.imageView.setImageDrawable(data.profilePic.toDrawable())
        holder.binding.txtid.text=data.userId.toString()
        holder.binding.txtname.text=data.name
    }
}