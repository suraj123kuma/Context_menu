package com.example.context_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<ListView>(R.id.list)
        val studentdata = arrayOf("Suraj","Akash","Manish","Ajit","Sohail","Bikki")
        list.adapter = ArrayAdapter(this,R.layout.listview,studentdata)

        registerForContextMenu(list)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menu?.add(0,v!!.id,0,"profile")
        menu?.add(0,v!!.id,0,"Setting")
        menu?.add(0,v!!.id,0,"Home")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        if(item!!.title=="item1"){
            Toast.makeText(this,"item 1",Toast.LENGTH_SHORT).show().toString()
            }
          else if(item!!.title=="item2"){
                Toast.makeText(this,"item 2",Toast.LENGTH_SHORT).show()
            }
        else{
                Toast.makeText(this,"item 3",Toast.LENGTH_SHORT).show()
            }

        return true
    }

}