package com.skotlin.app.modules.onboardinga.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.skotlin.app.databinding.SlideritemOnboardingA1Binding
import com.skotlin.app.modules.onboardinga.`data`.model.ImageSliderGroup3Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup3Adapter(
  public val dataList: ArrayList<ImageSliderGroup3Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup3Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemOnboardingA1Binding) {
      binding.imageSliderGroup3Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingA1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
