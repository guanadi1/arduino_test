package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public abstract interface j
{
  public abstract void a(View paramView, int paramInt);

  public abstract void a(View paramView, Object paramObject);

  public abstract boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract void b(View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract void c(View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract void d(View paramView, AccessibilityEvent paramAccessibilityEvent);
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.j
 * JD-Core Version:    0.6.2
 */