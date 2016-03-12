package com.example.yiming.nestedscroll;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.view.View;

interface CoordinatorLayoutInsetsHelper {

  void setupForWindowInsets(View view, OnApplyWindowInsetsListener insetsListener);

}
