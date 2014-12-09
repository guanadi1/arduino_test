package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.b.b;
import android.support.v7.internal.widget.LinearLayoutICS;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends LinearLayoutICS
  implements p, w
{
  private n a;
  private boolean b;
  private ActionMenuPresenter c;
  private boolean d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;

  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.f = ((int)(56.0F * f1));
    this.g = ((int)(f1 * 4.0F));
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, android.support.v7.b.j.ActionBar, b.actionBarStyle, 0);
    this.i = localTypedArray.getDimensionPixelSize(0, 0);
    localTypedArray.recycle();
  }

  static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    j localj = (j)paramView.getLayoutParams();
    int j = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    int k;
    if ((paramView instanceof ActionMenuItemView))
    {
      localActionMenuItemView = (ActionMenuItemView)paramView;
      if ((localActionMenuItemView == null) || (!localActionMenuItemView.b()))
        break label182;
      k = 1;
      label54: if ((paramInt2 <= 0) || ((k != 0) && (paramInt2 < 2)))
        break label188;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, -2147483648), j);
      int n = paramView.getMeasuredWidth();
      m = n / paramInt1;
      if (n % paramInt1 != 0)
        m++;
      if ((k == 0) || (m >= 2));
    }
    label182: label188: for (int m = 2; ; m = 0)
    {
      boolean bool1 = localj.a;
      boolean bool2 = false;
      if (!bool1)
      {
        bool2 = false;
        if (k != 0)
          bool2 = true;
      }
      localj.d = bool2;
      localj.b = m;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(m * paramInt1, 1073741824), j);
      return m;
      localActionMenuItemView = null;
      break;
      k = 0;
      break label54;
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n = getPaddingLeft() + getPaddingRight();
    int i1 = getPaddingTop() + getPaddingBottom();
    if (j == 1073741824);
    int i3;
    int i4;
    int i5;
    for (int i2 = View.MeasureSpec.makeMeasureSpec(m - i1, 1073741824); ; i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.i, m - i1), -2147483648))
    {
      i3 = k - n;
      i4 = i3 / this.f;
      i5 = i3 % this.f;
      if (i4 != 0)
        break;
      setMeasuredDimension(i3, 0);
      return;
    }
    int i6 = this.f + i5 / i4;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    long l1 = 0L;
    int i12 = getChildCount();
    int i13 = 0;
    View localView4;
    int i46;
    long l8;
    int i44;
    int i45;
    int i43;
    int i34;
    j localj5;
    boolean bool2;
    label325: int i35;
    label343: int i36;
    int i37;
    while (true)
      if (i13 < i12)
      {
        localView4 = getChildAt(i13);
        if (localView4.getVisibility() == 8)
        {
          i46 = i10;
          l8 = l1;
          i44 = i7;
          i45 = i4;
          i43 = i8;
          i13++;
          i8 = i43;
          i7 = i44;
          i4 = i45;
          l1 = l8;
          i10 = i46;
        }
        else
        {
          boolean bool1 = localView4 instanceof ActionMenuItemView;
          i34 = i10 + 1;
          if (bool1)
            localView4.setPadding(this.g, 0, this.g, 0);
          localj5 = (j)localView4.getLayoutParams();
          localj5.f = false;
          localj5.c = 0;
          localj5.b = 0;
          localj5.d = false;
          localj5.leftMargin = 0;
          localj5.rightMargin = 0;
          if ((bool1) && (((ActionMenuItemView)localView4).b()))
          {
            bool2 = true;
            localj5.e = bool2;
            if (!localj5.a)
              break label468;
            i35 = 1;
            i36 = a(localView4, i6, i35, i2, i1);
            i37 = Math.max(i8, i36);
            if (!localj5.d)
              break label1377;
          }
        }
      }
    label468: label1377: for (int i38 = i9 + 1; ; i38 = i9)
    {
      if (localj5.a);
      for (int i39 = 1; ; i39 = i11)
      {
        int i40 = i4 - i36;
        int i41 = localView4.getMeasuredHeight();
        int i42 = Math.max(i7, i41);
        if (i36 == 1)
        {
          long l9 = l1 | 1 << i13;
          i44 = i42;
          i45 = i40;
          i46 = i34;
          i11 = i39;
          i43 = i37;
          i9 = i38;
          l8 = l9;
          break;
          bool2 = false;
          break label325;
          i35 = i4;
          break label343;
          int i14;
          int i15;
          long l2;
          int i16;
          int i25;
          long l4;
          int i26;
          int i27;
          j localj4;
          int i32;
          int i33;
          if ((i11 != 0) && (i10 == 2))
          {
            i14 = 1;
            i15 = 0;
            l2 = l1;
            i16 = i4;
            if ((i9 <= 0) || (i16 <= 0))
              break label1328;
            i25 = 2147483647;
            l4 = 0L;
            i26 = 0;
            i27 = 0;
            if (i27 >= i12)
              break label643;
            localj4 = (j)getChildAt(i27).getLayoutParams();
            if (localj4.d)
              break label580;
            i32 = i26;
            i33 = i25;
          }
          while (true)
          {
            i27++;
            i25 = i33;
            i26 = i32;
            break label523;
            i14 = 0;
            break;
            if (localj4.b < i25)
            {
              i33 = localj4.b;
              l4 = 1 << i27;
              i32 = 1;
            }
            else
            {
              if (localj4.b != i25)
                break label1317;
              l4 |= 1 << i27;
              i32 = i26 + 1;
              i33 = i25;
            }
          }
          long l5 = l2 | l4;
          if (i26 > i16);
          for (long l3 = l5; ; l3 = l2)
          {
            int i17;
            float f1;
            float f2;
            int i22;
            int i23;
            int i18;
            int i24;
            int i29;
            int i30;
            long l6;
            label876: View localView3;
            j localj3;
            int i31;
            if ((i11 == 0) && (i10 == 1))
            {
              i17 = 1;
              if ((i16 <= 0) || (l3 == 0L))
                break label1299;
              int i21 = i10 - 1;
              if ((i16 >= i21) && (i17 == 0) && (i8 <= 1))
                break label1299;
              f1 = Long.bitCount(l3);
              if (i17 != 0)
                break label1292;
              if (((1L & l3) != 0L) && (!((j)getChildAt(0).getLayoutParams()).e))
                f1 -= 0.5F;
              if (((l3 & 1 << i12 - 1) == 0L) || (((j)getChildAt(i12 - 1).getLayoutParams()).e))
                break label1292;
              f2 = f1 - 0.5F;
              if (f2 <= 0.0F)
                break label1032;
              i22 = (int)(i16 * i6 / f2);
              i23 = 0;
              i18 = i15;
              while (true)
                if (i23 < i12)
                  if ((l3 & 1 << i23) == 0L)
                  {
                    i24 = i18;
                    i23++;
                    i18 = i24;
                    continue;
                    int i28 = i25 + 1;
                    i29 = 0;
                    i30 = i16;
                    l6 = l5;
                    if (i29 < i12)
                    {
                      localView3 = getChildAt(i29);
                      localj3 = (j)localView3.getLayoutParams();
                      if ((l4 & 1 << i29) == 0L)
                      {
                        if (localj3.b != i28)
                          break label1310;
                        l6 |= 1 << i29;
                        i31 = i30;
                      }
                    }
                  }
            }
            while (true)
            {
              i29++;
              i30 = i31;
              break label876;
              if ((i14 != 0) && (localj3.e) && (i30 == 1))
                localView3.setPadding(i6 + this.g, 0, this.g, 0);
              localj3.b = (1 + localj3.b);
              localj3.f = true;
              i31 = i30 - 1;
              continue;
              l2 = l6;
              i15 = 1;
              i16 = i30;
              break;
              i17 = 0;
              break label675;
              i22 = 0;
              break label818;
              View localView2 = getChildAt(i23);
              j localj2 = (j)localView2.getLayoutParams();
              if ((localView2 instanceof ActionMenuItemView))
              {
                localj2.c = i22;
                localj2.f = true;
                if ((i23 == 0) && (!localj2.e))
                  localj2.leftMargin = (-i22 / 2);
                i24 = 1;
                break label849;
              }
              if (localj2.a)
              {
                localj2.c = i22;
                localj2.f = true;
                localj2.rightMargin = (-i22 / 2);
                i24 = 1;
                break label849;
              }
              if (i23 != 0)
                localj2.leftMargin = (i22 / 2);
              if (i23 != i12 - 1)
                localj2.rightMargin = (i22 / 2);
              i24 = i18;
              break label849;
              for (int i19 = 0; ; i19 = i16)
              {
                if (i18 != 0)
                {
                  int i20 = 0;
                  if (i20 < i12)
                  {
                    View localView1 = getChildAt(i20);
                    j localj1 = (j)localView1.getLayoutParams();
                    if (!localj1.f);
                    while (true)
                    {
                      i20++;
                      break;
                      localView1.measure(View.MeasureSpec.makeMeasureSpec(i6 * localj1.b + localj1.c, 1073741824), i2);
                    }
                  }
                }
                if (j != 1073741824);
                while (true)
                {
                  setMeasuredDimension(i3, i7);
                  this.h = (i19 * i6);
                  return;
                  i7 = m;
                }
                f2 = f1;
                break;
                i18 = i15;
              }
              i31 = i30;
            }
            i32 = i26;
            i33 = i25;
            break label560;
          }
        }
        i9 = i38;
        i43 = i37;
        long l7 = l1;
        i44 = i42;
        i45 = i40;
        i11 = i39;
        i46 = i34;
        l8 = l7;
        break;
      }
    }
  }

  protected j a()
  {
    j localj = new j(-2, -2);
    localj.gravity = 16;
    return localj;
  }

  public j a(AttributeSet paramAttributeSet)
  {
    return new j(getContext(), paramAttributeSet);
  }

  protected j a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof j))
    {
      j localj = new j((j)paramLayoutParams);
      if (localj.gravity <= 0)
        localj.gravity = 16;
      return localj;
    }
    return a();
  }

  public void a(n paramn)
  {
    this.a = paramn;
  }

  protected boolean a(int paramInt)
  {
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    int j = getChildCount();
    boolean bool1 = false;
    if (paramInt < j)
    {
      boolean bool2 = localView1 instanceof i;
      bool1 = false;
      if (bool2)
        bool1 = false | ((i)localView1).d();
    }
    if ((paramInt > 0) && ((localView2 instanceof i)))
      return bool1 | ((i)localView2).c();
    return bool1;
  }

  public boolean a(r paramr)
  {
    return this.a.a(paramr, 0);
  }

  public j b()
  {
    j localj = a();
    localj.a = true;
    return localj;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (paramLayoutParams != null) && ((paramLayoutParams instanceof j));
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }

  public int getWindowAnimations()
  {
    return 0;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    this.c.b(false);
    if ((this.c != null) && (this.c.e()))
    {
      this.c.b();
      this.c.a();
    }
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.c.c();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.d)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int j = getChildCount();
    int k = (paramInt2 + paramInt4) / 2;
    int m = getSupportDividerWidth();
    int n = 0;
    int i1 = 0;
    int i2 = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    int i3 = 0;
    int i4 = 0;
    if (i4 < j)
    {
      View localView3 = getChildAt(i4);
      int i28;
      int i25;
      int i26;
      int i27;
      if (localView3.getVisibility() == 8)
      {
        i28 = i3;
        i25 = i2;
        i26 = i1;
        i27 = n;
      }
      while (true)
      {
        i4++;
        n = i27;
        i1 = i26;
        i2 = i25;
        i3 = i28;
        break;
        j localj2 = (j)localView3.getLayoutParams();
        if (localj2.a)
        {
          int i29 = localView3.getMeasuredWidth();
          if (a(i4))
            i29 += m;
          int i30 = localView3.getMeasuredHeight();
          int i31 = getWidth() - getPaddingRight() - localj2.rightMargin;
          int i32 = i31 - i29;
          int i33 = k - i30 / 2;
          localView3.layout(i32, i33, i31, i30 + i33);
          i25 = i2 - i29;
          i28 = 1;
          i26 = i1;
          i27 = n;
        }
        else
        {
          int i20 = localView3.getMeasuredWidth() + localj2.leftMargin + localj2.rightMargin;
          int i21 = n + i20;
          int i22 = i2 - i20;
          if (a(i4))
            i21 += m;
          int i23 = i1 + 1;
          int i24 = i3;
          i25 = i22;
          i26 = i23;
          i27 = i21;
          i28 = i24;
        }
      }
    }
    if ((j == 1) && (i3 == 0))
    {
      View localView2 = getChildAt(0);
      int i16 = localView2.getMeasuredWidth();
      int i17 = localView2.getMeasuredHeight();
      int i18 = (paramInt3 - paramInt1) / 2 - i16 / 2;
      int i19 = k - i17 / 2;
      localView2.layout(i18, i19, i16 + i18, i17 + i19);
      return;
    }
    int i5;
    label408: int i7;
    label427: int i8;
    int i9;
    int i10;
    label444: View localView1;
    j localj1;
    int i11;
    if (i3 != 0)
    {
      i5 = 0;
      int i6 = i1 - i5;
      if (i6 <= 0)
        break label507;
      i7 = i2 / i6;
      i8 = Math.max(0, i7);
      i9 = getPaddingLeft();
      i10 = 0;
      if (i10 < j)
      {
        localView1 = getChildAt(i10);
        localj1 = (j)localView1.getLayoutParams();
        if (localView1.getVisibility() == 8)
          break label584;
        if (!localj1.a)
          break label513;
        i11 = i9;
      }
    }
    while (true)
    {
      i10++;
      i9 = i11;
      break label444;
      break;
      i5 = 1;
      break label408;
      label507: i7 = 0;
      break label427;
      label513: int i12 = i9 + localj1.leftMargin;
      int i13 = localView1.getMeasuredWidth();
      int i14 = localView1.getMeasuredHeight();
      int i15 = k - i14 / 2;
      localView1.layout(i12, i15, i12 + i13, i14 + i15);
      i11 = i12 + (i8 + (i13 + localj1.rightMargin));
      continue;
      label584: i11 = i9;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = this.d;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824);
    for (boolean bool2 = true; ; bool2 = false)
    {
      this.d = bool2;
      if (bool1 != this.d)
        this.e = 0;
      int j = View.MeasureSpec.getMode(paramInt1);
      if ((this.d) && (this.a != null) && (j != this.e))
      {
        this.e = j;
        this.a.b(true);
      }
      if (!this.d)
        break;
      a(paramInt1, paramInt2);
      return;
    }
    int k = getChildCount();
    for (int m = 0; m < k; m++)
    {
      j localj = (j)getChildAt(m).getLayoutParams();
      localj.rightMargin = 0;
      localj.leftMargin = 0;
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public void setOverflowReserved(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public void setPresenter(ActionMenuPresenter paramActionMenuPresenter)
  {
    this.c = paramActionMenuPresenter;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuView
 * JD-Core Version:    0.6.2
 */