package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class LinearLayoutICS extends LinearLayout
{
  private final Drawable a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;

  public LinearLayoutICS(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.LinearLayoutICS);
    this.a = localTypedArray.getDrawable(0);
    if (this.a != null)
    {
      this.b = this.a.getIntrinsicWidth();
      this.c = this.a.getIntrinsicHeight();
      this.d = localTypedArray.getInt(i, 0);
      this.e = localTypedArray.getDimensionPixelSize(2, 0);
      localTypedArray.recycle();
      if (this.a != null)
        break label110;
    }
    while (true)
    {
      setWillNotDraw(i);
      return;
      this.b = 0;
      this.c = 0;
      break;
      label110: int j = 0;
    }
  }

  void a(Canvas paramCanvas)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView2 = getChildAt(j);
      if ((localView2 != null) && (localView2.getVisibility() != 8) && (a(j)))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView2.getLayoutParams();
        a(paramCanvas, localView2.getTop() - localLayoutParams.topMargin);
      }
    }
    View localView1;
    if (a(i))
    {
      localView1 = getChildAt(i - 1);
      if (localView1 != null)
        break label120;
    }
    label120: for (int k = getHeight() - getPaddingBottom() - this.c; ; k = localView1.getBottom())
    {
      a(paramCanvas, k);
      return;
    }
  }

  void a(Canvas paramCanvas, int paramInt)
  {
    this.a.setBounds(getPaddingLeft() + this.e, paramInt, getWidth() - getPaddingRight() - this.e, paramInt + this.c);
    this.a.draw(paramCanvas);
  }

  protected boolean a(int paramInt)
  {
    if (paramInt == 0)
      if ((0x1 & this.d) == 0);
    do
    {
      return true;
      return false;
      if (paramInt != getChildCount())
        break;
    }
    while ((0x4 & this.d) != 0);
    return false;
    if ((0x2 & this.d) != 0)
      for (int i = paramInt - 1; ; i--)
      {
        if (i < 0)
          break label74;
        if (getChildAt(i).getVisibility() != 8)
          break;
      }
    return false;
    label74: return false;
  }

  void b(Canvas paramCanvas)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView2 = getChildAt(j);
      if ((localView2 != null) && (localView2.getVisibility() != 8) && (a(j)))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView2.getLayoutParams();
        b(paramCanvas, localView2.getLeft() - localLayoutParams.leftMargin);
      }
    }
    View localView1;
    if (a(i))
    {
      localView1 = getChildAt(i - 1);
      if (localView1 != null)
        break label120;
    }
    label120: for (int k = getWidth() - getPaddingRight() - this.b; ; k = localView1.getRight())
    {
      b(paramCanvas, k);
      return;
    }
  }

  void b(Canvas paramCanvas, int paramInt)
  {
    this.a.setBounds(paramInt, getPaddingTop() + this.e, paramInt + this.b, getHeight() - getPaddingBottom() - this.e);
    this.a.draw(paramCanvas);
  }

  public int getSupportDividerWidth()
  {
    return this.b;
  }

  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    LinearLayout.LayoutParams localLayoutParams;
    if (this.a != null)
    {
      i = indexOfChild(paramView);
      j = getChildCount();
      localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
      if (getOrientation() != 1)
        break label97;
      if (!a(i))
        break label67;
      localLayoutParams.topMargin = this.c;
    }
    while (true)
    {
      super.measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
      label67: if ((i == j - 1) && (a(j)))
      {
        localLayoutParams.bottomMargin = this.c;
        continue;
        label97: if (a(i))
          localLayoutParams.leftMargin = this.b;
        else if ((i == j - 1) && (a(j)))
          localLayoutParams.rightMargin = this.b;
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.a == null)
      return;
    if (getOrientation() == 1)
    {
      a(paramCanvas);
      return;
    }
    b(paramCanvas);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.LinearLayoutICS
 * JD-Core Version:    0.6.2
 */