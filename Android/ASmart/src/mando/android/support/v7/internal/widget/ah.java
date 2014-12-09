package android.support.v7.internal.widget;

import android.support.v7.a.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

class ah extends BaseAdapter
{
  private ah(ScrollingTabContainerView paramScrollingTabContainerView)
  {
  }

  public int getCount()
  {
    return ScrollingTabContainerView.a(this.a).getChildCount();
  }

  public Object getItem(int paramInt)
  {
    return ((ScrollingTabContainerView.TabView)ScrollingTabContainerView.a(this.a).getChildAt(paramInt)).getTab();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      return ScrollingTabContainerView.a(this.a, (d)getItem(paramInt), true);
    ((ScrollingTabContainerView.TabView)paramView).a((d)getItem(paramInt));
    return paramView;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ah
 * JD-Core Version:    0.6.2
 */