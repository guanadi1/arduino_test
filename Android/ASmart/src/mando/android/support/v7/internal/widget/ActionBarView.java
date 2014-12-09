package android.support.v7.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v7.b.e;
import android.support.v7.b.j;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class ActionBarView extends a
{
  private ProgressBarICS A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F;
  private int G;
  private boolean H;
  private boolean I;
  private boolean J;
  private boolean K;
  private n L;
  private ActionBarContextView M;
  private android.support.v7.internal.view.menu.a N;
  private SpinnerAdapter O;
  private android.support.v7.a.c P;
  private Runnable Q;
  private i R;
  private final p S = new f(this);
  private final View.OnClickListener T = new g(this);
  private final View.OnClickListener U = new h(this);
  View g;
  Window.Callback h;
  private int i;
  private int j = -1;
  private CharSequence k;
  private CharSequence l;
  private Drawable m;
  private Drawable n;
  private Context o;
  private ActionBarView.HomeView p;
  private ActionBarView.HomeView q;
  private LinearLayout r;
  private TextView s;
  private TextView t;
  private View u;
  private aj v;
  private LinearLayout w;
  private ScrollingTabContainerView x;
  private View y;
  private ProgressBarICS z;

  public ActionBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.o = paramContext;
    setBackgroundResource(0);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionBar, android.support.v7.b.b.actionBarStyle, 0);
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    PackageManager localPackageManager = paramContext.getPackageManager();
    this.i = localTypedArray.getInt(2, 0);
    this.k = localTypedArray.getText(1);
    this.l = localTypedArray.getText(4);
    this.n = localTypedArray.getDrawable(8);
    if ((this.n != null) || (Build.VERSION.SDK_INT < 9) || ((paramContext instanceof Activity)));
    try
    {
      this.n = localPackageManager.getActivityLogo(((Activity)paramContext).getComponentName());
      if (this.n == null)
        this.n = localApplicationInfo.loadLogo(localPackageManager);
      this.m = localTypedArray.getDrawable(7);
      if (this.m == null)
        if (!(paramContext instanceof Activity));
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      try
      {
        this.m = localPackageManager.getActivityIcon(((Activity)paramContext).getComponentName());
        if (this.m == null)
          this.m = localApplicationInfo.loadIcon(localPackageManager);
        LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
        int i1 = localTypedArray.getResourceId(14, android.support.v7.b.g.abc_action_bar_home);
        this.p = ((ActionBarView.HomeView)localLayoutInflater.inflate(i1, this, false));
        this.q = ((ActionBarView.HomeView)localLayoutInflater.inflate(i1, this, false));
        this.q.a(true);
        this.q.setOnClickListener(this.T);
        this.q.setContentDescription(getResources().getText(android.support.v7.b.h.abc_action_bar_up_description));
        this.D = localTypedArray.getResourceId(5, 0);
        this.E = localTypedArray.getResourceId(6, 0);
        this.F = localTypedArray.getResourceId(15, 0);
        this.G = localTypedArray.getResourceId(16, 0);
        this.B = localTypedArray.getDimensionPixelOffset(17, 0);
        this.C = localTypedArray.getDimensionPixelOffset(18, 0);
        setDisplayOptions(localTypedArray.getInt(3, 0));
        int i2 = localTypedArray.getResourceId(13, 0);
        if (i2 != 0)
        {
          this.y = localLayoutInflater.inflate(i2, this, false);
          this.i = 0;
          setDisplayOptions(0x10 | this.j);
        }
        this.f = localTypedArray.getLayoutDimension(0, 0);
        localTypedArray.recycle();
        this.N = new android.support.v7.internal.view.menu.a(paramContext, 0, 16908332, 0, 0, this.k);
        this.p.setOnClickListener(this.U);
        this.p.setClickable(true);
        this.p.setFocusable(true);
        return;
        localNameNotFoundException2 = localNameNotFoundException2;
        Log.e("ActionBarView", "Activity component name not found!", localNameNotFoundException2);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        while (true)
          Log.e("ActionBarView", "Activity component name not found!", localNameNotFoundException1);
      }
    }
  }

  private void g()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label200: int i1;
    label217: LinearLayout localLinearLayout;
    if (this.r == null)
    {
      this.r = ((LinearLayout)LayoutInflater.from(getContext()).inflate(android.support.v7.b.g.abc_action_bar_title_item, this, false));
      this.s = ((TextView)this.r.findViewById(e.action_bar_title));
      this.t = ((TextView)this.r.findViewById(e.action_bar_subtitle));
      this.u = this.r.findViewById(e.up);
      this.r.setOnClickListener(this.U);
      if (this.D != 0)
        this.s.setTextAppearance(this.o, this.D);
      if (this.k != null)
        this.s.setText(this.k);
      if (this.E != 0)
        this.t.setTextAppearance(this.o, this.E);
      if (this.l != null)
      {
        this.t.setText(this.l);
        this.t.setVisibility(0);
      }
      if ((0x4 & this.j) == 0)
        break label289;
      bool2 = bool1;
      if ((0x2 & this.j) == 0)
        break label294;
      bool3 = bool1;
      View localView = this.u;
      if (bool3)
        break label305;
      if (!bool2)
        break label299;
      i1 = 0;
      localView.setVisibility(i1);
      localLinearLayout = this.r;
      if ((!bool2) || (bool3))
        break label312;
    }
    while (true)
    {
      localLinearLayout.setEnabled(bool1);
      addView(this.r);
      if ((this.g != null) || ((TextUtils.isEmpty(this.k)) && (TextUtils.isEmpty(this.l))))
        this.r.setVisibility(8);
      return;
      label289: bool2 = false;
      break;
      label294: bool3 = false;
      break label200;
      label299: i1 = 4;
      break label217;
      label305: i1 = 8;
      break label217;
      label312: bool1 = false;
    }
  }

  private void setTitleImpl(CharSequence paramCharSequence)
  {
    this.k = paramCharSequence;
    int i1;
    LinearLayout localLinearLayout;
    int i2;
    if (this.s != null)
    {
      this.s.setText(paramCharSequence);
      if ((this.g != null) || ((0x8 & this.j) == 0) || ((TextUtils.isEmpty(this.k)) && (TextUtils.isEmpty(this.l))))
        break label96;
      i1 = 1;
      localLinearLayout = this.r;
      i2 = 0;
      if (i1 == 0)
        break label101;
    }
    while (true)
    {
      localLinearLayout.setVisibility(i2);
      if (this.N != null)
        this.N.setTitle(paramCharSequence);
      return;
      label96: i1 = 0;
      break;
      label101: i2 = 8;
    }
  }

  public void d()
  {
    this.z = new ProgressBarICS(this.o, null, 0, this.F);
    this.z.setId(e.progress_horizontal);
    this.z.setMax(10000);
    this.z.setVisibility(8);
    addView(this.z);
  }

  public void e()
  {
    this.A = new ProgressBarICS(this.o, null, 0, this.G);
    this.A.setId(e.progress_circular);
    this.A.setVisibility(8);
    addView(this.A);
  }

  public boolean f()
  {
    return this.K;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new android.support.v7.a.b(19);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new android.support.v7.a.b(getContext(), paramAttributeSet);
  }

  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
      paramLayoutParams = generateDefaultLayoutParams();
    return paramLayoutParams;
  }

  public View getCustomNavigationView()
  {
    return this.y;
  }

  public int getDisplayOptions()
  {
    return this.j;
  }

  public SpinnerAdapter getDropdownAdapter()
  {
    return this.O;
  }

  public int getDropdownSelectedPosition()
  {
    return this.v.f();
  }

  public int getNavigationMode()
  {
    return this.i;
  }

  public CharSequence getSubtitle()
  {
    return this.l;
  }

  public CharSequence getTitle()
  {
    return this.k;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.s = null;
    this.t = null;
    this.u = null;
    if ((this.r != null) && (this.r.getParent() == this))
      removeView(this.r);
    this.r = null;
    if ((0x8 & this.j) != 0)
      g();
    if ((this.x != null) && (this.I))
    {
      ViewGroup.LayoutParams localLayoutParams = this.x.getLayoutParams();
      if (localLayoutParams != null)
      {
        localLayoutParams.width = -2;
        localLayoutParams.height = -1;
      }
      this.x.setAllowCollapse(true);
    }
    if (this.z != null)
    {
      removeView(this.z);
      d();
    }
    if (this.A != null)
    {
      removeView(this.A);
      e();
    }
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.Q);
    if (this.b != null)
    {
      this.b.b();
      this.b.d();
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    addView(this.p);
    if ((this.y != null) && ((0x10 & this.j) != 0))
    {
      ViewParent localViewParent = this.y.getParent();
      if (localViewParent != this)
      {
        if ((localViewParent instanceof ViewGroup))
          ((ViewGroup)localViewParent).removeView(this.y);
        addView(this.y);
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingTop();
    int i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    if (i3 <= 0)
      return;
    ActionBarView.HomeView localHomeView;
    label47: int i28;
    if (this.g != null)
    {
      localHomeView = this.q;
      if (localHomeView.getVisibility() == 8)
        break label944;
      i28 = localHomeView.a();
    }
    label299: label944: for (int i4 = i1 + (i28 + b(localHomeView, i1 + i28, i2, i3)); ; i4 = i1)
    {
      int i27;
      if (this.g == null)
      {
        if ((this.r == null) || (this.r.getVisibility() == 8) || ((0x8 & this.j) == 0))
          break label634;
        i27 = 1;
        label126: if (i27 != 0)
          i4 += b(this.r, i4, i2, i3);
      }
      label180: int i5;
      label184: int i6;
      switch (this.i)
      {
      default:
        i5 = i4;
        i6 = paramInt3 - paramInt1 - getPaddingRight();
        if ((this.a != null) && (this.a.getParent() == this))
        {
          c(this.a, i6, i2, i3);
          i6 -= this.a.getMeasuredWidth();
        }
        if ((this.A != null) && (this.A.getVisibility() != 8))
          c(this.A, i6, i2, i3);
        break;
      case 0:
      case 1:
      case 2:
      }
      for (int i7 = i6 - this.A.getMeasuredWidth(); ; i7 = i6)
      {
        View localView;
        if (this.g != null)
          localView = this.g;
        while (true)
        {
          android.support.v7.a.b localb;
          label326: int i9;
          label338: int i10;
          int i14;
          int i11;
          int i12;
          int i13;
          if (localView != null)
          {
            ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
            if (!(localLayoutParams instanceof android.support.v7.a.b))
              break label769;
            localb = (android.support.v7.a.b)localLayoutParams;
            if (localb == null)
              break label775;
            i9 = localb.a;
            i10 = localView.getMeasuredWidth();
            if (localb == null)
              break label914;
            int i23 = i5 + localb.leftMargin;
            int i24 = i7 - localb.rightMargin;
            int i25 = localb.topMargin;
            int i26 = localb.bottomMargin;
            i14 = i25;
            i11 = i24;
            i12 = i23;
            i13 = i26;
          }
          while (true)
          {
            int i15 = i9 & 0x7;
            int i22;
            label434: int i16;
            if (i15 == 1)
            {
              i22 = (getWidth() - i10) / 2;
              if (i22 < i12)
              {
                i15 = 3;
                i16 = i15;
              }
            }
            while (true)
            {
              label438: int i17;
              label479: int i19;
              switch (i16)
              {
              case 2:
              case 4:
              default:
                i17 = 0;
                int i18 = i9 & 0x70;
                if (i9 == -1)
                  i18 = 16;
                i19 = 0;
                switch (i18)
                {
                default:
                case 16:
                case 48:
                case 80:
                }
                break;
              case 1:
              case 3:
              case 5:
              }
              while (true)
              {
                int i20 = localView.getMeasuredWidth();
                localView.layout(i17, i19, i17 + i20, i19 + localView.getMeasuredHeight());
                (i12 + i20);
                if (this.z == null)
                  break;
                this.z.bringToFront();
                int i8 = this.z.getMeasuredHeight() / 2;
                this.z.layout(this.B, -i8, this.B + this.z.getMeasuredWidth(), i8);
                return;
                localHomeView = this.p;
                break label47;
                label634: i27 = 0;
                break label126;
                i5 = i4;
                break label184;
                if (this.w == null)
                  break label180;
                if (i27 != 0)
                  i4 += this.C;
                i5 = i4 + (b(this.w, i4, i2, i3) + this.C);
                break label184;
                if (this.x == null)
                  break label180;
                if (i27 != 0)
                  i4 += this.C;
                i5 = i4 + (b(this.x, i4, i2, i3) + this.C);
                break label184;
                if (((0x10 & this.j) == 0) || (this.y == null))
                  break label931;
                localView = this.y;
                break label299;
                localb = null;
                break label326;
                i9 = 19;
                break label338;
                if (i22 + i10 <= i11)
                  break label434;
                i15 = 5;
                break label434;
                if (i9 != -1)
                  break label907;
                i16 = 3;
                break label438;
                i17 = (getWidth() - i10) / 2;
                break label479;
                i17 = i12;
                break label479;
                i17 = i11 - i10;
                break label479;
                int i21 = getPaddingTop();
                i19 = (getHeight() - getPaddingBottom() - i21 - localView.getMeasuredHeight()) / 2;
                continue;
                i19 = i14 + getPaddingTop();
                continue;
                i19 = getHeight() - getPaddingBottom() - localView.getMeasuredHeight() - i13;
              }
              i16 = i15;
            }
            i11 = i7;
            i12 = i5;
            i13 = 0;
            i14 = 0;
          }
          localView = null;
        }
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    if (this.J)
    {
      int i40 = 0;
      for (int i41 = 0; i41 < i1; i41++)
      {
        View localView2 = getChildAt(i41);
        if ((localView2.getVisibility() != 8) && ((localView2 != this.a) || (this.a.getChildCount() != 0)))
          i40++;
      }
      if (i40 == 0)
      {
        setMeasuredDimension(0, 0);
        this.K = true;
        return;
      }
    }
    this.K = false;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"MATCH_PARENT\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) != -2147483648)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3;
    label211: int i4;
    int i7;
    int i8;
    int i9;
    int i10;
    ActionBarView.HomeView localHomeView;
    label280: ViewGroup.LayoutParams localLayoutParams2;
    int i38;
    label315: int i12;
    int i11;
    if (this.f > 0)
    {
      i3 = this.f;
      i4 = getPaddingTop() + getPaddingBottom();
      int i5 = getPaddingLeft();
      int i6 = getPaddingRight();
      i7 = i3 - i4;
      i8 = View.MeasureSpec.makeMeasureSpec(i7, -2147483648);
      i9 = i2 - i5 - i6;
      i10 = i9 / 2;
      if (this.g == null)
        break label887;
      localHomeView = this.q;
      if (localHomeView.getVisibility() == 8)
        break label1331;
      localLayoutParams2 = localHomeView.getLayoutParams();
      if (localLayoutParams2.width >= 0)
        break label896;
      i38 = View.MeasureSpec.makeMeasureSpec(i9, -2147483648);
      localHomeView.measure(i38, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
      int i39 = localHomeView.getMeasuredWidth() + localHomeView.a();
      i12 = Math.max(0, i9 - i39);
      i11 = Math.max(0, i12 - i39);
    }
    while (true)
    {
      if ((this.a != null) && (this.a.getParent() == this))
      {
        i12 = a(this.a, i12, i8, 0);
        i10 = Math.max(0, i10 - this.a.getMeasuredWidth());
      }
      if ((this.A != null) && (this.A.getVisibility() != 8))
      {
        i12 = a(this.A, i12, i8, 0);
        i10 = Math.max(0, i10 - this.A.getMeasuredWidth());
      }
      int i13;
      label496: int i14;
      label528: int i15;
      View localView1;
      if ((this.r != null) && (this.r.getVisibility() != 8) && ((0x8 & this.j) != 0))
      {
        i13 = 1;
        if (this.g == null);
        switch (this.i)
        {
        default:
          i14 = i11;
          i15 = i12;
          if (this.g != null)
            localView1 = this.g;
          break;
        case 1:
        case 2:
        }
      }
      while (true)
      {
        label549: ViewGroup.LayoutParams localLayoutParams1;
        android.support.v7.a.b localb;
        label580: int i20;
        int i21;
        label629: int i22;
        int i23;
        label675: int i24;
        label695: int i25;
        int i26;
        if (localView1 != null)
        {
          localLayoutParams1 = generateLayoutParams(localView1.getLayoutParams());
          if (!(localLayoutParams1 instanceof android.support.v7.a.b))
            break label1168;
          localb = (android.support.v7.a.b)localLayoutParams1;
          int i19 = 0;
          i20 = 0;
          if (localb != null)
          {
            i20 = localb.leftMargin + localb.rightMargin;
            i19 = localb.topMargin + localb.bottomMargin;
          }
          if (this.f > 0)
            break label1174;
          i21 = -2147483648;
          if (localLayoutParams1.height >= 0)
            i7 = Math.min(localLayoutParams1.height, i7);
          i22 = Math.max(0, i7 - i19);
          if (localLayoutParams1.width == -2)
            break label1200;
          i23 = 1073741824;
          if (localLayoutParams1.width < 0)
            break label1208;
          i24 = Math.min(localLayoutParams1.width, i15);
          i25 = Math.max(0, i24 - i20);
          if (localb == null)
            break label1215;
          i26 = localb.a;
          label718: if (((i26 & 0x7) != 1) || (localLayoutParams1.width != -1))
            break label1318;
        }
        label896: label1168: label1174: label1311: label1318: for (int i27 = 2 * Math.min(i14, i10); ; i27 = i25)
        {
          localView1.measure(View.MeasureSpec.makeMeasureSpec(i27, i23), View.MeasureSpec.makeMeasureSpec(i22, i21));
          i15 -= i20 + localView1.getMeasuredWidth();
          if ((this.g == null) && (i13 != 0))
          {
            a(this.r, i15, View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), 0);
            Math.max(0, i14 - this.r.getMeasuredWidth());
          }
          int i16;
          int i17;
          label841: int i18;
          if (this.f <= 0)
          {
            i16 = 0;
            i17 = 0;
            if (i17 < i1)
            {
              i18 = i4 + getChildAt(i17).getMeasuredHeight();
              if (i18 <= i16)
                break label1311;
            }
          }
          while (true)
          {
            i17++;
            i16 = i18;
            break label841;
            i3 = View.MeasureSpec.getSize(paramInt2);
            break label211;
            label887: localHomeView = this.p;
            break label280;
            i38 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
            break label315;
            i13 = 0;
            break label496;
            if (this.w == null)
              break label528;
            if (i13 != 0);
            for (int i33 = 2 * this.C; ; i33 = this.C)
            {
              int i34 = Math.max(0, i12 - i33);
              int i35 = Math.max(0, i11 - i33);
              this.w.measure(View.MeasureSpec.makeMeasureSpec(i34, -2147483648), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
              int i36 = this.w.getMeasuredWidth();
              int i37 = Math.max(0, i34 - i36);
              i14 = Math.max(0, i35 - i36);
              i15 = i37;
              break;
            }
            if (this.x == null)
              break label528;
            if (i13 != 0);
            for (int i28 = 2 * this.C; ; i28 = this.C)
            {
              int i29 = Math.max(0, i12 - i28);
              int i30 = Math.max(0, i11 - i28);
              this.x.measure(View.MeasureSpec.makeMeasureSpec(i29, -2147483648), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
              int i31 = this.x.getMeasuredWidth();
              int i32 = Math.max(0, i29 - i31);
              i14 = Math.max(0, i30 - i31);
              i15 = i32;
              break;
            }
            if (((0x10 & this.j) == 0) || (this.y == null))
              break label1325;
            localView1 = this.y;
            break label549;
            localb = null;
            break label580;
            if (localLayoutParams1.height != -2)
            {
              i21 = 1073741824;
              break label629;
            }
            i21 = -2147483648;
            break label629;
            label1200: i23 = -2147483648;
            break label675;
            label1208: i24 = i15;
            break label695;
            label1215: i26 = 19;
            break label718;
            setMeasuredDimension(i2, i16);
            while (true)
            {
              if (this.M != null)
                this.M.setContentHeight(getMeasuredHeight());
              if ((this.z == null) || (this.z.getVisibility() == 8))
                break;
              this.z.measure(View.MeasureSpec.makeMeasureSpec(i2 - 2 * this.B, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), -2147483648));
              return;
              setMeasuredDimension(i2, i3);
            }
            i18 = i16;
          }
        }
        label1325: localView1 = null;
      }
      label1331: i11 = i10;
      i12 = i9;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ActionBarView.SavedState localSavedState = (ActionBarView.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if ((localSavedState.a != 0) && (this.R != null) && (this.L != null))
    {
      android.support.v4.b.a.b localb = (android.support.v4.b.a.b)this.L.findItem(localSavedState.a);
      if (localb != null)
        localb.expandActionView();
    }
    if (localSavedState.b)
      b();
  }

  public Parcelable onSaveInstanceState()
  {
    ActionBarView.SavedState localSavedState = new ActionBarView.SavedState(super.onSaveInstanceState());
    if ((this.R != null) && (this.R.b != null))
      localSavedState.a = this.R.b.getItemId();
    localSavedState.b = c();
    return localSavedState;
  }

  public void setCallback(android.support.v7.a.c paramc)
  {
    this.P = paramc;
  }

  public void setCollapsable(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }

  public void setContextView(ActionBarContextView paramActionBarContextView)
  {
    this.M = paramActionBarContextView;
  }

  public void setCustomNavigationView(View paramView)
  {
    if ((0x10 & this.j) != 0);
    for (int i1 = 1; ; i1 = 0)
    {
      if ((this.y != null) && (i1 != 0))
        removeView(this.y);
      this.y = paramView;
      if ((this.y != null) && (i1 != 0))
        addView(this.y);
      return;
    }
  }

  public void setDisplayOptions(int paramInt)
  {
    int i1 = 8;
    int i2 = -1;
    boolean bool1 = true;
    boolean bool2;
    label38: int i3;
    label53: boolean bool5;
    label78: boolean bool4;
    label121: Drawable localDrawable;
    label138: label163: boolean bool3;
    if (this.j == i2)
    {
      this.j = paramInt;
      if ((i2 & 0x1F) == 0)
        break label371;
      if ((paramInt & 0x2) == 0)
        break label299;
      bool2 = bool1;
      if ((!bool2) || (this.g != null))
        break label305;
      i3 = 0;
      this.p.setVisibility(i3);
      if ((i2 & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0)
          break label311;
        bool5 = bool1;
        this.p.a(bool5);
        if (bool5)
          setHomeButtonEnabled(bool1);
      }
      if ((i2 & 0x1) != 0)
      {
        if ((this.n == null) || ((paramInt & 0x1) == 0))
          break label317;
        bool4 = bool1;
        ActionBarView.HomeView localHomeView = this.p;
        if (!bool4)
          break label323;
        localDrawable = this.n;
        localHomeView.a(localDrawable);
      }
      if ((i2 & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0)
          break label332;
        g();
      }
      if ((this.r != null) && ((i2 & 0x6) != 0))
      {
        if ((0x4 & this.j) == 0)
          break label343;
        bool3 = bool1;
        label190: View localView = this.u;
        if (!bool2)
        {
          if (!bool3)
            break label349;
          i1 = 0;
        }
        label208: localView.setVisibility(i1);
        LinearLayout localLinearLayout = this.r;
        if ((bool2) || (!bool3))
          break label354;
        label230: localLinearLayout.setEnabled(bool1);
      }
      if (((i2 & 0x10) != 0) && (this.y != null))
      {
        if ((paramInt & 0x10) == 0)
          break label360;
        addView(this.y);
      }
      label266: requestLayout();
    }
    while (true)
    {
      if (this.p.isEnabled())
        break label378;
      this.p.setContentDescription(null);
      return;
      i2 = paramInt ^ this.j;
      break;
      label299: bool2 = false;
      break label38;
      label305: i3 = i1;
      break label53;
      label311: bool5 = false;
      break label78;
      label317: bool4 = false;
      break label121;
      label323: localDrawable = this.m;
      break label138;
      label332: removeView(this.r);
      break label163;
      label343: bool3 = false;
      break label190;
      label349: i1 = 4;
      break label208;
      label354: bool1 = false;
      break label230;
      label360: removeView(this.y);
      break label266;
      label371: invalidate();
    }
    label378: if ((paramInt & 0x4) != 0)
    {
      this.p.setContentDescription(this.o.getResources().getText(android.support.v7.b.h.abc_action_bar_up_description));
      return;
    }
    this.p.setContentDescription(this.o.getResources().getText(android.support.v7.b.h.abc_action_bar_home_description));
  }

  public void setDropdownAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    this.O = paramSpinnerAdapter;
    if (this.v != null)
      this.v.a(paramSpinnerAdapter);
  }

  public void setDropdownSelectedPosition(int paramInt)
  {
    this.v.a(paramInt);
  }

  public void setEmbeddedTabView(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    if (this.x != null)
      removeView(this.x);
    this.x = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null);
    for (boolean bool = true; ; bool = false)
    {
      this.I = bool;
      if ((this.I) && (this.i == 2))
      {
        addView(this.x);
        ViewGroup.LayoutParams localLayoutParams = this.x.getLayoutParams();
        localLayoutParams.width = -2;
        localLayoutParams.height = -1;
        paramScrollingTabContainerView.setAllowCollapse(true);
      }
      return;
    }
  }

  public void setHomeAsUpIndicator(int paramInt)
  {
    this.p.a(paramInt);
  }

  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    this.p.b(paramDrawable);
  }

  public void setHomeButtonEnabled(boolean paramBoolean)
  {
    this.p.setEnabled(paramBoolean);
    this.p.setFocusable(paramBoolean);
    if (!paramBoolean)
    {
      this.p.setContentDescription(null);
      return;
    }
    if ((0x4 & this.j) != 0)
    {
      this.p.setContentDescription(this.o.getResources().getText(android.support.v7.b.h.abc_action_bar_up_description));
      return;
    }
    this.p.setContentDescription(this.o.getResources().getText(android.support.v7.b.h.abc_action_bar_home_description));
  }

  public void setIcon(int paramInt)
  {
    setIcon(this.o.getResources().getDrawable(paramInt));
  }

  public void setIcon(Drawable paramDrawable)
  {
    this.m = paramDrawable;
    if ((paramDrawable != null) && (((0x1 & this.j) == 0) || (this.n == null)))
      this.p.a(paramDrawable);
    if (this.g != null)
      this.q.a(this.m.getConstantState().newDrawable(getResources()));
  }

  public void setLogo(int paramInt)
  {
    setLogo(this.o.getResources().getDrawable(paramInt));
  }

  public void setLogo(Drawable paramDrawable)
  {
    this.n = paramDrawable;
    if ((paramDrawable != null) && ((0x1 & this.j) != 0))
      this.p.a(paramDrawable);
  }

  public void setNavigationMode(int paramInt)
  {
    int i1 = this.i;
    if (paramInt != i1)
      switch (i1)
      {
      default:
        switch (paramInt)
        {
        default:
        case 1:
        case 2:
        }
        break;
      case 1:
      case 2:
      }
    while (true)
    {
      this.i = paramInt;
      requestLayout();
      return;
      if (this.w == null)
        break;
      removeView(this.w);
      break;
      if ((this.x == null) || (!this.I))
        break;
      removeView(this.x);
      break;
      if (this.v == null)
      {
        this.v = new aj(this.o, null, android.support.v7.b.b.actionDropDownStyle);
        this.w = ((LinearLayout)LayoutInflater.from(this.o).inflate(android.support.v7.b.g.abc_action_bar_view_list_nav_layout, null));
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        localLayoutParams.gravity = 17;
        this.w.addView(this.v, localLayoutParams);
      }
      if (this.v.d() != this.O)
        this.v.a(this.O);
      this.v.a(this.S);
      addView(this.w);
      continue;
      if ((this.x != null) && (this.I))
        addView(this.x);
    }
  }

  public void setSplitActionBar(boolean paramBoolean)
  {
    int i1;
    if (this.d != paramBoolean)
    {
      if (this.a != null)
      {
        ViewGroup localViewGroup = (ViewGroup)this.a.getParent();
        if (localViewGroup != null)
          localViewGroup.removeView(this.a);
        if (!paramBoolean)
          break label138;
        if (this.c != null)
          this.c.addView(this.a);
        this.a.getLayoutParams().width = -1;
        this.a.requestLayout();
      }
      if (this.c != null)
      {
        ActionBarContainer localActionBarContainer = this.c;
        if (!paramBoolean)
          break label161;
        i1 = 0;
        label99: localActionBarContainer.setVisibility(i1);
      }
      if (this.b != null)
      {
        if (paramBoolean)
          break label167;
        this.b.a(getResources().getBoolean(android.support.v7.b.c.abc_action_bar_expanded_action_views_exclusive));
      }
    }
    while (true)
    {
      super.setSplitActionBar(paramBoolean);
      return;
      label138: addView(this.a);
      this.a.getLayoutParams().width = -2;
      break;
      label161: i1 = 8;
      break label99;
      label167: this.b.a(false);
      this.b.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
      this.b.a(2147483647);
    }
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.l = paramCharSequence;
    int i1;
    int i2;
    label76: LinearLayout localLinearLayout;
    int i3;
    if (this.t != null)
    {
      this.t.setText(paramCharSequence);
      TextView localTextView = this.t;
      if (paramCharSequence == null)
        break label98;
      i1 = 0;
      localTextView.setVisibility(i1);
      if ((this.g != null) || ((0x8 & this.j) == 0) || ((TextUtils.isEmpty(this.k)) && (TextUtils.isEmpty(this.l))))
        break label104;
      i2 = 1;
      localLinearLayout = this.r;
      i3 = 0;
      if (i2 == 0)
        break label110;
    }
    while (true)
    {
      localLinearLayout.setVisibility(i3);
      return;
      label98: i1 = 8;
      break;
      label104: i2 = 0;
      break label76;
      label110: i3 = 8;
    }
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.H = true;
    setTitleImpl(paramCharSequence);
  }

  public void setWindowCallback(Window.Callback paramCallback)
  {
    this.h = paramCallback;
  }

  public void setWindowTitle(CharSequence paramCharSequence)
  {
    if (!this.H)
      setTitleImpl(paramCharSequence);
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarView
 * JD-Core Version:    0.6.2
 */