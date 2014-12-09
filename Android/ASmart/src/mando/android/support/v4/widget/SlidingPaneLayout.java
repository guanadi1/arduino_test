package android.support.v4.widget;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.ah;
import android.support.v4.view.as;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup
{
  static final ab a = new ac();
  private int b;
  private int c;
  private Drawable d;
  private final int e;
  private boolean f;
  private View g;
  private float h;
  private float i;
  private int j;
  private boolean k;
  private int l;
  private float m;
  private float n;
  private z o;
  private final af p;
  private boolean q;
  private boolean r;
  private final Rect s;
  private final ArrayList t;

  static
  {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= 17)
    {
      a = new ae();
      return;
    }
    if (i1 >= 16)
    {
      a = new ad();
      return;
    }
  }

  private void a(float paramFloat)
  {
    int i1 = 0;
    y localy = (y)this.g.getLayoutParams();
    int i2;
    label36: View localView;
    if ((localy.c) && (localy.leftMargin <= 0))
    {
      i2 = 1;
      int i3 = getChildCount();
      if (i1 >= i3)
        return;
      localView = getChildAt(i1);
      if (localView != this.g)
        break label70;
    }
    while (true)
    {
      i1++;
      break label36;
      i2 = 0;
      break;
      label70: int i4 = (int)((1.0F - this.i) * this.l);
      this.i = paramFloat;
      localView.offsetLeftAndRight(i4 - (int)((1.0F - paramFloat) * this.l));
      if (i2 != 0)
        a(localView, 1.0F - this.i, this.c);
    }
  }

  private void a(View paramView, float paramFloat, int paramInt)
  {
    y localy = (y)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i1 = (int)(paramFloat * ((0xFF000000 & paramInt) >>> 24)) << 24 | 0xFFFFFF & paramInt;
      if (localy.d == null)
        localy.d = new Paint();
      localy.d.setColorFilter(new PorterDuffColorFilter(i1, PorterDuff.Mode.SRC_OVER));
      if (as.d(paramView) != 2)
        as.a(paramView, 2, localy.d);
      d(paramView);
    }
    while (as.d(paramView) == 0)
    {
      int i1;
      return;
    }
    if (localy.d != null)
      localy.d.setColorFilter(null);
    x localx = new x(this, paramView);
    this.t.add(localx);
    as.a(this, localx);
  }

  private boolean a(View paramView, int paramInt)
  {
    boolean bool1;
    if (!this.r)
    {
      boolean bool2 = a(0.0F, paramInt);
      bool1 = false;
      if (!bool2);
    }
    else
    {
      this.q = false;
      bool1 = true;
    }
    return bool1;
  }

  private boolean b(View paramView, int paramInt)
  {
    if ((this.r) || (a(1.0F, paramInt)))
    {
      this.q = true;
      return true;
    }
    return false;
  }

  private static boolean c(View paramView)
  {
    if (as.f(paramView));
    Drawable localDrawable;
    do
    {
      return true;
      if (Build.VERSION.SDK_INT >= 18)
        return false;
      localDrawable = paramView.getBackground();
      if (localDrawable == null)
        break;
    }
    while (localDrawable.getOpacity() == -1);
    return false;
    return false;
  }

  private void d(View paramView)
  {
    a.a(this, paramView);
  }

  void a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 4)
        localView.setVisibility(0);
    }
  }

  void a(View paramView)
  {
    int i1 = getPaddingLeft();
    int i2 = getWidth() - getPaddingRight();
    int i3 = getPaddingTop();
    int i4 = getHeight() - getPaddingBottom();
    int i8;
    int i7;
    int i6;
    int i5;
    if ((paramView != null) && (c(paramView)))
    {
      i8 = paramView.getLeft();
      i7 = paramView.getRight();
      i6 = paramView.getTop();
      i5 = paramView.getBottom();
    }
    int i10;
    View localView;
    while (true)
    {
      int i9 = getChildCount();
      i10 = 0;
      if (i10 < i9)
      {
        localView = getChildAt(i10);
        if (localView != paramView)
          break;
      }
      return;
      i5 = 0;
      i6 = 0;
      i7 = 0;
      i8 = 0;
    }
    int i11 = Math.max(i1, localView.getLeft());
    int i12 = Math.max(i3, localView.getTop());
    int i13 = Math.min(i2, localView.getRight());
    int i14 = Math.min(i4, localView.getBottom());
    if ((i11 >= i8) && (i12 >= i6) && (i13 <= i7) && (i14 <= i5));
    for (int i15 = 4; ; i15 = 0)
    {
      localView.setVisibility(i15);
      i10++;
      break;
    }
  }

  boolean a(float paramFloat, int paramInt)
  {
    if (!this.f)
      return false;
    y localy = (y)this.g.getLayoutParams();
    int i1 = (int)(getPaddingLeft() + localy.leftMargin + paramFloat * this.j);
    if (this.p.a(this.g, i1, this.g.getTop()))
    {
      a();
      as.b(this);
      return true;
    }
    return false;
  }

  public boolean b()
  {
    return b(this.g, 0);
  }

  boolean b(View paramView)
  {
    if (paramView == null)
      return false;
    y localy = (y)paramView.getLayoutParams();
    if ((this.f) && (localy.c) && (this.h > 0.0F));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean c()
  {
    return a(this.g, 0);
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof y)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    if (this.p.a(true))
    {
      if (!this.f)
        this.p.f();
    }
    else
      return;
    as.b(this);
  }

  public boolean d()
  {
    return (!this.f) || (this.h == 1.0F);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (getChildCount() > 1);
    for (View localView = getChildAt(1); (localView == null) || (this.d == null); localView = null)
      return;
    int i1 = this.d.getIntrinsicWidth();
    int i2 = localView.getLeft();
    int i3 = localView.getTop();
    int i4 = localView.getBottom();
    int i5 = i2 - i1;
    this.d.setBounds(i5, i3, i2, i4);
    this.d.draw(paramCanvas);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    y localy = (y)paramView.getLayoutParams();
    int i1 = paramCanvas.save(2);
    if ((this.f) && (!localy.b) && (this.g != null))
    {
      paramCanvas.getClipBounds(this.s);
      this.s.right = Math.min(this.s.right, this.g.getLeft());
      paramCanvas.clipRect(this.s);
    }
    boolean bool;
    if (Build.VERSION.SDK_INT >= 11)
      bool = super.drawChild(paramCanvas, paramView, paramLong);
    while (true)
    {
      paramCanvas.restoreToCount(i1);
      return bool;
      if ((localy.c) && (this.h > 0.0F))
      {
        if (!paramView.isDrawingCacheEnabled())
          paramView.setDrawingCacheEnabled(true);
        Bitmap localBitmap = paramView.getDrawingCache();
        if (localBitmap != null)
        {
          paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localy.d);
          bool = false;
        }
        else
        {
          Log.e("SlidingPaneLayout", "drawChild: child view " + paramView + " returned null drawing cache");
          bool = super.drawChild(paramCanvas, paramView, paramLong);
        }
      }
      else
      {
        if (paramView.isDrawingCacheEnabled())
          paramView.setDrawingCacheEnabled(false);
        bool = super.drawChild(paramCanvas, paramView, paramLong);
      }
    }
  }

  public boolean e()
  {
    return this.f;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new y();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new y(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new y((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new y(paramLayoutParams);
  }

  public int getCoveredFadeColor()
  {
    return this.c;
  }

  public int getParallaxDistance()
  {
    return this.l;
  }

  public int getSliderFadeColor()
  {
    return this.b;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.r = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.r = true;
    int i1 = this.t.size();
    for (int i2 = 0; i2 < i1; i2++)
      ((x)this.t.get(i2)).run();
    this.t.clear();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ah.a(paramMotionEvent);
    if ((!this.f) && (i1 == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null)
        if (this.p.b(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          break label100;
    }
    boolean bool1;
    label100: for (boolean bool2 = true; ; bool2 = false)
    {
      this.q = bool2;
      if ((this.f) && ((!this.k) || (i1 == 0)))
        break;
      this.p.e();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i1 == 3) || (i1 == 1))
    {
      this.p.e();
      return false;
    }
    switch (i1)
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    label152: float f3;
    float f4;
    do
    {
      for (int i2 = 0; ; i2 = 1)
      {
        if (!this.p.a(paramMotionEvent))
        {
          bool1 = false;
          if (i2 == 0)
            break;
        }
        return true;
        this.k = false;
        float f5 = paramMotionEvent.getX();
        float f6 = paramMotionEvent.getY();
        this.m = f5;
        this.n = f6;
        if ((!this.p.b(this.g, (int)f5, (int)f6)) || (!b(this.g)))
          break label152;
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      f3 = Math.abs(f1 - this.m);
      f4 = Math.abs(f2 - this.n);
    }
    while ((f3 <= this.p.d()) || (f4 <= f3));
    this.p.e();
    this.k = true;
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt3 - paramInt1;
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    int i4 = getPaddingTop();
    int i5 = getChildCount();
    if (this.r)
      if ((!this.f) || (!this.q))
        break label106;
    int i7;
    View localView;
    int i10;
    label106: for (float f1 = 1.0F; ; f1 = 0.0F)
    {
      this.h = f1;
      int i6 = 0;
      for (i7 = i2; ; i7 = i10)
      {
        if (i6 >= i5)
          break label330;
        localView = getChildAt(i6);
        if (localView.getVisibility() != 8)
          break;
        i10 = i7;
        i6++;
      }
    }
    y localy = (y)localView.getLayoutParams();
    int i9 = localView.getMeasuredWidth();
    boolean bool;
    label206: int i11;
    if (localy.b)
    {
      int i13 = localy.leftMargin + localy.rightMargin;
      int i14 = Math.min(i2, i1 - i3 - this.e) - i7 - i13;
      this.j = i14;
      if (i14 + (i7 + localy.leftMargin) + i9 / 2 > i1 - i3)
      {
        bool = true;
        localy.c = bool;
        i10 = i7 + ((int)(i14 * this.h) + localy.leftMargin);
        i11 = 0;
      }
    }
    while (true)
    {
      int i12 = i10 - i11;
      localView.layout(i12, i4, i12 + i9, i4 + localView.getMeasuredHeight());
      i2 += localView.getWidth();
      break;
      bool = false;
      break label206;
      if ((this.f) && (this.l != 0))
      {
        i11 = (int)((1.0F - this.h) * this.l);
        i10 = i2;
      }
      else
      {
        i10 = i2;
        i11 = 0;
      }
    }
    label330: if (this.r)
    {
      if (!this.f)
        break label405;
      if (this.l != 0)
        a(this.h);
      if (((y)this.g.getLayoutParams()).c)
        a(this.g, this.h, this.b);
    }
    while (true)
    {
      a(this.g);
      this.r = false;
      return;
      label405: for (int i8 = 0; i8 < i5; i8++)
        a(getChildAt(i8), 0.0F, this.b);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5;
    int i6;
    int i7;
    if (i1 != 1073741824)
      if (isInEditMode())
        if (i1 == -2147483648)
        {
          i5 = i3;
          i6 = i2;
          i7 = i4;
        }
    while (true)
    {
      int i9;
      int i8;
      label90: boolean bool1;
      int i10;
      int i11;
      int i12;
      int i13;
      float f1;
      label144: View localView2;
      y localy2;
      int i29;
      float f3;
      int i30;
      switch (i5)
      {
      default:
        i9 = 0;
        i8 = -1;
        bool1 = false;
        i10 = i6 - getPaddingLeft() - getPaddingRight();
        i11 = getChildCount();
        if (i11 > 2)
          Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        this.g = null;
        i12 = 0;
        i13 = i9;
        f1 = 0.0F;
        if (i12 >= i11)
          break label641;
        localView2 = getChildAt(i12);
        localy2 = (y)localView2.getLayoutParams();
        if (localView2.getVisibility() == 8)
        {
          localy2.c = false;
          i29 = i10;
          f3 = f1;
          i30 = i13;
        }
        break;
      case 1073741824:
      case -2147483648:
      }
      for (boolean bool4 = bool1; ; bool4 = bool1)
      {
        i12++;
        bool1 = bool4;
        i13 = i30;
        f1 = f3;
        i10 = i29;
        break label144;
        if (i1 != 0)
          break label1116;
        i5 = i3;
        i6 = 300;
        i7 = i4;
        break;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (i3 != 0)
          break label1116;
        if (isInEditMode())
        {
          if (i3 != 0)
            break label1116;
          i5 = -2147483648;
          i6 = i2;
          i7 = 300;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        i9 = i7 - getPaddingTop() - getPaddingBottom();
        i8 = i9;
        break label90;
        i8 = i7 - getPaddingTop() - getPaddingBottom();
        i9 = 0;
        break label90;
        if (localy2.a <= 0.0F)
          break label387;
        f1 += localy2.a;
        if (localy2.width != 0)
          break label387;
        i29 = i10;
        f3 = f1;
        i30 = i13;
      }
      label387: int i23 = localy2.leftMargin + localy2.rightMargin;
      int i24;
      label423: int i25;
      label443: int i28;
      if (localy2.width == -2)
      {
        i24 = View.MeasureSpec.makeMeasureSpec(i6 - i23, -2147483648);
        if (localy2.height != -2)
          break label597;
        i25 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
        localView2.measure(i24, i25);
        int i26 = localView2.getMeasuredWidth();
        int i27 = localView2.getMeasuredHeight();
        if ((i5 == -2147483648) && (i27 > i13))
          i13 = Math.min(i27, i8);
        i28 = i10 - i26;
        if (i28 >= 0)
          break label635;
      }
      label597: label635: for (boolean bool2 = true; ; bool2 = false)
      {
        localy2.b = bool2;
        boolean bool3 = bool2 | bool1;
        if (localy2.b)
          this.g = localView2;
        i29 = i28;
        i30 = i13;
        float f2 = f1;
        bool4 = bool3;
        f3 = f2;
        break;
        if (localy2.width == -1)
        {
          i24 = View.MeasureSpec.makeMeasureSpec(i6 - i23, 1073741824);
          break label423;
        }
        i24 = View.MeasureSpec.makeMeasureSpec(localy2.width, 1073741824);
        break label423;
        if (localy2.height == -1)
        {
          i25 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
          break label443;
        }
        i25 = View.MeasureSpec.makeMeasureSpec(localy2.height, 1073741824);
        break label443;
      }
      label641: if ((bool1) || (f1 > 0.0F))
      {
        int i14 = i6 - this.e;
        int i15 = 0;
        if (i15 < i11)
        {
          View localView1 = getChildAt(i15);
          if (localView1.getVisibility() == 8);
          while (true)
          {
            i15++;
            break;
            y localy1 = (y)localView1.getLayoutParams();
            if (localView1.getVisibility() != 8)
            {
              int i16;
              label737: int i17;
              label745: int i22;
              if ((localy1.width == 0) && (localy1.a > 0.0F))
              {
                i16 = 1;
                if (i16 != 0)
                {
                  i17 = 0;
                  if ((!bool1) || (localView1 == this.g))
                    break label897;
                  if ((localy1.width >= 0) || ((i17 <= i14) && (localy1.a <= 0.0F)))
                    continue;
                  if (i16 == 0)
                    break label881;
                  if (localy1.height != -2)
                    break label843;
                  i22 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                }
              }
              else
              {
                while (true)
                {
                  localView1.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i22);
                  break;
                  i16 = 0;
                  break label737;
                  i17 = localView1.getMeasuredWidth();
                  break label745;
                  label843: if (localy1.height == -1)
                  {
                    i22 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                  }
                  else
                  {
                    i22 = View.MeasureSpec.makeMeasureSpec(localy1.height, 1073741824);
                    continue;
                    label881: i22 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                  }
                }
                label897: if (localy1.a > 0.0F)
                {
                  int i18;
                  if (localy1.width == 0)
                    if (localy1.height == -2)
                      i18 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                  while (true)
                  {
                    if (!bool1)
                      break label1039;
                    int i20 = i6 - (localy1.leftMargin + localy1.rightMargin);
                    int i21 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                    if (i17 == i20)
                      break;
                    localView1.measure(i21, i18);
                    break;
                    if (localy1.height == -1)
                    {
                      i18 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    else
                    {
                      i18 = View.MeasureSpec.makeMeasureSpec(localy1.height, 1073741824);
                      continue;
                      i18 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                    }
                  }
                  label1039: int i19 = Math.max(0, i10);
                  localView1.measure(View.MeasureSpec.makeMeasureSpec(i17 + (int)(localy1.a * i19 / f1), 1073741824), i18);
                }
              }
            }
          }
        }
      }
      setMeasuredDimension(i6, i13);
      this.f = bool1;
      if ((this.p.a() != 0) && (!bool1))
        this.p.f();
      return;
      label1116: i5 = i3;
      i6 = i2;
      i7 = i4;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    SlidingPaneLayout.SavedState localSavedState = (SlidingPaneLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a)
      b();
    while (true)
    {
      this.q = localSavedState.a;
      return;
      c();
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SlidingPaneLayout.SavedState localSavedState = new SlidingPaneLayout.SavedState(super.onSaveInstanceState());
    if (e());
    for (boolean bool = d(); ; bool = this.q)
    {
      localSavedState.a = bool;
      return localSavedState;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      this.r = true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if (!this.f)
      bool = super.onTouchEvent(paramMotionEvent);
    float f1;
    float f2;
    float f3;
    float f4;
    int i2;
    do
    {
      do
      {
        return bool;
        this.p.b(paramMotionEvent);
        int i1 = paramMotionEvent.getAction();
        bool = true;
        switch (i1 & 0xFF)
        {
        default:
          return bool;
        case 0:
          float f5 = paramMotionEvent.getX();
          float f6 = paramMotionEvent.getY();
          this.m = f5;
          this.n = f6;
          return bool;
        case 1:
        }
      }
      while (!b(this.g));
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      f3 = f1 - this.m;
      f4 = f2 - this.n;
      i2 = this.p.d();
    }
    while ((f3 * f3 + f4 * f4 >= i2 * i2) || (!this.p.b(this.g, (int)f1, (int)f2)));
    a(this.g, 0);
    return bool;
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.f))
      if (paramView1 != this.g)
        break label36;
    label36: for (boolean bool = true; ; bool = false)
    {
      this.q = bool;
      return;
    }
  }

  public void setCoveredFadeColor(int paramInt)
  {
    this.c = paramInt;
  }

  public void setPanelSlideListener(z paramz)
  {
    this.o = paramz;
  }

  public void setParallaxDistance(int paramInt)
  {
    this.l = paramInt;
    requestLayout();
  }

  public void setShadowDrawable(Drawable paramDrawable)
  {
    this.d = paramDrawable;
  }

  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }

  public void setSliderFadeColor(int paramInt)
  {
    this.b = paramInt;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * JD-Core Version:    0.6.2
 */