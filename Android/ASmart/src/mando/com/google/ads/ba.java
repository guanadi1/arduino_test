package com.google.ads;

import com.google.ads.b.ac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class ba
{
  private static final Map a = Collections.unmodifiableMap(new bb());
  private final String b;
  private final String c;
  private final List d;
  private final Integer e;
  private final Integer f;
  private final List g;
  private final List h;
  private final List i;

  private ba(String paramString1, String paramString2, List paramList1, Integer paramInteger1, Integer paramInteger2, List paramList2, List paramList3, List paramList4)
  {
    com.google.ads.e.g.a(paramString1);
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramList1;
    this.e = paramInteger1;
    this.f = paramInteger2;
    this.g = paramList2;
    this.h = paramList3;
    this.i = paramList4;
  }

  public static ba a(String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject(paramString);
    String str1 = localJSONObject1.getString("qdata");
    if (localJSONObject1.has("ad_type"));
    ArrayList localArrayList;
    for (String str2 = localJSONObject1.getString("ad_type"); ; str2 = null)
    {
      JSONArray localJSONArray = localJSONObject1.getJSONArray("ad_networks");
      localArrayList = new ArrayList(localJSONArray.length());
      for (int j = 0; j < localJSONArray.length(); j++)
        localArrayList.add(a(localJSONArray.getJSONObject(j)));
    }
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("settings");
    Integer localInteger1;
    List localList1;
    List localList2;
    List localList3;
    Integer localInteger2;
    if (localJSONObject2 != null)
      if (localJSONObject2.has("refresh"))
      {
        localInteger1 = Integer.valueOf(localJSONObject2.getInt("refresh"));
        boolean bool = localJSONObject2.has("ad_network_timeout_millis");
        Integer localInteger3 = null;
        if (bool)
          localInteger3 = Integer.valueOf(localJSONObject2.getInt("ad_network_timeout_millis"));
        localList1 = a(localJSONObject2, "imp_urls");
        localList2 = a(localJSONObject2, "click_urls");
        localList3 = a(localJSONObject2, "nofill_urls");
        localInteger2 = localInteger3;
      }
    while (true)
    {
      return new ba(str1, str2, localArrayList, localInteger1, localInteger2, localList1, localList2, localList3);
      localInteger1 = null;
      break;
      localInteger1 = null;
      localInteger2 = null;
      localList1 = null;
      localList2 = null;
      localList3 = null;
    }
  }

  private static k a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.getString("id");
    String str2 = paramJSONObject.optString("allocation_id", null);
    JSONArray localJSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int j = 0; j < localJSONArray.length(); j++)
      localArrayList.add(localJSONArray.getString(j));
    List localList = a(paramJSONObject, "imp_urls");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("data");
    HashMap localHashMap1 = new HashMap(0);
    if (localJSONObject != null)
    {
      localHashMap2 = new HashMap(localJSONObject.length());
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        localHashMap2.put(str3, localJSONObject.getString(str3));
      }
    }
    HashMap localHashMap2 = localHashMap1;
    return new k(str2, str1, localArrayList, localList, localHashMap2);
  }

  private static List a(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    if (localJSONArray != null)
    {
      ArrayList localArrayList = new ArrayList(localJSONArray.length());
      for (int j = 0; j < localJSONArray.length(); j++)
        localArrayList.add(localJSONArray.getString(j));
      return localArrayList;
    }
    return null;
  }

  public boolean a()
  {
    return this.f != null;
  }

  public int b()
  {
    return this.f.intValue();
  }

  public String c()
  {
    return this.b;
  }

  public boolean d()
  {
    return this.e != null;
  }

  public int e()
  {
    return this.e.intValue();
  }

  public List f()
  {
    return this.d;
  }

  public List g()
  {
    return this.g;
  }

  public List h()
  {
    return this.h;
  }

  public List i()
  {
    return this.i;
  }

  public ac j()
  {
    if (this.c == null)
      return null;
    if ("interstitial".equals(this.c))
      return ac.a;
    g localg = (g)a.get(this.c);
    if (localg != null)
      return ac.a(localg);
    return null;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ba
 * JD-Core Version:    0.6.2
 */