package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.b.b;
import android.support.v7.b.d;
import android.support.v7.b.g;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;

public class s
  implements u, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  static final int b = g.abc_popup_menu_item_layout;
  private Context a;
  boolean c;
  private LayoutInflater d;
  private android.support.v7.internal.widget.t e;
  private n f;
  private int g;
  private View h;
  private boolean i;
  private ViewTreeObserver j;
  private t k;
  private v l;
  private ViewGroup m;

  public s(Context paramContext, n paramn, View paramView, boolean paramBoolean)
  {
    this.a = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.f = paramn;
    this.i = paramBoolean;
    Resources localResources = paramContext.getResources();
    this.g = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
    this.h = paramView;
    paramn.a(this);
  }

  private int a(ListAdapter paramListAdapter)
  {
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = paramListAdapter.getCount();
    int i3 = 0;
    int i4 = 0;
    View localView1 = null;
    int i5 = 0;
    int i6;
    if (i3 < i2)
    {
      i6 = paramListAdapter.getItemViewType(i3);
      if (i6 == i4)
        break label129;
    }
    for (View localView2 = null; ; localView2 = localView1)
    {
      if (this.m == null)
        this.m = new FrameLayout(this.a);
      localView1 = paramListAdapter.getView(i3, localView2, this.m);
      localView1.measure(n, i1);
      i5 = Math.max(i5, localView1.getMeasuredWidth());
      i3++;
      i4 = i6;
      break;
      return i5;
      label129: i6 = i4;
    }
  }

  public void a(Context paramContext, n paramn)
  {
  }

  public void a(n paramn, boolean paramBoolean)
  {
    if (paramn != this.f);
    do
    {
      return;
      b();
    }
    while (this.l == null);
    this.l.a(paramn, paramBoolean);
  }

  public void a(v paramv)
  {
    this.l = paramv;
  }

  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public boolean a()
  {
    this.e = new android.support.v7.internal.widget.t(this.a, null, b.popupMenuStyle);
    this.e.a(this);
    this.e.a(this);
    this.k = new t(this, this.f);
    this.e.a(this.k);
    this.e.a(true);
    View localView = this.h;
    if (localView != null)
    {
      ViewTreeObserver localViewTreeObserver = this.j;
      int n = 0;
      if (localViewTreeObserver == null)
        n = 1;
      this.j = localView.getViewTreeObserver();
      if (n != 0)
        this.j.addOnGlobalLayoutListener(this);
      this.e.a(localView);
      this.e.e(Math.min(a(this.k), this.g));
      this.e.f(2);
      this.e.c();
      this.e.h().setOnKeyListener(this);
      return true;
    }
    return false;
  }

  public boolean a(n paramn, r paramr)
  {
    return false;
  }

  public boolean a(y paramy)
  {
    s locals;
    int i1;
    if (paramy.hasVisibleItems())
    {
      locals = new s(this.a, paramy, this.h, false);
      locals.a(this.l);
      int n = paramy.size();
      i1 = 0;
      if (i1 >= n)
        break label119;
      MenuItem localMenuItem = paramy.getItem(i1);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null));
    }
    label119: for (boolean bool = true; ; bool = false)
    {
      locals.a(bool);
      if (locals.a())
      {
        if (this.l != null)
          this.l.a(paramy);
        return true;
        i1++;
        break;
      }
      return false;
    }
  }

  public void b()
  {
    if (c())
      this.e.d();
  }

  public void b(boolean paramBoolean)
  {
    if (this.k != null)
      this.k.notifyDataSetChanged();
  }

  public boolean b(n paramn, r paramr)
  {
    return false;
  }

  public boolean c()
  {
    return (this.e != null) && (this.e.f());
  }

  public boolean f()
  {
    return false;
  }

  public void onDismiss()
  {
    this.e = null;
    this.f.close();
    if (this.j != null)
    {
      if (!this.j.isAlive())
        this.j = this.h.getViewTreeObserver();
      this.j.removeGlobalOnLayoutListener(this);
      this.j = null;
    }
  }

  public void onGlobalLayout()
  {
    if (c())
    {
      View localView = this.h;
      if ((localView != null) && (localView.isShown()))
        break label28;
      b();
    }
    label28: 
    while (!c())
      return;
    this.e.c();
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    t localt = this.k;
    t.a(localt).a(localt.a(paramInt), 0);
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      b();
      return true;
    }
    return false;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.s
 * JD-Core Version:    0.6.2
 */