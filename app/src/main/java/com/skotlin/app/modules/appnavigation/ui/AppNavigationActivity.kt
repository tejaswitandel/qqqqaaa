package com.skotlin.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.skotlin.app.R
import com.skotlin.app.appcomponents.base.BaseActivity
import com.skotlin.app.databinding.ActivityAppNavigationBinding
import com.skotlin.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.skotlin.app.modules.onboardinga.ui.OnboardingAActivity
import com.skotlin.app.modules.onboardingaa.ui.OnboardingAaActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearOnboardingAA.setOnClickListener {
      val destIntent = OnboardingAaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingA.setOnClickListener {
      val destIntent = OnboardingAActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
