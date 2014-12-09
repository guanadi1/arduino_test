package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;

abstract class AbsSpinnerICS extends k
{
  private DataSetObserver E;
  SpinnerAdapter a;
  int b;
  int c;
  boolean d;
  int e = 0;
  int f = 0;
  int g = 0;
  int h = 0;
  final Rect i = new Rect();
  final d j = new d(this);

  AbsSpinnerICS(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    o();
  }

  private void o()
  {
    setFocusable(true);
    setWillNotDraw(false);
  }

  int a(View paramView)
  {
    return paramView.getMeasuredHeight();
  }

  void a()
  {
    this.u = false;
    this.p = false;
    removeAllViewsInLayout();
    this.B = -1;
    this.C = -9223372036854775808L;
    c(-1);
    d(-1);
    invalidate();
  }

  public void a(int paramInt)
  {
    d(paramInt);
    requestLayout();
    invalidate();
  }

  abstract void a(int paramInt, boolean paramBoolean);

  public void a(SpinnerAdapter paramSpinnerAdapter)
  {
    int k = -1;
    if (this.a != null)
    {
      this.a.unregisterDataSetObserver(this.E);
      a();
    }
    this.a = paramSpinnerAdapter;
    this.B = k;
    this.C = -9223372036854775808L;
    if (this.a != null)
    {
      this.A = this.z;
      this.z = this.a.getCount();
      i();
      this.E = new m(this);
      this.a.registerDataSetObserver(this.E);
      if (this.z > 0)
        k = 0;
      c(k);
      d(k);
      if (this.z == 0)
        l();
    }
    while (true)
    {
      requestLayout();
      return;
      i();
      a();
      l();
    }
  }

  int b(View paramView)
  {
    return paramView.getMeasuredWidth();
  }

  void b()
  {
    int k = getChildCount();
    d locald = this.j;
    int m = this.k;
    for (int n = 0; n < k; n++)
    {
      View localView = getChildAt(n);
      locald.a(m + n, localView);
    }
  }

  public View c()
  {
    if ((this.z > 0) && (this.x >= 0))
      return getChildAt(this.x - this.k);
    return null;
  }

  public SpinnerAdapter d()
  {
    return this.a;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.LayoutParams(-1, -2);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = View.MeasureSpec.getMode(paramInt1);
    int m = getPaddingLeft();
    int n = getPaddingTop();
    int i1 = getPaddingRight();
    int i2 = getPaddingBottom();
    Rect localRect1 = this.i;
    int i3;
    label70: int i4;
    label96: int i5;
    label122: int i9;
    int i8;
    int i7;
    if (m > this.e)
    {
      localRect1.left = m;
      Rect localRect2 = this.i;
      if (n <= this.f)
        break label415;
      i3 = n;
      localRect2.top = i3;
      Rect localRect3 = this.i;
      if (i1 <= this.g)
        break label424;
      i4 = i1;
      localRect3.right = i4;
      Rect localRect4 = this.i;
      if (i2 <= this.h)
        break label433;
      i5 = i2;
      localRect4.bottom = i5;
      if (this.u)
        k();
      int i6 = f();
      if ((i6 < 0) || (this.a == null) || (i6 >= this.a.getCount()))
        break label442;
      View localView = this.j.a(i6);
      if (localView == null)
        localView = this.a.getView(i6, null, this);
      if (localView != null)
        this.j.a(i6, localView);
      if (localView == null)
        break label442;
      if (localView.getLayoutParams() == null)
      {
        this.d = true;
        localView.setLayoutParams(generateDefaultLayoutParams());
        this.d = false;
      }
      measureChild(localView, paramInt1, paramInt2);
      i9 = a(localView) + this.i.top + this.i.bottom;
      i8 = b(localView) + this.i.left + this.i.right;
      i7 = 0;
    }
    while (true)
    {
      if (i7 != 0)
      {
        i9 = this.i.top + this.i.bottom;
        if (k == 0)
          i8 = this.i.left + this.i.right;
      }
      int i10 = Math.max(i9, getSuggestedMinimumHeight());
      int i11 = Math.max(i8, getSuggestedMinimumWidth());
      int i12 = resolveSize(i10, paramInt2);
      setMeasuredDimension(resolveSize(i11, paramInt1), i12);
      this.b = paramInt2;
      this.c = paramInt1;
      return;
      m = this.e;
      break;
      label415: i3 = this.f;
      break label70;
      label424: i4 = this.g;
      break label96;
      label433: i5 = this.h;
      break label122;
      label442: i7 = 1;
      i8 = 0;
      i9 = 0;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AbsSpinnerICS.SavedState localSavedState = (AbsSpinnerICS.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a >= 0L)
    {
      this.u = true;
      this.p = true;
      this.n = localSavedState.a;
      this.m = localSavedState.b;
      this.q = 0;
      requestLayout();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    AbsSpinnerICS.SavedState localSavedState = new AbsSpinnerICS.SavedState(super.onSaveInstanceState());
    localSavedState.a = g();
    if (localSavedState.a >= 0L)
    {
      localSavedState.b = f();
      return localSavedState;
    }
    localSavedState.b = -1;
    return localSavedState;
  }

  public void requestLayout()
  {
    if (!this.d)
      super.requestLayout();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.AbsSpinnerICS
 * JD-Core Version:    0.6.2
 */