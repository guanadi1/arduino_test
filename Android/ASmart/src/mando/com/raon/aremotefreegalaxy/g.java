package com.raon.aremotefreegalaxy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.raon.remotelib.c;
import com.raon.remotelib.f;

public class g extends am
{
  View P;
  com.raon.remotelib.g Q;
  private View.OnTouchListener S = new h(this);

  private void c(View paramView)
  {
    for (int i = 0; ; i++)
    {
      try
      {
        if (i < ((ViewGroup)paramView).getChildCount())
        {
          View localView = ((ViewGroup)paramView).getChildAt(i);
          if ((localView instanceof ImageButton))
          {
            if (localView.getTag() != null)
              ((ImageButton)localView).setOnTouchListener(this.S);
          }
          else
            c(localView);
        }
      }
      catch (Exception localException)
      {
      }
      return;
    }
  }

  private void w()
  {
    com.raon.remotelib.g localg = this.R.g().d;
    View localView1 = this.P.findViewById(2131230911);
    View localView2 = this.P.findViewById(2131230917);
    View localView3 = this.P.findViewById(2131230923);
    ImageView localImageView1 = (ImageView)this.P.findViewById(2131230924);
    ImageView localImageView2 = (ImageView)this.P.findViewById(2131230925);
    if ((!localg.c.a) || (!localg.d()))
    {
      localView1.setVisibility(8);
      localView2.setVisibility(8);
      localImageView1.setVisibility(4);
      localImageView2.setVisibility(4);
      if (localg.d())
      {
        localView3.setVisibility(8);
        return;
      }
      localView3.setVisibility(0);
      return;
    }
    localView1.setVisibility(0);
    localView2.setVisibility(0);
    ImageView localImageView3 = (ImageView)this.P.findViewById(2131230912);
    ImageView localImageView4 = (ImageView)this.P.findViewById(2131230913);
    ImageView localImageView5 = (ImageView)this.P.findViewById(2131230914);
    ImageView localImageView6 = (ImageView)this.P.findViewById(2131230915);
    ImageView localImageView7 = (ImageView)this.P.findViewById(2131230916);
    int i;
    int j;
    label249: int k;
    label271: int m;
    label293: int n;
    if (localg.c.h == 0)
    {
      i = 2130837594;
      localImageView3.setBackgroundResource(i);
      if (localg.c.h != 1)
        break label640;
      j = 2130837596;
      localImageView4.setBackgroundResource(j);
      if (localg.c.h != 2)
        break label647;
      k = 2130837598;
      localImageView5.setBackgroundResource(k);
      if (localg.c.h != 3)
        break label654;
      m = 2130837600;
      localImageView6.setBackgroundResource(m);
      if (localg.c.h != 4)
        break label661;
      n = 2130837602;
      label315: localImageView7.setBackgroundResource(n);
      ((TextView)this.P.findViewById(2131230922)).setText("" + localg.c.g);
      if (!localg.c.c)
        break label668;
      localImageView1.setVisibility(0);
      label378: if (!localg.c.b)
        break label677;
      localImageView2.setVisibility(0);
    }
    while (true)
    {
      ImageView localImageView8 = (ImageView)this.P.findViewById(2131230918);
      ImageView localImageView9 = (ImageView)this.P.findViewById(2131230919);
      ImageView localImageView10 = (ImageView)this.P.findViewById(2131230920);
      TextView localTextView = (TextView)this.P.findViewById(2131230921);
      localImageView8.clearAnimation();
      localImageView9.clearAnimation();
      localImageView10.clearAnimation();
      localImageView8.measure(0, 0);
      RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 360.0F, localImageView8.getMeasuredWidth() / 2.0F, localImageView8.getMeasuredHeight() / 2.0F);
      localRotateAnimation.setInterpolator(new LinearInterpolator());
      localRotateAnimation.setRepeatCount(-1);
      localRotateAnimation.setDuration(1000L);
      localImageView8.setVisibility(0);
      localImageView9.setVisibility(8);
      localImageView10.setVisibility(8);
      localTextView.setVisibility(8);
      if (localg.c.i > 0)
        localImageView9.setVisibility(0);
      if (localg.c.i > 1)
        localImageView10.setVisibility(0);
      if (localg.c.i == 3)
        localTextView.setVisibility(0);
      localRotateAnimation.setDuration(800L);
      localImageView8.startAnimation(localRotateAnimation);
      localImageView9.startAnimation(localRotateAnimation);
      localImageView10.startAnimation(localRotateAnimation);
      return;
      i = 2130837593;
      break;
      label640: j = 2130837595;
      break label249;
      label647: k = 2130837597;
      break label271;
      label654: m = 2130837599;
      break label293;
      label661: n = 2130837601;
      break label315;
      label668: localImageView1.setVisibility(4);
      break label378;
      label677: localImageView2.setVisibility(4);
    }
  }

  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.P = paramLayoutInflater.inflate(2130903076, paramViewGroup, false);
    c(this.P);
    this.Q = this.R.h();
    if (this.Q.c == null)
      this.Q.c = new c();
    w();
    return this.P;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.g
 * JD-Core Version:    0.6.2
 */