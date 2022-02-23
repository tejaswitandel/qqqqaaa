package com.skotlin.app.modules.onboardinga.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.skotlin.app.R
import com.skotlin.app.appcomponents.base.BaseActivity
import com.skotlin.app.databinding.ActivityOnboardingABinding
import com.skotlin.app.modules.onboardinga.`data`.model.ImageSliderGroup3Model
import com.skotlin.app.modules.onboardinga.`data`.viewmodel.OnboardingAVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class OnboardingAActivity :
    BaseActivity<ActivityOnboardingABinding>(R.layout.activity_onboarding_a) {
  private val imageSliderGroup3Items: ArrayList<ImageSliderGroup3Model> = arrayListOf()

  private val viewModel: OnboardingAVM by viewModels<OnboardingAVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup3Adapter = ImageSliderGroup3Adapter(imageSliderGroup3Items,true)
    binding.imageSliderGroup3.adapter = imageSliderGroup3Adapter
    binding.imageSliderGroup3.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup1.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup1.updateIndicatorCounts(binding.imageSliderGroup3.indicatorCount)
    binding.onboardingAVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup3.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup3.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDING_A_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingAActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
