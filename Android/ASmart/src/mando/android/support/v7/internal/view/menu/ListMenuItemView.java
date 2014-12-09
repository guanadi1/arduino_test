package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.e;
import android.support.v7.b.g;
import android.support.v7.b.j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout
  implements x
{
  private r a;
  private ImageView b;
  private RadioButton c;
  private TextView d;
  private CheckBox e;
  private TextView f;
  private Drawable g;
  private int h;
  private Context i;
  private boolean j;
  private int k;
  private Context l;
  private LayoutInflater m;
  private boolean n;

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.MenuView, paramInt, 0);
    this.g = localTypedArray.getDrawable(5);
    this.h = localTypedArray.getResourceId(1, -1);
    this.j = localTypedArray.getBoolean(7, false);
    this.i = paramContext;
    localTypedArray.recycle();
  }

  private void b()
  {
    this.b = ((ImageView)getInflater().inflate(g.abc_list_menu_item_icon, this, false));
    addView(this.b, 0);
  }

  private void c()
  {
    this.c = ((RadioButton)getInflater().inflate(g.abc_list_menu_item_radio, this, false));
    addView(this.c);
  }

  private void d()
  {
    this.e = ((CheckBox)getInflater().inflate(g.abc_list_menu_item_checkbox, this, false));
    addView(this.e);
  }

  private LayoutInflater getInflater()
  {
    if (this.m == null)
      this.m = LayoutInflater.from(this.l);
    return this.m;
  }

  public void a(r paramr, int paramInt)
  {
    this.a = paramr;
    this.k = paramInt;
    if (paramr.isVisible());
    for (int i1 = 0; ; i1 = 8)
    {
      setVisibility(i1);
      setTitle(paramr.a(this));
      setCheckable(paramr.isCheckable());
      a(paramr.e(), paramr.c());
      setIcon(paramr.getIcon());
      setEnabled(paramr.isEnabled());
      return;
    }
  }

  public void a(boolean paramBoolean, char paramChar)
  {
    if ((paramBoolean) && (this.a.e()));
    for (int i1 = 0; ; i1 = 8)
    {
      if (i1 == 0)
        this.f.setText(this.a.d());
      if (this.f.getVisibility() != i1)
        this.f.setVisibility(i1);
      return;
    }
  }

  public boolean a()
  {
    return false;
  }

  public r getItemData()
  {
    return this.a;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.g);
    this.d = ((TextView)findViewById(e.title));
    if (this.h != -1)
      this.d.setTextAppearance(this.i, this.h);
    this.f = ((TextView)findViewById(e.shortcut));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.b != null) && (this.j))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0))
        localLayoutParams1.width = localLayoutParams.height;
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.c == null) && (this.e == null));
    label60: 
    do
    {
      return;
      Object localObject1;
      Object localObject2;
      if (this.a.f())
      {
        if (this.c == null)
          c();
        RadioButton localRadioButton2 = this.c;
        CheckBox localCheckBox2 = this.e;
        localObject1 = localRadioButton2;
        localObject2 = localCheckBox2;
        if (!paramBoolean)
          break label160;
        ((CompoundButton)localObject1).setChecked(this.a.isChecked());
        if (!paramBoolean)
          break label153;
      }
      for (int i1 = 0; ; i1 = 8)
      {
        if (((CompoundButton)localObject1).getVisibility() != i1)
          ((CompoundButton)localObject1).setVisibility(i1);
        if ((localObject2 == null) || (((CompoundButton)localObject2).getVisibility() == 8))
          break;
        ((CompoundButton)localObject2).setVisibility(8);
        return;
        if (this.e == null)
          d();
        CheckBox localCheckBox1 = this.e;
        RadioButton localRadioButton1 = this.c;
        localObject1 = localCheckBox1;
        localObject2 = localRadioButton1;
        break label60;
      }
      if (this.e != null)
        this.e.setVisibility(8);
    }
    while (this.c == null);
    label153: label160: this.c.setVisibility(8);
  }

  public void setChecked(boolean paramBoolean)
  {
    if (this.a.f())
      if (this.c == null)
        c();
    for (Object localObject = this.c; ; localObject = this.e)
    {
      ((CompoundButton)localObject).setChecked(paramBoolean);
      return;
      if (this.e == null)
        d();
    }
  }

  public void setForceShowIcon(boolean paramBoolean)
  {
    this.n = paramBoolean;
    this.j = paramBoolean;
  }

  public void setIcon(Drawable paramDrawable)
  {
    int i1;
    if ((this.a.h()) || (this.n))
    {
      i1 = 1;
      if ((i1 != 0) || (this.j))
        break label36;
    }
    label36: 
    while ((this.b == null) && (paramDrawable == null) && (!this.j))
    {
      return;
      i1 = 0;
      break;
    }
    if (this.b == null)
      b();
    if ((paramDrawable != null) || (this.j))
    {
      ImageView localImageView = this.b;
      if (i1 != 0);
      while (true)
      {
        localImageView.setImageDrawable(paramDrawable);
        if (this.b.getVisibility() == 0)
          break;
        this.b.setVisibility(0);
        return;
        paramDrawable = null;
      }
    }
    this.b.setVisibility(8);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.d.setText(paramCharSequence);
      if (this.d.getVisibility() != 0)
        this.d.setVisibility(0);
    }
    while (this.d.getVisibility() == 8)
      return;
    this.d.setVisibility(8);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ListMenuItemView
 * JD-Core Version:    0.6.2
 */