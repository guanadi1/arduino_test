package com.raon.aremotefreegalaxy;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class n
  implements Animation.AnimationListener
{
  n(l paraml)
  {
  }

  public void onAnimationEnd(Animation paramAnimation)
  {
    if (l.a(this.a) == o.a)
    {
      l.c(this.a).setVisibility(8);
      l.a(this.a, o.b);
      return;
    }
    l.d(this.a).setVisibility(8);
    l.a(this.a, o.a);
  }

  public void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public void onAnimationStart(Animation paramAnimation)
  {
    if (l.a(this.a) == o.a)
    {
      l.d(this.a).setVisibility(0);
      return;
    }
    l.c(this.a).setVisibility(0);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.n
 * JD-Core Version:    0.6.2
 */