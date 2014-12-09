package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class be
{
  public static int a(View paramView)
  {
    return paramView.getLayerType();
  }

  static long a()
  {
    return ValueAnimator.getFrameDelay();
  }

  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.be
 * JD-Core Version:    0.6.2
 */