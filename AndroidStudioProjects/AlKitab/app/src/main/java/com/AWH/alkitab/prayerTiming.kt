package com.AWH.alkitab

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.azan.Azan
import com.azan.Method
import com.azan.astrologicalCalc.Location
import com.azan.astrologicalCalc.SimpleDate
import java.util.*

class prayerTiming : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prayer_timing)

        val today = SimpleDate(GregorianCalendar())
        val location = Location(33.738045, 73.084488, 5.0, 0)
        val azan = Azan(location, Method.KARACHI_HANAF)
        val prayerTimes = azan.getPrayerTimes(today)
       // val imsaak = azan.getImsaak(today)
        //println("----------------results------------------------")
        //println("date ---> " + today.day + " / " + today.month + " / " + today.year)
        //println("imsaak ---> $imsaak")
        //println("Fajr ---> " + prayerTimes.fajr())
        //println("sunrise --->" + prayerTimes.shuruq())
        //println("Zuhr --->" + prayerTimes.thuhr())
        //println("Asr --->" + prayerTimes.assr())
        //println("Maghrib --->" + prayerTimes.maghrib())
        //println("ISHA  --->" + prayerTimes.ishaa())
        //println("----------------------------------------")


        findViewById<TextView>(R.id.txt0).text = "Date:" + today.day + " / " + today.month + " / " + today.year
        findViewById<TextView>(R.id.txt1).text = ("Fajr: " + prayerTimes.fajr())
        findViewById<TextView>(R.id.txt2).text = ("sunrise: " + prayerTimes.shuruq())
        findViewById<TextView>(R.id.txt3).text = ("Zuhr: " + prayerTimes.thuhr())
        findViewById<TextView>(R.id.txt4).text = ("Asr: " + prayerTimes.assr())
        findViewById<TextView>(R.id.txt5).text = ("Maghrib: " + prayerTimes.maghrib())
        findViewById<TextView>(R.id.txt6).text = ("ISHA: " + prayerTimes.ishaa())
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}