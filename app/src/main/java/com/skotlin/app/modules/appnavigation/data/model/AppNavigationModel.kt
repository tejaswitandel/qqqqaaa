package com.skotlin.app.modules.appnavigation.`data`.model

import com.skotlin.app.R
import com.skotlin.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOnboardingA: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_onboarding_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOnboardingAA: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_onboarding_aa)

)
