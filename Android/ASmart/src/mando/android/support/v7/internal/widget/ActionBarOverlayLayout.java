package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.a.a;
import android.support.v7.b.b;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ActionBarOverlayLayout extends FrameLayout
{
  static final int[] a = arrayOfInt;
  private int b;
  private a c;
  private final Rect d = new Rect(0, 0, 0, 0);

  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = b.actionBarSize;
  }

  public ActionBarOverlayLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(a);
    this.b = localTypedArray.getDimensionPixelSize(0, 0);
    localTypedArray.recycle();
  }

  public void setActionBar(a parama)
  {
    this.c = parama;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarOverlayLayout
 * JD-Core Version:    0.6.2
 */