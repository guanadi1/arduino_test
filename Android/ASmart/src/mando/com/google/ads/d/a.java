package com.google.ads.d;

import android.content.Context;
import android.graphics.Color;
import com.google.ads.d;
import java.util.Locale;
import java.util.Map;

public class a extends d
{
  private String b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private String i;
  private int j;
  private int k;
  private b l;
  private int m;
  private String n;

  private String a(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0xFFFFFF & paramInt);
    return String.format(localLocale, "#%06x", arrayOfObject);
  }

  public Map a(Context paramContext)
  {
    com.google.ads.c.a.a locala = (com.google.ads.c.a.a)a(com.google.ads.c.a.a.class);
    if (locala == null)
    {
      locala = new com.google.ads.c.a.a();
      a(locala);
    }
    if (this.b != null)
      locala.d().put("q", this.b);
    if (Color.alpha(this.c) != 0)
      locala.d().put("bgcolor", a(this.c));
    if ((Color.alpha(this.d) == 255) && (Color.alpha(this.e) == 255))
    {
      locala.d().put("gradientfrom", a(this.d));
      locala.d().put("gradientto", a(this.e));
    }
    if (Color.alpha(this.f) != 0)
      locala.d().put("hcolor", a(this.f));
    if (Color.alpha(this.g) != 0)
      locala.d().put("dcolor", a(this.g));
    if (Color.alpha(this.h) != 0)
      locala.d().put("acolor", a(this.h));
    if (this.i != null)
      locala.d().put("font", this.i);
    locala.d().put("headersize", Integer.toString(this.j));
    if (Color.alpha(this.k) != 0)
      locala.d().put("bcolor", a(this.k));
    if (this.l != null)
      locala.d().put("btype", this.l.toString());
    locala.d().put("bthick", Integer.toString(this.m));
    if (this.n != null)
      locala.d().put("channel", this.n);
    return super.a(paramContext);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.d.a
 * JD-Core Version:    0.6.2
 */