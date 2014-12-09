package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.support.v4.view.ag;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class r
  implements b
{
  private static String w;
  private static String x;
  private static String y;
  private static String z;
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private CharSequence e;
  private CharSequence f;
  private Intent g;
  private char h;
  private char i;
  private Drawable j;
  private int k = 0;
  private n l;
  private y m;
  private Runnable n;
  private MenuItem.OnMenuItemClickListener o;
  private int p = 16;
  private int q = 0;
  private View r;
  private android.support.v4.view.n s;
  private ag t;
  private boolean u = false;
  private ContextMenu.ContextMenuInfo v;

  r(n paramn, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.l = paramn;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
    this.q = paramInt5;
  }

  public b a(int paramInt)
  {
    Context localContext = this.l.d();
    a(LayoutInflater.from(localContext).inflate(paramInt, new LinearLayout(localContext), false));
    return this;
  }

  public b a(View paramView)
  {
    this.r = paramView;
    this.s = null;
    if ((paramView != null) && (paramView.getId() == -1) && (this.a > 0))
      paramView.setId(this.a);
    this.l.b(this);
    return this;
  }

  CharSequence a(x paramx)
  {
    if ((paramx != null) && (paramx.a()))
      return getTitleCondensed();
    return getTitle();
  }

  void a(y paramy)
  {
    this.m = paramy;
    paramy.setHeaderTitle(getTitle());
  }

  void a(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.v = paramContextMenuInfo;
  }

  public void a(boolean paramBoolean)
  {
    int i1 = 0xFFFFFFFB & this.p;
    if (paramBoolean);
    for (int i2 = 4; ; i2 = 0)
    {
      this.p = (i2 | i1);
      return;
    }
  }

  public boolean a()
  {
    if ((this.o != null) && (this.o.onMenuItemClick(this)));
    do
    {
      do
        return true;
      while (this.l.a(this.l.o(), this));
      if (this.n != null)
      {
        this.n.run();
        return true;
      }
      if (this.g != null)
        try
        {
          this.l.d().startActivity(this.g);
          return true;
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", localActivityNotFoundException);
        }
    }
    while ((this.s != null) && (this.s.d()));
    return false;
  }

  public int b()
  {
    return this.d;
  }

  public b b(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }

  void b(boolean paramBoolean)
  {
    int i1 = this.p;
    int i2 = 0xFFFFFFFD & this.p;
    if (paramBoolean);
    for (int i3 = 2; ; i3 = 0)
    {
      this.p = (i3 | i2);
      if (i1 != this.p)
        this.l.b(false);
      return;
    }
  }

  char c()
  {
    return this.i;
  }

  boolean c(boolean paramBoolean)
  {
    int i1 = this.p;
    int i2 = 0xFFFFFFF7 & this.p;
    if (paramBoolean);
    for (int i3 = 0; ; i3 = 8)
    {
      this.p = (i3 | i2);
      int i4 = this.p;
      boolean bool = false;
      if (i1 != i4)
        bool = true;
      return bool;
    }
  }

  public boolean collapseActionView()
  {
    if ((0x8 & this.q) == 0);
    do
    {
      return false;
      if (this.r == null)
        return true;
    }
    while ((this.t != null) && (!this.t.b(this)));
    return this.l.d(this);
  }

  String d()
  {
    char c1 = c();
    if (c1 == 0)
      return "";
    StringBuilder localStringBuilder = new StringBuilder(w);
    switch (c1)
    {
    default:
      localStringBuilder.append(c1);
    case '\n':
    case '\b':
    case ' ':
    }
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append(x);
      continue;
      localStringBuilder.append(y);
      continue;
      localStringBuilder.append(z);
    }
  }

  public void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.p = (0x20 | this.p);
      return;
    }
    this.p = (0xFFFFFFDF & this.p);
  }

  public void e(boolean paramBoolean)
  {
    this.u = paramBoolean;
    this.l.b(false);
  }

  boolean e()
  {
    return (this.l.b()) && (c() != 0);
  }

  public boolean expandActionView()
  {
    if (((0x8 & this.q) == 0) || (this.r == null));
    while ((this.t != null) && (!this.t.a(this)))
      return false;
    return this.l.c(this);
  }

  public boolean f()
  {
    return (0x4 & this.p) != 0;
  }

  public void g()
  {
    this.l.b(this);
  }

  public ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("Implementation should use getSupportActionProvider!");
  }

  public View getActionView()
  {
    if (this.r != null)
      return this.r;
    if (this.s != null)
    {
      this.r = this.s.a(this);
      return this.r;
    }
    return null;
  }

  public char getAlphabeticShortcut()
  {
    return this.i;
  }

  public int getGroupId()
  {
    return this.b;
  }

  public Drawable getIcon()
  {
    if (this.j != null)
      return this.j;
    if (this.k != 0)
    {
      Drawable localDrawable = this.l.c().getDrawable(this.k);
      this.k = 0;
      this.j = localDrawable;
      return localDrawable;
    }
    return null;
  }

  public Intent getIntent()
  {
    return this.g;
  }

  @ViewDebug.CapturedViewProperty
  public int getItemId()
  {
    return this.a;
  }

  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.v;
  }

  public char getNumericShortcut()
  {
    return this.h;
  }

  public int getOrder()
  {
    return this.c;
  }

  public SubMenu getSubMenu()
  {
    return this.m;
  }

  @ViewDebug.CapturedViewProperty
  public CharSequence getTitle()
  {
    return this.e;
  }

  public CharSequence getTitleCondensed()
  {
    if (this.f != null)
      return this.f;
    return this.e;
  }

  public boolean h()
  {
    return this.l.p();
  }

  public boolean hasSubMenu()
  {
    return this.m != null;
  }

  public boolean i()
  {
    return (0x20 & this.p) == 32;
  }

  public boolean isActionViewExpanded()
  {
    return this.u;
  }

  public boolean isCheckable()
  {
    return (0x1 & this.p) == 1;
  }

  public boolean isChecked()
  {
    return (0x2 & this.p) == 2;
  }

  public boolean isEnabled()
  {
    return (0x10 & this.p) != 0;
  }

  public boolean isVisible()
  {
    if ((this.s != null) && (this.s.b()))
      if (((0x8 & this.p) != 0) || (!this.s.c()));
    while ((0x8 & this.p) == 0)
    {
      return true;
      return false;
    }
    return false;
  }

  public boolean j()
  {
    return (0x1 & this.q) == 1;
  }

  public boolean k()
  {
    return (0x2 & this.q) == 2;
  }

  public boolean l()
  {
    return (0x4 & this.q) == 4;
  }

  public android.support.v4.view.n m()
  {
    return this.s;
  }

  public boolean n()
  {
    return ((0x8 & this.q) != 0) && (this.r != null);
  }

  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("Implementation should use setSupportActionProvider!");
  }

  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (this.i == paramChar)
      return this;
    this.i = Character.toLowerCase(paramChar);
    this.l.b(false);
    return this;
  }

  public MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = this.p;
    int i2 = 0xFFFFFFFE & this.p;
    if (paramBoolean);
    for (int i3 = 1; ; i3 = 0)
    {
      this.p = (i3 | i2);
      if (i1 != this.p)
        this.l.b(false);
      return this;
    }
  }

  public MenuItem setChecked(boolean paramBoolean)
  {
    if ((0x4 & this.p) != 0)
    {
      this.l.a(this);
      return this;
    }
    b(paramBoolean);
    return this;
  }

  public MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (this.p = (0x10 | this.p); ; this.p = (0xFFFFFFEF & this.p))
    {
      this.l.b(false);
      return this;
    }
  }

  public MenuItem setIcon(int paramInt)
  {
    this.j = null;
    this.k = paramInt;
    this.l.b(false);
    return this;
  }

  public MenuItem setIcon(Drawable paramDrawable)
  {
    this.k = 0;
    this.j = paramDrawable;
    this.l.b(false);
    return this;
  }

  public MenuItem setIntent(Intent paramIntent)
  {
    this.g = paramIntent;
    return this;
  }

  public MenuItem setNumericShortcut(char paramChar)
  {
    if (this.h == paramChar)
      return this;
    this.h = paramChar;
    this.l.b(false);
    return this;
  }

  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException("Implementation should use setSupportOnActionExpandListener!");
  }

  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.o = paramOnMenuItemClickListener;
    return this;
  }

  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.h = paramChar1;
    this.i = Character.toLowerCase(paramChar2);
    this.l.b(false);
    return this;
  }

  public void setShowAsAction(int paramInt)
  {
    switch (paramInt & 0x3)
    {
    default:
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    case 0:
    case 1:
    case 2:
    }
    this.q = paramInt;
    this.l.b(this);
  }

  public MenuItem setTitle(int paramInt)
  {
    return setTitle(this.l.d().getString(paramInt));
  }

  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    this.l.b(false);
    if (this.m != null)
      this.m.setHeaderTitle(paramCharSequence);
    return this;
  }

  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.f = paramCharSequence;
    if (paramCharSequence == null);
    this.l.b(false);
    return this;
  }

  public MenuItem setVisible(boolean paramBoolean)
  {
    if (c(paramBoolean))
      this.l.a(this);
    return this;
  }

  public String toString()
  {
    return this.e.toString();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.r
 * JD-Core Version:    0.6.2
 */