package com.skotlin.app.modules.onboardingaa.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.skotlin.app.modules.onboardingaa.`data`.model.OnboardingAaModel

public class OnboardingAaVM : ViewModel() {
  public val onboardingAaModel: MutableLiveData<OnboardingAaModel> =
      MutableLiveData(OnboardingAaModel())

  public var navArguments: Bundle? = null
}
