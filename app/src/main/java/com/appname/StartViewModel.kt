package com.appname

import android.app.Application
import android.arch.lifecycle.AndroidViewModel

/**
 * @author ashish on 02,August,2018
 *
 * If the ViewModel needs the Application context, for example to find a system service,
 * it can extend the AndroidViewModel class and have a constructor that receives the
 * Application in the constructor, since Application class extends Context.
 */
class StartViewModel(application: Application) : AndroidViewModel(application) {

}