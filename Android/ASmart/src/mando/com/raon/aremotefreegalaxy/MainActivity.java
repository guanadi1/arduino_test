package com.raon.aremotefreegalaxy;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.h;
import android.support.v4.app.n;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.ads.AdView;
import com.raon.remotelib.f;

public class MainActivity extends h
  implements View.OnClickListener, View.OnTouchListener
{
  Globals n;
  TextView o;
  ae p;
  c q;
  boolean r;
  BroadcastReceiver s;
  boolean t = false;
  Fragment u = null;

  private void a(View paramView)
  {
    for (int i = 0; ; i++)
    {
      try
      {
        if (i < ((ViewGroup)paramView).getChildCount())
        {
          View localView = ((ViewGroup)paramView).getChildAt(i);
          if (((localView instanceof ImageButton)) || ((localView instanceof Button)))
          {
            if (localView.getTag() != null)
              localView.setOnClickListener(this);
          }
          else
            a(localView);
        }
      }
      catch (Exception localException)
      {
      }
      return;
    }
  }

  private void a(View paramView, float paramFloat1, float paramFloat2, int paramInt)
  {
    paramView.clearAnimation();
    AnimationSet localAnimationSet = new AnimationSet(true);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(paramFloat1, paramFloat2, 0.0F, 0.0F);
    localTranslateAnimation.setDuration(200L);
    localTranslateAnimation.setFillAfter(true);
    localTranslateAnimation.setStartOffset(paramInt);
    localAnimationSet.addAnimation(localTranslateAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setFillAfter(true);
    localAlphaAnimation.setDuration(300L);
    localAlphaAnimation.setStartOffset(paramInt);
    localAnimationSet.addAnimation(localAlphaAnimation);
    localAnimationSet.setFillAfter(true);
    paramView.startAnimation(localAnimationSet);
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == this.r)
      return;
    this.r = paramBoolean1;
    View localView1 = findViewById(2131230833);
    localView1.clearAnimation();
    View localView2 = findViewById(2131230837);
    View localView3 = findViewById(2131230843);
    View localView4 = findViewById(2131230838);
    View localView5 = findViewById(2131230844);
    View localView6 = findViewById(2131230840);
    View localView7 = findViewById(2131230845);
    if (paramBoolean1)
    {
      ((TextView)findViewById(2131230842)).setText(this.n.d().a);
      TextView localTextView = (TextView)findViewById(2131230836);
      if (this.n.g() == null)
        localTextView.setText("");
      while (true)
      {
        ((Switch)findViewById(2131230846)).setChecked(this.n.d);
        ((Switch)findViewById(2131230847)).setChecked(this.n.e);
        localView1.setVisibility(0);
        localView1.startAnimation(AnimationUtils.loadAnimation(this, 2130968582));
        a(localView2, -100.0F, 0.0F, 0);
        a(localView4, -100.0F, 0.0F, 100);
        a(localView6, -100.0F, 0.0F, 200);
        a(localView3, 100.0F, 0.0F, 0);
        a(localView5, 100.0F, 0.0F, 100);
        a(localView7, 100.0F, 0.0F, 200);
        return;
        localTextView.setText(this.n.g().a);
      }
    }
    if (paramBoolean2)
    {
      localView1.clearAnimation();
      localView1.setVisibility(8);
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this, 2130968583);
    localAnimation.setAnimationListener(new ab(this, localView1));
    localView1.startAnimation(localAnimation);
  }

  private void b(boolean paramBoolean)
  {
    a(paramBoolean, false);
  }

  private void f()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SUPERSK");
    localIntentFilter.addDataScheme("LED");
    this.s = new z(this);
    registerReceiver(this.s, localIntentFilter);
  }

  private void g()
  {
    String[] arrayOfString = this.n.e();
    this.p.a = arrayOfString;
    this.p.notifyDataSetChanged();
    Spinner localSpinner = (Spinner)findViewById(2131230827);
    if (this.n.b() < arrayOfString.length)
      localSpinner.setSelection(this.n.b());
    h();
    i();
  }

  private void h()
  {
    String[] arrayOfString = this.n.f();
    this.q.a = arrayOfString;
    this.q.notifyDataSetChanged();
    View localView1 = findViewById(2131230837);
    View localView2 = findViewById(2131230838);
    if ((arrayOfString == null) || (arrayOfString.length == 0))
    {
      localView1.setAlpha(0.4F);
      localView2.setAlpha(0.4F);
      localView1.setEnabled(false);
      localView2.setEnabled(false);
      return;
    }
    localView1.setAlpha(1.0F);
    localView2.setAlpha(1.0F);
    localView1.setEnabled(true);
    localView2.setEnabled(true);
    ((Spinner)findViewById(2131230825)).setSelection(this.n.c());
  }

  private void i()
  {
    f localf = this.n.g();
    View localView = findViewById(2131230830);
    android.support.v4.app.x localx = e().a();
    if (localf != null)
    {
      localView.setVisibility(8);
      if ((localf.b == 1) || (localf.b == 2))
      {
        this.u = new l();
        if (this.u != null)
          break label152;
      }
    }
    label152: 
    do
    {
      return;
      if (localf.b == 9)
      {
        this.u = new g();
        break;
      }
      if (localf.b == 8)
      {
        this.u = new j();
        break;
      }
      if (localf.b == 7)
      {
        this.u = new k();
        break;
      }
      this.u = new i();
      break;
      com.raon.remotelib.g localg = this.n.h();
      this.n.c.b = localg;
      localx.a(2131230828, this.u);
      localx.a(4096);
      localx.a();
      this.o.setText(this.n.g().c.c);
      return;
      localView.setVisibility(0);
      this.o.setText("");
    }
    while (this.u == null);
    localx.a(this.u);
    localx.a();
  }

  private void j()
  {
    if (this.n.g() == null)
      return;
    d locald = new d(this, 2131427365, false, null);
    locald.a(new ac(this));
    locald.show();
  }

  private void k()
  {
    d locald = new d(this, 2131427366, false, null);
    locald.a(new r(this));
    locald.show();
  }

  private void l()
  {
    if (this.n.g() == null)
      return;
    d locald = new d(this, 2131427367, true, this.n.g().a);
    locald.a(new s(this));
    locald.show();
  }

  private void m()
  {
    d locald = new d(this, 2131427368, true, this.n.d().a);
    locald.a(new t(this));
    locald.show();
  }

  private void n()
  {
    d locald = new d(this, 2131427343, true, "");
    locald.a(new u(this));
    locald.show();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 1)
      g();
  }

  public void onBackPressed()
  {
    if (this.r)
    {
      b(false);
      return;
    }
    if (this.t)
    {
      super.onBackPressed();
      return;
    }
    this.t = true;
    Toast.makeText(getApplicationContext(), 2131427370, 0).show();
    new Handler().postDelayed(new aa(this), 3000L);
  }

  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if (localObject != null);
    switch (Integer.parseInt(localObject.toString()))
    {
    default:
      return;
    case 9:
      b(true);
      return;
    case 1:
      j();
      return;
    case 2:
      l();
      return;
    case 3:
      startActivityForResult(new Intent(this, AddDeviceActivity.class), 0);
      return;
    case 4:
      k();
      return;
    case 5:
      m();
      return;
    case 6:
      n();
      return;
    case 99:
    }
    b(false);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903064);
    if (getResources().getBoolean(2131099654))
      setRequestedOrientation(1);
    this.n = ((Globals)getApplication());
    this.o = ((TextView)findViewById(2131230829));
    Spinner localSpinner1 = (Spinner)findViewById(2131230827);
    this.p = new ae(this, this.n.e());
    localSpinner1.setAdapter(this.p);
    localSpinner1.setOnItemSelectedListener(new q(this));
    Spinner localSpinner2 = (Spinner)findViewById(2131230825);
    this.q = new c(this, this.n.f());
    localSpinner2.setAdapter(this.q);
    localSpinner2.setOnItemSelectedListener(new v(this));
    ((Switch)findViewById(2131230846)).setOnCheckedChangeListener(new w(this));
    ((Switch)findViewById(2131230847)).setOnCheckedChangeListener(new x(this));
    a(findViewById(2131230820));
    g();
    ((AdView)findViewById(2131230810)).a(new com.google.ads.d());
    if ((this.n.g) && (this.n.a(this) == 6) && (!this.n.e))
    {
      d locald = new d(this, 2131427371, false, null);
      locald.a(new y(this));
      locald.show();
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 82)
      if (this.r)
        break label27;
    label27: for (boolean bool = true; ; bool = false)
    {
      b(bool);
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
  }

  protected void onPause()
  {
    super.onPause();
    if (this.s != null)
      unregisterReceiver(this.s);
    this.n.k();
  }

  protected void onResume()
  {
    super.onResume();
    this.t = false;
    this.n.c.b = this.n.h();
    f();
    a(false, true);
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      paramView.setPressed(true);
      paramView.setAlpha(0.4F);
    }
    while (paramMotionEvent.getAction() != 1)
      return true;
    paramView.setPressed(false);
    paramView.setAlpha(1.0F);
    return true;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.MainActivity
 * JD-Core Version:    0.6.2
 */