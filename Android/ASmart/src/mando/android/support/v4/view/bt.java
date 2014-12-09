package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.w;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class bt extends a
{
  bt(ViewPager paramViewPager)
  {
  }

  private boolean b()
  {
    return (ViewPager.a(this.b) != null) && (ViewPager.a(this.b).a() > 1);
  }

  public void a(View paramView, android.support.v4.view.a.a parama)
  {
    super.a(paramView, parama);
    parama.a(ViewPager.class.getName());
    parama.a(b());
    if (this.b.canScrollHorizontally(1))
      parama.a(4096);
    if (this.b.canScrollHorizontally(-1))
      parama.a(8192);
  }

  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 4096:
      if (this.b.canScrollHorizontally(1))
      {
        this.b.setCurrentItem(1 + ViewPager.b(this.b));
        return true;
      }
      return false;
    case 8192:
    }
    if (this.b.canScrollHorizontally(-1))
    {
      this.b.setCurrentItem(-1 + ViewPager.b(this.b));
      return true;
    }
    return false;
  }

  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    w localw = w.a();
    localw.a(b());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.a(this.b) != null))
    {
      localw.a(ViewPager.a(this.b).a());
      localw.b(ViewPager.b(this.b));
      localw.c(ViewPager.b(this.b));
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bt
 * JD-Core Version:    0.6.2
 */