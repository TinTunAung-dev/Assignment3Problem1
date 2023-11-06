package com.example.assignment3problem1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextVersion: EditText
    private lateinit var editTextCodeName: EditText
    private lateinit var addButton: Button
    private lateinit var tableLayout: TableLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextVersion = findViewById(R.id.editTextVersion)
        editTextCodeName = findViewById(R.id.editTextCodeName)
        addButton = findViewById(R.id.addButton)
        tableLayout = findViewById(R.id.tableLayout)

        addStaticRow("Android Version", "Code Name")
        addStaticRow("Android 12", "Snow Cone")

        addButton.setOnClickListener {
            val version = editTextVersion.text.toString()
            val codeName = editTextCodeName.text.toString()

            addDynamicRow(version, codeName)

            editTextVersion.text.clear()
            editTextCodeName.text.clear()
        }
    }

    private fun addStaticRow(version: String, codeName: String) {
        val row = TableRow(this)
        val layouts = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        row.layoutParams = layouts
        val versionTextView = TextView(this)
        val codeNameTextView = TextView(this)

        versionTextView.text = version
        codeNameTextView.text = codeName

        row.addView(versionTextView)
        row.addView(codeNameTextView)

        tableLayout.addView(row)
    }

    private fun addDynamicRow(version: String, codeName: String) {
        val row = TableRow(this)
        val layouts = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        row.layoutParams = layouts
        val versionTextView = TextView(this)
        val codeNameTextView = TextView(this)

        versionTextView.text = version
        codeNameTextView.text = codeName

        row.addView(versionTextView)
        row.addView(codeNameTextView)

        tableLayout.addView(row)
    }
}