package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class p extends a
{
  private int j;
  private int k;
  private LayoutInflater l;

  public p(Context paramContext, int paramInt, Cursor paramCursor, boolean paramBoolean)
  {
    super(paramContext, paramCursor, paramBoolean);
    this.k = paramInt;
    this.j = paramInt;
    this.l = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }

  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.l.inflate(this.j, paramViewGroup, false);
  }

  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.l.inflate(this.k, paramViewGroup, false);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.p
 * JD-Core Version:    0.6.2
 */