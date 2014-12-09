package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.b.ac;
import com.google.ads.c.b;
import com.google.ads.e.af;
import com.google.ads.e.g;
import java.util.HashMap;

public class bk
{
  final ac a;
  private final bh b;
  private boolean c;
  private boolean d;
  private bj e;
  private final bd f;
  private b g;
  private boolean h;
  private boolean i;
  private View j;
  private final String k;
  private final d l;
  private final HashMap m;

  public bk(bd parambd, ac paramac, bh parambh, String paramString, d paramd, HashMap paramHashMap)
  {
    g.a(TextUtils.isEmpty(paramString));
    this.f = parambd;
    this.a = paramac;
    this.b = parambh;
    this.k = paramString;
    this.l = paramd;
    this.m = paramHashMap;
    this.c = false;
    this.d = false;
    this.e = null;
    this.g = null;
    this.h = false;
    this.i = false;
    this.j = null;
  }

  public void a()
  {
    try
    {
      g.a(this.h, "destroy() called but startLoadAdTask has not been called.");
      ((Handler)br.a().c.a()).post(new bl(this));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(Activity paramActivity)
  {
    try
    {
      g.b(this.h, "startLoadAdTask has already been called.");
      this.h = true;
      ((Handler)br.a().c.a()).post(new bm(this, paramActivity, this.k, this.l, this.m));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  void a(b paramb)
  {
    try
    {
      this.g = paramb;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  void a(boolean paramBoolean, bj parambj)
  {
    try
    {
      this.d = paramBoolean;
      this.c = true;
      this.e = parambj;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean b()
  {
    try
    {
      boolean bool = this.c;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean c()
  {
    try
    {
      g.a(this.c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public bj d()
  {
    try
    {
      if (this.e == null);
      for (bj localbj = bj.d; ; localbj = this.e)
        return localbj;
    }
    finally
    {
    }
  }

  public View e()
  {
    try
    {
      g.a(this.c, "getAdView() called when isLoadAdTaskDone() is false.");
      View localView = this.j;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String f()
  {
    try
    {
      if (this.g != null)
      {
        String str2 = this.g.getClass().getName();
        str1 = str2;
        return str1;
      }
      String str1 = "\"adapter was not created.\"";
    }
    finally
    {
    }
  }

  void g()
  {
    try
    {
      this.i = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  boolean h()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bk
 * JD-Core Version:    0.6.2
 */