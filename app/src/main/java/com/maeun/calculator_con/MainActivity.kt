package com.maeun.calculator_con

//import android.icu.text.NumberFormat
//import android.net.Uri
//import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat

//import android.support.annotation.RequiresApi
//import android.text.Editable
//import android.text.TextWatcher
//import android.view.View
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nf = NumberFormat.getInstance()

        var value_fifty_thousand : Int = 0
        var value_ten_thousand : Int = 0
        var value_five_thousand : Int = 0
        var value_thousand : Int = 0
        var value_five_hundred : Int = 0
        var value_hundred : Int = 0
        var value_fifty: Int = 0
        var value_ten : Int = 0
        var total : Int = 0

        var hundred_family : Int = 0
        var fivehundred40_family : Int = 0
        var fivehundred50_family : Int = 0
        var total_family : Int = 0

        fun calculate_total() : String{
            total = value_fifty_thousand + value_ten_thousand + value_five_thousand + value_thousand + value_five_hundred + value_hundred + value_fifty + value_ten
            return nf.format(total).toString()
        }
        fun calculate_total_family() : String{
            total_family = hundred_family + fivehundred40_family + fivehundred50_family
            return nf.format(total_family).toString()
        }

        main_fifty_thousand_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_fifty_thousand_edit.text.toString() == "") {
                    value_fifty_thousand = 0
                } else {
                    value_fifty_thousand = main_fifty_thousand_edit.text.toString().toInt() * 50000
                }
                main_total_tv.text = calculate_total()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_ten_thousand_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_ten_thousand_edit.text.toString() == "") {
                    value_ten_thousand = 0
                } else {
                    value_ten_thousand = main_ten_thousand_edit.text.toString().toInt() * 10000
                }
                main_total_tv.text = calculate_total()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_five_thousand_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_five_thousand_edit.text.toString() == "") {
                    value_five_thousand = 0
                } else {
                    value_five_thousand = main_five_thousand_edit.text.toString().toInt() * 5000
                }
                main_total_tv.text = calculate_total()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_thousand_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_thousand_edit.text.toString() == "") {
                    value_thousand = 0
                } else {
                    value_thousand = main_thousand_edit.text.toString().toInt() * 1000
                }
                main_total_tv.text = calculate_total()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_five_hundred_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_five_hundred_edit.text.toString() == "") {
                    value_five_hundred = 0
                } else {
                    value_five_hundred = main_five_hundred_edit.text.toString().toInt() * 500
                }
                main_total_tv.text = calculate_total()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_hundred_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_hundred_edit.text.toString() == "") {
                    value_hundred = 0
                } else {
                    value_hundred = main_hundred_edit.text.toString().toInt() * 100
                }
                main_total_tv.text = calculate_total()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_fifty_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_fifty_edit.text.toString() == "") {
                    value_fifty = 0
                } else {
                    value_fifty = main_fifty_edit.text.toString().toInt() * 50
                }
                main_total_tv.text = calculate_total()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_ten_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_ten_edit.text.toString() == "") {
                    value_ten = 0
                } else {
                    value_ten = main_ten_edit.text.toString().toInt() * 10
                }
                main_total_tv.text = calculate_total()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        main_hundred_family_edit.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_hundred_family_edit.text.toString() == "") {
                    hundred_family = 0
                } else {
                    hundred_family = main_hundred_family_edit.text.toString().toInt() * 5000
                }
                main_hundred_family_tv.text = nf.format(hundred_family).toString()
                main_total_family_tv.text = calculate_total_family()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_fivehundred40_family_edit.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_fivehundred40_family_edit.text.toString() == "") {
                    fivehundred40_family = 0
                } else {
                    fivehundred40_family = main_fivehundred40_family_edit.text.toString().toInt() * 20000
                }
                main_fivehundred40_family_tv.text = nf.format(fivehundred40_family).toString()
                main_total_family_tv.text = calculate_total_family()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        main_fivehundred50_family_edit.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if (main_fivehundred50_family_edit.text.toString() == "") {
                    fivehundred50_family = 0
                } else {
                    fivehundred50_family = main_fivehundred50_family_edit.text.toString().toInt() * 25000
                }
                main_fivehundred50_family_tv.text = nf.format(fivehundred50_family).toString()
                main_total_family_tv.text = calculate_total_family()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })




    }

}

