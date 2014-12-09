package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;

class aj extends AbsSpinnerICS
  implements DialogInterface.OnClickListener
{
  int E;
  private ap F;
  private am G;
  private int H;
  private Rect I = new Rect();

  aj(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }

  aj(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.Spinner, paramInt1, 0);
    if (paramInt2 == -1)
      paramInt2 = localTypedArray.getInt(7, 0);
    switch (paramInt2)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      this.H = localTypedArray.getInt(0, 17);
      this.F.a(localTypedArray.getString(6));
      localTypedArray.recycle();
      if (this.G != null)
      {
        this.F.a(this.G);
        this.G = null;
      }
      return;
      this.F = new al(this, null);
      continue;
      an localan = new an(this, paramContext, paramAttributeSet, paramInt1);
      this.E = localTypedArray.getLayoutDimension(3, -2);
      localan.a(localTypedArray.getDrawable(2));
      int i = localTypedArray.getDimensionPixelOffset(5, 0);
      if (i != 0)
        localan.c(i);
      int j = localTypedArray.getDimensionPixelOffset(4, 0);
      if (j != 0)
        localan.b(j);
      this.F = localan;
    }
  }

  private void c(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = generateDefaultLayoutParams();
    addViewInLayout(paramView, 0, localLayoutParams);
    paramView.setSelected(hasFocus());
    int i = ViewGroup.getChildMeasureSpec(this.b, this.i.top + this.i.bottom, localLayoutParams.height);
    paramView.measure(ViewGroup.getChildMeasureSpec(this.c, this.i.left + this.i.right, localLayoutParams.width), i);
    int j = this.i.top + (getMeasuredHeight() - this.i.bottom - this.i.top - paramView.getMeasuredHeight()) / 2;
    int k = j + paramView.getMeasuredHeight();
    paramView.layout(0, j, 0 + paramView.getMeasuredWidth(), k);
  }

  private View e(int paramInt)
  {
    if (!this.u)
    {
      View localView2 = this.j.a(paramInt);
      if (localView2 != null)
      {
        c(localView2);
        return localView2;
      }
    }
    View localView1 = this.a.getView(paramInt, null, this);
    c(localView1);
    return localView1;
  }

  int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null)
      return 0;
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = Math.max(0, f());
    int m = Math.min(paramSpinnerAdapter.getCount(), k + 15);
    int n = Math.max(0, k - (15 - (m - k)));
    View localView1 = null;
    int i1 = 0;
    int i2 = 0;
    int i3;
    if (n < m)
    {
      i3 = paramSpinnerAdapter.getItemViewType(n);
      if (i3 == i2)
        break label200;
    }
    for (View localView2 = null; ; localView2 = localView1)
    {
      localView1 = paramSpinnerAdapter.getView(n, localView2, this);
      if (localView1.getLayoutParams() == null)
        localView1.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      localView1.measure(i, j);
      i1 = Math.max(i1, localView1.getMeasuredWidth());
      n++;
      i2 = i3;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.I);
        return i1 + (this.I.left + this.I.right);
      }
      return i1;
      label200: i3 = i2;
    }
  }

  void a(int paramInt, boolean paramBoolean)
  {
    int i = this.i.left;
    int j = getRight() - getLeft() - this.i.left - this.i.right;
    if (this.u)
      k();
    if (this.z == 0)
    {
      a();
      return;
    }
    if (this.v >= 0)
      c(this.v);
    b();
    removeAllViewsInLayout();
    this.k = this.x;
    View localView = e(this.x);
    int k = localView.getMeasuredWidth();
    switch (0x7 & this.H)
    {
    default:
    case 1:
    case 5:
    }
    while (true)
    {
      localView.offsetLeftAndRight(i);
      this.j.a();
      invalidate();
      l();
      this.u = false;
      this.p = false;
      d(this.x);
      return;
      i = i + j / 2 - k / 2;
      continue;
      i = i + j - k;
    }
  }

  public void a(n paramn)
  {
    throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
  }

  public void a(SpinnerAdapter paramSpinnerAdapter)
  {
    super.a(paramSpinnerAdapter);
    if (this.F != null)
    {
      this.F.a(new am(paramSpinnerAdapter));
      return;
    }
    this.G = new am(paramSpinnerAdapter);
  }

  void b(n paramn)
  {
    super.a(paramn);
  }

  public int getBaseline()
  {
    int i = -1;
    View localView;
    if (getChildCount() > 0)
      localView = getChildAt(0);
    while (true)
    {
      if (localView != null)
      {
        int k = localView.getBaseline();
        if (k >= 0)
          i = k + localView.getTop();
      }
      return i;
      SpinnerAdapter localSpinnerAdapter = this.a;
      localView = null;
      if (localSpinnerAdapter != null)
      {
        int j = this.a.getCount();
        localView = null;
        if (j > 0)
        {
          localView = e(0);
          this.j.a(0, localView);
          removeAllViewsInLayout();
        }
      }
    }
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a(paramInt);
    paramDialogInterface.dismiss();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.F != null) && (this.F.f()))
      this.F.d();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.r = true;
    a(0, false);
    this.r = false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.F != null) && (View.MeasureSpec.getMode(paramInt1) == -2147483648))
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(d(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
  }

  public boolean performClick()
  {
    boolean bool = super.performClick();
    if (!bool)
    {
      bool = true;
      if (!this.F.f())
        this.F.c();
    }
    return bool;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.aj
 * JD-Core Version:    0.6.2
 */