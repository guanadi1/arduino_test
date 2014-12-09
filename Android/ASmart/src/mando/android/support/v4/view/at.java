package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

class at
  implements bb
{
  public int a(View paramView)
  {
    return 2;
  }

  long a()
  {
    return 10L;
  }

  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidateDelayed(a(), paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(View paramView, int paramInt, Paint paramPaint)
  {
  }

  public void a(View paramView, Paint paramPaint)
  {
  }

  public void a(View paramView, a parama)
  {
  }

  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }

  public boolean a(View paramView, int paramInt)
  {
    return false;
  }

  public void b(View paramView)
  {
    paramView.postInvalidateDelayed(a());
  }

  public void b(View paramView, int paramInt)
  {
  }

  public int c(View paramView)
  {
    return 0;
  }

  public int d(View paramView)
  {
    return 0;
  }

  public int e(View paramView)
  {
    return 0;
  }

  public boolean f(View paramView)
  {
    Drawable localDrawable = paramView.getBackground();
    boolean bool = false;
    if (localDrawable != null)
    {
      int i = localDrawable.getOpacity();
      bool = false;
      if (i == -1)
        bool = true;
    }
    return bool;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.at
 * JD-Core Version:    0.6.2
 */