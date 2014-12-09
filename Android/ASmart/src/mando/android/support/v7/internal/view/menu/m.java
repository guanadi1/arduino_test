package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class m extends BaseAdapter
{
  private int b = -1;

  public m(l paraml)
  {
    a();
  }

  public r a(int paramInt)
  {
    ArrayList localArrayList = this.a.c.k();
    int i = paramInt + l.a(this.a);
    if ((this.b >= 0) && (i >= this.b))
      i++;
    return (r)localArrayList.get(i);
  }

  void a()
  {
    r localr = this.a.c.q();
    if (localr != null)
    {
      ArrayList localArrayList = this.a.c.k();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        if ((r)localArrayList.get(j) == localr)
        {
          this.b = j;
          return;
        }
    }
    this.b = -1;
  }

  public int getCount()
  {
    int i = this.a.c.k().size() - l.a(this.a);
    if (this.b < 0)
      return i;
    return i - 1;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = this.a.b.inflate(this.a.e, paramViewGroup, false); ; localView = paramView)
    {
      ((x)localView).a(a(paramInt), 0);
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
 * Qualified Name:     android.support.v7.internal.view.menu.m
 * JD-Core Version:    0.6.2
 */