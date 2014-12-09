package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.support.v7.b.c;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class n
  implements a
{
  private static final int[] d = { 1, 4, 5, 3, 2, 0 };
  CharSequence a;
  Drawable b;
  View c;
  private final Context e;
  private final Resources f;
  private boolean g;
  private boolean h;
  private o i;
  private ArrayList j;
  private ArrayList k;
  private boolean l;
  private ArrayList m;
  private ArrayList n;
  private boolean o;
  private int p = 0;
  private ContextMenu.ContextMenuInfo q;
  private boolean r = false;
  private boolean s = false;
  private boolean t = false;
  private boolean u = false;
  private ArrayList v = new ArrayList();
  private CopyOnWriteArrayList w = new CopyOnWriteArrayList();
  private r x;

  public n(Context paramContext)
  {
    this.e = paramContext;
    this.f = paramContext.getResources();
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = true;
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = true;
    d(true);
  }

  private static int a(ArrayList paramArrayList, int paramInt)
  {
    for (int i1 = -1 + paramArrayList.size(); i1 >= 0; i1--)
      if (((r)paramArrayList.get(i1)).b() <= paramInt)
        return i1 + 1;
    return 0;
  }

  private MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = c(paramInt3);
    r localr = new r(this, paramInt1, paramInt2, paramInt3, i1, paramCharSequence, this.p);
    if (this.q != null)
      localr.a(this.q);
    this.j.add(a(this.j, i1), localr);
    b(true);
    return localr;
  }

  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Resources localResources = c();
    if (paramView != null)
    {
      this.c = paramView;
      this.a = null;
      this.b = null;
      b(false);
      return;
    }
    if (paramInt1 > 0)
    {
      this.a = localResources.getText(paramInt1);
      label47: if (paramInt2 <= 0)
        break label81;
      this.b = localResources.getDrawable(paramInt2);
    }
    while (true)
    {
      this.c = null;
      break;
      if (paramCharSequence == null)
        break label47;
      this.a = paramCharSequence;
      break label47;
      label81: if (paramDrawable != null)
        this.b = paramDrawable;
    }
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.j.size()));
    do
    {
      return;
      this.j.remove(paramInt);
    }
    while (!paramBoolean);
    b(true);
  }

  private boolean a(y paramy)
  {
    if (this.w.isEmpty())
      return false;
    Iterator localIterator = this.w.iterator();
    boolean bool1 = false;
    u localu;
    boolean bool2;
    if (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      localu = (u)localWeakReference.get();
      if (localu == null)
      {
        this.w.remove(localWeakReference);
        bool2 = bool1;
      }
    }
    while (true)
    {
      bool1 = bool2;
      break;
      if (!bool1)
      {
        bool2 = localu.a(paramy);
        continue;
        return bool1;
      }
      else
      {
        bool2 = bool1;
      }
    }
  }

  private static int c(int paramInt)
  {
    int i1 = (0xFFFF0000 & paramInt) >> 16;
    if ((i1 < 0) || (i1 >= d.length))
      throw new IllegalArgumentException("order does not contain a valid category.");
    return d[i1] << 16 | 0xFFFF & paramInt;
  }

  private void c(boolean paramBoolean)
  {
    if (this.w.isEmpty())
      return;
    f();
    Iterator localIterator = this.w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      u localu = (u)localWeakReference.get();
      if (localu == null)
        this.w.remove(localWeakReference);
      else
        localu.b(paramBoolean);
    }
    g();
  }

  private void d(boolean paramBoolean)
  {
    int i1 = 1;
    if ((paramBoolean) && (this.f.getConfiguration().keyboard != i1) && (this.f.getBoolean(c.abc_config_showMenuShortcutsWhenKeyboardPresent)));
    while (true)
    {
      this.h = i1;
      return;
      i1 = 0;
    }
  }

  public int a(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
      if (((r)this.j.get(i2)).getItemId() == paramInt)
        return i2;
    return -1;
  }

  public int a(int paramInt1, int paramInt2)
  {
    int i1 = size();
    if (paramInt2 < 0)
      paramInt2 = 0;
    for (int i2 = paramInt2; i2 < i1; i2++)
      if (((r)this.j.get(i2)).getGroupId() == paramInt1)
        return i2;
    return -1;
  }

  protected n a(Drawable paramDrawable)
  {
    a(0, null, 0, paramDrawable, null);
    return this;
  }

  protected n a(View paramView)
  {
    a(0, null, 0, null, paramView);
    return this;
  }

  protected n a(CharSequence paramCharSequence)
  {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }

  r a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.v;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    r localr;
    if (localArrayList.isEmpty())
      localr = null;
    label181: 
    while (true)
    {
      return localr;
      int i1 = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
      paramKeyEvent.getKeyData(localKeyData);
      int i2 = localArrayList.size();
      if (i2 == 1)
        return (r)localArrayList.get(0);
      boolean bool = a();
      int i3 = 0;
      if (i3 >= i2)
        break;
      localr = (r)localArrayList.get(i3);
      if (bool);
      for (int i4 = localr.getAlphabeticShortcut(); ; i4 = localr.getNumericShortcut())
      {
        if (((i4 == localKeyData.meta[0]) && ((i1 & 0x2) == 0)) || ((i4 == localKeyData.meta[2]) && ((i1 & 0x2) != 0)) || ((bool) && (i4 == 8) && (paramInt == 67)))
          break label181;
        i3++;
        break;
      }
    }
    return null;
  }

  void a(r paramr)
  {
    this.l = true;
    b(true);
  }

  public void a(u paramu)
  {
    this.w.add(new WeakReference(paramu));
    paramu.a(this.e, this);
    this.o = true;
  }

  void a(MenuItem paramMenuItem)
  {
    int i1 = paramMenuItem.getGroupId();
    int i2 = this.j.size();
    int i3 = 0;
    if (i3 < i2)
    {
      r localr = (r)this.j.get(i3);
      if ((localr.getGroupId() != i1) || (!localr.f()));
      while (!localr.isCheckable())
      {
        i3++;
        break;
      }
      if (localr == paramMenuItem);
      for (boolean bool = true; ; bool = false)
      {
        localr.b(bool);
        break;
      }
    }
  }

  void a(List paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = a();
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67))
      return;
    int i2 = this.j.size();
    int i3 = 0;
    label49: r localr;
    if (i3 < i2)
    {
      localr = (r)this.j.get(i3);
      if (localr.hasSubMenu())
        ((n)localr.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      if (!bool)
        break label181;
    }
    label181: for (int i4 = localr.getAlphabeticShortcut(); ; i4 = localr.getNumericShortcut())
    {
      if (((i1 & 0x5) == 0) && (i4 != 0) && ((i4 == localKeyData.meta[0]) || (i4 == localKeyData.meta[2]) || ((bool) && (i4 == 8) && (paramInt == 67))) && (localr.isEnabled()))
        paramList.add(localr);
      i3++;
      break label49;
      break;
    }
  }

  final void a(boolean paramBoolean)
  {
    if (this.u)
      return;
    this.u = true;
    Iterator localIterator = this.w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      u localu = (u)localWeakReference.get();
      if (localu == null)
        this.w.remove(localWeakReference);
      else
        localu.a(this, paramBoolean);
    }
    this.u = false;
  }

  boolean a()
  {
    return this.g;
  }

  boolean a(n paramn, MenuItem paramMenuItem)
  {
    return (this.i != null) && (this.i.a(paramn, paramMenuItem));
  }

  public boolean a(MenuItem paramMenuItem, int paramInt)
  {
    r localr = (r)paramMenuItem;
    boolean bool1 = false;
    if (localr != null)
    {
      boolean bool2 = localr.isEnabled();
      bool1 = false;
      if (bool2)
        break label29;
    }
    label29: boolean bool3;
    label92: 
    do
    {
      return bool1;
      bool3 = localr.a();
      android.support.v4.view.n localn = localr.m();
      if ((localn != null) && (localn.e()));
      for (int i1 = 1; ; i1 = 0)
      {
        if (!localr.n())
          break label92;
        bool1 = bool3 | localr.expandActionView();
        if (!bool1)
          break;
        a(true);
        return bool1;
      }
      if ((!localr.hasSubMenu()) && (i1 == 0))
        break;
      a(false);
      if (!localr.hasSubMenu())
        localr.a(new y(d(), this, localr));
      y localy = (y)localr.getSubMenu();
      if (i1 != 0)
        localn.a(localy);
      bool1 = bool3 | a(localy);
    }
    while (bool1);
    a(true);
    return bool1;
    if ((paramInt & 0x1) == 0)
      a(true);
    return bool3;
  }

  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.f.getString(paramInt));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }

  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }

  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.e.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i1;
    int i2;
    label52: ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i1 = localList.size();
      if ((paramInt4 & 0x1) == 0)
        removeGroup(paramInt1);
      i2 = 0;
      if (i2 >= i1)
        break label211;
      localResolveInfo = (ResolveInfo)localList.get(i2);
      if (localResolveInfo.specificIndex >= 0)
        break label198;
    }
    label198: for (Intent localIntent1 = paramIntent; ; localIntent1 = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      Intent localIntent2 = new Intent(localIntent1);
      localIntent2.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      MenuItem localMenuItem = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(localIntent2);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0))
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = localMenuItem;
      i2++;
      break label52;
      i1 = 0;
      break;
    }
    label211: return i1;
  }

  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.f.getString(paramInt));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    r localr = (r)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    y localy = new y(this.e, this, localr);
    localr.a(localy);
    return localy;
  }

  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }

  public int b(int paramInt)
  {
    return a(paramInt, 0);
  }

  void b(r paramr)
  {
    this.o = true;
    b(true);
  }

  void b(boolean paramBoolean)
  {
    if (!this.r)
    {
      if (paramBoolean)
      {
        this.l = true;
        this.o = true;
      }
      c(paramBoolean);
      return;
    }
    this.s = true;
  }

  public boolean b()
  {
    return this.h;
  }

  Resources c()
  {
    return this.f;
  }

  public boolean c(r paramr)
  {
    boolean bool1 = this.w.isEmpty();
    boolean bool2 = false;
    if (bool1)
      return bool2;
    f();
    Iterator localIterator = this.w.iterator();
    boolean bool3 = false;
    if (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      u localu = (u)localWeakReference.get();
      if (localu == null)
      {
        this.w.remove(localWeakReference);
        bool2 = bool3;
      }
      do
      {
        bool3 = bool2;
        break;
        bool2 = localu.a(this, paramr);
      }
      while (!bool2);
    }
    while (true)
    {
      g();
      if (!bool2)
        break;
      this.x = paramr;
      return bool2;
      bool2 = bool3;
    }
  }

  public void clear()
  {
    if (this.x != null)
      d(this.x);
    this.j.clear();
    b(true);
  }

  public void clearHeader()
  {
    this.b = null;
    this.a = null;
    this.c = null;
    b(false);
  }

  public void close()
  {
    a(true);
  }

  public Context d()
  {
    return this.e;
  }

  public boolean d(r paramr)
  {
    boolean bool1 = this.w.isEmpty();
    boolean bool2 = false;
    if (!bool1)
    {
      r localr = this.x;
      bool2 = false;
      if (localr == paramr);
    }
    else
    {
      return bool2;
    }
    f();
    Iterator localIterator = this.w.iterator();
    boolean bool3 = false;
    if (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      u localu = (u)localWeakReference.get();
      if (localu == null)
      {
        this.w.remove(localWeakReference);
        bool2 = bool3;
      }
      do
      {
        bool3 = bool2;
        break;
        bool2 = localu.b(this, paramr);
      }
      while (!bool2);
    }
    while (true)
    {
      g();
      if (!bool2)
        break;
      this.x = null;
      return bool2;
      bool2 = bool3;
    }
  }

  public void e()
  {
    if (this.i != null)
      this.i.a(this);
  }

  public void f()
  {
    if (!this.r)
    {
      this.r = true;
      this.s = false;
    }
  }

  public MenuItem findItem(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = (r)this.j.get(i2);
      if (((r)localObject).getItemId() == paramInt);
      do
      {
        return localObject;
        if (!((r)localObject).hasSubMenu())
          break;
        localObject = ((r)localObject).getSubMenu().findItem(paramInt);
      }
      while (localObject != null);
    }
    return null;
  }

  public void g()
  {
    this.r = false;
    if (this.s)
    {
      this.s = false;
      b(true);
    }
  }

  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.j.get(paramInt);
  }

  ArrayList h()
  {
    if (!this.l)
      return this.k;
    this.k.clear();
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      r localr = (r)this.j.get(i2);
      if (localr.isVisible())
        this.k.add(localr);
    }
    this.l = false;
    this.o = true;
    return this.k;
  }

  public boolean hasVisibleItems()
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
      if (((r)this.j.get(i2)).isVisible())
        return true;
    return false;
  }

  public void i()
  {
    if (!this.o)
      return;
    Iterator localIterator = this.w.iterator();
    boolean bool1 = false;
    if (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      u localu = (u)localWeakReference.get();
      if (localu == null)
        this.w.remove(localWeakReference);
      for (boolean bool2 = bool1; ; bool2 = bool1 | localu.f())
      {
        bool1 = bool2;
        break;
      }
    }
    if (bool1)
    {
      this.m.clear();
      this.n.clear();
      ArrayList localArrayList = h();
      int i1 = localArrayList.size();
      int i2 = 0;
      if (i2 < i1)
      {
        r localr = (r)localArrayList.get(i2);
        if (localr.i())
          this.m.add(localr);
        while (true)
        {
          i2++;
          break;
          this.n.add(localr);
        }
      }
    }
    else
    {
      this.m.clear();
      this.n.clear();
      this.n.addAll(h());
    }
    this.o = false;
  }

  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }

  ArrayList j()
  {
    i();
    return this.m;
  }

  ArrayList k()
  {
    i();
    return this.n;
  }

  public CharSequence l()
  {
    return this.a;
  }

  public Drawable m()
  {
    return this.b;
  }

  public View n()
  {
    return this.c;
  }

  public n o()
  {
    return this;
  }

  boolean p()
  {
    return this.t;
  }

  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), paramInt2);
  }

  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    r localr = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (localr != null)
      bool = a(localr, paramInt2);
    if ((paramInt2 & 0x2) != 0)
      a(true);
    return bool;
  }

  public r q()
  {
    return this.x;
  }

  public void removeGroup(int paramInt)
  {
    int i1 = b(paramInt);
    if (i1 >= 0)
    {
      int i2 = this.j.size() - i1;
      int i4;
      for (int i3 = 0; ; i3 = i4)
      {
        i4 = i3 + 1;
        if ((i3 >= i2) || (((r)this.j.get(i1)).getGroupId() != paramInt))
          break;
        a(i1, false);
      }
      b(true);
    }
  }

  public void removeItem(int paramInt)
  {
    a(a(paramInt), true);
  }

  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      r localr = (r)this.j.get(i2);
      if (localr.getGroupId() == paramInt)
      {
        localr.a(paramBoolean2);
        localr.setCheckable(paramBoolean1);
      }
    }
  }

  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      r localr = (r)this.j.get(i2);
      if (localr.getGroupId() == paramInt)
        localr.setEnabled(paramBoolean);
    }
  }

  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i1 = this.j.size();
    int i2 = 0;
    int i3 = 0;
    if (i2 < i1)
    {
      r localr = (r)this.j.get(i2);
      if ((localr.getGroupId() != paramInt) || (!localr.c(paramBoolean)))
        break label76;
    }
    label76: for (int i4 = 1; ; i4 = i3)
    {
      i2++;
      i3 = i4;
      break;
      if (i3 != 0)
        b(true);
      return;
    }
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.g = paramBoolean;
    b(false);
  }

  public int size()
  {
    return this.j.size();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.n
 * JD-Core Version:    0.6.2
 */