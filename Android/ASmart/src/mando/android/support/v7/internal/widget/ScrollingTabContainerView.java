package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.support.v7.a.d;
import android.support.v7.b.b;
import android.support.v7.b.g;
import android.support.v7.internal.view.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ScrollingTabContainerView extends HorizontalScrollView
  implements n
{
  Runnable a;
  int b;
  int c;
  private ai d;
  private LinearLayout e;
  private aj f;
  private boolean g;
  private final LayoutInflater h;
  private int i;
  private int j;

  private ScrollingTabContainerView.TabView a(d paramd, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = (ScrollingTabContainerView.TabView)this.h.inflate(g.abc_action_bar_tab, this.e, false);
    localTabView.a(this, paramd, paramBoolean);
    if (paramBoolean)
    {
      localTabView.setBackgroundDrawable(null);
      localTabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
      return localTabView;
    }
    localTabView.setFocusable(true);
    if (this.d == null)
      this.d = new ai(this, null);
    localTabView.setOnClickListener(this.d);
    return localTabView;
  }

  private boolean a()
  {
    return (this.f != null) && (this.f.getParent() == this);
  }

  private void b()
  {
    if (a())
      return;
    if (this.f == null)
      this.f = d();
    removeView(this.e);
    addView(this.f, new ViewGroup.LayoutParams(-2, -1));
    if (this.f.d() == null)
      this.f.a(new ah(this, null));
    if (this.a != null)
    {
      removeCallbacks(this.a);
      this.a = null;
    }
    this.f.a(this.j);
  }

  private boolean c()
  {
    if (!a())
      return false;
    removeView(this.f);
    addView(this.e, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.f.f());
    return false;
  }

  private aj d()
  {
    aj localaj = new aj(getContext(), null, b.actionDropDownStyle);
    localaj.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    localaj.b(this);
    return localaj;
  }

  public void a(int paramInt)
  {
    View localView = this.e.getChildAt(paramInt);
    if (this.a != null)
      removeCallbacks(this.a);
    this.a = new ag(this, localView);
    post(this.a);
  }

  public void a(k paramk, View paramView, int paramInt, long paramLong)
  {
    ((ScrollingTabContainerView.TabView)paramView).getTab().d();
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null)
      post(this.a);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    a locala = a.a(getContext());
    setContentHeight(locala.e());
    this.c = locala.f();
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null)
      removeCallbacks(this.a);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 1;
    int m = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    label72: label87: int i1;
    if (m == 1073741824)
    {
      bool = k;
      setFillViewport(bool);
      int n = this.e.getChildCount();
      if ((n <= k) || ((m != 1073741824) && (m != -2147483648)))
        break label201;
      if (n <= 2)
        break label188;
      this.b = ((int)(0.4F * View.MeasureSpec.getSize(paramInt1)));
      this.b = Math.min(this.b, this.c);
      i1 = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
      if ((bool) || (!this.g))
        break label209;
      label110: if (k == 0)
        break label222;
      this.e.measure(0, i1);
      if (this.e.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1))
        break label214;
      b();
    }
    while (true)
    {
      int i2 = getMeasuredWidth();
      super.onMeasure(paramInt1, i1);
      int i3 = getMeasuredWidth();
      if ((bool) && (i2 != i3))
        setTabSelected(this.j);
      return;
      bool = false;
      break;
      label188: this.b = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label72;
      label201: this.b = -1;
      break label87;
      label209: k = 0;
      break label110;
      label214: c();
      continue;
      label222: c();
    }
  }

  public void setAllowCollapse(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public void setContentHeight(int paramInt)
  {
    this.i = paramInt;
    requestLayout();
  }

  public void setTabSelected(int paramInt)
  {
    this.j = paramInt;
    int k = this.e.getChildCount();
    int m = 0;
    if (m < k)
    {
      View localView = this.e.getChildAt(m);
      if (m == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        if (bool)
          a(paramInt);
        m++;
        break;
      }
    }
    if ((this.f != null) && (paramInt >= 0))
      this.f.a(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView
 * JD-Core Version:    0.6.2
 */