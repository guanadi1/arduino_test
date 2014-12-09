package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class t extends BaseAdapter
{
  private n b;
  private int c = -1;

  public t(s params, n paramn)
  {
    this.b = paramn;
    a();
  }

  public r a(int paramInt)
  {
    if (s.a(this.a));
    for (ArrayList localArrayList = this.b.k(); ; localArrayList = this.b.h())
    {
      if ((this.c >= 0) && (paramInt >= this.c))
        paramInt++;
      return (r)localArrayList.get(paramInt);
    }
  }

  void a()
  {
    r localr = s.c(this.a).q();
    if (localr != null)
    {
      ArrayList localArrayList = s.c(this.a).k();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        if ((r)localArrayList.get(j) == localr)
        {
          this.c = j;
          return;
        }
    }
    this.c = -1;
  }

  public int getCount()
  {
    if (s.a(this.a));
    for (ArrayList localArrayList = this.b.k(); this.c < 0; localArrayList = this.b.h())
      return localArrayList.size();
    return -1 + localArrayList.size();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = s.b(this.a).inflate(s.b, paramViewGroup, false); ; localView = paramView)
    {
      x localx = (x)localView;
      if (this.a.c)
        ((ListMenuItemView)localView).setForceShowIcon(true);
      localx.a(a(paramInt), 0);
      return localView;
    }
  }

  public void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.t
 * JD-Core Version:    0.6.2
 */