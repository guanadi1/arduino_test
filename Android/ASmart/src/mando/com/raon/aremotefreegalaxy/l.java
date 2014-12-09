package com.raon.aremotefreegalaxy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;

public class l extends am
{
  private View P;
  private View Q;
  private o S = o.a;
  private View.OnClickListener T = new m(this);
  private Animation.AnimationListener U = new n(this);

  private AnimationSet a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    if (!paramBoolean)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, paramFloat1, 1, paramFloat2, 0, 0.0F, 0, 0.0F);
      localTranslateAnimation.setDuration(300L);
      localTranslateAnimation.setInterpolator(new LinearInterpolator());
      localAnimationSet.addAnimation(localTranslateAnimation);
    }
    if (paramBoolean);
    for (float f1 = 0.0F; ; f1 = 1.0F)
    {
      float f2 = 0.0F;
      if (paramBoolean)
        f2 = 1.0F;
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(f1, f2);
      localAlphaAnimation.setDuration(400L);
      localAnimationSet.addAnimation(localAlphaAnimation);
      return localAnimationSet;
    }
  }

  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903086, paramViewGroup, false);
    a(localView);
    b(localView);
    this.P = localView.findViewById(2131230954);
    this.Q = localView.findViewById(2131230941);
    localView.findViewById(2131230955).setOnClickListener(this.T);
    localView.findViewById(2131230956).setOnClickListener(this.T);
    return localView;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.l
 * JD-Core Version:    0.6.2
 */