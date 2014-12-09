package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.b.c;
import android.support.v7.b.j;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class ActionMenuItemView extends android.support.v7.internal.widget.r
  implements i, x, View.OnClickListener, View.OnLongClickListener
{
  private r a;
  private CharSequence b;
  private Drawable c;
  private p d;
  private boolean e;
  private boolean f;
  private int g;
  private int h;

  public ActionMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = paramContext.getResources().getBoolean(c.abc_config_allowActionMenuItemTextWithIcon);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionMenuItemView, 0, 0);
    this.g = localTypedArray.getDimensionPixelSize(0, 0);
    localTypedArray.recycle();
    setOnClickListener(this);
    setOnLongClickListener(this);
    setTransformationMethod(new b(this));
    this.h = -1;
  }

  private void e()
  {
    int i;
    if (!TextUtils.isEmpty(this.b))
    {
      i = 1;
      if (this.c != null)
      {
        boolean bool1 = this.a.l();
        j = 0;
        if (!bool1)
          break label57;
        if (!this.e)
        {
          boolean bool2 = this.f;
          j = 0;
          if (!bool2)
            break label57;
        }
      }
      int j = 1;
      label57: if ((i & j) == 0)
        break label79;
    }
    label79: for (CharSequence localCharSequence = this.b; ; localCharSequence = null)
    {
      setText(localCharSequence);
      return;
      i = 0;
      break;
    }
  }

  public void a(r paramr, int paramInt)
  {
    this.a = paramr;
    setIcon(paramr.getIcon());
    setTitle(paramr.a(this));
    setId(paramr.getItemId());
    if (paramr.isVisible());
    for (int i = 0; ; i = 8)
    {
      setVisibility(i);
      setEnabled(paramr.isEnabled());
      return;
    }
  }

  public boolean a()
  {
    return true;
  }

  public boolean b()
  {
    return !TextUtils.isEmpty(getText());
  }

  public boolean c()
  {
    return (b()) && (this.a.getIcon() == null);
  }

  public boolean d()
  {
    return b();
  }

  public r getItemData()
  {
    return this.a;
  }

  public void onClick(View paramView)
  {
    if (this.d != null)
      this.d.a(this.a);
  }

  public boolean onLongClick(View paramView)
  {
    if (b())
      return false;
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int i = getWidth();
    int j = getHeight();
    int k = arrayOfInt[1] + j / 2;
    int m = localContext.getResources().getDisplayMetrics().widthPixels;
    Toast localToast = Toast.makeText(localContext, this.a.getTitle(), 0);
    if (k < localRect.height())
      localToast.setGravity(53, m - arrayOfInt[0] - i / 2, j);
    while (true)
    {
      localToast.show();
      return true;
      localToast.setGravity(81, 0, j);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = b();
    if ((bool) && (this.h >= 0))
      super.setPadding(this.h, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = getMeasuredWidth();
    if (i == -2147483648);
    for (int m = Math.min(j, this.g); ; m = this.g)
    {
      if ((i != 1073741824) && (this.g > 0) && (k < m))
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), paramInt2);
      if ((!bool) && (this.c != null))
        super.setPadding((getMeasuredWidth() - this.c.getIntrinsicWidth()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      return;
    }
  }

  public void setCheckable(boolean paramBoolean)
  {
  }

  public void setChecked(boolean paramBoolean)
  {
  }

  public void setExpandedFormat(boolean paramBoolean)
  {
    if (this.f != paramBoolean)
    {
      this.f = paramBoolean;
      if (this.a != null)
        this.a.g();
    }
  }

  public void setIcon(Drawable paramDrawable)
  {
    this.c = paramDrawable;
    setCompoundDrawablesWithIntrinsicBounds(paramDrawable, null, null, null);
    e();
  }

  public void setItemInvoker(p paramp)
  {
    this.d = paramp;
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.h = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.b = paramCharSequence;
    setContentDescription(this.b);
    e();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuItemView
 * JD-Core Version:    0.6.2
 */