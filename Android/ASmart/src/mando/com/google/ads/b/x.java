package com.google.ads.b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

public class x
{
  private final String a;
  private HashMap b;

  public x(Bundle paramBundle)
  {
    this.a = paramBundle.getString("action");
    this.b = a(paramBundle.getSerializable("params"));
  }

  public x(String paramString)
  {
    this.a = paramString;
  }

  public x(String paramString, HashMap paramHashMap)
  {
    this(paramString);
    this.b = paramHashMap;
  }

  private HashMap a(Serializable paramSerializable)
  {
    if ((paramSerializable instanceof HashMap))
      return (HashMap)paramSerializable;
    return null;
  }

  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("action", this.a);
    localBundle.putSerializable("params", this.b);
    return localBundle;
  }

  public String b()
  {
    return this.a;
  }

  public HashMap c()
  {
    return this.b;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.x
 * JD-Core Version:    0.6.2
 */