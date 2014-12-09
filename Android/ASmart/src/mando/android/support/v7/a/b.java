package android.support.v7.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;

public class b extends ViewGroup.MarginLayoutParams
{
  public int a = -1;

  public b(int paramInt)
  {
    this(-2, -1, paramInt);
  }

  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2);
    this.a = paramInt3;
  }

  public b(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionBarLayout);
    this.a = localTypedArray.getInt(0, -1);
    localTypedArray.recycle();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.a.b
 * JD-Core Version:    0.6.2
 */