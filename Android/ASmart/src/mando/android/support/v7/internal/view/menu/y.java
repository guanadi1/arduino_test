package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class y extends n
  implements SubMenu
{
  private n d;
  private r e;

  public y(Context paramContext, n paramn, r paramr)
  {
    super(paramContext);
    this.d = paramn;
    this.e = paramr;
  }

  public boolean a()
  {
    return this.d.a();
  }

  public boolean a(n paramn, MenuItem paramMenuItem)
  {
    return (super.a(paramn, paramMenuItem)) || (this.d.a(paramn, paramMenuItem));
  }

  public boolean b()
  {
    return this.d.b();
  }

  public boolean c(r paramr)
  {
    return this.d.c(paramr);
  }

  public void clearHeader()
  {
  }

  public boolean d(r paramr)
  {
    return this.d.d(paramr);
  }

  public MenuItem getItem()
  {
    return this.e;
  }

  public n o()
  {
    return this.d;
  }

  public Menu r()
  {
    return this.d;
  }

  public SubMenu setHeaderIcon(int paramInt)
  {
    super.a(d().getResources().getDrawable(paramInt));
    return this;
  }

  public SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    return this;
  }

  public SubMenu setHeaderTitle(int paramInt)
  {
    super.a(d().getResources().getString(paramInt));
    return this;
  }

  public SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.a(paramCharSequence);
    return this;
  }

  public SubMenu setHeaderView(View paramView)
  {
    super.a(paramView);
    return this;
  }

  public SubMenu setIcon(int paramInt)
  {
    this.e.setIcon(paramInt);
    return this;
  }

  public SubMenu setIcon(Drawable paramDrawable)
  {
    this.e.setIcon(paramDrawable);
    return this;
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.d.setQwertyMode(paramBoolean);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.y
 * JD-Core Version:    0.6.2
 */