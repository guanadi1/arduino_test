package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.ah;
import android.support.v4.view.as;
import android.support.v4.view.p;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class DrawerLayout extends ViewGroup
{
  private static final int[] a = { 16842931 };
  private int b;
  private int c;
  private float d;
  private Paint e;
  private final af f;
  private final af g;
  private final j h;
  private final j i;
  private int j;
  private boolean k;
  private boolean l;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private g q;
  private float r;
  private float s;
  private Drawable t;
  private Drawable u;

  static String b(int paramInt)
  {
    if ((paramInt & 0x3) == 3)
      return "LEFT";
    if ((paramInt & 0x5) == 5)
      return "RIGHT";
    return Integer.toHexString(paramInt);
  }

  private boolean d()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
      if (((h)getChildAt(i2).getLayoutParams()).c)
        return true;
    return false;
  }

  private boolean e()
  {
    return f() != null;
  }

  private View f()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if ((g(localView)) && (j(localView)))
        return localView;
    }
    return null;
  }

  private static boolean k(View paramView)
  {
    Drawable localDrawable = paramView.getBackground();
    boolean bool = false;
    if (localDrawable != null)
    {
      int i1 = localDrawable.getOpacity();
      bool = false;
      if (i1 == -1)
        bool = true;
    }
    return bool;
  }

  public int a(View paramView)
  {
    int i1 = e(paramView);
    if (i1 == 3)
      return this.m;
    if (i1 == 5)
      return this.n;
    return 0;
  }

  View a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (((h)localView.getLayoutParams()).d)
        return localView;
    }
    return null;
  }

  View a(int paramInt)
  {
    int i1 = 0x7 & p.a(paramInt, as.e(this));
    int i2 = getChildCount();
    for (int i3 = 0; i3 < i2; i3++)
    {
      View localView = getChildAt(i3);
      if ((0x7 & e(localView)) == i1)
        return localView;
    }
    return null;
  }

  public void a(int paramInt1, int paramInt2)
  {
    int i1 = p.a(paramInt2, as.e(this));
    af localaf;
    if (i1 == 3)
    {
      this.m = paramInt1;
      if (paramInt1 != 0)
      {
        if (i1 != 3)
          break label78;
        localaf = this.f;
        label34: localaf.e();
      }
      switch (paramInt1)
      {
      default:
      case 2:
      case 1:
      }
    }
    label78: View localView1;
    do
    {
      View localView2;
      do
      {
        return;
        if (i1 != 5)
          break;
        this.n = paramInt1;
        break;
        localaf = this.g;
        break label34;
        localView2 = a(i1);
      }
      while (localView2 == null);
      h(localView2);
      return;
      localView1 = a(i1);
    }
    while (localView1 == null);
    i(localView1);
  }

  void a(int paramInt1, int paramInt2, View paramView)
  {
    int i1 = 1;
    int i2 = this.f.a();
    int i3 = this.g.a();
    h localh;
    if ((i2 == i1) || (i3 == i1))
      if ((paramView != null) && (paramInt2 == 0))
      {
        localh = (h)paramView.getLayoutParams();
        if (localh.b != 0.0F)
          break label125;
        b(paramView);
      }
    while (true)
    {
      if (i1 != this.j)
      {
        this.j = i1;
        if (this.q != null)
          this.q.a(i1);
      }
      return;
      if ((i2 == 2) || (i3 == 2))
      {
        i1 = 2;
        break;
      }
      i1 = 0;
      break;
      label125: if (localh.b == 1.0F)
        c(paramView);
    }
  }

  void a(View paramView, float paramFloat)
  {
    if (this.q != null)
      this.q.a(paramView, paramFloat);
  }

  void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool = false;
    while (i2 < i1)
    {
      View localView = getChildAt(i2);
      h localh = (h)localView.getLayoutParams();
      if ((!g(localView)) || ((paramBoolean) && (!localh.c)))
      {
        i2++;
      }
      else
      {
        int i3 = localView.getWidth();
        if (a(localView, 3))
          bool |= this.f.a(localView, -i3, localView.getTop());
        while (true)
        {
          localh.c = false;
          break;
          bool |= this.g.a(localView, getWidth(), localView.getTop());
        }
      }
    }
    this.h.a();
    this.i.a();
    if (bool)
      invalidate();
  }

  boolean a(View paramView, int paramInt)
  {
    return (paramInt & e(paramView)) == paramInt;
  }

  public void b()
  {
    a(false);
  }

  void b(View paramView)
  {
    h localh = (h)paramView.getLayoutParams();
    if (localh.d)
    {
      localh.d = false;
      if (this.q != null)
        this.q.b(paramView);
      sendAccessibilityEvent(32);
    }
  }

  void b(View paramView, float paramFloat)
  {
    h localh = (h)paramView.getLayoutParams();
    if (paramFloat == localh.b)
      return;
    localh.b = paramFloat;
    a(paramView, paramFloat);
  }

  void c(View paramView)
  {
    h localh = (h)paramView.getLayoutParams();
    if (!localh.d)
    {
      localh.d = true;
      if (this.q != null)
        this.q.a(paramView);
      paramView.sendAccessibilityEvent(32);
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof h)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    int i1 = getChildCount();
    float f1 = 0.0F;
    for (int i2 = 0; i2 < i1; i2++)
      f1 = Math.max(f1, ((h)getChildAt(i2).getLayoutParams()).b);
    this.d = f1;
    if ((this.f.a(true) | this.g.a(true)))
      as.b(this);
  }

  float d(View paramView)
  {
    return ((h)paramView.getLayoutParams()).b;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = f(paramView);
    int i2 = getWidth();
    int i3 = paramCanvas.save();
    int i4 = 0;
    View localView;
    int i16;
    int i17;
    if (bool1)
    {
      int i14 = getChildCount();
      int i15 = 0;
      while (true)
        if (i15 < i14)
        {
          localView = getChildAt(i15);
          if ((localView != paramView) && (localView.getVisibility() == 0) && (k(localView)) && (g(localView)))
          {
            if (localView.getHeight() < i1)
            {
              i16 = i2;
              i15++;
              i2 = i16;
              continue;
            }
            if (a(localView, 3))
            {
              i17 = localView.getRight();
              if (i17 <= i4)
                break label494;
            }
          }
        }
    }
    while (true)
    {
      i4 = i17;
      i16 = i2;
      break;
      i16 = localView.getLeft();
      if (i16 < i2)
        break;
      i16 = i2;
      break;
      paramCanvas.clipRect(i4, 0, i2, getHeight());
      int i5 = i2;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i3);
      if ((this.d > 0.0F) && (bool1))
      {
        int i13 = (int)(((0xFF000000 & this.c) >>> 24) * this.d) << 24 | 0xFFFFFF & this.c;
        this.e.setColor(i13);
        paramCanvas.drawRect(i4, 0.0F, i5, getHeight(), this.e);
      }
      do
      {
        return bool2;
        if ((this.t != null) && (a(paramView, 3)))
        {
          int i10 = this.t.getIntrinsicWidth();
          int i11 = paramView.getRight();
          int i12 = this.f.b();
          float f2 = Math.max(0.0F, Math.min(i11 / i12, 1.0F));
          this.t.setBounds(i11, paramView.getTop(), i10 + i11, paramView.getBottom());
          this.t.setAlpha((int)(255.0F * f2));
          this.t.draw(paramCanvas);
          return bool2;
        }
      }
      while ((this.u == null) || (!a(paramView, 5)));
      int i6 = this.u.getIntrinsicWidth();
      int i7 = paramView.getLeft();
      int i8 = getWidth() - i7;
      int i9 = this.g.b();
      float f1 = Math.max(0.0F, Math.min(i8 / i9, 1.0F));
      this.u.setBounds(i7 - i6, paramView.getTop(), i7, paramView.getBottom());
      this.u.setAlpha((int)(255.0F * f1));
      this.u.draw(paramCanvas);
      return bool2;
      label494: i17 = i4;
    }
  }

  int e(View paramView)
  {
    return p.a(((h)paramView.getLayoutParams()).a, as.e(this));
  }

  boolean f(View paramView)
  {
    return ((h)paramView.getLayoutParams()).a == 0;
  }

  boolean g(View paramView)
  {
    return (0x7 & p.a(((h)paramView.getLayoutParams()).a, as.e(paramView))) != 0;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new h(-1, -1);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new h(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof h))
      return new h((h)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new h((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new h(paramLayoutParams);
  }

  public void h(View paramView)
  {
    if (!g(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    if (this.l)
    {
      h localh = (h)paramView.getLayoutParams();
      localh.b = 1.0F;
      localh.d = true;
    }
    while (true)
    {
      invalidate();
      return;
      if (a(paramView, 3))
        this.f.a(paramView, 0, paramView.getTop());
      else
        this.g.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
    }
  }

  public void i(View paramView)
  {
    if (!g(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    if (this.l)
    {
      h localh = (h)paramView.getLayoutParams();
      localh.b = 0.0F;
      localh.d = false;
    }
    while (true)
    {
      invalidate();
      return;
      if (a(paramView, 3))
        this.f.a(paramView, -paramView.getWidth(), paramView.getTop());
      else
        this.g.a(paramView, getWidth(), paramView.getTop());
    }
  }

  public boolean j(View paramView)
  {
    if (!g(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    return ((h)paramView.getLayoutParams()).b > 0.0F;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.l = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.l = true;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ah.a(paramMotionEvent);
    boolean bool1 = this.f.a(paramMotionEvent) | this.g.a(paramMotionEvent);
    switch (i1)
    {
    default:
      i2 = 0;
      boolean bool2;
      if ((!bool1) && (i2 == 0) && (!d()))
      {
        boolean bool3 = this.p;
        bool2 = false;
        if (!bool3);
      }
      else
      {
        bool2 = true;
      }
      return bool2;
    case 0:
      label59: float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.r = f1;
      this.s = f2;
      if ((this.d <= 0.0F) || (!f(this.f.d((int)f1, (int)f2))))
        break;
    case 2:
    case 1:
    case 3:
    }
    for (int i2 = 1; ; i2 = 0)
    {
      this.o = false;
      this.p = false;
      break label59;
      if (!this.f.c(3))
        break;
      this.h.a();
      this.i.a();
      i2 = 0;
      break label59;
      a(true);
      this.o = false;
      this.p = false;
      break;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (e()))
    {
      u.b(paramKeyEvent);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      View localView = f();
      if ((localView != null) && (a(localView) == 0))
        b();
      return localView != null;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.k = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    int i3 = 0;
    if (i3 < i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 8);
      h localh;
      while (true)
      {
        i3++;
        break;
        localh = (h)localView.getLayoutParams();
        if (!f(localView))
          break label110;
        localView.layout(localh.leftMargin, localh.topMargin, localh.leftMargin + localView.getMeasuredWidth(), localh.topMargin + localView.getMeasuredHeight());
      }
      label110: int i4 = localView.getMeasuredWidth();
      int i5 = localView.getMeasuredHeight();
      int i6;
      float f1;
      label162: int i7;
      if (a(localView, 3))
      {
        i6 = -i4 + (int)(i4 * localh.b);
        f1 = (i4 + i6) / i4;
        if (f1 == localh.b)
          break label313;
        i7 = 1;
        label176: switch (0x70 & localh.a)
        {
        default:
          localView.layout(i6, localh.topMargin, i4 + i6, i5 + localh.topMargin);
          label237: if (i7 != 0)
            b(localView, f1);
          if (localh.b <= 0.0F)
            break;
        case 80:
        case 16:
        }
      }
      for (int i10 = 0; localView.getVisibility() != i10; i10 = 4)
      {
        localView.setVisibility(i10);
        break;
        i6 = i1 - (int)(i4 * localh.b);
        f1 = (i1 - i6) / i4;
        break label162;
        label313: i7 = 0;
        break label176;
        int i11 = paramInt4 - paramInt2;
        localView.layout(i6, i11 - localh.bottomMargin - localView.getMeasuredHeight(), i4 + i6, i11 - localh.bottomMargin);
        break label237;
        int i8 = paramInt4 - paramInt2;
        int i9 = (i8 - i5) / 2;
        if (i9 < localh.topMargin)
          i9 = localh.topMargin;
        while (true)
        {
          localView.layout(i6, i9, i4 + i6, i5 + i9);
          break;
          if (i9 + i5 > i8 - localh.bottomMargin)
            i9 = i8 - localh.bottomMargin - i5;
        }
      }
    }
    this.k = false;
    this.l = false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 300;
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt1);
    int i5 = View.MeasureSpec.getSize(paramInt2);
    label70: int i7;
    label86: View localView;
    if ((i2 != 1073741824) || (i3 != 1073741824))
    {
      if (!isInEditMode())
        break label139;
      if (i2 == -2147483648)
      {
        if (i3 != -2147483648)
          break label128;
        i1 = i5;
        setMeasuredDimension(i4, i1);
        int i6 = getChildCount();
        i7 = 0;
        if (i7 >= i6)
          return;
        localView = getChildAt(i7);
        if (localView.getVisibility() != 8)
          break label150;
      }
    }
    while (true)
    {
      i7++;
      break label86;
      if (i2 != 0)
        break;
      i4 = i1;
      break;
      label128: if (i3 == 0)
        break label70;
      i1 = i5;
      break label70;
      label139: throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
      label150: h localh = (h)localView.getLayoutParams();
      if (f(localView))
      {
        localView.measure(View.MeasureSpec.makeMeasureSpec(i4 - localh.leftMargin - localh.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - localh.topMargin - localh.bottomMargin, 1073741824));
      }
      else
      {
        if (!g(localView))
          break label352;
        int i8 = 0x7 & e(localView);
        if ((0x0 & i8) != 0)
          throw new IllegalStateException("Child drawer has absolute gravity " + b(i8) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
        localView.measure(getChildMeasureSpec(paramInt1, this.b + localh.leftMargin + localh.rightMargin, localh.width), getChildMeasureSpec(paramInt2, localh.topMargin + localh.bottomMargin, localh.height));
      }
    }
    label352: throw new IllegalStateException("Child " + localView + " at index " + i7 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    DrawerLayout.SavedState localSavedState = (DrawerLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a != 0)
    {
      View localView = a(localSavedState.a);
      if (localView != null)
        h(localView);
    }
    a(localSavedState.b, 3);
    a(localSavedState.c, 5);
  }

  protected Parcelable onSaveInstanceState()
  {
    DrawerLayout.SavedState localSavedState = new DrawerLayout.SavedState(super.onSaveInstanceState());
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      if (!g(localView));
      h localh;
      do
      {
        i2++;
        break;
        localh = (h)localView.getLayoutParams();
      }
      while (!localh.d);
      localSavedState.a = localh.a;
    }
    localSavedState.b = this.m;
    localSavedState.c = this.n;
    return localSavedState;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.f.b(paramMotionEvent);
    this.g.b(paramMotionEvent);
    boolean bool;
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 2:
    default:
      return true;
    case 0:
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.r = f5;
      this.s = f6;
      this.o = false;
      this.p = false;
      return true;
    case 1:
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      View localView1 = this.f.d((int)f1, (int)f2);
      if ((localView1 != null) && (f(localView1)))
      {
        float f3 = f1 - this.r;
        float f4 = f2 - this.s;
        int i1 = this.f.d();
        if (f3 * f3 + f4 * f4 < i1 * i1)
        {
          View localView2 = a();
          if (localView2 != null)
            if (a(localView2) == 2)
              bool = true;
        }
      }
      break;
    case 3:
    }
    while (true)
    {
      a(bool);
      this.o = false;
      return true;
      bool = false;
      continue;
      a(true);
      this.o = false;
      this.p = false;
      return true;
      bool = true;
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.o = paramBoolean;
    if (paramBoolean)
      a(true);
  }

  public void requestLayout()
  {
    if (!this.k)
      super.requestLayout();
  }

  public void setDrawerListener(g paramg)
  {
    this.q = paramg;
  }

  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }

  public void setScrimColor(int paramInt)
  {
    this.c = paramInt;
    invalidate();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.DrawerLayout
 * JD-Core Version:    0.6.2
 */