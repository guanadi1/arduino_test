package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class y extends ViewGroup.MarginLayoutParams
{
  private static final int[] e = { 16843137 };
  public float a = 0.0F;
  boolean b;
  boolean c;
  Paint d;

  public y()
  {
    super(-1, -1);
  }

  public y(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e);
    this.a = localTypedArray.getFloat(0, 0.0F);
    localTypedArray.recycle();
  }

  public y(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public y(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.y
 * JD-Core Version:    0.6.2
 */