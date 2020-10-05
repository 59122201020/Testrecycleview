package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.job.view.*

class JobAdepter(var items : ArrayList<Jobs>,var clickListner: OnJobItemClickListner) : RecyclerView.Adapter<JobViewHolder>(){
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        lateinit var jobViewHolder : JobViewHolder
        jobViewHolder = JobViewHolder(LayoutInflater.from(parent.context).inflate
            (R.layout.job,parent,false ))
        return jobViewHolder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
//        holder.jobName?.text =  items.get(position).name
//        holder.jobDes?.text = items.get(position).des
        holder.initialize(items.get(position),clickListner)

    }
}

class JobViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    var jobName = itemView.jobname
    var jobDes = itemView.jobdes

    fun initialize(item: Jobs, action:OnJobItemClickListner) {
        jobName.text = item.name
        jobDes.text = item.des
        itemView.setOnClickListener {
            action.onItemClick(item, adapterPosition)
        }
    }

}

interface OnJobItemClickListner{
    fun onItemClick(item: Jobs, position: Int)
}