# network-connection-check
**Network control for Kotlin. Check the internet connection of the Android device.**

## How to use?

`val networkCheck = NetworkCheck(applicationContext)`

`networkCheck.observe(this, Observer { isConnected -> if (isConnected) { //Connected } else { //Not Connected }})`
