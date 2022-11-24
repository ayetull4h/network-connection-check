package com.ayetull4h.githubnetworkCheck


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val networkCheck = NetworkCheck(applicationContext)

        networkCheck.observe(this, Observer { isConnected ->

            if (isConnected) {

            //Connected

            } else {

            //Not Connected

            }
        })
    }
}
