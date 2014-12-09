package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class aw extends av
{
  long a()
  {
    return be.a();
  }

  public void a(View paramView, int paramInt, Paint paramPaint)
  {
    be.a(paramView, paramInt, paramPaint);
  }

  public void a(View paramView, Paint paramPaint)
  {
    a(paramView, d(paramView), paramPaint);
    paramView.invalidate();
  }

  public int d(View paramView)
  {
    return be.a(paramView);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.aw
 * JD-Core Version:    0.6.2
 */