package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class h extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  float b;
  boolean c;
  boolean d;

  public h(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }

  public h(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.c());
    this.a = localTypedArray.getInt(0, 0);
    localTypedArray.recycle();
  }

  public h(h paramh)
  {
    super(paramh);
    this.a = paramh.a;
  }

  public h(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public h(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.h
 * JD-Core Version:    0.6.2
 */