package com.example.task

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class CourseAdapter     // creating a constructor for our variables.
    (// creating a variable for array list and context.
    private val courseModalArrayList: ArrayList<CourseModal>, private val context: Context
) :
    RecyclerView.Adapter<CourseAdapter.ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            // below line is to inflate our layout.
            val view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.course_rv_item, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            // setting data to our views of recycler view.
            val modal = courseModalArrayList[position]
            holder.tvemail.text = modal.getEmail()
            holder.tvnumber.text = modal.getNumber()
        }

        override fun getItemCount(): Int {
            // returning the size of array list.
            return courseModalArrayList.size
        }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // creating variables for our views.
        val tvemail: TextView
        val tvnumber: TextView

        init {

            // initializing our views with their ids.
            tvemail = itemView.findViewById(R.id.tvemail)
            tvnumber = itemView.findViewById(R.id.tvnumber)
        }
    }
}
