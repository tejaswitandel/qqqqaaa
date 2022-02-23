package com.skotlin.app.modules.onboardingaa.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.skotlin.app.databinding.SlideritemOnboardingAa1Binding
import com.skotlin.app.modules.onboardingaa.`data`.model.ImageSliderGroup10Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup10Adapter(
  public val dataList: ArrayList<ImageSliderGroup10Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup10Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemOnboardingAa1Binding) {
      binding.imageSliderGroup10Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingAa1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
