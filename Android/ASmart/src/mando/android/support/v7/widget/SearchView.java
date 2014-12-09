package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

public class SearchView extends LinearLayout
  implements android.support.v7.c.a
{
  static final a a = new a();
  private Bundle A;
  private Runnable B;
  private Runnable C;
  private Runnable D;
  private final Intent E;
  private final Intent F;
  private final WeakHashMap G;
  private c b;
  private b c;
  private View.OnFocusChangeListener d;
  private d e;
  private View.OnClickListener f;
  private boolean g;
  private boolean h;
  private android.support.v4.widget.a i;
  private View j;
  private View k;
  private View l;
  private ImageView m;
  private View n;
  private View o;
  private SearchView.SearchAutoComplete p;
  private ImageView q;
  private boolean r;
  private CharSequence s;
  private boolean t;
  private boolean u;
  private int v;
  private boolean w;
  private boolean x;
  private int y;
  private SearchableInfo z;

  private void a(boolean paramBoolean)
  {
    boolean bool1 = true;
    int i1 = 8;
    this.h = paramBoolean;
    int i2;
    boolean bool2;
    label33: int i3;
    if (paramBoolean)
    {
      i2 = 0;
      if (TextUtils.isEmpty(this.p.getText()))
        break label112;
      bool2 = bool1;
      this.j.setVisibility(i2);
      b(bool2);
      View localView = this.n;
      if (!paramBoolean)
        break label118;
      i3 = i1;
      label61: localView.setVisibility(i3);
      ImageView localImageView = this.q;
      if (!this.g)
        break label124;
      label81: localImageView.setVisibility(i1);
      h();
      if (bool2)
        break label129;
    }
    while (true)
    {
      c(bool1);
      g();
      return;
      i2 = i1;
      break;
      label112: bool2 = false;
      break label33;
      label118: i3 = 0;
      break label61;
      label124: i1 = 0;
      break label81;
      label129: bool1 = false;
    }
  }

  static boolean a(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 2;
  }

  private CharSequence b(CharSequence paramCharSequence)
  {
    if (!this.g)
      return paramCharSequence;
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
    localSpannableStringBuilder.append(paramCharSequence);
    Drawable localDrawable = getContext().getResources().getDrawable(getSearchIconId());
    int i1 = (int)(1.25D * this.p.getTextSize());
    localDrawable.setBounds(0, 0, i1, i1);
    localSpannableStringBuilder.setSpan(new ImageSpan(localDrawable), 1, 2, 33);
    return localSpannableStringBuilder;
  }

  private void b(boolean paramBoolean)
  {
    int i1 = 8;
    if ((this.r) && (f()) && (hasFocus()) && ((paramBoolean) || (!this.w)))
      i1 = 0;
    this.k.setVisibility(i1);
  }

  private void c(boolean paramBoolean)
  {
    int i1;
    if ((this.w) && (!c()) && (paramBoolean))
    {
      i1 = 0;
      this.k.setVisibility(8);
    }
    while (true)
    {
      this.o.setVisibility(i1);
      return;
      i1 = 8;
    }
  }

  private boolean e()
  {
    SearchableInfo localSearchableInfo = this.z;
    boolean bool1 = false;
    Intent localIntent;
    if (localSearchableInfo != null)
    {
      boolean bool2 = this.z.getVoiceSearchEnabled();
      bool1 = false;
      if (bool2)
      {
        if (!this.z.getVoiceSearchLaunchWebSearch())
          break label75;
        localIntent = this.E;
      }
    }
    while (true)
    {
      bool1 = false;
      if (localIntent != null)
      {
        ResolveInfo localResolveInfo = getContext().getPackageManager().resolveActivity(localIntent, 65536);
        bool1 = false;
        if (localResolveInfo != null)
          bool1 = true;
      }
      return bool1;
      label75: boolean bool3 = this.z.getVoiceSearchLaunchRecognizer();
      localIntent = null;
      if (bool3)
        localIntent = this.F;
    }
  }

  private boolean f()
  {
    return ((this.r) || (this.w)) && (!c());
  }

  private void g()
  {
    int i1 = 8;
    if ((f()) && ((this.k.getVisibility() == 0) || (this.o.getVisibility() == 0)))
      i1 = 0;
    this.l.setVisibility(i1);
  }

  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(android.support.v7.b.d.abc_search_view_preferred_width);
  }

  private int getSearchIconId()
  {
    TypedValue localTypedValue = new TypedValue();
    getContext().getTheme().resolveAttribute(android.support.v7.b.b.searchViewSearchIcon, localTypedValue, true);
    return localTypedValue.resourceId;
  }

  private void h()
  {
    int i1 = 1;
    int i2;
    label35: int i3;
    label47: Drawable localDrawable;
    if (!TextUtils.isEmpty(this.p.getText()))
    {
      i2 = i1;
      if ((i2 == 0) && ((!this.g) || (this.x)))
        break label85;
      ImageView localImageView = this.m;
      i3 = 0;
      if (i1 == 0)
        break label90;
      localImageView.setVisibility(i3);
      localDrawable = this.m.getDrawable();
      if (i2 == 0)
        break label97;
    }
    label85: label90: label97: for (int[] arrayOfInt = ENABLED_STATE_SET; ; arrayOfInt = EMPTY_STATE_SET)
    {
      localDrawable.setState(arrayOfInt);
      return;
      i2 = 0;
      break;
      i1 = 0;
      break label35;
      i3 = 8;
      break label47;
    }
  }

  private void i()
  {
    post(this.C);
  }

  private void j()
  {
    if (this.s != null)
      this.p.setHint(b(this.s));
    String str;
    do
    {
      return;
      if (this.z == null)
        break;
      int i1 = this.z.getHintId();
      str = null;
      if (i1 != 0)
        str = getContext().getString(i1);
    }
    while (str == null);
    this.p.setHint(b(str));
    return;
    this.p.setHint(b(""));
  }

  private void k()
  {
    int i1 = 1;
    this.p.setThreshold(this.z.getSuggestThreshold());
    this.p.setImeOptions(this.z.getImeOptions());
    int i2 = this.z.getInputType();
    if ((i2 & 0xF) == i1)
    {
      i2 &= -65537;
      if (this.z.getSuggestAuthority() != null)
        i2 = 0x80000 | (i2 | 0x10000);
    }
    this.p.setInputType(i2);
    if (this.i != null)
      this.i.a(null);
    if (this.z.getSuggestAuthority() != null)
    {
      this.i = new e(getContext(), this, this.z, this.G);
      this.p.setAdapter(this.i);
      e locale = (e)this.i;
      if (this.t)
        i1 = 2;
      locale.a(i1);
    }
  }

  private void l()
  {
    if (TextUtils.isEmpty(this.p.getText()))
    {
      if ((this.g) && ((this.c == null) || (!this.c.a())))
      {
        clearFocus();
        a(true);
      }
      return;
    }
    this.p.setText("");
    this.p.requestFocus();
    setImeVisibility(true);
  }

  private void m()
  {
    a(false);
    this.p.requestFocus();
    setImeVisibility(true);
    if (this.f != null)
      this.f.onClick(this);
  }

  private void n()
  {
    a.a(this.p);
    a.b(this.p);
  }

  private void setImeVisibility(boolean paramBoolean)
  {
    if (paramBoolean)
      post(this.B);
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      removeCallbacks(this.B);
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    }
    while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
  }

  private void setQuery(CharSequence paramCharSequence)
  {
    this.p.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.p;
    if (TextUtils.isEmpty(paramCharSequence));
    for (int i1 = 0; ; i1 = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i1);
      return;
    }
  }

  public void a()
  {
    if (this.x)
      return;
    this.x = true;
    this.y = this.p.getImeOptions();
    this.p.setImeOptions(0x2000000 | this.y);
    this.p.setText("");
    setIconified(false);
  }

  void a(CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
  }

  public void b()
  {
    clearFocus();
    a(true);
    this.p.setImeOptions(this.y);
    this.x = false;
  }

  public boolean c()
  {
    return this.h;
  }

  public void clearFocus()
  {
    this.u = true;
    setImeVisibility(false);
    super.clearFocus();
    this.p.clearFocus();
    this.u = false;
  }

  void d()
  {
    a(c());
    i();
    if (this.p.hasFocus())
      n();
  }

  public int getImeOptions()
  {
    return this.p.getImeOptions();
  }

  public int getInputType()
  {
    return this.p.getInputType();
  }

  public int getMaxWidth()
  {
    return this.v;
  }

  public CharSequence getQuery()
  {
    return this.p.getText();
  }

  public CharSequence getQueryHint()
  {
    CharSequence localCharSequence;
    if (this.s != null)
      localCharSequence = this.s;
    int i1;
    do
    {
      SearchableInfo localSearchableInfo;
      do
      {
        return localCharSequence;
        localSearchableInfo = this.z;
        localCharSequence = null;
      }
      while (localSearchableInfo == null);
      i1 = this.z.getHintId();
      localCharSequence = null;
    }
    while (i1 == 0);
    return getContext().getString(i1);
  }

  public android.support.v4.widget.a getSuggestionsAdapter()
  {
    return this.i;
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.C);
    post(this.D);
    super.onDetachedFromWindow();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.z == null)
      return false;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (c())
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    switch (i1)
    {
    default:
    case -2147483648:
    case 1073741824:
    case 0:
    }
    while (true)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), paramInt2);
      return;
      if (this.v > 0)
      {
        i2 = Math.min(this.v, i2);
      }
      else
      {
        i2 = Math.min(getPreferredWidth(), i2);
        continue;
        if (this.v > 0)
        {
          i2 = Math.min(this.v, i2);
          continue;
          if (this.v > 0)
            i2 = this.v;
          else
            i2 = getPreferredWidth();
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    i();
  }

  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.u);
    while (!isFocusable())
      return false;
    if (!c())
    {
      boolean bool = this.p.requestFocus(paramInt, paramRect);
      if (bool)
        a(false);
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }

  public void setAppSearchData(Bundle paramBundle)
  {
    this.A = paramBundle;
  }

  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      l();
      return;
    }
    m();
  }

  public void setIconifiedByDefault(boolean paramBoolean)
  {
    if (this.g == paramBoolean)
      return;
    this.g = paramBoolean;
    a(paramBoolean);
    j();
  }

  public void setImeOptions(int paramInt)
  {
    this.p.setImeOptions(paramInt);
  }

  public void setInputType(int paramInt)
  {
    this.p.setInputType(paramInt);
  }

  public void setMaxWidth(int paramInt)
  {
    this.v = paramInt;
    requestLayout();
  }

  public void setOnCloseListener(b paramb)
  {
    this.c = paramb;
  }

  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.d = paramOnFocusChangeListener;
  }

  public void setOnQueryTextListener(c paramc)
  {
    this.b = paramc;
  }

  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    this.f = paramOnClickListener;
  }

  public void setOnSuggestionListener(d paramd)
  {
    this.e = paramd;
  }

  public void setQueryHint(CharSequence paramCharSequence)
  {
    this.s = paramCharSequence;
    j();
  }

  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    this.t = paramBoolean;
    e locale;
    if ((this.i instanceof e))
    {
      locale = (e)this.i;
      if (!paramBoolean)
        break label35;
    }
    label35: for (int i1 = 2; ; i1 = 1)
    {
      locale.a(i1);
      return;
    }
  }

  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    this.z = paramSearchableInfo;
    if (this.z != null)
    {
      k();
      j();
    }
    this.w = e();
    if (this.w)
      this.p.setPrivateImeOptions("nm");
    a(c());
  }

  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    this.r = paramBoolean;
    a(c());
  }

  public void setSuggestionsAdapter(android.support.v4.widget.a parama)
  {
    this.i = parama;
    this.p.setAdapter(this.i);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView
 * JD-Core Version:    0.6.2
 */