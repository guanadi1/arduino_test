package com.raon.aremotefreegalaxy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import com.raon.remotelib.d;
import com.raon.remotelib.g;

public class SelectModelActivity extends Activity
{
  Globals a;
  ViewPager b;
  g c;
  int[] d;
  View e;
  View f;
  View g;
  View h;
  int i;
  int j;
  d k;

  private void a()
  {
    d locald = this.a.e(this.i);
    int m = this.a.a(a.a(this.j) + " - " + locald.c, this.j, locald, this.c);
    this.a.b(m);
    setResult(1);
    finish();
  }

  private void b()
  {
    View localView = findViewById(2131230853);
    if (this.j != 9)
      this.a.c.b(localView);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903066);
    if (getResources().getBoolean(2131099654))
      setRequestedOrientation(1);
    this.a = ((Globals)getApplication());
    Bundle localBundle = getIntent().getExtras();
    this.i = localBundle.getInt("bid");
    this.k = this.a.e(this.i);
    this.j = localBundle.getInt("categoryid");
    this.d = this.a.d(this.i);
    if (this.d.length > 0)
    {
      this.c = this.a.f(this.d[0]);
      this.a.c.b = this.c;
    }
    if (this.j == 8)
      a();
    this.e = findViewById(2131230881);
    this.f = findViewById(2131230870);
    this.g = findViewById(2131230855);
    this.h = findViewById(2131230863);
    this.e.setVisibility(8);
    this.f.setVisibility(8);
    this.g.setVisibility(8);
    this.h.setVisibility(8);
    if ((this.j == 1) || (this.j == 2))
      this.e.setVisibility(0);
    while (true)
    {
      this.b = ((ViewPager)findViewById(2131230893));
      this.b.setAdapter(new ao(this, this.d, this.k));
      this.b.setOnPageChangeListener(new ah(this));
      ((Button)findViewById(2131230894)).setOnClickListener(new ak(this));
      View localView = findViewById(2131230853);
      b();
      this.a.c.a(localView);
      return;
      if (this.j == 9)
        this.h.setVisibility(0);
      else if (this.j == 7)
        this.g.setVisibility(0);
      else
        this.f.setVisibility(0);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.SelectModelActivity
 * JD-Core Version:    0.6.2
 */