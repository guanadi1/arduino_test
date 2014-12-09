package com.raon.aremotefreegalaxy;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationSet;

class m
  implements View.OnClickListener
{
  m(l paraml)
  {
  }

  public void onClick(View paramView)
  {
    AnimationSet localAnimationSet2;
    AnimationSet localAnimationSet1;
    if (Integer.parseInt(paramView.getTag().toString()) == 100000)
      if (l.a(this.a) == o.a)
      {
        localAnimationSet2 = l.a(this.a, 0.0F, -1.0F, false);
        localAnimationSet1 = l.a(this.a, 1.0F, 0.0F, true);
      }
    while (true)
    {
      localAnimationSet2.setAnimationListener(l.b(this.a));
      l.c(this.a).startAnimation(localAnimationSet2);
      l.d(this.a).startAnimation(localAnimationSet1);
      return;
      localAnimationSet1 = l.a(this.a, 0.0F, -1.0F, false);
      localAnimationSet2 = l.a(this.a, 1.0F, 0.0F, true);
      continue;
      if (l.a(this.a) == o.a)
      {
        localAnimationSet2 = l.a(this.a, 0.0F, 1.0F, false);
        localAnimationSet1 = l.a(this.a, -1.0F, 0.0F, true);
      }
      else
      {
        localAnimationSet1 = l.a(this.a, 0.0F, 1.0F, false);
        localAnimationSet2 = l.a(this.a, -1.0F, 0.0F, true);
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.m
 * JD-Core Version:    0.6.2
 */