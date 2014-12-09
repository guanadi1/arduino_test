package android.support.v7.internal.widget;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

abstract class k extends ViewGroup
{
  int A;
  int B = -1;
  long C = -9223372036854775808L;
  boolean D = false;
  private int a;
  private View b;
  private boolean c;
  private boolean d;
  private q e;

  @ViewDebug.ExportedProperty(category="scrolling")
  int k = 0;
  int l;
  int m;
  long n = -9223372036854775808L;
  long o;
  boolean p = false;
  int q;
  boolean r = false;
  p s;
  n t;
  boolean u;

  @ViewDebug.ExportedProperty(category="list")
  int v = -1;
  long w = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  int x = -1;
  long y = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  int z;

  k(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a()
  {
    if (this.s == null)
      return;
    int i = f();
    if (i >= 0)
    {
      View localView = c();
      this.s.a(this, localView, i, e().getItemId(i));
      return;
    }
    this.s.a(this);
  }

  private void a(boolean paramBoolean)
  {
    if (h())
      paramBoolean = false;
    if (paramBoolean)
    {
      if (this.b != null)
      {
        this.b.setVisibility(0);
        setVisibility(8);
      }
      while (true)
      {
        if (this.u)
          onLayout(false, getLeft(), getTop(), getRight(), getBottom());
        return;
        setVisibility(0);
      }
    }
    if (this.b != null)
      this.b.setVisibility(8);
    setVisibility(0);
  }

  public void a(n paramn)
  {
    this.t = paramn;
  }

  public void a(p paramp)
  {
    this.s = paramp;
  }

  public boolean a(View paramView, int paramInt, long paramLong)
  {
    n localn = this.t;
    boolean bool = false;
    if (localn != null)
    {
      playSoundEffect(0);
      if (paramView != null)
        paramView.sendAccessibilityEvent(1);
      this.t.a(this, paramView, paramInt, paramLong);
      bool = true;
    }
    return bool;
  }

  public void addView(View paramView)
  {
    throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
  }

  public void addView(View paramView, int paramInt)
  {
    throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
  }

  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
  }

  int b(int paramInt, boolean paramBoolean)
  {
    return paramInt;
  }

  public long b(int paramInt)
  {
    Adapter localAdapter = e();
    if ((localAdapter == null) || (paramInt < 0))
      return -9223372036854775808L;
    return localAdapter.getItemId(paramInt);
  }

  public abstract View c();

  void c(int paramInt)
  {
    this.x = paramInt;
    this.y = b(paramInt);
  }

  protected boolean canAnimate()
  {
    return (super.canAnimate()) && (this.z > 0);
  }

