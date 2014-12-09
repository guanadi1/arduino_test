package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.b.c;
import android.support.v7.b.j;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class a extends ViewGroup
{
  protected ActionMenuView a;
  protected ActionMenuPresenter b;
  protected ActionBarContainer c;
  protected boolean d;
  protected boolean e;
  protected int f;

  a(Context paramContext)
  {
    super(paramContext);
  }

  a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected int a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() - paramInt3);
  }

  public boolean a()
  {
    if (this.b != null)
      return this.b.a();
    return false;
  }

  protected int b(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = paramInt2 + (paramInt3 - j) / 2;
    paramView.layout(paramInt1, k, paramInt1 + i, j + k);
    return i;
  }

  public void b()
  {
    post(new b(this));
  }

  protected int c(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = paramInt2 + (paramInt3 - j) / 2;
    paramView.layout(paramInt1 - i, k, paramInt1, j + k);
    return i;
  }

  public boolean c()
  {
    if (this.b != null)
      return this.b.e();
    return false;
  }

  public int getAnimatedVisibility()
  {
    return getVisibility();
  }

  public int getContentHeight()
  {
    return this.f;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    TypedArray localTypedArray = getContext().obtainStyledAttributes(null, j.ActionBar, android.support.v7.b.b.actionBarStyle, 0);
    setContentHeight(localTypedArray.getLayoutDimension(0, 0));
    localTypedArray.recycle();
    if (this.e)
      setSplitActionBar(getContext().getResources().getBoolean(c.abc_split_action_bar_is_narrow));
    if (this.b != null)
      this.b.a(paramConfiguration);
  }

  public void setContentHeight(int paramInt)
  {
    this.f = paramInt;
    requestLayout();
  }

  public void setSplitActionBar(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void setSplitView(ActionBarContainer paramActionBarContainer)
  {
    this.c = paramActionBarContainer;
  }

  public void setSplitWhenNarrow(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
      super.setVisibility(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.a
 * JD-Core Version:    0.6.2
 */