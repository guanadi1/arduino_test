package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.b.b;
import android.support.v7.b.c;
import android.support.v7.b.d;
import android.support.v7.b.f;
import android.support.v7.b.j;
import android.util.DisplayMetrics;

public class a
{
  private Context a;

  private a(Context paramContext)
  {
    this.a = paramContext;
  }

  public static a a(Context paramContext)
  {
    return new a(paramContext);
  }

  public int a()
  {
    return this.a.getResources().getInteger(f.abc_max_action_buttons);
  }

  public boolean b()
  {
    return Build.VERSION.SDK_INT >= 11;
  }

  public int c()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }

  public boolean d()
  {
    return this.a.getResources().getBoolean(c.abc_action_bar_embed_tabs_pre_jb);
  }

  public int e()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, j.ActionBar, b.actionBarStyle, 0);
    int i = localTypedArray.getLayoutDimension(0, 0);
    Resources localResources = this.a.getResources();
    if (!d())
      i = Math.min(i, localResources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
    localTypedArray.recycle();
    return i;
  }

  public int f()
  {
    return this.a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.a
 * JD-Core Version:    0.6.2
 */