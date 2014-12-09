package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.a.d;
import android.support.v7.b.b;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class ScrollingTabContainerView$TabView extends LinearLayout
{
  private d a;
  private TextView b;
  private ImageView c;
  private View d;
  private ScrollingTabContainerView e;

  public ScrollingTabContainerView$TabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void a()
  {
    d locald = this.a;
    View localView = locald.c();
    if (localView != null)
    {
      ViewParent localViewParent = localView.getParent();
      if (localViewParent != this)
      {
        if (localViewParent != null)
          ((ViewGroup)localViewParent).removeView(localView);
        addView(localView);
      }
      this.d = localView;
      if (this.b != null)
        this.b.setVisibility(8);
      if (this.c != null)
      {
        this.c.setVisibility(8);
        this.c.setImageDrawable(null);
      }
    }
    label341: label366: 
    while (true)
    {
      return;
      if (this.d != null)
      {
        removeView(this.d);
        this.d = null;
      }
      Drawable localDrawable = locald.a();
      CharSequence localCharSequence = locald.b();
      if (localDrawable != null)
      {
        if (this.c == null)
        {
          ImageView localImageView = new ImageView(getContext());
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams2.gravity = 16;
          localImageView.setLayoutParams(localLayoutParams2);
          addView(localImageView, 0);
          this.c = localImageView;
        }
        this.c.setImageDrawable(localDrawable);
        this.c.setVisibility(0);
        if (localCharSequence == null)
          break label341;
        if (this.b == null)
        {
          r localr = new r(getContext(), null, b.actionBarTabTextStyle);
          localr.setEllipsize(TextUtils.TruncateAt.END);
          LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams1.gravity = 16;
          localr.setLayoutParams(localLayoutParams1);
          addView(localr);
          this.b = localr;
        }
        this.b.setText(localCharSequence);
        this.b.setVisibility(0);
      }
      while (true)
      {
        if (this.c == null)
          break label366;
        this.c.setContentDescription(locald.e());
        return;
        if (this.c == null)
          break;
        this.c.setVisibility(8);
        this.c.setImageDrawable(null);
        break;
        if (this.b != null)
        {
          this.b.setVisibility(8);
          this.b.setText(null);
        }
      }
    }
  }

  public void a(d paramd)
  {
    this.a = paramd;
    a();
  }

  void a(ScrollingTabContainerView paramScrollingTabContainerView, d paramd, boolean paramBoolean)
  {
    this.e = paramScrollingTabContainerView;
    this.a = paramd;
    if (paramBoolean)
      setGravity(19);
    a();
  }

  public d getTab()
  {
    return this.a;
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.e != null);
    for (int i = this.e.b; ; i = 0)
    {
      if ((i > 0) && (getMeasuredWidth() > i))
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), paramInt2);
      return;
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView.TabView
 * JD-Core Version:    0.6.2
 */