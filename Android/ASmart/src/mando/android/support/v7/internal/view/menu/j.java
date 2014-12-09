package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.widget.LinearLayout.LayoutParams;

public class j extends LinearLayout.LayoutParams
{

  @ViewDebug.ExportedProperty
  public boolean a;

  @ViewDebug.ExportedProperty
  public int b;

  @ViewDebug.ExportedProperty
  public int c;

  @ViewDebug.ExportedProperty
  public boolean d;

  @ViewDebug.ExportedProperty
  public boolean e;
  public boolean f;

  public j(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = false;
  }

  public j(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public j(j paramj)
  {
    super(paramj);
    this.a = paramj.a;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.j
 * JD-Core Version:    0.6.2
 */