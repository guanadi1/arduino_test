package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView
  implements p, w, AdapterView.OnItemClickListener
{
  private n a;
  private int b;

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
  }

  public void a(n paramn)
  {
    this.a = paramn;
  }

  public boolean a(r paramr)
  {
    return this.a.a(paramr, 0);
  }

  public int getWindowAnimations()
  {
    return this.b;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((r)getAdapter().getItem(paramInt));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ExpandedMenuView
 * JD-Core Version:    0.6.2
 */