package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public class l
  implements u, AdapterView.OnItemClickListener
{
  Context a;
  LayoutInflater b;
  n c;
  int d;
  int e;
  m f;
  private int g;
  private v h;

  public l(int paramInt1, int paramInt2)
  {
    this.e = paramInt1;
    this.d = paramInt2;
  }

  public ListAdapter a()
  {
    if (this.f == null)
      this.f = new m(this);
    return this.f;
  }

  public void a(Context paramContext, n paramn)
  {
    if (this.d != 0)
    {
      this.a = new ContextThemeWrapper(paramContext, this.d);
      this.b = LayoutInflater.from(this.a);
    }
    while (true)
    {
      this.c = paramn;
      if (this.f != null)
        this.f.notifyDataSetChanged();
      return;
      if (this.a != null)
      {
        this.a = paramContext;
        if (this.b == null)
          this.b = LayoutInflater.from(this.a);
      }
    }
  }

  public void a(n paramn, boolean paramBoolean)
  {
    if (this.h != null)
      this.h.a(paramn, paramBoolean);
  }

  public void a(v paramv)
  {
    this.h = paramv;
  }

  public boolean a(n paramn, r paramr)
  {
    return false;
  }

  public boolean a(y paramy)
  {
    if (!paramy.hasVisibleItems())
      return false;
    new q(paramy).a(null);
    if (this.h != null)
      this.h.a(paramy);
    return true;
  }

  public void b(boolean paramBoolean)
  {
    if (this.f != null)
      this.f.notifyDataSetChanged();
  }

  public boolean b(n paramn, r paramr)
  {
    return false;
  }

  public boolean f()
  {
    return false;
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.c.a(this.f.a(paramInt), 0);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.l
 * JD-Core Version:    0.6.2
 */