  void d(int paramInt)
  {
    this.v = paramInt;
    this.w = b(paramInt);
    if ((this.p) && (this.q == 0) && (paramInt >= 0))
    {
      this.m = paramInt;
      this.n = this.w;
    }
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    View localView = c();
    return (localView != null) && (localView.getVisibility() == 0) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent));
  }

  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }

  public abstract Adapter e();

  @ViewDebug.CapturedViewProperty
  public int f()
  {
    return this.v;
  }

  @ViewDebug.CapturedViewProperty
  public long g()
  {
    return this.w;
  }

  boolean h()
  {
    return false;
  }

  void i()
  {
    Adapter localAdapter = e();
    int i;
    int j;
    label33: boolean bool1;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      i = 1;
      if ((i != 0) && (!h()))
        break label115;
      j = 1;
      if ((j == 0) || (!this.d))
        break label120;
      bool1 = true;
      label47: super.setFocusableInTouchMode(bool1);
      if ((j == 0) || (!this.c))
        break label126;
    }
    label115: label120: label126: for (boolean bool2 = true; ; bool2 = false)
    {
      super.setFocusable(bool2);
      if (this.b != null)
      {
        boolean bool3;
        if (localAdapter != null)
        {
          boolean bool4 = localAdapter.isEmpty();
          bool3 = false;
          if (!bool4);
        }
        else
        {
          bool3 = true;
        }
        a(bool3);
      }
      return;
      i = 0;
      break;
      j = 0;
      break label33;
      bool1 = false;
      break label47;
    }
  }

  void j()
  {
    if (this.s != null)
    {
      if ((!this.r) && (!this.D))
        break label78;
      if (this.e == null)
        this.e = new q(this, null);
      post(this.e);
    }
    while (true)
    {
      if ((this.x != -1) && (isShown()) && (!isInTouchMode()))
        sendAccessibilityEvent(4);
      return;
      label78: a();
    }
  }

  void k()
  {
    int i = this.z;
    int i1;
    int i3;
    int i4;
    label104: int j;
    if (i > 0)
      if (this.p)
      {
        this.p = false;
        int i5 = m();
        if ((i5 >= 0) && (b(i5, true) == i5))
        {
          d(i5);
          i1 = 1;
          if (i1 == 0)
          {
            int i2 = f();
            if (i2 >= i)
              i2 = i - 1;
            if (i2 < 0)
              i2 = 0;
            i3 = b(i2, true);
            if (i3 >= 0)
              break label164;
            i4 = b(i2, false);
            if (i4 >= 0)
            {
              d(i4);
              l();
              j = 1;
            }
          }
        }
      }
    while (true)
    {
      if (j == 0)
      {
        this.x = -1;
        this.y = -9223372036854775808L;
        this.v = -1;
        this.w = -9223372036854775808L;
        this.p = false;
        l();
      }
      return;
      j = i1;
      continue;
      label164: i4 = i3;
      break label104;
      i1 = 0;
      break;
      j = 0;
    }
  }

  void l()
  {
    if ((this.x != this.B) || (this.y != this.C))
    {
      j();
      this.B = this.x;
      this.C = this.y;
    }
  }

  int m()
  {
    int i = this.z;
    int i5;
    if (i == 0)
    {
      i5 = -1;
      return i5;
    }
    long l1 = this.n;
    int j = this.m;
    if (l1 == -9223372036854775808L)
      return -1;
    int i1 = Math.max(0, j);
    int i2 = Math.min(i - 1, i1);
    long l2 = 100L + SystemClock.uptimeMillis();
    Adapter localAdapter = e();
    label76: int i8;
    int i6;
    int i7;
    int i3;
    if (localAdapter == null)
    {
      return -1;
      if ((i8 != 0) || ((i6 != 0) && (i7 == 0)))
      {
        int i9 = i3 + 1;
        i3 = i9;
        i5 = i9;
        i6 = 0;
      }
    }
    while (true)
    {
      int i4;
      if (SystemClock.uptimeMillis() <= l2)
      {
        if (localAdapter.getItemId(i5) == l1)
          break;
        if (i3 != i - 1)
          break label162;
        i7 = 1;
        if (i4 != 0)
          break label168;
      }
      label162: label168: for (i8 = 1; ; i8 = 0)
      {
        if ((i7 == 0) || (i8 == 0))
          break label172;
        return -1;
        i7 = 0;
        break;
      }
      label172: break label76;
      if ((i7 != 0) || ((i6 == 0) && (i8 == 0)))
      {
        int i10 = i4 - 1;
        i4 = i10;
        i5 = i10;
        i6 = 1;
        continue;
        i3 = i2;
        i4 = i2;
        i5 = i2;
        i6 = 0;
      }
    }
  }

  void n()
  {
    if (getChildCount() > 0)
    {
      this.p = true;
      this.o = this.a;
      if (this.x >= 0)
      {
        View localView2 = getChildAt(this.x - this.k);
        this.n = this.w;
        this.m = this.v;
        if (localView2 != null)
          this.l = localView2.getTop();
        this.q = 0;
      }
    }
    else
    {
      return;
    }
    View localView1 = getChildAt(0);
    Adapter localAdapter = e();
    if ((this.k >= 0) && (this.k < localAdapter.getCount()));
    for (this.n = localAdapter.getItemId(this.k); ; this.n = -1L)
    {
      this.m = this.k;
      if (localView1 != null)
        this.l = localView1.getTop();
      this.q = 1;
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.e);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = getHeight();
  }

  public void removeAllViews()
  {
    throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
  }

  public void removeView(View paramView)
  {
    throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
  }

  public void removeViewAt(int paramInt)
  {
    throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
  }

  public void setFocusable(boolean paramBoolean)
  {
    boolean bool1 = true;
    Adapter localAdapter = e();
    boolean bool2;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      bool2 = bool1;
      this.c = paramBoolean;
      if (!paramBoolean)
        this.d = false;
      if ((!paramBoolean) || ((bool2) && (!h())))
        break label65;
    }
    while (true)
    {
      super.setFocusable(bool1);
      return;
      bool2 = false;
      break;
      label65: bool1 = false;
    }
  }

  public void setFocusableInTouchMode(boolean paramBoolean)
  {
    boolean bool1 = true;
    Adapter localAdapter = e();
    boolean bool2;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      bool2 = bool1;
      this.d = paramBoolean;
      if (paramBoolean)
        this.c = bool1;
      if ((!paramBoolean) || ((bool2) && (!h())))
        break label65;
    }
    while (true)
    {
      super.setFocusableInTouchMode(bool1);
      return;
      bool2 = false;
      break;
      label65: bool1 = false;
    }
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.k
 * JD-Core Version:    0.6.2
 */