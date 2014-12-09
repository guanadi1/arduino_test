package com.raon.aremotefreegalaxy;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class ab
  implements Animation.AnimationListener
{
  ab(MainActivity paramMainActivity, View paramView)
  {
  }

  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.clearAnimation();
    this.a.setVisibility(8);
  }

  public void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.ab
 * JD-Core Version:    0.6.2
 */