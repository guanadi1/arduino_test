package android.support.v4.view;

import android.view.View;

class bg
{
  public static void a(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }

  public static void a(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }

  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }

  public static int b(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bg
 * JD-Core Version:    0.6.2
 */