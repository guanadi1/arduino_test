package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public class t
{
  private boolean A;
  int a = 2147483647;
  private Context b;
  private PopupWindow c;
  private ListAdapter d;
  private w e;
  private int f = -2;
  private int g = -2;
  private int h;
  private int i;
  private boolean j;
  private boolean k = false;
  private boolean l = false;
  private View m;
  private int n = 0;
  private DataSetObserver o;
  private View p;
  private Drawable q;
  private AdapterView.OnItemClickListener r;
  private AdapterView.OnItemSelectedListener s;
  private final ab t = new ab(this, null);
  private final aa u = new aa(this, null);
  private final z v = new z(this, null);
  private final x w = new x(this, null);
  private Runnable x;
  private Handler y = new Handler();
  private Rect z = new Rect();

  public t(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.b = paramContext;
    this.c = new PopupWindow(paramContext, paramAttributeSet, paramInt);
    this.c.setInputMethodMode(1);
  }

  private void i()
  {
    if (this.m != null)
    {
      ViewParent localViewParent = this.m.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.m);
    }
  }

  private int j()
  {
    int i1 = 1;
    w localw;
    View localView2;
    Object localObject;
    LinearLayout.LayoutParams localLayoutParams2;
    label252: LinearLayout.LayoutParams localLayoutParams3;
    if (this.e == null)
    {
      Context localContext = this.b;
      this.x = new u(this);
      if (!this.A)
      {
        int i9 = i1;
        this.e = new w(localContext, i9);
        if (this.q != null)
          this.e.setSelector(this.q);
        this.e.setAdapter(this.d);
        this.e.setOnItemClickListener(this.r);
        this.e.setFocusable(i1);
        this.e.setFocusableInTouchMode(i1);
        this.e.setOnItemSelectedListener(new v(this));
        this.e.setOnScrollListener(this.v);
        if (this.s != null)
          this.e.setOnItemSelectedListener(this.s);
        localw = this.e;
        localView2 = this.m;
        if (localView2 == null)
          break label701;
        localObject = new LinearLayout(localContext);
        ((LinearLayout)localObject).setOrientation(i1);
        localLayoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        switch (this.n)
        {
        default:
          Log.e("ListPopupWindow", "Invalid hint position " + this.n);
          localView2.measure(View.MeasureSpec.makeMeasureSpec(this.g, -2147483648), 0);
          localLayoutParams3 = (LinearLayout.LayoutParams)localView2.getLayoutParams();
        case 1:
        case 0:
        }
      }
    }
    for (int i11 = localView2.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin; ; i11 = 0)
    {
      this.c.setContentView((View)localObject);
      int i3 = i11;
      while (true)
      {
        label309: Drawable localDrawable = this.c.getBackground();
        int i8;
        int i4;
        if (localDrawable != null)
        {
          localDrawable.getPadding(this.z);
          i8 = this.z.top + this.z.bottom;
          if (this.j)
            break label688;
          this.i = (-this.z.top);
          i4 = i8;
        }
        while (true)
        {
          label373: if (this.c.getInputMethodMode() == 2);
          int i5;
          while (true)
          {
            i5 = a(b(), this.i, i1);
            if ((!this.k) && (this.f != -1))
              break label532;
            return i5 + i4;
            int i10 = 0;
            break;
            ((LinearLayout)localObject).addView(localw, localLayoutParams2);
            ((LinearLayout)localObject).addView(localView2);
            break label252;
            ((LinearLayout)localObject).addView(localView2);
            ((LinearLayout)localObject).addView(localw, localLayoutParams2);
            break label252;
            ((ViewGroup)this.c.getContentView());
            View localView1 = this.m;
            if (localView1 == null)
              break label695;
            LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
            i3 = localView1.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin;
            break label309;
            this.z.setEmpty();
            i4 = 0;
            break label373;
            int i2 = 0;
          }
          label532: int i6;
          switch (this.g)
          {
          default:
            i6 = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
          case -2:
          case -1:
          }
          while (true)
          {
            int i7 = this.e.a(i6, 0, -1, i5 - i3, -1);
            if (i7 > 0)
              i3 += i4;
            return i7 + i3;
            i6 = View.MeasureSpec.makeMeasureSpec(this.b.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), -2147483648);
            continue;
            i6 = View.MeasureSpec.makeMeasureSpec(this.b.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), 1073741824);
          }
          label688: i4 = i8;
        }
        label695: i3 = 0;
      }
      label701: localObject = localw;
    }
  }

  public int a(View paramView, int paramInt, boolean paramBoolean)
  {
    Rect localRect = new Rect();
    paramView.getWindowVisibleDisplayFrame(localRect);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i1 = localRect.bottom;
    if (paramBoolean)
      i1 = paramView.getContext().getResources().getDisplayMetrics().heightPixels;
    int i2 = Math.max(i1 - (arrayOfInt[1] + paramView.getHeight()) - paramInt, paramInt + (arrayOfInt[1] - localRect.top));
    if (this.c.getBackground() != null)
    {
      this.c.getBackground().getPadding(this.z);
      i2 -= this.z.top + this.z.bottom;
    }
    return i2;
  }

  public Drawable a()
  {
    return this.c.getBackground();
  }

  public void a(int paramInt)
  {
    this.n = paramInt;
  }

  public void a(Drawable paramDrawable)
  {
    this.c.setBackgroundDrawable(paramDrawable);
  }

  public void a(View paramView)
  {
    this.p = paramView;
  }

  public void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.r = paramOnItemClickListener;
  }

  public void a(ListAdapter paramListAdapter)
  {
    if (this.o == null)
      this.o = new y(this, null);
    while (true)
    {
      this.d = paramListAdapter;
      if (this.d != null)
        paramListAdapter.registerDataSetObserver(this.o);
      if (this.e != null)
        this.e.setAdapter(this.d);
      return;
      if (this.d != null)
        this.d.unregisterDataSetObserver(this.o);
    }
  }

  public void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.c.setOnDismissListener(paramOnDismissListener);
  }

  public void a(boolean paramBoolean)
  {
    this.A = true;
    this.c.setFocusable(paramBoolean);
  }

  public View b()
  {
    return this.p;
  }

  public void b(int paramInt)
  {
    this.h = paramInt;
  }

  public void c()
  {
    boolean bool1 = true;
    int i1 = -1;
    int i2 = j();
    boolean bool2 = g();
    if (this.c.isShowing())
    {
      int i5;
      if (this.g == i1)
      {
        i5 = i1;
        if (this.f != i1)
          break label216;
        if (!bool2)
          break label172;
        label49: if (!bool2)
          break label182;
        PopupWindow localPopupWindow4 = this.c;
        if (this.g != i1)
          break label177;
        label68: localPopupWindow4.setWindowLayoutMode(i1, 0);
      }
      while (true)
      {
        PopupWindow localPopupWindow2 = this.c;
        boolean bool3 = this.l;
        boolean bool4 = false;
        if (!bool3)
        {
          boolean bool5 = this.k;
          bool4 = false;
          if (!bool5)
            bool4 = bool1;
        }
        localPopupWindow2.setOutsideTouchable(bool4);
        this.c.update(b(), this.h, this.i, i5, i2);
        return;
        if (this.g == -2)
        {
          i5 = b().getWidth();
          break;
        }
        i5 = this.g;
        break;
        label172: i2 = i1;
        break label49;
        label177: i1 = 0;
        break label68;
        label182: PopupWindow localPopupWindow3 = this.c;
        if (this.g == i1);
        for (int i6 = i1; ; i6 = 0)
        {
          localPopupWindow3.setWindowLayoutMode(i6, i1);
          break;
        }
        label216: if (this.f != -2)
          i2 = this.f;
      }
    }
    int i3;
    label244: int i4;
    label255: PopupWindow localPopupWindow1;
    if (this.g == i1)
    {
      i3 = i1;
      if (this.f != i1)
        break label417;
      i4 = i1;
      this.c.setWindowLayoutMode(i3, i4);
      localPopupWindow1 = this.c;
      if ((this.l) || (this.k))
        break label457;
    }
    while (true)
    {
      localPopupWindow1.setOutsideTouchable(bool1);
      this.c.setTouchInterceptor(this.u);
      this.c.showAsDropDown(b(), this.h, this.i);
      this.e.setSelection(i1);
      if ((!this.A) || (this.e.isInTouchMode()))
        e();
      if (this.A)
        break;
      this.y.post(this.w);
      return;
      if (this.g == -2)
      {
        this.c.setWidth(b().getWidth());
        i3 = 0;
        break label244;
      }
      this.c.setWidth(this.g);
      i3 = 0;
      break label244;
      label417: if (this.f == -2)
      {
        this.c.setHeight(i2);
        i4 = 0;
        break label255;
      }
      this.c.setHeight(this.f);
      i4 = 0;
      break label255;
      label457: bool1 = false;
    }
  }

  public void c(int paramInt)
  {
    this.i = paramInt;
    this.j = true;
  }

  public void d()
  {
    this.c.dismiss();
    i();
    this.c.setContentView(null);
    this.e = null;
    this.y.removeCallbacks(this.t);
  }

  public void d(int paramInt)
  {
    this.g = paramInt;
  }

  public void e()
  {
    w localw = this.e;
    if (localw != null)
    {
      w.a(localw, true);
      localw.requestLayout();
    }
  }

  public void e(int paramInt)
  {
    Drawable localDrawable = this.c.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.z);
      this.g = (paramInt + (this.z.left + this.z.right));
      return;
    }
    d(paramInt);
  }

  public void f(int paramInt)
  {
    this.c.setInputMethodMode(paramInt);
  }

  public boolean f()
  {
    return this.c.isShowing();
  }

  public void g(int paramInt)
  {
    w localw = this.e;
    if ((f()) && (localw != null))
    {
      w.a(localw, false);
      localw.setSelection(paramInt);
      if (localw.getChoiceMode() != 0)
        localw.setItemChecked(paramInt, true);
    }
  }

  public boolean g()
  {
    return this.c.getInputMethodMode() == 2;
  }

  public ListView h()
  {
    return this.e;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.t
 * JD-Core Version:    0.6.2
 */