package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.b;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;

class w extends ListView
{
  private boolean a;
  private boolean b;

  public w(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, b.dropDownListViewStyle);
    this.b = paramBoolean;
    setCacheColorHint(0);
  }

  final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int k = getDividerHeight();
    Drawable localDrawable = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt4 = i + j;
      return paramInt4;
    }
    int m = j + i;
    label72: int n;
    View localView1;
    int i3;
    label93: View localView2;
    label125: int i6;
    if ((k > 0) && (localDrawable != null))
    {
      n = 0;
      localView1 = null;
      int i1 = 0;
      int i2 = localListAdapter.getCount();
      i3 = 0;
      if (i3 >= i2)
        break label269;
      int i4 = localListAdapter.getItemViewType(i3);
      if (i4 == i1)
        break label272;
      localView2 = null;
      i1 = i4;
      localView1 = localListAdapter.getView(i3, localView2, this);
      int i5 = localView1.getLayoutParams().height;
      if (i5 <= 0)
        break label233;
      i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
      label163: localView1.measure(paramInt1, i6);
      if (i3 <= 0)
        break label279;
    }
    label269: label272: label279: for (int i7 = m + k; ; i7 = m)
    {
      int i8 = i7 + localView1.getMeasuredHeight();
      if (i8 >= paramInt4)
      {
        if ((paramInt5 < 0) || (i3 <= paramInt5) || (n <= 0) || (i8 == paramInt4))
          break;
        return n;
        k = 0;
        break label72;
        label233: i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label163;
      }
      if ((paramInt5 >= 0) && (i3 >= paramInt5))
        n = i8;
      i3++;
      m = i8;
      break label93;
      return m;
      localView2 = localView1;
      break label125;
    }
  }

  public boolean hasFocus()
  {
    return (this.b) || (super.hasFocus());
  }

  public boolean hasWindowFocus()
  {
    return (this.b) || (super.hasWindowFocus());
  }

  public boolean isFocused()
  {
    return (this.b) || (super.isFocused());
  }

  public boolean isInTouchMode()
  {
    return ((this.b) && (this.a)) || (super.isInTouchMode());
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.w
 * JD-Core Version:    0.6.2
 */