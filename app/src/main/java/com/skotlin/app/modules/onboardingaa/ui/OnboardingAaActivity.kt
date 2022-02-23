package com.skotlin.app.modules.onboardingaa.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.skotlin.app.R
import com.skotlin.app.appcomponents.base.BaseActivity
import com.skotlin.app.databinding.ActivityOnboardingAaBinding
import com.skotlin.app.modules.onboardingaa.`data`.model.ImageSliderGroup10Model
import com.skotlin.app.modules.onboardingaa.`data`.viewmodel.OnboardingAaVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class OnboardingAaActivity :
    BaseActivity<ActivityOnboardingAaBinding>(R.layout.activity_onboarding_aa) {
  private val imageSliderGroup10Items: ArrayList<ImageSliderGroup10Model> = arrayListOf()

  private val viewModel: OnboardingAaVM by viewModels<OnboardingAaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup10Adapter = ImageSliderGroup10Adapter(imageSliderGroup10Items,true)
    binding.imageSliderGroup10.adapter = imageSliderGroup10Adapter
    binding.imageSliderGroup10.onIndicatorProgress = { selectingPosition, progress ->
      binding..onPageScrolled(selectingPosition, progress)
    }
    binding..updateIndicatorCounts(binding.imageSliderGroup10.indicatorCount)
    binding.onboardingAaVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup10.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup10.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDING_AA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingAaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
