package com.skotlin.app.modules.onboardinga.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.skotlin.app.modules.onboardinga.`data`.model.OnboardingAModel

public class OnboardingAVM : ViewModel() {
  public val onboardingAModel: MutableLiveData<OnboardingAModel> =
      MutableLiveData(OnboardingAModel())

  public var navArguments: Bundle? = null
}
