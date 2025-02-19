package com.example.viewbindingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingrv.TaskList.taskList
import com.example.viewbindingrv.databinding.RecycleviewItemBinding

class MainAdapter(val taskList: List<Task>): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    inner class MainViewHolder(val itemBinding: RecycleviewItemBinding)
        : RecyclerView.ViewHolder(itemBinding.root) {
            fun bindItem(task: Task) {
                itemBinding.titleTv.text = task.title
                itemBinding.timeTv.text = task.timestamp
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecycleviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }

}