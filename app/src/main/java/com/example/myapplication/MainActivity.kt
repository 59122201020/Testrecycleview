package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnJobItemClickListner {

    lateinit var binding: ActivityMainBinding

    lateinit var joblist: ArrayList<Jobs>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        joblist = ArrayList()
       addJobs()


        jobRecycler.layoutManager = LinearLayoutManager(this)
        jobRecycler.addItemDecoration(DividerItemDecoration(this,1))
        jobRecycler.adapter = JobAdepter(joblist,this)



    }
    fun addJobs() {
        joblist.add(Jobs("jobNo 1", "truckLicense 62-4421"))
        joblist.add(Jobs("jobNo 2","truckLicense 62-3452") )
        joblist.add(Jobs("jobNo 3","truckLicense 62-7599") )
 }
        override fun onItemClick(item: Jobs, position: Int) {
        Toast.makeText(this, item.name , Toast.LENGTH_SHORT).show()
//val intent = Intent(this, Jobdetail::class.java)
//        intent.putExtra("CARNAME", item.name)
//        intent.putExtra("CARDESC", item.description)
//        intent.putExtra("CARLOGO", item.logo.toString())
//startActivity(intent)


    }

}