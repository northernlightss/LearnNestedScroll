package com.example.yiming.nestedscroll;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewOutlineProvider;

class ViewUtilsLollipop {

  @TargetApi(21)
  static void setBoundsViewOutlineProvider(View view) {
    view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
  }

}