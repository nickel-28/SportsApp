package com.nikhil.sportsapp.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikhil.sportsapp.EXTRA_PLAYER
import com.nikhil.sportsapp.Model.Player
import com.nikhil.sportsapp.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}