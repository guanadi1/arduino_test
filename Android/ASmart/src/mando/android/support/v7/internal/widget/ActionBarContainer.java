package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.b.e;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout
{
  private boolean a;
  private View b;
  private ActionBarView c;
  private Drawable d;
  private Drawable e;
  private Drawable f;
  private boolean g;
  private boolean h;

  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBackgroundDrawable(null);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionBar);
    this.d = localTypedArray.getDrawable(10);
    this.e = localTypedArray.getDrawable(11);
    if (getId() == e.split_action_bar)
    {
      this.g = bool;
      this.f = localTypedArray.getDrawable(12);
    }
    localTypedArray.recycle();
    if (this.g)
      if (this.f != null);
    while (true)
    {
      setWillNotDraw(bool);
      return;
      bool = false;
      continue;
      if ((this.d != null) || (this.e != null))
        bool = false;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.d != null) && (this.d.isStateful()))
      this.d.setState(getDrawableState());
    if ((this.e != null) && (this.e.isStateful()))
      this.e.setState(getDrawableState());
    if ((this.f != null) && (this.f.isStateful()))
      this.f.setState(getDrawableState());
  }

  public View getTabContainer()
  {
    return this.b;
  }

  public void onDraw(Canvas paramCanvas)
  {
    if ((getWidth() == 0) || (getHeight() == 0));
    do
    {
      do
      {
        return;
        if (!this.g)
          break;
      }
      while (this.f == null);
      this.f.draw(paramCanvas);
      return;
      if (this.d != null)
        this.d.draw(paramCanvas);
    }
    while ((this.e == null) || (!this.h));
    this.e.draw(paramCanvas);
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((ActionBarView)findViewById(e.action_bar));
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.a) || (super.onInterceptTouchEvent(paramMotionEvent));
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i;
    int j;
    int k;
    int n;
    label92: View localView;
    if ((this.b != null) && (this.b.getVisibility() != 8))
    {
      i = bool1;
      if ((this.b == null) || (this.b.getVisibility() == 8))
        break label161;
      j = getMeasuredHeight();
      k = this.b.getMeasuredHeight();
      if ((0x2 & this.c.getDisplayOptions()) != 0)
        break label202;
      int m = getChildCount();
      n = 0;
      if (n >= m)
        break label148;
      localView = getChildAt(n);
      if (localView != this.b)
        break label128;
    }
    while (true)
    {
      n++;
      break label92;
      i = 0;
      break;
      label128: if (!this.c.f())
        localView.offsetTopAndBottom(k);
    }
    label148: this.b.layout(paramInt1, 0, paramInt3, k);
    label161: if (this.g)
    {
      if (this.f == null)
        break label356;
      this.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    while (true)
    {
      if (bool1)
        invalidate();
      return;
      label202: this.b.layout(paramInt1, j - k, paramInt3, j);
      break;
      if (this.d != null)
        this.d.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
      for (boolean bool2 = bool1; ; bool2 = false)
      {
        boolean bool3 = false;
        if (i != 0)
        {
          Drawable localDrawable = this.e;
          bool3 = false;
          if (localDrawable != null)
            bool3 = bool1;
        }
        this.h = bool3;
        if (bool3)
        {
          this.e.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
          break;
        }
        bool1 = bool2;
        break;
      }
      label356: bool1 = false;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.c == null);
    while (true)
    {
      return;
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.c.getLayoutParams();
      if (this.c.f());
      for (int i = 0; (this.b != null) && (this.b.getVisibility() != 8) && (View.MeasureSpec.getMode(paramInt2) == -2147483648); i = this.c.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin)
      {
        int j = View.MeasureSpec.getSize(paramInt2);
        setMeasuredDimension(getMeasuredWidth(), Math.min(i + this.b.getMeasuredHeight(), j));
        return;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }

  public void setPrimaryBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.d != null)
    {
      this.d.setCallback(null);
      unscheduleDrawable(this.d);
    }
    this.d = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    if (this.g)
      if (this.f != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.d != null) || (this.e != null))
        bool = false;
    }
  }

  public void setSplitBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.f != null)
    {
      this.f.setCallback(null);
      unscheduleDrawable(this.f);
    }
    this.f = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    if (this.g)
      if (this.f != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.d != null) || (this.e != null))
        bool = false;
    }
  }

  public void setStackedBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.e != null)
    {
      this.e.setCallback(null);
      unscheduleDrawable(this.e);
    }
    this.e = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    if (this.g)
      if (this.f != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.d != null) || (this.e != null))
        bool = false;
    }
  }

  public void setTabContainer(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    if (this.b != null)
      removeView(this.b);
    this.b = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null)
    {
      addView(paramScrollingTabContainerView);
      ViewGroup.LayoutParams localLayoutParams = paramScrollingTabContainerView.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramScrollingTabContainerView.setAllowCollapse(false);
    }
  }

  public void setTransitioning(boolean paramBoolean)
  {
    this.a = paramBoolean;
    if (paramBoolean);
    for (int i = 393216; ; i = 262144)
    {
      setDescendantFocusability(i);
      return;
    }
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      if (this.d != null)
        this.d.setVisible(bool, false);
      if (this.e != null)
        this.e.setVisible(bool, false);
      if (this.f != null)
        this.f.setVisible(bool, false);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.d) && (!this.g)) || ((paramDrawable == this.e) && (this.h)) || ((paramDrawable == this.f) && (this.g)) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContainer
 * JD-Core Version:    0.6.2
 */