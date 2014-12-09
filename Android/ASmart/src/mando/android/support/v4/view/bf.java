package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class bf
{
  public static void a(View paramView, Object paramObject)
  {
    paramView.setAccessibilityDelegate((View.AccessibilityDelegate)paramObject);
  }

  public static boolean a(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bf
 * JD-Core Version:    0.6.2
 */