//
//
//import android.icu.text.NumberFormat
//import android.net.Uri
//import android.os.Build
//import android.os.Bundle
//import android.support.annotation .RequiresApi
//import android.support.v7.app.AppCompatActivity
//import android.text.Editable
//import android.text.TextWatcher
//import android.view.View
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast
//
//import com.google.android.gms.appindexing.Action
//import com.google.android.gms.appindexing.AppIndex
//import com.google.android.gms.appindexing.Thing
//import com.google.android.gms.common.api.GoogleApiClient
//
//class MainActivity : AppCompatActivity() {
//    internal var fifty_thousand: EditText
//    internal var ten_thousand: EditText
//    internal var five_thousand: EditText
//    internal var thousand: EditText
//    internal var five_hundred: EditText
//    internal var hundred: EditText
//    internal var fifty: EditText
//    internal var ten: EditText
//    internal var hundred_family: EditText
//    internal var fivehundred40_family: EditText
//    internal var fivehundred50_family: EditText
//    internal var total: TextView
//    internal var hundred_fa: TextView
//    internal var fivehundred40_fa: TextView
//    internal var fivehundred50_fa: TextView
//    internal var total_cage: TextView
//    internal var ester: TextView
//    internal var a = 0
//
//    /**
//     * ATTENTION: This was auto-generated to implement the App Indexing API.
//     * See https://g.co/AppIndexing/AndroidStudio for more information.
//     */
//    private var client: GoogleApiClient? = null
//
//    /**
//     * ATTENTION: This was auto-generated to implement the App Indexing API.
//     * See https://g.co/AppIndexing/AndroidStudio for more information.
//     */
//    // TODO: Define a title for the content shown.
//    // TODO: Make sure this auto-generated URL is correct.
//    val indexApiAction: Action
//        get() {
//            val `object` = Thing.Builder()
//                    .setName("Main Page")
//                    .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
//                    .build()
//            return Action.Builder(Action.TYPE_VIEW)
//                    .setObject(`object`)
//                    .setActionStatus(Action.STATUS_TYPE_COMPLETED)
//                    .build()
//        }
//
//    @RequiresApi(api = Build.VERSION_CODE, , N =)
//    fun formatSeperatedByComma(`val`: Long): String {
//        val format = NumberFormat.getNumberInstance()
//        return format.format(`val`)
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.N)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        fifty_thousand = findViewById(R.id.fifty_thousand) as EditText
//        ten_thousand = findViewById(R.id.ten_thousand) as EditText
//        five_thousand = findViewById(R.id.five_thousand) as EditText
//        thousand = findViewById(R.id.thousand) as EditText
//        five_hundred = findViewById(R.id.five_hundred) as EditText
//        hundred = findViewById(R.id.hundred) as EditText
//        fifty = findViewById(R.id.fifty) as EditText
//        ten = findViewById(R.id.ten) as EditText
//
//        hundred_family = findViewById(R.id.hundred_family) as EditText
//        fivehundred40_family = findViewById(R.id.fivehundred40_family) as EditText
//        fivehundred50_family = findViewById(R.id.fivehundred50_family) as EditText
//
//        hundred_fa = findViewById(R.id.hundred_fa) as TextView
//        fivehundred40_fa = findViewById(R.id.fivehundred40_fa) as TextView
//        fivehundred50_fa = findViewById(R.id.fivehundred50_fa) as TextView
//
//        total = findViewById(R.id.total) as TextView
//
//        total_cage = findViewById(R.id.total_cage) as TextView
//
//        ester = findViewById(R.id.ester) as TextView
//
//        ester.setOnClickListener {
//            if (a < 23) {
//                a = a + 1
//            } else {
//                Toast.makeText(applicationContext, "모찌♥", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        fifty_thousand.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (fifty_thousand.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    total.text = formatSeperatedByComma((Integer.parseInt(fifty_thousand.text.toString()) * 50000 + Integer.parseInt(ten_thousand.text.toString()) * 10000 + Integer.parseInt(five_thousand.text.toString()) * 5000 + Integer.parseInt(thousand.text.toString()) * 1000 + Integer.parseInt(five_hundred.text.toString()) * 500 + Integer.parseInt(hundred.text.toString()) * 100 + Integer.parseInt(fifty.text.toString()) * 50 + Integer.parseInt(ten.text.toString()) * 10).toLong())
//                }
//            }
//        })
//
//        ten_thousand.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (ten_thousand.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    total.text = formatSeperatedByComma((Integer.parseInt(fifty_thousand.text.toString()) * 50000 + Integer.parseInt(ten_thousand.text.toString()) * 10000 + Integer.parseInt(five_thousand.text.toString()) * 5000 + Integer.parseInt(thousand.text.toString()) * 1000 + Integer.parseInt(five_hundred.text.toString()) * 500 + Integer.parseInt(hundred.text.toString()) * 100 + Integer.parseInt(fifty.text.toString()) * 50 + Integer.parseInt(ten.text.toString()) * 10).toLong())
//                }
//            }
//        })
//
//        five_thousand.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (five_thousand.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    total.text = formatSeperatedByComma((Integer.parseInt(fifty_thousand.text.toString()) * 50000 + Integer.parseInt(ten_thousand.text.toString()) * 10000 + Integer.parseInt(five_thousand.text.toString()) * 5000 + Integer.parseInt(thousand.text.toString()) * 1000 + Integer.parseInt(five_hundred.text.toString()) * 500 + Integer.parseInt(hundred.text.toString()) * 100 + Integer.parseInt(fifty.text.toString()) * 50 + Integer.parseInt(ten.text.toString()) * 10).toLong())
//                }
//            }
//        })
//
//        thousand.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (thousand.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    total.text = formatSeperatedByComma((Integer.parseInt(fifty_thousand.text.toString()) * 50000 + Integer.parseInt(ten_thousand.text.toString()) * 10000 + Integer.parseInt(five_thousand.text.toString()) * 5000 + Integer.parseInt(thousand.text.toString()) * 1000 + Integer.parseInt(five_hundred.text.toString()) * 500 + Integer.parseInt(hundred.text.toString()) * 100 + Integer.parseInt(fifty.text.toString()) * 50 + Integer.parseInt(ten.text.toString()) * 10).toLong())
//                }
//            }
//        })
//
//        five_hundred.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (five_hundred.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    total.text = formatSeperatedByComma((Integer.parseInt(fifty_thousand.text.toString()) * 50000 + Integer.parseInt(ten_thousand.text.toString()) * 10000 + Integer.parseInt(five_thousand.text.toString()) * 5000 + Integer.parseInt(thousand.text.toString()) * 1000 + Integer.parseInt(five_hundred.text.toString()) * 500 + Integer.parseInt(hundred.text.toString()) * 100 + Integer.parseInt(fifty.text.toString()) * 50 + Integer.parseInt(ten.text.toString()) * 10).toLong())
//                }
//            }
//        })
//
//        hundred.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (hundred.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    total.text = formatSeperatedByComma((Integer.parseInt(fifty_thousand.text.toString()) * 50000 + Integer.parseInt(ten_thousand.text.toString()) * 10000 + Integer.parseInt(five_thousand.text.toString()) * 5000 + Integer.parseInt(thousand.text.toString()) * 1000 + Integer.parseInt(five_hundred.text.toString()) * 500 + Integer.parseInt(hundred.text.toString()) * 100 + Integer.parseInt(fifty.text.toString()) * 50 + Integer.parseInt(ten.text.toString()) * 10).toLong())
//                }
//            }
//        })
//
//        fifty.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (fifty.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    total.text = formatSeperatedByComma((Integer.parseInt(fifty_thousand.text.toString()) * 50000 + Integer.parseInt(ten_thousand.text.toString()) * 10000 + Integer.parseInt(five_thousand.text.toString()) * 5000 + Integer.parseInt(thousand.text.toString()) * 1000 + Integer.parseInt(five_hundred.text.toString()) * 500 + Integer.parseInt(hundred.text.toString()) * 100 + Integer.parseInt(fifty.text.toString()) * 50 + Integer.parseInt(ten.text.toString()) * 10).toLong())
//                }
//            }
//        })
//
//        ten.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (ten.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    total.text = formatSeperatedByComma((Integer.parseInt(fifty_thousand.text.toString()) * 50000 + Integer.parseInt(ten_thousand.text.toString()) * 10000 + Integer.parseInt(five_thousand.text.toString()) * 5000 + Integer.parseInt(thousand.text.toString()) * 1000 + Integer.parseInt(five_hundred.text.toString()) * 500 + Integer.parseInt(hundred.text.toString()) * 100 + Integer.parseInt(fifty.text.toString()) * 50 + Integer.parseInt(ten.text.toString()) * 10).toLong())
//                }
//            }
//        })
//
//        hundred_family.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (hundred_family.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    hundred_fa.text = formatSeperatedByComma((Integer.parseInt(hundred_family.text.toString()) * 5000).toLong())
//                    total_cage.text = formatSeperatedByComma((Integer.parseInt(hundred_family.text.toString()) * 5000 + Integer.parseInt(fivehundred40_family.text.toString()) * 20000 + Integer.parseInt(fivehundred50_family.text.toString()) * 25000).toLong())
//                }
//            }
//        })
//        fivehundred40_family.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (fivehundred40_family.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    fivehundred40_fa.text = formatSeperatedByComma((Integer.parseInt(fivehundred40_family.text.toString()) * 20000).toLong())
//                    total_cage.text = formatSeperatedByComma((Integer.parseInt(hundred_family.text.toString()) * 5000 + Integer.parseInt(fivehundred40_family.text.toString()) * 20000 + Integer.parseInt(fivehundred50_family.text.toString()) * 25000).toLong())
//                }
//            }
//        })
//        fivehundred50_family.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                if (fivehundred50_family.text.toString().replace(" ", "") == "") {
//                } else {
//                    //total.setText(Integer.toString(calculation));
//                    fivehundred50_fa.text = formatSeperatedByComma((Integer.parseInt(fivehundred50_family.text.toString()) * 25000).toLong())
//                    total_cage.text = formatSeperatedByComma((Integer.parseInt(hundred_family.text.toString()) * 5000 + Integer.parseInt(fivehundred40_family.text.toString()) * 20000 + Integer.parseInt(fivehundred50_family.text.toString()) * 25000).toLong())
//                }
//            }
//        })
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client = GoogleApiClient.Builder(this).addApi(AppIndex.API).build()
//    }
//
//    public override fun onStart() {
//        super.onStart()
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client!!.connect()
//        AppIndex.AppIndexApi.start(client, indexApiAction)
//    }
//
//    public override fun onStop() {
//        super.onStop()
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        AppIndex.AppIndexApi.end(client, indexApiAction)
//        client!!.disconnect()
//    }
//}