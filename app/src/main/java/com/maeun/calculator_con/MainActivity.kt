package com.maeun.calculator_con

//import android.icu.text.NumberFormat
//import android.net.Uri
//import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

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

        main_fifty_thousand_edit.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                main_total_tv.text = (main_fifty_thousand_edit.text.toString().toInt() *50000).toString()
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