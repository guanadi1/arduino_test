package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class k
  implements u
{
  private v a;
  private int b;
  protected Context c;
  protected Context d;
  protected n e;
  protected LayoutInflater f;
  protected LayoutInflater g;
  protected w h;
  private int i;

  public w a(ViewGroup paramViewGroup)
  {
    if (this.h == null)
    {
      this.h = ((w)this.f.inflate(this.b, paramViewGroup, false));
      this.h.a(this.e);
      b(true);
    }
    return this.h;
  }

  public View a(r paramr, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof x));
    for (x localx = (x)paramView; ; localx = b(paramViewGroup))
    {
      a(paramr, localx);
      return (View)localx;
    }
  }

  public void a(Context paramContext, n paramn)
  {
    this.d = paramContext;
    this.g = LayoutInflater.from(this.d);
    this.e = paramn;
  }

  public void a(n paramn, boolean paramBoolean)
  {
    if (this.a != null)
      this.a.a(paramn, paramBoolean);
  }

  public abstract void a(r paramr, x paramx);

  public void a(v paramv)
  {
    this.a = paramv;
  }

  protected void a(View paramView, int paramInt)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup != null)
      localViewGroup.removeView(paramView);
    ((ViewGroup)this.h).addView(paramView, paramInt);
  }

  public boolean a(int paramInt, r paramr)
  {
    return true;
  }

  public boolean a(n paramn, r paramr)
  {
    return false;
  }

  public boolean a(y paramy)
  {
    if (this.a != null)
      return this.a.a(paramy);
    return false;
  }

  protected boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }

  public x b(ViewGroup paramViewGroup)
  {
    return (x)this.f.inflate(this.i, paramViewGroup, false);
  }

  public void b(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.h;
    if (localViewGroup == null);
    label185: label194: 
    while (true)
    {
      return;
      int j;
      int n;
      if (this.e != null)
      {
        this.e.i();
        ArrayList localArrayList = this.e.h();
        int k = localArrayList.size();
        int m = 0;
        j = 0;
        if (m < k)
        {
          r localr1 = (r)localArrayList.get(m);
          if (!a(j, localr1))
            break label185;
          View localView1 = localViewGroup.getChildAt(j);
          if ((localView1 instanceof x));
          for (r localr2 = ((x)localView1).getItemData(); ; localr2 = null)
          {
            View localView2 = a(localr1, localView1, localViewGroup);
            if (localr1 != localr2)
              localView2.setPressed(false);
            if (localView2 != localView1)
              a(localView2, j);
            n = j + 1;
            m++;
            j = n;
            break;
          }
        }
      }
      while (true)
      {
        if (j >= localViewGroup.getChildCount())
          break label194;
        if (!a(localViewGroup, j))
        {
          j++;
          continue;
          n = j;
          break;
          j = 0;
        }
      }
    }
  }

  public boolean b(n paramn, r paramr)
  {
    return false;
  }

  public boolean f()
  {
    return false;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.k
 * JD-Core Version:    0.6.2
 */