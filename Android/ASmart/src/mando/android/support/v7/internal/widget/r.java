package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.widget.TextView;

public class r extends TextView
{
  public r(Context paramContext)
  {
    this(paramContext, null);
  }

  public r(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public r(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.CompatTextView, paramInt, 0);
    boolean bool = localTypedArray.getBoolean(0, false);
    localTypedArray.recycle();
    if (bool)
      setTransformationMethod(new s(paramContext));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.r
 * JD-Core Version:    0.6.2
 */